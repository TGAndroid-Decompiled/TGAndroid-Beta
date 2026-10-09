package org.telegram.messenger;
public final class z implements Runnable {
    public final int f19940a;
    public final BillingController f19941b;

    public z(BillingController billingController, int i10) {
        this.f19940a = i10;
        this.f19941b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19940a) {
            case 0:
                this.f19941b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19941b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
