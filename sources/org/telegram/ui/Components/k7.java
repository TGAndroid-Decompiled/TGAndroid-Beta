package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f25655a;
    public final Object f25656b;

    public k7(Object obj, int i10) {
        this.f25655a = i10;
        this.f25656b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f25655a) {
            case 0:
                ((j8) this.f25656b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f25656b;
                qcVar.f27576o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f25656b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                wi wiVar = (wi) ((hi) this.f25656b).d;
                oi oiVar = wiVar.f30049z0;
                if (oiVar == wiVar.m0 || oiVar == wiVar.f30008n0 || (wiVar.F && wiVar.f30029t1 != null)) {
                    wiVar.a2(1);
                }
                wiVar.f30049z0.k(wiVar.f30004l2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((mc0) this.f25656b).z();
                return;
        }
    }
}
