package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class z implements Runnable {
    public final int f19700a;
    public final AtomicInteger f19701b;
    public final AtomicInteger f19702c;
    public final Runnable d;

    public z(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19700a = i10;
        this.f19701b = atomicInteger;
        this.f19702c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19700a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$11(this.f19701b, this.f19702c, this.d);
                return;
            case 1:
                BillingController.lambda$onPurchasesUpdatedInternal$8(this.f19701b, this.f19702c, this.d);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$9(this.f19701b, this.f19702c, this.d);
                return;
        }
    }
}
