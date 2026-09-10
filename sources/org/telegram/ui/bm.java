package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class bm extends AnimatorListenerAdapter {
    public final boolean f31290a;
    public final boolean f31291b;
    public final boolean f31292c;
    public final eo d;

    public bm(eo eoVar, boolean z10, boolean z11, boolean z12) {
        this.d = eoVar;
        this.f31290a = z10;
        this.f31291b = z11;
        this.f31292c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        eo eoVar = this.d;
        eoVar.M2 = null;
        ImageView imageView = eoVar.J2;
        int i12 = 4;
        if (this.f31290a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = eoVar.L2;
        if (this.f31291b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = eoVar.K2;
        if (this.f31292c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
