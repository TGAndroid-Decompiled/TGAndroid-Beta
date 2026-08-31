package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class bc1 extends FrameLayout {
    public final int f35417a;
    public final RectF f35418b;
    public final ed1 f35419c;

    public bc1(ed1 ed1Var, Context context, int i10) {
        super(context);
        this.f35417a = i10;
        switch (i10) {
            case 1:
                this.f35419c = ed1Var;
                super(context);
                this.f35418b = new RectF();
                return;
            default:
                this.f35419c = ed1Var;
                this.f35418b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f35417a) {
            case 0:
                RectF rectF = this.f35418b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ed1 ed1Var = this.f35419c;
                bc1 bc1Var = ed1Var.A0;
                tc1 tc1Var = ed1Var.f36538u0;
                dc1 dc1Var = ed1Var.f36486a;
                org.telegram.ui.ActionBar.k6.s(bc1Var, tc1Var, dc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, dc1Var.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, dc1Var.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f35418b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ed1 ed1Var2 = this.f35419c;
                bc1 bc1Var2 = ed1Var2.B0;
                tc1 tc1Var2 = ed1Var2.f36538u0;
                dc1 dc1Var2 = ed1Var2.f36486a;
                org.telegram.ui.ActionBar.k6.s(bc1Var2, tc1Var2, dc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, dc1Var2.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, dc1Var2.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
