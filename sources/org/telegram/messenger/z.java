package org.telegram.messenger;
public final class z implements Runnable {
    public final int f20185a;
    public final BillingController f20186b;

    public z(BillingController billingController, int i10) {
        this.f20185a = i10;
        this.f20186b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f20185a) {
            case 0:
                this.f20186b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f20186b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
