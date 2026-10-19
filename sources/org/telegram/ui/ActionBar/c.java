package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f20708a;
    public final boolean f20709b;
    public final k f20710c;

    public c(k kVar, boolean z10, int i10) {
        this.f20708a = i10;
        this.f20710c = kVar;
        this.f20709b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f20708a) {
            case 0:
                if (this.f20709b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f20710c;
                kVar.f21507s1 = f7;
                kVar.b();
                return;
            default:
                if (this.f20709b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f20710c;
                kVar2.f21507s1 = f10;
                kVar2.b();
                return;
        }
    }
}
