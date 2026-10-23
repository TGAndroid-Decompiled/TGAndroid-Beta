package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class qq0 extends Drawable {
    public final Paint f29693a = new Paint(1);
    public final Path f29694b = new Path();
    public final fr0 f29695c;

    public qq0(fr0 fr0Var) {
        this.f29695c = fr0Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(25.0f);
        fr0 fr0Var = this.f29695c;
        float min = Math.min(bounds.top, fr0Var.f26383n - fr0Var.f26369b.getY());
        int themedColor = fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21065h5);
        Paint paint = this.f29693a;
        paint.setColor(themedColor);
        Path path = this.f29694b;
        path.rewind();
        path.addRoundRect(bounds.left, min, bounds.right, bounds.bottom + dp, dp, dp, Path.Direction.CW);
        canvas.save();
        canvas.clipRect(bounds);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
