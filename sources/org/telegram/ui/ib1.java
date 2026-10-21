package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class ib1 extends FrameLayout {
    public final int f37919a;
    public final RectF f37920b;
    public final kc1 f37921c;

    public ib1(kc1 kc1Var, Context context, int i10) {
        super(context);
        this.f37919a = i10;
        switch (i10) {
            case 1:
                this.f37921c = kc1Var;
                super(context);
                this.f37920b = new RectF();
                return;
            default:
                this.f37921c = kc1Var;
                this.f37920b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f37919a) {
            case 0:
                RectF rectF = this.f37920b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                kc1 kc1Var = this.f37921c;
                ib1 ib1Var = kc1Var.D0;
                zb1 zb1Var = kc1Var.f38579x0;
                kb1 kb1Var = kc1Var.f38517a;
                org.telegram.ui.ActionBar.h6.s(ib1Var, zb1Var, kb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, kb1Var.n("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, kb1Var.n("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f37920b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                kc1 kc1Var2 = this.f37921c;
                ib1 ib1Var2 = kc1Var2.E0;
                zb1 zb1Var2 = kc1Var2.f38579x0;
                kb1 kb1Var2 = kc1Var2.f38517a;
                org.telegram.ui.ActionBar.h6.s(ib1Var2, zb1Var2, kb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, kb1Var2.n("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, kb1Var2.n("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
