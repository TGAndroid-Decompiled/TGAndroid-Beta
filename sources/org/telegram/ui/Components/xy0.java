package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class xy0 extends TextView {

    public final yy0 f34730a;

    public boolean f34731b;

    public boolean f34732c;

    public xy0(yy0 yy0Var, CharSequence charSequence) {
        super(yy0Var.getContext());
        this.f34730a = yy0Var;
        org.telegram.ui.ActionBar.c6 c6Var = yy0Var.f35062a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.f34731b;
        yy0 yy0Var = this.f34730a;
        if (z10 || this.f34732c) {
            canvas2 = canvas;
            float fDp = AndroidUtilities.dp(10.0f);
            float[] fArr = yy0Var.f35064c;
            float f10 = this.f34731b ? fDp : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f34732c) {
                fDp = 0.0f;
            }
            fArr[7] = fDp;
            fArr[6] = fDp;
            yy0Var.f35063b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = yy0Var.h;
            rectF.set(f11, f11, getWidth() + yy0Var.h, (yy0Var.h * AndroidUtilities.dp(this.f34732c ? -1.0f : 1.0f)) + getHeight());
            yy0Var.f35063b.addRoundRect(rectF, yy0Var.f35064c, Path.Direction.CW);
            canvas2.drawPath(yy0Var.f35063b, yy0Var.d);
            canvas2.drawPath(yy0Var.f35063b, yy0Var.f35065e);
        } else {
            float f12 = yy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + yy0Var.h, getHeight() + yy0Var.h, yy0Var.d);
            float f13 = yy0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + yy0Var.h, getHeight() + yy0Var.h, yy0Var.f35065e);
        }
        super.onDraw(canvas2);
    }
}
