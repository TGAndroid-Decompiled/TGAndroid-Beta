package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class gc1 extends FrameLayout {
    public final int f37065a;
    public final RectF f37066b;
    public final jd1 f37067c;

    public gc1(jd1 jd1Var, Context context, int i10) {
        super(context);
        this.f37065a = i10;
        switch (i10) {
            case 1:
                this.f37067c = jd1Var;
                super(context);
                this.f37066b = new RectF();
                return;
            default:
                this.f37067c = jd1Var;
                this.f37066b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f37065a) {
            case 0:
                RectF rectF = this.f37066b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                jd1 jd1Var = this.f37067c;
                gc1 gc1Var = jd1Var.A0;
                yc1 yc1Var = jd1Var.f38013u0;
                ic1 ic1Var = jd1Var.f37961a;
                org.telegram.ui.ActionBar.k6.s(gc1Var, yc1Var, ic1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ic1Var.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ic1Var.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f37066b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                jd1 jd1Var2 = this.f37067c;
                gc1 gc1Var2 = jd1Var2.B0;
                yc1 yc1Var2 = jd1Var2.f38013u0;
                ic1 ic1Var2 = jd1Var2.f37961a;
                org.telegram.ui.ActionBar.k6.s(gc1Var2, yc1Var2, ic1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ic1Var2.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ic1Var2.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
