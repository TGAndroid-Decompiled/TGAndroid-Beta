package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class ql extends AnimatorListenerAdapter {
    public final boolean f41744a;
    public final boolean f41745b;
    public final boolean f41746c;
    public final tn d;

    public ql(tn tnVar, boolean z10, boolean z11, boolean z12) {
        this.d = tnVar;
        this.f41744a = z10;
        this.f41745b = z11;
        this.f41746c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        tn tnVar = this.d;
        tnVar.I2 = null;
        ImageView imageView = tnVar.F2;
        int i12 = 4;
        if (this.f41744a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = tnVar.H2;
        if (this.f41745b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = tnVar.G2;
        if (this.f41746c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
