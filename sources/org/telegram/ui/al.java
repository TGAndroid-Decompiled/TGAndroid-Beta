package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class al extends AnimatorListenerAdapter {
    public final boolean f43700a;
    public final boolean f43701b;
    public final boolean f43702c;
    public final an d;

    public al(an anVar, boolean z9, boolean z10, boolean z11) {
        this.d = anVar;
        this.f43700a = z9;
        this.f43701b = z10;
        this.f43702c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        an anVar = this.d;
        anVar.f43725a3 = null;
        ImageView imageView = anVar.X2;
        int i11 = 4;
        if (this.f43700a) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = anVar.Z2;
        if (this.f43701b) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView2.setVisibility(i10);
        RadialProgressView radialProgressView = anVar.Y2;
        if (this.f43702c) {
            i11 = 0;
        }
        radialProgressView.setVisibility(i11);
    }
}
