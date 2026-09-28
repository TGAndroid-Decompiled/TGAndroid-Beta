package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f25613a;
    public final Object f25614b;

    public k7(Object obj, int i10) {
        this.f25613a = i10;
        this.f25614b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f25613a) {
            case 0:
                ((j8) this.f25614b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f25614b;
                qcVar.f27655o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f25614b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                wi wiVar = (wi) ((hi) this.f25614b).d;
                oi oiVar = wiVar.f30007z0;
                if (oiVar == wiVar.m0 || oiVar == wiVar.f29966n0 || (wiVar.F && wiVar.f29987t1 != null)) {
                    wiVar.a2(1);
                }
                wiVar.f30007z0.k(wiVar.f29962l2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((oc0) this.f25614b).z();
                return;
        }
    }
}
