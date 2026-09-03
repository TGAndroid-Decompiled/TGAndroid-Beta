package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class hu0 extends ImageView {
    public int f34754a;
    public boolean f34755b;
    public boolean f34756c;
    public boolean d;
    public org.telegram.ui.Components.i71 e;
    public final org.telegram.ui.Components.mr f34757f;
    public ValueAnimator h;
    public final PhotoViewer f34758n;

    public hu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f34758n = photoViewer;
        this.f34754a = 0;
        this.f34755b = false;
        this.f34756c = false;
        this.d = false;
        this.f34757f = org.telegram.ui.Components.mr.f27124i;
        setAlpha(0.0f);
    }

    public static void a(hu0 hu0Var) {
        PhotoViewer photoViewer = hu0Var.f34758n;
        org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
        if (i71Var != null && i71Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.C2.p() - photoViewer.C2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = hu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    hu0Var.h = null;
                }
                hu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.C2.y()) {
                if (hu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    hu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new g3(hu0Var, 24));
                    hu0Var.h.setDuration(max);
                    hu0Var.h.setInterpolator(hu0Var.f34757f);
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
