package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class f7 implements o1.g {
    public final int f26807a;
    public final Object f26808b;

    public f7(Object obj, int i10) {
        this.f26807a = i10;
        this.f26808b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.f26807a) {
            case 0:
                ((c8) this.f26808b).Q.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                ic icVar = (ic) this.f26808b;
                icVar.f27783o = (int) f10;
                icVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((nb) this.f26808b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                mi miVar = (mi) ((mh.k3) this.f26808b).d;
                ei eiVar = miVar.f29122w0;
                if (eiVar == miVar.f29081j0 || eiVar == miVar.f29084k0 || (miVar.C && miVar.f29102q1 != null)) {
                    miVar.a2(1);
                }
                miVar.f29122w0.k(miVar.f29080i2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) miVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((fc0) this.f26808b).z();
                return;
        }
    }
}
