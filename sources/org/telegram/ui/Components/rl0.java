package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class rl0 extends Drawable {
    public final Paint f32265a = new Paint(1);
    public final View f32266b;
    public final Path f32267c;
    public final RectF d;
    public final mm0 e;

    public rl0(mm0 mm0Var, View view, Path path, RectF rectF) {
        this.e = mm0Var;
        this.f32266b = view;
        this.f32267c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f32266b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f32267c);
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23354d6, this.e.f30644n2);
        Paint paint = this.f32265a;
        paint.setColor(i0.a.o(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32265a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
