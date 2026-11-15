package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class q61 extends FrameLayout {
    public final int f50482a;
    public final RectF f50483b;
    public final t71 f50484c;

    public q61(t71 t71Var, Context context, int i7) {
        super(context);
        this.f50482a = i7;
        switch (i7) {
            case 1:
                this.f50484c = t71Var;
                super(context);
                this.f50483b = new RectF();
                return;
            default:
                this.f50484c = t71Var;
                this.f50483b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f50482a) {
            case 0:
                RectF rectF = this.f50483b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                t71 t71Var = this.f50484c;
                q61 q61Var = t71Var.F0;
                j71 j71Var = t71Var.f51477z0;
                s61 s61Var = t71Var.f51408a;
                org.telegram.ui.ActionBar.j6.t(q61Var, j71Var, s61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, s61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, s61Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f50483b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                t71 t71Var2 = this.f50484c;
                q61 q61Var2 = t71Var2.G0;
                j71 j71Var2 = t71Var2.f51477z0;
                s61 s61Var2 = t71Var2.f51408a;
                org.telegram.ui.ActionBar.j6.t(q61Var2, j71Var2, s61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, s61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, s61Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
