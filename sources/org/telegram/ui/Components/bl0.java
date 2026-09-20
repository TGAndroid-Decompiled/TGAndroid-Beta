package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class bl0 extends Drawable {
    public final Paint f23013a = new Paint(1);
    public final View f23014b;
    public final Path f23015c;
    public final RectF d;
    public final vl0 e;

    public bl0(vl0 vl0Var, View view, Path path, RectF rectF) {
        this.e = vl0Var;
        this.f23014b = view;
        this.f23015c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f23014b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f23015c);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, this.e.f29207p2);
        Paint paint = this.f23013a;
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
        this.f23013a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
