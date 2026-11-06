package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class sx0 extends TextView {
    public final tx0 f38144a;
    public boolean f38145b;
    public boolean f38146c;

    public sx0(tx0 tx0Var, CharSequence charSequence) {
        super(tx0Var.getContext());
        this.f38144a = tx0Var;
        org.telegram.ui.ActionBar.f6 f6Var = tx0Var.f38419a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, f6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        boolean z9 = this.f38145b;
        tx0 tx0Var = this.f38144a;
        if (z9 || this.f38146c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = tx0Var.f38421c;
            if (this.f38145b) {
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
            if (!this.f38146c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            tx0Var.f38420b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = tx0Var.h;
            float width = getWidth() + tx0Var.h;
            float height = getHeight();
            float f12 = tx0Var.h;
            if (this.f38146c) {
                i7 = -1;
            }
            rectF.set(f11, f11, width, (f12 * i7) + height);
            tx0Var.f38420b.addRoundRect(rectF, tx0Var.f38421c, Path.Direction.CW);
            canvas2.drawPath(tx0Var.f38420b, tx0Var.d);
            canvas2.drawPath(tx0Var.f38420b, tx0Var.f38422e);
        } else {
            float f13 = tx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + tx0Var.h, getHeight() + tx0Var.h, tx0Var.d);
            float f14 = tx0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + tx0Var.h, getHeight() + tx0Var.h, tx0Var.f38422e);
        }
        super.onDraw(canvas2);
    }
}
