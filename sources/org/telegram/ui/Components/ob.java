package org.telegram.ui.Components;
public final class ob extends o1.i {
    public final int f29193a;

    public ob(int i10) {
        this.f29193a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f29193a) {
            case 0:
                return ((sb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.sg0) obj).N;
            default:
                return ((org.telegram.ui.sg0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f29193a) {
            case 0:
                sb.access$2200((sb) obj, f7);
                return;
            case 1:
                org.telegram.ui.sg0 sg0Var = (org.telegram.ui.sg0) obj;
                sg0Var.N = f7;
                sg0Var.invalidate();
                return;
            default:
                org.telegram.ui.sg0 sg0Var2 = (org.telegram.ui.sg0) obj;
                sg0Var2.M = f7;
                sg0Var2.invalidate();
                return;
        }
    }
}
