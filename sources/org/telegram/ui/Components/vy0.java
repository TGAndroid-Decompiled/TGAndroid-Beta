package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vy0 extends TextView {
    public final wy0 f34026a;
    public boolean f34027b;
    public boolean f34028c;

    public vy0(wy0 wy0Var, CharSequence charSequence) {
        super(wy0Var.getContext());
        this.f34026a = wy0Var;
        org.telegram.ui.ActionBar.b6 b6Var = wy0Var.f34469a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        boolean z10 = this.f34027b;
        wy0 wy0Var = this.f34026a;
        if (z10 || this.f34028c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = wy0Var.f34471c;
            if (this.f34027b) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f34028c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            wy0Var.f34470b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = wy0Var.h;
            float width = getWidth() + wy0Var.h;
            float height = getHeight();
            float f13 = wy0Var.h;
            if (this.f34028c) {
                f11 = -1.0f;
            } else {
                f11 = 1.0f;
            }
            rectF.set(f12, f12, width, (f13 * AndroidUtilities.dp(f11)) + height);
            wy0Var.f34470b.addRoundRect(rectF, wy0Var.f34471c, Path.Direction.CW);
            canvas2.drawPath(wy0Var.f34470b, wy0Var.d);
            canvas2.drawPath(wy0Var.f34470b, wy0Var.f34472e);
        } else {
            float f14 = wy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f14, f14, getWidth() + wy0Var.h, getHeight() + wy0Var.h, wy0Var.d);
            float f15 = wy0Var.h;
            canvas2.drawRect(f15, f15, getWidth() + wy0Var.h, getHeight() + wy0Var.h, wy0Var.f34472e);
        }
        super.onDraw(canvas2);
    }
}
