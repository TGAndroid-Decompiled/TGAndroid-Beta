package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f25673a;
    public final Object f25674b;

    public k7(Object obj, int i10) {
        this.f25673a = i10;
        this.f25674b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f25673a) {
            case 0:
                ((j8) this.f25674b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f25674b;
                qcVar.f27582o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f25674b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                wi wiVar = (wi) ((hi) this.f25674b).d;
                oi oiVar = wiVar.f30069z0;
                if (oiVar == wiVar.m0 || oiVar == wiVar.f30028n0 || (wiVar.F && wiVar.f30049t1 != null)) {
                    wiVar.a2(1);
                }
                wiVar.f30069z0.k(wiVar.f30024l2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((mc0) this.f25674b).z();
                return;
        }
    }
}
