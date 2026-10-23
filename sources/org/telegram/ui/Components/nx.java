package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nx extends AnimatorListenerAdapter {
    public final int f29032a;
    public final boolean f29033b;
    public final tz f29034c;

    public nx(tz tzVar, boolean z10, int i10) {
        this.f29032a = i10;
        this.f29034c = tzVar;
        this.f29033b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29032a) {
            case 0:
                if (!this.f29033b) {
                    this.f29034c.f31031x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f29033b) {
                    this.f29034c.f31035y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
