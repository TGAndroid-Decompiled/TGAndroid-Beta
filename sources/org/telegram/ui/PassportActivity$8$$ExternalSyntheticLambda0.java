package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class PassportActivity$8$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final PassportActivity.AnonymousClass8 f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;

    public PassportActivity$8$$ExternalSyntheticLambda0(TLObject tLObject, TLRPC.TL_error tL_error, PassportActivity.AnonymousClass8 anonymousClass8) {
        this.$r8$classId = 2;
        this.f$0 = anonymousClass8;
        this.f$2 = tLObject;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$resetSecret$0(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$generateNewSecret$4(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$run$12(this.f$2, this.f$1);
                break;
        }
    }

    public PassportActivity$8$$ExternalSyntheticLambda0(PassportActivity.AnonymousClass8 anonymousClass8, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }
}
