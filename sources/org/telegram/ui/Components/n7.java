package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class n7 implements o1.g {
    public final int f30759a;
    public final Object f30760b;

    public n7(Object obj, int i10) {
        this.f30759a = i10;
        this.f30760b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        oi.q qVar;
        ViewGroup viewGroup;
        switch (this.f30759a) {
            case 0:
                ((m8) this.f30760b).S.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f30760b;
                qcVar.f31867p = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f30760b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                ti tiVar = (ti) ((bi.x4) this.f30760b).d;
                li liVar = tiVar.C0;
                if (liVar == tiVar.m0 || liVar == tiVar.f33013n0 || (tiVar.F && tiVar.f33044w1 != null)) {
                    tiVar.i2(1);
                }
                tiVar.C0.l(tiVar.f33018o2);
                qVar = ((org.telegram.ui.ActionBar.k3) tiVar).glassEngine;
                qVar.g();
                viewGroup = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                al alVar = (al) this.f30760b;
                alVar.m0 = f7;
                alVar.k0();
                return;
            default:
                ((vc0) this.f30760b).y();
                return;
        }
    }
}
