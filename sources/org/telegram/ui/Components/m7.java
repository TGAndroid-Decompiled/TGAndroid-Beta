package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m7 implements o1.g {
    public final int f28712a;
    public final Object f28713b;

    public m7(Object obj, int i10) {
        this.f28712a = i10;
        this.f28713b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f28712a) {
            case 0:
                ((l8) this.f28713b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                tc tcVar = (tc) this.f28713b;
                tcVar.f31135o = (int) f7;
                tcVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((xb) this.f28713b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                yi yiVar = (yi) ((ji) this.f28713b).d;
                qi qiVar = yiVar.C0;
                if (qiVar == yiVar.m0 || qiVar == yiVar.f33251n0 || (yiVar.F && yiVar.f33282w1 != null)) {
                    yiVar.e2(1);
                }
                yiVar.C0.l(yiVar.f33256o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                gl glVar = (gl) this.f28713b;
                glVar.f26777j0 = f7;
                glVar.k0();
                return;
            default:
                ((cd0) this.f28713b).z();
                return;
        }
    }
}
