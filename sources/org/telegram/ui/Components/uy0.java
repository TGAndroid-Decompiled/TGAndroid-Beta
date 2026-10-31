package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class uy0 extends FrameLayout {
    public final wy0 f31086a;
    public boolean f31087b;
    public boolean f31088c;
    public boolean d;

    public uy0(wy0 wy0Var, View view, boolean z10) {
        super(wy0Var.getContext());
        this.f31086a = wy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
        }
        addView(view, w7.b6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f31088c;
        wy0 wy0Var = this.f31086a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.i0.L(10.0f);
            float[] fArr = wy0Var.f32274c;
            boolean z11 = this.f31088c;
            if (z11) {
                f7 = L;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.d;
            if (z12) {
                f11 = L;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            wy0Var.f32273b.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            float f13 = wy0Var.h;
            float width = getWidth() - wy0Var.h;
            float height = getHeight();
            float f14 = wy0Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            wy0Var.f32273b.addRoundRect(rectF, wy0Var.f32274c, Path.Direction.CW);
            if (this.f31087b) {
                canvas2.drawPath(wy0Var.f32273b, wy0Var.d);
            }
            canvas2.drawPath(wy0Var.f32273b, wy0Var.e);
        } else {
            if (this.f31087b) {
                float f15 = wy0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + wy0Var.h, getHeight() + wy0Var.h, wy0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = wy0Var.h;
            canvas2.drawRect(f16, f16, getWidth() - wy0Var.h, getHeight() + wy0Var.h, wy0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f31087b = z10;
    }
}
