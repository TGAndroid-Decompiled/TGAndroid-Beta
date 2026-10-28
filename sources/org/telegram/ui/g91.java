package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class g91 extends AnimatorListenerAdapter {
    public final int f39544a;
    public final i91 f39545b;

    public g91(i91 i91Var, int i10) {
        this.f39544a = i10;
        this.f39545b = i91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39544a) {
            case 0:
                i91 i91Var = this.f39545b;
                i91Var.f40072b.setVisibility(4);
                kg.h hVar = i91Var.f40072b;
                hVar.J = false;
                kg.h hVar2 = i91Var.f40073c;
                hVar2.J = true;
                hVar.f16625y0 = 0;
                hVar2.f16625y0 = 0;
                Window window = i91Var.f40071a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                i91 i91Var2 = this.f39545b;
                kg.h hVar3 = i91Var2.f40073c;
                hVar3.setVisibility(4);
                kg.h hVar4 = i91Var2.f40072b;
                hVar4.f16625y0 = 0;
                hVar3.f16625y0 = 0;
                hVar4.J = true;
                hVar3.J = false;
                if (!(hVar4 instanceof kg.r)) {
                    hVar4.f16618u0 = true;
                    hVar4.x((hVar4.G0 * hVar4.f16598g0.f16639k) - kg.h.f16567k1);
                    hVar4.c(true);
                    hVar4.invalidate();
                } else {
                    hVar4.f16618u0 = false;
                    hVar4.d();
                }
                Window window2 = i91Var2.f40071a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                i91 i91Var3 = this.f39545b;
                i91Var3.f40072b.f16625y0 = 0;
                i91Var3.e.setVisibility(8);
                return;
        }
    }
}
