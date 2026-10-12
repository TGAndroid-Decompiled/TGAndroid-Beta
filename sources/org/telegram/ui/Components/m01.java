package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m01 extends TextView {
    public final n01 f27150a;
    public boolean f27151b;
    public boolean f27152c;

    public m01(n01 n01Var, CharSequence charSequence) {
        super(n01Var.getContext());
        this.f27150a = n01Var;
        org.telegram.ui.ActionBar.c6 c6Var = n01Var.f27553a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        boolean z10 = this.f27151b;
        n01 n01Var = this.f27150a;
        if (z10 || this.f27152c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = n01Var.f27555c;
            if (this.f27151b) {
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
            if (!this.f27152c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            n01Var.f27554b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = n01Var.h;
            float width = getWidth() + n01Var.h;
            float height = getHeight();
            float f11 = n01Var.h;
            if (this.f27152c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            n01Var.f27554b.addRoundRect(rectF, n01Var.f27555c, Path.Direction.CW);
            canvas2.drawPath(n01Var.f27554b, n01Var.d);
            canvas2.drawPath(n01Var.f27554b, n01Var.e);
        } else {
            float f12 = n01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + n01Var.h, getHeight() + n01Var.h, n01Var.d);
            float f13 = n01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + n01Var.h, getHeight() + n01Var.h, n01Var.e);
        }
        super.onDraw(canvas2);
    }
}
