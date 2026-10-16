package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m01 extends FrameLayout {
    public final o01 f26866a;
    public boolean f26867b;
    public boolean f26868c;
    public boolean d;

    public m01(o01 o01Var, View view, boolean z10) {
        super(o01Var.getContext());
        this.f26866a = o01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.z5.d(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f26868c;
        o01 o01Var = this.f26866a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = o01Var.f27463c;
            boolean z11 = this.f26868c;
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
            o01Var.f27462b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = o01Var.h;
            float width = getWidth() - o01Var.h;
            float height = getHeight();
            float f14 = o01Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            o01Var.f27462b.addRoundRect(rectF, o01Var.f27463c, Path.Direction.CW);
            if (this.f26867b) {
                canvas2.drawPath(o01Var.f27462b, o01Var.d);
            }
            canvas2.drawPath(o01Var.f27462b, o01Var.e);
        } else {
            if (this.f26867b) {
                float f15 = o01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + o01Var.h, getHeight() + o01Var.h, o01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = o01Var.h;
            canvas2.drawRect(f16, f16, getWidth() - o01Var.h, getHeight() + o01Var.h, o01Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f26867b = z10;
    }
}
