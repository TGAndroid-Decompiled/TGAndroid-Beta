package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j01 extends TextView {
    public final k01 f27555a;
    public boolean f27556b;
    public boolean f27557c;

    public j01(k01 k01Var, CharSequence charSequence) {
        super(k01Var.getContext());
        this.f27555a = k01Var;
        org.telegram.ui.ActionBar.d6 d6Var = k01Var.f27932a;
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
        boolean z10 = this.f27556b;
        k01 k01Var = this.f27555a;
        if (z10 || this.f27557c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = k01Var.f27934c;
            if (this.f27556b) {
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
            if (!this.f27557c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            k01Var.f27933b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = k01Var.h;
            float width = getWidth() + k01Var.h;
            float height = getHeight();
            float f12 = k01Var.h;
            if (this.f27557c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            k01Var.f27933b.addRoundRect(rectF, k01Var.f27934c, Path.Direction.CW);
            canvas2.drawPath(k01Var.f27933b, k01Var.d);
            canvas2.drawPath(k01Var.f27933b, k01Var.f27935e);
        } else {
            float f13 = k01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + k01Var.h, getHeight() + k01Var.h, k01Var.d);
            float f14 = k01Var.h;
            canvas2.drawRect(f14, f14, getWidth() + k01Var.h, getHeight() + k01Var.h, k01Var.f27935e);
        }
        super.onDraw(canvas2);
    }
}
