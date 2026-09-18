package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f18710a;
    public final boolean f18711b;
    public final k f18712c;

    public c(k kVar, boolean z10, int i10) {
        this.f18710a = i10;
        this.f18712c = kVar;
        this.f18711b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f18710a) {
            case 0:
                if (this.f18711b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f18712c;
                kVar.f19518s1 = f7;
                kVar.b();
                return;
            default:
                if (this.f18711b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f18712c;
                kVar2.f19518s1 = f10;
                kVar2.b();
                return;
        }
    }
}
