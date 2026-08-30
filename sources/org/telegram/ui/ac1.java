package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class ac1 extends FrameLayout {
    public final int f32517a;
    public final RectF f32518b;
    public final cd1 f32519c;

    public ac1(cd1 cd1Var, Context context, int i10) {
        super(context);
        this.f32517a = i10;
        switch (i10) {
            case 1:
                this.f32519c = cd1Var;
                super(context);
                this.f32518b = new RectF();
                return;
            default:
                this.f32519c = cd1Var;
                this.f32518b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f32517a) {
            case 0:
                RectF rectF = this.f32518b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                cd1 cd1Var = this.f32519c;
                ac1 ac1Var = cd1Var.A0;
                rc1 rc1Var = cd1Var.f33338u0;
                cc1 cc1Var = cd1Var.f33287a;
                org.telegram.ui.ActionBar.j6.s(ac1Var, rc1Var, cc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cc1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f32518b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                cd1 cd1Var2 = this.f32519c;
                ac1 ac1Var2 = cd1Var2.B0;
                rc1 rc1Var2 = cd1Var2.f33338u0;
                cc1 cc1Var2 = cd1Var2.f33287a;
                org.telegram.ui.ActionBar.j6.s(ac1Var2, rc1Var2, cc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cc1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
