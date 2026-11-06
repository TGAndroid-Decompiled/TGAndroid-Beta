package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class al extends AnimatorListenerAdapter {
    public final boolean f43694a;
    public final boolean f43695b;
    public final boolean f43696c;
    public final an d;

    public al(an anVar, boolean z9, boolean z10, boolean z11) {
        this.d = anVar;
        this.f43694a = z9;
        this.f43695b = z10;
        this.f43696c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        an anVar = this.d;
        anVar.f43719a3 = null;
        ImageView imageView = anVar.X2;
        int i11 = 4;
        if (this.f43694a) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = anVar.Z2;
        if (this.f43695b) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView2.setVisibility(i10);
        RadialProgressView radialProgressView = anVar.Y2;
        if (this.f43696c) {
            i11 = 0;
        }
        radialProgressView.setVisibility(i11);
    }
}
