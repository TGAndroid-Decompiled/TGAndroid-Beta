package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class zz0 extends TextView {
    public final a01 f31015a;
    public boolean f31016b;
    public boolean f31017c;

    public zz0(a01 a01Var, CharSequence charSequence) {
        super(a01Var.getContext());
        this.f31015a = a01Var;
        org.telegram.ui.ActionBar.f6 f6Var = a01Var.f22471a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        boolean z10 = this.f31016b;
        a01 a01Var = this.f31015a;
        if (z10 || this.f31017c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = a01Var.f22473c;
            if (this.f31016b) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f31017c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            a01Var.f22472b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = a01Var.h;
            float width = getWidth() + a01Var.h;
            float height = getHeight();
            float f12 = a01Var.h;
            if (this.f31017c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            a01Var.f22472b.addRoundRect(rectF, a01Var.f22473c, Path.Direction.CW);
            canvas2.drawPath(a01Var.f22472b, a01Var.d);
            canvas2.drawPath(a01Var.f22472b, a01Var.e);
        } else {
            float f13 = a01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + a01Var.h, getHeight() + a01Var.h, a01Var.d);
            float f14 = a01Var.h;
            canvas2.drawRect(f14, f14, getWidth() + a01Var.h, getHeight() + a01Var.h, a01Var.e);
        }
        super.onDraw(canvas2);
    }
}
