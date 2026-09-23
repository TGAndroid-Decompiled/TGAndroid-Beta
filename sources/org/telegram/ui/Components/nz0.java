package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class nz0 extends TextView {
    public final oz0 f26546a;
    public boolean f26547b;
    public boolean f26548c;

    public nz0(oz0 oz0Var, CharSequence charSequence) {
        super(oz0Var.getContext());
        this.f26546a = oz0Var;
        org.telegram.ui.ActionBar.d6 d6Var = oz0Var.f26887a;
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
        boolean z10 = this.f26547b;
        oz0 oz0Var = this.f26546a;
        if (z10 || this.f26548c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = oz0Var.f26889c;
            if (this.f26547b) {
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
            if (!this.f26548c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            oz0Var.f26888b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = oz0Var.h;
            float width = getWidth() + oz0Var.h;
            float height = getHeight();
            float f12 = oz0Var.h;
            if (this.f26548c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            oz0Var.f26888b.addRoundRect(rectF, oz0Var.f26889c, Path.Direction.CW);
            canvas2.drawPath(oz0Var.f26888b, oz0Var.d);
            canvas2.drawPath(oz0Var.f26888b, oz0Var.e);
        } else {
            float f13 = oz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + oz0Var.h, getHeight() + oz0Var.h, oz0Var.d);
            float f14 = oz0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + oz0Var.h, getHeight() + oz0Var.h, oz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
