package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class mb1 extends FrameLayout {
    public final int f40378a;
    public final RectF f40379b;
    public final oc1 f40380c;

    public mb1(oc1 oc1Var, Context context, int i9) {
        super(context);
        this.f40378a = i9;
        switch (i9) {
            case 1:
                this.f40380c = oc1Var;
                super(context);
                this.f40379b = new RectF();
                return;
            default:
                this.f40380c = oc1Var;
                this.f40379b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f40378a) {
            case 0:
                RectF rectF = this.f40379b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                oc1 oc1Var = this.f40380c;
                mb1 mb1Var = oc1Var.f41120z0;
                dc1 dc1Var = oc1Var.f41105t0;
                ob1 ob1Var = oc1Var.f41056a;
                org.telegram.ui.ActionBar.f6.s(mb1Var, dc1Var, ob1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ob1Var.O("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.f6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ob1Var.O("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f40379b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                oc1 oc1Var2 = this.f40380c;
                mb1 mb1Var2 = oc1Var2.A0;
                dc1 dc1Var2 = oc1Var2.f41105t0;
                ob1 ob1Var2 = oc1Var2.f41056a;
                org.telegram.ui.ActionBar.f6.s(mb1Var2, dc1Var2, ob1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ob1Var2.O("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.f6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ob1Var2.O("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
