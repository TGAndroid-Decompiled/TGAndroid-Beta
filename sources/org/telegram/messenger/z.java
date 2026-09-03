package org.telegram.messenger;
public final class z implements Runnable {
    public final int f20742a;
    public final BillingController f20743b;

    public z(BillingController billingController, int i10) {
        this.f20742a = i10;
        this.f20743b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f20742a) {
            case 0:
                this.f20743b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f20743b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
