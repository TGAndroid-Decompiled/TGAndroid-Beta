package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class l7 implements o1.g {
    public final int f28065a;
    public final Object f28066b;

    public l7(Object obj, int i10) {
        this.f28065a = i10;
        this.f28066b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f28065a) {
            case 0:
                ((k8) this.f28066b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f28066b;
                qcVar.f29536o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f28066b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                ti tiVar = (ti) ((ai.c5) this.f28066b).d;
                li liVar = tiVar.C0;
                if (liVar == tiVar.m0 || liVar == tiVar.f30569n0 || (tiVar.F && tiVar.f30600w1 != null)) {
                    tiVar.e2(1);
                }
                tiVar.C0.l(tiVar.f30574o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                al alVar = (al) this.f28066b;
                alVar.f24645j0 = f7;
                alVar.k0();
                return;
            default:
                ((wc0) this.f28066b).y();
                return;
        }
    }
}
