package org.telegram.ui;
public final class ge1 implements Runnable {
    public final int f33080a;
    public final pe1 f33081b;

    public ge1(pe1 pe1Var, int i10) {
        this.f33080a = i10;
        this.f33081b = pe1Var;
    }

    @Override
    public final void run() {
        switch (this.f33080a) {
            case 0:
                this.f33081b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f33081b.c(false);
                return;
        }
    }
}
