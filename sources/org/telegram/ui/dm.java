package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class dm extends AnimatorListenerAdapter {
    public final boolean f36847a;
    public final boolean f36848b;
    public final boolean f36849c;
    public final eo d;

    public dm(eo eoVar, boolean z10, boolean z11, boolean z12) {
        this.d = eoVar;
        this.f36847a = z10;
        this.f36848b = z11;
        this.f36849c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        eo eoVar = this.d;
        eoVar.M2 = null;
        ImageView imageView = eoVar.J2;
        int i12 = 4;
        if (this.f36847a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = eoVar.L2;
        if (this.f36848b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = eoVar.K2;
        if (this.f36849c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
