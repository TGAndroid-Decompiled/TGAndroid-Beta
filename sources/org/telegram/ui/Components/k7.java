package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f27972a;
    public final Object f27973b;

    public k7(Object obj, int i10) {
        this.f27972a = i10;
        this.f27973b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f27972a) {
            case 0:
                ((j8) this.f27973b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                rc rcVar = (rc) this.f27973b;
                rcVar.f30343o = (int) f7;
                rcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((vb) this.f27973b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                xi xiVar = (xi) ((fi) this.f27973b).d;
                pi piVar = xiVar.f32876z0;
                if (piVar == xiVar.m0 || piVar == xiVar.f32835n0 || (xiVar.F && xiVar.f32856t1 != null)) {
                    xiVar.X1(1);
                }
                xiVar.f32876z0.k(xiVar.f32831l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) xiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((pc0) this.f27973b).z();
                return;
        }
    }
}
