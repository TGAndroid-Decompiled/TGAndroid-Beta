package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w01 extends TextView {
    public final x01 f34410a;
    public boolean f34411b;
    public boolean f34412c;

    public w01(x01 x01Var, CharSequence charSequence) {
        super(x01Var.getContext());
        this.f34410a = x01Var;
        org.telegram.ui.ActionBar.u6 u6Var = x01Var.f34627a;
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
        boolean z10 = this.f34411b;
        x01 x01Var = this.f34410a;
        if (z10 || this.f34412c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = x01Var.f34629c;
            if (this.f34411b) {
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
            if (!this.f34412c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            x01Var.f34628b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = x01Var.h;
            float width = getWidth() + x01Var.h;
            float height = getHeight();
            float f11 = x01Var.h;
            if (this.f34412c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            x01Var.f34628b.addRoundRect(rectF, x01Var.f34629c, Path.Direction.CW);
            canvas2.drawPath(x01Var.f34628b, x01Var.d);
            canvas2.drawPath(x01Var.f34628b, x01Var.e);
        } else {
            float f12 = x01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + x01Var.h, getHeight() + x01Var.h, x01Var.d);
            float f13 = x01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + x01Var.h, getHeight() + x01Var.h, x01Var.e);
        }
        super.onDraw(canvas2);
    }
}
