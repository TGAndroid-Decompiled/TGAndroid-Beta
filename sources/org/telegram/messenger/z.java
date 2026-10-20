package org.telegram.messenger;
public final class z implements Runnable {
    public final int f20199a;
    public final BillingController f20200b;

    public z(BillingController billingController, int i10) {
        this.f20199a = i10;
        this.f20200b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f20199a) {
            case 0:
                this.f20200b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f20200b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
