package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class j7 implements o1.g {
    public final int f27589a;
    public final Object f27590b;

    public j7(Object obj, int i10) {
        this.f27589a = i10;
        this.f27590b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f27589a) {
            case 0:
                ((i8) this.f27590b).S.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                oc ocVar = (oc) this.f27590b;
                ocVar.f29208o = (int) f7;
                ocVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((sb) this.f27590b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                ri riVar = (ri) ((ai.c5) this.f27590b).d;
                ji jiVar = riVar.C0;
                if (jiVar == riVar.m0 || jiVar == riVar.f30169n0 || (riVar.F && riVar.f30200w1 != null)) {
                    riVar.i2(1);
                }
                riVar.C0.l(riVar.f30174o2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) riVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                yk ykVar = (yk) this.f27590b;
                ykVar.m0 = f7;
                ykVar.k0();
                return;
            default:
                ((wc0) this.f27590b).y();
                return;
        }
    }
}
