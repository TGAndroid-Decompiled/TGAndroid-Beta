package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class f7 implements o1.g {
    public final int f24794a;
    public final Object f24795b;

    public f7(Object obj, int i10) {
        this.f24794a = i10;
        this.f24795b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.f24794a) {
            case 0:
                ((c8) this.f24795b).Q.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                ic icVar = (ic) this.f24795b;
                icVar.f25677o = (int) f10;
                icVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((nb) this.f24795b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                li liVar = (li) ((lh.k3) this.f24795b).d;
                di diVar = liVar.f26752w0;
                if (diVar == liVar.f26711j0 || diVar == liVar.f26714k0 || (liVar.C && liVar.f26732q1 != null)) {
                    liVar.a2(1);
                }
                liVar.f26752w0.k(liVar.f26710i2);
                viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((dc0) this.f24795b).z();
                return;
        }
    }
}
