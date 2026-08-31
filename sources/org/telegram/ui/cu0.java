package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class cu0 extends ImageView {
    public int f35909a;
    public boolean f35910b;
    public boolean f35911c;
    public boolean d;
    public org.telegram.ui.Components.k71 f35912e;
    public final org.telegram.ui.Components.pr f35913f;
    public ValueAnimator h;
    public final PhotoViewer f35914n;

    public cu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f35914n = photoViewer;
        this.f35909a = 0;
        this.f35910b = false;
        this.f35911c = false;
        this.d = false;
        this.f35913f = org.telegram.ui.Components.pr.f30185i;
        setAlpha(0.0f);
    }

    public static void a(cu0 cu0Var) {
        PhotoViewer photoViewer = cu0Var.f35914n;
        org.telegram.ui.Components.k71 k71Var = photoViewer.C2;
        if (k71Var != null && k71Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.C2.p() - photoViewer.C2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = cu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    cu0Var.h = null;
                }
                cu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.C2.y()) {
                if (cu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    cu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new e3(cu0Var, 24));
                    cu0Var.h.setDuration(max);
                    cu0Var.h.setInterpolator(cu0Var.f35913f);
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
