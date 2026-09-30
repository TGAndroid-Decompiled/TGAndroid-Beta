package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f18780a;
    public final boolean f18781b;
    public final k f18782c;

    public c(k kVar, boolean z10, int i10) {
        this.f18780a = i10;
        this.f18782c = kVar;
        this.f18781b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f18780a) {
            case 0:
                if (this.f18781b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f18782c;
                kVar.f19582r1 = f7;
                kVar.b();
                return;
            default:
                if (this.f18781b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f18782c;
                kVar2.f19582r1 = f10;
                kVar2.b();
                return;
        }
    }
}
