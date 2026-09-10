package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yz0 extends FrameLayout {
    public final b01 f29535a;
    public boolean f29536b;
    public boolean f29537c;
    public boolean d;
    public boolean e;

    public yz0(b01 b01Var, View view, boolean z10) {
        super(b01Var.getContext());
        this.d = false;
        this.e = true;
        this.f29535a = b01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.a6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f29536b;
        b01 b01Var = this.f29535a;
        if (z10 || this.f29537c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = b01Var.f21673c;
            boolean z11 = this.f29536b;
            if (z11 && this.d) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11 && this.e) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f29537c;
            if (z12 && this.e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            dp = (z12 && this.d) ? 0.0f : 0.0f;
            fArr[7] = dp;
            fArr[6] = dp;
            b01Var.f21672b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = b01Var.h;
            float width = getWidth() - b01Var.h;
            float height = getHeight();
            float f14 = b01Var.h;
            if (this.f29537c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            if (!this.e) {
                rectF.right += b01Var.f21674f;
            }
            b01Var.f21672b.addRoundRect(rectF, b01Var.f21673c, Path.Direction.CW);
            canvas2.drawPath(b01Var.f21672b, b01Var.e);
        } else {
            float f15 = b01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - b01Var.h, getHeight() + b01Var.h, b01Var.e);
        }
        super.onDraw(canvas2);
    }
}
