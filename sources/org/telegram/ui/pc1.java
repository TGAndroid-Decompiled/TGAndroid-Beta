package org.telegram.ui;
public final class pc1 implements Runnable {
    public final int f40194a;
    public final yc1 f40195b;

    public pc1(yc1 yc1Var, int i10) {
        this.f40194a = i10;
        this.f40195b = yc1Var;
    }

    @Override
    public final void run() {
        switch (this.f40194a) {
            case 0:
                this.f40195b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f40195b.c(false);
                return;
        }
    }
}
