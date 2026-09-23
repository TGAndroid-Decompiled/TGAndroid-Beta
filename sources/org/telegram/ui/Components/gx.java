package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx extends AnimatorListenerAdapter {
    public final int f24433a;
    public final boolean f24434b;
    public final lz f24435c;

    public gx(lz lzVar, boolean z10, int i10) {
        this.f24433a = i10;
        this.f24435c = lzVar;
        this.f24434b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24433a) {
            case 0:
                if (!this.f24434b) {
                    this.f24435c.f26033x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24434b) {
                    this.f24435c.f26037y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
