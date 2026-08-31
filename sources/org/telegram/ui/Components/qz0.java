package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qz0 extends FrameLayout {
    public final tz0 f30534a;
    public boolean f30535b;
    public boolean f30536c;
    public boolean d;
    public boolean f30537e;

    public qz0(tz0 tz0Var, View view, boolean z4) {
        super(tz0Var.getContext());
        this.d = false;
        this.f30537e = true;
        this.f30534a = tz0Var;
        setWillNotDraw(false);
        if (!z4) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, k7.c6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z4 = this.f30535b;
        tz0 tz0Var = this.f30534a;
        if (z4 || this.f30536c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = tz0Var.f31492c;
            boolean z10 = this.f30535b;
            if (z10 && this.d) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z10 && this.f30537e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z11 = this.f30536c;
            if (z11 && this.f30537e) {
                f12 = dp;
            } else {
                f12 = 0.0f;
            }
            fArr[5] = f12;
            fArr[4] = f12;
            dp = (z11 && this.d) ? 0.0f : 0.0f;
            fArr[7] = dp;
            fArr[6] = dp;
            tz0Var.f31491b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f14 = tz0Var.h;
            float width = getWidth() - tz0Var.h;
            float height = getHeight();
            float f15 = tz0Var.h;
            if (this.f30536c) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * AndroidUtilities.dp(f13)) + height);
            if (!this.f30537e) {
                rectF.right += tz0Var.f31494f;
            }
            tz0Var.f31491b.addRoundRect(rectF, tz0Var.f31492c, Path.Direction.CW);
            canvas2.drawPath(tz0Var.f31491b, tz0Var.f31493e);
        } else {
            float f16 = tz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f16, f16, getWidth() - tz0Var.h, getHeight() + tz0Var.h, tz0Var.f31493e);
        }
        super.onDraw(canvas2);
    }
}
