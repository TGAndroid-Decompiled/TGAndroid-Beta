package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class as0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.wb wbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30703w;
        if (scVar != null && (wbVar = scVar.f30707e) != null) {
            wbVar.updatePosition();
        }
    }
}
