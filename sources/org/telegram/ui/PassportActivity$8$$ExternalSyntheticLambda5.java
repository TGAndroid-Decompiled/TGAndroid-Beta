package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class PassportActivity$8$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final PassportActivity.AnonymousClass8 f$0;
    public final TLRPC.TL_error f$1;

    public PassportActivity$8$$ExternalSyntheticLambda5(PassportActivity.AnonymousClass8 anonymousClass8, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$generateNewSecret$6(this.f$1);
                break;
            default:
                this.f$0.lambda$resetSecret$2(this.f$1);
                break;
        }
    }
}
