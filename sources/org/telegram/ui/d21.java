package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class d21 extends FrameLayout {
    public final Path f36597a;
    public final Paint f36598b;
    public final boolean f36599c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final Integer f36600f;
    public final i31 h;

    public d21(i31 i31Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, Integer num) {
        super(context);
        this.h = i31Var;
        this.f36599c = z10;
        this.d = z11;
        this.e = p6Var;
        this.f36600f = num;
        this.f36597a = new Path();
        this.f36598b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        i31 i31Var = this.h;
        if (!i31Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f36599c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f36598b;
            if (z10) {
                org.telegram.ui.ActionBar.t6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f36600f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.i0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (i31Var.n()) {
                org.telegram.messenger.i0.P.set((L - (i31Var.f38113a1 * L)) + getPaddingLeft(), c3.i0.z(1.0f, i31Var.f38116b1, height, getPaddingTop()), ((width - L) * i31Var.f38113a1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.i0.P.set((L - (i31Var.f38113a1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * i31Var.f38113a1) + getPaddingLeft() + L, (height * i31Var.f38116b1) + getPaddingTop());
            }
            Path path = this.f36597a;
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
