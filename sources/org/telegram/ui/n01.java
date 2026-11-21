package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class n01 extends FrameLayout {
    public final Path f50055a;
    public final Paint f50056b;
    public final boolean f50057c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.h6 f50058e;
    public final Integer f50059f;
    public final s11 h;

    public n01(s11 s11Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.h6 h6Var, Integer num) {
        super(context);
        this.h = s11Var;
        this.f50057c = z10;
        this.d = z11;
        this.f50058e = h6Var;
        this.f50059f = num;
        this.f50055a = new Path();
        this.f50056b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        s11 s11Var = this.h;
        if (!s11Var.R0) {
            super.dispatchDraw(canvas);
        } else if (this.f50057c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f50056b;
            if (z10) {
                org.telegram.ui.ActionBar.m6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.f50058e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f50059f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.g0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (s11Var.n()) {
                org.telegram.messenger.g0.P.set((L - (s11Var.f51824b1 * L)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, s11Var.f51827c1, height, getPaddingTop()), ((width - L) * s11Var.f51824b1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.g0.P.set((L - (s11Var.f51824b1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * s11Var.f51824b1) + getPaddingLeft() + L, (height * s11Var.f51827c1) + getPaddingTop());
            }
            Path path = this.f50055a;
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
