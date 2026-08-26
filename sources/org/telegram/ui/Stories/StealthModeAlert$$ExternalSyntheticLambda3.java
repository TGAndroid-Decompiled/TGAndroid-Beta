package org.telegram.ui.Stories;

import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.recorder.DualCameraView;

public final class StealthModeAlert$$ExternalSyntheticLambda3 implements RequestDelegate {
    public final int $r8$classId;

    public StealthModeAlert$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    private final void run$org$telegram$ui$Stars$StarsController$GiftsList$$ExternalSyntheticLambda2(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i = 24;
        int i2 = 4;
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(22));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(i2));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(i2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(i2));
                break;
            case 4:
                break;
            case 5:
                Comparator comparator = StoriesController.storiesComparator;
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(i));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(i));
                break;
            default:
                int[] iArr = DualCameraView.dualWhitelistByDevice;
                break;
        }
    }
}
