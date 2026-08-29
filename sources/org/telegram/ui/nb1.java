package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class nb1 extends FrameLayout {
    public final int f40772a;
    public final RectF f40773b;
    public final qc1 f40774c;

    public nb1(qc1 qc1Var, Context context, int i10) {
        super(context);
        this.f40772a = i10;
        switch (i10) {
            case 1:
                this.f40774c = qc1Var;
                super(context);
                this.f40773b = new RectF();
                return;
            default:
                this.f40774c = qc1Var;
                this.f40773b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f40772a) {
            case 0:
                RectF rectF = this.f40773b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                qc1 qc1Var = this.f40774c;
                nb1 nb1Var = qc1Var.f41687z0;
                fc1 fc1Var = qc1Var.f41672t0;
                pb1 pb1Var = qc1Var.f41623a;
                org.telegram.ui.ActionBar.g6.s(nb1Var, fc1Var, pb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f40773b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                qc1 qc1Var2 = this.f40774c;
                nb1 nb1Var2 = qc1Var2.A0;
                fc1 fc1Var2 = qc1Var2.f41672t0;
                pb1 pb1Var2 = qc1Var2.f41623a;
                org.telegram.ui.ActionBar.g6.s(nb1Var2, fc1Var2, pb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
