package org.telegram.messenger;
public final class z implements Runnable {
    public final int f19064a;
    public final BillingController f19065b;

    public z(BillingController billingController, int i10) {
        this.f19064a = i10;
        this.f19065b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19064a) {
            case 0:
                this.f19065b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19065b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
