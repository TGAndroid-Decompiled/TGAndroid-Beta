package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mz0 extends FrameLayout {
    public final oz0 f28575a;
    public boolean f28576b;
    public boolean f28577c;
    public boolean d;

    public mz0(oz0 oz0Var, View view, boolean z10) {
        super(oz0Var.getContext());
        this.f28575a = oz0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.x5.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f28577c;
        oz0 oz0Var = this.f28575a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = oz0Var.f29244c;
            boolean z11 = this.f28577c;
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
            oz0Var.f29243b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = oz0Var.h;
            float width = getWidth() - oz0Var.h;
            float height = getHeight();
            float f14 = oz0Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            oz0Var.f29243b.addRoundRect(rectF, oz0Var.f29244c, Path.Direction.CW);
            if (this.f28576b) {
                canvas2.drawPath(oz0Var.f29243b, oz0Var.d);
            }
            canvas2.drawPath(oz0Var.f29243b, oz0Var.f29245e);
        } else {
            if (this.f28576b) {
                float f15 = oz0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + oz0Var.h, getHeight() + oz0Var.h, oz0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = oz0Var.h;
            canvas2.drawRect(f16, f16, getWidth() - oz0Var.h, getHeight() + oz0Var.h, oz0Var.f29245e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f28576b = z10;
    }
}
