package org.telegram.ui;
public final class a81 implements Runnable {
    public final int f43641a;
    public final h81 f43642b;

    public a81(h81 h81Var, int i7) {
        this.f43641a = i7;
        this.f43642b = h81Var;
    }

    @Override
    public final void run() {
        switch (this.f43641a) {
            case 0:
                this.f43642b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f43642b.c(false);
                return;
        }
    }
}
