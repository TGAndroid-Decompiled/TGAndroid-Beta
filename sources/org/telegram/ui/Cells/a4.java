package org.telegram.ui.Cells;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends org.telegram.ui.Components.p5 {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
