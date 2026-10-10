package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class xl0 extends Drawable {
    public final Paint f32989a = new Paint(1);
    public final View f32990b;
    public final Path f32991c;
    public final RectF d;
    public final rm0 f32992e;

    public xl0(rm0 rm0Var, View view, Path path, RectF rectF) {
        this.f32992e = rm0Var;
        this.f32990b = view;
        this.f32991c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f32990b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f32991c);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, this.f32992e.f30511n2);
        Paint paint = this.f32989a;
        paint.setColor(i0.a.k(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32989a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
