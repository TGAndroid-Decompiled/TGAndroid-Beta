package org.telegram.ui.Stars;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputCheckPasswordSRP;
import org.telegram.tgnet.TLRPC$StarsTransaction;
import org.telegram.tgnet.TLRPC$TL_account_getPassword;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputCheckPasswordEmpty;
import org.telegram.tgnet.TLRPC$TL_payments_getStarsRevenueAdsAccountUrl;
import org.telegram.tgnet.TLRPC$TL_payments_getStarsRevenueWithdrawalUrl;
import org.telegram.tgnet.TLRPC$TL_payments_starsRevenueAdsAccountUrl;
import org.telegram.tgnet.TLRPC$TL_payments_starsRevenueStats;
import org.telegram.tgnet.TLRPC$TL_payments_starsRevenueWithdrawalUrl;
import org.telegram.tgnet.TLRPC$TL_starsRevenueStatus;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$account_Password;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.TwoStepVerificationSetupActivity;

public class BotStarsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ButtonWithCounterView adsButton;
    private ChatAvatarContainer avatarContainer;
    private int balanceBlockedUntil;
    private ButtonWithCounterView balanceButton;
    private EditTextBoldCursor balanceEditText;
    private OutlineTextContainerView balanceEditTextContainer;
    private long balanceEditTextValue;
    private LinearLayout balanceLayout;
    private AnimatedTextView balanceSubtitle;
    private AnimatedTextView balanceTitle;
    private RelativeSizeSpan balanceTitleSizeSpan;
    public final long bot_id;
    private TLRPC$TL_payments_starsRevenueStats lastStats;
    private TLRPC$TL_starsRevenueStatus lastStatsStatus;
    private UniversalRecyclerView listView;
    private SpannableStringBuilder lock;
    private double rate;
    private StatisticActivity.ChartViewData revenueChartData;
    private StarsIntroActivity.StarsTransactionsLayout transactionsLayout;
    private final CharSequence withdrawInfo;
    private Bulletin withdrawalBulletin;
    private final ChannelMonetizationLayout.ProceedOverview availableValue = ChannelMonetizationLayout.ProceedOverview.as("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
    private final ChannelMonetizationLayout.ProceedOverview totalValue = ChannelMonetizationLayout.ProceedOverview.as("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
    private final ChannelMonetizationLayout.ProceedOverview totalProceedsValue = ChannelMonetizationLayout.ProceedOverview.as("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
    private boolean balanceEditTextIgnore = false;
    private boolean balanceEditTextAll = true;
    private ColoredImageSpan[] starRef = new ColoredImageSpan[1];
    private int shakeDp = 4;
    private final int BALANCE = 1;
    private Runnable setBalanceButtonText = new Runnable() {
        @Override
        public final void run() {
            BotStarsActivity.this.lambda$new$11();
        }
    };
    private int stats_dc = -1;

    public boolean onItemLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    public BotStarsActivity(long j) {
        this.bot_id = j;
        BotStarsController.getInstance(this.currentAccount).preloadRevenueStats(j);
        BotStarsController.getInstance(this.currentAccount).invalidateTransactions(j, true);
        this.withdrawInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotStarsWithdrawInfo), new Runnable() {
            @Override
            public final void run() {
                BotStarsActivity.this.lambda$new$0();
            }
        }), true);
    }

    public void lambda$new$0() {
        Browser.openUrl(getContext(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
    }

    @Override
    public View createView(final Context context) {
        NestedFrameLayout nestedFrameLayout = new NestedFrameLayout(context);
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.avatarContainer.getAvatarImageView().setScaleX(0.9f);
        this.avatarContainer.getAvatarImageView().setScaleY(0.9f);
        this.avatarContainer.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.bot_id));
        this.avatarContainer.setUserAvatar(user, true);
        this.avatarContainer.setTitle(UserObject.getUserName(user));
        this.avatarContainer.hideSubtitle();
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    BotStarsActivity.this.lambda$onBackPressed$308();
                }
            }
        });
        ChatAvatarContainer chatAvatarContainer2 = this.avatarContainer;
        int i = Theme.key_player_actionBarTitle;
        chatAvatarContainer2.setTitleColors(Theme.getColor(i), Theme.getColor(Theme.key_player_actionBarSubtitle));
        this.actionBar.setItemsColor(Theme.getColor(i), false);
        this.actionBar.setItemsColor(Theme.getColor(i), true);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), false);
        ActionBar actionBar = this.actionBar;
        int i2 = Theme.key_windowBackgroundWhite;
        actionBar.setBackgroundColor(Theme.getColor(i2));
        this.transactionsLayout = new StarsIntroActivity.StarsTransactionsLayout(context, this.currentAccount, this.bot_id, getClassGuid(), getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i4);
            }
        };
        this.balanceLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.balanceLayout.setBackgroundColor(Theme.getColor(i2, getResourceProvider()));
        this.balanceLayout.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
        this.balanceTitle = animatedTextView;
        animatedTextView.setTypeface(AndroidUtilities.bold());
        AnimatedTextView animatedTextView2 = this.balanceTitle;
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView2.setTextColor(Theme.getColor(i3, getResourceProvider()));
        this.balanceTitle.setTextSize(AndroidUtilities.dp(32.0f));
        this.balanceTitle.setGravity(17);
        this.balanceTitleSizeSpan = new RelativeSizeSpan(0.6770833f);
        this.balanceLayout.addView(this.balanceTitle, LayoutHelper.createLinear(-1, 38, 49, 22, 15, 22, 0));
        AnimatedTextView animatedTextView3 = new AnimatedTextView(context, true, true, true);
        this.balanceSubtitle = animatedTextView3;
        animatedTextView3.setGravity(17);
        this.balanceSubtitle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, getResourceProvider()));
        this.balanceSubtitle.setTextSize(AndroidUtilities.dp(14.0f));
        this.balanceLayout.addView(this.balanceSubtitle, LayoutHelper.createFrame(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (BotStarsActivity.this.balanceEditText != null && !BotStarsActivity.this.balanceEditText.isFocusable()) {
                    BotStarsActivity.this.balanceEditText.setFocusable(true);
                    BotStarsActivity.this.balanceEditText.setFocusableInTouchMode(true);
                    int findPositionByItemId = BotStarsActivity.this.listView.findPositionByItemId(1);
                    if (findPositionByItemId >= 0 && findPositionByItemId < BotStarsActivity.this.listView.adapter.getItemCount()) {
                        BotStarsActivity.this.listView.stopScroll();
                        BotStarsActivity.this.listView.smoothScrollToPosition(findPositionByItemId);
                    }
                    BotStarsActivity.this.balanceEditText.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.balanceEditTextContainer = outlineTextContainerView;
        outlineTextContainerView.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.balanceEditTextContainer.setLeftPadding(AndroidUtilities.dp(36.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                AndroidUtilities.hideKeyboard(this);
            }
        };
        this.balanceEditText = editTextBoldCursor;
        editTextBoldCursor.setFocusable(false);
        this.balanceEditText.setTextColor(getThemedColor(i3));
        this.balanceEditText.setCursorSize(AndroidUtilities.dp(20.0f));
        this.balanceEditText.setCursorWidth(1.5f);
        this.balanceEditText.setBackground(null);
        this.balanceEditText.setTextSize(1, 18.0f);
        this.balanceEditText.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.balanceEditText.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.balanceEditText.setInputType(2);
        this.balanceEditText.setTypeface(Typeface.DEFAULT);
        this.balanceEditText.setHighlightColor(getThemedColor(Theme.key_chat_inTextSelectionHighlight));
        this.balanceEditText.setHandlesColor(getThemedColor(Theme.key_chat_TextSelectionCursor));
        this.balanceEditText.setGravity(LocaleController.isRTL ? 5 : 3);
        this.balanceEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z) {
                BotStarsActivity.this.lambda$createView$1(view, z);
            }
        });
        this.balanceEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                long availableBalance = BotStarsController.getInstance(((BaseFragment) BotStarsActivity.this).currentAccount).getAvailableBalance(BotStarsActivity.this.bot_id);
                BotStarsActivity.this.balanceEditTextValue = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                if (BotStarsActivity.this.balanceEditTextValue > availableBalance) {
                    BotStarsActivity.this.balanceEditTextValue = availableBalance;
                    BotStarsActivity.this.balanceEditTextIgnore = true;
                    BotStarsActivity.this.balanceEditText.setText(Long.toString(BotStarsActivity.this.balanceEditTextValue));
                    BotStarsActivity.this.balanceEditText.setSelection(BotStarsActivity.this.balanceEditText.getText().length());
                    BotStarsActivity.this.balanceEditTextIgnore = false;
                }
                BotStarsActivity botStarsActivity = BotStarsActivity.this;
                botStarsActivity.balanceEditTextAll = botStarsActivity.balanceEditTextValue == availableBalance;
                AndroidUtilities.cancelRunOnUIThread(BotStarsActivity.this.setBalanceButtonText);
                BotStarsActivity.this.setBalanceButtonText.run();
                if (BotStarsActivity.this.balanceEditTextIgnore) {
                    return;
                }
                BotStarsActivity.this.balanceEditTextAll = false;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(this.balanceEditText, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
        this.balanceEditTextContainer.attachEditText(this.balanceEditText);
        this.balanceEditTextContainer.addView(linearLayout2, LayoutHelper.createFrame(-1, -2, 48));
        this.balanceEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                boolean lambda$createView$2;
                lambda$createView$2 = BotStarsActivity.this.lambda$createView$2(textView, i4, keyEvent);
                return lambda$createView$2;
            }
        });
        this.balanceLayout.addView(this.balanceEditTextContainer, LayoutHelper.createLinear(-1, -2, 1, 18, 14, 18, 2));
        this.balanceEditTextContainer.setVisibility(8);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, getResourceProvider()) {
            @Override
            protected boolean subTextSplitToWords() {
                return false;
            }
        };
        this.balanceButton = buttonWithCounterView;
        buttonWithCounterView.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.balanceButton.setText(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false);
        this.balanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BotStarsActivity.this.lambda$createView$3(view);
            }
        });
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, getResourceProvider());
        this.adsButton = buttonWithCounterView2;
        buttonWithCounterView2.setEnabled(true);
        this.adsButton.setText(LocaleController.getString(R.string.MonetizationStarsAds), false);
        this.adsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BotStarsActivity.this.lambda$createView$7(context, view);
            }
        });
        linearLayout3.addView(this.balanceButton, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        linearLayout3.addView(new Space(context), LayoutHelper.createLinear(8, 48, 0.0f, 119));
        linearLayout3.addView(this.adsButton, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        this.balanceLayout.addView(linearLayout3, LayoutHelper.createFrame(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BotStarsActivity.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                BotStarsActivity.this.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                boolean onItemLongClick;
                onItemLongClick = BotStarsActivity.this.onItemLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                return Boolean.valueOf(onItemLongClick);
            }
        });
        this.listView = universalRecyclerView;
        universalRecyclerView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        nestedFrameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.fragmentView = nestedFrameLayout;
        return nestedFrameLayout;
    }

    public void lambda$createView$1(View view, boolean z) {
        this.balanceEditTextContainer.animateSelection(z ? 1.0f : 0.0f);
    }

    public boolean lambda$createView$2(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        withdraw();
        return true;
    }

    public void lambda$createView$3(View view) {
        withdraw();
    }

    public void lambda$createView$7(final Context context, View view) {
        if (!view.isEnabled() || this.adsButton.isLoading()) {
            return;
        }
        this.adsButton.setLoading(true);
        TLRPC$TL_payments_getStarsRevenueAdsAccountUrl tLRPC$TL_payments_getStarsRevenueAdsAccountUrl = new TLRPC$TL_payments_getStarsRevenueAdsAccountUrl();
        tLRPC$TL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.bot_id);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getStarsRevenueAdsAccountUrl, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotStarsActivity.this.lambda$createView$6(context, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$createView$6(final Context context, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotStarsActivity.this.lambda$createView$5(tLObject, context);
            }
        });
    }

    public void lambda$createView$5(TLObject tLObject, Context context) {
        if (tLObject instanceof TLRPC$TL_payments_starsRevenueAdsAccountUrl) {
            Browser.openUrl(context, ((TLRPC$TL_payments_starsRevenueAdsAccountUrl) tLObject).url);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotStarsActivity.this.lambda$createView$4();
            }
        }, 1000L);
    }

    public void lambda$createView$4() {
        this.adsButton.setLoading(false);
    }

    private void withdraw() {
        if (!this.balanceButton.isEnabled() || this.balanceButton.isLoading()) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        if (this.balanceBlockedUntil > currentTime) {
            this.withdrawalBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.timer_3, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, untilString(this.balanceBlockedUntil - currentTime)))).show();
            return;
        }
        if (this.balanceEditTextValue < getMessagesController().starsRevenueWithdrawalMin) {
            BulletinFactory.of(this).createSimpleBulletin(getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new Runnable() {
                @Override
                public final void run() {
                    BotStarsActivity.this.lambda$withdraw$8();
                }
            })).show();
            return;
        }
        final long j = this.balanceEditTextValue;
        final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(1, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() {
            @Override
            public final void didEnterPassword(TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP) {
                BotStarsActivity.this.lambda$withdraw$9(j, twoStepVerificationActivity, tLRPC$InputCheckPasswordSRP);
            }
        });
        this.balanceButton.setLoading(true);
        twoStepVerificationActivity.preload(new Runnable() {
            @Override
            public final void run() {
                BotStarsActivity.this.lambda$withdraw$10(twoStepVerificationActivity);
            }
        });
    }

    public void lambda$withdraw$8() {
        Bulletin.hideVisible();
        long availableBalance = BotStarsController.getInstance(this.currentAccount).getAvailableBalance(this.bot_id);
        if (availableBalance < getMessagesController().starsRevenueWithdrawalMin) {
            this.balanceEditTextAll = true;
            this.balanceEditTextValue = availableBalance;
        } else {
            this.balanceEditTextAll = false;
            this.balanceEditTextValue = getMessagesController().starsRevenueWithdrawalMin;
        }
        this.balanceEditTextIgnore = true;
        this.balanceEditText.setText(Long.toString(this.balanceEditTextValue));
        EditTextBoldCursor editTextBoldCursor = this.balanceEditText;
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
        this.balanceEditTextIgnore = false;
        AndroidUtilities.cancelRunOnUIThread(this.setBalanceButtonText);
        this.setBalanceButtonText.run();
    }

    public void lambda$withdraw$10(TwoStepVerificationActivity twoStepVerificationActivity) {
        this.balanceButton.setLoading(false);
        presentFragment(twoStepVerificationActivity);
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        TLRPC$TL_starsRevenueStatus tLRPC$TL_starsRevenueStatus;
        BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
        arrayList.add(UItem.asChart(2, this.stats_dc, this.revenueChartData));
        arrayList.add(UItem.asShadow(-1, null));
        arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotStarsOverview)));
        TLRPC$TL_payments_starsRevenueStats revenueStats = botStarsController.getRevenueStats(this.bot_id);
        if (revenueStats != null && (tLRPC$TL_starsRevenueStatus = revenueStats.status) != null) {
            ChannelMonetizationLayout.ProceedOverview proceedOverview = this.availableValue;
            long j = tLRPC$TL_starsRevenueStatus.available_balance;
            proceedOverview.crypto_amount = j;
            proceedOverview.currency = "USD";
            double d = j;
            double d2 = this.rate;
            Double.isNaN(d);
            proceedOverview.amount = (long) (d * d2 * 100.0d);
            ChannelMonetizationLayout.ProceedOverview proceedOverview2 = this.totalValue;
            long j2 = tLRPC$TL_starsRevenueStatus.current_balance;
            proceedOverview2.crypto_amount = j2;
            proceedOverview2.currency = "USD";
            double d3 = j2;
            Double.isNaN(d3);
            proceedOverview2.amount = (long) (d3 * d2 * 100.0d);
            ChannelMonetizationLayout.ProceedOverview proceedOverview3 = this.totalProceedsValue;
            long j3 = tLRPC$TL_starsRevenueStatus.overall_revenue;
            proceedOverview3.crypto_amount = j3;
            proceedOverview3.currency = "USD";
            double d4 = j3;
            Double.isNaN(d4);
            proceedOverview3.amount = (long) (d4 * d2 * 100.0d);
            setBalance(j, tLRPC$TL_starsRevenueStatus.next_withdrawal_at);
        }
        arrayList.add(UItem.asProceedOverview(this.availableValue));
        arrayList.add(UItem.asProceedOverview(this.totalValue));
        arrayList.add(UItem.asProceedOverview(this.totalProceedsValue));
        arrayList.add(UItem.asShadow(-2, LocaleController.getString(R.string.BotStarsOverviewInfo)));
        arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotStarsAvailableBalance)));
        arrayList.add(UItem.asCustom(1, this.balanceLayout));
        arrayList.add(UItem.asShadow(-3, this.withdrawInfo));
        arrayList.add(UItem.asFullscreenCustom(this.transactionsLayout, 0));
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.instanceOf(StarsIntroActivity.StarsTransactionView.Factory.class)) {
            StarsIntroActivity.showTransactionSheet(getContext(), true, this.bot_id, this.currentAccount, (TLRPC$StarsTransaction) uItem.object, getResourceProvider());
        }
    }

    private void setBalance(long j, int i) {
        if (this.balanceTitle == null || this.balanceSubtitle == null) {
            return;
        }
        double d = this.rate;
        double d2 = j;
        Double.isNaN(d2);
        long j2 = (long) (d * d2 * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StarsIntroActivity.replaceStarsWithPlain("XTR " + LocaleController.formatNumber(j, ' '), 1.0f));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.balanceTitleSizeSpan, indexOf, spannableStringBuilder.length(), 33);
        }
        this.balanceTitle.setText(spannableStringBuilder);
        this.balanceSubtitle.setText("≈" + BillingController.getInstance().formatCurrency(j2, "USD"));
        this.balanceEditTextContainer.setVisibility(j2 > 0 ? 0 : 8);
        if (this.balanceEditTextAll) {
            this.balanceEditTextIgnore = true;
            EditTextBoldCursor editTextBoldCursor = this.balanceEditText;
            this.balanceEditTextValue = j;
            editTextBoldCursor.setText(Long.toString(j));
            EditTextBoldCursor editTextBoldCursor2 = this.balanceEditText;
            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            this.balanceEditTextIgnore = false;
            this.balanceButton.setEnabled(this.balanceEditTextValue > 0);
        }
        this.balanceBlockedUntil = i;
        AndroidUtilities.cancelRunOnUIThread(this.setBalanceButtonText);
        this.setBalanceButtonText.run();
    }

    public void lambda$new$11() {
        int currentTime = getConnectionsManager().getCurrentTime();
        this.balanceButton.setEnabled(this.balanceEditTextValue > 0 || this.balanceBlockedUntil > currentTime);
        if (currentTime < this.balanceBlockedUntil) {
            this.balanceButton.setText(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true);
            if (this.lock == null) {
                this.lock = new SpannableStringBuilder("l");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
                coloredImageSpan.setTopOffset(1);
                this.lock.setSpan(coloredImageSpan, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.lock).append((CharSequence) untilString(this.balanceBlockedUntil - currentTime));
            this.balanceButton.setSubText(spannableStringBuilder, true);
            Bulletin bulletin = this.withdrawalBulletin;
            if (bulletin != null && (bulletin.getLayout() instanceof Bulletin.LottieLayout) && this.withdrawalBulletin.getLayout().isAttachedToWindow()) {
                ((Bulletin.LottieLayout) this.withdrawalBulletin.getLayout()).textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, untilString(this.balanceBlockedUntil - currentTime))));
            }
            AndroidUtilities.cancelRunOnUIThread(this.setBalanceButtonText);
            AndroidUtilities.runOnUIThread(this.setBalanceButtonText, 1000L);
            return;
        }
        this.balanceButton.setSubText(null, true);
        this.balanceButton.setText(StarsIntroActivity.replaceStars(this.balanceEditTextAll ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringComma("BotStarsButtonWithdrawShort", (int) this.balanceEditTextValue, ' '), this.starRef), true);
    }

    public static String untilString(int i) {
        int i2 = i / 86400;
        int i3 = i - (86400 * i2);
        int i4 = i3 / 3600;
        int i5 = i3 - (i4 * 3600);
        int i6 = i5 / 60;
        int i7 = i5 - (i6 * 60);
        if (i2 == 0) {
            return i4 == 0 ? String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i7)) : String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7));
        }
        int i8 = R.string.PeriodDHM;
        Locale locale = Locale.ENGLISH;
        return LocaleController.formatString(i8, String.format(locale, "%02d", Integer.valueOf(i2)), String.format(locale, "%02d", Integer.valueOf(i4)), String.format(locale, "%02d", Integer.valueOf(i6)));
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        checkStats();
        return super.onFragmentCreate();
    }

    private void checkStats() {
        ChartData chartData;
        ArrayList<ChartData.Line> arrayList;
        TLRPC$TL_payments_starsRevenueStats revenueStats = BotStarsController.getInstance(this.currentAccount).getRevenueStats(this.bot_id);
        if (revenueStats == this.lastStats) {
            if ((revenueStats == null ? null : revenueStats.status) == this.lastStatsStatus) {
                return;
            }
        }
        this.lastStats = revenueStats;
        this.lastStatsStatus = revenueStats != null ? revenueStats.status : null;
        if (revenueStats != null) {
            this.rate = revenueStats.usd_rate;
            StatisticActivity.ChartViewData createViewData = StatisticActivity.createViewData(revenueStats.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2);
            this.revenueChartData = createViewData;
            if (createViewData != null && (chartData = createViewData.chartData) != null && (arrayList = chartData.lines) != null && !arrayList.isEmpty() && this.revenueChartData.chartData.lines.get(0) != null) {
                StatisticActivity.ChartViewData chartViewData = this.revenueChartData;
                chartViewData.showAll = true;
                chartViewData.chartData.lines.get(0).colorKey = Theme.key_color_yellow;
                this.revenueChartData.chartData.yRate = (float) ((1.0d / this.rate) / 100.0d);
            }
            TLRPC$TL_starsRevenueStatus tLRPC$TL_starsRevenueStatus = revenueStats.status;
            setBalance(tLRPC$TL_starsRevenueStatus.available_balance, tLRPC$TL_starsRevenueStatus.next_withdrawal_at);
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
        }
    }

    @Override
    public void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.bot_id) {
            checkStats();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundWhite)) > 0.721f;
    }

    public class NestedFrameLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3 {
        private NestedScrollingParentHelper nestedScrollingParentHelper;

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override
        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return i == 2;
        }

        @Override
        public void onStopNestedScroll(View view) {
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
        }

        public NestedFrameLayout(Context context) {
            super(context);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        }

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            try {
                if (view == BotStarsActivity.this.listView && BotStarsActivity.this.transactionsLayout.isAttachedToWindow()) {
                    RecyclerListView currentListView = BotStarsActivity.this.transactionsLayout.getCurrentListView();
                    int bottom = ((View) BotStarsActivity.this.transactionsLayout.getParent()).getBottom();
                    ((BaseFragment) BotStarsActivity.this).actionBar.setCastShadows(BotStarsActivity.this.listView.getHeight() - bottom < 0);
                    if (BotStarsActivity.this.listView.getHeight() - bottom >= 0) {
                        iArr[1] = i4;
                        currentListView.scrollBy(0, i4);
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        BotStarsActivity.NestedFrameLayout.this.lambda$onNestedScroll$0();
                    }
                });
            }
        }

        public void lambda$onNestedScroll$0() {
            try {
                RecyclerListView currentListView = BotStarsActivity.this.transactionsLayout.getCurrentListView();
                if (currentListView == null || currentListView.getAdapter() == null) {
                    return;
                }
                currentListView.getAdapter().notifyDataSetChanged();
            } catch (Throwable unused) {
            }
        }

        @Override
        public boolean onNestedPreFling(View view, float f, float f2) {
            return super.onNestedPreFling(view, f, f2);
        }

        @Override
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            if (view == BotStarsActivity.this.listView && BotStarsActivity.this.transactionsLayout.isAttachedToWindow()) {
                boolean isSearchFieldVisible = ((BaseFragment) BotStarsActivity.this).actionBar.isSearchFieldVisible();
                int top = (((View) BotStarsActivity.this.transactionsLayout.getParent()).getTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
                int bottom = ((View) BotStarsActivity.this.transactionsLayout.getParent()).getBottom();
                boolean z = false;
                if (i2 >= 0) {
                    if (isSearchFieldVisible) {
                        RecyclerListView currentListView = BotStarsActivity.this.transactionsLayout.getCurrentListView();
                        iArr[1] = i2;
                        if (top > 0) {
                            iArr[1] = i2 - i2;
                        }
                        if (currentListView == null || (i4 = iArr[1]) <= 0) {
                            return;
                        }
                        currentListView.scrollBy(0, i4);
                        return;
                    }
                    if (i2 > 0) {
                        RecyclerListView currentListView2 = BotStarsActivity.this.transactionsLayout.getCurrentListView();
                        if (BotStarsActivity.this.listView.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                            return;
                        }
                        iArr[1] = i2;
                        BotStarsActivity.this.listView.stopScroll();
                        return;
                    }
                    return;
                }
                ((BaseFragment) BotStarsActivity.this).actionBar.setCastShadows(BotStarsActivity.this.listView.getHeight() - bottom < 0);
                if (BotStarsActivity.this.listView.getHeight() - bottom >= 0) {
                    RecyclerListView currentListView3 = BotStarsActivity.this.transactionsLayout.getCurrentListView();
                    int findFirstVisibleItemPosition = ((LinearLayoutManager) currentListView3.getLayoutManager()).findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition != -1) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = currentListView3.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                        int top2 = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView.getTop() : -1;
                        int paddingTop = currentListView3.getPaddingTop();
                        if (top2 != paddingTop || findFirstVisibleItemPosition != 0) {
                            iArr[1] = findFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                            currentListView3.scrollBy(0, i2);
                            z = true;
                        }
                    }
                }
                if (isSearchFieldVisible) {
                    if (!z && top < 0) {
                        iArr[1] = i2 - Math.max(top, i2);
                    } else {
                        iArr[1] = i2;
                    }
                }
            }
        }

        @Override
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        }

        @Override
        public void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.onStopNestedScroll(view);
        }
    }

    public void lambda$withdraw$9(final long j, TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity) {
        final Activity parentActivity = getParentActivity();
        TLRPC$User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        TLRPC$TL_payments_getStarsRevenueWithdrawalUrl tLRPC$TL_payments_getStarsRevenueWithdrawalUrl = new TLRPC$TL_payments_getStarsRevenueWithdrawalUrl();
        tLRPC$TL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.bot_id);
        tLRPC$TL_payments_getStarsRevenueWithdrawalUrl.stars = j;
        if (tLRPC$InputCheckPasswordSRP == null) {
            tLRPC$InputCheckPasswordSRP = new TLRPC$TL_inputCheckPasswordEmpty();
        }
        tLRPC$TL_payments_getStarsRevenueWithdrawalUrl.password = tLRPC$InputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getStarsRevenueWithdrawalUrl, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotStarsActivity.this.lambda$initWithdraw$16(twoStepVerificationActivity, parentActivity, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$initWithdraw$16(final TwoStepVerificationActivity twoStepVerificationActivity, final Activity activity, final long j, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotStarsActivity.this.lambda$initWithdraw$15(tLRPC$TL_error, twoStepVerificationActivity, activity, j, tLObject);
            }
        });
    }

    public void lambda$initWithdraw$15(TLRPC$TL_error tLRPC$TL_error, final TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, final long j, TLObject tLObject) {
        int i;
        if (tLRPC$TL_error != null) {
            if ("PASSWORD_MISSING".equals(tLRPC$TL_error.text) || tLRPC$TL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tLRPC$TL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.needHideProgress();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setTitle(LocaleController.getString(R.string.EditAdminTransferAlertTitle));
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
                int color = Theme.getColor(i2);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                TextView textView2 = new TextView(activity);
                textView2.setTextColor(Theme.getColor(i2));
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EditAdminTransferAlertText1)));
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
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), mode));
                TextView textView3 = new TextView(activity);
                textView3.setTextColor(Theme.getColor(i2));
                textView3.setTextSize(1, 16.0f);
                textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EditAdminTransferAlertText2)));
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
                    builder.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferSetPassword), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            BotStarsActivity.this.lambda$initWithdraw$12(dialogInterface, i4);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                } else {
                    TextView textView4 = new TextView(activity);
                    textView4.setTextColor(Theme.getColor(i2));
                    textView4.setTextSize(1, 16.0f);
                    if (!LocaleController.isRTL) {
                        i = 3;
                    }
                    textView4.setGravity(i | 48);
                    textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                    linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                    builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                }
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.showDialog(builder.create());
                    return;
                } else {
                    showDialog(builder.create());
                    return;
                }
            }
            if ("SRP_ID_INVALID".equals(tLRPC$TL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                        BotStarsActivity.this.lambda$initWithdraw$14(twoStepVerificationActivity, j, tLObject2, tLRPC$TL_error2);
                    }
                }, 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
                twoStepVerificationActivity.lambda$onBackPressed$308();
            }
            BulletinFactory.showError(tLRPC$TL_error);
            return;
        }
        twoStepVerificationActivity.needHideProgress();
        twoStepVerificationActivity.lambda$onBackPressed$308();
        if (tLObject instanceof TLRPC$TL_payments_starsRevenueWithdrawalUrl) {
            this.balanceEditTextAll = true;
            Browser.openUrl(getContext(), ((TLRPC$TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public void lambda$initWithdraw$12(DialogInterface dialogInterface, int i) {
        presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    public void lambda$initWithdraw$14(final TwoStepVerificationActivity twoStepVerificationActivity, final long j, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotStarsActivity.this.lambda$initWithdraw$13(tLRPC$TL_error, tLObject, twoStepVerificationActivity, j);
            }
        });
    }

    public void lambda$initWithdraw$13(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, long j) {
        if (tLRPC$TL_error == null) {
            TLRPC$account_Password tLRPC$account_Password = (TLRPC$account_Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, tLRPC$account_Password);
            TwoStepVerificationActivity.initPasswordNewAlgo(tLRPC$account_Password);
            lambda$withdraw$9(j, twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
        }
    }
}
