package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f22754a;
    public final boolean f22755b;
    public final k f22756c;

    public c(k kVar, boolean z10, int i9) {
        this.f22754a = i9;
        this.f22756c = kVar;
        this.f22755b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f22754a) {
            case 0:
                if (this.f22755b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar = this.f22756c;
                kVar.f23585n1 = f10;
                kVar.b();
                return;
            default:
                if (this.f22755b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k kVar2 = this.f22756c;
                kVar2.f23585n1 = f11;
                kVar2.b();
                return;
        }
    }
}
