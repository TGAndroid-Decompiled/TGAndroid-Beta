package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f25612a;
    public final Object f25613b;

    public k7(Object obj, int i10) {
        this.f25612a = i10;
        this.f25613b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f25612a) {
            case 0:
                ((j8) this.f25613b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f25613b;
                qcVar.f27654o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f25613b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                wi wiVar = (wi) ((hi) this.f25613b).d;
                oi oiVar = wiVar.f30006z0;
                if (oiVar == wiVar.m0 || oiVar == wiVar.f29965n0 || (wiVar.F && wiVar.f29986t1 != null)) {
                    wiVar.a2(1);
                }
                wiVar.f30006z0.k(wiVar.f29961l2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((oc0) this.f25613b).z();
                return;
        }
    }
}
