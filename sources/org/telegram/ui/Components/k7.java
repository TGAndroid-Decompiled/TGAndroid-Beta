package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f28073a;
    public final Object f28074b;

    public k7(Object obj, int i10) {
        this.f28073a = i10;
        this.f28074b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        li.p pVar;
        ViewGroup viewGroup;
        switch (this.f28073a) {
            case 0:
                ((j8) this.f28074b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                rc rcVar = (rc) this.f28074b;
                rcVar.f30432o = (int) f7;
                rcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((vb) this.f28074b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                xi xiVar = (xi) ((fi) this.f28074b).d;
                pi piVar = xiVar.f32974z0;
                if (piVar == xiVar.m0 || piVar == xiVar.f32933n0 || (xiVar.F && xiVar.f32954t1 != null)) {
                    xiVar.Z1(1);
                }
                xiVar.f32974z0.k(xiVar.f32929l2);
                pVar = ((org.telegram.ui.ActionBar.f3) xiVar).glassEngine;
                pVar.g();
                viewGroup = ((org.telegram.ui.ActionBar.f3) xiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((pc0) this.f28074b).z();
                return;
        }
    }
}
