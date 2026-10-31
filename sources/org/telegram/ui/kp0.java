package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class kp0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.bb bbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32128w;
        if (wbVar != null && (bbVar = wbVar.e) != null) {
            bbVar.updatePosition();
        }
    }
}
