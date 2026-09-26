package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hx extends AnimatorListenerAdapter {
    public final int f24879a;
    public final boolean f24880b;
    public final lz f24881c;

    public hx(lz lzVar, boolean z10, int i10) {
        this.f24879a = i10;
        this.f24881c = lzVar;
        this.f24880b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24879a) {
            case 0:
                if (!this.f24880b) {
                    this.f24881c.f26301x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24880b) {
                    this.f24881c.f26305y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
