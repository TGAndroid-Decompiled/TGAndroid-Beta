package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class l81 extends FrameLayout {
    public final int f39090a;
    public final RectF f39091b;
    public final m91 f39092c;

    public l81(m91 m91Var, Context context, int i10) {
        super(context);
        this.f39090a = i10;
        switch (i10) {
            case 1:
                this.f39092c = m91Var;
                super(context);
                this.f39091b = new RectF();
                return;
            default:
                this.f39092c = m91Var;
                this.f39091b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39090a) {
            case 0:
                RectF rectF = this.f39091b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                m91 m91Var = this.f39092c;
                l81 l81Var = m91Var.E0;
                c91 c91Var = m91Var.f39603y0;
                n81 n81Var = m91Var.f39537a;
                org.telegram.ui.ActionBar.t6.t(l81Var, c91Var, n81Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, n81Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.t6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, n81Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f39091b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                m91 m91Var2 = this.f39092c;
                l81 l81Var2 = m91Var2.F0;
                c91 c91Var2 = m91Var2.f39603y0;
                n81 n81Var2 = m91Var2.f39537a;
                org.telegram.ui.ActionBar.t6.t(l81Var2, c91Var2, n81Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, n81Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.t6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, n81Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
