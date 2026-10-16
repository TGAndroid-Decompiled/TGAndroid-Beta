package org.telegram.ui.Components;
public final class sb extends o1.i {
    public final int f28795a;

    public sb(int i10) {
        this.f28795a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f28795a) {
            case 0:
                return ((wb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.lh0) obj).N;
            default:
                return ((org.telegram.ui.lh0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f28795a) {
            case 0:
                wb.access$2200((wb) obj, f7);
                return;
            case 1:
                org.telegram.ui.lh0 lh0Var = (org.telegram.ui.lh0) obj;
                lh0Var.N = f7;
                lh0Var.invalidate();
                return;
            default:
                org.telegram.ui.lh0 lh0Var2 = (org.telegram.ui.lh0) obj;
                lh0Var2.M = f7;
                lh0Var2.invalidate();
                return;
        }
    }
}
