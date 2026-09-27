package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f18709a;
    public final boolean f18710b;
    public final l f18711c;

    public c(l lVar, boolean z10, int i10) {
        this.f18709a = i10;
        this.f18711c = lVar;
        this.f18710b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f18709a) {
            case 0:
                if (this.f18710b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                l lVar = this.f18711c;
                lVar.f19592w1 = f7;
                lVar.b();
                return;
            default:
                if (this.f18710b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l lVar2 = this.f18711c;
                lVar2.f19592w1 = f10;
                lVar2.b();
                return;
        }
    }
}
