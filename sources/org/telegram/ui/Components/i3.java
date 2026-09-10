package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends w9 {
    public final Path G;

    public i3(Context context) {
        super(context);
        this.G = new Path();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.G;
        path.rewind();
        path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        super.onDraw(canvas);
        canvas.restore();
    }
}
