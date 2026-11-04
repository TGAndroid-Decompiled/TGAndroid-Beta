package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class j61 extends FrameLayout {
    public final int f46520a;
    public final RectF f46521b;
    public final l71 f46522c;

    public j61(l71 l71Var, Context context, int i3) {
        super(context);
        this.f46520a = i3;
        switch (i3) {
            case 1:
                this.f46522c = l71Var;
                super(context);
                this.f46521b = new RectF();
                return;
            default:
                this.f46522c = l71Var;
                this.f46521b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f46520a) {
            case 0:
                RectF rectF = this.f46521b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                l71 l71Var = this.f46522c;
                j61 j61Var = l71Var.F0;
                b71 b71Var = l71Var.f47210z0;
                l61 l61Var = l71Var.f47141a;
                org.telegram.ui.ActionBar.k6.t(j61Var, b71Var, l61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l61Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f46521b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                l71 l71Var2 = this.f46522c;
                j61 j61Var2 = l71Var2.G0;
                b71 b71Var2 = l71Var2.f47210z0;
                l61 l61Var2 = l71Var2.f47141a;
                org.telegram.ui.ActionBar.k6.t(j61Var2, b71Var2, l61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l61Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
