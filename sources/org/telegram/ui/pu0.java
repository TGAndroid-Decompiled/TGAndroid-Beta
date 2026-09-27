package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class pu0 extends ImageView {
    public int f36547a;
    public boolean f36548b;
    public boolean f36549c;
    public boolean d;
    public org.telegram.ui.Components.u71 e;
    public final org.telegram.ui.Components.sr f36550f;
    public ValueAnimator h;
    public final PhotoViewer f36551n;

    public pu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f36551n = photoViewer;
        this.f36547a = 0;
        this.f36548b = false;
        this.f36549c = false;
        this.d = false;
        this.f36550f = org.telegram.ui.Components.sr.f28361i;
        setAlpha(0.0f);
    }

    public static void a(pu0 pu0Var) {
        PhotoViewer photoViewer = pu0Var.f36551n;
        org.telegram.ui.Components.u71 u71Var = photoViewer.F2;
        if (u71Var != null && u71Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = pu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    pu0Var.h = null;
                }
                pu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (pu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    pu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new d3(pu0Var, 23));
                    pu0Var.h.setDuration(max);
                    pu0Var.h.setInterpolator(pu0Var.f36550f);
                    pu0Var.h.start();
                    pu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = pu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    pu0Var.h = null;
                }
                pu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = pu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            pu0Var.h = null;
        }
        pu0Var.setAlpha(0.0f);
    }
}
