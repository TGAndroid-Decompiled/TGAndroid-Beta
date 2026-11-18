package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class zx0 extends FrameLayout {
    public final cy0 f42966a;
    public boolean f42967b;
    public boolean f42968c;
    public boolean d;
    public boolean f42969e;

    public zx0(cy0 cy0Var, View view, boolean z10) {
        super(cy0Var.getContext());
        this.d = false;
        this.f42969e = true;
        this.f42966a = cy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.ma.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10 = this.f42967b;
        cy0 cy0Var = this.f42966a;
        if (z10 || this.f42968c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = cy0Var.f34198c;
            boolean z11 = this.f42967b;
            if (z11 && this.d) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z11 && this.f42969e) {
                f11 = L;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.f42968c;
            if (z12 && this.f42969e) {
                f12 = L;
            } else {
                f12 = 0.0f;
            }
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z12 || !this.d) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            cy0Var.f34197b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = cy0Var.h;
            float width = getWidth() - cy0Var.h;
            float height = getHeight();
            float f15 = cy0Var.h;
            if (this.f42968c) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            if (!this.f42969e) {
                rectF.right += cy0Var.f34200f;
            }
            cy0Var.f34197b.addRoundRect(rectF, cy0Var.f34198c, Path.Direction.CW);
            canvas2.drawPath(cy0Var.f34197b, cy0Var.f34199e);
        } else {
            float f16 = cy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f16, f16, getWidth() - cy0Var.h, getHeight() + cy0Var.h, cy0Var.f34199e);
        }
        super.onDraw(canvas2);
    }
}
