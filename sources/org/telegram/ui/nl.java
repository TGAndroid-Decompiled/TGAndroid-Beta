package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class nl extends AnimatorListenerAdapter {
    public final boolean f40768a;
    public final boolean f40769b;
    public final boolean f40770c;
    public final qn d;

    public nl(qn qnVar, boolean z10, boolean z11, boolean z12) {
        this.d = qnVar;
        this.f40768a = z10;
        this.f40769b = z11;
        this.f40770c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        int i10;
        qn qnVar = this.d;
        qnVar.I2 = null;
        ImageView imageView = qnVar.F2;
        int i11 = 4;
        if (this.f40768a) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        imageView.setVisibility(i9);
        ImageView imageView2 = qnVar.H2;
        if (this.f40769b) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView2.setVisibility(i10);
        RadialProgressView radialProgressView = qnVar.G2;
        if (this.f40770c) {
            i11 = 0;
        }
        radialProgressView.setVisibility(i11);
    }
}
