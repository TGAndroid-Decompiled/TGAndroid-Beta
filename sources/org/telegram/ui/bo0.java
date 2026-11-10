package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
public final class bo0 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.fb fbVar;
        Drawable[] drawableArr = PhotoViewer.Y8;
        org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
        if (bcVar != null && (fbVar = bcVar.f32199e) != null) {
            fbVar.updatePosition();
        }
    }
}
