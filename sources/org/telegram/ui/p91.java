package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class p91 extends AnimatorListenerAdapter {
    public final int f39989a;
    public final r91 f39990b;

    public p91(r91 r91Var, int i10) {
        this.f39989a = i10;
        this.f39990b = r91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39989a) {
            case 0:
                r91 r91Var = this.f39990b;
                r91Var.f40868b.setVisibility(4);
                wf.g gVar = r91Var.f40868b;
                gVar.G = false;
                wf.g gVar2 = r91Var.f40869c;
                gVar2.G = true;
                gVar.f49576v0 = 0;
                gVar2.f49576v0 = 0;
                Window window = r91Var.f40867a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                r91 r91Var2 = this.f39990b;
                wf.g gVar3 = r91Var2.f40869c;
                gVar3.setVisibility(4);
                wf.g gVar4 = r91Var2.f40868b;
                gVar4.f49576v0 = 0;
                gVar3.f49576v0 = 0;
                gVar4.G = true;
                gVar3.G = false;
                if (!(gVar4 instanceof wf.q)) {
                    gVar4.f49571r0 = true;
                    gVar4.x((gVar4.D0 * gVar4.f49550d0.f49598k) - wf.g.f49523h1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f49571r0 = false;
                    gVar4.d();
                }
                Window window2 = r91Var2.f40867a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                r91 r91Var3 = this.f39990b;
                r91Var3.f40868b.f49576v0 = 0;
                r91Var3.f40870e.setVisibility(8);
                return;
        }
    }
}
