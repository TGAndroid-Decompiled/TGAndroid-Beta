package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class vy0 extends FrameLayout {

    public final yy0 f34068a;

    public boolean f34069b;

    public boolean f34070c;
    public boolean d;

    public boolean f34071e;

    public vy0(yy0 yy0Var, View view, boolean z10) {
        super(yy0Var.getContext());
        this.d = false;
        this.f34071e = true;
        this.f34068a = yy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, h7.z5.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.f34069b;
        yy0 yy0Var = this.f34068a;
        if (z10 || this.f34070c) {
            canvas2 = canvas;
            float fDp = AndroidUtilities.dp(10.0f);
            float[] fArr = yy0Var.f35064c;
            boolean z11 = this.f34069b;
            float f10 = (z11 && this.d) ? fDp : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = (z11 && this.f34071e) ? fDp : 0.0f;
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.f34070c;
            float f12 = (z12 && this.f34071e) ? fDp : 0.0f;
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z12 || !this.d) {
                fDp = 0.0f;
            }
            fArr[7] = fDp;
            fArr[6] = fDp;
            yy0Var.f35063b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = yy0Var.h;
            rectF.set(f13, f13, getWidth() - yy0Var.h, (yy0Var.h * AndroidUtilities.dp(this.f34070c ? -1.0f : 1.0f)) + getHeight());
            if (!this.f34071e) {
                rectF.right += yy0Var.f35066f;
            }
            yy0Var.f35063b.addRoundRect(rectF, yy0Var.f35064c, Path.Direction.CW);
            canvas2.drawPath(yy0Var.f35063b, yy0Var.f35065e);
        } else {
            float f14 = yy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f14, f14, getWidth() - yy0Var.h, getHeight() + yy0Var.h, yy0Var.f35065e);
        }
        super.onDraw(canvas2);
    }
}
