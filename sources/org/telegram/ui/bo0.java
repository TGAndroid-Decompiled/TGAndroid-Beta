package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class bo0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.lb lbVar;
        Drawable[] drawableArr = PhotoViewer.Z8;
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35453w;
        if (gcVar != null && (lbVar = gcVar.f35457e) != null) {
            lbVar.updatePosition();
        }
    }
}
