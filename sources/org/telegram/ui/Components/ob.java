package org.telegram.ui.Components;
public final class ob extends o1.i {
    public final int f26696a;

    public ob(int i10) {
        this.f26696a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f26696a) {
            case 0:
                return ((sb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.ih0) obj).N;
            default:
                return ((org.telegram.ui.ih0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f26696a) {
            case 0:
                sb.access$2200((sb) obj, f7);
                return;
            case 1:
                org.telegram.ui.ih0 ih0Var = (org.telegram.ui.ih0) obj;
                ih0Var.N = f7;
                ih0Var.invalidate();
                return;
            default:
                org.telegram.ui.ih0 ih0Var2 = (org.telegram.ui.ih0) obj;
                ih0Var2.M = f7;
                ih0Var2.invalidate();
                return;
        }
    }
}
