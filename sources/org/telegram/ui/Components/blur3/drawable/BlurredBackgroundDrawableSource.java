package org.telegram.ui.Components.blur3.drawable;

import android.graphics.Canvas;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;

public final class BlurredBackgroundDrawableSource extends BlurredBackgroundDrawable {
    public final BlurredBackgroundSource source;

    public BlurredBackgroundDrawableSource(BlurredBackgroundSource blurredBackgroundSource) {
        this.source = blurredBackgroundSource;
    }

    @Override
    public final void draw(Canvas canvas) {
        drawSource(canvas, this.source);
    }

    @Override
    public final BlurredBackgroundSource getSource() {
        return this.source;
    }
}
