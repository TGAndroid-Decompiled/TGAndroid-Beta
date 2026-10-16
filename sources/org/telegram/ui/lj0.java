package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class lj0 extends org.telegram.ui.Components.ro {
    public final pj0 f37772v0;

    public lj0(pj0 pj0Var, Context context) {
        super(context, null, false, null);
        this.f37772v0 = pj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        pj0 pj0Var = this.f37772v0;
        pj0Var.W.setImageCoords(pj0Var.f38949b0.getAvatarImageView().getX(), pj0Var.f38949b0.getAvatarImageView().getY(), pj0Var.f38949b0.getAvatarImageView().getWidth(), pj0Var.f38949b0.getAvatarImageView().getHeight());
        if (pj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, pj0Var.W.getCenterX(), pj0Var.W.getCenterY());
            pj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (pj0Var.X) {
            int centerX = (int) (pj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (pj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.g6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.g6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37772v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37772v0.W.onDetachedFromWindow();
    }
}
