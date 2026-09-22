package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class bs0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.sb sbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26744w;
        if (ocVar != null && (sbVar = ocVar.e) != null) {
            sbVar.updatePosition();
        }
    }
}
