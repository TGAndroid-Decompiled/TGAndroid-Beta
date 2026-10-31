package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class yj0 extends Drawable {
    public final Paint f32748a = new Paint(1);
    public final View f32749b;
    public final Path f32750c;
    public final RectF d;
    public final tk0 e;

    public yj0(tk0 tk0Var, View view, Path path, RectF rectF) {
        this.e = tk0Var;
        this.f32749b = view;
        this.f32750c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f32749b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f32750c);
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.e.f30625n2);
        Paint paint = this.f32748a;
        paint.setColor(i0.b.o(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32748a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
