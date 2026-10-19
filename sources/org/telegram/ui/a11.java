package org.telegram.ui;
public final class a11 implements Runnable {
    public final int f35234a;
    public final e11 f35235b;
    public final int f35236c;

    public a11(e11 e11Var, int i10, int i11) {
        this.f35234a = i11;
        this.f35235b = e11Var;
        this.f35236c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35234a) {
            case 0:
                e11 e11Var = this.f35235b;
                org.telegram.ui.Components.c91 c91Var = e11Var.f36521n;
                d11 d11Var = e11Var.f36523s;
                int i10 = this.f35236c;
                c91Var.d(i10, d11Var.i(i10));
                return;
            default:
                e11 e11Var2 = this.f35235b;
                org.telegram.ui.Components.c91 c91Var2 = e11Var2.f36521n;
                d11 d11Var2 = e11Var2.f36523s;
                int i11 = this.f35236c;
                c91Var2.d(i11, d11Var2.i(i11));
                return;
        }
    }
}
