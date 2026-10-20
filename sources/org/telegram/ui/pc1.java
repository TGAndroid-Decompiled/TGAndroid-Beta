package org.telegram.ui;
public final class pc1 implements Runnable {
    public final int f40190a;
    public final yc1 f40191b;

    public pc1(yc1 yc1Var, int i10) {
        this.f40190a = i10;
        this.f40191b = yc1Var;
    }

    @Override
    public final void run() {
        switch (this.f40190a) {
            case 0:
                this.f40191b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f40191b.c(false);
                return;
        }
    }
}
