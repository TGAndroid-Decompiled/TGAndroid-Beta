package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class j7 implements o1.h {
    public final int f29566a;
    public final Object f29567b;

    public j7(Object obj, int i10) {
        this.f29566a = i10;
        this.f29567b = obj;
    }

    @Override
    public final void a(o1.i iVar, float f9, float f10) {
        ViewGroup viewGroup;
        switch (this.f29566a) {
            case 0:
                ((g8) this.f29567b).P.setBufferedProgress(f9 / 1000.0f);
                return;
            case 1:
                mc mcVar = (mc) this.f29567b;
                mcVar.f30657o = (int) f9;
                mcVar.l();
                return;
            case 2:
                if (Math.abs(f9) > ((rb) this.f29567b).getWidth()) {
                    iVar.c();
                    return;
                }
                return;
            case 3:
                ni niVar = (ni) ((jh.l3) this.f29567b).d;
                fi fiVar = niVar.f31054v0;
                if (fiVar == niVar.f31014i0 || fiVar == niVar.f31017j0 || (niVar.B && niVar.f31035p1 != null)) {
                    niVar.a2(1);
                }
                niVar.f31054v0.k(niVar.f31013h2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((yb0) this.f29567b).z();
                return;
        }
    }
}
