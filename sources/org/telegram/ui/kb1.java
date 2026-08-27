package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

public final class kb1 extends FrameLayout {

    public final int f39687a;

    public final RectF f39688b;

    public final nc1 f39689c;

    public kb1(nc1 nc1Var, Context context, int i10) {
        super(context);
        this.f39687a = i10;
        switch (i10) {
            case 1:
                this.f39689c = nc1Var;
                super(context);
                this.f39688b = new RectF();
                break;
            default:
                this.f39689c = nc1Var;
                this.f39688b = new RectF();
                break;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39687a) {
            case 0:
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                RectF rectF = this.f39688b;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                nc1 nc1Var = this.f39689c;
                kb1 kb1Var = nc1Var.f40799z0;
                cc1 cc1Var = nc1Var.f40784t0;
                mb1 mb1Var = nc1Var.f40735a;
                org.telegram.ui.ActionBar.g6.s(kb1Var, cc1Var, mb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var.N("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var.N("paintChatActionBackgroundDarken"));
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.f39688b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                nc1 nc1Var2 = this.f39689c;
                kb1 kb1Var2 = nc1Var2.A0;
                cc1 cc1Var2 = nc1Var2.f40784t0;
                mb1 mb1Var2 = nc1Var2.f40735a;
                org.telegram.ui.ActionBar.g6.s(kb1Var2, cc1Var2, mb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var2.N("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var2.N("paintChatActionBackgroundDarken"));
                }
                break;
        }
    }
}
