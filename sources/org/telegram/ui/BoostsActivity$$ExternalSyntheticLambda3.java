package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class BoostsActivity$$ExternalSyntheticLambda3 implements RequestDelegate {
    public final int $r8$classId;
    public final BoostsActivity f$0;
    public final CountDownLatch f$1;
    public final Runnable f$2;

    public BoostsActivity$$ExternalSyntheticLambda3(BoostsActivity boostsActivity, CountDownLatch countDownLatch, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = boostsActivity;
        this.f$1 = countDownLatch;
        this.f$2 = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadOnlyGifts$11(this.f$1, this.f$2, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadOnlyBoosts$9(this.f$1, this.f$2, tLObject, tL_error);
                break;
        }
    }
}
