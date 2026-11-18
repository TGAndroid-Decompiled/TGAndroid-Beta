package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class m01 extends FrameLayout {
    public final Path f49722a;
    public final Paint f49723b;
    public final boolean f49724c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.i6 f49725e;
    public final Integer f49726f;
    public final r11 h;

    public m01(r11 r11Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var, Integer num) {
        super(context);
        this.h = r11Var;
        this.f49724c = z10;
        this.d = z11;
        this.f49725e = i6Var;
        this.f49726f = num;
        this.f49722a = new Path();
        this.f49723b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        r11 r11Var = this.h;
        if (!r11Var.R0) {
            super.dispatchDraw(canvas);
        } else if (this.f49724c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f49723b;
            if (z10) {
                org.telegram.ui.ActionBar.n6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.f49725e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f49726f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.g0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (r11Var.n()) {
                org.telegram.messenger.g0.P.set((L - (r11Var.f51422b1 * L)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, r11Var.f51425c1, height, getPaddingTop()), ((width - L) * r11Var.f51422b1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.g0.P.set((L - (r11Var.f51422b1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * r11Var.f51422b1) + getPaddingLeft() + L, (height * r11Var.f51425c1) + getPaddingTop());
            }
            Path path = this.f49722a;
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
