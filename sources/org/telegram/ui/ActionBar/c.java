package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f19350a;
    public final boolean f19351b;
    public final k f19352c;

    public c(k kVar, boolean z10, int i10) {
        this.f19350a = i10;
        this.f19352c = kVar;
        this.f19351b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f19350a) {
            case 0:
                if (this.f19351b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f19352c;
                kVar.f20155s1 = f7;
                kVar.b();
                return;
            default:
                if (this.f19351b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f19352c;
                kVar2.f20155s1 = f10;
                kVar2.b();
                return;
        }
    }
}
