package org.telegram.ui.Components;
public final class mb extends o1.j {
    public final int f30639a;

    public mb(int i10) {
        this.f30639a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f30639a) {
            case 0:
                return ((rb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.pg0) obj).J;
            default:
                return ((org.telegram.ui.pg0) obj).I;
        }
    }

    @Override
    public final void b(Object obj, float f9) {
        switch (this.f30639a) {
            case 0:
                rb.access$2200((rb) obj, f9);
                return;
            case 1:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) obj;
                pg0Var.J = f9;
                pg0Var.invalidate();
                return;
            default:
                org.telegram.ui.pg0 pg0Var2 = (org.telegram.ui.pg0) obj;
                pg0Var2.I = f9;
                pg0Var2.invalidate();
                return;
        }
    }
}
