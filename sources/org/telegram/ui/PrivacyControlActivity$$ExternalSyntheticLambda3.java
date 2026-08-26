package org.telegram.ui;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class PrivacyControlActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final PrivacyControlActivity f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;
    public final AtomicInteger f$3;

    public PrivacyControlActivity$$ExternalSyntheticLambda3(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger, int i) {
        this.$r8$classId = i;
        this.f$0 = privacyControlActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = atomicInteger;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$applyCurrentPrivacySettings$18(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$applyCurrentPrivacySettings$20(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
