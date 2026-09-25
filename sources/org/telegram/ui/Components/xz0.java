package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xz0 extends FrameLayout {
    public final zz0 f30441a;
    public boolean f30442b;
    public boolean f30443c;
    public boolean d;

    public xz0(zz0 zz0Var, View view, boolean z10) {
        super(zz0Var.getContext());
        this.f30441a = zz0Var;
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
        boolean z10 = this.f30443c;
        zz0 zz0Var = this.f30441a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = zz0Var.f31019c;
            boolean z11 = this.f30443c;
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
            zz0Var.f31018b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = zz0Var.h;
            float width = getWidth() - zz0Var.h;
            float height = getHeight();
            float f14 = zz0Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            zz0Var.f31018b.addRoundRect(rectF, zz0Var.f31019c, Path.Direction.CW);
            if (this.f30442b) {
                canvas2.drawPath(zz0Var.f31018b, zz0Var.d);
            }
            canvas2.drawPath(zz0Var.f31018b, zz0Var.e);
        } else {
            if (this.f30442b) {
                float f15 = zz0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + zz0Var.h, getHeight() + zz0Var.h, zz0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = zz0Var.h;
            canvas2.drawRect(f16, f16, getWidth() - zz0Var.h, getHeight() + zz0Var.h, zz0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f30442b = z10;
    }
}
