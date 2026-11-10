package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class o01 extends FrameLayout {
    public final Path f48352a;
    public final Paint f48353b;
    public final boolean f48354c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.h6 f48355e;
    public final Integer f48356f;
    public final t11 h;

    public o01(t11 t11Var, Context context, boolean z9, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, Integer num) {
        super(context);
        this.h = t11Var;
        this.f48354c = z9;
        this.d = z10;
        this.f48355e = h6Var;
        this.f48356f = num;
        this.f48352a = new Path();
        this.f48353b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        t11 t11Var = this.h;
        if (!t11Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f48354c) {
            canvas.save();
            boolean z9 = this.d;
            Paint paint = this.f48353b;
            if (z9) {
                org.telegram.ui.ActionBar.m6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.f48355e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f48356f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.g0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (t11Var.n()) {
                org.telegram.messenger.g0.P.set((L - (t11Var.f50019a1 * L)) + getPaddingLeft(), com.google.android.recaptcha.internal.a.z(1.0f, t11Var.f50022b1, height, getPaddingTop()), ((width - L) * t11Var.f50019a1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.g0.P.set((L - (t11Var.f50019a1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * t11Var.f50019a1) + getPaddingLeft() + L, (height * t11Var.f50022b1) + getPaddingTop());
            }
            Path path = this.f48352a;
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
