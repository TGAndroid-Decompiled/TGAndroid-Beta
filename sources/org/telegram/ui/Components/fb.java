package org.telegram.ui.Components;

public final class fb extends o1.i {

    public final int f28339a;

    public fb(int i10) {
        this.f28339a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f28339a) {
            case 0:
                return ((jb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.sg0) obj).J;
            default:
                return ((org.telegram.ui.sg0) obj).I;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f28339a) {
            case 0:
                ((jb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.sg0 sg0Var = (org.telegram.ui.sg0) obj;
                sg0Var.J = f10;
                sg0Var.invalidate();
                break;
            default:
                org.telegram.ui.sg0 sg0Var2 = (org.telegram.ui.sg0) obj;
                sg0Var2.I = f10;
                sg0Var2.invalidate();
                break;
        }
    }
}
