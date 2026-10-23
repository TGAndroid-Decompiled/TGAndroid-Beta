package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hj0 {
    public final f6 f26906a;
    public final p6 f26907b;
    public final int f26908c;
    public boolean d;
    public final nj0 e;
    public final yc f26909f;
    public final Paint f26910g = new Paint(1);
    public boolean h;

    public hj0(View view) {
        this.f26906a = new f6(view, 350L, bs.h);
        this.e = new nj0(view);
        this.f26909f = new yc(view);
        p6 p6Var = new p6(false, false, false);
        this.f26907b = p6Var;
        p6Var.w(AndroidUtilities.dp(11.0f));
        p6Var.r(true, true);
        p6Var.setCallback(view);
        p6Var.M = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        p6Var.t(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = p6Var.f29228a;
        this.f26908c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12 = this.d;
        p6 p6Var = this.f26907b;
        if (z10 != z12) {
            this.d = z10;
            if (z10) {
                i11 = R.string.QuoteExpand;
            } else {
                i11 = R.string.QuoteCollapse;
            }
            p6Var.t(LocaleController.getString(i11), true, true);
        }
        float c10 = p6Var.c();
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f7 - ((int) (c10 + AndroidUtilities.dp(23.66f))), f10 - dp, f7, f10);
        float a2 = this.f26909f.a(0.02f) * this.f26906a.e(z11);
        if (a2 > 0.0f) {
            int o10 = i0.a.o(i10, 30);
            Paint paint = this.f26910g;
            paint.setColor(o10);
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            p6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            p6Var.u(i10);
            p6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f12 = dp2 / 2.0f;
            nj0 nj0Var = this.e;
            nj0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = nj0Var.f28816b;
            paint2.setColor(i10);
            paint2.setAlpha(nj0Var.d);
            boolean z13 = !z10;
            if (nj0Var.e != z13) {
                nj0Var.e = z13;
                nj0Var.f28815a.invalidate();
            }
            nj0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f26909f.c(z10);
    }
}
