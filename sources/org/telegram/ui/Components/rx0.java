package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class rx0 extends TextView {
    public final sx0 f37812a;
    public boolean f37813b;
    public boolean f37814c;

    public rx0(sx0 sx0Var, CharSequence charSequence) {
        super(sx0Var.getContext());
        this.f37812a = sx0Var;
        org.telegram.ui.ActionBar.f6 f6Var = sx0Var.f38140a;
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
        boolean z9 = this.f37813b;
        sx0 sx0Var = this.f37812a;
        if (z9 || this.f37814c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = sx0Var.f38142c;
            if (this.f37813b) {
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
            if (!this.f37814c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            sx0Var.f38141b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = sx0Var.h;
            float width = getWidth() + sx0Var.h;
            float height = getHeight();
            float f12 = sx0Var.h;
            if (this.f37814c) {
                i7 = -1;
            }
            rectF.set(f11, f11, width, (f12 * i7) + height);
            sx0Var.f38141b.addRoundRect(rectF, sx0Var.f38142c, Path.Direction.CW);
            canvas2.drawPath(sx0Var.f38141b, sx0Var.d);
            canvas2.drawPath(sx0Var.f38141b, sx0Var.f38143e);
        } else {
            float f13 = sx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + sx0Var.h, getHeight() + sx0Var.h, sx0Var.d);
            float f14 = sx0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + sx0Var.h, getHeight() + sx0Var.h, sx0Var.f38143e);
        }
        super.onDraw(canvas2);
    }
}
