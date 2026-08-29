package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class gz0 extends TextView {
    public final hz0 f29014a;
    public boolean f29015b;
    public boolean f29016c;

    public gz0(hz0 hz0Var, CharSequence charSequence) {
        super(hz0Var.getContext());
        this.f29014a = hz0Var;
        org.telegram.ui.ActionBar.c6 c6Var = hz0Var.f29281a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f9;
        float f10;
        boolean z10 = this.f29015b;
        hz0 hz0Var = this.f29014a;
        if (z10 || this.f29016c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = hz0Var.f29283c;
            if (this.f29015b) {
                f9 = dp;
            } else {
                f9 = 0.0f;
            }
            fArr[1] = f9;
            fArr[0] = f9;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f29016c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            hz0Var.f29282b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = hz0Var.h;
            float width = getWidth() + hz0Var.h;
            float height = getHeight();
            float f12 = hz0Var.h;
            if (this.f29016c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            hz0Var.f29282b.addRoundRect(rectF, hz0Var.f29283c, Path.Direction.CW);
            canvas2.drawPath(hz0Var.f29282b, hz0Var.d);
            canvas2.drawPath(hz0Var.f29282b, hz0Var.f29284e);
        } else {
            float f13 = hz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + hz0Var.h, getHeight() + hz0Var.h, hz0Var.d);
            float f14 = hz0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + hz0Var.h, getHeight() + hz0Var.h, hz0Var.f29284e);
        }
        super.onDraw(canvas2);
    }
}
