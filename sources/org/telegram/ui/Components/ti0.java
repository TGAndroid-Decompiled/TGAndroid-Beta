package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ti0 {
    public final z5 f31343a;
    public final j6 f31344b;
    public final int f31345c;
    public boolean d;
    public final yi0 f31346e;
    public final rc f31347f;
    public final Paint f31348g = new Paint(1);
    public boolean h;

    public ti0(View view) {
        this.f31343a = new z5(view, 350L, pr.h);
        this.f31346e = new yi0(view);
        this.f31347f = new rc(view);
        j6 j6Var = new j6(false, false, false, false);
        this.f31344b = j6Var;
        j6Var.t(AndroidUtilities.dp(11.0f));
        j6Var.o(true, true, false);
        j6Var.setCallback(view);
        j6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        j6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = j6Var.f28028a;
        this.f31345c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, int i10, boolean z4, boolean z10) {
        int i11;
        boolean z11 = this.d;
        j6 j6Var = this.f31344b;
        if (z4 != z11) {
            this.d = z4;
            if (z4) {
                i11 = R.string.QuoteExpand;
            } else {
                i11 = R.string.QuoteCollapse;
            }
            j6Var.q(LocaleController.getString(i11), true, true);
        }
        float d = j6Var.d();
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f10 - ((int) (d + AndroidUtilities.dp(23.66f))), f11 - dp, f10, f11);
        float a2 = this.f31347f.a(0.02f) * this.f31343a.e(z10);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.f31348g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f10, f11);
            float f12 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            j6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            j6Var.r(i10);
            j6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f13 = dp2 / 2.0f;
            yi0 yi0Var = this.f31346e;
            yi0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f13) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f13 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = yi0Var.f33525b;
            paint2.setColor(i10);
            paint2.setAlpha(yi0Var.d);
            boolean z12 = !z4;
            if (yi0Var.f33527e != z12) {
                yi0Var.f33527e = z12;
                yi0Var.f33524a.invalidate();
            }
            yi0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z4) {
        this.h = z4;
        this.f31347f.c(z4);
    }
}
