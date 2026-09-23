package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f25528a;
    public final Object f25529b;

    public k7(Object obj, int i10) {
        this.f25528a = i10;
        this.f25529b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f25528a) {
            case 0:
                ((j8) this.f25529b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f25529b;
                qcVar.f27311o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f25529b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                wi wiVar = (wi) ((hi) this.f25529b).d;
                oi oiVar = wiVar.f29729z0;
                if (oiVar == wiVar.m0 || oiVar == wiVar.f29688n0 || (wiVar.F && wiVar.f29709t1 != null)) {
                    wiVar.a2(1);
                }
                wiVar.f29729z0.k(wiVar.f29684l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) wiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((bc0) this.f25529b).z();
                return;
        }
    }
}
