package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class uy0 extends FrameLayout {
    public final xy0 f31113a;
    public boolean f31114b;
    public boolean f31115c;
    public boolean d;
    public boolean e;

    public uy0(xy0 xy0Var, View view, boolean z10) {
        super(xy0Var.getContext());
        this.d = false;
        this.e = true;
        this.f31113a = xy0Var;
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
        boolean z10 = this.f31114b;
        xy0 xy0Var = this.f31113a;
        if (z10 || this.f31115c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.i0.L(10.0f);
            float[] fArr = xy0Var.f32661c;
            boolean z11 = this.f31114b;
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
            boolean z12 = this.f31115c;
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
            xy0Var.f32660b.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            float f13 = xy0Var.h;
            float width = getWidth() - xy0Var.h;
            float height = getHeight();
            float f14 = xy0Var.h;
            if (this.f31115c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            if (!this.e) {
                rectF.right += xy0Var.f32662f;
            }
            xy0Var.f32660b.addRoundRect(rectF, xy0Var.f32661c, Path.Direction.CW);
            canvas2.drawPath(xy0Var.f32660b, xy0Var.e);
        } else {
            float f15 = xy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - xy0Var.h, getHeight() + xy0Var.h, xy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
