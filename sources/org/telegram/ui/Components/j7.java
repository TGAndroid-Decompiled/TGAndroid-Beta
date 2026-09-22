package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class j7 implements o1.g {
    public final int f25297a;
    public final Object f25298b;

    public j7(Object obj, int i10) {
        this.f25297a = i10;
        this.f25298b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f25297a) {
            case 0:
                ((i8) this.f25298b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                pc pcVar = (pc) this.f25298b;
                pcVar.f27316o = (int) f7;
                pcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((tb) this.f25298b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f25298b).d;
                ni niVar = viVar.f29160z0;
                if (niVar == viVar.m0 || niVar == viVar.f29119n0 || (viVar.F && viVar.f29140t1 != null)) {
                    viVar.a2(1);
                }
                viVar.f29160z0.k(viVar.f29115l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((nc0) this.f25298b).z();
                return;
        }
    }
}
