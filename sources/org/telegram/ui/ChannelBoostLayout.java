package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.boosts.BoostPagerBottomSheet;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.statistics.GiftedUserCell;
import org.telegram.ui.Components.Premium.boosts.cells.statistics.GiveawayCell;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;

public class ChannelBoostLayout extends FrameLayout {
    private static final int BOOST_VIEW = 4;
    private static final int DIVIDER_TEXT_VIEW_TYPE = 6;
    private static final int DIVIDER_VIEW_TYPE = 2;
    private static final int EMPTY_VIEW_8DP = 7;
    private static final int HEADER_VIEW_TYPE = 1;
    private static final int HEADER_VIEW_TYPE_SMALL = 12;
    private static final int HEADER_VIEW_TYPE_TABS = 13;
    private static final int LINK_VIEW_TYPE = 3;
    private static final int NO_USERS_HINT = 8;
    private static final int OVERVIEW_TYPE = 0;
    private static final int SHOW_BOOST_BY_GIFTS = 10;
    private static final int SHOW_MORE_VIEW_TYPE = 9;
    private static final int SHOW_PREPARED_GIVE_AWAY = 11;
    private static final int TAB_BOOSTS = 0;
    private static final int TAB_GIFTS = 1;
    private static final int USER_VIEW_TYPE = 5;
    AdapterWithDiffUtils adapter;
    private final ArrayList<TL_stories.Boost> boosters;
    TL_stories.TL_premium_boostsStatus boostsStatus;
    private ScrollSlidingTextTabStrip boostsTabs;
    int currentAccount;
    private TLRPC.Chat currentChat;
    private final long dialogId;
    BaseFragment fragment;
    private final ArrayList<TL_stories.Boost> gifts;
    private boolean hasBoostsNext;
    private boolean hasGiftsNext;
    public IBlur3Capture iBlur3Capture;
    private final ArrayList<ItemInternal> items;
    private String lastBoostsOffset;
    private String lastGiftsOffset;
    private int limitBoosts;
    private int limitGifts;
    public final RecyclerListView listView;
    private int nextBoostRemaining;
    private int nextGiftsRemaining;
    private LinearLayout progressLayout;
    private final Theme.ResourcesProvider resourcesProvider;
    private int selectedTab;
    private int totalBoosts;
    private int totalGifts;
    boolean usersLoading;

    public ChannelBoostLayout(BaseFragment baseFragment, long j, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment.getContext());
        this.currentAccount = UserConfig.selectedAccount;
        this.boosters = new ArrayList<>();
        this.gifts = new ArrayList<>();
        this.items = new ArrayList<>();
        this.selectedTab = 0;
        this.adapter = new AdapterWithDiffUtils() {
            private int remTotalBoosts = -1;
            private int remTotalGifts = -1;

            @Override
            public int getItemCount() {
                return ChannelBoostLayout.this.items.size();
            }

            @Override
            public int getItemViewType(int i) {
                return ((ItemInternal) ChannelBoostLayout.this.items.get(i)).viewType;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return ((ItemInternal) ChannelBoostLayout.this.items.get(viewHolder.getAdapterPosition())).selectable;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int i2;
                if (viewHolder.getItemViewType() == 4) {
                    return;
                }
                if (viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 12) {
                    ChartHeaderView chartHeaderView = (ChartHeaderView) viewHolder.itemView;
                    chartHeaderView.setTitle(((ItemInternal) ChannelBoostLayout.this.items.get(i)).title);
                    chartHeaderView.showDate(false);
                    if (viewHolder.getItemViewType() == 12) {
                        chartHeaderView.setPadding(AndroidUtilities.dp(3.0f), chartHeaderView.getPaddingTop(), chartHeaderView.getPaddingRight(), chartHeaderView.getPaddingBottom());
                        return;
                    }
                    return;
                }
                if (viewHolder.getItemViewType() == 0) {
                    StatisticActivity.OverviewCell overviewCell = (StatisticActivity.OverviewCell) viewHolder.itemView;
                    overviewCell.setData(0, Integer.toString(ChannelBoostLayout.this.boostsStatus.level), null, LocaleController.getString(R.string.BoostsLevel2));
                    ChannelBoostLayout channelBoostLayout = ChannelBoostLayout.this;
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = channelBoostLayout.boostsStatus.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            overviewCell.setData(1, "≈" + ((int) ChannelBoostLayout.this.boostsStatus.premium_audience.part), String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChannelBoostLayout.this.isChannel() ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                        } else {
                            if (channelBoostLayout.isChannel()) {
                                i2 = R.string.PremiumSubscribers;
                            } else {
                                i2 = R.string.PremiumMembers;
                            }
                            overviewCell.setData(1, "≈0", "0%", LocaleController.getString(i2));
                        }
                    } else {
                        if (channelBoostLayout.isChannel()) {
                            i2 = R.string.PremiumSubscribers;
                        } else {
                            i2 = R.string.PremiumMembers;
                        }
                        overviewCell.setData(1, "≈0", "0%", LocaleController.getString(i2));
                    }
                    overviewCell.setData(2, String.valueOf(ChannelBoostLayout.this.boostsStatus.boosts), null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ChannelBoostLayout.this.boostsStatus;
                    overviewCell.setData(3, String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
                if (viewHolder.getItemViewType() == 5) {
                    TL_stories.Boost boost = ((ItemInternal) ChannelBoostLayout.this.items.get(i)).booster;
                    TLRPC.User user = MessagesController.getInstance(ChannelBoostLayout.this.currentAccount).getUser(Long.valueOf(boost.user_id));
                    GiftedUserCell giftedUserCell = (GiftedUserCell) viewHolder.itemView;
                    giftedUserCell.setData(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), 0, !((ItemInternal) ChannelBoostLayout.this.items.get(i)).isLast);
                    giftedUserCell.setStatus(boost);
                    giftedUserCell.setAvatarPadding(5);
                    return;
                }
                if (viewHolder.getItemViewType() == 6) {
                    ((TextInfoPrivacyCell) viewHolder.itemView).setText(((ItemInternal) ChannelBoostLayout.this.items.get(i)).title);
                    return;
                }
                if (viewHolder.getItemViewType() == 9) {
                    ManageChatTextCell manageChatTextCell = (ManageChatTextCell) viewHolder.itemView;
                    if (ChannelBoostLayout.this.selectedTab == 0) {
                        manageChatTextCell.setText(LocaleController.formatPluralString("BoostingShowMoreBoosts", ChannelBoostLayout.this.nextBoostRemaining, new Object[0]), null, R.drawable.arrow_more, false);
                        return;
                    } else {
                        manageChatTextCell.setText(LocaleController.formatPluralString("BoostingShowMoreGifts", ChannelBoostLayout.this.nextGiftsRemaining, new Object[0]), null, R.drawable.arrow_more, false);
                        return;
                    }
                }
                if (viewHolder.getItemViewType() == 3) {
                    ((LinkActionView) viewHolder.itemView).setLink(((ItemInternal) ChannelBoostLayout.this.items.get(i)).title);
                    return;
                }
                if (viewHolder.getItemViewType() == 11) {
                    ItemInternal itemInternal = (ItemInternal) ChannelBoostLayout.this.items.get(i);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = itemInternal.prepaidGiveaway;
                    GiveawayCell giveawayCell = (GiveawayCell) viewHolder.itemView;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        giveawayCell.setData(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), 0, !itemInternal.isLast);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        giveawayCell.setData(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), 0, !itemInternal.isLast);
                    }
                    giveawayCell.setImage(prepaidGiveaway);
                    giveawayCell.setAvatarPadding(5);
                    return;
                }
                if (viewHolder.getItemViewType() == 13) {
                    if (this.remTotalBoosts == ChannelBoostLayout.this.totalBoosts && this.remTotalGifts == ChannelBoostLayout.this.totalGifts) {
                        return;
                    }
                    this.remTotalBoosts = ChannelBoostLayout.this.totalBoosts;
                    this.remTotalGifts = ChannelBoostLayout.this.totalGifts;
                    ChannelBoostLayout.this.boostsTabs.removeTabs();
                    ChannelBoostLayout.this.boostsTabs.addTextTab(0, LocaleController.formatPluralString("BoostingBoostsCount", ChannelBoostLayout.this.totalBoosts, new Object[0]));
                    if (MessagesController.getInstance(ChannelBoostLayout.this.currentAccount).giveawayGiftsPurchaseAvailable && ChannelBoostLayout.this.totalGifts > 0 && ChannelBoostLayout.this.totalGifts != ChannelBoostLayout.this.totalBoosts) {
                        ChannelBoostLayout.this.boostsTabs.addTextTab(1, LocaleController.formatPluralString("BoostingGiftsCount", ChannelBoostLayout.this.totalGifts, new Object[0]));
                    }
                    ChannelBoostLayout.this.boostsTabs.setInitialTabId(ChannelBoostLayout.this.selectedTab);
                    ChannelBoostLayout.this.boostsTabs.finishAddingTabs();
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View shadowSectionCell;
                View overviewCell;
                switch (i) {
                    case 0:
                        overviewCell = new StatisticActivity.OverviewCell(ChannelBoostLayout.this.getContext());
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 1:
                        ChartHeaderView chartHeaderView = new ChartHeaderView(ChannelBoostLayout.this.getContext(), null);
                        chartHeaderView.setPadding(chartHeaderView.getPaddingLeft(), AndroidUtilities.dp(16.0f), chartHeaderView.getRight(), AndroidUtilities.dp(16.0f));
                        overviewCell = chartHeaderView;
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 2:
                        shadowSectionCell = new ShadowSectionCell(viewGroup.getContext(), Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                        overviewCell = shadowSectionCell;
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 3:
                        LinkActionView linkActionView = new LinkActionView(ChannelBoostLayout.this.getContext(), ChannelBoostLayout.this.fragment, null, 0L, false, false);
                        linkActionView.hideOptions();
                        linkActionView.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                        overviewCell = linkActionView;
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 4:
                        LimitPreviewView limitPreviewView = new LimitPreviewView(ChannelBoostLayout.this.getContext(), R.drawable.filled_limit_boost, 0, 0, 0.5f, ChannelBoostLayout.this.resourcesProvider);
                        limitPreviewView.isStatistic = true;
                        limitPreviewView.setTag(-33024);
                        limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                        limitPreviewView.setBoosts(ChannelBoostLayout.this.boostsStatus, false);
                        overviewCell = limitPreviewView;
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 5:
                        overviewCell = new GiftedUserCell(ChannelBoostLayout.this.getContext());
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 6:
                        shadowSectionCell = new TextInfoPrivacyCell(viewGroup.getContext(), 20, ChannelBoostLayout.this.resourcesProvider);
                        overviewCell = shadowSectionCell;
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 7:
                        overviewCell = new FixedHeightEmptyCell(ChannelBoostLayout.this.getContext(), 8, 0);
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 8:
                        FrameLayout frameLayout = new FrameLayout(ChannelBoostLayout.this.getContext()) {
                            @Override
                            public void onMeasure(int i2, int i3) {
                                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                            }
                        };
                        TextView textView = new TextView(ChannelBoostLayout.this.getContext());
                        textView.setText(LocaleController.getString(ChannelBoostLayout.this.isChannel() ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                        textView.setTextSize(1, 14.0f);
                        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
                        textView.setGravity(17);
                        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                        overviewCell = frameLayout;
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 9:
                        ManageChatTextCell manageChatTextCell = new ManageChatTextCell(ChannelBoostLayout.this.getContext()) {
                            @Override
                            public int getFullHeight() {
                                return AndroidUtilities.dp(50.0f);
                            }
                        };
                        manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                        overviewCell = manageChatTextCell;
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 10:
                        TextCell textCell = new TextCell(ChannelBoostLayout.this.getContext());
                        textCell.setTextAndIcon((CharSequence) LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), R.drawable.msg_gift_premium, false);
                        textCell.offsetFromImage = 64;
                        int i2 = Theme.key_windowBackgroundWhiteBlueText4;
                        textCell.setColors(i2, i2);
                        overviewCell = textCell;
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 11:
                        overviewCell = new GiveawayCell(ChannelBoostLayout.this.getContext());
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 12:
                        ChartHeaderView chartHeaderView2 = new ChartHeaderView(ChannelBoostLayout.this.getContext(), null);
                        chartHeaderView2.setPadding(chartHeaderView2.getPaddingLeft(), AndroidUtilities.dp(16.0f), chartHeaderView2.getRight(), AndroidUtilities.dp(8.0f));
                        overviewCell = chartHeaderView2;
                        return zzkd.m(overviewCell, overviewCell, -2);
                    case 13:
                        ChannelBoostLayout.this.boostsTabs = new ScrollSlidingTextTabStrip(ChannelBoostLayout.this.fragment.getContext(), ChannelBoostLayout.this.resourcesProvider);
                        ChannelBoostLayout.this.boostsTabs.setColors(Theme.key_profile_tabSelectedLine, Theme.key_profile_tabSelectedText, Theme.key_profile_tabText, Theme.key_profile_tabSelector);
                        FrameLayout frameLayout2 = new FrameLayout(ChannelBoostLayout.this.fragment.getContext()) {
                            private final Paint dividerPaint = new Paint(1);

                            @Override
                            public void dispatchDraw(Canvas canvas) {
                                super.dispatchDraw(canvas);
                                this.dividerPaint.setColor(Theme.getColor(Theme.key_windowBackgroundGray, ChannelBoostLayout.this.resourcesProvider));
                                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), this.dividerPaint);
                            }
                        };
                        ChannelBoostLayout.this.boostsTabs.setDelegate(new ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate() {
                            @Override
                            public final boolean canReorder(int i3) {
                                return ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$canReorder(this, i3);
                            }

                            @Override
                            public void onPageScrolled(float f) {
                            }

                            @Override
                            public void onPageSelected(int i3, boolean z) {
                                ChannelBoostLayout.this.selectedTab = i3;
                                ChannelBoostLayout.this.updateRows(true);
                            }

                            @Override
                            public void onSamePageSelected() {
                            }

                            @Override
                            public final boolean showOptions(int i3, View view) {
                                return ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$showOptions(this, i3, view);
                            }
                        });
                        frameLayout2.addView(ChannelBoostLayout.this.boostsTabs, LayoutHelper.createFrame(-2, 48.0f));
                        overviewCell = frameLayout2;
                        return zzkd.m(overviewCell, overviewCell, -2);
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        };
        this.lastBoostsOffset = "";
        this.lastGiftsOffset = "";
        this.limitGifts = 5;
        this.limitBoosts = 5;
        this.fragment = baseFragment;
        Context context = baseFragment.getContext();
        this.resourcesProvider = resourcesProvider;
        this.dialogId = j;
        this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections(true);
        recyclerListView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
        recyclerListView.setLayoutManager(new LinearLayoutManager(1, false));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setOnItemClickListener(new ChannelBoostLayout$$ExternalSyntheticLambda2(this, context, j, resourcesProvider, baseFragment));
        addView(recyclerListView);
        loadStatistic();
        recyclerListView.setAdapter(this.adapter);
        updateRows(false);
        createEmptyView(getContext());
        this.progressLayout.setAlpha(0.0f);
        this.progressLayout.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        StarsController.getInstance(this.currentAccount, false).getGiveawayOptions();
    }

    public boolean isChannel() {
        return ChatObject.isChannelAndNotMegaGroup(this.currentChat);
    }

    public void lambda$loadOnlyBoosts$7(CountDownLatch countDownLatch, TLObject tLObject, Runnable runnable) {
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (tLObject != null) {
            this.limitBoosts = 20;
            TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject;
            boolean z = false;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_premium_boostsList.users, false);
            this.lastBoostsOffset = tL_premium_boostsList.next_offset;
            this.boosters.addAll(tL_premium_boostsList.boosts);
            ArrayList<TL_stories.Boost> arrayList = this.boosters;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i >= size) {
                    break;
                }
                TL_stories.Boost boost = arrayList.get(i);
                i++;
                int i4 = boost.multiplier;
                if (i4 > 0) {
                    i3 = i4;
                }
                i2 += i3;
            }
            this.nextBoostRemaining = Math.max(0, tL_premium_boostsList.count - i2);
            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && this.nextBoostRemaining > 0) {
                z = true;
            }
            this.hasBoostsNext = z;
            this.totalBoosts = tL_premium_boostsList.count;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void lambda$loadOnlyBoosts$8(CountDownLatch countDownLatch, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChannelBoostLayout$$ExternalSyntheticLambda5(this, countDownLatch, tLObject, runnable, 1));
    }

    public void lambda$loadOnlyGifts$10(CountDownLatch countDownLatch, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChannelBoostLayout$$ExternalSyntheticLambda5(this, countDownLatch, tLObject, runnable, 0));
    }

    public void lambda$loadOnlyGifts$9(CountDownLatch countDownLatch, TLObject tLObject, Runnable runnable) {
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (tLObject != null) {
            this.limitGifts = 20;
            TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject;
            boolean z = false;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_premium_boostsList.users, false);
            this.lastGiftsOffset = tL_premium_boostsList.next_offset;
            this.gifts.addAll(tL_premium_boostsList.boosts);
            ArrayList<TL_stories.Boost> arrayList = this.gifts;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i >= size) {
                    break;
                }
                TL_stories.Boost boost = arrayList.get(i);
                i++;
                int i4 = boost.multiplier;
                if (i4 > 0) {
                    i3 = i4;
                }
                i2 += i3;
            }
            this.nextGiftsRemaining = Math.max(0, tL_premium_boostsList.count - i2);
            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && this.nextGiftsRemaining > 0) {
                z = true;
            }
            this.hasGiftsNext = z;
            this.totalGifts = tL_premium_boostsList.count;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void lambda$loadStatistic$1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.boostsStatus = tL_premium_boostsStatus;
        this.progressLayout.animate().cancel();
        this.progressLayout.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ChannelBoostLayout.this.progressLayout.setVisibility(8);
            }
        });
        updateRows(true);
        loadUsers(null);
    }

    public void lambda$loadStatistic$2(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(27, this, tL_premium_boostsStatus));
    }

    public void lambda$loadUsers$3() {
        this.usersLoading = false;
        updateRows(true);
    }

    public void lambda$loadUsers$4() {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        loadOnlyBoosts(countDownLatch, null);
        loadOnlyGifts(countDownLatch, null);
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        AndroidUtilities.runOnUIThread(new ChannelBoostLayout$$ExternalSyntheticLambda4(this, 0));
    }

    public void lambda$loadUsers$5() {
        this.usersLoading = false;
        updateRows(true);
    }

    public void lambda$loadUsers$6() {
        this.usersLoading = false;
        updateRows(true);
    }

    public void lambda$new$0(Context context, long j, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment, View view, int i) {
        long j2;
        Theme.ResourcesProvider resourcesProvider2;
        if (view instanceof GiftedUserCell) {
            GiftedUserCell giftedUserCell = (GiftedUserCell) view;
            TL_stories.Boost boost = giftedUserCell.getBoost();
            boolean z = boost.giveaway;
            if (!z || boost.stars <= 0) {
                resourcesProvider2 = resourcesProvider;
                j2 = j;
                boolean z2 = boost.gift;
                if (((z2 || z) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-this.currentChat.id);
                    int i2 = boost.date;
                    tL_payments_checkedGiftCode.date = i2;
                    tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                    int i3 = boost.expires - i2;
                    tL_payments_checkedGiftCode.days = i3 / 86400;
                    tL_payments_checkedGiftCode.months = (i3 / 30) / 86400;
                    if (boost.unclaimed) {
                        tL_payments_checkedGiftCode.to_id = -1L;
                        tL_payments_checkedGiftCode.flags = -1;
                    } else {
                        tL_payments_checkedGiftCode.boost = boost;
                    }
                    new GiftInfoBottomSheet(baseFragment, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z && boost.user_id == -1) {
                    Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
                    lottieLayout.setAnimation(R.raw.chats_infotip, 36, 36, new String[0]);
                    lottieLayout.textView.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                    lottieLayout.textView.setSingleLine(false);
                    lottieLayout.textView.setMaxLines(2);
                    Bulletin.make(baseFragment, lottieLayout, 2750).show();
                } else if (!z2 && !z) {
                    baseFragment.presentFragment(ProfileActivity.of(giftedUserCell.getDialogId()));
                }
            } else {
                StarsIntroActivity.showBoostsSheet(context, this.currentAccount, j, boost, resourcesProvider);
                resourcesProvider2 = resourcesProvider;
                j2 = j;
            }
        } else {
            j2 = j;
            resourcesProvider2 = resourcesProvider;
        }
        if (view instanceof TextCell) {
            BoostPagerBottomSheet.show(baseFragment, resourcesProvider2, j2, null);
        }
        if (view instanceof GiveawayCell) {
            BoostPagerBottomSheet.show(baseFragment, resourcesProvider2, j2, ((GiveawayCell) view).getPrepaidGiveaway());
        }
        if (this.items.get(i).viewType == 9) {
            loadUsers(Boolean.valueOf(this.selectedTab == 1));
        }
    }

    private void loadOnlyBoosts(CountDownLatch countDownLatch, Runnable runnable) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.limitBoosts;
        tL_premium_getBoostsList.offset = this.lastBoostsOffset;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_premium_getBoostsList, new ChannelBoostLayout$$ExternalSyntheticLambda1(this, countDownLatch, runnable, 1), 2);
    }

    private void loadOnlyGifts(CountDownLatch countDownLatch, Runnable runnable) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.limitGifts;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.lastGiftsOffset;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_premium_getBoostsList, new ChannelBoostLayout$$ExternalSyntheticLambda1(this, countDownLatch, runnable, 0), 2);
    }

    private void loadStatistic() {
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(this.dialogId, new QrActivity$5$$ExternalSyntheticLambda1(this, 2));
    }

    private void loadUsers(Boolean bool) {
        if (this.usersLoading) {
            return;
        }
        this.usersLoading = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new ChannelBoostLayout$$ExternalSyntheticLambda4(this, 2));
        } else if (bool.booleanValue()) {
            loadOnlyGifts(null, new ChannelBoostLayout$$ExternalSyntheticLambda4(this, 3));
        } else {
            loadOnlyBoosts(null, new ChannelBoostLayout$$ExternalSyntheticLambda4(this, 1));
        }
    }

    public void createEmptyView(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.progressLayout = linearLayout;
        linearLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setAutoRepeat(true);
        rLottieImageView.setAnimation(R.raw.statistic_preload, 120, 120);
        rLottieImageView.playAnimation();
        TextView textView = new TextView(context);
        zzkb.m(20.0f, 1, textView);
        int i = Theme.key_player_actionBarTitle;
        textView.setTextColor(Theme.getColor(null, i, false));
        textView.setTag(Integer.valueOf(i));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i2 = Theme.key_player_actionBarSubtitle;
        textView2.setTextColor(Theme.getColor(null, i2, false));
        textView2.setTag(Integer.valueOf(i2));
        textView2.setText(LocaleController.getString(R.string.LoadingStatsDescription));
        textView2.setGravity(1);
        this.progressLayout.addView(rLottieImageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 20));
        this.progressLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 10));
        this.progressLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1));
        addView(this.progressLayout, LayoutHelper.createFrame(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
    }

    public void updateRows(boolean z) {
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList = new ArrayList<>(this.items);
        this.items.clear();
        if (this.boostsStatus != null) {
            this.items.add(new ItemInternal(4, false));
            this.items.add(new ItemInternal(1, LocaleController.getString(R.string.StatisticOverview)));
            this.items.add(new ItemInternal(0, false));
            this.items.add(new ItemInternal(2, false));
            if (this.boostsStatus.prepaid_giveaways.size() > 0) {
                this.items.add(new ItemInternal(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i = 0;
                while (i < this.boostsStatus.prepaid_giveaways.size()) {
                    this.items.add(new ItemInternal(11, this.boostsStatus.prepaid_giveaways.get(i), i == this.boostsStatus.prepaid_giveaways.size() - 1));
                    i++;
                }
                this.items.add(new ItemInternal(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            this.items.add(new ItemInternal(13, LocaleController.getString(R.string.Boosters)));
            if (this.selectedTab == 0) {
                if (this.boosters.isEmpty()) {
                    this.items.add(new ItemInternal(8, false));
                    this.items.add(new ItemInternal(2, false));
                } else {
                    int i2 = 0;
                    while (i2 < this.boosters.size()) {
                        this.items.add(new ItemInternal(5, this.boosters.get(i2), i2 == this.boosters.size() - 1 && !this.hasBoostsNext, this.selectedTab));
                        i2++;
                    }
                    if (this.hasBoostsNext) {
                        this.items.add(new ItemInternal(9, true));
                    } else {
                        this.items.add(new ItemInternal(7, false));
                    }
                    this.items.add(new ItemInternal(6, LocaleController.getString(isChannel() ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else if (this.gifts.isEmpty()) {
                this.items.add(new ItemInternal(8, false));
                this.items.add(new ItemInternal(2, false));
            } else {
                int i3 = 0;
                while (i3 < this.gifts.size()) {
                    this.items.add(new ItemInternal(5, this.gifts.get(i3), i3 == this.gifts.size() - 1 && !this.hasGiftsNext, this.selectedTab));
                    i3++;
                }
                if (this.hasGiftsNext) {
                    this.items.add(new ItemInternal(9, true));
                } else {
                    this.items.add(new ItemInternal(7, false));
                }
                this.items.add(new ItemInternal(6, LocaleController.getString(isChannel() ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
            }
            this.items.add(new ItemInternal(1, LocaleController.getString(R.string.LinkForBoosting)));
            this.items.add(new ItemInternal(3, this.boostsStatus.boost_url));
            if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(this.currentChat)) {
                this.items.add(new ItemInternal(6, LocaleController.getString(isChannel() ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                this.items.add(new ItemInternal(10, true));
                this.items.add(new ItemInternal(6, LocaleController.getString(isChannel() ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            }
        }
        if (z) {
            this.adapter.setItems(arrayList, this.items);
        } else {
            this.adapter.notifyDataSetChanged();
        }
    }

    public class ItemInternal extends AdapterWithDiffUtils.Item {
        TL_stories.Boost booster;
        boolean isLast;
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        int tab;
        String title;

        public ItemInternal(int i, String str) {
            super(i, false);
            this.title = str;
        }

        public boolean equals(Object obj) {
            TL_stories.PrepaidGiveaway prepaidGiveaway;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ItemInternal itemInternal = (ItemInternal) obj;
            TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.prepaidGiveaway;
            if (prepaidGiveaway2 != null && (prepaidGiveaway = itemInternal.prepaidGiveaway) != null) {
                return prepaidGiveaway2.id == prepaidGiveaway.id && this.isLast == itemInternal.isLast;
            }
            TL_stories.Boost boost = this.booster;
            if (boost == null || itemInternal.booster == null) {
                return true;
            }
            return boost.id.hashCode() == itemInternal.booster.id.hashCode() && this.isLast == itemInternal.isLast && this.tab == itemInternal.tab;
        }

        public int hashCode() {
            return Objects.hash(this.title, this.booster, this.prepaidGiveaway, Boolean.valueOf(this.isLast), Integer.valueOf(this.tab));
        }

        public ItemInternal(int i, TL_stories.Boost boost, boolean z, int i2) {
            super(i, true);
            this.booster = boost;
            this.isLast = z;
            this.tab = i2;
        }

        public ItemInternal(int i, TL_stories.PrepaidGiveaway prepaidGiveaway, boolean z) {
            super(i, true);
            this.prepaidGiveaway = prepaidGiveaway;
            this.isLast = z;
        }

        public ItemInternal(int i, boolean z) {
            super(i, z);
        }
    }
}
