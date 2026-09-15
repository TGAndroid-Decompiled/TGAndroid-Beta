package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class oz0 extends TextView {
    public final pz0 f26913a;
    public boolean f26914b;
    public boolean f26915c;

    public oz0(pz0 pz0Var, CharSequence charSequence) {
        super(pz0Var.getContext());
        this.f26913a = pz0Var;
        org.telegram.ui.ActionBar.e6 e6Var = pz0Var.f27202a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        boolean z10 = this.f26914b;
        pz0 pz0Var = this.f26913a;
        if (z10 || this.f26915c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = pz0Var.f27204c;
            if (this.f26914b) {
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
            if (!this.f26915c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            pz0Var.f27203b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = pz0Var.h;
            float width = getWidth() + pz0Var.h;
            float height = getHeight();
            float f12 = pz0Var.h;
            if (this.f26915c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            pz0Var.f27203b.addRoundRect(rectF, pz0Var.f27204c, Path.Direction.CW);
            canvas2.drawPath(pz0Var.f27203b, pz0Var.d);
            canvas2.drawPath(pz0Var.f27203b, pz0Var.e);
        } else {
            float f13 = pz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + pz0Var.h, getHeight() + pz0Var.h, pz0Var.d);
            float f14 = pz0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + pz0Var.h, getHeight() + pz0Var.h, pz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
