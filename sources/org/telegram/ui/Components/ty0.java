package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ty0 extends FrameLayout {
    public final wy0 f32835a;
    public boolean f32836b;
    public boolean f32837c;
    public boolean d;
    public boolean f32838e;

    public ty0(wy0 wy0Var, View view, boolean z10) {
        super(wy0Var.getContext());
        this.d = false;
        this.f32838e = true;
        this.f32835a = wy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, g7.e6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10 = this.f32836b;
        wy0 wy0Var = this.f32835a;
        if (z10 || this.f32837c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = wy0Var.f34471c;
            boolean z11 = this.f32836b;
            if (z11 && this.d) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z11 && this.f32838e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.f32837c;
            if (z12 && this.f32838e) {
                f12 = dp;
            } else {
                f12 = 0.0f;
            }
            fArr[5] = f12;
            fArr[4] = f12;
            dp = (z12 && this.d) ? 0.0f : 0.0f;
            fArr[7] = dp;
            fArr[6] = dp;
            wy0Var.f34470b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f14 = wy0Var.h;
            float width = getWidth() - wy0Var.h;
            float height = getHeight();
            float f15 = wy0Var.h;
            if (this.f32837c) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * AndroidUtilities.dp(f13)) + height);
            if (!this.f32838e) {
                rectF.right += wy0Var.f34473f;
            }
            wy0Var.f34470b.addRoundRect(rectF, wy0Var.f34471c, Path.Direction.CW);
            canvas2.drawPath(wy0Var.f34470b, wy0Var.f34472e);
        } else {
            float f16 = wy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f16, f16, getWidth() - wy0Var.h, getHeight() + wy0Var.h, wy0Var.f34472e);
        }
        super.onDraw(canvas2);
    }
}
