package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class di extends AnimatorListenerAdapter {
    public final boolean f36770a;
    public final boolean f36771b;
    public final boolean f36772c;
    public final un d;

    public di(un unVar, boolean z10, boolean z11, boolean z12) {
        this.d = unVar;
        this.f36770a = z10;
        this.f36771b = z11;
        this.f36772c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        un unVar = this.d;
        unVar.f42181a3 = null;
        ImageView imageView = unVar.X2;
        int i12 = 4;
        if (this.f36770a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = unVar.Z2;
        if (this.f36771b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = unVar.Y2;
        if (this.f36772c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
