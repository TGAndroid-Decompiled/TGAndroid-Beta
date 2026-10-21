package org.telegram.messenger;
public final class z implements Runnable {
    public final int f20193a;
    public final BillingController f20194b;

    public z(BillingController billingController, int i10) {
        this.f20193a = i10;
        this.f20194b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f20193a) {
            case 0:
                this.f20194b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f20194b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
