package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class i01 extends FrameLayout {
    public final k01 f27275a;
    public boolean f27276b;
    public boolean f27277c;
    public boolean d;

    public i01(k01 k01Var, View view, boolean z10) {
        super(k01Var.getContext());
        this.f27275a = k01Var;
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
        boolean z10 = this.f27277c;
        k01 k01Var = this.f27275a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = k01Var.f27934c;
            boolean z11 = this.f27277c;
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
            k01Var.f27933b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = k01Var.h;
            float width = getWidth() - k01Var.h;
            float height = getHeight();
            float f14 = k01Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            k01Var.f27933b.addRoundRect(rectF, k01Var.f27934c, Path.Direction.CW);
            if (this.f27276b) {
                canvas2.drawPath(k01Var.f27933b, k01Var.d);
            }
            canvas2.drawPath(k01Var.f27933b, k01Var.f27935e);
        } else {
            if (this.f27276b) {
                float f15 = k01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + k01Var.h, getHeight() + k01Var.h, k01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = k01Var.h;
            canvas2.drawRect(f16, f16, getWidth() - k01Var.h, getHeight() + k01Var.h, k01Var.f27935e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f27276b = z10;
    }
}
