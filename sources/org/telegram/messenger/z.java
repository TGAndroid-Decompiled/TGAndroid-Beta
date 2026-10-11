package org.telegram.messenger;
public final class z implements Runnable {
    public final int f19941a;
    public final BillingController f19942b;

    public z(BillingController billingController, int i10) {
        this.f19941a = i10;
        this.f19942b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19941a) {
            case 0:
                BillingController.p(this.f19942b);
                return;
            default:
                BillingController.m(this.f19942b);
                return;
        }
    }
}
