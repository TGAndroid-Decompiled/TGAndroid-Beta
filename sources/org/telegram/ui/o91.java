package org.telegram.ui;
public final class o91 implements Runnable {
    public final int f40108a;
    public final v91 f40109b;

    public o91(v91 v91Var, int i10) {
        this.f40108a = i10;
        this.f40109b = v91Var;
    }

    @Override
    public final void run() {
        switch (this.f40108a) {
            case 0:
                this.f40109b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f40109b.c(false);
                return;
        }
    }
}
