package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f20714a;
    public final boolean f20715b;
    public final k f20716c;

    public c(k kVar, boolean z10, int i10) {
        this.f20714a = i10;
        this.f20716c = kVar;
        this.f20715b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f20714a) {
            case 0:
                if (this.f20715b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f20716c;
                kVar.f21513s1 = f7;
                kVar.b();
                return;
            default:
                if (this.f20715b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f20716c;
                kVar2.f21513s1 = f10;
                kVar2.b();
                return;
        }
    }
}
