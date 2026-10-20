package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class pl0 extends Drawable {
    public final Paint f29330a = new Paint(1);
    public final View f29331b;
    public final Path f29332c;
    public final RectF d;
    public final jm0 e;

    public pl0(jm0 jm0Var, View view, Path path, RectF rectF) {
        this.e = jm0Var;
        this.f29331b = view;
        this.f29332c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f29331b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f29332c);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, this.e.f27579n2);
        Paint paint = this.f29330a;
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
        this.f29330a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
