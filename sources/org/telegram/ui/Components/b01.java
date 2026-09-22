package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b01 extends TextView {
    public final c01 f22796a;
    public boolean f22797b;
    public boolean f22798c;

    public b01(c01 c01Var, CharSequence charSequence) {
        super(c01Var.getContext());
        this.f22796a = c01Var;
        org.telegram.ui.ActionBar.f6 f6Var = c01Var.f23132a;
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
        boolean z10 = this.f22797b;
        c01 c01Var = this.f22796a;
        if (z10 || this.f22798c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = c01Var.f23134c;
            if (this.f22797b) {
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
            if (!this.f22798c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            c01Var.f23133b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = c01Var.h;
            float width = getWidth() + c01Var.h;
            float height = getHeight();
            float f12 = c01Var.h;
            if (this.f22798c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            c01Var.f23133b.addRoundRect(rectF, c01Var.f23134c, Path.Direction.CW);
            canvas2.drawPath(c01Var.f23133b, c01Var.d);
            canvas2.drawPath(c01Var.f23133b, c01Var.e);
        } else {
            float f13 = c01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + c01Var.h, getHeight() + c01Var.h, c01Var.d);
            float f14 = c01Var.h;
            canvas2.drawRect(f14, f14, getWidth() + c01Var.h, getHeight() + c01Var.h, c01Var.e);
        }
        super.onDraw(canvas2);
    }
}
