package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class ad1 extends FrameLayout {
    public final int f34186a;
    public final RectF f34187b;
    public final ce1 f34188c;

    public ad1(ce1 ce1Var, Context context, int i10) {
        super(context);
        this.f34186a = i10;
        switch (i10) {
            case 1:
                this.f34188c = ce1Var;
                super(context);
                this.f34187b = new RectF();
                return;
            default:
                this.f34188c = ce1Var;
                this.f34187b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f34186a) {
            case 0:
                RectF rectF = this.f34187b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ce1 ce1Var = this.f34188c;
                ad1 ad1Var = ce1Var.D0;
                rd1 rd1Var = ce1Var.f34915x0;
                cd1 cd1Var = ce1Var.f34853a;
                org.telegram.ui.ActionBar.g6.s(ad1Var, rd1Var, cd1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f34187b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ce1 ce1Var2 = this.f34188c;
                ad1 ad1Var2 = ce1Var2.E0;
                rd1 rd1Var2 = ce1Var2.f34915x0;
                cd1 cd1Var2 = ce1Var2.f34853a;
                org.telegram.ui.ActionBar.g6.s(ad1Var2, rd1Var2, cd1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.b1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
