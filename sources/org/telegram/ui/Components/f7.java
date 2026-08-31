package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class f7 implements o1.g {
    public final int f26777a;
    public final Object f26778b;

    public f7(Object obj, int i10) {
        this.f26777a = i10;
        this.f26778b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.f26777a) {
            case 0:
                ((c8) this.f26778b).Q.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                ic icVar = (ic) this.f26778b;
                icVar.f27750o = (int) f10;
                icVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((nb) this.f26778b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                mi miVar = (mi) ((mh.k3) this.f26778b).d;
                ei eiVar = miVar.f29104w0;
                if (eiVar == miVar.f29063j0 || eiVar == miVar.f29066k0 || (miVar.C && miVar.f29084q1 != null)) {
                    miVar.a2(1);
                }
                miVar.f29104w0.k(miVar.f29062i2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) miVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((fc0) this.f26778b).z();
                return;
        }
    }
}
