package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xf0 extends AnimatorListenerAdapter {
    public final int f29015a;
    public final yf0 f29016b;

    public xf0(yf0 yf0Var, int i10) {
        this.f29015a = i10;
        this.f29016b = yf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29015a) {
            case 0:
                this.f29016b.f29318a.f29662n.setVisibility(8);
                return;
            default:
                this.f29016b.f29318a.h.setVisibility(8);
                return;
        }
    }
}
