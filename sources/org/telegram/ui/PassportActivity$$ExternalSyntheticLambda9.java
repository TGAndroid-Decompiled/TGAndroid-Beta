package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class PassportActivity$$ExternalSyntheticLambda9 implements RequestDelegate {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda9(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                PassportActivity passportActivity = this.f$0;
                passportActivity.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(29, passportActivity, tLObject));
                break;
            case 1:
                PassportActivity passportActivity2 = this.f$0;
                passportActivity2.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(passportActivity2, tL_error, tLObject, false, 26));
                break;
            case 2:
                PassportActivity passportActivity3 = this.f$0;
                passportActivity3.getClass();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(1, passportActivity3, tL_error));
                break;
            default:
                PassportActivity passportActivity4 = this.f$0;
                passportActivity4.getClass();
                AndroidUtilities.runOnUIThread(new PassportActivity$$ExternalSyntheticLambda14(passportActivity4, 5));
                break;
        }
    }
}
