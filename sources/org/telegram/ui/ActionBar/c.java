package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f20293a;
    public final boolean f20294b;
    public final k f20295c;

    public c(k kVar, boolean z10, int i10) {
        this.f20293a = i10;
        this.f20295c = kVar;
        this.f20294b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f20293a) {
            case 0:
                if (this.f20294b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f20295c;
                kVar.f21114r1 = f7;
                kVar.b();
                return;
            default:
                if (this.f20294b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f20295c;
                kVar2.f21114r1 = f10;
                kVar2.b();
                return;
        }
    }
}
