package org.telegram.ui;
public final class a11 implements Runnable {
    public final int f35247a;
    public final e11 f35248b;
    public final int f35249c;

    public a11(e11 e11Var, int i10, int i11) {
        this.f35247a = i11;
        this.f35248b = e11Var;
        this.f35249c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35247a) {
            case 0:
                e11 e11Var = this.f35248b;
                org.telegram.ui.Components.d91 d91Var = e11Var.f36523n;
                d11 d11Var = e11Var.f36525s;
                int i10 = this.f35249c;
                d91Var.d(i10, d11Var.i(i10));
                return;
            default:
                e11 e11Var2 = this.f35248b;
                org.telegram.ui.Components.d91 d91Var2 = e11Var2.f36523n;
                d11 d11Var2 = e11Var2.f36525s;
                int i11 = this.f35249c;
                d91Var2.d(i11, d11Var2.i(i11));
                return;
        }
    }
}
