package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class ay0 extends FrameLayout {
    public final cy0 f33489a;
    public boolean f33490b;
    public boolean f33491c;
    public boolean d;

    public ay0(cy0 cy0Var, View view, boolean z10) {
        super(cy0Var.getContext());
        this.f33489a = cy0Var;
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
        boolean z10 = this.f33491c;
        cy0 cy0Var = this.f33489a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = cy0Var.f34198c;
            boolean z11 = this.f33491c;
            if (z11) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z11) {
                f11 = L;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.d;
            if (z12) {
                f12 = L;
            } else {
                f12 = 0.0f;
            }
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z12) {
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
            if (this.d) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            cy0Var.f34197b.addRoundRect(rectF, cy0Var.f34198c, Path.Direction.CW);
            if (this.f33490b) {
                canvas2.drawPath(cy0Var.f34197b, cy0Var.d);
            }
            canvas2.drawPath(cy0Var.f34197b, cy0Var.f34199e);
        } else {
            if (this.f33490b) {
                float f16 = cy0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f16, f16, getWidth() + cy0Var.h, getHeight() + cy0Var.h, cy0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f17 = cy0Var.h;
            canvas2.drawRect(f17, f17, getWidth() - cy0Var.h, getHeight() + cy0Var.h, cy0Var.f34199e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f33490b = z10;
    }
}
