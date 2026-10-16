package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class n7 implements o1.g {
    public final int f27291a;
    public final Object f27292b;

    public n7(Object obj, int i10) {
        this.f27291a = i10;
        this.f27292b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f27291a) {
            case 0:
                ((m8) this.f27292b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                sc scVar = (sc) this.f27292b;
                scVar.f28810o = (int) f7;
                scVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((wb) this.f27292b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f27292b).d;
                ni niVar = viVar.C0;
                if (niVar == viVar.m0 || niVar == viVar.f29695n0 || (viVar.F && viVar.f29726w1 != null)) {
                    viVar.e2(1);
                }
                viVar.C0.l(viVar.f29700o2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                cl clVar = (cl) this.f27292b;
                clVar.f23779j0 = f7;
                clVar.k0();
                return;
            default:
                ((cd0) this.f27292b).z();
                return;
        }
    }
}
