package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m7 implements o1.g {
    public final int f28767a;
    public final Object f28768b;

    public m7(Object obj, int i10) {
        this.f28767a = i10;
        this.f28768b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f28767a) {
            case 0:
                ((l8) this.f28768b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                sc scVar = (sc) this.f28768b;
                scVar.f30838o = (int) f7;
                scVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((wb) this.f28768b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                yi yiVar = (yi) ((ji) this.f28768b).d;
                qi qiVar = yiVar.C0;
                if (qiVar == yiVar.m0 || qiVar == yiVar.f33312n0 || (yiVar.F && yiVar.f33343w1 != null)) {
                    yiVar.e2(1);
                }
                yiVar.C0.l(yiVar.f33317o2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) yiVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                gl glVar = (gl) this.f28768b;
                glVar.f26795j0 = f7;
                glVar.k0();
                return;
            default:
                ((cd0) this.f28768b).z();
                return;
        }
    }
}
