package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class dm extends AnimatorListenerAdapter {
    public final boolean f35328a;
    public final boolean f35329b;
    public final boolean f35330c;
    public final fo d;

    public dm(fo foVar, boolean z10, boolean z11, boolean z12) {
        this.d = foVar;
        this.f35328a = z10;
        this.f35329b = z11;
        this.f35330c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        fo foVar = this.d;
        foVar.M2 = null;
        ImageView imageView = foVar.J2;
        int i12 = 4;
        if (this.f35328a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = foVar.L2;
        if (this.f35329b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = foVar.K2;
        if (this.f35330c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
