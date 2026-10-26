package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class qb1 extends FrameLayout {
    public final int f42803a;
    public final RectF f42804b;
    public final tc1 f42805c;

    public qb1(tc1 tc1Var, Context context, int i10) {
        super(context);
        this.f42803a = i10;
        switch (i10) {
            case 1:
                this.f42805c = tc1Var;
                super(context);
                this.f42804b = new RectF();
                return;
            default:
                this.f42805c = tc1Var;
                this.f42804b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f42803a) {
            case 0:
                RectF rectF = this.f42804b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                tc1 tc1Var = this.f42805c;
                qb1 qb1Var = tc1Var.E0;
                ic1 ic1Var = tc1Var.f43802y0;
                sb1 sb1Var = tc1Var.f43736a;
                org.telegram.ui.ActionBar.y6.s(qb1Var, ic1Var, sb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, sb1Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.y6.c1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, sb1Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f42804b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                tc1 tc1Var2 = this.f42805c;
                qb1 qb1Var2 = tc1Var2.F0;
                ic1 ic1Var2 = tc1Var2.f43802y0;
                sb1 sb1Var2 = tc1Var2.f43736a;
                org.telegram.ui.ActionBar.y6.s(qb1Var2, ic1Var2, sb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, sb1Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.y6.c1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, sb1Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
