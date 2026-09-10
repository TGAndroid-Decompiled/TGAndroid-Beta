package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a01 extends TextView {
    public final b01 f21334a;
    public boolean f21335b;
    public boolean f21336c;

    public a01(b01 b01Var, CharSequence charSequence) {
        super(b01Var.getContext());
        this.f21334a = b01Var;
        org.telegram.ui.ActionBar.f6 f6Var = b01Var.f21671a;
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
        boolean z10 = this.f21335b;
        b01 b01Var = this.f21334a;
        if (z10 || this.f21336c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = b01Var.f21673c;
            if (this.f21335b) {
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
            if (!this.f21336c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            b01Var.f21672b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = b01Var.h;
            float width = getWidth() + b01Var.h;
            float height = getHeight();
            float f12 = b01Var.h;
            if (this.f21336c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            b01Var.f21672b.addRoundRect(rectF, b01Var.f21673c, Path.Direction.CW);
            canvas2.drawPath(b01Var.f21672b, b01Var.d);
            canvas2.drawPath(b01Var.f21672b, b01Var.e);
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
