package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w extends AnimatorListenerAdapter {
    public final int f41277a;
    public final y f41278b;

    public w(y yVar, int i7) {
        this.f41277a = i7;
        this.f41278b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f41277a) {
            case 0:
                y yVar = this.f41278b;
                yVar.F = false;
                yVar.invalidate();
                return;
            case 1:
                y yVar2 = this.f41278b;
                x xVar = yVar2.f41330c0;
                if (yVar2.f41326a0) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                yVar2.f41328b0 = f10;
                xVar.setAlpha(f10);
                if (yVar2.f41326a0) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                xVar.setVisibility(i7);
                yVar2.f41325a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                y yVar3 = this.f41278b;
                yVar3.K0 = null;
                u uVar = yVar3.f41325a;
                uVar.setRotationY(0.0f);
                if (!yVar3.L0) {
                    uVar.d.clearImage();
                    return;
                }
                return;
            case 3:
                this.f41278b.F = false;
                return;
            default:
                this.f41278b.F = false;
                return;
        }
    }
}
