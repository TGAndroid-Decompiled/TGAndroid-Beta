package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class ig0 extends org.telegram.ui.Components.co {
    public final og0 B0;

    public ig0(og0 og0Var, Context context) {
        super(context, null, false, null);
        this.B0 = og0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        og0 og0Var = this.B0;
        og0Var.X.y0(og0Var.f50583c0.getAvatarImageView().getX(), og0Var.f50583c0.getAvatarImageView().getY(), og0Var.f50583c0.getAvatarImageView().getWidth(), og0Var.f50583c0.getAvatarImageView().getHeight());
        if (og0Var.Z) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, og0Var.X.r(), og0Var.X.s());
            og0Var.X.h(canvas, null);
            canvas.restore();
        }
        if (og0Var.Y) {
            int r10 = (int) (og0Var.X.r() - (org.telegram.ui.ActionBar.m6.U0.getIntrinsicWidth() / 2));
            int s5 = (int) (og0Var.X.s() - (org.telegram.ui.ActionBar.m6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.m6.U0;
            drawable.setBounds(r10, s5, drawable.getIntrinsicWidth() + r10, org.telegram.ui.ActionBar.m6.U0.getIntrinsicHeight() + s5);
            org.telegram.ui.ActionBar.m6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0.X.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0.X.R();
    }
}
