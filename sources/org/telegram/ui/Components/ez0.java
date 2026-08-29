package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ez0 extends FrameLayout {
    public final hz0 f28212a;
    public boolean f28213b;
    public boolean f28214c;
    public boolean d;
    public boolean f28215e;

    public ez0(hz0 hz0Var, View view, boolean z10) {
        super(hz0Var.getContext());
        this.d = false;
        this.f28215e = true;
        this.f28212a = hz0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, i7.f6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f9;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f28213b;
        hz0 hz0Var = this.f28212a;
        if (z10 || this.f28214c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = hz0Var.f29283c;
            boolean z11 = this.f28213b;
            if (z11 && this.d) {
                f9 = dp;
            } else {
                f9 = 0.0f;
            }
            fArr[1] = f9;
            fArr[0] = f9;
            if (z11 && this.f28215e) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f28214c;
            if (z12 && this.f28215e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            dp = (z12 && this.d) ? 0.0f : 0.0f;
            fArr[7] = dp;
            fArr[6] = dp;
            hz0Var.f29282b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = hz0Var.h;
            float width = getWidth() - hz0Var.h;
            float height = getHeight();
            float f14 = hz0Var.h;
            if (this.f28214c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            if (!this.f28215e) {
                rectF.right += hz0Var.f29285f;
            }
            hz0Var.f29282b.addRoundRect(rectF, hz0Var.f29283c, Path.Direction.CW);
            canvas2.drawPath(hz0Var.f29282b, hz0Var.f29284e);
        } else {
            float f15 = hz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - hz0Var.h, getHeight() + hz0Var.h, hz0Var.f29284e);
        }
        super.onDraw(canvas2);
    }
}
