package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q01 extends FrameLayout {
    public final s01 f30074a;
    public boolean f30075b;
    public boolean f30076c;
    public boolean d;

    public q01(s01 s01Var, View view, boolean z10) {
        super(s01Var.getContext());
        this.f30074a = s01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.x5.d(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f30076c;
        s01 s01Var = this.f30074a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = s01Var.f30687c;
            boolean z11 = this.f30076c;
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
            s01Var.f30686b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = s01Var.h;
            float width = getWidth() - s01Var.h;
            float height = getHeight();
            float f14 = s01Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            s01Var.f30686b.addRoundRect(rectF, s01Var.f30687c, Path.Direction.CW);
            if (this.f30075b) {
                canvas2.drawPath(s01Var.f30686b, s01Var.d);
            }
            canvas2.drawPath(s01Var.f30686b, s01Var.f30688e);
        } else {
            if (this.f30075b) {
                float f15 = s01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + s01Var.h, getHeight() + s01Var.h, s01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = s01Var.h;
            canvas2.drawRect(f16, f16, getWidth() - s01Var.h, getHeight() + s01Var.h, s01Var.f30688e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f30075b = z10;
    }
}
