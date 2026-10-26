package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mx extends AnimatorListenerAdapter {
    public final int f30768a;
    public final boolean f30769b;
    public final sz f30770c;

    public mx(sz szVar, boolean z10, int i10) {
        this.f30768a = i10;
        this.f30770c = szVar;
        this.f30769b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30768a) {
            case 0:
                if (!this.f30769b) {
                    this.f30770c.f32784x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30769b) {
                    this.f30770c.f32788y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
