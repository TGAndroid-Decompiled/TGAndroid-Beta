package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yz0 extends TextView {
    public final zz0 f30739a;
    public boolean f30740b;
    public boolean f30741c;

    public yz0(zz0 zz0Var, CharSequence charSequence) {
        super(zz0Var.getContext());
        this.f30739a = zz0Var;
        org.telegram.ui.ActionBar.d6 d6Var = zz0Var.f31016a;
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
        boolean z10 = this.f30740b;
        zz0 zz0Var = this.f30739a;
        if (z10 || this.f30741c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = zz0Var.f31018c;
            if (this.f30740b) {
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
            if (!this.f30741c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            zz0Var.f31017b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = zz0Var.h;
            float width = getWidth() + zz0Var.h;
            float height = getHeight();
            float f12 = zz0Var.h;
            if (this.f30741c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            zz0Var.f31017b.addRoundRect(rectF, zz0Var.f31018c, Path.Direction.CW);
            canvas2.drawPath(zz0Var.f31017b, zz0Var.d);
            canvas2.drawPath(zz0Var.f31017b, zz0Var.e);
        } else {
            float f13 = zz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + zz0Var.h, getHeight() + zz0Var.h, zz0Var.d);
            float f14 = zz0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + zz0Var.h, getHeight() + zz0Var.h, zz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
