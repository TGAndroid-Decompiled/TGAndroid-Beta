package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class z implements Runnable {
    public final int f19088a;
    public final AtomicInteger f19089b;
    public final AtomicInteger f19090c;
    public final Runnable d;

    public z(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19088a = i10;
        this.f19089b = atomicInteger;
        this.f19090c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19088a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$11(this.f19089b, this.f19090c, this.d);
                return;
            case 1:
                BillingController.lambda$onPurchasesUpdatedInternal$8(this.f19089b, this.f19090c, this.d);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$9(this.f19089b, this.f19090c, this.d);
                return;
        }
    }
}
