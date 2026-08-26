package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class PassportActivity$8$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final PassportActivity.AnonymousClass8 f$0;

    public PassportActivity$8$$ExternalSyntheticLambda1(PassportActivity.AnonymousClass8 anonymousClass8, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$resetSecret$3(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$generateNewSecret$5(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$resetSecret$1(tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$generateNewSecret$7(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$run$13(tLObject, tL_error);
                break;
        }
    }
}
