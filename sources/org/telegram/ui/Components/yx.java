package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yx extends AnimatorListenerAdapter {
    public final int f33220a;
    public final boolean f33221b;
    public final d00 f33222c;

    public yx(d00 d00Var, boolean z10, int i10) {
        this.f33220a = i10;
        this.f33222c = d00Var;
        this.f33221b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33220a) {
            case 0:
                if (!this.f33221b) {
                    this.f33222c.f25138x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f33221b) {
                    this.f33222c.f25142y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
