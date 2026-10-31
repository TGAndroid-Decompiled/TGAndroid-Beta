package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class vy0 extends TextView {
    public final wy0 f31941a;
    public boolean f31942b;
    public boolean f31943c;

    public vy0(wy0 wy0Var, CharSequence charSequence) {
        super(wy0Var.getContext());
        this.f31941a = wy0Var;
        org.telegram.ui.ActionBar.p6 p6Var = wy0Var.f32272a;
        setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
        org.telegram.ui.ActionBar.a7.V(this, org.telegram.ui.ActionBar.t6.G6, p6Var);
        setTypeface(org.telegram.messenger.i0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        boolean z10 = this.f31942b;
        wy0 wy0Var = this.f31941a;
        if (z10 || this.f31943c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.i0.L(10.0f);
            float[] fArr = wy0Var.f32274c;
            if (this.f31942b) {
                f7 = L;
            } else {
                f7 = 0.0f;
            }
            int i10 = 1;
            fArr[1] = f7;
            fArr[0] = f7;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f31943c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            wy0Var.f32273b.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            float f10 = wy0Var.h;
            float width = getWidth() + wy0Var.h;
            float height = getHeight();
            float f11 = wy0Var.h;
            if (this.f31943c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            wy0Var.f32273b.addRoundRect(rectF, wy0Var.f32274c, Path.Direction.CW);
            canvas2.drawPath(wy0Var.f32273b, wy0Var.d);
            canvas2.drawPath(wy0Var.f32273b, wy0Var.e);
        } else {
            float f12 = wy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + wy0Var.h, getHeight() + wy0Var.h, wy0Var.d);
            float f13 = wy0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + wy0Var.h, getHeight() + wy0Var.h, wy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
