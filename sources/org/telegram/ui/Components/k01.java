package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class k01 extends TextView {
    public final l01 f27690a;
    public boolean f27691b;
    public boolean f27692c;

    public k01(l01 l01Var, CharSequence charSequence) {
        super(l01Var.getContext());
        this.f27690a = l01Var;
        org.telegram.ui.ActionBar.d6 d6Var = l01Var.f27996a;
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
        boolean z10 = this.f27691b;
        l01 l01Var = this.f27690a;
        if (z10 || this.f27692c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = l01Var.f27998c;
            if (this.f27691b) {
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
            if (!this.f27692c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            l01Var.f27997b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = l01Var.h;
            float width = getWidth() + l01Var.h;
            float height = getHeight();
            float f11 = l01Var.h;
            if (this.f27692c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            l01Var.f27997b.addRoundRect(rectF, l01Var.f27998c, Path.Direction.CW);
            canvas2.drawPath(l01Var.f27997b, l01Var.d);
            canvas2.drawPath(l01Var.f27997b, l01Var.e);
        } else {
            float f12 = l01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + l01Var.h, getHeight() + l01Var.h, l01Var.d);
            float f13 = l01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + l01Var.h, getHeight() + l01Var.h, l01Var.e);
        }
        super.onDraw(canvas2);
    }
}
