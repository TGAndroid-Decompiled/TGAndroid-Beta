package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class av0 extends ImageView {
    public int f34103a;
    public boolean f34104b;
    public boolean f34105c;
    public boolean d;
    public org.telegram.ui.Components.i81 e;
    public final org.telegram.ui.Components.es f34106f;
    public ValueAnimator h;
    public final PhotoViewer f34107n;

    public av0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f34107n = photoViewer;
        this.f34103a = 0;
        this.f34104b = false;
        this.f34105c = false;
        this.d = false;
        this.f34106f = org.telegram.ui.Components.es.f24467i;
        setAlpha(0.0f);
    }

    public static void a(av0 av0Var) {
        PhotoViewer photoViewer = av0Var.f34107n;
        org.telegram.ui.Components.i81 i81Var = photoViewer.F2;
        if (i81Var != null && i81Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = av0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    av0Var.h = null;
                }
                av0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (av0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    av0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new e3(av0Var, 24));
                    av0Var.h.setDuration(max);
                    av0Var.h.setInterpolator(av0Var.f34106f);
                    av0Var.h.start();
                    av0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = av0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    av0Var.h = null;
                }
                av0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = av0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            av0Var.h = null;
        }
        av0Var.setAlpha(0.0f);
    }
}
