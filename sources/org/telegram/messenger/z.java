package org.telegram.messenger;
public final class z implements Runnable {
    public final int f18199a;
    public final BillingController f18200b;

    public z(BillingController billingController, int i10) {
        this.f18199a = i10;
        this.f18200b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18199a) {
            case 0:
                this.f18200b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f18200b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
