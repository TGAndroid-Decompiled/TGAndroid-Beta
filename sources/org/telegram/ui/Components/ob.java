package org.telegram.ui.Components;
public final class ob extends o1.i {
    public final int f26742a;

    public ob(int i10) {
        this.f26742a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f26742a) {
            case 0:
                return ((sb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.gh0) obj).N;
            default:
                return ((org.telegram.ui.gh0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f26742a) {
            case 0:
                sb.access$2200((sb) obj, f7);
                return;
            case 1:
                org.telegram.ui.gh0 gh0Var = (org.telegram.ui.gh0) obj;
                gh0Var.N = f7;
                gh0Var.invalidate();
                return;
            default:
                org.telegram.ui.gh0 gh0Var2 = (org.telegram.ui.gh0) obj;
                gh0Var2.M = f7;
                gh0Var2.invalidate();
                return;
        }
    }
}
