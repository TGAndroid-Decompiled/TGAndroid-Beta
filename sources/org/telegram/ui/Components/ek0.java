package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ek0 extends Drawable {
    public final Paint f28053a = new Paint(1);
    public final View f28054b;
    public final Path f28055c;
    public final RectF d;
    public final wk0 f28056e;

    public ek0(wk0 wk0Var, View view, Path path, RectF rectF) {
        this.f28056e = wk0Var;
        this.f28054b = view;
        this.f28055c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f28054b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f28055c);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, this.f28056e.f34260l2);
        Paint paint = this.f28053a;
        paint.setColor(i0.a.k(v02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f28053a.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
