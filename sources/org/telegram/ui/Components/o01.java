package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o01 extends FrameLayout {
    public final r01 f29318a;
    public boolean f29319b;
    public boolean f29320c;
    public boolean d;
    public boolean f29321e;

    public o01(r01 r01Var, View view, boolean z10) {
        super(r01Var.getContext());
        this.d = false;
        this.f29321e = true;
        this.f29318a = r01Var;
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
        boolean z10 = this.f29319b;
        r01 r01Var = this.f29318a;
        if (z10 || this.f29320c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = r01Var.f30327c;
            boolean z11 = this.f29319b;
            if (z11 && this.d) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11 && this.f29321e) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f29320c;
            if (z12 && this.f29321e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12 || !this.d) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            r01Var.f30326b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = r01Var.h;
            float width = getWidth() - r01Var.h;
            float height = getHeight();
            float f14 = r01Var.h;
            if (this.f29320c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            if (!this.f29321e) {
                rectF.right += r01Var.f30329f;
            }
            r01Var.f30326b.addRoundRect(rectF, r01Var.f30327c, Path.Direction.CW);
            canvas2.drawPath(r01Var.f30326b, r01Var.f30328e);
        } else {
            float f15 = r01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - r01Var.h, getHeight() + r01Var.h, r01Var.f30328e);
        }
        super.onDraw(canvas2);
    }
}
