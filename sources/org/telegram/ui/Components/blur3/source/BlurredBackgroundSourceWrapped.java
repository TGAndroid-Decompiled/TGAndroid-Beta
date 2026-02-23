package org.telegram.ui.Components.blur3.source;

import android.graphics.Canvas;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;

public class BlurredBackgroundSourceWrapped implements BlurredBackgroundSource {
    private BlurredBackgroundSource sourceInternal;

    @Override
    public void dispatchOnDrawablesRelativePositionChange() {
        BlurredBackgroundSource.CC.$default$dispatchOnDrawablesRelativePositionChange(this);
    }

    @Override
    public BlurredBackgroundDrawable createDrawable() {
        return new BlurredBackgroundDrawableSource(this);
    }

    public BlurredBackgroundSource getSource() {
        return this.sourceInternal;
    }

    public void setSource(BlurredBackgroundSource blurredBackgroundSource) {
        this.sourceInternal = blurredBackgroundSource;
    }

    @Override
    public void draw(Canvas canvas, float f, float f2, float f3, float f4) {
        BlurredBackgroundSource blurredBackgroundSource = this.sourceInternal;
        if (blurredBackgroundSource != null) {
            blurredBackgroundSource.draw(canvas, f, f2, f3, f4);
        }
    }
}
