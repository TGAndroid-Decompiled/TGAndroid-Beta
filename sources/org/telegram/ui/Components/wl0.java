package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class wl0 extends Drawable {
    public final Paint f32633a = new Paint(1);
    public final View f32634b;
    public final Path f32635c;
    public final RectF d;
    public final qm0 f32636e;

    public wl0(qm0 qm0Var, View view, Path path, RectF rectF) {
        this.f32636e = qm0Var;
        this.f32634b = view;
        this.f32635c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f32634b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f32635c);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.f32636e.f30216n2);
        Paint paint = this.f32633a;
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
        this.f32633a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
