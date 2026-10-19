package org.telegram.ui;
public final class a11 implements Runnable {
    public final int f35236a;
    public final e11 f35237b;
    public final int f35238c;

    public a11(e11 e11Var, int i10, int i11) {
        this.f35236a = i11;
        this.f35237b = e11Var;
        this.f35238c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35236a) {
            case 0:
                e11 e11Var = this.f35237b;
                org.telegram.ui.Components.c91 c91Var = e11Var.f36512n;
                d11 d11Var = e11Var.f36514s;
                int i10 = this.f35238c;
                c91Var.d(i10, d11Var.i(i10));
                return;
            default:
                e11 e11Var2 = this.f35237b;
                org.telegram.ui.Components.c91 c91Var2 = e11Var2.f36512n;
                d11 d11Var2 = e11Var2.f36514s;
                int i11 = this.f35238c;
                c91Var2.d(i11, d11Var2.i(i11));
                return;
        }
    }
}
