package org.telegram.messenger;
public final class z implements Runnable {
    public final int f20187a;
    public final BillingController f20188b;

    public z(BillingController billingController, int i10) {
        this.f20187a = i10;
        this.f20188b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f20187a) {
            case 0:
                this.f20188b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f20188b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
