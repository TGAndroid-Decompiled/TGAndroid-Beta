package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class StarsController$$ExternalSyntheticLambda23 implements RequestDelegate {
    public final int $r8$classId;
    public final StarsController f$0;

    public StarsController$$ExternalSyntheticLambda23(StarsController starsController, int i) {
        this.$r8$classId = i;
        this.f$0 = starsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda48(this.f$0, tLObject, 0));
                break;
            case 1:
                StarsController starsController = this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda48(starsController, tLObject, 1));
                break;
            case 2:
                StarsController starsController2 = this.f$0;
                starsController2.getClass();
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda48(starsController2, tLObject, 2));
                break;
            case 3:
                StarsController starsController3 = this.f$0;
                starsController3.getClass();
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda48(starsController3, tLObject, 3));
                break;
            default:
                StarsController starsController4 = this.f$0;
                starsController4.getClass();
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda48(starsController4, tLObject, 4));
                break;
        }
    }
}
