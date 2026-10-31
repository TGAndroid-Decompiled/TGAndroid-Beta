package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class ty0 extends FrameLayout {
    public final wy0 f30698a;
    public boolean f30699b;
    public boolean f30700c;
    public boolean d;
    public boolean e;

    public ty0(wy0 wy0Var, View view, boolean z10) {
        super(wy0Var.getContext());
        this.d = false;
        this.e = true;
        this.f30698a = wy0Var;
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
        boolean z10 = this.f30699b;
        wy0 wy0Var = this.f30698a;
        if (z10 || this.f30700c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.i0.L(10.0f);
            float[] fArr = wy0Var.f32274c;
            boolean z11 = this.f30699b;
            if (z11 && this.d) {
                f7 = L;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11 && this.e) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f30700c;
            if (z12 && this.e) {
                f11 = L;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12 || !this.d) {
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
            if (this.f30700c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            if (!this.e) {
                rectF.right += wy0Var.f32275f;
            }
            wy0Var.f32273b.addRoundRect(rectF, wy0Var.f32274c, Path.Direction.CW);
            canvas2.drawPath(wy0Var.f32273b, wy0Var.e);
        } else {
            float f15 = wy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - wy0Var.h, getHeight() + wy0Var.h, wy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
