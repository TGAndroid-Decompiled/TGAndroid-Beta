package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m8 extends AnimatorListenerAdapter {
    public final int f24487a;
    public final boolean f24488b;
    public final p8 f24489c;

    public m8(p8 p8Var, boolean z10, int i10) {
        this.f24487a = i10;
        this.f24489c = p8Var;
        this.f24488b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24487a) {
            case 0:
                if (!this.f24488b) {
                    this.f24489c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24488b) {
                    this.f24489c.f24780x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f24487a) {
            case 0:
                if (this.f24488b) {
                    this.f24489c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f24488b) {
                    this.f24489c.f24780x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
