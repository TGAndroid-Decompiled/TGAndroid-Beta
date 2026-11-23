package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class l01 extends FrameLayout {
    public final Path f49560a;
    public final Paint f49561b;
    public final boolean f49562c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.i6 f49563e;
    public final Integer f49564f;
    public final q11 h;

    public l01(q11 q11Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var, Integer num) {
        super(context);
        this.h = q11Var;
        this.f49562c = z10;
        this.d = z11;
        this.f49563e = i6Var;
        this.f49564f = num;
        this.f49560a = new Path();
        this.f49561b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        q11 q11Var = this.h;
        if (!q11Var.R0) {
            super.dispatchDraw(canvas);
        } else if (this.f49562c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f49561b;
            if (z10) {
                org.telegram.ui.ActionBar.n6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.f49563e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f49564f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.g0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (q11Var.n()) {
                org.telegram.messenger.g0.P.set((L - (q11Var.f51231b1 * L)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, q11Var.f51234c1, height, getPaddingTop()), ((width - L) * q11Var.f51231b1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.g0.P.set((L - (q11Var.f51231b1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * q11Var.f51231b1) + getPaddingLeft() + L, (height * q11Var.f51234c1) + getPaddingTop());
            }
            Path path = this.f49560a;
            path.rewind();
            path.addRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
    }
}
