package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wx extends AnimatorListenerAdapter {
    public final int f32773a;
    public final boolean f32774b;
    public final b00 f32775c;

    public wx(b00 b00Var, boolean z10, int i10) {
        this.f32773a = i10;
        this.f32775c = b00Var;
        this.f32774b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32773a) {
            case 0:
                if (!this.f32774b) {
                    this.f32775c.f24755x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f32774b) {
                    this.f32775c.f24759y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
