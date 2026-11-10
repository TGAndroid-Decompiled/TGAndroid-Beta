package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class cl extends AnimatorListenerAdapter {
    public final boolean f44397a;
    public final boolean f44398b;
    public final boolean f44399c;
    public final cn d;

    public cl(cn cnVar, boolean z9, boolean z10, boolean z11) {
        this.d = cnVar;
        this.f44397a = z9;
        this.f44398b = z10;
        this.f44399c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        cn cnVar = this.d;
        cnVar.f44421a3 = null;
        ImageView imageView = cnVar.X2;
        int i11 = 4;
        if (this.f44397a) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = cnVar.Z2;
        if (this.f44398b) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView2.setVisibility(i10);
        RadialProgressView radialProgressView = cnVar.Y2;
        if (this.f44399c) {
            i11 = 0;
        }
        radialProgressView.setVisibility(i11);
    }
}
