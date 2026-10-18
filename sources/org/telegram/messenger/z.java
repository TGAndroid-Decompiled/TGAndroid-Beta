package org.telegram.messenger;
public final class z implements Runnable {
    public final int f20182a;
    public final BillingController f20183b;

    public z(BillingController billingController, int i10) {
        this.f20182a = i10;
        this.f20183b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f20182a) {
            case 0:
                this.f20183b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f20183b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
