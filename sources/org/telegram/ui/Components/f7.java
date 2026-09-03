package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class f7 implements o1.g {
    public final int f24812a;
    public final Object f24813b;

    public f7(Object obj, int i10) {
        this.f24812a = i10;
        this.f24813b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.f24812a) {
            case 0:
                ((c8) this.f24813b).Q.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                ic icVar = (ic) this.f24813b;
                icVar.f25676o = (int) f10;
                icVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((nb) this.f24813b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                li liVar = (li) ((lh.k3) this.f24813b).d;
                di diVar = liVar.f26748w0;
                if (diVar == liVar.f26707j0 || diVar == liVar.f26710k0 || (liVar.C && liVar.f26728q1 != null)) {
                    liVar.a2(1);
                }
                liVar.f26748w0.k(liVar.f26706i2);
                viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((ec0) this.f24813b).z();
                return;
        }
    }
}
