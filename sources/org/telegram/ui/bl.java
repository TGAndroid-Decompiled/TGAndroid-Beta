package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class bl extends AnimatorListenerAdapter {
    public final boolean f45882a;
    public final boolean f45883b;
    public final boolean f45884c;
    public final bn d;

    public bl(bn bnVar, boolean z10, boolean z11, boolean z12) {
        this.d = bnVar;
        this.f45882a = z10;
        this.f45883b = z11;
        this.f45884c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        bn bnVar = this.d;
        bnVar.f45921b3 = null;
        ImageView imageView = bnVar.Y2;
        int i11 = 4;
        if (this.f45882a) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = bnVar.f45906a3;
        if (this.f45883b) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView2.setVisibility(i10);
        RadialProgressView radialProgressView = bnVar.Z2;
        if (this.f45884c) {
            i11 = 0;
        }
        radialProgressView.setVisibility(i11);
    }
}
