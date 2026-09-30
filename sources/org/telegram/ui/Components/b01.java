package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b01 extends TextView {
    public final c01 f22764a;
    public boolean f22765b;
    public boolean f22766c;

    public b01(c01 c01Var, CharSequence charSequence) {
        super(c01Var.getContext());
        this.f22764a = c01Var;
        org.telegram.ui.ActionBar.d6 d6Var = c01Var.f23116a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        boolean z10 = this.f22765b;
        c01 c01Var = this.f22764a;
        if (z10 || this.f22766c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = c01Var.f23118c;
            if (this.f22765b) {
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
            if (!this.f22766c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            c01Var.f23117b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = c01Var.h;
            float width = getWidth() + c01Var.h;
            float height = getHeight();
            float f12 = c01Var.h;
            if (this.f22766c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            c01Var.f23117b.addRoundRect(rectF, c01Var.f23118c, Path.Direction.CW);
            canvas2.drawPath(c01Var.f23117b, c01Var.d);
            canvas2.drawPath(c01Var.f23117b, c01Var.e);
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
