package org.telegram.ui.Components.Premium.boosts;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 implements Utilities.Callback {
    public final int $r8$classId;
    public final BoostViaGiftsBottomSheet f$0;

    public BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = boostViaGiftsBottomSheet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = this.f$0;
                boostViaGiftsBottomSheet.lambda$showGiftOfferSheet$15();
                AndroidUtilities.runOnUIThread(new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0(boostViaGiftsBottomSheet, 2), 220L);
                break;
            case 1:
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet2 = this.f$0;
                boostViaGiftsBottomSheet2.actionBtn.button.setLoading(false);
                BoostDialogs.showToastError(boostViaGiftsBottomSheet2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet3 = this.f$0;
                boostViaGiftsBottomSheet3.getClass();
                boostViaGiftsBottomSheet3.selectedSliderIndex = boostViaGiftsBottomSheet3.sliderValues.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                boostViaGiftsBottomSheet3.updateRows(true, true);
                boostViaGiftsBottomSheet3.updateActionButton(true);
                break;
            case 3:
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet4 = this.f$0;
                boostViaGiftsBottomSheet4.lambda$showGiftOfferSheet$15();
                AndroidUtilities.runOnUIThread(new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda0(boostViaGiftsBottomSheet4, 1), 220L);
                break;
            case 4:
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet5 = this.f$0;
                boostViaGiftsBottomSheet5.actionBtn.button.setLoading(false);
                BoostDialogs.showToastError(boostViaGiftsBottomSheet5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet6 = this.f$0;
                ArrayList arrayList = boostViaGiftsBottomSheet6.giftCodeOptions;
                arrayList.clear();
                arrayList.addAll((List) obj);
                boostViaGiftsBottomSheet6.updateRows(true, true);
                break;
            default:
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet7 = this.f$0;
                boostViaGiftsBottomSheet7.actionBtn.button.setLoading(false);
                BoostDialogs.showToastError(boostViaGiftsBottomSheet7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
