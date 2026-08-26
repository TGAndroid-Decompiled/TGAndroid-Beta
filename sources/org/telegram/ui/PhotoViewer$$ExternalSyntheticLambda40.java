package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.Bulletin;

public final class PhotoViewer$$ExternalSyntheticLambda40 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Bulletin.updateCurrentPosition();
    }
}
