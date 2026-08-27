package org.telegram.messenger;

public final class z implements Runnable {

    public final int f22279a;

    public final BillingController f22280b;

    public z(BillingController billingController, int i10) {
        this.f22279a = i10;
        this.f22280b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f22279a) {
            case 0:
                this.f22280b.lambda$onQueriedPremiumProductDetails$14();
                break;
            default:
                this.f22280b.lambda$onBillingServiceDisconnected$13();
                break;
        }
    }
}
