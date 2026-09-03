package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class hc1 extends FrameLayout {
    public final int f34641a;
    public final RectF f34642b;
    public final jd1 f34643c;

    public hc1(jd1 jd1Var, Context context, int i10) {
        super(context);
        this.f34641a = i10;
        switch (i10) {
            case 1:
                this.f34643c = jd1Var;
                super(context);
                this.f34642b = new RectF();
                return;
            default:
                this.f34643c = jd1Var;
                this.f34642b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f34641a) {
            case 0:
                RectF rectF = this.f34642b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                jd1 jd1Var = this.f34643c;
                hc1 hc1Var = jd1Var.A0;
                yc1 yc1Var = jd1Var.f35230u0;
                jc1 jc1Var = jd1Var.f35179a;
                org.telegram.ui.ActionBar.j6.s(hc1Var, yc1Var, jc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, jc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, jc1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f34642b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                jd1 jd1Var2 = this.f34643c;
                hc1 hc1Var2 = jd1Var2.B0;
                yc1 yc1Var2 = jd1Var2.f35230u0;
                jc1 jc1Var2 = jd1Var2.f35179a;
                org.telegram.ui.ActionBar.j6.s(hc1Var2, yc1Var2, jc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, jc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, jc1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
