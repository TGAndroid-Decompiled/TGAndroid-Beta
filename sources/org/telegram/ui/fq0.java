package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class fq0 extends ImageView {
    public int f45319a;
    public boolean f45320b;
    public boolean f45321c;
    public boolean d;
    public org.telegram.ui.Components.m51 f45322e;
    public final org.telegram.ui.Components.xq f45323f;
    public ValueAnimator h;
    public final PhotoViewer f45324n;

    public fq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f45324n = photoViewer;
        this.f45319a = 0;
        this.f45320b = false;
        this.f45321c = false;
        this.d = false;
        this.f45323f = org.telegram.ui.Components.xq.f40454i;
        setAlpha(0.0f);
    }

    public static void a(fq0 fq0Var) {
        PhotoViewer photoViewer = fq0Var.f45324n;
        org.telegram.ui.Components.m51 m51Var = photoViewer.G2;
        if (m51Var != null && m51Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.G2.U() - photoViewer.G2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = fq0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    fq0Var.h = null;
                }
                fq0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.G2.d0()) {
                if (fq0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    fq0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new b3(fq0Var, 22));
                    fq0Var.h.setDuration(max);
                    fq0Var.h.setInterpolator(fq0Var.f45323f);
                    fq0Var.h.start();
                    fq0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = fq0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    fq0Var.h = null;
                }
                fq0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = fq0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            fq0Var.h = null;
        }
        fq0Var.setAlpha(0.0f);
    }
}
