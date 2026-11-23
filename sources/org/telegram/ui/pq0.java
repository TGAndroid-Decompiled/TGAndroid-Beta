package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class pq0 extends ImageView {
    public int f51093a;
    public boolean f51094b;
    public boolean f51095c;
    public boolean d;
    public org.telegram.ui.Components.h61 f51096e;
    public final org.telegram.ui.Components.kr f51097f;
    public ValueAnimator h;
    public final PhotoViewer f51098n;

    public pq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f51098n = photoViewer;
        this.f51093a = 0;
        this.f51094b = false;
        this.f51095c = false;
        this.d = false;
        this.f51097f = org.telegram.ui.Components.kr.f36860i;
        setAlpha(0.0f);
    }

    public static void a(pq0 pq0Var) {
        PhotoViewer photoViewer = pq0Var.f51098n;
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null && h61Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.G2.U() - photoViewer.G2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = pq0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    pq0Var.h = null;
                }
                pq0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.G2.d0()) {
                if (pq0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    pq0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new a3(pq0Var, 22));
                    pq0Var.h.setDuration(max);
                    pq0Var.h.setInterpolator(pq0Var.f51097f);
                    pq0Var.h.start();
                    pq0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = pq0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    pq0Var.h = null;
                }
                pq0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = pq0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            pq0Var.h = null;
        }
        pq0Var.setAlpha(0.0f);
    }
}
