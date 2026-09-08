package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lz0 extends FrameLayout {
    public final oz0 f28347a;
    public boolean f28348b;
    public boolean f28349c;
    public boolean d;
    public boolean f28350e;

    public lz0(oz0 oz0Var, View view, boolean z10) {
        super(oz0Var.getContext());
        this.d = false;
        this.f28350e = true;
        this.f28347a = oz0Var;
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
        boolean z10 = this.f28348b;
        oz0 oz0Var = this.f28347a;
        if (z10 || this.f28349c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = oz0Var.f29271c;
            boolean z11 = this.f28348b;
            if (z11 && this.d) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11 && this.f28350e) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f28349c;
            if (z12 && this.f28350e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            dp = (z12 && this.d) ? 0.0f : 0.0f;
            fArr[7] = dp;
            fArr[6] = dp;
            oz0Var.f29270b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = oz0Var.h;
            float width = getWidth() - oz0Var.h;
            float height = getHeight();
            float f14 = oz0Var.h;
            if (this.f28349c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            if (!this.f28350e) {
                rectF.right += oz0Var.f29273f;
            }
            oz0Var.f29270b.addRoundRect(rectF, oz0Var.f29271c, Path.Direction.CW);
            canvas2.drawPath(oz0Var.f29270b, oz0Var.f29272e);
        } else {
            float f15 = oz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - oz0Var.h, getHeight() + oz0Var.h, oz0Var.f29272e);
        }
        super.onDraw(canvas2);
    }
}
