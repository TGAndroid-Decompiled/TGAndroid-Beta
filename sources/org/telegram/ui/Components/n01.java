package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n01 extends TextView {
    public final o01 f28798a;
    public boolean f28799b;
    public boolean f28800c;

    public n01(o01 o01Var, CharSequence charSequence) {
        super(o01Var.getContext());
        this.f28798a = o01Var;
        org.telegram.ui.ActionBar.g6 g6Var = o01Var.f29054a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        org.telegram.ui.ActionBar.r6.W(this, org.telegram.ui.ActionBar.k6.G6, g6Var);
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        boolean z10 = this.f28799b;
        o01 o01Var = this.f28798a;
        if (z10 || this.f28800c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = o01Var.f29056c;
            if (this.f28799b) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            int i10 = 1;
            fArr[1] = f7;
            fArr[0] = f7;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f28800c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            o01Var.f29055b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = o01Var.h;
            float width = getWidth() + o01Var.h;
            float height = getHeight();
            float f11 = o01Var.h;
            if (this.f28800c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            o01Var.f29055b.addRoundRect(rectF, o01Var.f29056c, Path.Direction.CW);
            canvas2.drawPath(o01Var.f29055b, o01Var.d);
            canvas2.drawPath(o01Var.f29055b, o01Var.e);
        } else {
            float f12 = o01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + o01Var.h, getHeight() + o01Var.h, o01Var.d);
            float f13 = o01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + o01Var.h, getHeight() + o01Var.h, o01Var.e);
        }
        super.onDraw(canvas2);
    }
}
