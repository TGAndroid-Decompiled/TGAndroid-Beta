package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f25598a;
    public final Object f25599b;

    public k7(Object obj, int i10) {
        this.f25598a = i10;
        this.f25599b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f25598a) {
            case 0:
                ((j8) this.f25599b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f25599b;
                qcVar.f27555o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f25599b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f25599b).d;
                ni niVar = viVar.f29085z0;
                if (niVar == viVar.m0 || niVar == viVar.f29044n0 || (viVar.F && viVar.f29065t1 != null)) {
                    viVar.a2(1);
                }
                viVar.f29085z0.k(viVar.f29040l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((lc0) this.f25599b).z();
                return;
        }
    }
}
