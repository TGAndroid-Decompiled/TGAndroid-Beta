package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f27361a;
    public final boolean f27362b;
    public final k f27363c;

    public c(k kVar, boolean z9, int i7) {
        this.f27361a = i7;
        this.f27363c = kVar;
        this.f27362b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f27361a) {
            case 0:
                if (this.f27362b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar = this.f27363c;
                kVar.D1 = f10;
                kVar.g();
                return;
            default:
                if (this.f27362b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k kVar2 = this.f27363c;
                kVar2.D1 = f11;
                kVar2.g();
                return;
        }
    }
}
