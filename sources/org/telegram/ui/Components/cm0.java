package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class cm0 extends Drawable {
    public final Paint f24954a = new Paint(1);
    public final View f24955b;
    public final Path f24956c;
    public final RectF d;
    public final wm0 f24957e;

    public cm0(wm0 wm0Var, View view, Path path, RectF rectF) {
        this.f24957e = wm0Var;
        this.f24955b = view;
        this.f24956c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f24955b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f24956c);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, this.f24957e.f32467n2);
        Paint paint = this.f24954a;
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
        this.f24954a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
