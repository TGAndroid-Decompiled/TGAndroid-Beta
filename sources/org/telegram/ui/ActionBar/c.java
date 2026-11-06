package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f27366a;
    public final boolean f27367b;
    public final k f27368c;

    public c(k kVar, boolean z9, int i7) {
        this.f27366a = i7;
        this.f27368c = kVar;
        this.f27367b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f27366a) {
            case 0:
                if (this.f27367b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar = this.f27368c;
                kVar.D1 = f10;
                kVar.f();
                return;
            default:
                if (this.f27367b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k kVar2 = this.f27368c;
                kVar2.D1 = f11;
                kVar2.f();
                return;
        }
    }
}
