package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class sl0 extends Drawable {
    public final Paint f29155a = new Paint(1);
    public final View f29156b;
    public final Path f29157c;
    public final RectF d;
    public final mm0 e;

    public sl0(mm0 mm0Var, View view, Path path, RectF rectF) {
        this.e = mm0Var;
        this.f29156b = view;
        this.f29157c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f29156b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f29157c);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, this.e.f27439n2);
        Paint paint = this.f29155a;
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
        this.f29155a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
