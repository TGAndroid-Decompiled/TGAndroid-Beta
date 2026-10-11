package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m7 implements o1.g {
    public final int f28579a;
    public final Object f28580b;

    public m7(Object obj, int i10) {
        this.f28579a = i10;
        this.f28580b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f28579a) {
            case 0:
                ((l8) this.f28580b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                sc scVar = (sc) this.f28580b;
                scVar.f30716o = (int) f7;
                scVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((wb) this.f28580b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                yi yiVar = (yi) ((ji) this.f28580b).d;
                qi qiVar = yiVar.C0;
                if (qiVar == yiVar.m0 || qiVar == yiVar.f33239n0 || (yiVar.F && yiVar.f33270w1 != null)) {
                    yiVar.e2(1);
                }
                yiVar.C0.l(yiVar.f33244o2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) yiVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                gl glVar = (gl) this.f28580b;
                glVar.f26743j0 = f7;
                glVar.k0();
                return;
            default:
                ((dd0) this.f28580b).z();
                return;
        }
    }
}
