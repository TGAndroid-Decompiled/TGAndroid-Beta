package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class pc1 extends FrameLayout {
    public final int f39448a;
    public final RectF f39449b;
    public final rd1 f39450c;

    public pc1(rd1 rd1Var, Context context, int i10) {
        super(context);
        this.f39448a = i10;
        switch (i10) {
            case 1:
                this.f39450c = rd1Var;
                super(context);
                this.f39449b = new RectF();
                return;
            default:
                this.f39450c = rd1Var;
                this.f39449b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39448a) {
            case 0:
                RectF rectF = this.f39449b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rd1 rd1Var = this.f39450c;
                pc1 pc1Var = rd1Var.D0;
                gd1 gd1Var = rd1Var.f40094x0;
                rc1 rc1Var = rd1Var.f40031a;
                org.telegram.ui.ActionBar.i6.s(pc1Var, gd1Var, rc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rc1Var.H("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rc1Var.H("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f39449b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rd1 rd1Var2 = this.f39450c;
                pc1 pc1Var2 = rd1Var2.E0;
                gd1 gd1Var2 = rd1Var2.f40094x0;
                rc1 rc1Var2 = rd1Var2.f40031a;
                org.telegram.ui.ActionBar.i6.s(pc1Var2, gd1Var2, rc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rc1Var2.H("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rc1Var2.H("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
