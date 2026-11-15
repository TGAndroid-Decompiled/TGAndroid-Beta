package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class iw extends AnimatorListenerAdapter {
    public final int f35730a;
    public final boolean f35731b;
    public final ly f35732c;

    public iw(ly lyVar, boolean z10, int i7) {
        this.f35730a = i7;
        this.f35732c = lyVar;
        this.f35731b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35730a) {
            case 0:
                if (!this.f35731b) {
                    this.f35732c.f37006y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f35731b) {
                    this.f35732c.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
