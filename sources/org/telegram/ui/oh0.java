package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class oh0 extends org.telegram.ui.Components.sn {
    public final sh0 A0;

    public oh0(sh0 sh0Var, Context context) {
        super(context, null, false, null);
        this.A0 = sh0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        sh0 sh0Var = this.A0;
        sh0Var.W.y0(sh0Var.f41515b0.getAvatarImageView().getX(), sh0Var.f41515b0.getAvatarImageView().getY(), sh0Var.f41515b0.getAvatarImageView().getWidth(), sh0Var.f41515b0.getAvatarImageView().getHeight());
        if (sh0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, sh0Var.W.r(), sh0Var.W.s());
            sh0Var.W.h(canvas, null);
            canvas.restore();
        }
        if (sh0Var.X) {
            int r10 = (int) (sh0Var.W.r() - (org.telegram.ui.ActionBar.t6.U0.getIntrinsicWidth() / 2));
            int s10 = (int) (sh0Var.W.s() - (org.telegram.ui.ActionBar.t6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.t6.U0;
            drawable.setBounds(r10, s10, drawable.getIntrinsicWidth() + r10, org.telegram.ui.ActionBar.t6.U0.getIntrinsicHeight() + s10);
            org.telegram.ui.ActionBar.t6.U0.draw(canvas);
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
