package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class do0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.kb kbVar;
        Drawable[] drawableArr = PhotoViewer.f43272f9;
        org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.f35083w;
        if (fcVar != null && (kbVar = fcVar.f35087e) != null) {
            kbVar.updatePosition();
        }
    }
}
