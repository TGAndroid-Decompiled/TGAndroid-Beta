package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class al extends AnimatorListenerAdapter {
    public final boolean f45098a;
    public final boolean f45099b;
    public final boolean f45100c;
    public final an d;

    public al(an anVar, boolean z10, boolean z11, boolean z12) {
        this.d = anVar;
        this.f45098a = z10;
        this.f45099b = z11;
        this.f45100c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        an anVar = this.d;
        anVar.f45135b3 = null;
        ImageView imageView = anVar.Y2;
        int i11 = 4;
        if (this.f45098a) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = anVar.f45120a3;
        if (this.f45099b) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView2.setVisibility(i10);
        RadialProgressView radialProgressView = anVar.Z2;
        if (this.f45100c) {
            i11 = 0;
        }
        radialProgressView.setVisibility(i11);
    }
}
