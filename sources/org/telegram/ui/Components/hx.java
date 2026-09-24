package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hx extends AnimatorListenerAdapter {
    public final int f24854a;
    public final boolean f24855b;
    public final lz f24856c;

    public hx(lz lzVar, boolean z10, int i10) {
        this.f24854a = i10;
        this.f24856c = lzVar;
        this.f24855b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24854a) {
            case 0:
                if (!this.f24855b) {
                    this.f24856c.f26294x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24855b) {
                    this.f24856c.f26298y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
