package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class l7 implements o1.g {
    public final int f28099a;
    public final Object f28100b;

    public l7(Object obj, int i10) {
        this.f28099a = i10;
        this.f28100b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f28099a) {
            case 0:
                ((k8) this.f28100b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f28100b;
                qcVar.f29711o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f28100b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f28100b).d;
                ni niVar = viVar.f31370z0;
                if (niVar == viVar.m0 || niVar == viVar.f31329n0 || (viVar.F && viVar.f31350t1 != null)) {
                    viVar.a2(1);
                }
                viVar.f31370z0.k(viVar.f31325l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((dc0) this.f28100b).z();
                return;
        }
    }
}
