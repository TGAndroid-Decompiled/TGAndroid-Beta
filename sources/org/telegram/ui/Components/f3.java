package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import org.telegram.messenger.AndroidUtilities;
public final class f3 extends p9 {
    public final Path D;

    public f3(Context context) {
        super(context);
        this.D = new Path();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.D;
        path.rewind();
        path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        super.onDraw(canvas);
        canvas.restore();
    }
}
