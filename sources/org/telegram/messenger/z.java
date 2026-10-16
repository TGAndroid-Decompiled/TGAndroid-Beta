package org.telegram.messenger;
public final class z implements Runnable {
    public final int f18824a;
    public final BillingController f18825b;

    public z(BillingController billingController, int i10) {
        this.f18824a = i10;
        this.f18825b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18824a) {
            case 0:
                this.f18825b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f18825b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
