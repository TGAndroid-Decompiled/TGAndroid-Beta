package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.LongSparseArray;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostPagerBottomSheet;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.statistics.GiftedUserCell;
import org.telegram.ui.Components.Premium.boosts.cells.statistics.GiveawayCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class ChannelBoostLayout$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId = 0;
    public final KeyEvent.Callback f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;

    public ChannelBoostLayout$$ExternalSyntheticLambda0(ChannelBoostLayout channelBoostLayout, Activity activity, long j, Theme.ResourcesProvider resourcesProvider, StatisticActivity statisticActivity) {
        this.f$0 = channelBoostLayout;
        this.f$1 = activity;
        this.f$2 = j;
        this.f$3 = resourcesProvider;
        this.f$4 = statisticActivity;
    }

    @Override
    public final void onItemClick(int i, View view) {
        switch (this.$r8$classId) {
            case 0:
                ChannelBoostLayout channelBoostLayout = (ChannelBoostLayout) this.f$0;
                channelBoostLayout.getClass();
                boolean z = view instanceof GiftedUserCell;
                StatisticActivity statisticActivity = (StatisticActivity) this.f$4;
                long j = this.f$2;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$3;
                if (z) {
                    GiftedUserCell giftedUserCell = (GiftedUserCell) view;
                    TL_stories.Boost boost = giftedUserCell.getBoost();
                    boolean z2 = boost.giveaway;
                    if (!z2 || boost.stars <= 0) {
                        boolean z3 = boost.gift;
                        if (((z3 || z2) && boost.user_id >= 0) || boost.unclaimed) {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-channelBoostLayout.currentChat.id);
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
                            new GiftInfoBottomSheet(statisticActivity, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z2 && boost.user_id == -1) {
                            Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(statisticActivity.getParentActivity(), statisticActivity.getResourceProvider());
                            lottieLayout.setAnimation(R.raw.chats_infotip, 36, 36, new String[0]);
                            lottieLayout.textView.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            lottieLayout.textView.setSingleLine(false);
                            lottieLayout.textView.setMaxLines(2);
                            Bulletin.make(statisticActivity, lottieLayout, 2750).show();
                        } else if (!z3 && !z2) {
                            statisticActivity.presentFragment(ProfileActivity.of(giftedUserCell.getDialogId()));
                        }
                    } else {
                        StarsIntroActivity.showBoostsSheet((Activity) this.f$1, channelBoostLayout.currentAccount, j, boost, resourcesProvider);
                    }
                }
                if (view instanceof TextCell) {
                    BoostPagerBottomSheet.show(statisticActivity, resourcesProvider, j, null);
                }
                if (view instanceof GiveawayCell) {
                    BoostPagerBottomSheet.show(statisticActivity, resourcesProvider, j, ((GiveawayCell) view).getPrepaidGiveaway());
                }
                if (((ChannelBoostLayout.ItemInternal) channelBoostLayout.items.get(i)).viewType == 9) {
                    channelBoostLayout.loadUsers(Boolean.valueOf(channelBoostLayout.selectedTab == 1));
                }
                break;
            default:
                ((InviteMembersBottomSheet) this.f$0).lambda$new$0(this.f$2, (BaseFragment) this.f$1, (LongSparseArray) this.f$3, (Context) this.f$4, i);
                break;
        }
    }

    public ChannelBoostLayout$$ExternalSyntheticLambda0(InviteMembersBottomSheet inviteMembersBottomSheet, long j, BaseFragment baseFragment, LongSparseArray longSparseArray, Context context) {
        this.f$0 = inviteMembersBottomSheet;
        this.f$2 = j;
        this.f$1 = baseFragment;
        this.f$3 = longSparseArray;
        this.f$4 = context;
    }
}
