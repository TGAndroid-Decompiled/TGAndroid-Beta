package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f28814a;
    public final boolean f28815b;
    public final k f28816c;

    public c(k kVar, boolean z10, int i7) {
        this.f28814a = i7;
        this.f28816c = kVar;
        this.f28815b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f28814a) {
            case 0:
                if (this.f28815b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar = this.f28816c;
                kVar.E1 = f10;
                kVar.i();
                return;
            default:
                if (this.f28815b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k kVar2 = this.f28816c;
                kVar2.E1 = f11;
                kVar2.i();
                return;
        }
    }
}
