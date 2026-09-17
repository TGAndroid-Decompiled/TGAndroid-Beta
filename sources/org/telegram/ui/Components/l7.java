package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class l7 implements o1.g {
    public final int f28100a;
    public final Object f28101b;

    public l7(Object obj, int i10) {
        this.f28100a = i10;
        this.f28101b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f28100a) {
            case 0:
                ((k8) this.f28101b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                qc qcVar = (qc) this.f28101b;
                qcVar.f29712o = (int) f7;
                qcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((ub) this.f28101b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f28101b).d;
                ni niVar = viVar.f31371z0;
                if (niVar == viVar.m0 || niVar == viVar.f31330n0 || (viVar.F && viVar.f31351t1 != null)) {
                    viVar.a2(1);
                }
                viVar.f31371z0.k(viVar.f31326l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((dc0) this.f28101b).z();
                return;
        }
    }
}
