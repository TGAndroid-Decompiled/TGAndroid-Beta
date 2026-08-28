package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class e7 implements o1.g {
    public final int f27963a;
    public final Object f27964b;

    public e7(Object obj, int i9) {
        this.f27963a = i9;
        this.f27964b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.f27963a) {
            case 0:
                ((c8) this.f27964b).P.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                gc gcVar = (gc) this.f27964b;
                gcVar.f28742o = (int) f10;
                gcVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((lb) this.f27964b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                ki kiVar = (ki) ((gh.m3) this.f27964b).d;
                ci ciVar = kiVar.f30163v0;
                if (ciVar == kiVar.f30123i0 || ciVar == kiVar.f30126j0 || (kiVar.B && kiVar.f30144p1 != null)) {
                    kiVar.a2(1);
                }
                kiVar.f30163v0.k(kiVar.f30122h2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((jb0) this.f27964b).z();
                return;
        }
    }
}
