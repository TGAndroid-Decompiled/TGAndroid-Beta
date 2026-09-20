package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class cs0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.tb tbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f27245w;
        if (pcVar != null && (tbVar = pcVar.e) != null) {
            tbVar.updatePosition();
        }
    }
}
