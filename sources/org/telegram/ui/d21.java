package org.telegram.ui;
public final class d21 implements Runnable {
    public final int f35123a;
    public final h21 f35124b;
    public final int f35125c;

    public d21(h21 h21Var, int i10, int i11) {
        this.f35123a = i11;
        this.f35124b = h21Var;
        this.f35125c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35123a) {
            case 0:
                h21 h21Var = this.f35124b;
                org.telegram.ui.Components.j91 j91Var = h21Var.f36585n;
                g21 g21Var = h21Var.f36587s;
                int i10 = this.f35125c;
                j91Var.d(i10, g21Var.i(i10));
                return;
            default:
                h21 h21Var2 = this.f35124b;
                org.telegram.ui.Components.j91 j91Var2 = h21Var2.f36585n;
                g21 g21Var2 = h21Var2.f36587s;
                int i11 = this.f35125c;
                j91Var2.d(i11, g21Var2.i(i11));
                return;
        }
    }
}
