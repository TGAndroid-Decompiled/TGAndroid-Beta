package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a01 extends TextView {
    public final b01 f22473a;
    public boolean f22474b;
    public boolean f22475c;

    public a01(b01 b01Var, CharSequence charSequence) {
        super(b01Var.getContext());
        this.f22473a = b01Var;
        org.telegram.ui.ActionBar.d6 d6Var = b01Var.f22817a;
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
        boolean z10 = this.f22474b;
        b01 b01Var = this.f22473a;
        if (z10 || this.f22475c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = b01Var.f22819c;
            if (this.f22474b) {
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
            if (!this.f22475c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            b01Var.f22818b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = b01Var.h;
            float width = getWidth() + b01Var.h;
            float height = getHeight();
            float f12 = b01Var.h;
            if (this.f22475c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            b01Var.f22818b.addRoundRect(rectF, b01Var.f22819c, Path.Direction.CW);
            canvas2.drawPath(b01Var.f22818b, b01Var.d);
            canvas2.drawPath(b01Var.f22818b, b01Var.e);
        } else {
            float f13 = b01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + b01Var.h, getHeight() + b01Var.h, b01Var.d);
            float f14 = b01Var.h;
            canvas2.drawRect(f14, f14, getWidth() + b01Var.h, getHeight() + b01Var.h, b01Var.e);
        }
        super.onDraw(canvas2);
    }
}
