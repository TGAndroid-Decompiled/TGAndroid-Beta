package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ui0 extends Drawable {
    public final Paint f38726a = new Paint(1);
    public final View f38727b;
    public final Path f38728c;
    public final RectF d;
    public final qj0 f38729e;

    public ui0(qj0 qj0Var, View view, Path path, RectF rectF) {
        this.f38729e = qj0Var;
        this.f38727b = view;
        this.f38728c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f38727b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f38728c);
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.f38729e.f37381n2);
        Paint paint = this.f38726a;
        paint.setColor(i0.a.o(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38726a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
