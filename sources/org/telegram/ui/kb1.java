package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class kb1 extends FrameLayout {
    public final int f38475a;
    public final RectF f38476b;
    public final mc1 f38477c;

    public kb1(mc1 mc1Var, Context context, int i10) {
        super(context);
        this.f38475a = i10;
        switch (i10) {
            case 1:
                this.f38477c = mc1Var;
                super(context);
                this.f38476b = new RectF();
                return;
            default:
                this.f38477c = mc1Var;
                this.f38476b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38475a) {
            case 0:
                RectF rectF = this.f38476b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                mc1 mc1Var = this.f38477c;
                kb1 kb1Var = mc1Var.D0;
                bc1 bc1Var = mc1Var.f39184x0;
                mb1 mb1Var = mc1Var.f39122a;
                org.telegram.ui.ActionBar.h6.s(kb1Var, bc1Var, mb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var.n("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var.n("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f38476b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                mc1 mc1Var2 = this.f38477c;
                kb1 kb1Var2 = mc1Var2.E0;
                bc1 bc1Var2 = mc1Var2.f39184x0;
                mb1 mb1Var2 = mc1Var2.f39122a;
                org.telegram.ui.ActionBar.h6.s(kb1Var2, bc1Var2, mb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var2.n("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var2.n("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
