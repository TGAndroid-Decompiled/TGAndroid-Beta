package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class dl0 extends Drawable {
    public final Paint f23711a = new Paint(1);
    public final View f23712b;
    public final Path f23713c;
    public final RectF d;
    public final xl0 e;

    public dl0(xl0 xl0Var, View view, Path path, RectF rectF) {
        this.e = xl0Var;
        this.f23712b = view;
        this.f23713c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f23712b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f23713c);
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, this.e.f30399p2);
        Paint paint = this.f23711a;
        paint.setColor(i0.a.k(v02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f23711a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
