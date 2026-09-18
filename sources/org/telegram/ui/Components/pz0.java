package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class pz0 extends TextView {
    public final qz0 f27164a;
    public boolean f27165b;
    public boolean f27166c;

    public pz0(qz0 qz0Var, CharSequence charSequence) {
        super(qz0Var.getContext());
        this.f27164a = qz0Var;
        org.telegram.ui.ActionBar.f6 f6Var = qz0Var.f27465a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        boolean z10 = this.f27165b;
        qz0 qz0Var = this.f27164a;
        if (z10 || this.f27166c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = qz0Var.f27467c;
            if (this.f27165b) {
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
            if (!this.f27166c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            qz0Var.f27466b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = qz0Var.h;
            float width = getWidth() + qz0Var.h;
            float height = getHeight();
            float f12 = qz0Var.h;
            if (this.f27166c) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            rectF.set(f11, f11, width, (f12 * AndroidUtilities.dp(f10)) + height);
            qz0Var.f27466b.addRoundRect(rectF, qz0Var.f27467c, Path.Direction.CW);
            canvas2.drawPath(qz0Var.f27466b, qz0Var.d);
            canvas2.drawPath(qz0Var.f27466b, qz0Var.e);
        } else {
            float f13 = qz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + qz0Var.h, getHeight() + qz0Var.h, qz0Var.d);
            float f14 = qz0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + qz0Var.h, getHeight() + qz0Var.h, qz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
