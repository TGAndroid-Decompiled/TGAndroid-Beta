package org.telegram.messenger;
public final class z implements Runnable {
    public final int f20204a;
    public final BillingController f20205b;

    public z(BillingController billingController, int i10) {
        this.f20204a = i10;
        this.f20205b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f20204a) {
            case 0:
                this.f20205b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f20205b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
