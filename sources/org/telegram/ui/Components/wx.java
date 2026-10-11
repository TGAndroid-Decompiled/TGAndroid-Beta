package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wx extends AnimatorListenerAdapter {
    public final int f32803a;
    public final boolean f32804b;
    public final b00 f32805c;

    public wx(b00 b00Var, boolean z10, int i10) {
        this.f32803a = i10;
        this.f32805c = b00Var;
        this.f32804b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32803a) {
            case 0:
                if (!this.f32804b) {
                    this.f32805c.f24797x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f32804b) {
                    this.f32805c.f24801y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
