package org.telegram.messenger;
public final class z implements Runnable {
    public final int f19944a;
    public final BillingController f19945b;

    public z(BillingController billingController, int i10) {
        this.f19944a = i10;
        this.f19945b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19944a) {
            case 0:
                this.f19945b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19945b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
