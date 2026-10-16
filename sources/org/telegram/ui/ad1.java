package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class ad1 extends FrameLayout {
    public final int f33881a;
    public final RectF f33882b;
    public final ce1 f33883c;

    public ad1(ce1 ce1Var, Context context, int i10) {
        super(context);
        this.f33881a = i10;
        switch (i10) {
            case 1:
                this.f33883c = ce1Var;
                super(context);
                this.f33882b = new RectF();
                return;
            default:
                this.f33883c = ce1Var;
                this.f33882b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f33881a) {
            case 0:
                RectF rectF = this.f33882b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ce1 ce1Var = this.f33883c;
                ad1 ad1Var = ce1Var.D0;
                rd1 rd1Var = ce1Var.f34639x0;
                cd1 cd1Var = ce1Var.f34577a;
                org.telegram.ui.ActionBar.g6.s(ad1Var, rd1Var, cd1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f33882b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ce1 ce1Var2 = this.f33883c;
                ad1 ad1Var2 = ce1Var2.E0;
                rd1 rd1Var2 = ce1Var2.f34639x0;
                cd1 cd1Var2 = ce1Var2.f34577a;
                org.telegram.ui.ActionBar.g6.s(ad1Var2, rd1Var2, cd1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var2.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.b1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var2.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
