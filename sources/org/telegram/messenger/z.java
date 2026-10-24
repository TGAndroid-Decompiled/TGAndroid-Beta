package org.telegram.messenger;
public final class z implements Runnable {
    public final int f20254a;
    public final BillingController f20255b;

    public z(BillingController billingController, int i10) {
        this.f20254a = i10;
        this.f20255b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f20254a) {
            case 0:
                this.f20255b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f20255b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
