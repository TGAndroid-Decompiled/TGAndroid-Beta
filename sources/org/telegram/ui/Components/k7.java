package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k7 implements o1.g {
    public final int f24624a;
    public final Object f24625b;

    public k7(Object obj, int i10) {
        this.f24624a = i10;
        this.f24625b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f24624a) {
            case 0:
                ((j8) this.f24625b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                pc pcVar = (pc) this.f24625b;
                pcVar.f26086o = (int) f7;
                pcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((tb) this.f24625b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                yi yiVar = (yi) ((ji) this.f24625b).d;
                qi qiVar = yiVar.f29430z0;
                if (qiVar == yiVar.m0 || qiVar == yiVar.f29389n0 || (yiVar.F && yiVar.f29410t1 != null)) {
                    yiVar.a2(1);
                }
                yiVar.f29430z0.k(yiVar.f29385l2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                viewGroup.invalidate();
                return;
            default:
                ((lc0) this.f24625b).z();
                return;
        }
    }
}
