package org.telegram.ui;
public final class of0 implements Runnable {
    public final int f50546a;
    public final fg0 f50547b;

    public of0(fg0 fg0Var, int i7) {
        this.f50546a = i7;
        this.f50547b = fg0Var;
    }

    @Override
    public final void run() {
        switch (this.f50546a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                fg0 fg0Var = this.f50547b;
                fg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = fg0Var.f47631i0;
                if (eVar != null) {
                    eVar.b(fg0Var.F);
                }
                org.telegram.messenger.g0.g3(new of0(fg0Var, 0));
                return;
            case 2:
                xh.e.f(false);
                fg0 fg0Var2 = this.f50547b;
                xh.e eVar2 = fg0Var2.f47631i0;
                if (eVar2 != null) {
                    eVar2.b(fg0Var2.F);
                }
                org.telegram.messenger.g0.g3(new of0(fg0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
