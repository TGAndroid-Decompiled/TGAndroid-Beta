package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_booster;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_statsPercentValue;
import org.telegram.tgnet.TLRPC$TL_stories_boostersList;
import org.telegram.tgnet.TLRPC$TL_stories_boostsStatus;
import org.telegram.tgnet.TLRPC$TL_stories_getBoostersList;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.ChannelBoostUtilities;
public class ChannelBoostLayout extends FrameLayout {
    AdapterWithDiffUtils adapter;
    ArrayList<TLRPC$TL_booster> boosters;
    TLRPC$TL_stories_boostsStatus boostsStatus;
    int currentAccount;
    private final long dialogId;
    BaseFragment fragment;
    boolean hasNext;
    ArrayList<ItemInternal> items;
    RecyclerListView listView;
    int nextRemaining;
    private LinearLayout progressLayout;
    private final Theme.ResourcesProvider resourcesProvider;
    boolean usersLoading;

    public ChannelBoostLayout(final BaseFragment baseFragment, long j, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment.getContext());
        this.currentAccount = UserConfig.selectedAccount;
        this.boosters = new ArrayList<>();
        this.items = new ArrayList<>();
        this.adapter = new AdapterWithDiffUtils() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return ChannelBoostLayout.this.items.get(viewHolder.getAdapterPosition()).selectable;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View shadowSectionCell;
                ManageChatTextCell manageChatTextCell;
                switch (i) {
                    case 0:
                        manageChatTextCell = new StatisticActivity.OverviewCell(ChannelBoostLayout.this.getContext());
                        break;
                    case 1:
                        View chartHeaderView = new ChartHeaderView(ChannelBoostLayout.this.getContext());
                        chartHeaderView.setPadding(chartHeaderView.getPaddingLeft(), AndroidUtilities.dp(16.0f), chartHeaderView.getRight(), AndroidUtilities.dp(16.0f));
                        manageChatTextCell = chartHeaderView;
                        break;
                    case 2:
                        shadowSectionCell = new ShadowSectionCell(viewGroup.getContext(), 12, Theme.getColor(Theme.key_windowBackgroundGray));
                        manageChatTextCell = shadowSectionCell;
                        break;
                    case 3:
                        LinkActionView linkActionView = new LinkActionView(ChannelBoostLayout.this.getContext(), ChannelBoostLayout.this.fragment, null, 0L, false, false);
                        linkActionView.hideOptions();
                        ChannelBoostLayout channelBoostLayout = ChannelBoostLayout.this;
                        linkActionView.setLink(ChannelBoostUtilities.createLink(channelBoostLayout.currentAccount, channelBoostLayout.dialogId));
                        linkActionView.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                        manageChatTextCell = linkActionView;
                        break;
                    case 4:
                        LimitPreviewView limitPreviewView = new LimitPreviewView(ChannelBoostLayout.this.getContext(), R.drawable.filled_limit_boost, 10, 0, ChannelBoostLayout.this.resourcesProvider);
                        limitPreviewView.isStatistic = true;
                        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawable(ChannelBoostLayout.this.getContext(), R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, ChannelBoostLayout.this.resourcesProvider)), 0, 0);
                        combinedDrawable.setFullsize(true);
                        limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                        limitPreviewView.setBackground(combinedDrawable);
                        limitPreviewView.setBoosts(ChannelBoostLayout.this.boostsStatus, false);
                        manageChatTextCell = limitPreviewView;
                        break;
                    case 5:
                        manageChatTextCell = new UserCell(ChannelBoostLayout.this.getContext(), 0, 0, false);
                        break;
                    case 6:
                        shadowSectionCell = new TextInfoPrivacyCell(viewGroup.getContext(), 12, ChannelBoostLayout.this.resourcesProvider);
                        CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawable(ChannelBoostLayout.this.getContext(), R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, ChannelBoostLayout.this.resourcesProvider)), 0, 0);
                        combinedDrawable2.setFullsize(true);
                        shadowSectionCell.setBackground(combinedDrawable2);
                        manageChatTextCell = shadowSectionCell;
                        break;
                    case 7:
                        manageChatTextCell = new FixedHeightEmptyCell(ChannelBoostLayout.this.getContext(), 8);
                        break;
                    case 8:
                        FrameLayout frameLayout = new FrameLayout(this, ChannelBoostLayout.this.getContext()) {
                            @Override
                            protected void onMeasure(int i2, int i3) {
                                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                            }
                        };
                        TextView textView = new TextView(ChannelBoostLayout.this.getContext());
                        textView.setText(LocaleController.getString("NoBoostersHint", R.string.NoBoostersHint));
                        textView.setTextSize(1, 14.0f);
                        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
                        textView.setGravity(17);
                        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 7.0f, 0.0f, 0.0f));
                        manageChatTextCell = frameLayout;
                        break;
                    case 9:
                        ManageChatTextCell manageChatTextCell2 = new ManageChatTextCell(ChannelBoostLayout.this.getContext());
                        manageChatTextCell2.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                        manageChatTextCell = manageChatTextCell2;
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                manageChatTextCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(manageChatTextCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                TLRPC$TL_booster tLRPC$TL_booster;
                if (viewHolder.getItemViewType() == 4) {
                    return;
                }
                if (viewHolder.getItemViewType() == 1) {
                    ChartHeaderView chartHeaderView = (ChartHeaderView) viewHolder.itemView;
                    chartHeaderView.setTitle(ChannelBoostLayout.this.items.get(i).title);
                    chartHeaderView.showDate(false);
                } else if (viewHolder.getItemViewType() == 0) {
                    StatisticActivity.OverviewCell overviewCell = (StatisticActivity.OverviewCell) viewHolder.itemView;
                    overviewCell.setData(0, Integer.toString(ChannelBoostLayout.this.boostsStatus.level), null, LocaleController.getString("BoostsLevel2", R.string.BoostsLevel2));
                    TLRPC$TL_statsPercentValue tLRPC$TL_statsPercentValue = ChannelBoostLayout.this.boostsStatus.premium_audience;
                    if (tLRPC$TL_statsPercentValue != null || tLRPC$TL_statsPercentValue.total == 0.0d) {
                        StringBuilder sb = new StringBuilder();
                        Locale locale = Locale.US;
                        TLRPC$TL_statsPercentValue tLRPC$TL_statsPercentValue2 = ChannelBoostLayout.this.boostsStatus.premium_audience;
                        sb.append(String.format(locale, "%.1f", Float.valueOf(((float) tLRPC$TL_statsPercentValue2.part) / ((float) tLRPC$TL_statsPercentValue2.total))));
                        sb.append("%");
                        overviewCell.setData(1, "~" + ((int) ChannelBoostLayout.this.boostsStatus.premium_audience.part), sb.toString(), LocaleController.getString("PremiumSubscribers", R.string.PremiumSubscribers));
                    } else {
                        overviewCell.setData(1, "~0", "0%", LocaleController.getString("PremiumSubscribers", R.string.PremiumSubscribers));
                    }
                    overviewCell.setData(2, String.valueOf(ChannelBoostLayout.this.boostsStatus.boosts), null, LocaleController.getString("BoostsExisting", R.string.BoostsExisting));
                    TLRPC$TL_stories_boostsStatus tLRPC$TL_stories_boostsStatus = ChannelBoostLayout.this.boostsStatus;
                    overviewCell.setData(3, String.valueOf(tLRPC$TL_stories_boostsStatus.next_level_boosts - tLRPC$TL_stories_boostsStatus.boosts), null, LocaleController.getString("BoostsToLevel", R.string.BoostsToLevel));
                } else if (viewHolder.getItemViewType() == 5) {
                    TLRPC$User user = MessagesController.getInstance(ChannelBoostLayout.this.currentAccount).getUser(Long.valueOf(ChannelBoostLayout.this.items.get(i).booster.user_id));
                    ((UserCell) viewHolder.itemView).setData(user, ContactsController.formatName(user), LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(tLRPC$TL_booster.expires)), 0);
                } else if (viewHolder.getItemViewType() == 6) {
                    ((TextInfoPrivacyCell) viewHolder.itemView).setText(ChannelBoostLayout.this.items.get(i).title);
                } else if (viewHolder.getItemViewType() == 9) {
                    ((ManageChatTextCell) viewHolder.itemView).setText(LocaleController.formatPluralString("ShowVotes", ChannelBoostLayout.this.nextRemaining, new Object[0]), null, R.drawable.arrow_more, false);
                }
            }

            @Override
            public int getItemCount() {
                return ChannelBoostLayout.this.items.size();
            }

            @Override
            public int getItemViewType(int i) {
                return ChannelBoostLayout.this.items.get(i).viewType;
            }
        };
        this.fragment = baseFragment;
        Context context = baseFragment.getContext();
        this.resourcesProvider = resourcesProvider;
        this.dialogId = j;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(context));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                ChannelBoostLayout.this.lambda$new$0(baseFragment, view, i);
            }
        });
        addView(this.listView);
        loadStatistic();
        this.listView.setAdapter(this.adapter);
        updateRows(false);
        createEmptyView(getContext());
        this.progressLayout.setAlpha(0.0f);
        this.progressLayout.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
    }

    public void lambda$new$0(BaseFragment baseFragment, View view, int i) {
        if (view instanceof UserCell) {
            baseFragment.presentFragment(ProfileActivity.of(((UserCell) view).getDialogId()));
        }
        if (this.items.get(i).viewType == 9) {
            loadUsers();
        }
    }

    private void updateRows(boolean z) {
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList = new ArrayList<>(this.items);
        this.items.clear();
        if (this.boostsStatus != null) {
            this.items.add(new ItemInternal(this, 4, false));
            this.items.add(new ItemInternal(this, 1, LocaleController.getString("StatisticOverview", R.string.StatisticOverview)));
            this.items.add(new ItemInternal(this, 0, true));
            this.items.add(new ItemInternal(this, 2, false));
            this.items.add(new ItemInternal(this, 1, LocaleController.getString("Boosters", R.string.Boosters)));
            if (this.boosters.isEmpty()) {
                this.items.add(new ItemInternal(this, 8, false));
                this.items.add(new ItemInternal(this, 2, false));
            } else {
                for (int i = 0; i < this.boosters.size(); i++) {
                    this.items.add(new ItemInternal(this, 5, this.boosters.get(i)));
                }
                if (this.hasNext) {
                    this.items.add(new ItemInternal(this, 9, false));
                } else {
                    this.items.add(new ItemInternal(this, 7, false));
                }
                this.items.add(new ItemInternal(this, 6, LocaleController.getString("BoostersInfoDescription", R.string.BoostersInfoDescription)));
            }
            this.items.add(new ItemInternal(this, 1, LocaleController.getString("LinkForBoosting", R.string.LinkForBoosting)));
            this.items.add(new ItemInternal(this, 3, false));
        }
        if (z) {
            this.adapter.setItems(arrayList, this.items);
        } else {
            this.adapter.notifyDataSetChanged();
        }
    }

    public void lambda$loadStatistic$2(final TLRPC$TL_stories_boostsStatus tLRPC$TL_stories_boostsStatus) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelBoostLayout.this.lambda$loadStatistic$1(tLRPC$TL_stories_boostsStatus);
            }
        });
    }

    private void loadStatistic() {
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(this.dialogId, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChannelBoostLayout.this.lambda$loadStatistic$2((TLRPC$TL_stories_boostsStatus) obj);
            }
        });
    }

    public void lambda$loadStatistic$1(TLRPC$TL_stories_boostsStatus tLRPC$TL_stories_boostsStatus) {
        this.boostsStatus = tLRPC$TL_stories_boostsStatus;
        this.progressLayout.animate().cancel();
        this.progressLayout.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ChannelBoostLayout.this.progressLayout.setVisibility(8);
            }
        });
        updateRows(true);
        loadUsers();
    }

    private void loadUsers() {
        if (this.usersLoading) {
            return;
        }
        this.usersLoading = true;
        TLRPC$TL_stories_getBoostersList tLRPC$TL_stories_getBoostersList = new TLRPC$TL_stories_getBoostersList();
        tLRPC$TL_stories_getBoostersList.limit = 25;
        tLRPC$TL_stories_getBoostersList.offset = "";
        tLRPC$TL_stories_getBoostersList.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_stories_getBoostersList, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelBoostLayout.this.lambda$loadUsers$4(tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$loadUsers$4(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelBoostLayout.this.lambda$loadUsers$3(tLObject);
            }
        });
    }

    public void lambda$loadUsers$3(TLObject tLObject) {
        boolean z = false;
        this.usersLoading = false;
        if (tLObject != null) {
            TLRPC$TL_stories_boostersList tLRPC$TL_stories_boostersList = (TLRPC$TL_stories_boostersList) tLObject;
            this.boosters.addAll(tLRPC$TL_stories_boostersList.boosters);
            if (!TextUtils.isEmpty(tLRPC$TL_stories_boostersList.next_offset) && this.boosters.size() < tLRPC$TL_stories_boostersList.count) {
                z = true;
            }
            this.hasNext = z;
            this.nextRemaining = tLRPC$TL_stories_boostersList.count - this.boosters.size();
            updateRows(true);
        }
    }

    public class ItemInternal extends AdapterWithDiffUtils.Item {
        TLRPC$TL_booster booster;
        String title;

        public ItemInternal(ChannelBoostLayout channelBoostLayout, int i, String str) {
            super(i, false);
            this.title = str;
        }

        public ItemInternal(ChannelBoostLayout channelBoostLayout, int i, TLRPC$TL_booster tLRPC$TL_booster) {
            super(i, false);
            this.booster = tLRPC$TL_booster;
        }

        public ItemInternal(ChannelBoostLayout channelBoostLayout, int i, boolean z) {
            super(i, z);
        }

        public boolean equals(Object obj) {
            TLRPC$TL_booster tLRPC$TL_booster;
            if (this == obj) {
                return true;
            }
            if (obj == null || ItemInternal.class != obj.getClass()) {
                return false;
            }
            ItemInternal itemInternal = (ItemInternal) obj;
            TLRPC$TL_booster tLRPC$TL_booster2 = this.booster;
            return tLRPC$TL_booster2 == null || (tLRPC$TL_booster = itemInternal.booster) == null || tLRPC$TL_booster2.user_id == tLRPC$TL_booster.user_id;
        }

        public int hashCode() {
            return Objects.hash(this.title, this.booster);
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
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        int i = Theme.key_player_actionBarTitle;
        textView.setTextColor(Theme.getColor(i));
        textView.setTag(Integer.valueOf(i));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i2 = Theme.key_player_actionBarSubtitle;
        textView2.setTextColor(Theme.getColor(i2));
        textView2.setTag(Integer.valueOf(i2));
        textView2.setText(LocaleController.getString("LoadingStatsDescription", R.string.LoadingStatsDescription));
        textView2.setGravity(1);
        this.progressLayout.addView(rLottieImageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 20));
        this.progressLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 10));
        this.progressLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1));
        addView(this.progressLayout, LayoutHelper.createFrame(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
    }
}
