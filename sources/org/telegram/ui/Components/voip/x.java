package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final int f41309a;
    public final z f41310b;

    public x(z zVar, int i7) {
        this.f41309a = i7;
        this.f41310b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        switch (this.f41309a) {
            case 0:
                z zVar = this.f41310b;
                zVar.F = false;
                zVar.invalidate();
                return;
            case 1:
                z zVar2 = this.f41310b;
                y yVar = zVar2.f41362c0;
                if (zVar2.f41358a0) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                zVar2.f41360b0 = f10;
                yVar.setAlpha(f10);
                if (zVar2.f41358a0) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                yVar.setVisibility(i7);
                zVar2.f41357a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                z zVar3 = this.f41310b;
                zVar3.K0 = null;
                v vVar = zVar3.f41357a;
                vVar.setRotationY(0.0f);
                if (!zVar3.L0) {
                    vVar.d.clearImage();
                    return;
                }
                return;
            case 3:
                this.f41310b.F = false;
                return;
            default:
                this.f41310b.F = false;
                return;
        }
    }
}
