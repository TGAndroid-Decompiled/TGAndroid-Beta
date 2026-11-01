package org.telegram.ui.Components;
public final class ml0 implements Runnable {
    public final int f28513a;
    public final ol0 f28514b;

    public ml0(ol0 ol0Var, int i10) {
        this.f28513a = i10;
        this.f28514b = ol0Var;
    }

    @Override
    public final void run() {
        switch (this.f28513a) {
            case 0:
                ol0 ol0Var = this.f28514b;
                ol0Var.getClass();
                org.telegram.messenger.i0.g3(new ml0(ol0Var, 2));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new ml0(this.f28514b, 3));
                return;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
