package org.telegram.ui;
public final class a11 implements Runnable {
    public final int f35242a;
    public final e11 f35243b;
    public final int f35244c;

    public a11(e11 e11Var, int i10, int i11) {
        this.f35242a = i11;
        this.f35243b = e11Var;
        this.f35244c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35242a) {
            case 0:
                e11 e11Var = this.f35243b;
                org.telegram.ui.Components.d91 d91Var = e11Var.f36518n;
                d11 d11Var = e11Var.f36520s;
                int i10 = this.f35244c;
                d91Var.d(i10, d11Var.i(i10));
                return;
            default:
                e11 e11Var2 = this.f35243b;
                org.telegram.ui.Components.d91 d91Var2 = e11Var2.f36518n;
                d11 d11Var2 = e11Var2.f36520s;
                int i11 = this.f35244c;
                d91Var2.d(i11, d11Var2.i(i11));
                return;
        }
    }
}
