package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class wy0 extends TextView {
    public final xy0 f32336a;
    public boolean f32337b;
    public boolean f32338c;

    public wy0(xy0 xy0Var, CharSequence charSequence) {
        super(xy0Var.getContext());
        this.f32336a = xy0Var;
        org.telegram.ui.ActionBar.p6 p6Var = xy0Var.f32659a;
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
        boolean z10 = this.f32337b;
        xy0 xy0Var = this.f32336a;
        if (z10 || this.f32338c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.i0.L(10.0f);
            float[] fArr = xy0Var.f32661c;
            if (this.f32337b) {
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
            if (!this.f32338c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            xy0Var.f32660b.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            float f10 = xy0Var.h;
            float width = getWidth() + xy0Var.h;
            float height = getHeight();
            float f11 = xy0Var.h;
            if (this.f32338c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            xy0Var.f32660b.addRoundRect(rectF, xy0Var.f32661c, Path.Direction.CW);
            canvas2.drawPath(xy0Var.f32660b, xy0Var.d);
            canvas2.drawPath(xy0Var.f32660b, xy0Var.e);
        } else {
            float f12 = xy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + xy0Var.h, getHeight() + xy0Var.h, xy0Var.d);
            float f13 = xy0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + xy0Var.h, getHeight() + xy0Var.h, xy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
