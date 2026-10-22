package org.telegram.ui;
public final class a11 implements Runnable {
    public final int f35246a;
    public final e11 f35247b;
    public final int f35248c;

    public a11(e11 e11Var, int i10, int i11) {
        this.f35246a = i11;
        this.f35247b = e11Var;
        this.f35248c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35246a) {
            case 0:
                e11 e11Var = this.f35247b;
                org.telegram.ui.Components.d91 d91Var = e11Var.f36522n;
                d11 d11Var = e11Var.f36524s;
                int i10 = this.f35248c;
                d91Var.d(i10, d11Var.i(i10));
                return;
            default:
                e11 e11Var2 = this.f35247b;
                org.telegram.ui.Components.d91 d91Var2 = e11Var2.f36522n;
                d11 d11Var2 = e11Var2.f36524s;
                int i11 = this.f35248c;
                d91Var2.d(i11, d11Var2.i(i11));
                return;
        }
    }
}
