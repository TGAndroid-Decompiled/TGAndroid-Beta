package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class b21 extends FrameLayout {
    public final Path f35919a;
    public final Paint f35920b;
    public final boolean f35921c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final Integer f35922f;
    public final g31 h;

    public b21(g31 g31Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, Integer num) {
        super(context);
        this.h = g31Var;
        this.f35921c = z10;
        this.d = z11;
        this.e = p6Var;
        this.f35922f = num;
        this.f35919a = new Path();
        this.f35920b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        g31 g31Var = this.h;
        if (!g31Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f35921c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f35920b;
            if (z10) {
                org.telegram.ui.ActionBar.t6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f35922f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.i0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (g31Var.n()) {
                org.telegram.messenger.i0.P.set((L - (g31Var.f37289a1 * L)) + getPaddingLeft(), c3.i0.z(1.0f, g31Var.f37292b1, height, getPaddingTop()), ((width - L) * g31Var.f37289a1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.i0.P.set((L - (g31Var.f37289a1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * g31Var.f37289a1) + getPaddingLeft() + L, (height * g31Var.f37292b1) + getPaddingTop());
            }
            Path path = this.f35919a;
            path.rewind();
            path.addRoundRect(org.telegram.messenger.i0.P, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
    }
}
