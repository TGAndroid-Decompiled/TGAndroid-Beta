package org.telegram.ui.Components;
public final class sb extends o1.i {
    public final int f29092a;

    public sb(int i10) {
        this.f29092a = i10;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f29092a) {
            case 0:
                return ((wb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.mh0) obj).N;
            default:
                return ((org.telegram.ui.mh0) obj).M;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f29092a) {
            case 0:
                wb.access$2200((wb) obj, f7);
                return;
            case 1:
                org.telegram.ui.mh0 mh0Var = (org.telegram.ui.mh0) obj;
                mh0Var.N = f7;
                mh0Var.invalidate();
                return;
            default:
                org.telegram.ui.mh0 mh0Var2 = (org.telegram.ui.mh0) obj;
                mh0Var2.M = f7;
                mh0Var2.invalidate();
                return;
        }
    }
}
