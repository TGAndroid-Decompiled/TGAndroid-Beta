package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class by0 extends TextView {
    public final cy0 f33814a;
    public boolean f33815b;
    public boolean f33816c;

    public by0(cy0 cy0Var, CharSequence charSequence) {
        super(cy0Var.getContext());
        this.f33814a = cy0Var;
        org.telegram.ui.ActionBar.i6 i6Var = cy0Var.f34196a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.u6.U(this, org.telegram.ui.ActionBar.n6.G6, i6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        boolean z10 = this.f33815b;
        cy0 cy0Var = this.f33814a;
        if (z10 || this.f33816c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = cy0Var.f34198c;
            if (this.f33815b) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            int i7 = 1;
            fArr[1] = f10;
            fArr[0] = f10;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f33816c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            cy0Var.f34197b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = cy0Var.h;
            float width = getWidth() + cy0Var.h;
            float height = getHeight();
            float f12 = cy0Var.h;
            if (this.f33816c) {
                i7 = -1;
            }
            rectF.set(f11, f11, width, (f12 * i7) + height);
            cy0Var.f34197b.addRoundRect(rectF, cy0Var.f34198c, Path.Direction.CW);
            canvas2.drawPath(cy0Var.f34197b, cy0Var.d);
            canvas2.drawPath(cy0Var.f34197b, cy0Var.f34199e);
        } else {
            float f13 = cy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + cy0Var.h, getHeight() + cy0Var.h, cy0Var.d);
            float f14 = cy0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + cy0Var.h, getHeight() + cy0Var.h, cy0Var.f34199e);
        }
        super.onDraw(canvas2);
    }
}
