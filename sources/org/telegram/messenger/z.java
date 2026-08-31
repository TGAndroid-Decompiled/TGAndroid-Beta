package org.telegram.messenger;
public final class z implements Runnable {
    public final int f20740a;
    public final BillingController f20741b;

    public z(BillingController billingController, int i10) {
        this.f20740a = i10;
        this.f20741b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f20740a) {
            case 0:
                this.f20741b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f20741b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
