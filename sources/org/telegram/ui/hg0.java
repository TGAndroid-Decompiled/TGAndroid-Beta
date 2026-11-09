package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class hg0 extends org.telegram.ui.Components.kn {
    public final lg0 A0;

    public hg0(lg0 lg0Var, Context context) {
        super(context, null, false, null);
        this.A0 = lg0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        lg0 lg0Var = this.A0;
        lg0Var.W.y0(lg0Var.f47604b0.getAvatarImageView().getX(), lg0Var.f47604b0.getAvatarImageView().getY(), lg0Var.f47604b0.getAvatarImageView().getWidth(), lg0Var.f47604b0.getAvatarImageView().getHeight());
        if (lg0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, lg0Var.W.r(), lg0Var.W.s());
            lg0Var.W.h(canvas, null);
            canvas.restore();
        }
        if (lg0Var.X) {
            int r10 = (int) (lg0Var.W.r() - (org.telegram.ui.ActionBar.l6.U0.getIntrinsicWidth() / 2));
            int s5 = (int) (lg0Var.W.s() - (org.telegram.ui.ActionBar.l6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.l6.U0;
            drawable.setBounds(r10, s5, drawable.getIntrinsicWidth() + r10, org.telegram.ui.ActionBar.l6.U0.getIntrinsicHeight() + s5);
            org.telegram.ui.ActionBar.l6.U0.draw(canvas);
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
