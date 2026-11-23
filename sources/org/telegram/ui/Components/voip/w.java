package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w extends AnimatorListenerAdapter {
    public final int f41414a;
    public final y f41415b;

    public w(y yVar, int i7) {
        this.f41414a = i7;
        this.f41415b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f41414a) {
            case 0:
                y yVar = this.f41415b;
                yVar.F = false;
                yVar.invalidate();
                return;
            case 1:
                y yVar2 = this.f41415b;
                x xVar = yVar2.f41467c0;
                if (yVar2.f41463a0) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                yVar2.f41465b0 = f10;
                xVar.setAlpha(f10);
                if (yVar2.f41463a0) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                xVar.setVisibility(i7);
                yVar2.f41462a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                y yVar3 = this.f41415b;
                yVar3.K0 = null;
                u uVar = yVar3.f41462a;
                uVar.setRotationY(0.0f);
                if (!yVar3.L0) {
                    uVar.d.clearImage();
                    return;
                }
                return;
            case 3:
                this.f41415b.F = false;
                return;
            default:
                this.f41415b.F = false;
                return;
        }
    }
}
