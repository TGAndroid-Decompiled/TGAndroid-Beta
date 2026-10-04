package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f20476a;
    public final boolean f20477b;
    public final k f20478c;

    public c(k kVar, boolean z10, int i10) {
        this.f20476a = i10;
        this.f20478c = kVar;
        this.f20477b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f20476a) {
            case 0:
                if (this.f20477b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f20478c;
                kVar.f21294u1 = f7;
                kVar.b();
                return;
            default:
                if (this.f20477b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f20478c;
                kVar2.f21294u1 = f10;
                kVar2.b();
                return;
        }
    }
}
