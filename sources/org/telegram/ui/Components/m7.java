package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m7 implements o1.g {
    public final int f28691a;
    public final Object f28692b;

    public m7(Object obj, int i10) {
        this.f28691a = i10;
        this.f28692b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f28691a) {
            case 0:
                ((l8) this.f28692b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                tc tcVar = (tc) this.f28692b;
                tcVar.f31101o = (int) f7;
                tcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((xb) this.f28692b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                yi yiVar = (yi) ((ji) this.f28692b).d;
                qi qiVar = yiVar.C0;
                if (qiVar == yiVar.m0 || qiVar == yiVar.f33258n0 || (yiVar.F && yiVar.f33289w1 != null)) {
                    yiVar.e2(1);
                }
                yiVar.C0.l(yiVar.f33263o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                gl glVar = (gl) this.f28692b;
                glVar.f26766j0 = f7;
                glVar.k0();
                return;
            default:
                ((dd0) this.f28692b).z();
                return;
        }
    }
}
