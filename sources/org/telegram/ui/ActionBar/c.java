package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f20189a;
    public final boolean f20190b;
    public final l f20191c;

    public c(l lVar, boolean z10, int i10) {
        this.f20189a = i10;
        this.f20191c = lVar;
        this.f20190b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f20189a) {
            case 0:
                if (this.f20190b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                l lVar = this.f20191c;
                lVar.D1 = f7;
                lVar.f();
                return;
            default:
                if (this.f20190b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l lVar2 = this.f20191c;
                lVar2.D1 = f10;
                lVar2.f();
                return;
        }
    }
}
