package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class nr0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.nb nbVar;
        Drawable[] drawableArr = PhotoViewer.Q8;
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f27770w;
        if (icVar != null && (nbVar = icVar.f27774e) != null) {
            nbVar.updatePosition();
        }
    }
}
