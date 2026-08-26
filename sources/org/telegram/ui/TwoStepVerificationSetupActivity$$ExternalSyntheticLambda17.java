package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17 implements RequestDelegate {
    public final int $r8$classId;
    public final TwoStepVerificationSetupActivity f$0;

    public TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationSetupActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda28(this.f$0, tL_error, 0));
                break;
            case 1:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                twoStepVerificationSetupActivity.getClass();
                AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda28(twoStepVerificationSetupActivity, tL_error, 1));
                break;
            case 2:
                final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                twoStepVerificationSetupActivity2.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                twoStepVerificationSetupActivity2.lambda$loadPasswordInfo$41(tLObject, tL_error);
                                break;
                            default:
                                twoStepVerificationSetupActivity2.lambda$processNext$24(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            case 3:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity3 = this.f$0;
                twoStepVerificationSetupActivity3.getClass();
                AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda28(twoStepVerificationSetupActivity3, tL_error, 2));
                break;
            default:
                final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity4 = this.f$0;
                twoStepVerificationSetupActivity4.getClass();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                twoStepVerificationSetupActivity4.lambda$loadPasswordInfo$41(tLObject, tL_error);
                                break;
                            default:
                                twoStepVerificationSetupActivity4.lambda$processNext$24(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
