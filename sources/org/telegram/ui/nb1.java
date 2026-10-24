package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class nb1 extends FrameLayout {
    public final int f39795a;
    public final RectF f39796b;
    public final pc1 f39797c;

    public nb1(pc1 pc1Var, Context context, int i10) {
        super(context);
        this.f39795a = i10;
        switch (i10) {
            case 1:
                this.f39797c = pc1Var;
                super(context);
                this.f39796b = new RectF();
                return;
            default:
                this.f39797c = pc1Var;
                this.f39796b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39795a) {
            case 0:
                RectF rectF = this.f39796b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                pc1 pc1Var = this.f39797c;
                nb1 nb1Var = pc1Var.E0;
                ec1 ec1Var = pc1Var.f40508y0;
                pb1 pb1Var = pc1Var.f40442a;
                org.telegram.ui.ActionBar.k6.s(nb1Var, ec1Var, pb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.c1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f39796b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                pc1 pc1Var2 = this.f39797c;
                nb1 nb1Var2 = pc1Var2.F0;
                ec1 ec1Var2 = pc1Var2.f40508y0;
                pb1 pb1Var2 = pc1Var2.f40442a;
                org.telegram.ui.ActionBar.k6.s(nb1Var2, ec1Var2, pb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.c1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
