package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f25660a;
    public final Object f25661b;

    public k7(Object obj, int i10) {
        this.f25660a = i10;
        this.f25661b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f25660a) {
            case 0:
                ((j8) this.f25661b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                rc rcVar = (rc) this.f25661b;
                rcVar.f27951o = (int) f7;
                rcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((vb) this.f25661b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                xi xiVar = (xi) ((ii) this.f25661b).d;
                pi piVar = xiVar.f30334z0;
                if (piVar == xiVar.m0 || piVar == xiVar.f30293n0 || (xiVar.F && xiVar.f30314t1 != null)) {
                    xiVar.a2(1);
                }
                xiVar.f30334z0.k(xiVar.f30289l2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) xiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((pc0) this.f25661b).z();
                return;
        }
    }
}
