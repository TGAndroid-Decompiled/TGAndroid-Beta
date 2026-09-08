package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class bs0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.ub ubVar;
        Drawable[] drawableArr = PhotoViewer.T8;
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29698w;
        if (qcVar != null && (ubVar = qcVar.f29702e) != null) {
            ubVar.updatePosition();
        }
    }
}
