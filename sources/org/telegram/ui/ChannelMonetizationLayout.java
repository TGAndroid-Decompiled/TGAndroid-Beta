package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Consumer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$InputCheckPasswordSRP;
import org.telegram.tgnet.TLRPC$TL_account_getPassword;
import org.telegram.tgnet.TLRPC$TL_broadcastRevenueBalances;
import org.telegram.tgnet.TLRPC$TL_channels_restrictSponsoredMessages;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputCheckPasswordEmpty;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$account_Password;
import org.telegram.tgnet.tl.TL_stats$BroadcastRevenueTransaction;
import org.telegram.tgnet.tl.TL_stats$StatsGraph;
import org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueStats;
import org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueTransactionProceeds;
import org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueTransactionRefund;
import org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueTransactionWithdrawal;
import org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueTransactions;
import org.telegram.tgnet.tl.TL_stats$TL_broadcastRevenueWithdrawalUrl;
import org.telegram.tgnet.tl.TL_stats$TL_getBroadcastRevenueStats;
import org.telegram.tgnet.tl.TL_stats$TL_getBroadcastRevenueTransactions;
import org.telegram.tgnet.tl.TL_stats$TL_getBroadcastRevenueWithdrawalUrl;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TwoStepVerificationActivity;

public class ChannelMonetizationLayout extends FrameLayout {
    public static ChannelMonetizationLayout instance;
    private static HashMap<Integer, SpannableString> tonString;
    private final ProceedOverview availableValue;
    private final ButtonWithCounterView balanceButton;
    private final CharSequence balanceInfo;
    private final LinearLayout balanceLayout;
    private final AnimatedTextView balanceSubtitle;
    private final AnimatedTextView balanceTitle;
    private final RelativeSizeSpan balanceTitleSizeSpan;
    private TL_stories$TL_premium_boostsStatus boostsStatus;
    private final int currentAccount;
    private int currentBoostLevel;
    public final long dialogId;
    private DecimalFormat formatter;
    private final BaseFragment fragment;
    private StatisticActivity.ChartViewData impressionsChart;
    private final ProceedOverview lastWithdrawalValue;
    private final ProceedOverview lifetimeValue;
    private final UniversalRecyclerView listView;
    private boolean loadingTransactions;
    private boolean proceedsAvailable;
    private final FrameLayout progress;
    private final Theme.ResourcesProvider resourcesProvider;
    private StatisticActivity.ChartViewData revenueChart;
    private final Runnable sendCpmUpdateRunnable;
    private boolean switchOffValue;
    private final CharSequence titleInfo;
    private final ArrayList<TL_stats$BroadcastRevenueTransaction> transactions;
    private int transactionsTotalCount;
    private double usd_rate;

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    public ChannelMonetizationLayout(Context context, final BaseFragment baseFragment, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.switchOffValue = false;
        this.proceedsAvailable = false;
        this.availableValue = ProceedOverview.as("TON", LocaleController.getString(R.string.MonetizationOverviewAvailable));
        this.lastWithdrawalValue = ProceedOverview.as("TON", LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal));
        this.lifetimeValue = ProceedOverview.as("TON", LocaleController.getString(R.string.MonetizationOverviewTotal));
        this.transactions = new ArrayList<>();
        this.loadingTransactions = false;
        this.sendCpmUpdateRunnable = new Runnable() {
            @Override
            public final void run() {
                ChannelMonetizationLayout.this.sendCpmUpdate();
            }
        };
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.formatter = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.formatter.setMaximumFractionDigits(12);
        this.formatter.setGroupingUsed(false);
        this.fragment = baseFragment;
        this.resourcesProvider = resourcesProvider;
        this.currentAccount = i;
        this.dialogId = j;
        initLevel();
        loadTransactions();
        this.titleInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new Runnable() {
            @Override
            public final void run() {
                ChannelMonetizationLayout.this.lambda$new$0();
            }
        }, resourcesProvider), true);
        this.balanceInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new Runnable() {
            @Override
            public final void run() {
                ChannelMonetizationLayout.this.lambda$new$1();
            }
        }), true);
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(this, context) {
            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), i3);
            }
        };
        this.balanceLayout = linearLayout;
        linearLayout.setOrientation(1);
        int i2 = Theme.key_windowBackgroundWhite;
        linearLayout.setBackgroundColor(Theme.getColor(i2, resourcesProvider));
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
        this.balanceTitle = animatedTextView;
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        animatedTextView.setTextSize(AndroidUtilities.dp(32.0f));
        animatedTextView.setGravity(17);
        this.balanceTitleSizeSpan = new RelativeSizeSpan(0.6770833f);
        linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-1, 38, 49, 22, 15, 22, 0));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context, true, true, true);
        this.balanceSubtitle = animatedTextView2;
        animatedTextView2.setGravity(17);
        animatedTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        animatedTextView2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout.addView(animatedTextView2, LayoutHelper.createFrame(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        final CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(this, AndroidUtilities.dp(15.0f), AndroidUtilities.dpf2(2.0f), Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider)) {
            @Override
            public int getIntrinsicWidth() {
                return AndroidUtilities.dp(24.0f);
            }

            @Override
            public int getIntrinsicHeight() {
                return AndroidUtilities.dp(24.0f);
            }
        };
        circularProgressDrawable.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(this, context, resourcesProvider) {
            @Override
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == circularProgressDrawable || super.verifyDrawable(drawable);
            }
        };
        this.balanceButton = buttonWithCounterView;
        buttonWithCounterView.setEnabled(MessagesController.getInstance(i).channelRevenueWithdrawalEnabled);
        circularProgressDrawable.setCallback(buttonWithCounterView);
        buttonWithCounterView.setText(LocaleController.getString(R.string.MonetizationWithdraw), false);
        buttonWithCounterView.setVisibility(8);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChannelMonetizationLayout.this.lambda$new$3(baseFragment, view);
            }
        });
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(baseFragment, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ChannelMonetizationLayout.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                ChannelMonetizationLayout.this.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                boolean onLongClick;
                onLongClick = ChannelMonetizationLayout.this.onLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                return Boolean.valueOf(onLongClick);
            }
        });
        this.listView = universalRecyclerView;
        addView(universalRecyclerView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.progress = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(i2, resourcesProvider));
        frameLayout.addView(linearLayout2, LayoutHelper.createFrame(-2, -2, 17));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setAutoRepeat(true);
        rLottieImageView.setAnimation(R.raw.statistic_preload, 120, 120);
        rLottieImageView.playAnimation();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i3 = Theme.key_player_actionBarTitle;
        textView.setTextColor(Theme.getColor(i3));
        textView.setTag(Integer.valueOf(i3));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i4 = Theme.key_player_actionBarSubtitle;
        textView2.setTextColor(Theme.getColor(i4));
        textView2.setTag(Integer.valueOf(i4));
        textView2.setText(LocaleController.getString("LoadingStatsDescription", R.string.LoadingStatsDescription));
        textView2.setGravity(1);
        linearLayout2.addView(rLottieImageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 20));
        linearLayout2.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 10));
        linearLayout2.addView(textView2, LayoutHelper.createLinear(-2, -2, 1));
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
    }

    public void lambda$new$1() {
        Browser.openUrl(getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
    }

    public void lambda$new$3(BaseFragment baseFragment, View view) {
        if (view.isEnabled()) {
            final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            twoStepVerificationActivity.setDelegate(1, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() {
                @Override
                public final void didEnterPassword(TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP) {
                    ChannelMonetizationLayout.this.lambda$new$2(twoStepVerificationActivity, tLRPC$InputCheckPasswordSRP);
                }
            });
            baseFragment.presentFragment(twoStepVerificationActivity);
        }
    }

    public void lambda$new$2(TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null) {
            return;
        }
        final Activity parentActivity = baseFragment.getParentActivity();
        TLRPC$User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        TL_stats$TL_getBroadcastRevenueWithdrawalUrl tL_stats$TL_getBroadcastRevenueWithdrawalUrl = new TL_stats$TL_getBroadcastRevenueWithdrawalUrl();
        tL_stats$TL_getBroadcastRevenueWithdrawalUrl.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-this.dialogId);
        if (tLRPC$InputCheckPasswordSRP == null) {
            tLRPC$InputCheckPasswordSRP = new TLRPC$TL_inputCheckPasswordEmpty();
        }
        tL_stats$TL_getBroadcastRevenueWithdrawalUrl.password = tLRPC$InputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stats$TL_getBroadcastRevenueWithdrawalUrl, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelMonetizationLayout.this.lambda$initWithdraw$8(twoStepVerificationActivity, parentActivity, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$initWithdraw$8(final TwoStepVerificationActivity twoStepVerificationActivity, final Activity activity, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelMonetizationLayout.this.lambda$initWithdraw$7(tLRPC$TL_error, twoStepVerificationActivity, activity, tLObject);
            }
        });
    }

    public void lambda$initWithdraw$7(TLRPC$TL_error tLRPC$TL_error, final TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, TLObject tLObject) {
        int i;
        if (tLRPC$TL_error != null) {
            if ("PASSWORD_MISSING".equals(tLRPC$TL_error.text) || tLRPC$TL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tLRPC$TL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.needHideProgress();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setTitle(LocaleController.getString("EditAdminTransferAlertTitle", R.string.EditAdminTransferAlertTitle));
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                TextView textView = new TextView(activity);
                int i2 = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i2));
                textView.setTextSize(1, 16.0f);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(activity);
                int i3 = R.drawable.list_circle;
                imageView.setImageResource(i3);
                imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), PorterDuff.Mode.MULTIPLY));
                TextView textView2 = new TextView(activity);
                textView2.setTextColor(Theme.getColor(i2));
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString("EditAdminTransferAlertText1", R.string.EditAdminTransferAlertText1)));
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                    linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
                    linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(activity);
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                ImageView imageView2 = new ImageView(activity);
                imageView2.setImageResource(i3);
                imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), PorterDuff.Mode.MULTIPLY));
                TextView textView3 = new TextView(activity);
                textView3.setTextColor(Theme.getColor(i2));
                textView3.setTextSize(1, 16.0f);
                textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString("EditAdminTransferAlertText2", R.string.EditAdminTransferAlertText2)));
                if (LocaleController.isRTL) {
                    linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                    i = 5;
                    linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
                } else {
                    i = 5;
                    linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
                    linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tLRPC$TL_error.text)) {
                    builder.setPositiveButton(LocaleController.getString("EditAdminTransferSetPassword", R.string.EditAdminTransferSetPassword), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            ChannelMonetizationLayout.this.lambda$initWithdraw$4(dialogInterface, i4);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                } else {
                    TextView textView4 = new TextView(activity);
                    textView4.setTextColor(Theme.getColor(i2));
                    textView4.setTextSize(1, 16.0f);
                    if (!LocaleController.isRTL) {
                        i = 3;
                    }
                    textView4.setGravity(i | 48);
                    textView4.setText(LocaleController.getString("EditAdminTransferAlertText3", R.string.EditAdminTransferAlertText3));
                    linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                    builder.setNegativeButton(LocaleController.getString("OK", R.string.OK), null);
                }
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.showDialog(builder.create());
                    return;
                } else {
                    this.fragment.showDialog(builder.create());
                    return;
                }
            }
            if ("SRP_ID_INVALID".equals(tLRPC$TL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                        ChannelMonetizationLayout.this.lambda$initWithdraw$6(twoStepVerificationActivity, tLObject2, tLRPC$TL_error2);
                    }
                }, 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
                twoStepVerificationActivity.lambda$onBackPressed$303();
            }
            BulletinFactory.showError(tLRPC$TL_error);
            return;
        }
        twoStepVerificationActivity.needHideProgress();
        twoStepVerificationActivity.lambda$onBackPressed$303();
        if (tLObject instanceof TL_stats$TL_broadcastRevenueWithdrawalUrl) {
            Browser.openUrl(getContext(), ((TL_stats$TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public void lambda$initWithdraw$4(DialogInterface dialogInterface, int i) {
        this.fragment.presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    public void lambda$initWithdraw$6(final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelMonetizationLayout.this.lambda$initWithdraw$5(tLRPC$TL_error, tLObject, twoStepVerificationActivity);
            }
        });
    }

    public void lambda$initWithdraw$5(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (tLRPC$TL_error == null) {
            TLRPC$account_Password tLRPC$account_Password = (TLRPC$account_Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, tLRPC$account_Password);
            TwoStepVerificationActivity.initPasswordNewAlgo(tLRPC$account_Password);
            lambda$new$2(twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
        }
    }

    private void setBalance(long j, long j2) {
        if (this.formatter == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
            this.formatter = decimalFormat;
            decimalFormat.setMinimumFractionDigits(2);
            this.formatter.setMaximumFractionDigits(6);
            this.formatter.setGroupingUsed(false);
        }
        DecimalFormat decimalFormat2 = this.formatter;
        double d = j;
        Double.isNaN(d);
        double d2 = d / 1.0E9d;
        decimalFormat2.setMaximumFractionDigits(d2 > 1.5d ? 2 : 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTON("TON " + this.formatter.format(d2), this.balanceTitle.getPaint(), 0.9f, true));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.balanceTitleSizeSpan, indexOf, spannableStringBuilder.length(), 33);
        }
        this.balanceTitle.setText(spannableStringBuilder);
        this.balanceSubtitle.setText("~" + BillingController.getInstance().formatCurrency(j2, "USD"));
    }

    private void initLevel() {
        int i;
        TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        if (chat != null) {
            this.currentBoostLevel = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(this.dialogId, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChannelMonetizationLayout.this.lambda$initLevel$10((TL_stories$TL_premium_boostsStatus) obj);
            }
        });
        if (ChatObject.isMegagroup(chat)) {
            return;
        }
        TL_stats$TL_getBroadcastRevenueStats tL_stats$TL_getBroadcastRevenueStats = new TL_stats$TL_getBroadcastRevenueStats();
        tL_stats$TL_getBroadcastRevenueStats.dark = Theme.isCurrentThemeDark();
        tL_stats$TL_getBroadcastRevenueStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-this.dialogId);
        TLRPC$ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId);
        if (chatFull != null) {
            int i2 = chatFull.stats_dc;
            this.switchOffValue = chatFull.restricted_sponsored;
            i = i2;
        } else {
            i = -1;
        }
        if (i == -1) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stats$TL_getBroadcastRevenueStats, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelMonetizationLayout.this.lambda$initLevel$13(tLObject, tLRPC$TL_error);
            }
        }, null, null, 0, i, 1, true);
    }

    public void lambda$initLevel$10(final TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelMonetizationLayout.this.lambda$initLevel$9(tL_stories$TL_premium_boostsStatus);
            }
        });
    }

    public void lambda$initLevel$9(TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        UniversalAdapter universalAdapter;
        this.boostsStatus = tL_stories$TL_premium_boostsStatus;
        if (tL_stories$TL_premium_boostsStatus != null) {
            this.currentBoostLevel = tL_stories$TL_premium_boostsStatus.level;
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return;
        }
        universalAdapter.update(true);
    }

    public void lambda$initLevel$13(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelMonetizationLayout.this.lambda$initLevel$12(tLObject);
            }
        });
    }

    public void lambda$initLevel$12(TLObject tLObject) {
        if (tLObject instanceof TL_stats$TL_broadcastRevenueStats) {
            TL_stats$TL_broadcastRevenueStats tL_stats$TL_broadcastRevenueStats = (TL_stats$TL_broadcastRevenueStats) tLObject;
            this.impressionsChart = StatisticActivity.createViewData(tL_stats$TL_broadcastRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0);
            TL_stats$StatsGraph tL_stats$StatsGraph = tL_stats$TL_broadcastRevenueStats.revenue_graph;
            if (tL_stats$StatsGraph != null) {
                tL_stats$StatsGraph.rate = (float) (1.0E7d / tL_stats$TL_broadcastRevenueStats.usd_rate);
            }
            this.revenueChart = StatisticActivity.createViewData(tL_stats$StatsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2);
            StatisticActivity.ChartViewData chartViewData = this.impressionsChart;
            if (chartViewData != null) {
                chartViewData.useHourFormat = true;
            }
            this.usd_rate = tL_stats$TL_broadcastRevenueStats.usd_rate;
            setupBalances(tL_stats$TL_broadcastRevenueStats.balances);
            this.progress.animate().alpha(0.0f).setDuration(380L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    ChannelMonetizationLayout.this.lambda$initLevel$11();
                }
            }).start();
            checkLearnSheet();
        }
    }

    public void lambda$initLevel$11() {
        this.progress.setVisibility(8);
    }

    public void setupBalances(TLRPC$TL_broadcastRevenueBalances tLRPC$TL_broadcastRevenueBalances) {
        UniversalAdapter universalAdapter;
        double d = this.usd_rate;
        if (d == 0.0d) {
            return;
        }
        ProceedOverview proceedOverview = this.availableValue;
        long j = tLRPC$TL_broadcastRevenueBalances.available_balance;
        proceedOverview.crypto_amount = j;
        double d2 = j;
        Double.isNaN(d2);
        long j2 = (long) ((d2 / 1.0E9d) * d * 100.0d);
        proceedOverview.amount = j2;
        setBalance(j, j2);
        this.availableValue.currency = "USD";
        ProceedOverview proceedOverview2 = this.lastWithdrawalValue;
        long j3 = tLRPC$TL_broadcastRevenueBalances.current_balance;
        proceedOverview2.crypto_amount = j3;
        double d3 = j3;
        Double.isNaN(d3);
        double d4 = this.usd_rate;
        proceedOverview2.amount = (long) ((d3 / 1.0E9d) * d4 * 100.0d);
        proceedOverview2.currency = "USD";
        ProceedOverview proceedOverview3 = this.lifetimeValue;
        long j4 = tLRPC$TL_broadcastRevenueBalances.overall_revenue;
        proceedOverview3.crypto_amount = j4;
        double d5 = j4;
        Double.isNaN(d5);
        proceedOverview3.amount = (long) ((d5 / 1.0E9d) * d4 * 100.0d);
        proceedOverview3.currency = "USD";
        this.proceedsAvailable = true;
        this.balanceButton.setVisibility((tLRPC$TL_broadcastRevenueBalances.available_balance > 0 || BuildVars.DEBUG_PRIVATE_VERSION) ? 0 : 8);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return;
        }
        universalAdapter.update(true);
    }

    @Override
    protected void onAttachedToWindow() {
        instance = this;
        super.onAttachedToWindow();
        checkLearnSheet();
    }

    @Override
    protected void onDetachedFromWindow() {
        instance = null;
        super.onDetachedFromWindow();
    }

    private void checkLearnSheet() {
        if (isAttachedToWindow() && this.proceedsAvailable && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            lambda$new$0();
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        TLRPC$ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId);
        int i = chatFull != null ? chatFull.stats_dc : -1;
        arrayList.add(UItem.asCenterShadow(this.titleInfo));
        StatisticActivity.ChartViewData chartViewData = this.impressionsChart;
        if (chartViewData != null && !chartViewData.isEmpty) {
            arrayList.add(UItem.asChart(5, i, chartViewData));
            arrayList.add(UItem.asShadow(-1, null));
        }
        StatisticActivity.ChartViewData chartViewData2 = this.revenueChart;
        if (chartViewData2 != null && !chartViewData2.isEmpty) {
            arrayList.add(UItem.asChart(2, i, chartViewData2));
            arrayList.add(UItem.asShadow(-2, null));
        }
        if (this.proceedsAvailable) {
            arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.MonetizationOverview)));
            arrayList.add(UItem.asProceedOverview(this.availableValue));
            arrayList.add(UItem.asProceedOverview(this.lastWithdrawalValue));
            arrayList.add(UItem.asProceedOverview(this.lifetimeValue));
            arrayList.add(UItem.asShadow(-3, null));
        }
        if (chat != null && chat.creator) {
            arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.MonetizationBalance)));
            arrayList.add(UItem.asCustom(this.balanceLayout));
            arrayList.add(UItem.asShadow(-4, this.balanceInfo));
        }
        boolean z = false;
        if (!this.transactions.isEmpty() || this.transactionsTotalCount > 0) {
            arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.MonetizationTransactions)));
            Iterator<TL_stats$BroadcastRevenueTransaction> it = this.transactions.iterator();
            while (it.hasNext()) {
                arrayList.add(UItem.asTransaction(it.next()));
            }
            if (this.transactionsTotalCount - this.transactions.size() > 0) {
                arrayList.add(UItem.asButton(2, R.drawable.arrow_more, LocaleController.formatPluralString("MonetizationMoreTransactions", this.transactionsTotalCount - this.transactions.size(), new Object[0])).accent());
            }
            arrayList.add(UItem.asShadow(-5, null));
        }
        if (chat != null && chat.creator) {
            int i2 = MessagesController.getInstance(this.currentAccount).channelRestrictSponsoredLevelMin;
            UItem asCheck = UItem.asCheck(1, PeerColorActivity.withLevelLock(LocaleController.getString(R.string.MonetizationSwitchOff), this.currentBoostLevel < i2 ? i2 : 0));
            if (this.currentBoostLevel >= i2 && this.switchOffValue) {
                z = true;
            }
            arrayList.add(asCheck.setChecked(z));
            arrayList.add(UItem.asShadow(-6, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
        }
        arrayList.add(UItem.asShadow(-7, null));
        arrayList.add(UItem.asShadow(-8, null));
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 1) {
            if (this.currentBoostLevel < MessagesController.getInstance(this.currentAccount).channelRestrictSponsoredLevelMin) {
                if (this.boostsStatus == null) {
                    return;
                }
                final LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(this.fragment, getContext(), 30, this.currentAccount, this.resourcesProvider);
                limitReachedBottomSheet.setDialogId(this.dialogId);
                limitReachedBottomSheet.setBoostsStats(this.boostsStatus, true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.dialogId, this.boostsStatus, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        ChannelMonetizationLayout.this.lambda$onClick$14(limitReachedBottomSheet, (ChannelBoostsController.CanApplyBoost) obj);
                    }
                });
                return;
            }
            this.switchOffValue = !this.switchOffValue;
            AndroidUtilities.cancelRunOnUIThread(this.sendCpmUpdateRunnable);
            AndroidUtilities.runOnUIThread(this.sendCpmUpdateRunnable, 1000L);
            this.listView.adapter.update(true);
            return;
        }
        Object obj = uItem.object;
        if (obj instanceof TL_stats$BroadcastRevenueTransaction) {
            showTransactionSheet((TL_stats$BroadcastRevenueTransaction) obj, this.dialogId);
        } else if (i2 == 2) {
            loadTransactions();
        }
    }

    public void lambda$onClick$14(LimitReachedBottomSheet limitReachedBottomSheet, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        this.fragment.showDialog(limitReachedBottomSheet);
    }

    public void reloadTransactions() {
        if (this.loadingTransactions) {
            return;
        }
        this.transactions.clear();
        this.transactionsTotalCount = 0;
        this.loadingTransactions = false;
        loadTransactions();
    }

    private void loadTransactions() {
        TLRPC$Chat chat;
        if (this.loadingTransactions) {
            return;
        }
        int size = this.transactions.size();
        int i = this.transactionsTotalCount;
        if ((size < i || i == 0) && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId))) != null && chat.creator) {
            this.loadingTransactions = true;
            TL_stats$TL_getBroadcastRevenueTransactions tL_stats$TL_getBroadcastRevenueTransactions = new TL_stats$TL_getBroadcastRevenueTransactions();
            tL_stats$TL_getBroadcastRevenueTransactions.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-this.dialogId);
            tL_stats$TL_getBroadcastRevenueTransactions.offset = this.transactions.size();
            tL_stats$TL_getBroadcastRevenueTransactions.limit = this.transactions.isEmpty() ? 5 : 20;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stats$TL_getBroadcastRevenueTransactions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChannelMonetizationLayout.this.lambda$loadTransactions$16(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadTransactions$16(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelMonetizationLayout.this.lambda$loadTransactions$15(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadTransactions$15(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (!(tLObject instanceof TL_stats$TL_broadcastRevenueTransactions)) {
            if (tLRPC$TL_error != null) {
                BulletinFactory.showError(tLRPC$TL_error);
                return;
            }
            return;
        }
        TL_stats$TL_broadcastRevenueTransactions tL_stats$TL_broadcastRevenueTransactions = (TL_stats$TL_broadcastRevenueTransactions) tLObject;
        this.transactionsTotalCount = tL_stats$TL_broadcastRevenueTransactions.count;
        this.transactions.addAll(tL_stats$TL_broadcastRevenueTransactions.transactions);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
        this.loadingTransactions = false;
    }

    public void sendCpmUpdate() {
        AndroidUtilities.cancelRunOnUIThread(this.sendCpmUpdateRunnable);
        TLRPC$TL_channels_restrictSponsoredMessages tLRPC$TL_channels_restrictSponsoredMessages = new TLRPC$TL_channels_restrictSponsoredMessages();
        tLRPC$TL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-this.dialogId);
        tLRPC$TL_channels_restrictSponsoredMessages.restricted = this.switchOffValue;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_restrictSponsoredMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelMonetizationLayout.this.lambda$sendCpmUpdate$18(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$sendCpmUpdate$18(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelMonetizationLayout.this.lambda$sendCpmUpdate$17(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$sendCpmUpdate$17(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public static CharSequence replaceTON(CharSequence charSequence, TextPaint textPaint) {
        return replaceTON(charSequence, textPaint, 1.0f, true);
    }

    public static CharSequence replaceTON(CharSequence charSequence, TextPaint textPaint, float f, boolean z) {
        return replaceTON(charSequence, textPaint, f, 0.0f, z);
    }

    public static CharSequence replaceTON(CharSequence charSequence, TextPaint textPaint, float f, float f2, boolean z) {
        if (tonString == null) {
            tonString = new HashMap<>();
        }
        int i = ((textPaint.getFontMetricsInt().bottom * (z ? 1 : -1)) * ((int) (f * 100.0f))) - ((int) (100.0f * f2));
        SpannableString spannableString = tonString.get(Integer.valueOf(i));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z) {
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.ton);
                coloredImageSpan.setScale(f, f);
                coloredImageSpan.setColorKey(Theme.key_windowBackgroundWhiteBlueText2);
                coloredImageSpan.setRelativeSize(textPaint.getFontMetricsInt());
                coloredImageSpan.spaceScaleX = 0.9f;
                spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
            } else {
                ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_ton);
                coloredImageSpan2.setScale(f, f);
                coloredImageSpan2.setTranslateY(f2);
                coloredImageSpan2.spaceScaleX = 0.95f;
                spannableString.setSpan(coloredImageSpan2, 0, spannableString.length(), 33);
            }
            tonString.put(Integer.valueOf(i), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static class ProceedOverviewCell extends LinearLayout {
        private final TextView amountView;
        private final AnimatedEmojiSpan.TextViewEmojis cryptoAmountView;
        private final DecimalFormat formatter;
        private final LinearLayout layout;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView titleView;

        public ProceedOverviewCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setOrientation(1);
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout = linearLayout;
            linearLayout.setOrientation(0);
            addView(linearLayout, LayoutHelper.createLinear(-1, -1, 22.0f, 9.0f, 22.0f, 0.0f));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.cryptoAmountView = textViewEmojis;
            textViewEmojis.setTypeface(AndroidUtilities.bold());
            textViewEmojis.setTextSize(1, 16.0f);
            textViewEmojis.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linearLayout.addView(textViewEmojis, LayoutHelper.createLinear(-2, -2, 80, 0, 0, 5, 0));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis2 = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.amountView = textViewEmojis2;
            textViewEmojis2.setTextSize(1, 13.0f);
            int i = Theme.key_windowBackgroundWhiteGrayText;
            textViewEmojis2.setTextColor(Theme.getColor(i, resourcesProvider));
            linearLayout.addView(textViewEmojis2, LayoutHelper.createLinear(-2, -2, 80));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 13.0f);
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            addView(textView, LayoutHelper.createLinear(-1, -2, 55, 22, 5, 22, 9));
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
            this.formatter = decimalFormat;
            decimalFormat.setMinimumFractionDigits(2);
            decimalFormat.setMaximumFractionDigits(12);
            decimalFormat.setGroupingUsed(false);
        }

        public void set(ProceedOverview proceedOverview) {
            CharSequence charSequence;
            int indexOf;
            this.titleView.setText(proceedOverview.text);
            String str = proceedOverview.crypto_currency + " ";
            if ("TON".equalsIgnoreCase(proceedOverview.crypto_currency)) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) str);
                DecimalFormat decimalFormat = this.formatter;
                double d = proceedOverview.crypto_amount;
                Double.isNaN(d);
                sb.append(decimalFormat.format(d / 1.0E9d));
                charSequence = ChannelMonetizationLayout.replaceTON(sb.toString(), this.cryptoAmountView.getPaint(), 0.87f, true);
            } else if ("XTR".equalsIgnoreCase(proceedOverview.crypto_currency)) {
                charSequence = StarsIntroActivity.replaceStarsWithPlain(((Object) str) + LocaleController.formatNumber(proceedOverview.crypto_amount, ' '), 0.8f);
            } else {
                charSequence = ((Object) str) + Long.toString(proceedOverview.crypto_amount);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            if ("TON".equalsIgnoreCase(proceedOverview.crypto_currency) && (indexOf = TextUtils.indexOf(spannableStringBuilder, ".")) >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder.length(), 33);
            }
            this.cryptoAmountView.setText(spannableStringBuilder);
            this.amountView.setText("~" + BillingController.getInstance().formatCurrency(proceedOverview.amount, proceedOverview.currency));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public static class ProceedOverview {
        public long amount;
        public long crypto_amount;
        public String crypto_currency;
        public String currency;
        public CharSequence text;

        public static ProceedOverview as(String str, CharSequence charSequence) {
            ProceedOverview proceedOverview = new ProceedOverview();
            proceedOverview.crypto_currency = str;
            proceedOverview.text = charSequence;
            return proceedOverview;
        }
    }

    public static class TransactionCell extends FrameLayout {
        private final TextView dateView;
        private final DecimalFormat formatter;
        private final LinearLayout layout;
        private boolean needDivider;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView titleView;
        private final AnimatedEmojiSpan.TextViewEmojis valueText;

        public TransactionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
            TextView textView2 = new TextView(context);
            this.dateView = textView2;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 4.0f, 0.0f, 0.0f));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.valueText = textViewEmojis;
            textViewEmojis.setTypeface(AndroidUtilities.bold());
            textViewEmojis.setTextSize(1, 13.0f);
            addView(textViewEmojis, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
            this.formatter = decimalFormat;
            decimalFormat.setMinimumFractionDigits(2);
            decimalFormat.setMaximumFractionDigits(12);
            decimalFormat.setGroupingUsed(false);
        }

        public void set(TL_stats$BroadcastRevenueTransaction tL_stats$BroadcastRevenueTransaction, boolean z) {
            long j;
            char c;
            boolean z2;
            String str;
            if (tL_stats$BroadcastRevenueTransaction instanceof TL_stats$TL_broadcastRevenueTransactionWithdrawal) {
                TL_stats$TL_broadcastRevenueTransactionWithdrawal tL_stats$TL_broadcastRevenueTransactionWithdrawal = (TL_stats$TL_broadcastRevenueTransactionWithdrawal) tL_stats$BroadcastRevenueTransaction;
                this.titleView.setText(LocaleController.getString(R.string.MonetizationTransactionWithdraw));
                if (tL_stats$TL_broadcastRevenueTransactionWithdrawal.pending) {
                    this.dateView.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
                    z2 = false;
                } else {
                    z2 = tL_stats$TL_broadcastRevenueTransactionWithdrawal.failed;
                    TextView textView = this.dateView;
                    StringBuilder sb = new StringBuilder();
                    sb.append(LocaleController.formatShortDateTime(tL_stats$TL_broadcastRevenueTransactionWithdrawal.date));
                    if (z2) {
                        str = " — " + LocaleController.getString(R.string.MonetizationTransactionNotCompleted);
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    textView.setText(sb.toString());
                }
                j = tL_stats$TL_broadcastRevenueTransactionWithdrawal.amount;
                c = 65535;
            } else {
                if (tL_stats$BroadcastRevenueTransaction instanceof TL_stats$TL_broadcastRevenueTransactionProceeds) {
                    this.titleView.setText(LocaleController.getString(R.string.MonetizationTransactionProceed));
                    this.dateView.setText(LocaleController.formatShortDateTime(r9.from_date) + " - " + LocaleController.formatShortDateTime(r9.to_date));
                    j = ((TL_stats$TL_broadcastRevenueTransactionProceeds) tL_stats$BroadcastRevenueTransaction).amount;
                } else {
                    if (!(tL_stats$BroadcastRevenueTransaction instanceof TL_stats$TL_broadcastRevenueTransactionRefund)) {
                        return;
                    }
                    this.titleView.setText(LocaleController.getString(R.string.MonetizationTransactionRefund));
                    this.dateView.setText(LocaleController.formatShortDateTime(r9.from_date));
                    j = ((TL_stats$TL_broadcastRevenueTransactionRefund) tL_stats$BroadcastRevenueTransaction).amount;
                }
                c = 1;
                z2 = false;
            }
            this.dateView.setTextColor(Theme.getColor(z2 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) (c < 0 ? "-" : "+"));
            spannableStringBuilder.append((CharSequence) "TON ");
            DecimalFormat decimalFormat = this.formatter;
            double abs = Math.abs(j);
            Double.isNaN(abs);
            spannableStringBuilder.append((CharSequence) decimalFormat.format(abs / 1.0E9d));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
            }
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.valueText;
            textViewEmojis.setText(ChannelMonetizationLayout.replaceTON(spannableStringBuilder, textViewEmojis.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), false));
            this.valueText.setTextColor(Theme.getColor(c < 0 ? Theme.key_text_RedBold : Theme.key_avatar_nameInMessageGreen, this.resourcesProvider));
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : Theme.dividerPaint;
                if (paint != null) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : 0), getMeasuredHeight() - 1, paint);
                }
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    private void showTransactionSheet(TL_stats$BroadcastRevenueTransaction tL_stats$BroadcastRevenueTransaction, long j) {
        boolean z;
        String string;
        long j2;
        long j3;
        long j4;
        boolean z2;
        char c;
        boolean z3;
        BottomSheet bottomSheet;
        String userName;
        TLRPC$User tLRPC$User;
        BottomSheet bottomSheet2 = new BottomSheet(getContext(), false, this.resourcesProvider);
        bottomSheet2.fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        boolean z4 = tL_stats$BroadcastRevenueTransaction instanceof TL_stats$TL_broadcastRevenueTransactionWithdrawal;
        if (z4) {
            TL_stats$TL_broadcastRevenueTransactionWithdrawal tL_stats$TL_broadcastRevenueTransactionWithdrawal = (TL_stats$TL_broadcastRevenueTransactionWithdrawal) tL_stats$BroadcastRevenueTransaction;
            string = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j2 = tL_stats$TL_broadcastRevenueTransactionWithdrawal.date;
            j3 = tL_stats$TL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z5 = tL_stats$TL_broadcastRevenueTransactionWithdrawal.pending;
            z2 = tL_stats$TL_broadcastRevenueTransactionWithdrawal.failed;
            z = z4;
            z3 = z5;
            j4 = 0;
            c = 65535;
        } else if (tL_stats$BroadcastRevenueTransaction instanceof TL_stats$TL_broadcastRevenueTransactionProceeds) {
            TL_stats$TL_broadcastRevenueTransactionProceeds tL_stats$TL_broadcastRevenueTransactionProceeds = (TL_stats$TL_broadcastRevenueTransactionProceeds) tL_stats$BroadcastRevenueTransaction;
            string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
            j2 = tL_stats$TL_broadcastRevenueTransactionProceeds.from_date;
            long j5 = tL_stats$TL_broadcastRevenueTransactionProceeds.to_date;
            z = z4;
            c = 1;
            z3 = false;
            z2 = false;
            j3 = tL_stats$TL_broadcastRevenueTransactionProceeds.amount;
            j4 = j5;
        } else {
            z = z4;
            if (!(tL_stats$BroadcastRevenueTransaction instanceof TL_stats$TL_broadcastRevenueTransactionRefund)) {
                return;
            }
            TL_stats$TL_broadcastRevenueTransactionRefund tL_stats$TL_broadcastRevenueTransactionRefund = (TL_stats$TL_broadcastRevenueTransactionRefund) tL_stats$BroadcastRevenueTransaction;
            string = LocaleController.getString(R.string.MonetizationTransactionDetailRefund);
            j2 = tL_stats$TL_broadcastRevenueTransactionRefund.from_date;
            j3 = tL_stats$TL_broadcastRevenueTransactionRefund.amount;
            j4 = 0;
            z2 = false;
            c = 1;
            z3 = false;
        }
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Theme.getColor(c < 0 ? Theme.key_text_RedBold : Theme.key_avatar_nameInMessageGreen));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (c < 0 ? "-" : "+"));
        DecimalFormat decimalFormat = this.formatter;
        double abs = Math.abs(j3);
        Double.isNaN(abs);
        double round = Math.round((abs / 1.0E9d) * 100000.0d);
        Double.isNaN(round);
        spannableStringBuilder.append((CharSequence) decimalFormat.format(round / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(getContext());
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider));
        if (z3) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j2 == 0) {
            textView2.setText(LocaleController.formatShortDateTime(j4));
        } else if (j4 == 0) {
            textView2.setText(LocaleController.formatShortDateTime(j2));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j2) + " - " + LocaleController.formatShortDateTime(j4));
        }
        if (z2) {
            textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        textView3.setText(string);
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 49, 0, 27, 0, 0));
        if (tL_stats$BroadcastRevenueTransaction instanceof TL_stats$TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_groupcreate_spanBackground, this.resourcesProvider)));
            if (j < 0) {
                TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                if (chat == 0) {
                    userName = "";
                    tLRPC$User = chat;
                } else {
                    userName = chat.title;
                    tLRPC$User = chat;
                }
            } else {
                TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                userName = UserObject.getUserName(user);
                tLRPC$User = user;
            }
            BackupImageView backupImageView = new BackupImageView(getContext());
            backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo((TLObject) tLRPC$User);
            backupImageView.setForUserOrChat(tLRPC$User, avatarDrawable);
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(28, 28, 51));
            TextView textView4 = new TextView(getContext());
            textView4.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-2, 28, 1, 42, 10, 42, 0));
        }
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider);
        if (z) {
            final TL_stats$TL_broadcastRevenueTransactionWithdrawal tL_stats$TL_broadcastRevenueTransactionWithdrawal2 = (TL_stats$TL_broadcastRevenueTransactionWithdrawal) tL_stats$BroadcastRevenueTransaction;
            if ((tL_stats$TL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false);
                buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ChannelMonetizationLayout.this.lambda$showTransactionSheet$19(tL_stats$TL_broadcastRevenueTransactionWithdrawal2, view);
                    }
                });
                bottomSheet = bottomSheet2;
                linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 55, 18, 30, 18, 14));
                bottomSheet.setCustomView(linearLayout);
                this.fragment.showDialog(bottomSheet);
            }
        }
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false);
        final BottomSheet bottomSheet3 = bottomSheet2;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BottomSheet.this.dismiss();
            }
        });
        bottomSheet = bottomSheet3;
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 55, 18, 30, 18, 14));
        bottomSheet.setCustomView(linearLayout);
        this.fragment.showDialog(bottomSheet);
    }

    public void lambda$showTransactionSheet$19(TL_stats$TL_broadcastRevenueTransactionWithdrawal tL_stats$TL_broadcastRevenueTransactionWithdrawal, View view) {
        Browser.openUrl(getContext(), tL_stats$TL_broadcastRevenueTransactionWithdrawal.transaction_url);
    }

    public void lambda$new$0() {
        final BottomSheet bottomSheet = new BottomSheet(getContext(), false, this.resourcesProvider);
        bottomSheet.fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setImageResource(R.drawable.large_monetize);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        textView.setText(LocaleController.getString(R.string.MonetizationInfoTitle));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 8.0f, 0.0f, 8.0f, 25.0f));
        linearLayout.addView(new FeatureCell(this, getContext(), R.drawable.msg_channel, LocaleController.getString(R.string.MonetizationInfoFeature1Name), LocaleController.getString(R.string.MonetizationInfoFeature1Text)), LayoutHelper.createLinear(-1, -2, 49, 0, 0, 0, 16));
        linearLayout.addView(new FeatureCell(this, getContext(), R.drawable.menu_feature_split, LocaleController.getString(R.string.MonetizationInfoFeature2Name), LocaleController.getString(R.string.MonetizationInfoFeature2Text)), LayoutHelper.createLinear(-1, -2, 49, 0, 0, 0, 16));
        linearLayout.addView(new FeatureCell(this, getContext(), R.drawable.menu_feature_withdrawals, LocaleController.getString(R.string.MonetizationInfoFeature3Name), LocaleController.getString(R.string.MonetizationInfoFeature3Text)), LayoutHelper.createLinear(-1, -2, 49, 0, 0, 0, 16));
        View view = new View(getContext());
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
        linearLayout.addView(view, LayoutHelper.createLinear(-1, 1.0f / AndroidUtilities.density, 55, 12, 0, 12, 0));
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(getContext());
        textViewEmojis.setGravity(17);
        textViewEmojis.setTextSize(1, 20.0f);
        textViewEmojis.setTypeface(AndroidUtilities.bold());
        textViewEmojis.setTextColor(Theme.getColor(i, this.resourcesProvider));
        SpannableString spannableString = new SpannableString("💎");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.ton);
        coloredImageSpan.setScale(0.9f, 0.9f);
        coloredImageSpan.setColorKey(Theme.key_windowBackgroundWhiteBlueText2);
        coloredImageSpan.setRelativeSize(textViewEmojis.getPaint().getFontMetricsInt());
        coloredImageSpan.spaceScaleX = 0.9f;
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
        textViewEmojis.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(R.string.MonetizationInfoTONTitle), spannableString));
        linearLayout.addView(textViewEmojis, LayoutHelper.createLinear(-1, -2, 8.0f, 20.0f, 8.0f, 0.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext(), this.resourcesProvider);
        linksTextView.setGravity(17);
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
        linksTextView.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MonetizationInfoTONText)), new Runnable() {
            @Override
            public final void run() {
                ChannelMonetizationLayout.this.lambda$showLearnSheet$21();
            }
        }));
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 28.0f, 9.0f, 28.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.GotIt), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                BottomSheet.this.dismiss();
            }
        });
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 55, 10, 25, 10, 14));
        bottomSheet.setCustomView(linearLayout);
        this.fragment.showDialog(bottomSheet);
    }

    public void lambda$showLearnSheet$21() {
        Browser.openUrl(getContext(), LocaleController.getString(R.string.MonetizationInfoTONLink));
    }

    public class FeatureCell extends FrameLayout {
        public FeatureCell(ChannelMonetizationLayout channelMonetizationLayout, Context context, int i, CharSequence charSequence, CharSequence charSequence2) {
            super(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, channelMonetizationLayout.resourcesProvider), PorterDuff.Mode.SRC_IN));
            imageView.setImageResource(i);
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(Theme.getColor(i2, channelMonetizationLayout.resourcesProvider));
            textView.setText(charSequence);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 2));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, channelMonetizationLayout.resourcesProvider));
            textView2.setText(charSequence2);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), AndroidUtilities.dp(325.0f)), View.MeasureSpec.getMode(i)), i2);
        }
    }
}
