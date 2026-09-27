package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class nc1 extends FrameLayout {
    public final int f35931a;
    public final RectF f35932b;
    public final pd1 f35933c;

    public nc1(pd1 pd1Var, Context context, int i10) {
        super(context);
        this.f35931a = i10;
        switch (i10) {
            case 1:
                this.f35933c = pd1Var;
                super(context);
                this.f35932b = new RectF();
                return;
            default:
                this.f35933c = pd1Var;
                this.f35932b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f35931a) {
            case 0:
                RectF rectF = this.f35932b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                pd1 pd1Var = this.f35933c;
                nc1 nc1Var = pd1Var.D0;
                ed1 ed1Var = pd1Var.f36452x0;
                pc1 pc1Var = pd1Var.f36390a;
                org.telegram.ui.ActionBar.i6.s(nc1Var, ed1Var, pc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f35932b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                pd1 pd1Var2 = this.f35933c;
                nc1 nc1Var2 = pd1Var2.E0;
                ed1 ed1Var2 = pd1Var2.f36452x0;
                pc1 pc1Var2 = pd1Var2.f36390a;
                org.telegram.ui.ActionBar.i6.s(nc1Var2, ed1Var2, pc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
