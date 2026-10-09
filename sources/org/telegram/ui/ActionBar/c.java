package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f20481a;
    public final boolean f20482b;
    public final k f20483c;

    public c(k kVar, boolean z10, int i10) {
        this.f20481a = i10;
        this.f20483c = kVar;
        this.f20482b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f20481a) {
            case 0:
                if (this.f20482b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f20483c;
                kVar.f21298s1 = f7;
                kVar.b();
                return;
            default:
                if (this.f20482b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f20483c;
                kVar2.f21298s1 = f10;
                kVar2.b();
                return;
        }
    }
}
