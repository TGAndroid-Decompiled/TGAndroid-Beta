package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import com.stripe.android.Stripe;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.boosts.cells.statistics.GiftedUserCell;
import org.telegram.ui.Components.Premium.boosts.cells.statistics.GiveawayCell;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Stars.StarsController;

public final class ChannelBoostLayout extends FrameLayout {
    public final AnonymousClass1 adapter;
    public final ArrayList boosters;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public ScrollSlidingTextTabStrip boostsTabs;
    public final int currentAccount;
    public final TLRPC.Chat currentChat;
    public final long dialogId;
    public final StatisticActivity fragment;
    public final ArrayList gifts;
    public boolean hasBoostsNext;
    public boolean hasGiftsNext;
    public ViewGroupPartRenderer iBlur3Capture;
    public final ArrayList items;
    public String lastBoostsOffset;
    public String lastGiftsOffset;
    public int limitBoosts;
    public int limitGifts;
    public final RecyclerListView listView;
    public int nextBoostRemaining;
    public int nextGiftsRemaining;
    public final LinearLayout progressLayout;
    public final Theme.ResourcesProvider resourcesProvider;
    public int selectedTab;
    public int totalBoosts;
    public int totalGifts;
    public boolean usersLoading;

    public final class AnonymousClass1 extends AdapterWithDiffUtils {
        public int remTotalBoosts = -1;
        public int remTotalGifts = -1;

        public final class AnonymousClass4 extends ManageChatTextCell {
            @Override
            public final int getFullHeight() {
                return AndroidUtilities.dp(50.0f);
            }
        }

        public AnonymousClass1() {
        }

        @Override
        public final int getItemCount() {
            return ChannelBoostLayout.this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return ((ItemInternal) ChannelBoostLayout.this.items.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return ((ItemInternal) ChannelBoostLayout.this.items.get(viewHolder.getAdapterPosition())).selectable;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int i3;
            int i4 = viewHolder.mItemViewType;
            if (i4 == 4) {
                return;
            }
            ChannelBoostLayout channelBoostLayout = ChannelBoostLayout.this;
            View view = viewHolder.itemView;
            if (i4 == 1 || i4 == 12) {
                ChartHeaderView chartHeaderView = (ChartHeaderView) view;
                chartHeaderView.setTitle(((ItemInternal) channelBoostLayout.items.get(i)).title);
                chartHeaderView.showDate(false);
                if (viewHolder.mItemViewType == 12) {
                    chartHeaderView.setPadding(AndroidUtilities.dp(3.0f), chartHeaderView.getPaddingTop(), chartHeaderView.getPaddingRight(), chartHeaderView.getPaddingBottom());
                    return;
                }
                return;
            }
            if (i4 == 0) {
                StatisticActivity.OverviewCell overviewCell = (StatisticActivity.OverviewCell) view;
                overviewCell.setData(Integer.toString(channelBoostLayout.boostsStatus.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                TL_stats.TL_statsPercentValue tL_statsPercentValue = channelBoostLayout.boostsStatus.premium_audience;
                TLRPC.Chat chat = channelBoostLayout.currentChat;
                if (tL_statsPercentValue != null) {
                    double d = tL_statsPercentValue.total;
                    if (d != 0.0d) {
                        overviewCell.setData("≈" + ((int) channelBoostLayout.boostsStatus.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    } else {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            i3 = R.string.PremiumSubscribers;
                        } else {
                            i3 = R.string.PremiumMembers;
                        }
                        overviewCell.setData("≈0", 1, "0%", LocaleController.getString(i3));
                    }
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i3 = R.string.PremiumSubscribers;
                    } else {
                        i3 = R.string.PremiumMembers;
                    }
                    overviewCell.setData("≈0", 1, "0%", LocaleController.getString(i3));
                }
                overviewCell.setData(String.valueOf(channelBoostLayout.boostsStatus.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = channelBoostLayout.boostsStatus;
                overviewCell.setData(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                return;
            }
            if (i4 == 5) {
                TL_stories.Boost boost = ((ItemInternal) channelBoostLayout.items.get(i)).booster;
                TLRPC.User user = MessagesController.getInstance(channelBoostLayout.currentAccount).getUser(Long.valueOf(boost.user_id));
                GiftedUserCell giftedUserCell = (GiftedUserCell) view;
                giftedUserCell.setData(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((ItemInternal) channelBoostLayout.items.get(i)).isLast);
                giftedUserCell.setStatus(boost);
                giftedUserCell.setAvatarPadding(5);
                return;
            }
            if (i4 == 6) {
                ((TextInfoPrivacyCell) view).setText(((ItemInternal) channelBoostLayout.items.get(i)).title);
                return;
            }
            if (i4 == 9) {
                ManageChatTextCell manageChatTextCell = (ManageChatTextCell) view;
                if (channelBoostLayout.selectedTab == 0) {
                    manageChatTextCell.setText(LocaleController.formatPluralString("BoostingShowMoreBoosts", channelBoostLayout.nextBoostRemaining, new Object[0]), R.drawable.arrow_more, 5, false);
                    return;
                } else {
                    manageChatTextCell.setText(LocaleController.formatPluralString("BoostingShowMoreGifts", channelBoostLayout.nextGiftsRemaining, new Object[0]), R.drawable.arrow_more, 5, false);
                    return;
                }
            }
            if (i4 == 3) {
                ((LinkActionView) view).setLink(((ItemInternal) channelBoostLayout.items.get(i)).title);
                return;
            }
            if (i4 == 11) {
                ItemInternal itemInternal = (ItemInternal) channelBoostLayout.items.get(i);
                TL_stories.PrepaidGiveaway prepaidGiveaway = itemInternal.prepaidGiveaway;
                GiveawayCell giveawayCell = (GiveawayCell) view;
                boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway;
                boolean z2 = itemInternal.isLast;
                if (z) {
                    giveawayCell.setData(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z2);
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                    giveawayCell.setData(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z2);
                }
                giveawayCell.setImage(prepaidGiveaway);
                giveawayCell.setAvatarPadding(5);
                return;
            }
            if (i4 == 13) {
                int i5 = this.remTotalBoosts;
                int i6 = channelBoostLayout.totalBoosts;
                if (i5 == i6 && this.remTotalGifts == channelBoostLayout.totalGifts) {
                    return;
                }
                this.remTotalBoosts = i6;
                this.remTotalGifts = channelBoostLayout.totalGifts;
                channelBoostLayout.boostsTabs.removeTabs();
                channelBoostLayout.boostsTabs.addTextTab(0, LocaleController.formatPluralString("BoostingBoostsCount", channelBoostLayout.totalBoosts, new Object[0]), null);
                if (MessagesController.getInstance(channelBoostLayout.currentAccount).giveawayGiftsPurchaseAvailable && (i2 = channelBoostLayout.totalGifts) > 0 && i2 != channelBoostLayout.totalBoosts) {
                    channelBoostLayout.boostsTabs.addTextTab(1, LocaleController.formatPluralString("BoostingGiftsCount", i2, new Object[0]), null);
                }
                channelBoostLayout.boostsTabs.setInitialTabId(channelBoostLayout.selectedTab);
                channelBoostLayout.boostsTabs.finishAddingTabs();
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            View overviewCell;
            ChannelBoostLayout channelBoostLayout = ChannelBoostLayout.this;
            switch (i) {
                case 0:
                    overviewCell = new StatisticActivity.OverviewCell(channelBoostLayout.getContext(), 2);
                    return zzkl.m(overviewCell, overviewCell);
                case 1:
                    ChartHeaderView chartHeaderView = new ChartHeaderView(channelBoostLayout.getContext(), null);
                    chartHeaderView.setPadding(chartHeaderView.getPaddingLeft(), AndroidUtilities.dp(16.0f), chartHeaderView.getRight(), AndroidUtilities.dp(16.0f));
                    overviewCell = chartHeaderView;
                    return zzkl.m(overviewCell, overviewCell);
                case 2:
                    shadowSectionCell = new ShadowSectionCell(viewGroup.getContext(), Theme.getColor(null, Theme.key_windowBackgroundGray, false), 0);
                    overviewCell = shadowSectionCell;
                    return zzkl.m(overviewCell, overviewCell);
                case 3:
                    LinkActionView linkActionView = new LinkActionView(channelBoostLayout.getContext(), channelBoostLayout.fragment, null, false, false);
                    linkActionView.optionsView.setVisibility(8);
                    linkActionView.linkView.setGravity(17);
                    linkActionView.removeView.setVisibility(8);
                    linkActionView.avatarsContainer.setVisibility(8);
                    linkActionView.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                    overviewCell = linkActionView;
                    return zzkl.m(overviewCell, overviewCell);
                case 4:
                    LimitPreviewView limitPreviewView = new LimitPreviewView(channelBoostLayout.getContext(), R.drawable.filled_limit_boost, 0, 0, 0.5f, channelBoostLayout.resourcesProvider);
                    limitPreviewView.isStatistic = true;
                    limitPreviewView.setTag(-33024);
                    limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                    limitPreviewView.setBoosts(channelBoostLayout.boostsStatus, false);
                    overviewCell = limitPreviewView;
                    return zzkl.m(overviewCell, overviewCell);
                case 5:
                    overviewCell = new GiftedUserCell(channelBoostLayout.getContext());
                    return zzkl.m(overviewCell, overviewCell);
                case 6:
                    shadowSectionCell = new TextInfoPrivacyCell(viewGroup.getContext(), 20, channelBoostLayout.resourcesProvider);
                    overviewCell = shadowSectionCell;
                    return zzkl.m(overviewCell, overviewCell);
                case 7:
                    overviewCell = new FixedHeightEmptyCell(channelBoostLayout.getContext(), 8);
                    return zzkl.m(overviewCell, overviewCell);
                case 8:
                    PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(channelBoostLayout.getContext(), 8);
                    TextView textView = new TextView(channelBoostLayout.getContext());
                    zzkq.m(14.0f, ChatObject.isChannelAndNotMegaGroup(channelBoostLayout.currentChat) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint, textView);
                    zzkr.m(Theme.key_windowBackgroundWhiteGrayText, textView, 17);
                    anonymousClass19.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                    overviewCell = anonymousClass19;
                    return zzkl.m(overviewCell, overviewCell);
                case 9:
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(channelBoostLayout.getContext());
                    anonymousClass4.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    overviewCell = anonymousClass4;
                    return zzkl.m(overviewCell, overviewCell);
                case 10:
                    TextCell textCell = new TextCell(channelBoostLayout.getContext());
                    textCell.setTextAndIcon(R.drawable.msg_gift_premium, (CharSequence) LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                    textCell.offsetFromImage = 64;
                    int i2 = Theme.key_windowBackgroundWhiteBlueText4;
                    textCell.setColors(i2, i2);
                    overviewCell = textCell;
                    return zzkl.m(overviewCell, overviewCell);
                case 11:
                    overviewCell = new GiveawayCell(channelBoostLayout.getContext());
                    return zzkl.m(overviewCell, overviewCell);
                case 12:
                    ChartHeaderView chartHeaderView2 = new ChartHeaderView(channelBoostLayout.getContext(), null);
                    chartHeaderView2.setPadding(chartHeaderView2.getPaddingLeft(), AndroidUtilities.dp(16.0f), chartHeaderView2.getRight(), AndroidUtilities.dp(8.0f));
                    overviewCell = chartHeaderView2;
                    return zzkl.m(overviewCell, overviewCell);
                case 13:
                    ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(channelBoostLayout.fragment.getParentActivity(), channelBoostLayout.resourcesProvider);
                    channelBoostLayout.boostsTabs = scrollSlidingTextTabStrip;
                    int i3 = Theme.key_profile_tabSelectedText;
                    int i4 = Theme.key_profile_tabText;
                    scrollSlidingTextTabStrip.activeTextColorKey = i3;
                    scrollSlidingTextTabStrip.unactiveTextColorKey = i4;
                    scrollSlidingTextTabStrip.updateColors$1();
                    IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, channelBoostLayout.fragment.getParentActivity());
                    channelBoostLayout.boostsTabs.setDelegate(new Stripe.AnonymousClass1(this, 21));
                    anonymousClass1.addView(channelBoostLayout.boostsTabs, LayoutHelper.createFrame(48.0f, -2));
                    overviewCell = anonymousClass1;
                    return zzkl.m(overviewCell, overviewCell);
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public ChannelBoostLayout(StatisticActivity statisticActivity, long j, Theme.ResourcesProvider resourcesProvider) {
        super(statisticActivity.getParentActivity());
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.boosters = new ArrayList();
        this.gifts = new ArrayList();
        this.items = new ArrayList();
        this.selectedTab = 0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.adapter = anonymousClass1;
        this.lastBoostsOffset = "";
        this.lastGiftsOffset = "";
        this.limitGifts = 5;
        this.limitBoosts = 5;
        this.fragment = statisticActivity;
        Activity parentActivity = statisticActivity.getParentActivity();
        this.resourcesProvider = resourcesProvider;
        this.dialogId = j;
        this.currentChat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        RecyclerListView recyclerListView = new RecyclerListView(parentActivity, null);
        this.listView = recyclerListView;
        recyclerListView.setSections(true);
        recyclerListView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
        recyclerListView.setLayoutManager(new LinearLayoutManager(1, false));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        recyclerListView.setItemAnimator(defaultItemAnimator);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setOnItemClickListener(new ChannelBoostLayout$$ExternalSyntheticLambda0(this, parentActivity, j, resourcesProvider, statisticActivity));
        addView(recyclerListView);
        MessagesController.getInstance(i).getBoostsController().getBoostsStats(j, new QrActivity$5$$ExternalSyntheticLambda0(this, 1));
        recyclerListView.setAdapter(anonymousClass1);
        updateRows(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.progressLayout = linearLayout;
        linearLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setAutoRepeat(true);
        rLottieImageView.setAnimation(R.raw.statistic_preload, 120, 120, null);
        rLottieImageView.playAnimation();
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 20.0f);
        textViewM.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_player_actionBarTitle;
        textViewM.setTextColor(Theme.getColor(null, i2, false));
        textViewM.setTag(Integer.valueOf(i2));
        textViewM.setText(LocaleController.getString(R.string.LoadingStats));
        textViewM.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i3 = Theme.key_player_actionBarSubtitle;
        textView.setTextColor(Theme.getColor(null, i3, false));
        textView.setTag(Integer.valueOf(i3));
        zzkg.m(R.string.LoadingStatsDescription, textView, 1);
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 20));
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 10));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1));
        addView(linearLayout, LayoutHelper.createFrame(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        linearLayout.setAlpha(0.0f);
        linearLayout.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        StarsController.getInstance(i, false).getGiveawayOptions();
    }

    public final void loadOnlyBoosts(CountDownLatch countDownLatch, ChannelBoostLayout$$ExternalSyntheticLambda2 channelBoostLayout$$ExternalSyntheticLambda2) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.limitBoosts;
        tL_premium_getBoostsList.offset = this.lastBoostsOffset;
        int i = this.currentAccount;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new BoostsActivity$$ExternalSyntheticLambda7(this, countDownLatch, channelBoostLayout$$ExternalSyntheticLambda2, 8), 2);
    }

    public final void loadOnlyGifts(CountDownLatch countDownLatch, ChannelBoostLayout$$ExternalSyntheticLambda2 channelBoostLayout$$ExternalSyntheticLambda2) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.limitGifts;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.lastGiftsOffset;
        int i = this.currentAccount;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new BoostsActivity$$ExternalSyntheticLambda7(this, countDownLatch, channelBoostLayout$$ExternalSyntheticLambda2, 7), 2);
    }

    public final void loadUsers(Boolean bool) {
        if (this.usersLoading) {
            return;
        }
        this.usersLoading = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new ChannelBoostLayout$$ExternalSyntheticLambda2(this, 0));
        } else if (bool.booleanValue()) {
            loadOnlyGifts(null, new ChannelBoostLayout$$ExternalSyntheticLambda2(this, 1));
        } else {
            loadOnlyBoosts(null, new ChannelBoostLayout$$ExternalSyntheticLambda2(this, 2));
        }
    }

    public final void updateRows(boolean z) {
        ArrayList arrayList = this.items;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.boostsStatus != null) {
            arrayList.add(new ItemInternal(4, false));
            arrayList.add(new ItemInternal(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new ItemInternal(0, false));
            arrayList.add(new ItemInternal(2, false));
            if (this.boostsStatus.prepaid_giveaways.size() > 0) {
                arrayList.add(new ItemInternal(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i = 0;
                while (i < this.boostsStatus.prepaid_giveaways.size()) {
                    arrayList.add(new ItemInternal(this.boostsStatus.prepaid_giveaways.get(i), i == this.boostsStatus.prepaid_giveaways.size() - 1));
                    i++;
                }
                arrayList.add(new ItemInternal(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new ItemInternal(13, LocaleController.getString(R.string.Boosters)));
            int i2 = this.selectedTab;
            TLRPC.Chat chat = this.currentChat;
            if (i2 == 0) {
                ArrayList arrayList3 = this.boosters;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new ItemInternal(8, false));
                    arrayList.add(new ItemInternal(2, false));
                } else {
                    int i3 = 0;
                    while (i3 < arrayList3.size()) {
                        arrayList.add(new ItemInternal((TL_stories.Boost) arrayList3.get(i3), i3 == arrayList3.size() - 1 && !this.hasBoostsNext, this.selectedTab));
                        i3++;
                    }
                    if (this.hasBoostsNext) {
                        arrayList.add(new ItemInternal(9, true));
                    } else {
                        arrayList.add(new ItemInternal(7, false));
                    }
                    arrayList.add(new ItemInternal(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.gifts;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new ItemInternal(8, false));
                    arrayList.add(new ItemInternal(2, false));
                } else {
                    int i4 = 0;
                    while (i4 < arrayList4.size()) {
                        arrayList.add(new ItemInternal((TL_stories.Boost) arrayList4.get(i4), i4 == arrayList4.size() - 1 && !this.hasGiftsNext, this.selectedTab));
                        i4++;
                    }
                    if (this.hasGiftsNext) {
                        arrayList.add(new ItemInternal(9, true));
                    } else {
                        arrayList.add(new ItemInternal(7, false));
                    }
                    arrayList.add(new ItemInternal(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new ItemInternal(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new ItemInternal(3, this.boostsStatus.boost_url));
            if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new ItemInternal(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new ItemInternal(10, true));
                arrayList.add(new ItemInternal(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            }
        }
        AnonymousClass1 anonymousClass1 = this.adapter;
        if (z) {
            anonymousClass1.setItems(arrayList2, arrayList);
        } else {
            anonymousClass1.mObservable.notifyChanged();
        }
    }

    public final class ItemInternal extends AdapterWithDiffUtils.Item {
        public final TL_stories.Boost booster;
        public final boolean isLast;
        public final TL_stories.PrepaidGiveaway prepaidGiveaway;
        public final int tab;
        public final String title;

        public ItemInternal(int i, String str) {
            super(i, false);
            this.title = str;
        }

        public final boolean equals(Object obj) {
            TL_stories.Boost boost;
            TL_stories.PrepaidGiveaway prepaidGiveaway;
            if (this == obj) {
                return true;
            }
            if (obj == null || ItemInternal.class != obj.getClass()) {
                return false;
            }
            ItemInternal itemInternal = (ItemInternal) obj;
            boolean z = this.isLast;
            boolean z2 = itemInternal.isLast;
            TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.prepaidGiveaway;
            if (prepaidGiveaway2 != null && (prepaidGiveaway = itemInternal.prepaidGiveaway) != null) {
                return prepaidGiveaway2.id == prepaidGiveaway.id && z == z2;
            }
            TL_stories.Boost boost2 = this.booster;
            if (boost2 == null || (boost = itemInternal.booster) == null) {
                return true;
            }
            return boost2.id.hashCode() == boost.id.hashCode() && z == z2 && this.tab == itemInternal.tab;
        }

        public final int hashCode() {
            return Objects.hash(this.title, this.booster, this.prepaidGiveaway, Boolean.valueOf(this.isLast), Integer.valueOf(this.tab));
        }

        public ItemInternal(TL_stories.Boost boost, boolean z, int i) {
            super(5, true);
            this.booster = boost;
            this.isLast = z;
            this.tab = i;
        }

        public ItemInternal(TL_stories.PrepaidGiveaway prepaidGiveaway, boolean z) {
            super(11, true);
            this.prepaidGiveaway = prepaidGiveaway;
            this.isLast = z;
        }
    }
}
