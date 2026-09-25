package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hx extends AnimatorListenerAdapter {
    public final int f24880a;
    public final boolean f24881b;
    public final lz f24882c;

    public hx(lz lzVar, boolean z10, int i10) {
        this.f24880a = i10;
        this.f24882c = lzVar;
        this.f24881b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24880a) {
            case 0:
                if (!this.f24881b) {
                    this.f24882c.f26302x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24881b) {
                    this.f24882c.f26306y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
