package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f21202a;
    public final boolean f21203b;
    public final k f21204c;

    public c(k kVar, boolean z4, int i10) {
        this.f21202a = i10;
        this.f21204c = kVar;
        this.f21203b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f21202a) {
            case 0:
                if (this.f21203b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar = this.f21204c;
                kVar.f21556o1 = f10;
                kVar.b();
                return;
            default:
                if (this.f21203b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k kVar2 = this.f21204c;
                kVar2.f21556o1 = f11;
                kVar2.b();
                return;
        }
    }
}
