package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class pq0 extends Drawable {
    public final Paint f29368a = new Paint(1);
    public final Path f29369b = new Path();
    public final er0 f29370c;

    public pq0(er0 er0Var) {
        this.f29370c = er0Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(25.0f);
        er0 er0Var = this.f29370c;
        float min = Math.min(bounds.top, er0Var.f25991n - er0Var.f25977b.getY());
        int themedColor = er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5);
        Paint paint = this.f29368a;
        paint.setColor(themedColor);
        Path path = this.f29369b;
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
