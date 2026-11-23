package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class ay0 extends FrameLayout {
    public final dy0 f33579a;
    public boolean f33580b;
    public boolean f33581c;
    public boolean d;
    public boolean f33582e;

    public ay0(dy0 dy0Var, View view, boolean z10) {
        super(dy0Var.getContext());
        this.d = false;
        this.f33582e = true;
        this.f33579a = dy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.na.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10 = this.f33580b;
        dy0 dy0Var = this.f33579a;
        if (z10 || this.f33581c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = dy0Var.f34493c;
            boolean z11 = this.f33580b;
            if (z11 && this.d) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z11 && this.f33582e) {
                f11 = L;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.f33581c;
            if (z12 && this.f33582e) {
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
            dy0Var.f34492b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = dy0Var.h;
            float width = getWidth() - dy0Var.h;
            float height = getHeight();
            float f15 = dy0Var.h;
            if (this.f33581c) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            if (!this.f33582e) {
                rectF.right += dy0Var.f34495f;
            }
            dy0Var.f34492b.addRoundRect(rectF, dy0Var.f34493c, Path.Direction.CW);
            canvas2.drawPath(dy0Var.f34492b, dy0Var.f34494e);
        } else {
            float f16 = dy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f16, f16, getWidth() - dy0Var.h, getHeight() + dy0Var.h, dy0Var.f34494e);
        }
        super.onDraw(canvas2);
    }
}
