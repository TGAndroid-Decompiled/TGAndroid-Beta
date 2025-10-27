package org.telegram.ui.Components.blur3.drawable;

import android.graphics.Canvas;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;

public class BlurredBackgroundDrawableSource extends BlurredBackgroundDrawable {
    private final BlurredBackgroundSource source;

    public BlurredBackgroundDrawableSource(BlurredBackgroundSource blurredBackgroundSource) {
        this.source = blurredBackgroundSource;
    }

    @Override
    public void draw(Canvas canvas) {
        drawSource(canvas, this.source);
    }

    @Override
    public BlurredBackgroundSource getSource() {
        return this.source;
    }
}
