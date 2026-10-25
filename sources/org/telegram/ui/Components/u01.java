package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u01 extends FrameLayout {
    public final w01 f33195a;
    public boolean f33196b;
    public boolean f33197c;
    public boolean d;

    public u01(w01 w01Var, View view, boolean z10) {
        super(w01Var.getContext());
        this.f33195a = w01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, gb1.g(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f33197c;
        w01 w01Var = this.f33195a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = w01Var.f34320c;
            boolean z11 = this.f33197c;
            if (z11) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.d;
            if (z12) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            w01Var.f34319b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = w01Var.h;
            float width = getWidth() - w01Var.h;
            float height = getHeight();
            float f14 = w01Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            w01Var.f34319b.addRoundRect(rectF, w01Var.f34320c, Path.Direction.CW);
            if (this.f33196b) {
                canvas2.drawPath(w01Var.f34319b, w01Var.d);
            }
            canvas2.drawPath(w01Var.f34319b, w01Var.e);
        } else {
            if (this.f33196b) {
                float f15 = w01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + w01Var.h, getHeight() + w01Var.h, w01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = w01Var.h;
            canvas2.drawRect(f16, f16, getWidth() - w01Var.h, getHeight() + w01Var.h, w01Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f33196b = z10;
    }
}
