package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class hu0 extends ImageView {
    public int f37478a;
    public boolean f37479b;
    public boolean f37480c;
    public boolean d;
    public org.telegram.ui.Components.j71 f37481e;
    public final org.telegram.ui.Components.pr f37482f;
    public ValueAnimator h;
    public final PhotoViewer f37483n;

    public hu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f37483n = photoViewer;
        this.f37478a = 0;
        this.f37479b = false;
        this.f37480c = false;
        this.d = false;
        this.f37482f = org.telegram.ui.Components.pr.f30170i;
        setAlpha(0.0f);
    }

    public static void a(hu0 hu0Var) {
        PhotoViewer photoViewer = hu0Var.f37483n;
        org.telegram.ui.Components.j71 j71Var = photoViewer.C2;
        if (j71Var != null && j71Var.p() != -9223372036854775807L) {
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
                    ofFloat.addUpdateListener(new e3(hu0Var, 24));
                    hu0Var.h.setDuration(max);
                    hu0Var.h.setInterpolator(hu0Var.f37482f);
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
