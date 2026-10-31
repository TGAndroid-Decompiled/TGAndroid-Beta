package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f20188a;
    public final boolean f20189b;
    public final l f20190c;

    public c(l lVar, boolean z10, int i10) {
        this.f20188a = i10;
        this.f20190c = lVar;
        this.f20189b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f20188a) {
            case 0:
                if (this.f20189b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                l lVar = this.f20190c;
                lVar.C1 = f7;
                lVar.f();
                return;
            default:
                if (this.f20189b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l lVar2 = this.f20190c;
                lVar2.C1 = f10;
                lVar2.f();
                return;
        }
    }
}
