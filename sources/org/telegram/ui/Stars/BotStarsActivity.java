package org.telegram.ui.Stars;

import android.app.Activity;
import android.content.Context;
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
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.TwoStepVerificationSetupActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;

public class BotStarsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ButtonWithCounterView adsButton;
    private ChatAvatarContainer avatarContainer;
    private int balanceBlockedUntil;
    private ButtonWithCounterView balanceButton;
    private LinearLayout balanceButtonsLayout;
    private EditTextBoldCursor balanceEditText;
    private OutlineTextContainerView balanceEditTextContainer;
    private long balanceEditTextValue;
    private CharSequence balanceInfo;
    private LinearLayout balanceLayout;
    private AnimatedTextView balanceSubtitle;
    private AnimatedTextView balanceTitle;
    private RelativeSizeSpan balanceTitleSizeSpan;
    public final long bot_id;
    private DecimalFormat formatter;
    private StatisticActivity.ChartViewData impressionsChart;
    private TLRPC.TL_payments_starsRevenueStats lastStats;
    private TLRPC.TL_starsRevenueStatus lastStatsStatus;
    private UniversalRecyclerView listView;
    private SpannableStringBuilder lock;
    private boolean proceedsAvailable;
    private CharSequence proceedsInfo;
    private double rate;
    private StatisticActivity.ChartViewData revenueChart;
    private StatisticActivity.ChartViewData revenueChartData;
    public final boolean self;
    private CharSequence titleInfo;
    private ButtonWithCounterView tonBalanceButton;
    private LinearLayout tonBalanceLayout;
    private AnimatedTextView tonBalanceSubtitle;
    private AnimatedTextView tonBalanceTitle;
    private RelativeSizeSpan tonBalanceTitleSizeSpan;
    private StarsIntroActivity.StarsTransactionsLayout transactionsLayout;
    public final int type;
    private final CharSequence withdrawInfo;
    private Bulletin withdrawalBulletin;
    private final ChannelMonetizationLayout.ProceedOverview availableValue = ChannelMonetizationLayout.ProceedOverview.as("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
    private final ChannelMonetizationLayout.ProceedOverview totalValue = ChannelMonetizationLayout.ProceedOverview.as("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
    private final ChannelMonetizationLayout.ProceedOverview totalProceedsValue = ChannelMonetizationLayout.ProceedOverview.as("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
    private final ChannelMonetizationLayout.ProceedOverview tonAvailableValue = ChannelMonetizationLayout.ProceedOverview.as("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
    private final ChannelMonetizationLayout.ProceedOverview tonLastWithdrawalValue = ChannelMonetizationLayout.ProceedOverview.as("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
    private final ChannelMonetizationLayout.ProceedOverview tonLifetimeValue = ChannelMonetizationLayout.ProceedOverview.as("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
    private boolean balanceEditTextIgnore = false;
    private boolean balanceEditTextAll = true;
    private ColoredImageSpan[] starRef = new ColoredImageSpan[1];
    private int shakeDp = 4;
    private final int BALANCE = 1;
    private final int BUTTON_AFFILIATE = 2;
    private boolean tonTransactionsLoading = false;
    private boolean tonTransactionsEndReached = false;
    private final ArrayList tonTransactions = new ArrayList();
    private String tonTransactionsLastOffset = "";
    private Runnable setBalanceButtonText = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$19();
        }
    };
    private int stats_dc = -1;

    public boolean onItemLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    public BotStarsActivity(int i, long j) {
        this.type = i;
        this.bot_id = j;
        boolean z = j == getUserConfig().getClientUserId();
        this.self = z;
        if (i == 0) {
            BotStarsController.getInstance(this.currentAccount).preloadStarsStats(j);
            if (!z) {
                BotStarsController.getInstance(this.currentAccount).invalidateTransactions(j, true);
            }
        } else if (i == 1) {
            BotStarsController.getInstance(this.currentAccount).preloadTonStats(j);
        }
        this.withdrawInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z ? LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin) : LocaleController.getString(R.string.BotStarsWithdrawInfo), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
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
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.bot_id));
        this.avatarContainer.setUserAvatar(user, true);
        this.avatarContainer.setTitle(UserObject.getUserName(user));
        if (this.type == 0) {
            this.avatarContainer.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.avatarContainer.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    BotStarsActivity.this.finishFragment();
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
        this.transactionsLayout = new StarsIntroActivity.StarsTransactionsLayout(context, this.currentAccount, false, this.bot_id, getClassGuid(), getResourceProvider());
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
        AnimatedTextView animatedTextView4 = this.balanceSubtitle;
        int i4 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView4.setTextColor(Theme.getColor(i4, getResourceProvider()));
        this.balanceSubtitle.setTextSize(AndroidUtilities.dp(14.0f));
        this.balanceLayout.addView(this.balanceSubtitle, LayoutHelper.createFrame(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (BotStarsActivity.this.balanceEditText != null && !BotStarsActivity.this.balanceEditText.isFocusable()) {
                    BotStarsActivity.this.balanceEditText.setFocusable(true);
                    BotStarsActivity.this.balanceEditText.setFocusableInTouchMode(true);
                    int iFindPositionByItemId = BotStarsActivity.this.listView.findPositionByItemId(1);
                    if (iFindPositionByItemId >= 0 && iFindPositionByItemId < BotStarsActivity.this.listView.adapter.getItemCount()) {
                        BotStarsActivity.this.listView.stopScroll();
                        BotStarsActivity.this.listView.smoothScrollToPosition(iFindPositionByItemId);
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
            protected void onDetachedFromWindow() {
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
        int iDp = AndroidUtilities.dp(16.0f);
        this.balanceEditText.setPadding(AndroidUtilities.dp(6.0f), iDp, iDp, iDp);
        this.balanceEditText.setInputType(2);
        this.balanceEditText.setTypeface(Typeface.DEFAULT);
        this.balanceEditText.setHighlightColor(getThemedColor(Theme.key_chat_inTextSelectionHighlight));
        this.balanceEditText.setHandlesColor(getThemedColor(Theme.key_chat_TextSelectionCursor));
        this.balanceEditText.setGravity(LocaleController.isRTL ? 5 : 3);
        this.balanceEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z) {
                this.f$0.lambda$createView$1(view, z);
            }
        });
        this.balanceEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
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
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                return this.f$0.lambda$createView$2(textView, i5, keyEvent);
            }
        });
        this.balanceLayout.addView(this.balanceEditTextContainer, LayoutHelper.createLinear(-1, -2, 1, 18, 14, 18, 2));
        this.balanceEditTextContainer.setVisibility(8);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.balanceButtonsLayout = linearLayout3;
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
                this.f$0.lambda$createView$3(view);
            }
        });
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, getResourceProvider());
        this.adsButton = buttonWithCounterView2;
        buttonWithCounterView2.setEnabled(true);
        this.adsButton.setText(LocaleController.getString(R.string.MonetizationStarsAds), false);
        this.adsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$7(context, view);
            }
        });
        this.balanceButtonsLayout.addView(this.balanceButton, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        if (!this.self) {
            this.balanceButtonsLayout.addView(new Space(context), LayoutHelper.createLinear(8, 48, 0.0f, 119));
            this.balanceButtonsLayout.addView(this.adsButton, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        }
        this.balanceLayout.addView(this.balanceButtonsLayout, LayoutHelper.createFrame(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        LinearLayout linearLayout4 = new LinearLayout(context) {
            @Override
            protected void onMeasure(int i5, int i6) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), 1073741824), i6);
            }
        };
        this.tonBalanceLayout = linearLayout4;
        linearLayout4.setOrientation(1);
        this.tonBalanceLayout.setBackgroundColor(Theme.getColor(i2, this.resourceProvider));
        this.tonBalanceLayout.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        AnimatedTextView animatedTextView5 = new AnimatedTextView(context, false, true, true);
        this.tonBalanceTitle = animatedTextView5;
        animatedTextView5.setTypeface(AndroidUtilities.bold());
        this.tonBalanceTitle.setTextColor(Theme.getColor(i3, this.resourceProvider));
        this.tonBalanceTitle.setTextSize(AndroidUtilities.dp(32.0f));
        this.tonBalanceTitle.setGravity(17);
        this.tonBalanceTitleSizeSpan = new RelativeSizeSpan(0.6770833f);
        this.tonBalanceLayout.addView(this.tonBalanceTitle, LayoutHelper.createLinear(-1, 38, 49, 22, 15, 22, 0));
        AnimatedTextView animatedTextView6 = new AnimatedTextView(context, true, true, true);
        this.tonBalanceSubtitle = animatedTextView6;
        animatedTextView6.setGravity(17);
        this.tonBalanceSubtitle.setTextColor(Theme.getColor(i4, this.resourceProvider));
        this.tonBalanceSubtitle.setTextSize(AndroidUtilities.dp(14.0f));
        this.tonBalanceLayout.addView(this.tonBalanceSubtitle, LayoutHelper.createFrame(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(context, this.resourceProvider);
        this.tonBalanceButton = buttonWithCounterView3;
        buttonWithCounterView3.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.tonBalanceButton.setText(LocaleController.getString(this.self ? R.string.MonetizationSelfWithdraw : R.string.MonetizationWithdraw), false);
        this.tonBalanceButton.setVisibility(8);
        this.tonBalanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$10(view);
            }
        });
        this.tonBalanceLayout.addView(this.tonBalanceButton, LayoutHelper.createFrame(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(this.f$0.onItemLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        });
        this.listView = universalRecyclerView;
        universalRecyclerView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        nestedFrameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                BotStarsActivity botStarsActivity = BotStarsActivity.this;
                if (botStarsActivity.type == 1) {
                    if (!botStarsActivity.listView.canScrollVertically(1) || BotStarsActivity.this.isLoadingVisible()) {
                        BotStarsActivity.this.loadTonTransactions();
                    }
                }
            }
        });
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
        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.bot_id);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$createView$6(context, tLObject, tL_error);
            }
        });
    }

    public void lambda$createView$6(final Context context, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$5(tLObject, context);
            }
        });
    }

    public void lambda$createView$5(TLObject tLObject, Context context) {
        if (tLObject instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
            Browser.openUrl(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject).url);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$4();
            }
        }, 1000L);
    }

    public void lambda$createView$4() {
        this.adsButton.setLoading(false);
    }

    public void lambda$createView$10(View view) {
        if (!view.isEnabled() || this.tonBalanceButton.isLoading()) {
            return;
        }
        final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(1, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() {
            @Override
            public final void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
                this.f$0.lambda$createView$8(twoStepVerificationActivity, inputCheckPasswordSRP);
            }
        });
        this.tonBalanceButton.setLoading(true);
        twoStepVerificationActivity.preload(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$9(twoStepVerificationActivity);
            }
        });
    }

    public void lambda$createView$8(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        initWithdraw(false, 0L, inputCheckPasswordSRP, twoStepVerificationActivity);
    }

    public void lambda$createView$9(TwoStepVerificationActivity twoStepVerificationActivity) {
        this.tonBalanceButton.setLoading(false);
        presentFragment(twoStepVerificationActivity);
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
                    this.f$0.lambda$withdraw$11();
                }
            })).show();
            return;
        }
        final long j = this.balanceEditTextValue;
        final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(1, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() {
            @Override
            public final void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
                this.f$0.lambda$withdraw$12(j, twoStepVerificationActivity, inputCheckPasswordSRP);
            }
        });
        this.balanceButton.setLoading(true);
        twoStepVerificationActivity.preload(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$withdraw$13(twoStepVerificationActivity);
            }
        });
    }

    public void lambda$withdraw$11() {
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

    public void lambda$withdraw$12(long j, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        initWithdraw(true, j, inputCheckPasswordSRP, twoStepVerificationActivity);
    }

    public void lambda$withdraw$13(TwoStepVerificationActivity twoStepVerificationActivity) {
        this.balanceButton.setLoading(false);
        presentFragment(twoStepVerificationActivity);
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
        int i = this.type;
        if (i == 0) {
            arrayList.add(UItem.asChart(2, this.stats_dc, this.revenueChartData));
            arrayList.add(UItem.asShadow(-1, null));
            arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats starsRevenueStats = botStarsController.getStarsRevenueStats(this.bot_id);
            if (starsRevenueStats != null && (tL_starsRevenueStatus2 = starsRevenueStats.status) != null) {
                ChannelMonetizationLayout.ProceedOverview proceedOverview = this.availableValue;
                proceedOverview.contains1 = false;
                proceedOverview.contains2 = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                proceedOverview.crypto_amount2 = starsAmount;
                proceedOverview.crypto_currency2 = "XTR";
                proceedOverview.currency = "USD";
                double d = starsAmount.amount;
                double d2 = this.rate;
                proceedOverview.amount2 = (long) (d * d2 * 100.0d);
                ChannelMonetizationLayout.ProceedOverview proceedOverview2 = this.totalValue;
                proceedOverview2.contains1 = false;
                proceedOverview2.contains2 = true;
                proceedOverview2.crypto_amount2 = tL_starsRevenueStatus2.current_balance;
                proceedOverview2.crypto_currency2 = "XTR";
                proceedOverview2.amount2 = (long) (r5.amount * d2 * 100.0d);
                proceedOverview2.currency = "USD";
                ChannelMonetizationLayout.ProceedOverview proceedOverview3 = this.totalProceedsValue;
                proceedOverview3.contains1 = false;
                proceedOverview3.contains2 = true;
                proceedOverview3.crypto_amount2 = tL_starsRevenueStatus2.overall_revenue;
                proceedOverview3.crypto_currency2 = "XTR";
                proceedOverview3.amount2 = (long) (r5.amount * d2 * 100.0d);
                proceedOverview3.currency = "USD";
                setStarsBalance(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                this.balanceButtonsLayout.setVisibility(starsRevenueStats.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(UItem.asProceedOverview(this.availableValue));
            arrayList.add(UItem.asProceedOverview(this.totalValue));
            arrayList.add(UItem.asProceedOverview(this.totalProceedsValue));
            arrayList.add(UItem.asShadow(-2, LocaleController.getString(this.self ? R.string.SelfStarsOverviewInfo : R.string.BotStarsOverviewInfo)));
            arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(UItem.asCustom(1, this.balanceLayout));
            arrayList.add(UItem.asShadow(-3, this.withdrawInfo));
            if (this.self) {
                return;
            }
            if (getMessagesController().starrefConnectAllowed) {
                arrayList.add(AffiliateProgramFragment.ColorfulTextCell.Factory.as(2, Theme.getColor(Theme.key_color_green, this.resourceProvider), R.drawable.filled_earn_stars, ChatEditActivity.applyNewSpan(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                arrayList.add(UItem.asShadow(-4, null));
            }
            arrayList.add(UItem.asFullscreenCustom(this.transactionsLayout, 0));
            return;
        }
        if (i == 1) {
            TLRPC.TL_payments_starsRevenueStats tONRevenueStats = botStarsController.getTONRevenueStats(this.bot_id, true);
            if (!this.self) {
                if (this.titleInfo == null) {
                    this.titleInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$fillItems$14();
                        }
                    }, this.resourceProvider), true);
                }
                arrayList.add(UItem.asCenterShadow(this.titleInfo));
            }
            if (this.impressionsChart == null && tONRevenueStats != null) {
                StatisticActivity.ChartViewData chartViewDataCreateViewData = StatisticActivity.createViewData(tONRevenueStats.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0);
                this.impressionsChart = chartViewDataCreateViewData;
                if (chartViewDataCreateViewData != null) {
                    chartViewDataCreateViewData.useHourFormat = true;
                }
            }
            StatisticActivity.ChartViewData chartViewData = this.impressionsChart;
            if (chartViewData != null && !chartViewData.isEmpty) {
                arrayList.add(UItem.asChart(5, this.stats_dc, chartViewData));
                arrayList.add(UItem.asShadow(-1, null));
            }
            if (this.revenueChart == null && tONRevenueStats != null) {
                TL_stats.StatsGraph statsGraph = tONRevenueStats.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / tONRevenueStats.usd_rate);
                }
                this.revenueChart = StatisticActivity.createViewData(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2);
            }
            StatisticActivity.ChartViewData chartViewData2 = this.revenueChart;
            if (chartViewData2 != null && !chartViewData2.isEmpty) {
                arrayList.add(UItem.asChart(2, this.stats_dc, chartViewData2));
                arrayList.add(UItem.asShadow(-2, null));
            }
            if (!this.proceedsAvailable && tONRevenueStats != null && (tL_starsRevenueStatus = tONRevenueStats.status) != null) {
                double d3 = tONRevenueStats.usd_rate;
                ChannelMonetizationLayout.ProceedOverview proceedOverview4 = this.tonAvailableValue;
                long j = tL_starsRevenueStatus.available_balance.amount;
                proceedOverview4.crypto_amount = j;
                long j2 = (long) ((j / 1.0E9d) * d3 * 100.0d);
                proceedOverview4.amount = j2;
                setBalance(j, j2);
                this.tonAvailableValue.currency = "USD";
                ChannelMonetizationLayout.ProceedOverview proceedOverview5 = this.tonLastWithdrawalValue;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = tONRevenueStats.status;
                long j3 = tL_starsRevenueStatus3.current_balance.amount;
                proceedOverview5.crypto_amount = j3;
                proceedOverview5.amount = (long) ((j3 / 1.0E9d) * d3 * 100.0d);
                proceedOverview5.currency = "USD";
                ChannelMonetizationLayout.ProceedOverview proceedOverview6 = this.tonLifetimeValue;
                proceedOverview6.contains1 = true;
                long j4 = tL_starsRevenueStatus3.overall_revenue.amount;
                proceedOverview6.crypto_amount = j4;
                proceedOverview6.amount = (long) ((j4 / 1.0E9d) * d3 * 100.0d);
                proceedOverview6.currency = "USD";
                this.proceedsAvailable = true;
                this.tonBalanceButton.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (this.proceedsAvailable) {
                arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(UItem.asProceedOverview(this.tonAvailableValue));
                arrayList.add(UItem.asProceedOverview(this.tonLastWithdrawalValue));
                arrayList.add(UItem.asProceedOverview(this.tonLifetimeValue));
                if (this.proceedsInfo == null) {
                    int i2 = R.string.BotMonetizationProceedsTONInfo;
                    final int i3 = R.string.BotMonetizationProceedsTONInfoLink;
                    this.proceedsInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i2), -1, 3, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$fillItems$15(i3);
                        }
                    }, this.resourceProvider), true);
                }
                arrayList.add(UItem.asShadow(-4, this.proceedsInfo));
            }
            arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(UItem.asCustom(this.tonBalanceLayout));
            if (this.balanceInfo == null) {
                this.balanceInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled ? R.string.BotMonetizationBalanceInfo : R.string.BotMonetizationBalanceInfoNotAvailable), -1, 3, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$fillItems$16();
                    }
                }), true);
            }
            arrayList.add(UItem.asShadow(-5, this.balanceInfo));
            if (!this.tonTransactionsEndReached || !this.tonTransactions.isEmpty()) {
                arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotMonetizationTransactions)));
                Iterator it = this.tonTransactions.iterator();
                while (it.hasNext()) {
                    arrayList.add(StarsIntroActivity.StarsTransactionView.Factory.asTransaction((TL_stars.StarsTransaction) it.next(), true));
                }
                if (!this.tonTransactionsEndReached) {
                    arrayList.add(UItem.asFlicker(1, 7));
                    arrayList.add(UItem.asFlicker(2, 7));
                    arrayList.add(UItem.asFlicker(3, 7));
                }
            }
            arrayList.add(UItem.asShadow(-6, null));
        }
    }

    public void lambda$fillItems$14() {
        showDialog(ChannelMonetizationLayout.makeLearnSheet(getContext(), true, this.resourceProvider));
    }

    public void lambda$fillItems$15(int i) {
        Browser.openUrl(getContext(), LocaleController.getString(i));
    }

    public void lambda$fillItems$16() {
        Browser.openUrl(getContext(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
    }

    public void loadTonTransactions() {
        if (this.tonTransactionsLoading || this.tonTransactionsEndReached || this.tonTransactionsLastOffset == null) {
            return;
        }
        this.tonTransactionsLoading = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.bot_id);
        tL_payments_getStarsTransactions.offset = this.tonTransactionsLastOffset;
        tL_payments_getStarsTransactions.limit = this.tonTransactions.isEmpty() ? 5 : 20;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadTonTransactions$18(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadTonTransactions$18(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadTonTransactions$17(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadTonTransactions$17(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(starsStatus.chats, false);
            this.tonTransactionsLastOffset = starsStatus.next_offset;
            this.tonTransactions.addAll(starsStatus.history);
            this.tonTransactionsEndReached = starsStatus.history.isEmpty() || starsStatus.next_offset == null;
        } else if (tL_error != null) {
            BulletinFactory.showError(tL_error);
            this.tonTransactionsEndReached = true;
        }
        this.tonTransactionsLoading = false;
        UniversalAdapter universalAdapter = this.listView.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
    }

    public boolean isLoadingVisible() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.instanceOf(StarsIntroActivity.StarsTransactionView.Factory.class)) {
            StarsIntroActivity.showTransactionSheet(getContext(), true, this.bot_id, this.currentAccount, (TL_stars.StarsTransaction) uItem.object, getResourceProvider());
        } else if (uItem.object instanceof TL_stats.BroadcastRevenueTransaction) {
            ChannelMonetizationLayout.showTransactionSheet(getContext(), this.currentAccount, (TL_stats.BroadcastRevenueTransaction) uItem.object, this.bot_id, this.resourceProvider);
        } else if (uItem.id == 2) {
            presentFragment(new ChannelAffiliateProgramsFragment(this.bot_id));
        }
    }

    private void setStarsBalance(TL_stars.StarsAmount starsAmount, int i) {
        if (this.balanceTitle == null || this.balanceSubtitle == null) {
            return;
        }
        long j = (long) (this.rate * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StarsIntroActivity.replaceStarsWithPlain(TextUtils.concat("XTR ", StarsIntroActivity.formatStarsAmount(starsAmount, 0.8f, ' ')), 1.0f));
        int iIndexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(this.balanceTitleSizeSpan, iIndexOf, spannableStringBuilder.length(), 33);
        }
        this.balanceTitle.setText(spannableStringBuilder);
        this.balanceSubtitle.setText("≈" + BillingController.getInstance().formatCurrency(j, "USD"));
        this.balanceEditTextContainer.setVisibility(j > 0 ? 0 : 8);
        if (this.balanceEditTextAll) {
            this.balanceEditTextIgnore = true;
            EditTextBoldCursor editTextBoldCursor = this.balanceEditText;
            long j2 = starsAmount.amount;
            this.balanceEditTextValue = j2;
            editTextBoldCursor.setText(Long.toString(j2));
            EditTextBoldCursor editTextBoldCursor2 = this.balanceEditText;
            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            this.balanceEditTextIgnore = false;
            this.balanceButton.setEnabled(this.balanceEditTextValue > 0);
        }
        this.balanceBlockedUntil = i;
        AndroidUtilities.cancelRunOnUIThread(this.setBalanceButtonText);
        this.setBalanceButtonText.run();
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
        double d = j / 1.0E9d;
        this.formatter.setMaximumFractionDigits(d > 1.5d ? 2 : 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ChannelMonetizationLayout.replaceTON("TON " + this.formatter.format(d), this.tonBalanceTitle.getPaint(), 0.9f, true));
        int iIndexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(this.tonBalanceTitleSizeSpan, iIndexOf, spannableStringBuilder.length(), 33);
        }
        this.tonBalanceTitle.setText(spannableStringBuilder);
        this.tonBalanceSubtitle.setText("≈" + BillingController.getInstance().formatCurrency(j2, "USD"));
    }

    public void lambda$new$19() {
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
        this.balanceButton.setText(StarsIntroActivity.replaceStars(this.balanceEditTextAll ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) this.balanceEditTextValue), this.starRef), true);
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
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(this.currentAccount).getStarsRevenueStats(this.bot_id);
        if (starsRevenueStats == this.lastStats) {
            if ((starsRevenueStats == null ? null : starsRevenueStats.status) == this.lastStatsStatus) {
                return;
            }
        }
        this.lastStats = starsRevenueStats;
        this.lastStatsStatus = starsRevenueStats != null ? starsRevenueStats.status : null;
        if (starsRevenueStats != null) {
            this.rate = starsRevenueStats.usd_rate;
            StatisticActivity.ChartViewData chartViewDataCreateViewData = StatisticActivity.createViewData(starsRevenueStats.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2);
            this.revenueChartData = chartViewDataCreateViewData;
            if (chartViewDataCreateViewData != null && (chartData = chartViewDataCreateViewData.chartData) != null && (arrayList = chartData.lines) != null && !arrayList.isEmpty() && this.revenueChartData.chartData.lines.get(0) != null) {
                StatisticActivity.ChartViewData chartViewData = this.revenueChartData;
                chartViewData.showAll = true;
                ((ChartData.Line) chartViewData.chartData.lines.get(0)).colorKey = Theme.key_color_yellow;
                this.revenueChartData.chartData.yRate = (float) ((1.0d / this.rate) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = starsRevenueStats.status;
            setStarsBalance(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
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

    class NestedFrameLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3 {
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
                        this.f$0.lambda$onNestedScroll$0();
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
                boolean zIsSearchFieldVisible = ((BaseFragment) BotStarsActivity.this).actionBar.isSearchFieldVisible();
                int top = (((View) BotStarsActivity.this.transactionsLayout.getParent()).getTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
                int bottom = ((View) BotStarsActivity.this.transactionsLayout.getParent()).getBottom();
                boolean z = false;
                if (i2 >= 0) {
                    if (zIsSearchFieldVisible) {
                        RecyclerListView currentListView = BotStarsActivity.this.transactionsLayout.getCurrentListView();
                        iArr[1] = i2;
                        if (top > 0) {
                            iArr[1] = 0;
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
                    int iFindFirstVisibleItemPosition = ((LinearLayoutManager) currentListView3.getLayoutManager()).findFirstVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition != -1) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = currentListView3.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                        int top2 = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : -1;
                        int paddingTop = currentListView3.getPaddingTop();
                        if (top2 != paddingTop || iFindFirstVisibleItemPosition != 0) {
                            iArr[1] = iFindFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                            currentListView3.scrollBy(0, i2);
                            z = true;
                        }
                    }
                }
                if (zIsSearchFieldVisible) {
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

    private void initWithdraw(final boolean z, final long j, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        final Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        if (z) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.bot_id);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.bot_id);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$initWithdraw$24(twoStepVerificationActivity, parentActivity, z, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$initWithdraw$24(final TwoStepVerificationActivity twoStepVerificationActivity, final Activity activity, final boolean z, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$initWithdraw$23(tL_error, twoStepVerificationActivity, activity, z, j, tLObject);
            }
        });
    }

    public void lambda$initWithdraw$23(TLRPC.TL_error tL_error, final TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, final boolean z, final long j, TLObject tLObject) {
        int i;
        if (tL_error != null) {
            if ("PASSWORD_MISSING".equals(tL_error.text) || tL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
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
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    builder.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferSetPassword), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            this.f$0.lambda$initWithdraw$20(alertDialog, i4);
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
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        this.f$0.lambda$initWithdraw$22(twoStepVerificationActivity, z, j, tLObject2, tL_error2);
                    }
                }, 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
                twoStepVerificationActivity.finishFragment();
            }
            BulletinFactory.showError(tL_error);
            return;
        }
        twoStepVerificationActivity.needHideProgress();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            Browser.openUrlInSystemBrowser(getContext(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            this.balanceEditTextAll = true;
            Browser.openUrlInSystemBrowser(getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public void lambda$initWithdraw$20(AlertDialog alertDialog, int i) {
        presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    public void lambda$initWithdraw$22(final TwoStepVerificationActivity twoStepVerificationActivity, final boolean z, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$initWithdraw$21(tL_error, tLObject, twoStepVerificationActivity, z, j);
            }
        });
    }

    public void lambda$initWithdraw$21(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, long j) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, password);
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            initWithdraw(z, j, twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
        }
    }
}
