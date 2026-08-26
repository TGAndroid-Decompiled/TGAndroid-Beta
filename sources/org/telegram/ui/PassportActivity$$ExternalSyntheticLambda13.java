package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class PassportActivity$$ExternalSyntheticLambda13 implements RequestDelegate {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda13(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createManageInterface$19(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$createPasswordInterface$10(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$loadPasswordInfo$4(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$createRequestInterface$15(tLObject, tL_error);
                break;
        }
    }
}
