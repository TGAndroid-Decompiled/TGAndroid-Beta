package org.telegram.messenger;
public final class z implements Runnable {
    public final int f19953a;
    public final BillingController f19954b;

    public z(BillingController billingController, int i10) {
        this.f19953a = i10;
        this.f19954b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19953a) {
            case 0:
                this.f19954b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19954b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
