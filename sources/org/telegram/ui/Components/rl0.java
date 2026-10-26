package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class rl0 extends Drawable {
    public final Paint f32267a = new Paint(1);
    public final View f32268b;
    public final Path f32269c;
    public final RectF d;
    public final mm0 e;

    public rl0(mm0 mm0Var, View view, Path path, RectF rectF) {
        this.e = mm0Var;
        this.f32268b = view;
        this.f32269c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f32268b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f32269c);
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, this.e.f30646n2);
        Paint paint = this.f32267a;
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
        this.f32267a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
