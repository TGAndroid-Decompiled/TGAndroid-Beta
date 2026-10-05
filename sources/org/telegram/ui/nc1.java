package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class nc1 extends FrameLayout {
    public final int f38896a;
    public final RectF f38897b;
    public final pd1 f38898c;

    public nc1(pd1 pd1Var, Context context, int i10) {
        super(context);
        this.f38896a = i10;
        switch (i10) {
            case 1:
                this.f38898c = pd1Var;
                super(context);
                this.f38897b = new RectF();
                return;
            default:
                this.f38898c = pd1Var;
                this.f38897b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38896a) {
            case 0:
                RectF rectF = this.f38897b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                pd1 pd1Var = this.f38898c;
                nc1 nc1Var = pd1Var.D0;
                ed1 ed1Var = pd1Var.f39550x0;
                pc1 pc1Var = pd1Var.f39487a;
                org.telegram.ui.ActionBar.i6.s(nc1Var, ed1Var, pc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var.H("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var.H("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f38897b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                pd1 pd1Var2 = this.f38898c;
                nc1 nc1Var2 = pd1Var2.E0;
                ed1 ed1Var2 = pd1Var2.f39550x0;
                pc1 pc1Var2 = pd1Var2.f39487a;
                org.telegram.ui.ActionBar.i6.s(nc1Var2, ed1Var2, pc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var2.H("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var2.H("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
