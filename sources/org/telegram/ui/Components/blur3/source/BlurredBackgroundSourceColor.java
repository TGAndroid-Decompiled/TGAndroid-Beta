package org.telegram.ui.Components.blur3.source;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;

public final class BlurredBackgroundSourceColor implements BlurredBackgroundSource {
    public final Paint paint = new Paint(1);

    @Override
    public final BlurredBackgroundDrawable createDrawable() {
        return new BlurredBackgroundDrawableSource(this);
    }

    @Override
    public final void dispatchOnDrawablesRelativePositionChange() {
    }

    @Override
    public final void draw(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.drawRect(f, f2, f3, f4, this.paint);
    }
}
