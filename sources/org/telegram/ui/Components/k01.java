package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class k01 extends TextView {
    public final l01 f28020a;
    public boolean f28021b;
    public boolean f28022c;

    public k01(l01 l01Var, CharSequence charSequence) {
        super(l01Var.getContext());
        this.f28020a = l01Var;
        org.telegram.ui.ActionBar.d6 d6Var = l01Var.f28335a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        boolean z10 = this.f28021b;
        l01 l01Var = this.f28020a;
        if (z10 || this.f28022c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = l01Var.f28337c;
            if (this.f28021b) {
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
            if (!this.f28022c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            l01Var.f28336b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = l01Var.h;
            float width = getWidth() + l01Var.h;
            float height = getHeight();
            float f12 = l01Var.h;
            if (this.f28022c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            l01Var.f28336b.addRoundRect(rectF, l01Var.f28337c, Path.Direction.CW);
            canvas2.drawPath(l01Var.f28336b, l01Var.d);
            canvas2.drawPath(l01Var.f28336b, l01Var.f28338e);
        } else {
            float f13 = l01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + l01Var.h, getHeight() + l01Var.h, l01Var.d);
            float f14 = l01Var.h;
            canvas2.drawRect(f14, f14, getWidth() + l01Var.h, getHeight() + l01Var.h, l01Var.f28338e);
        }
        super.onDraw(canvas2);
    }
}
