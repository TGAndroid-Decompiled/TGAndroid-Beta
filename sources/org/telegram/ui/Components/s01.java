package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s01 extends TextView {
    public final t01 f30578a;
    public boolean f30579b;
    public boolean f30580c;

    public s01(t01 t01Var, CharSequence charSequence) {
        super(t01Var.getContext());
        this.f30578a = t01Var;
        org.telegram.ui.ActionBar.d6 d6Var = t01Var.f30922a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        boolean z10 = this.f30579b;
        t01 t01Var = this.f30578a;
        if (z10 || this.f30580c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = t01Var.f30924c;
            if (this.f30579b) {
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
            if (!this.f30580c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            t01Var.f30923b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = t01Var.h;
            float width = getWidth() + t01Var.h;
            float height = getHeight();
            float f11 = t01Var.h;
            if (this.f30580c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            t01Var.f30923b.addRoundRect(rectF, t01Var.f30924c, Path.Direction.CW);
            canvas2.drawPath(t01Var.f30923b, t01Var.d);
            canvas2.drawPath(t01Var.f30923b, t01Var.f30925e);
        } else {
            float f12 = t01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + t01Var.h, getHeight() + t01Var.h, t01Var.d);
            float f13 = t01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + t01Var.h, getHeight() + t01Var.h, t01Var.f30925e);
        }
        super.onDraw(canvas2);
    }
}
