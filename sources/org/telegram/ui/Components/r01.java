package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r01 extends TextView {
    public final s01 f30325a;
    public boolean f30326b;
    public boolean f30327c;

    public r01(s01 s01Var, CharSequence charSequence) {
        super(s01Var.getContext());
        this.f30325a = s01Var;
        org.telegram.ui.ActionBar.e6 e6Var = s01Var.f30626a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        boolean z10 = this.f30326b;
        s01 s01Var = this.f30325a;
        if (z10 || this.f30327c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = s01Var.f30628c;
            if (this.f30326b) {
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
            if (!this.f30327c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            s01Var.f30627b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = s01Var.h;
            float width = getWidth() + s01Var.h;
            float height = getHeight();
            float f11 = s01Var.h;
            if (this.f30327c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            s01Var.f30627b.addRoundRect(rectF, s01Var.f30628c, Path.Direction.CW);
            canvas2.drawPath(s01Var.f30627b, s01Var.d);
            canvas2.drawPath(s01Var.f30627b, s01Var.f30629e);
        } else {
            float f12 = s01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + s01Var.h, getHeight() + s01Var.h, s01Var.d);
            float f13 = s01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + s01Var.h, getHeight() + s01Var.h, s01Var.f30629e);
        }
        super.onDraw(canvas2);
    }
}
