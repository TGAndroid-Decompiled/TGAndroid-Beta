package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f27369a;
    public final boolean f27370b;
    public final k f27371c;

    public c(k kVar, boolean z9, int i7) {
        this.f27369a = i7;
        this.f27371c = kVar;
        this.f27370b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f27369a) {
            case 0:
                if (this.f27370b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar = this.f27371c;
                kVar.D1 = f10;
                kVar.f();
                return;
            default:
                if (this.f27370b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k kVar2 = this.f27371c;
                kVar2.D1 = f11;
                kVar2.f();
                return;
        }
    }
}
