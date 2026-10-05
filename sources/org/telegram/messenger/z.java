package org.telegram.messenger;
public final class z implements Runnable {
    public final int f19958a;
    public final BillingController f19959b;

    public z(BillingController billingController, int i10) {
        this.f19958a = i10;
        this.f19959b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19958a) {
            case 0:
                this.f19959b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19959b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
