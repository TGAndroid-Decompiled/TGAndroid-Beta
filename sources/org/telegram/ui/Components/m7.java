package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m7 implements o1.g {
    public final int f28412a;
    public final Object f28413b;

    public m7(Object obj, int i10) {
        this.f28412a = i10;
        this.f28413b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f28412a) {
            case 0:
                ((l8) this.f28413b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                sc scVar = (sc) this.f28413b;
                scVar.f30541o = (int) f7;
                scVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((wb) this.f28413b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                aj ajVar = (aj) ((li) this.f28413b).d;
                si siVar = ajVar.C0;
                if (siVar == ajVar.m0 || siVar == ajVar.f24361n0 || (ajVar.F && ajVar.f24392w1 != null)) {
                    ajVar.e2(1);
                }
                ajVar.C0.l(ajVar.f24366o2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) ajVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                il ilVar = (il) this.f28413b;
                ilVar.f27195j0 = f7;
                ilVar.k0();
                return;
            default:
                ((gd0) this.f28413b).z();
                return;
        }
    }
}
