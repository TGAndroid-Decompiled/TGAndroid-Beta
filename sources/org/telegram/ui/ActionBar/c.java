package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f27440a;
    public final boolean f27441b;
    public final k f27442c;

    public c(k kVar, boolean z10, int i3) {
        this.f27440a = i3;
        this.f27442c = kVar;
        this.f27441b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f27440a) {
            case 0:
                if (this.f27441b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar = this.f27442c;
                kVar.E1 = f10;
                kVar.f();
                return;
            default:
                if (this.f27441b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k kVar2 = this.f27442c;
                kVar2.E1 = f11;
                kVar2.f();
                return;
        }
    }
}
