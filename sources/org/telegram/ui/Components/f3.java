package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
public final class f3 extends k9 {
    public final Path H;

    public f3(Context context) {
        super(context);
        this.H = new Path();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.H;
        path.rewind();
        path.addCircle(org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(14.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        super.onDraw(canvas);
        canvas.restore();
    }
}
