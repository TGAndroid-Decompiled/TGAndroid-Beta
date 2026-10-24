package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class cu0 extends ImageView {
    public int f36400a;
    public boolean f36401b;
    public boolean f36402c;
    public boolean d;
    public org.telegram.ui.Components.j81 e;
    public final org.telegram.ui.Components.zr f36403f;
    public ValueAnimator h;
    public final PhotoViewer f36404n;

    public cu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f36404n = photoViewer;
        this.f36400a = 0;
        this.f36401b = false;
        this.f36402c = false;
        this.d = false;
        this.f36403f = org.telegram.ui.Components.zr.f33339i;
        setAlpha(0.0f);
    }

    public static void a(cu0 cu0Var) {
        PhotoViewer photoViewer = cu0Var.f36404n;
        org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
        if (j81Var != null && j81Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = cu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    cu0Var.h = null;
                }
                cu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (cu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    cu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new d3(cu0Var, 24));
                    cu0Var.h.setDuration(max);
                    cu0Var.h.setInterpolator(cu0Var.f36403f);
                    cu0Var.h.start();
                    cu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = cu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    cu0Var.h = null;
                }
                cu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = cu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            cu0Var.h = null;
        }
        cu0Var.setAlpha(0.0f);
    }
}
