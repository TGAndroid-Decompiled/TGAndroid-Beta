package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class i7 implements o1.g {
    public final int f24847a;
    public final Object f24848b;

    public i7(Object obj, int i10) {
        this.f24847a = i10;
        this.f24848b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f24847a) {
            case 0:
                ((h8) this.f24848b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                oc ocVar = (oc) this.f24848b;
                ocVar.f26707o = (int) f7;
                ocVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((sb) this.f24848b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f24848b).d;
                ni niVar = viVar.f28806z0;
                if (niVar == viVar.m0 || niVar == viVar.f28765n0 || (viVar.F && viVar.f28786t1 != null)) {
                    viVar.a2(1);
                }
                viVar.f28806z0.k(viVar.f28761l2);
                viewGroup = ((org.telegram.ui.ActionBar.g3) viVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((cc0) this.f24848b).z();
                return;
        }
    }
}
