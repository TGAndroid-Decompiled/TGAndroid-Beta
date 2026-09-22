package org.telegram.ui;
public final class ce1 implements Runnable {
    public final int f32768a;
    public final le1 f32769b;

    public ce1(le1 le1Var, int i10) {
        this.f32768a = i10;
        this.f32769b = le1Var;
    }

    @Override
    public final void run() {
        switch (this.f32768a) {
            case 0:
                this.f32769b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f32769b.c(false);
                return;
        }
    }
}
