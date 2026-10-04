package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h01 extends FrameLayout {
    public final k01 f26962a;
    public boolean f26963b;
    public boolean f26964c;
    public boolean d;
    public boolean f26965e;

    public h01(k01 k01Var, View view, boolean z10) {
        super(k01Var.getContext());
        this.d = false;
        this.f26965e = true;
        this.f26962a = k01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.z5.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f26963b;
        k01 k01Var = this.f26962a;
        if (z10 || this.f26964c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = k01Var.f27928c;
            boolean z11 = this.f26963b;
            if (z11 && this.d) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11 && this.f26965e) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f26964c;
            if (z12 && this.f26965e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            dp = (z12 && this.d) ? 0.0f : 0.0f;
            fArr[7] = dp;
            fArr[6] = dp;
            k01Var.f27927b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = k01Var.h;
            float width = getWidth() - k01Var.h;
            float height = getHeight();
            float f14 = k01Var.h;
            if (this.f26964c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            if (!this.f26965e) {
                rectF.right += k01Var.f27930f;
            }
            k01Var.f27927b.addRoundRect(rectF, k01Var.f27928c, Path.Direction.CW);
            canvas2.drawPath(k01Var.f27927b, k01Var.f27929e);
        } else {
            float f15 = k01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - k01Var.h, getHeight() + k01Var.h, k01Var.f27929e);
        }
        super.onDraw(canvas2);
    }
}
