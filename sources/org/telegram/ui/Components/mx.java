package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mx extends AnimatorListenerAdapter {
    public final int f30667a;
    public final boolean f30668b;
    public final sz f30669c;

    public mx(sz szVar, boolean z10, int i10) {
        this.f30667a = i10;
        this.f30669c = szVar;
        this.f30668b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30667a) {
            case 0:
                if (!this.f30668b) {
                    this.f30669c.f32778x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30668b) {
                    this.f30669c.f32782y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
