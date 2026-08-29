package org.telegram.messenger;
public final class z implements Runnable {
    public final int f22289a;
    public final BillingController f22290b;

    public z(BillingController billingController, int i10) {
        this.f22289a = i10;
        this.f22290b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f22289a) {
            case 0:
                this.f22290b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f22290b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
