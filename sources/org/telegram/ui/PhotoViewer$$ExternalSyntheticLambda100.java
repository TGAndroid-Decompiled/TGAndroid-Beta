package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.Bulletin;

public final class PhotoViewer$$ExternalSyntheticLambda100 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Bulletin.Layout layout;
        Bulletin bulletin = Bulletin.visibleBulletin;
        if (bulletin == null || (layout = bulletin.layout) == null) {
            return;
        }
        layout.updatePosition();
    }
}
