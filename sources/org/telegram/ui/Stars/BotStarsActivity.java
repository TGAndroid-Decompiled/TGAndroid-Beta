package org.telegram.ui.Stars;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
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
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.iv.RichEditText$$ExternalSyntheticLambda4;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.WebActionBar;

public final class BotStarsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public ButtonWithCounterView adsButton;
    public final ChannelMonetizationLayout.ProceedOverview availableValue;
    public ChatAvatarContainer avatarContainer;
    public int balanceBlockedUntil;
    public ButtonWithCounterView balanceButton;
    public LinearLayout balanceButtonsLayout;
    public WebActionBar.AnonymousClass4 balanceEditText;
    public boolean balanceEditTextAll;
    public AnonymousClass3 balanceEditTextContainer;
    public boolean balanceEditTextIgnore;
    public long balanceEditTextValue;
    public CharSequence balanceInfo;
    public WebActionBar.AnonymousClass1 balanceLayout;
    public AnimatedTextView balanceSubtitle;
    public AnimatedTextView balanceTitle;
    public RelativeSizeSpan balanceTitleSizeSpan;
    public final long bot_id;
    public DecimalFormat formatter;
    public StatisticActivity.ChartViewData impressionsChart;
    public TLRPC.TL_payments_starsRevenueStats lastStats;
    public TLRPC.TL_starsRevenueStatus lastStatsStatus;
    public UniversalRecyclerView listView;
    public SpannableStringBuilder lock;
    public boolean proceedsAvailable;
    public CharSequence proceedsInfo;
    public double rate;
    public StatisticActivity.ChartViewData revenueChart;
    public StatisticActivity.ChartViewData revenueChartData;
    public final boolean self;
    public final BotStarsActivity$$ExternalSyntheticLambda0 setBalanceButtonText;
    public final ColoredImageSpan[] starRef;
    public final int stats_dc;
    public CharSequence titleInfo;
    public final ChannelMonetizationLayout.ProceedOverview tonAvailableValue;
    public ButtonWithCounterView tonBalanceButton;
    public WebActionBar.AnonymousClass1 tonBalanceLayout;
    public AnimatedTextView tonBalanceSubtitle;
    public AnimatedTextView tonBalanceTitle;
    public RelativeSizeSpan tonBalanceTitleSizeSpan;
    public final ChannelMonetizationLayout.ProceedOverview tonLastWithdrawalValue;
    public final ChannelMonetizationLayout.ProceedOverview tonLifetimeValue;
    public final ArrayList tonTransactions;
    public boolean tonTransactionsEndReached;
    public String tonTransactionsLastOffset;
    public boolean tonTransactionsLoading;
    public final ChannelMonetizationLayout.ProceedOverview totalProceedsValue;
    public final ChannelMonetizationLayout.ProceedOverview totalValue;
    public StarsIntroActivity.StarsTransactionsLayout transactionsLayout;
    public final int type;
    public final CharSequence withdrawInfo;
    public Bulletin withdrawalBulletin;

    public final class AnonymousClass6 extends ButtonWithCounterView {
        public final int $r8$classId;

        public AnonymousClass6(Context context, int i, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context, z, resourcesProvider);
            this.$r8$classId = i;
        }

        @Override
        public boolean subTextSplitToWords() {
            switch (this.$r8$classId) {
                case 0:
                    return false;
                case 1:
                default:
                    return super.subTextSplitToWords();
                case 2:
                    return false;
            }
        }
    }

    public final class NestedFrameLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3 {
        public final NestedScrollingParentHelper nestedScrollingParentHelper;

        public NestedFrameLayout(Context context) {
            super(context);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
        }

        @Override
        public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            BotStarsActivity botStarsActivity = BotStarsActivity.this;
            if (view == botStarsActivity.listView && botStarsActivity.transactionsLayout.isAttachedToWindow()) {
                boolean zIsSearchFieldVisible = ((BaseFragment) botStarsActivity).actionBar.isSearchFieldVisible();
                int top = (((View) botStarsActivity.transactionsLayout.getParent()).getTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
                int bottom = ((View) botStarsActivity.transactionsLayout.getParent()).getBottom();
                boolean z = false;
                if (i2 >= 0) {
                    if (zIsSearchFieldVisible) {
                        RecyclerListView currentListView = botStarsActivity.transactionsLayout.getCurrentListView();
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
                        RecyclerListView currentListView2 = botStarsActivity.transactionsLayout.getCurrentListView();
                        if (botStarsActivity.listView.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                            return;
                        }
                        iArr[1] = i2;
                        botStarsActivity.listView.stopScroll();
                        return;
                    }
                    return;
                }
                ((BaseFragment) botStarsActivity).actionBar.setCastShadows(botStarsActivity.listView.getHeight() - bottom < 0);
                if (botStarsActivity.listView.getHeight() - bottom >= 0) {
                    RecyclerListView currentListView3 = botStarsActivity.transactionsLayout.getCurrentListView();
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
                    if (z || top >= 0) {
                        iArr[1] = i2;
                    } else {
                        iArr[1] = i2 - Math.max(top, i2);
                    }
                }
            }
        }

        @Override
        public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override
        public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.mNestedScrollAxesTouch = i;
        }

        @Override
        public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return i == 2;
        }

        @Override
        public final void onStopNestedScroll(View view) {
        }

        @Override
        public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            BotStarsActivity botStarsActivity = BotStarsActivity.this;
            try {
                if (view == botStarsActivity.listView && botStarsActivity.transactionsLayout.isAttachedToWindow()) {
                    RecyclerListView currentListView = botStarsActivity.transactionsLayout.getCurrentListView();
                    int bottom = ((View) botStarsActivity.transactionsLayout.getParent()).getBottom();
                    ((BaseFragment) botStarsActivity).actionBar.setCastShadows(botStarsActivity.listView.getHeight() - bottom < 0);
                    if (botStarsActivity.listView.getHeight() - bottom >= 0) {
                        iArr[1] = i4;
                        currentListView.scrollBy(0, i4);
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new BalanceCloud$$ExternalSyntheticLambda1(this, 1));
            }
        }

        @Override
        public final void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.mNestedScrollAxesTouch = 0;
        }
    }

    public BotStarsActivity(int i, long j) {
        super(null);
        this.availableValue = ChannelMonetizationLayout.ProceedOverview.as("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.totalValue = ChannelMonetizationLayout.ProceedOverview.as("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.totalProceedsValue = ChannelMonetizationLayout.ProceedOverview.as("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.tonAvailableValue = ChannelMonetizationLayout.ProceedOverview.as("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.tonLastWithdrawalValue = ChannelMonetizationLayout.ProceedOverview.as("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.tonLifetimeValue = ChannelMonetizationLayout.ProceedOverview.as("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        this.balanceEditTextIgnore = false;
        this.balanceEditTextAll = true;
        this.starRef = new ColoredImageSpan[1];
        this.tonTransactionsLoading = false;
        this.tonTransactionsEndReached = false;
        this.tonTransactions = new ArrayList();
        this.tonTransactionsLastOffset = "";
        this.setBalanceButtonText = new BotStarsActivity$$ExternalSyntheticLambda0(this, 0);
        this.stats_dc = -1;
        this.type = i;
        this.bot_id = j;
        boolean z = j == getUserConfig().getClientUserId();
        this.self = z;
        if (i == 0) {
            BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
            Long l = (Long) botStarsController.lastLoadedBotStarsStats.get(Long.valueOf(j));
            botStarsController.getStarsRevenueStats(j, l == null || System.currentTimeMillis() - l.longValue() > 30000);
            if (!z) {
                BotStarsController.getInstance(this.currentAccount).invalidateTransactions(j);
            }
        } else if (i == 1) {
            BotStarsController botStarsController2 = BotStarsController.getInstance(this.currentAccount);
            Long l2 = (Long) botStarsController2.lastLoadedTonStats.get(Long.valueOf(j));
            botStarsController2.getTONRevenueStats(j, l2 == null || System.currentTimeMillis() - l2.longValue() > 30000);
        }
        this.withdrawInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z ? LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin) : LocaleController.getString(R.string.BotStarsWithdrawInfo), new BotStarsActivity$$ExternalSyntheticLambda0(this, 4)), true);
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

    public final void checkStats() {
        ChartData chartData;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(this.currentAccount).getStarsRevenueStats(this.bot_id, false);
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
    public final View createView(Context context) {
        NestedFrameLayout nestedFrameLayout = new NestedFrameLayout(context);
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false);
        this.avatarContainer = chatAvatarContainer;
        boolean z = true;
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
        zzki.m(this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 14));
        ChatAvatarContainer chatAvatarContainer2 = this.avatarContainer;
        int i = Theme.key_player_actionBarTitle;
        chatAvatarContainer2.setTitleColors(Theme.getColor(null, i, false), Theme.getColor(null, Theme.key_player_actionBarSubtitle, false));
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), true);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultSelector, false), false);
        ActionBar actionBar = this.actionBar;
        int i2 = Theme.key_windowBackgroundWhite;
        actionBar.setBackgroundColor(Theme.getColor(null, i2, false));
        this.transactionsLayout = new StarsIntroActivity.StarsTransactionsLayout(context, this.currentAccount, false, this.bot_id, getClassGuid(), getResourceProvider());
        WebActionBar.AnonymousClass1 anonymousClass1 = new WebActionBar.AnonymousClass1(context, 2);
        this.balanceLayout = anonymousClass1;
        anonymousClass1.setOrientation(1);
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
        ?? r1 = new OutlineTextContainerView(context) {
            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                BotStarsActivity botStarsActivity = BotStarsActivity.this;
                WebActionBar.AnonymousClass4 anonymousClass4 = botStarsActivity.balanceEditText;
                if (anonymousClass4 != null && !anonymousClass4.isFocusable()) {
                    botStarsActivity.balanceEditText.setFocusable(true);
                    botStarsActivity.balanceEditText.setFocusableInTouchMode(true);
                    int iFindPositionByItemId = botStarsActivity.listView.findPositionByItemId(1);
                    if (iFindPositionByItemId >= 0 && iFindPositionByItemId < botStarsActivity.listView.adapter.getItemCount()) {
                        botStarsActivity.listView.stopScroll();
                        botStarsActivity.listView.smoothScrollToPosition(iFindPositionByItemId);
                    }
                    botStarsActivity.balanceEditText.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.balanceEditTextContainer = r1;
        r1.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        setLeftPadding(AndroidUtilities.dp(36.0f));
        WebActionBar.AnonymousClass4 anonymousClass4 = new WebActionBar.AnonymousClass4(context, 1);
        this.balanceEditText = anonymousClass4;
        anonymousClass4.setFocusable(false);
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
        this.balanceEditText.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 4));
        this.balanceEditText.addTextChangedListener(new WebActionBar.AnonymousClass5(this, 7));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.balanceEditText, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
        attachEditText(this.balanceEditText);
        addView(linearLayout, LayoutHelper.createFrame(-1, -2, 48));
        this.balanceEditText.setOnEditorActionListener(new RichEditText$$ExternalSyntheticLambda4(this, 2));
        this.balanceLayout.addView(this.balanceEditTextContainer, LayoutHelper.createLinear(-1, -2, 1, 18, 14, 18, 2));
        setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.balanceButtonsLayout = linearLayout2;
        linearLayout2.setOrientation(0);
        ButtonWithCounterView round = new AnonymousClass6(context, 0, getResourceProvider(), z).setRound();
        this.balanceButton = round;
        round.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.balanceButton.setText(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false);
        final int i5 = 0;
        this.balanceButton.setOnClickListener(new View.OnClickListener(this) {
            public final BotStarsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f$0.withdraw();
                        break;
                    default:
                        BotStarsActivity botStarsActivity = this.f$0;
                        if (view.isEnabled() && !botStarsActivity.tonBalanceButton.isLoading()) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.setDelegate(1, new RateCallLayout$$ExternalSyntheticLambda1(16, botStarsActivity, twoStepVerificationActivity));
                            botStarsActivity.tonBalanceButton.setLoading(true);
                            twoStepVerificationActivity.preload(new BotStarsActivity$$ExternalSyntheticLambda11(botStarsActivity, twoStepVerificationActivity, 0));
                            break;
                        }
                        break;
                }
            }
        });
        ButtonWithCounterView round2 = new ButtonWithCounterView(context, true, getResourceProvider()).setRound();
        this.adsButton = round2;
        round2.setEnabled(true);
        this.adsButton.setText(LocaleController.getString(R.string.MonetizationStarsAds), false);
        this.adsButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(4, this, context));
        this.balanceButtonsLayout.addView(this.balanceButton, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        boolean z2 = this.self;
        if (!z2) {
            this.balanceButtonsLayout.addView(new Space(context), LayoutHelper.createLinear(8, 48, 0.0f, 119));
            this.balanceButtonsLayout.addView(this.adsButton, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        }
        this.balanceLayout.addView(this.balanceButtonsLayout, LayoutHelper.createFrame(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        WebActionBar.AnonymousClass1 anonymousClass2 = new WebActionBar.AnonymousClass1(context, 3);
        this.tonBalanceLayout = anonymousClass2;
        anonymousClass2.setOrientation(1);
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
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, this.resourceProvider);
        this.tonBalanceButton = buttonWithCounterView;
        buttonWithCounterView.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.tonBalanceButton.setText(LocaleController.getString(z2 ? R.string.MonetizationSelfWithdraw : R.string.MonetizationWithdraw), false);
        this.tonBalanceButton.setVisibility(8);
        final int i6 = 1;
        this.tonBalanceButton.setOnClickListener(new View.OnClickListener(this) {
            public final BotStarsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        this.f$0.withdraw();
                        break;
                    default:
                        BotStarsActivity botStarsActivity = this.f$0;
                        if (view.isEnabled() && !botStarsActivity.tonBalanceButton.isLoading()) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.setDelegate(1, new RateCallLayout$$ExternalSyntheticLambda1(16, botStarsActivity, twoStepVerificationActivity));
                            botStarsActivity.tonBalanceButton.setLoading(true);
                            twoStepVerificationActivity.preload(new BotStarsActivity$$ExternalSyntheticLambda11(botStarsActivity, twoStepVerificationActivity, 0));
                            break;
                        }
                        break;
                }
            }
        });
        this.tonBalanceLayout.addView(this.tonBalanceButton, LayoutHelper.createFrame(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new GiftSheet$$ExternalSyntheticLambda8(this, 24), new BotStarsActivity$$ExternalSyntheticLambda8(this), new BotStarsActivity$$ExternalSyntheticLambda8(this));
        this.listView = universalRecyclerView;
        universalRecyclerView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        this.listView.setSections();
        nestedFrameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnScrollListener(new StarGiftSheet.AnonymousClass8(this, 12));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.fragmentView = nestedFrameLayout;
        return nestedFrameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.bot_id) {
            checkStats();
        }
    }

    public final void fillItems$8(ArrayList arrayList) {
        int i;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i2;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
        long j = this.bot_id;
        boolean z = this.self;
        int i3 = this.stats_dc;
        int i4 = this.type;
        if (i4 == 0) {
            arrayList.add(UItem.asChart(2, i3, this.revenueChartData));
            arrayList.add(UItem.asShadow(-1, null));
            arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats starsRevenueStats = botStarsController.getStarsRevenueStats(j, false);
            ChannelMonetizationLayout.ProceedOverview proceedOverview = this.totalProceedsValue;
            ChannelMonetizationLayout.ProceedOverview proceedOverview2 = this.totalValue;
            ChannelMonetizationLayout.ProceedOverview proceedOverview3 = this.availableValue;
            if (starsRevenueStats != null && (tL_starsRevenueStatus2 = starsRevenueStats.status) != null) {
                proceedOverview3.contains1 = false;
                proceedOverview3.contains2 = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                proceedOverview3.crypto_amount2 = starsAmount;
                proceedOverview3.crypto_currency2 = "XTR";
                proceedOverview3.currency = "USD";
                double d = starsAmount.amount;
                double d2 = this.rate;
                proceedOverview3.amount2 = (long) (d * d2 * 100.0d);
                proceedOverview2.contains1 = false;
                proceedOverview2.contains2 = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus2.current_balance;
                proceedOverview2.crypto_amount2 = starsAmount2;
                proceedOverview2.crypto_currency2 = "XTR";
                proceedOverview2.amount2 = (long) (starsAmount2.amount * d2 * 100.0d);
                proceedOverview2.currency = "USD";
                proceedOverview.contains1 = false;
                proceedOverview.contains2 = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.overall_revenue;
                proceedOverview.crypto_amount2 = starsAmount3;
                proceedOverview.crypto_currency2 = "XTR";
                proceedOverview.amount2 = (long) (starsAmount3.amount * d2 * 100.0d);
                proceedOverview.currency = "USD";
                setStarsBalance(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                this.balanceButtonsLayout.setVisibility(starsRevenueStats.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(UItem.asProceedOverview(proceedOverview3));
            arrayList.add(UItem.asProceedOverview(proceedOverview2));
            arrayList.add(UItem.asProceedOverview(proceedOverview));
            arrayList.add(UItem.asShadow(-2, LocaleController.getString(z ? R.string.SelfStarsOverviewInfo : R.string.BotStarsOverviewInfo)));
            arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(UItem.asCustom(1, this.balanceLayout));
            arrayList.add(UItem.asShadow(-3, this.withdrawInfo));
            if (z) {
                return;
            }
            if (getMessagesController().starrefConnectAllowed) {
                int color = Theme.getColor(Theme.key_color_green, this.resourceProvider);
                int i5 = R.drawable.filled_earn_stars;
                CharSequence charSequenceApplyNewSpan = ChatEditActivity.applyNewSpan(LocaleController.getString(R.string.BotAffiliateProgramRowTitle));
                String string = LocaleController.getString(R.string.BotAffiliateProgramRowText);
                int i6 = AffiliateProgramFragment.ColorfulTextCell.Factory.$r8$clinit;
                UItem uItemOfFactory = UItem.ofFactory(AffiliateProgramFragment.ColorfulTextCell.Factory.class);
                uItemOfFactory.id = 2;
                uItemOfFactory.intValue = color;
                uItemOfFactory.iconResId = i5;
                uItemOfFactory.text = charSequenceApplyNewSpan;
                uItemOfFactory.subtext = string;
                arrayList.add(uItemOfFactory);
                arrayList.add(UItem.asShadow(-4, null));
            }
            arrayList.add(UItem.asFullscreenCustom(this.transactionsLayout, 0));
            return;
        }
        if (i4 == 1) {
            TLRPC.TL_payments_starsRevenueStats tONRevenueStats = botStarsController.getTONRevenueStats(j, true);
            if (!z) {
                if (this.titleInfo == null) {
                    this.titleInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new BotStarsActivity$$ExternalSyntheticLambda0(this, 2), this.resourceProvider), true);
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
                arrayList.add(UItem.asChart(5, i3, chartViewData));
                arrayList.add(UItem.asShadow(-1, null));
            }
            if (this.revenueChart != null || tONRevenueStats == null) {
                i = 2;
            } else {
                TL_stats.StatsGraph statsGraph = tONRevenueStats.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / tONRevenueStats.usd_rate);
                }
                i = 2;
                this.revenueChart = StatisticActivity.createViewData(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2);
            }
            StatisticActivity.ChartViewData chartViewData2 = this.revenueChart;
            if (chartViewData2 != null && !chartViewData2.isEmpty) {
                arrayList.add(UItem.asChart(i, i3, chartViewData2));
                arrayList.add(UItem.asShadow(-2, null));
            }
            boolean z2 = this.proceedsAvailable;
            ChannelMonetizationLayout.ProceedOverview proceedOverview4 = this.tonLifetimeValue;
            ChannelMonetizationLayout.ProceedOverview proceedOverview5 = this.tonLastWithdrawalValue;
            ChannelMonetizationLayout.ProceedOverview proceedOverview6 = this.tonAvailableValue;
            if (!z2 && tONRevenueStats != null && (tL_starsRevenueStatus = tONRevenueStats.status) != null) {
                double d3 = tONRevenueStats.usd_rate;
                long j2 = tL_starsRevenueStatus.available_balance.amount;
                proceedOverview6.crypto_amount = j2;
                double d4 = j2 / 1.0E9d;
                long j3 = (long) (d4 * d3 * 100.0d);
                proceedOverview6.amount = j3;
                if (this.formatter == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    this.formatter = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i2 = 6;
                    this.formatter.setMaximumFractionDigits(6);
                    this.formatter.setGroupingUsed(false);
                } else {
                    i2 = 6;
                }
                DecimalFormat decimalFormat2 = this.formatter;
                if (d4 > 1.5d) {
                    i2 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ChannelMonetizationLayout.replaceTON("TON " + this.formatter.format(d4), this.tonBalanceTitle.getPaint(), 0.9f, true));
                int iIndexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (iIndexOf >= 0) {
                    spannableStringBuilder.setSpan(this.tonBalanceTitleSizeSpan, iIndexOf, spannableStringBuilder.length(), 33);
                }
                this.tonBalanceTitle.setText(spannableStringBuilder);
                this.tonBalanceSubtitle.setText("≈" + BillingController.getInstance().formatCurrency(j3, "USD"));
                proceedOverview6.currency = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = tONRevenueStats.status;
                long j4 = tL_starsRevenueStatus3.current_balance.amount;
                proceedOverview5.crypto_amount = j4;
                proceedOverview5.amount = (long) ((j4 / 1.0E9d) * d3 * 100.0d);
                proceedOverview5.currency = "USD";
                proceedOverview4.contains1 = true;
                long j5 = tL_starsRevenueStatus3.overall_revenue.amount;
                proceedOverview4.crypto_amount = j5;
                proceedOverview4.amount = (long) ((j5 / 1.0E9d) * d3 * 100.0d);
                proceedOverview4.currency = "USD";
                this.proceedsAvailable = true;
                this.tonBalanceButton.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (this.proceedsAvailable) {
                arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(UItem.asProceedOverview(proceedOverview6));
                arrayList.add(UItem.asProceedOverview(proceedOverview5));
                arrayList.add(UItem.asProceedOverview(proceedOverview4));
                if (this.proceedsInfo == null) {
                    this.proceedsInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new Theme$$ExternalSyntheticLambda19(this, R.string.BotMonetizationProceedsTONInfoLink, 16), this.resourceProvider), true);
                }
                arrayList.add(UItem.asShadow(-4, this.proceedsInfo));
            }
            arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(UItem.asCustom(this.tonBalanceLayout));
            if (this.balanceInfo == null) {
                this.balanceInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled ? R.string.BotMonetizationBalanceInfo : R.string.BotMonetizationBalanceInfoNotAvailable), -1, 3, new BotStarsActivity$$ExternalSyntheticLambda0(this, 3)), true);
            }
            arrayList.add(UItem.asShadow(-5, this.balanceInfo));
            boolean z3 = this.tonTransactionsEndReached;
            ArrayList arrayList2 = this.tonTransactions;
            if (!z3 || !arrayList2.isEmpty()) {
                arrayList.add(UItem.asBlackHeader(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    int i8 = StarsIntroActivity.StarsTransactionView.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(StarsIntroActivity.StarsTransactionView.Factory.class);
                    uItemOfFactory2.object = (TL_stars.StarsTransaction) obj;
                    uItemOfFactory2.accent = true;
                    arrayList.add(uItemOfFactory2);
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

    public final void initWithdraw(boolean z, long j, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        long j2 = this.bot_id;
        if (z) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new BotStarsActivity$$ExternalSyntheticLambda21(this, twoStepVerificationActivity, parentActivity, z, j));
    }

    @Override
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(Theme.getColor(null, Theme.key_windowBackgroundWhite, false)) > 0.721f;
    }

    public final void lambda$createView$7(Context context, View view) {
        if (!view.isEnabled() || this.adsButton.isLoading()) {
            return;
        }
        this.adsButton.setLoading(true);
        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.bot_id);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new StarGiftSheet$$ExternalSyntheticLambda0(18, this, context));
    }

    public final void lambda$fillItems$14() {
        showDialog(ChannelMonetizationLayout.makeLearnSheet(getContext(), true, this.resourceProvider));
    }

    public final void lambda$initWithdraw$23(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j, TLObject tLObject) {
        int i;
        if (tL_error == null) {
            twoStepVerificationActivity.needHideProgress();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                Browser.openUrlInSystemBrowser(getContext(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    this.balanceEditTextAll = true;
                    Browser.openUrlInSystemBrowser(getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new BotStarsActivity$$ExternalSyntheticLambda25(this, twoStepVerificationActivity, z, j, 0), 8);
                return;
            }
            twoStepVerificationActivity.needHideProgress();
            twoStepVerificationActivity.finishFragment();
            BulletinFactory.showError(tL_error);
            return;
        }
        twoStepVerificationActivity.needHideProgress();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        builder.setTitle(LocaleController.getString(R.string.EditAdminTransferAlertTitle));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        TextView textView = new TextView(activity);
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i2, false));
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
        int color = Theme.getColor(null, i2, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(Theme.getColor(null, i2, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.EditAdminTransferAlertText1, textView2);
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
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), mode));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(Theme.getColor(null, i2, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.EditAdminTransferAlertText2, textView3);
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
            builder.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferSetPassword), new BotStarsActivity$$ExternalSyntheticLambda8(this));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(activity);
            textView4.setTextColor(Theme.getColor(null, i2, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i = 3;
            }
            textView4.setGravity(i | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
            builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(builder.create());
    }

    public final void lambda$loadTonTransactions$17(TLObject tLObject, TLRPC.TL_error tL_error) {
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

    public final void lambda$withdraw$11() {
        Bulletin.hideVisible();
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(this.currentAccount).getStarsRevenueStats(this.bot_id, false);
        long j = starsRevenueStats == null ? 0L : starsRevenueStats.status.available_balance.amount;
        if (j < getMessagesController().starsRevenueWithdrawalMin) {
            this.balanceEditTextAll = true;
            this.balanceEditTextValue = j;
        } else {
            this.balanceEditTextAll = false;
            this.balanceEditTextValue = getMessagesController().starsRevenueWithdrawalMin;
        }
        this.balanceEditTextIgnore = true;
        this.balanceEditText.setText(Long.toString(this.balanceEditTextValue));
        WebActionBar.AnonymousClass4 anonymousClass4 = this.balanceEditText;
        anonymousClass4.setSelection(anonymousClass4.getText().length());
        this.balanceEditTextIgnore = false;
        BotStarsActivity$$ExternalSyntheticLambda0 botStarsActivity$$ExternalSyntheticLambda0 = this.setBalanceButtonText;
        AndroidUtilities.cancelRunOnUIThread(botStarsActivity$$ExternalSyntheticLambda0);
        botStarsActivity$$ExternalSyntheticLambda0.run();
    }

    public final void loadTonTransactions() {
        if (this.tonTransactionsLoading || this.tonTransactionsEndReached || this.tonTransactionsLastOffset == null) {
            return;
        }
        this.tonTransactionsLoading = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.bot_id);
        tL_payments_getStarsTransactions.offset = this.tonTransactionsLastOffset;
        tL_payments_getStarsTransactions.limit = this.tonTransactions.isEmpty() ? 5 : 20;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsTransactions, new RichMediaUploader$$ExternalSyntheticLambda0(this, 15));
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        checkStats();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }

    public final void onItemClick$1(UItem uItem) {
        if (uItem.instanceOf(StarsIntroActivity.StarsTransactionView.Factory.class)) {
            TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) uItem.object;
            StarsIntroActivity.showTransactionSheet(getContext(), true, this.bot_id, this.currentAccount, starsTransaction, getResourceProvider());
            return;
        }
        if (uItem.object instanceof TL_stats.BroadcastRevenueTransaction) {
            ChannelMonetizationLayout.showTransactionSheet(getContext(), this.currentAccount, (TL_stats.BroadcastRevenueTransaction) uItem.object, this.bot_id, this.resourceProvider);
        } else if (uItem.id == 2) {
            presentFragment(new ChannelAffiliateProgramsFragment(this.bot_id));
        }
    }

    public final void setStarsBalance(TL_stars.StarsAmount starsAmount, int i) {
        if (this.balanceTitle == null || this.balanceSubtitle == null) {
            return;
        }
        long j = (long) (this.rate * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StarsIntroActivity.replaceStarsWithPlain(false, TextUtils.concat("XTR ", StarsIntroActivity.formatStarsAmount(starsAmount, 0.8f, ' ')), 1.0f, null));
        int iIndexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(this.balanceTitleSizeSpan, iIndexOf, spannableStringBuilder.length(), 33);
        }
        this.balanceTitle.setText(spannableStringBuilder);
        this.balanceSubtitle.setText("≈" + BillingController.getInstance().formatCurrency(j, "USD"));
        setVisibility(j > 0 ? 0 : 8);
        if (this.balanceEditTextAll) {
            this.balanceEditTextIgnore = true;
            WebActionBar.AnonymousClass4 anonymousClass4 = this.balanceEditText;
            long j2 = starsAmount.amount;
            this.balanceEditTextValue = j2;
            anonymousClass4.setText(Long.toString(j2));
            WebActionBar.AnonymousClass4 anonymousClass5 = this.balanceEditText;
            anonymousClass5.setSelection(anonymousClass5.getText().length());
            this.balanceEditTextIgnore = false;
            this.balanceButton.setEnabled(this.balanceEditTextValue > 0);
        }
        this.balanceBlockedUntil = i;
        BotStarsActivity$$ExternalSyntheticLambda0 botStarsActivity$$ExternalSyntheticLambda0 = this.setBalanceButtonText;
        AndroidUtilities.cancelRunOnUIThread(botStarsActivity$$ExternalSyntheticLambda0);
        botStarsActivity$$ExternalSyntheticLambda0.run();
    }

    public final void withdraw() {
        int i = 1;
        if (!this.balanceButton.isEnabled() || this.balanceButton.isLoading()) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        if (this.balanceBlockedUntil > currentTime) {
            this.withdrawalBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.timer_3, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, untilString(this.balanceBlockedUntil - currentTime)))).show();
            return;
        }
        if (this.balanceEditTextValue < getMessagesController().starsRevenueWithdrawalMin) {
            BulletinFactory.of(this).createSimpleBulletin(getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new BotStarsActivity$$ExternalSyntheticLambda0(this, i))).show();
            return;
        }
        long j = this.balanceEditTextValue;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(1, new EmojiThemes$$ExternalSyntheticLambda3(this, j, twoStepVerificationActivity));
        this.balanceButton.setLoading(true);
        twoStepVerificationActivity.preload(new BotStarsActivity$$ExternalSyntheticLambda11(this, twoStepVerificationActivity, i));
    }
}
