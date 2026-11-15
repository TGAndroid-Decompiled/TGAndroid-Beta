package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final int f41033a;
    public final z f41034b;

    public x(z zVar, int i7) {
        this.f41033a = i7;
        this.f41034b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f41033a) {
            case 0:
                z zVar = this.f41034b;
                zVar.F = false;
                zVar.invalidate();
                return;
            case 1:
                z zVar2 = this.f41034b;
                y yVar = zVar2.f41086c0;
                if (zVar2.f41082a0) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                zVar2.f41084b0 = f10;
                yVar.setAlpha(f10);
                if (zVar2.f41082a0) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                yVar.setVisibility(i7);
                zVar2.f41081a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                z zVar3 = this.f41034b;
                zVar3.K0 = null;
                v vVar = zVar3.f41081a;
                vVar.setRotationY(0.0f);
                if (!zVar3.L0) {
                    vVar.d.clearImage();
                    return;
                }
                return;
            case 3:
                this.f41034b.F = false;
                return;
            default:
                this.f41034b.F = false;
                return;
        }
    }
}
