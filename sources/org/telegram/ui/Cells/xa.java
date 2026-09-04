package org.telegram.ui.Cells;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class xa extends org.telegram.ui.Components.p5 {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
