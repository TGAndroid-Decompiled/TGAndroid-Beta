package org.telegram.messenger;
public final class z implements Runnable {
    public final int f22283a;
    public final BillingController f22284b;

    public z(BillingController billingController, int i9) {
        this.f22283a = i9;
        this.f22284b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f22283a) {
            case 0:
                BillingController.p(this.f22284b);
                return;
            default:
                BillingController.m(this.f22284b);
                return;
        }
    }
}
