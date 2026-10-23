package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class l7 implements o1.g {
    public final int f28234a;
    public final Object f28235b;

    public l7(Object obj, int i10) {
        this.f28234a = i10;
        this.f28235b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f28234a) {
            case 0:
                ((k8) this.f28235b).S.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f28235b;
                qcVar.f29837o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f28235b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                ti tiVar = (ti) ((ai.c5) this.f28235b).d;
                li liVar = tiVar.C0;
                if (liVar == tiVar.m0 || liVar == tiVar.f30753n0 || (tiVar.F && tiVar.f30784w1 != null)) {
                    tiVar.i2(1);
                }
                tiVar.C0.l(tiVar.f30758o2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) tiVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                al alVar = (al) this.f28235b;
                alVar.m0 = f7;
                alVar.k0();
                return;
            default:
                ((yc0) this.f28235b).y();
                return;
        }
    }
}
