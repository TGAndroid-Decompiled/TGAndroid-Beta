package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22341a;
    public final boolean f22342b;
    public final m8 f22343c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22341a = i10;
        this.f22343c = m8Var;
        this.f22342b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22341a) {
            case 0:
                if (!this.f22342b) {
                    this.f22343c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22342b) {
                    this.f22343c.f22464x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22341a) {
            case 0:
                if (this.f22342b) {
                    this.f22343c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22342b) {
                    this.f22343c.f22464x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
