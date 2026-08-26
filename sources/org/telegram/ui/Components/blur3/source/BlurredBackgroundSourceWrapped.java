package org.telegram.ui.Components.blur3.source;

import android.graphics.Canvas;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;

public final class BlurredBackgroundSourceWrapped implements BlurredBackgroundSource {
    public BlurredBackgroundSource sourceInternal;

    @Override
    public final BlurredBackgroundDrawable createDrawable() {
        return new BlurredBackgroundDrawableSource(this);
    }

    @Override
    public final void dispatchOnDrawablesRelativePositionChange() {
    }

    @Override
    public final void draw(Canvas canvas, float f, float f2, float f3, float f4) {
        BlurredBackgroundSource blurredBackgroundSource = this.sourceInternal;
        if (blurredBackgroundSource != null) {
            blurredBackgroundSource.draw(canvas, f, f2, f3, f4);
        }
    }
}
