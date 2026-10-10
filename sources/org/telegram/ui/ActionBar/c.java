package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f20485a;
    public final boolean f20486b;
    public final k f20487c;

    public c(k kVar, boolean z10, int i10) {
        this.f20485a = i10;
        this.f20487c = kVar;
        this.f20486b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f20485a) {
            case 0:
                if (this.f20486b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f20487c;
                kVar.f21302s1 = f7;
                kVar.b();
                return;
            default:
                if (this.f20486b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f20487c;
                kVar2.f21302s1 = f10;
                kVar2.b();
                return;
        }
    }
}
