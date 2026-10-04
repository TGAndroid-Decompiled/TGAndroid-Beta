package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class el0 extends Drawable {
    public final Paint f26084a = new Paint(1);
    public final View f26085b;
    public final Path f26086c;
    public final RectF d;
    public final zl0 f26087e;

    public el0(zl0 zl0Var, View view, Path path, RectF rectF) {
        this.f26087e = zl0Var;
        this.f26085b = view;
        this.f26086c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f26085b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f26086c);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20822d6, this.f26087e.f33552p2);
        Paint paint = this.f26084a;
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
        this.f26084a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
