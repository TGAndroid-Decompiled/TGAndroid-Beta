package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class iw extends AnimatorListenerAdapter {
    public final int f35743a;
    public final boolean f35744b;
    public final ly f35745c;

    public iw(ly lyVar, boolean z10, int i7) {
        this.f35743a = i7;
        this.f35745c = lyVar;
        this.f35744b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35743a) {
            case 0:
                if (!this.f35744b) {
                    this.f35745c.f37006y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f35744b) {
                    this.f35745c.E.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
