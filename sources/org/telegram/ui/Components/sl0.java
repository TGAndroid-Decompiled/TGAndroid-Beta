package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class sl0 extends Drawable {
    public final Paint f32645a = new Paint(1);
    public final View f32646b;
    public final Path f32647c;
    public final RectF d;
    public final nm0 e;

    public sl0(nm0 nm0Var, View view, Path path, RectF rectF) {
        this.e = nm0Var;
        this.f32646b = view;
        this.f32647c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f32646b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f32647c);
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.e.f30988n2);
        Paint paint = this.f32645a;
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
        this.f32645a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
