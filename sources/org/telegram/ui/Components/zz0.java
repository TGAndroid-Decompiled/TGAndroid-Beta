package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class zz0 extends FrameLayout {
    public final b01 f30975a;
    public boolean f30976b;
    public boolean f30977c;
    public boolean d;

    public zz0(b01 b01Var, View view, boolean z10) {
        super(b01Var.getContext());
        this.f30975a = b01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.y5.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f30977c;
        b01 b01Var = this.f30975a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = b01Var.f22771c;
            boolean z11 = this.f30977c;
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
            b01Var.f22770b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = b01Var.h;
            float width = getWidth() - b01Var.h;
            float height = getHeight();
            float f14 = b01Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            b01Var.f22770b.addRoundRect(rectF, b01Var.f22771c, Path.Direction.CW);
            if (this.f30976b) {
                canvas2.drawPath(b01Var.f22770b, b01Var.d);
            }
            canvas2.drawPath(b01Var.f22770b, b01Var.e);
        } else {
            if (this.f30976b) {
                float f15 = b01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + b01Var.h, getHeight() + b01Var.h, b01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = b01Var.h;
            canvas2.drawRect(f16, f16, getWidth() - b01Var.h, getHeight() + b01Var.h, b01Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f30976b = z10;
    }
}
