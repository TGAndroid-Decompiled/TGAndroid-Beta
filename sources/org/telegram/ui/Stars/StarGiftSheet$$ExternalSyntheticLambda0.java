package org.telegram.ui.Stars;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

public final class StarGiftSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 0;
    public final StarGiftSheet f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;
    public final TwoStepVerificationActivity f$3;

    public StarGiftSheet$$ExternalSyntheticLambda0(StarGiftSheet starGiftSheet, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f$0 = starGiftSheet;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StarGiftSheet starGiftSheet = this.f$0;
                starGiftSheet.getClass();
                if (this.f$1 == null) {
                    TL_account.Password password = (TL_account.Password) this.f$2;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.f$3;
                    twoStepVerificationActivity.currentPassword = password;
                    TwoStepVerificationActivity.initPasswordNewAlgo(password);
                    starGiftSheet.initTONTransfer(twoStepVerificationActivity, twoStepVerificationActivity.getNewSrpPassword());
                }
                break;
            default:
                this.f$0.lambda$initTONTransfer$154(this.f$1, this.f$3, this.f$2);
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda0(StarGiftSheet starGiftSheet, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f$0 = starGiftSheet;
        this.f$1 = tL_error;
        this.f$3 = twoStepVerificationActivity;
        this.f$2 = tLObject;
    }
}
