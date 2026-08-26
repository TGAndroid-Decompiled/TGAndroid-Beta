package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

public final class StarGiftSheet$$ExternalSyntheticLambda171 implements RequestDelegate {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final TwoStepVerificationActivity f$1;

    public StarGiftSheet$$ExternalSyntheticLambda171(StarGiftSheet starGiftSheet, TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
        this.f$1 = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                StarGiftSheet starGiftSheet = this.f$0;
                starGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda173(starGiftSheet, tL_error, this.f$1, tLObject));
                break;
            default:
                StarGiftSheet starGiftSheet2 = this.f$0;
                starGiftSheet2.getClass();
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda173(starGiftSheet2, tL_error, tLObject, this.f$1));
                break;
        }
    }
}
