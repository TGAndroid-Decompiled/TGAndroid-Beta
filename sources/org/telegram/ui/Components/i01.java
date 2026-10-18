package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class i01 extends TextView {
    public final j01 f27038a;
    public boolean f27039b;
    public boolean f27040c;

    public i01(j01 j01Var, CharSequence charSequence) {
        super(j01Var.getContext());
        this.f27038a = j01Var;
        org.telegram.ui.ActionBar.d6 d6Var = j01Var.f27393a;
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
        boolean z10 = this.f27039b;
        j01 j01Var = this.f27038a;
        if (z10 || this.f27040c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = j01Var.f27395c;
            if (this.f27039b) {
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
            if (!this.f27040c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            j01Var.f27394b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = j01Var.h;
            float width = getWidth() + j01Var.h;
            float height = getHeight();
            float f11 = j01Var.h;
            if (this.f27040c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            j01Var.f27394b.addRoundRect(rectF, j01Var.f27395c, Path.Direction.CW);
            canvas2.drawPath(j01Var.f27394b, j01Var.d);
            canvas2.drawPath(j01Var.f27394b, j01Var.e);
        } else {
            float f12 = j01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + j01Var.h, getHeight() + j01Var.h, j01Var.d);
            float f13 = j01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + j01Var.h, getHeight() + j01Var.h, j01Var.e);
        }
        super.onDraw(canvas2);
    }
}
