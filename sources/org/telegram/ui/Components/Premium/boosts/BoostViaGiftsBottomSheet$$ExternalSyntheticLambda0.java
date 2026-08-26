package org.telegram.ui.Components.Premium.boosts;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

public final class BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final BoostViaGiftsBottomSheet f$0;

    public BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = boostViaGiftsBottomSheet;
    }

    @Override
    public final void run() {
        BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.hideKeyboard(boostViaGiftsBottomSheet.recyclerListView);
                break;
            case 1:
                boostViaGiftsBottomSheet.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, boostViaGiftsBottomSheet.currentChat, Boolean.TRUE);
                break;
            case 2:
                boostViaGiftsBottomSheet.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, boostViaGiftsBottomSheet.currentChat, Boolean.FALSE);
                break;
            case 3:
                boostViaGiftsBottomSheet.lambda$updateRows$24();
                break;
            default:
                boostViaGiftsBottomSheet.lambda$updateRows$27();
                break;
        }
    }
}
