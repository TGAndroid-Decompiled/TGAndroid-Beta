package org.telegram.messenger;
public final class z implements Runnable {
    public final int f19977a;
    public final BillingController f19978b;

    public z(BillingController billingController, int i10) {
        this.f19977a = i10;
        this.f19978b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19977a) {
            case 0:
                this.f19978b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19978b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
