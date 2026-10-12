package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u01 extends FrameLayout {
    public final x01 f31010a;
    public boolean f31011b;
    public boolean f31012c;
    public boolean d;
    public boolean f31013e;

    public u01(x01 x01Var, View view, boolean z10) {
        super(x01Var.getContext());
        this.d = false;
        this.f31013e = true;
        this.f31010a = x01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.w5.d(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f31011b;
        x01 x01Var = this.f31010a;
        if (z10 || this.f31012c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = x01Var.f32600c;
            boolean z11 = this.f31011b;
            if (z11 && this.d) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11 && this.f31013e) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f31012c;
            if (z12 && this.f31013e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12 || !this.d) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            x01Var.f32599b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = x01Var.h;
            float width = getWidth() - x01Var.h;
            float height = getHeight();
            float f14 = x01Var.h;
            if (this.f31012c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            if (!this.f31013e) {
                rectF.right += x01Var.f32602f;
            }
            x01Var.f32599b.addRoundRect(rectF, x01Var.f32600c, Path.Direction.CW);
            canvas2.drawPath(x01Var.f32599b, x01Var.f32601e);
        } else {
            float f15 = x01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - x01Var.h, getHeight() + x01Var.h, x01Var.f32601e);
        }
        super.onDraw(canvas2);
    }
}
