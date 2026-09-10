package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f17564a;
    public final boolean f17565b;
    public final l f17566c;

    public c(l lVar, boolean z10, int i10) {
        this.f17564a = i10;
        this.f17566c = lVar;
        this.f17565b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f17564a) {
            case 0:
                if (this.f17565b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                l lVar = this.f17566c;
                lVar.f18399r1 = f7;
                lVar.b();
                return;
            default:
                if (this.f17565b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l lVar2 = this.f17566c;
                lVar2.f18399r1 = f10;
                lVar2.b();
                return;
        }
    }
}
