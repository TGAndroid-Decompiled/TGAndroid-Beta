package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class n7 implements o1.g {
    public final int f27596a;
    public final Object f27597b;

    public n7(Object obj, int i10) {
        this.f27596a = i10;
        this.f27597b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f27596a) {
            case 0:
                ((m8) this.f27597b).T.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                sc scVar = (sc) this.f27597b;
                scVar.f29107o = (int) f7;
                scVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((wb) this.f27597b).getWidth()) {
                    hVar.c();
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f27597b).d;
                ni niVar = viVar.C0;
                if (niVar == viVar.m0 || niVar == viVar.f30024n0 || (viVar.F && viVar.f30055w1 != null)) {
                    viVar.e2(1);
                }
                viVar.C0.l(viVar.f30029o2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                viewGroup.invalidate();
                return;
            case 4:
                dl dlVar = (dl) this.f27597b;
                dlVar.f24424j0 = f7;
                dlVar.k0();
                return;
            default:
                ((cd0) this.f27597b).z();
                return;
        }
    }
}
