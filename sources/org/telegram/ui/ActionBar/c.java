package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f19512a;
    public final boolean f19513b;
    public final k f19514c;

    public c(k kVar, boolean z4, int i10) {
        this.f19512a = i10;
        this.f19514c = kVar;
        this.f19513b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f19512a) {
            case 0:
                if (this.f19513b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar = this.f19514c;
                kVar.f20313o1 = f10;
                kVar.b();
                return;
            default:
                if (this.f19513b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k kVar2 = this.f19514c;
                kVar2.f20313o1 = f11;
                kVar2.b();
                return;
        }
    }
}
