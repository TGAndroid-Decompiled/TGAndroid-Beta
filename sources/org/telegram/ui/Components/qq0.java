package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class qq0 extends Drawable {
    public final Paint f29692a = new Paint(1);
    public final Path f29693b = new Path();
    public final fr0 f29694c;

    public qq0(fr0 fr0Var) {
        this.f29694c = fr0Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(25.0f);
        fr0 fr0Var = this.f29694c;
        float min = Math.min(bounds.top, fr0Var.f26382n - fr0Var.f26368b.getY());
        int themedColor = fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21064h5);
        Paint paint = this.f29692a;
        paint.setColor(themedColor);
        Path path = this.f29693b;
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
