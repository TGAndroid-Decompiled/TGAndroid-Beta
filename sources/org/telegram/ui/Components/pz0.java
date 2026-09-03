package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pz0 extends FrameLayout {
    public final sz0 f28029a;
    public boolean f28030b;
    public boolean f28031c;
    public boolean d;
    public boolean e;

    public pz0(sz0 sz0Var, View view, boolean z4) {
        super(sz0Var.getContext());
        this.d = false;
        this.e = true;
        this.f28029a = sz0Var;
        setWillNotDraw(false);
        if (!z4) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, k7.b6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z4 = this.f28030b;
        sz0 sz0Var = this.f28029a;
        if (z4 || this.f28031c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = sz0Var.f28845c;
            boolean z10 = this.f28030b;
            if (z10 && this.d) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z10 && this.e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z11 = this.f28031c;
            if (z11 && this.e) {
                f12 = dp;
            } else {
                f12 = 0.0f;
            }
            fArr[5] = f12;
            fArr[4] = f12;
            dp = (z11 && this.d) ? 0.0f : 0.0f;
            fArr[7] = dp;
            fArr[6] = dp;
            sz0Var.f28844b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f14 = sz0Var.h;
            float width = getWidth() - sz0Var.h;
            float height = getHeight();
            float f15 = sz0Var.h;
            if (this.f28031c) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * AndroidUtilities.dp(f13)) + height);
            if (!this.e) {
                rectF.right += sz0Var.f28846f;
            }
            sz0Var.f28844b.addRoundRect(rectF, sz0Var.f28845c, Path.Direction.CW);
            canvas2.drawPath(sz0Var.f28844b, sz0Var.e);
        } else {
            float f16 = sz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f16, f16, getWidth() - sz0Var.h, getHeight() + sz0Var.h, sz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
