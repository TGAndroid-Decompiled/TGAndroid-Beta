package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class du0 extends ImageView {
    public int f36735a;
    public boolean f36736b;
    public boolean f36737c;
    public boolean d;
    public org.telegram.ui.Components.j81 e;
    public final org.telegram.ui.Components.bs f36738f;
    public ValueAnimator h;
    public final PhotoViewer f36739n;

    public du0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f36739n = photoViewer;
        this.f36735a = 0;
        this.f36736b = false;
        this.f36737c = false;
        this.d = false;
        this.f36738f = org.telegram.ui.Components.bs.f25135i;
        setAlpha(0.0f);
    }

    public static void a(du0 du0Var) {
        PhotoViewer photoViewer = du0Var.f36739n;
        org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
        if (j81Var != null && j81Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = du0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    du0Var.h = null;
                }
                du0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (du0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    du0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new d3(du0Var, 24));
                    du0Var.h.setDuration(max);
                    du0Var.h.setInterpolator(du0Var.f36738f);
                    du0Var.h.start();
                    du0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = du0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    du0Var.h = null;
                }
                du0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = du0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            du0Var.h = null;
        }
        du0Var.setAlpha(0.0f);
    }
}
