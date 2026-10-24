package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f20735a;
    public final boolean f20736b;
    public final k f20737c;

    public c(k kVar, boolean z10, int i10) {
        this.f20735a = i10;
        this.f20737c = kVar;
        this.f20736b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f20735a) {
            case 0:
                if (this.f20736b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f20737c;
                kVar.f21084t1 = f7;
                kVar.b();
                return;
            default:
                if (this.f20736b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f20737c;
                kVar2.f21084t1 = f10;
                kVar2.b();
                return;
        }
    }
}
