package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class n7 implements o1.g {
    public final int f30883a;
    public final Object f30884b;

    public n7(Object obj, int i10) {
        this.f30883a = i10;
        this.f30884b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        oi.q qVar;
        ViewGroup viewGroup;
        switch (this.f30883a) {
            case 0:
                ((m8) this.f30884b).S.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f30884b;
                qcVar.f31895p = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f30884b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                ti tiVar = (ti) ((bi.x4) this.f30884b).d;
                li liVar = tiVar.C0;
                if (liVar == tiVar.m0 || liVar == tiVar.f33044n0 || (tiVar.F && tiVar.f33075w1 != null)) {
                    tiVar.h2(1);
                }
                tiVar.C0.l(tiVar.f33049o2);
                qVar = ((org.telegram.ui.ActionBar.k3) tiVar).glassEngine;
                qVar.g();
                viewGroup = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                al alVar = (al) this.f30884b;
                alVar.m0 = f7;
                alVar.k0();
                return;
            default:
                ((uc0) this.f30884b).y();
                return;
        }
    }
}
