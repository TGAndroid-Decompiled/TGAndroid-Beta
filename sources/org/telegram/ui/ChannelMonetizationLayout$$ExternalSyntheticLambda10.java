package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda10 implements Utilities.Callback5, Utilities.Callback5Return, AlertDialog.OnButtonClickListener {
    public final ChannelMonetizationLayout f$0;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda10(ChannelMonetizationLayout channelMonetizationLayout) {
        this.f$0 = channelMonetizationLayout;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ChannelMonetizationLayout channelMonetizationLayout = this.f$0;
        channelMonetizationLayout.getClass();
        channelMonetizationLayout.fragment.presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ChannelMonetizationLayout channelMonetizationLayout = this.f$0;
        channelMonetizationLayout.getClass();
        int i = ((UItem) obj).id;
        long j = channelMonetizationLayout.dialogId;
        if (i != 1) {
            if (i == 4) {
                channelMonetizationLayout.fragment.presentFragment(new ChannelAffiliateProgramsFragment(j));
                return;
            }
            return;
        }
        int i2 = channelMonetizationLayout.currentBoostLevel;
        int i3 = channelMonetizationLayout.currentAccount;
        if (i2 >= MessagesController.getInstance(i3).channelRestrictSponsoredLevelMin) {
            channelMonetizationLayout.switchOffValue = !channelMonetizationLayout.switchOffValue;
            ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda3 = channelMonetizationLayout.sendCpmUpdateRunnable;
            AndroidUtilities.cancelRunOnUIThread(channelMonetizationLayout$$ExternalSyntheticLambda3);
            AndroidUtilities.runOnUIThread(channelMonetizationLayout$$ExternalSyntheticLambda3, 1000L);
            channelMonetizationLayout.listView.adapter.update(true);
            return;
        }
        if (channelMonetizationLayout.boostsStatus == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(30, channelMonetizationLayout.currentAccount, channelMonetizationLayout.getContext(), channelMonetizationLayout.fragment, channelMonetizationLayout.resourcesProvider);
        limitReachedBottomSheet.dialogId = j;
        limitReachedBottomSheet.updateRows$7();
        limitReachedBottomSheet.boostsStatus = channelMonetizationLayout.boostsStatus;
        limitReachedBottomSheet.isCurrentChat = true;
        limitReachedBottomSheet.updateRows$7();
        MessagesController.getInstance(i3).getBoostsController().userCanBoostChannel(j, channelMonetizationLayout.boostsStatus, new ChatActivity$$ExternalSyntheticLambda335(3, channelMonetizationLayout, limitReachedBottomSheet));
    }
}
