package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j01 extends TextView {
    public final k01 f27398a;
    public boolean f27399b;
    public boolean f27400c;

    public j01(k01 k01Var, CharSequence charSequence) {
        super(k01Var.getContext());
        this.f27398a = k01Var;
        org.telegram.ui.ActionBar.d6 d6Var = k01Var.f27647a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        boolean z10 = this.f27399b;
        k01 k01Var = this.f27398a;
        if (z10 || this.f27400c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = k01Var.f27649c;
            if (this.f27399b) {
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
            if (!this.f27400c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            k01Var.f27648b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = k01Var.h;
            float width = getWidth() + k01Var.h;
            float height = getHeight();
            float f11 = k01Var.h;
            if (this.f27400c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            k01Var.f27648b.addRoundRect(rectF, k01Var.f27649c, Path.Direction.CW);
            canvas2.drawPath(k01Var.f27648b, k01Var.d);
            canvas2.drawPath(k01Var.f27648b, k01Var.e);
        } else {
            float f12 = k01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + k01Var.h, getHeight() + k01Var.h, k01Var.d);
            float f13 = k01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + k01Var.h, getHeight() + k01Var.h, k01Var.e);
        }
        super.onDraw(canvas2);
    }
}
