package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w extends AnimatorListenerAdapter {
    public final int f39594a;
    public final y f39595b;

    public w(y yVar, int i7) {
        this.f39594a = i7;
        this.f39595b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f39594a) {
            case 0:
                y yVar = this.f39595b;
                yVar.E = false;
                yVar.invalidate();
                return;
            case 1:
                y yVar2 = this.f39595b;
                x xVar = yVar2.f39639b0;
                if (yVar2.W) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                yVar2.f39637a0 = f10;
                xVar.setAlpha(f10);
                if (yVar2.W) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                xVar.setVisibility(i7);
                yVar2.f39636a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                y yVar3 = this.f39595b;
                yVar3.J0 = null;
                u uVar = yVar3.f39636a;
                uVar.setRotationY(0.0f);
                if (!yVar3.K0) {
                    uVar.d.clearImage();
                    return;
                }
                return;
            case 3:
                this.f39595b.E = false;
                return;
            default:
                this.f39595b.E = false;
                return;
        }
    }
}
