package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class ql extends AnimatorListenerAdapter {
    public final boolean f40605a;
    public final boolean f40606b;
    public final boolean f40607c;
    public final qn d;

    public ql(qn qnVar, boolean z10, boolean z11, boolean z12) {
        this.d = qnVar;
        this.f40605a = z10;
        this.f40606b = z11;
        this.f40607c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        qn qnVar = this.d;
        qnVar.M2 = null;
        ImageView imageView = qnVar.J2;
        int i12 = 4;
        if (this.f40605a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = qnVar.L2;
        if (this.f40606b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = qnVar.K2;
        if (this.f40607c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
