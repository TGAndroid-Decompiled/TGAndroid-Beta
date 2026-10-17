package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ol0 extends Drawable {
    public final Paint f28993a = new Paint(1);
    public final View f28994b;
    public final Path f28995c;
    public final RectF d;
    public final im0 e;

    public ol0(im0 im0Var, View view, Path path, RectF rectF) {
        this.e = im0Var;
        this.f28994b = view;
        this.f28995c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f28994b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f28995c);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, this.e.f27284n2);
        Paint paint = this.f28993a;
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
        this.f28993a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
