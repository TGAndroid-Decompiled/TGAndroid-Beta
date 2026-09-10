package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class bs0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.tb tbVar;
        Drawable[] drawableArr = PhotoViewer.T8;
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f26074w;
        if (pcVar != null && (tbVar = pcVar.e) != null) {
            tbVar.updatePosition();
        }
    }
}
