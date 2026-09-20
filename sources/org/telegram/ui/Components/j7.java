package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class j7 implements o1.g {
    public final int f25247a;
    public final Object f25248b;

    public j7(Object obj, int i10) {
        this.f25247a = i10;
        this.f25248b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f25247a) {
            case 0:
                ((i8) this.f25248b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                pc pcVar = (pc) this.f25248b;
                pcVar.f27257o = (int) f7;
                pcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((tb) this.f25248b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f25248b).d;
                ni niVar = viVar.f29162z0;
                if (niVar == viVar.m0 || niVar == viVar.f29121n0 || (viVar.F && viVar.f29142t1 != null)) {
                    viVar.a2(1);
                }
                viVar.f29162z0.k(viVar.f29117l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((kc0) this.f25248b).z();
                return;
        }
    }
}
