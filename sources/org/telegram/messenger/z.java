package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class z implements Runnable {
    public final int f20191a;
    public final AtomicInteger f20192b;
    public final AtomicInteger f20193c;
    public final Runnable d;

    public z(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20191a = i10;
        this.f20192b = atomicInteger;
        this.f20193c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20191a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$11(this.f20192b, this.f20193c, this.d);
                return;
            case 1:
                BillingController.lambda$onPurchasesUpdatedInternal$8(this.f20192b, this.f20193c, this.d);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$9(this.f20192b, this.f20193c, this.d);
                return;
        }
    }
}
