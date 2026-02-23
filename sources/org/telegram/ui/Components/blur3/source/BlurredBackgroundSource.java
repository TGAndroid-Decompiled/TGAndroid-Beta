package org.telegram.ui.Components.blur3.source;

import android.graphics.Canvas;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;

public interface BlurredBackgroundSource {

    public abstract class CC {
        public static void $default$dispatchOnDrawablesRelativePositionChange(BlurredBackgroundSource blurredBackgroundSource) {
        }
    }

    BlurredBackgroundDrawable createDrawable();

    void dispatchOnDrawablesRelativePositionChange();

    void draw(Canvas canvas, float f, float f2, float f3, float f4);
}
