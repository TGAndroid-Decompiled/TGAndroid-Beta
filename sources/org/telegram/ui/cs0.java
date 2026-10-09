package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class cs0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.xb xbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.f31122w;
        if (tcVar != null && (xbVar = tcVar.f31126e) != null) {
            xbVar.updatePosition();
        }
    }
}
