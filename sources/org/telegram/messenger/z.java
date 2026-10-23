package org.telegram.messenger;
public final class z implements Runnable {
    public final int f20268a;
    public final BillingController f20269b;

    public z(BillingController billingController, int i10) {
        this.f20268a = i10;
        this.f20269b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f20268a) {
            case 0:
                this.f20269b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f20269b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
