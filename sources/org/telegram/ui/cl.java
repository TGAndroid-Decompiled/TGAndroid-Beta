package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class cl extends AnimatorListenerAdapter {
    public final boolean f44355a;
    public final boolean f44356b;
    public final boolean f44357c;
    public final cn d;

    public cl(cn cnVar, boolean z9, boolean z10, boolean z11) {
        this.d = cnVar;
        this.f44355a = z9;
        this.f44356b = z10;
        this.f44357c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        cn cnVar = this.d;
        cnVar.f44380a3 = null;
        ImageView imageView = cnVar.X2;
        int i11 = 4;
        if (this.f44355a) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = cnVar.Z2;
        if (this.f44356b) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView2.setVisibility(i10);
        RadialProgressView radialProgressView = cnVar.Y2;
        if (this.f44357c) {
            i11 = 0;
        }
        radialProgressView.setVisibility(i11);
    }
}
