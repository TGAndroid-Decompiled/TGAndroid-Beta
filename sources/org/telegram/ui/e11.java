package org.telegram.ui;
public final class e11 implements Runnable {
    public final int f36786a;
    public final i11 f36787b;
    public final int f36788c;

    public e11(i11 i11Var, int i10, int i11) {
        this.f36786a = i11;
        this.f36787b = i11Var;
        this.f36788c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36786a) {
            case 0:
                i11 i11Var = this.f36787b;
                org.telegram.ui.Components.k91 k91Var = i11Var.f38037n;
                h11 h11Var = i11Var.f38039s;
                int i10 = this.f36788c;
                k91Var.d(i10, h11Var.i(i10));
                return;
            default:
                i11 i11Var2 = this.f36787b;
                org.telegram.ui.Components.k91 k91Var2 = i11Var2.f38037n;
                h11 h11Var2 = i11Var2.f38039s;
                int i11 = this.f36788c;
                k91Var2.d(i11, h11Var2.i(i11));
                return;
        }
    }
}
