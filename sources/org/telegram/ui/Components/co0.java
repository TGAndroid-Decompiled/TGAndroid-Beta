package org.telegram.ui.Components;
public final class co0 extends g.p {
    public final int f34100c;
    public final zo0 d;

    public co0(zo0 zo0Var, int i7) {
        this.f34100c = i7;
        this.d = zo0Var;
    }

    @Override
    public final int i(int i7) {
        switch (this.f34100c) {
            case 0:
                if (i7 == 0) {
                    return this.d.D1.J;
                }
                return 1;
            case 1:
                wo0 wo0Var = this.d.I1;
                if (i7 != wo0Var.f41697x && i7 != wo0Var.f41698y && i7 != wo0Var.E && i7 != wo0Var.G && wo0Var.d(i7) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i7 == 0) {
                    return this.d.E1.J;
                }
                return 1;
        }
    }
}
