package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v01 extends TextView {
    public final w01 f33524a;
    public boolean f33525b;
    public boolean f33526c;

    public v01(w01 w01Var, CharSequence charSequence) {
        super(w01Var.getContext());
        this.f33524a = w01Var;
        org.telegram.ui.ActionBar.u6 u6Var = w01Var.f34318a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        org.telegram.ui.ActionBar.f7.V(this, org.telegram.ui.ActionBar.y6.G6, u6Var);
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        boolean z10 = this.f33525b;
        w01 w01Var = this.f33524a;
        if (z10 || this.f33526c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = w01Var.f34320c;
            if (this.f33525b) {
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
            if (!this.f33526c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            w01Var.f34319b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = w01Var.h;
            float width = getWidth() + w01Var.h;
            float height = getHeight();
            float f11 = w01Var.h;
            if (this.f33526c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            w01Var.f34319b.addRoundRect(rectF, w01Var.f34320c, Path.Direction.CW);
            canvas2.drawPath(w01Var.f34319b, w01Var.d);
            canvas2.drawPath(w01Var.f34319b, w01Var.e);
        } else {
            float f12 = w01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + w01Var.h, getHeight() + w01Var.h, w01Var.d);
            float f13 = w01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + w01Var.h, getHeight() + w01Var.h, w01Var.e);
        }
        super.onDraw(canvas2);
    }
}
