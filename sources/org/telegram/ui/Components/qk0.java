package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class qk0 extends Drawable {
    public final Paint f31978a = new Paint(1);
    public final View f31979b;
    public final Path f31980c;
    public final RectF d;
    public final jl0 f31981e;

    public qk0(jl0 jl0Var, View view, Path path, RectF rectF) {
        this.f31981e = jl0Var;
        this.f31979b = view;
        this.f31980c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f31979b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f31980c);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, this.f31981e.f29709l2);
        Paint paint = this.f31978a;
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
        this.f31978a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
