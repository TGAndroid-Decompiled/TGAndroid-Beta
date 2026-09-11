package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class hj0 extends org.telegram.ui.Components.co {
    public final lj0 f37050v0;

    public hj0(lj0 lj0Var, Context context) {
        super(context, null, false, null);
        this.f37050v0 = lj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        lj0 lj0Var = this.f37050v0;
        lj0Var.W.setImageCoords(lj0Var.f38382b0.getAvatarImageView().getX(), lj0Var.f38382b0.getAvatarImageView().getY(), lj0Var.f38382b0.getAvatarImageView().getWidth(), lj0Var.f38382b0.getAvatarImageView().getHeight());
        if (lj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, lj0Var.W.getCenterX(), lj0Var.W.getCenterY());
            lj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (lj0Var.X) {
            int centerX = (int) (lj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (lj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.j6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.j6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37050v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37050v0.W.onDetachedFromWindow();
    }
}
