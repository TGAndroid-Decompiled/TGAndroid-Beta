package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class z implements Runnable {
    public final int f19699a;
    public final AtomicInteger f19700b;
    public final AtomicInteger f19701c;
    public final Runnable d;

    public z(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19699a = i10;
        this.f19700b = atomicInteger;
        this.f19701c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19699a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$11(this.f19700b, this.f19701c, this.d);
                return;
            case 1:
                BillingController.lambda$onPurchasesUpdatedInternal$8(this.f19700b, this.f19701c, this.d);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$9(this.f19700b, this.f19701c, this.d);
                return;
        }
    }
}
