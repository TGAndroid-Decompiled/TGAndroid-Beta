package org.telegram.ui;
public final class qh1 implements Runnable {
    public final int f41174a;
    public final rh1 f41175b;

    public qh1(rh1 rh1Var, int i10) {
        this.f41174a = i10;
        this.f41175b = rh1Var;
    }

    @Override
    public final void run() {
        switch (this.f41174a) {
            case 0:
                org.telegram.ui.Components.f71 f71Var = this.f41175b.f26629a;
                if (f71Var != null) {
                    f71Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.f71 f71Var2 = this.f41175b.f26629a;
                if (f71Var2 != null) {
                    f71Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
