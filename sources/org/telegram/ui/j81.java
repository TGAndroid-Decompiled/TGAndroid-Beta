package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class j81 extends FrameLayout {
    public final int f38306a;
    public final RectF f38307b;
    public final k91 f38308c;

    public j81(k91 k91Var, Context context, int i10) {
        super(context);
        this.f38306a = i10;
        switch (i10) {
            case 1:
                this.f38308c = k91Var;
                super(context);
                this.f38307b = new RectF();
                return;
            default:
                this.f38308c = k91Var;
                this.f38307b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38306a) {
            case 0:
                RectF rectF = this.f38307b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                k91 k91Var = this.f38308c;
                j81 j81Var = k91Var.E0;
                a91 a91Var = k91Var.f38778y0;
                l81 l81Var = k91Var.f38712a;
                org.telegram.ui.ActionBar.t6.t(j81Var, a91Var, l81Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l81Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.t6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l81Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f38307b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                k91 k91Var2 = this.f38308c;
                j81 j81Var2 = k91Var2.F0;
                a91 a91Var2 = k91Var2.f38778y0;
                l81 l81Var2 = k91Var2.f38712a;
                org.telegram.ui.ActionBar.t6.t(j81Var2, a91Var2, l81Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l81Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.t6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l81Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
