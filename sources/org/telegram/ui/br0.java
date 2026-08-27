package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

public final class br0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.jb jbVar;
        Drawable[] drawableArr = PhotoViewer.P8;
        org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
        if (ecVar == null || (jbVar = ecVar.f28016e) == null) {
            return;
        }
        jbVar.updatePosition();
    }
}
