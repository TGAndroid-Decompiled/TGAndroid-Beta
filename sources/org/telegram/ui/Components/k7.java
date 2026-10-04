package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f27978a;
    public final Object f27979b;

    public k7(Object obj, int i10) {
        this.f27978a = i10;
        this.f27979b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        li.n nVar;
        ViewGroup viewGroup;
        switch (this.f27978a) {
            case 0:
                ((j8) this.f27979b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                rc rcVar = (rc) this.f27979b;
                rcVar.f30350o = (int) f7;
                rcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((vb) this.f27979b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                xi xiVar = (xi) ((fi) this.f27979b).d;
                pi piVar = xiVar.f32883z0;
                if (piVar == xiVar.m0 || piVar == xiVar.f32842n0 || (xiVar.F && xiVar.f32863t1 != null)) {
                    xiVar.Z1(1);
                }
                xiVar.f32883z0.k(xiVar.f32838l2);
                nVar = ((org.telegram.ui.ActionBar.f3) xiVar).glassEngine;
                nVar.g();
                viewGroup = ((org.telegram.ui.ActionBar.f3) xiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((pc0) this.f27979b).z();
                return;
        }
    }
}
