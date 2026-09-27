package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f25640a;
    public final Object f25641b;

    public k7(Object obj, int i10) {
        this.f25640a = i10;
        this.f25641b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f25640a) {
            case 0:
                ((j8) this.f25641b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f25641b;
                qcVar.f27696o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f25641b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                wi wiVar = (wi) ((ei) this.f25641b).d;
                oi oiVar = wiVar.f30026z0;
                if (oiVar == wiVar.m0 || oiVar == wiVar.f29985n0 || (wiVar.F && wiVar.f30006t1 != null)) {
                    wiVar.X1(1);
                }
                wiVar.f30026z0.k(wiVar.f29981l2);
                viewGroup = ((org.telegram.ui.ActionBar.g3) wiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((nc0) this.f25641b).z();
                return;
        }
    }
}
