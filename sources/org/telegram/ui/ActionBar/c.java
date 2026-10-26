package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f22488a;
    public final boolean f22489b;
    public final k f22490c;

    public c(k kVar, boolean z10, int i10) {
        this.f22488a = i10;
        this.f22490c = kVar;
        this.f22489b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f22488a) {
            case 0:
                if (this.f22489b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f22490c;
                kVar.f22793v1 = f7;
                kVar.b();
                return;
            default:
                if (this.f22489b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f22490c;
                kVar2.f22793v1 = f10;
                kVar2.b();
                return;
        }
    }
}
