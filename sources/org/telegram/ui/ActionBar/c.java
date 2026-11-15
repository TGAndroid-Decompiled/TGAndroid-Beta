package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f28470a;
    public final boolean f28471b;
    public final k f28472c;

    public c(k kVar, boolean z10, int i7) {
        this.f28470a = i7;
        this.f28472c = kVar;
        this.f28471b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f28470a) {
            case 0:
                if (this.f28471b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar = this.f28472c;
                kVar.E1 = f10;
                kVar.i();
                return;
            default:
                if (this.f28471b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k kVar2 = this.f28472c;
                kVar2.E1 = f11;
                kVar2.i();
                return;
        }
    }
}
