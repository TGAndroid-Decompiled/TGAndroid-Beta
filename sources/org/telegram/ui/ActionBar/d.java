package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f27381a;
    public final boolean f27382b;
    public final l f27383c;

    public d(l lVar, boolean z9, int i7) {
        this.f27381a = i7;
        this.f27383c = lVar;
        this.f27382b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f27381a) {
            case 0:
                if (this.f27382b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l lVar = this.f27383c;
                lVar.D1 = f10;
                lVar.h();
                return;
            default:
                if (this.f27382b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                l lVar2 = this.f27383c;
                lVar2.D1 = f11;
                lVar2.h();
                return;
        }
    }
}
