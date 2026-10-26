package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class hu0 extends ImageView {
    public int f40088a;
    public boolean f40089b;
    public boolean f40090c;
    public boolean d;
    public org.telegram.ui.Components.s81 e;
    public final org.telegram.ui.Components.ds f40091f;
    public ValueAnimator h;
    public final PhotoViewer f40092n;

    public hu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f40092n = photoViewer;
        this.f40088a = 0;
        this.f40089b = false;
        this.f40090c = false;
        this.d = false;
        this.f40091f = org.telegram.ui.Components.ds.f27588i;
        setAlpha(0.0f);
    }

    public static void a(hu0 hu0Var) {
        PhotoViewer photoViewer = hu0Var.f40092n;
        org.telegram.ui.Components.s81 s81Var = photoViewer.F2;
        if (s81Var != null && s81Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = hu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    hu0Var.h = null;
                }
                hu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (hu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    hu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new b3(hu0Var, 23));
                    hu0Var.h.setDuration(max);
                    hu0Var.h.setInterpolator(hu0Var.f40091f);
                    hu0Var.h.start();
                    hu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = hu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    hu0Var.h = null;
                }
                hu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = hu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            hu0Var.h = null;
        }
        hu0Var.setAlpha(0.0f);
    }
}
