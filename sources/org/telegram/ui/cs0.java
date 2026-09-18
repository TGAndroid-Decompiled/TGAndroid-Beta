package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class cs0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.ub ubVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27543w;
        if (qcVar != null && (ubVar = qcVar.e) != null) {
            ubVar.updatePosition();
        }
    }
}
