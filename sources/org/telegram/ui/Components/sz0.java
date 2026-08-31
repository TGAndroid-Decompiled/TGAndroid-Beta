package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sz0 extends TextView {
    public final tz0 f31207a;
    public boolean f31208b;
    public boolean f31209c;

    public sz0(tz0 tz0Var, CharSequence charSequence) {
        super(tz0Var.getContext());
        this.f31207a = tz0Var;
        org.telegram.ui.ActionBar.g6 g6Var = tz0Var.f31490a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        boolean z4 = this.f31208b;
        tz0 tz0Var = this.f31207a;
        if (z4 || this.f31209c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = tz0Var.f31492c;
            if (this.f31208b) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f31209c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            tz0Var.f31491b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = tz0Var.h;
            float width = getWidth() + tz0Var.h;
            float height = getHeight();
            float f13 = tz0Var.h;
            if (this.f31209c) {
                f11 = -1.0f;
            } else {
                f11 = 1.0f;
            }
            rectF.set(f12, f12, width, (f13 * AndroidUtilities.dp(f11)) + height);
            tz0Var.f31491b.addRoundRect(rectF, tz0Var.f31492c, Path.Direction.CW);
            canvas2.drawPath(tz0Var.f31491b, tz0Var.d);
            canvas2.drawPath(tz0Var.f31491b, tz0Var.f31493e);
        } else {
            float f14 = tz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f14, f14, getWidth() + tz0Var.h, getHeight() + tz0Var.h, tz0Var.d);
            float f15 = tz0Var.h;
            canvas2.drawRect(f15, f15, getWidth() + tz0Var.h, getHeight() + tz0Var.h, tz0Var.f31493e);
        }
        super.onDraw(canvas2);
    }
}
