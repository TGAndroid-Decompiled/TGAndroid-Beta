package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class qx0 extends TextView {
    public final rx0 f37559a;
    public boolean f37560b;
    public boolean f37561c;

    public qx0(rx0 rx0Var, CharSequence charSequence) {
        super(rx0Var.getContext());
        this.f37559a = rx0Var;
        org.telegram.ui.ActionBar.e6 e6Var = rx0Var.f37836a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, e6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        boolean z10 = this.f37560b;
        rx0 rx0Var = this.f37559a;
        if (z10 || this.f37561c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = rx0Var.f37838c;
            if (this.f37560b) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            int i3 = 1;
            fArr[1] = f10;
            fArr[0] = f10;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f37561c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            rx0Var.f37837b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = rx0Var.h;
            float width = getWidth() + rx0Var.h;
            float height = getHeight();
            float f12 = rx0Var.h;
            if (this.f37561c) {
                i3 = -1;
            }
            rectF.set(f11, f11, width, (f12 * i3) + height);
            rx0Var.f37837b.addRoundRect(rectF, rx0Var.f37838c, Path.Direction.CW);
            canvas2.drawPath(rx0Var.f37837b, rx0Var.d);
            canvas2.drawPath(rx0Var.f37837b, rx0Var.f37839e);
        } else {
            float f13 = rx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + rx0Var.h, getHeight() + rx0Var.h, rx0Var.d);
            float f14 = rx0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + rx0Var.h, getHeight() + rx0Var.h, rx0Var.f37839e);
        }
        super.onDraw(canvas2);
    }
}
