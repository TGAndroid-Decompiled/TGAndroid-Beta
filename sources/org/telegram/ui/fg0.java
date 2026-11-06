package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class fg0 extends org.telegram.ui.Components.kn {
    public final jg0 A0;

    public fg0(jg0 jg0Var, Context context) {
        super(context, null, false, null);
        this.A0 = jg0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        jg0 jg0Var = this.A0;
        jg0Var.W.y0(jg0Var.f46964b0.getAvatarImageView().getX(), jg0Var.f46964b0.getAvatarImageView().getY(), jg0Var.f46964b0.getAvatarImageView().getWidth(), jg0Var.f46964b0.getAvatarImageView().getHeight());
        if (jg0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, jg0Var.W.r(), jg0Var.W.s());
            jg0Var.W.h(canvas, null);
            canvas.restore();
        }
        if (jg0Var.X) {
            int r10 = (int) (jg0Var.W.r() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicWidth() / 2));
            int s5 = (int) (jg0Var.W.s() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.k6.U0;
            drawable.setBounds(r10, s5, drawable.getIntrinsicWidth() + r10, org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() + s5);
            org.telegram.ui.ActionBar.k6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0.W.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.W.R();
    }
}
