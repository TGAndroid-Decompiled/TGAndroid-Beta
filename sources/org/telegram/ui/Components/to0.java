package org.telegram.ui.Components;
public final class to0 extends f2.x {
    public final int f32773c;
    public final rp0 d;

    public to0(rp0 rp0Var, int i9) {
        this.f32773c = i9;
        this.d = rp0Var;
    }

    @Override
    public final int i(int i9) {
        switch (this.f32773c) {
            case 0:
                if (i9 == 0) {
                    return this.d.D.J;
                }
                return 1;
            case 1:
                np0 np0Var = this.d.I;
                if (i9 != np0Var.f31151w && i9 != np0Var.f31152x && i9 != np0Var.f31153y && i9 != np0Var.B && np0Var.j(i9) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i9 == 0) {
                    return this.d.E.J;
                }
                return 1;
        }
    }
}
