package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class oi0 extends org.telegram.ui.Components.xn {
    public final si0 f41183r0;

    public oi0(si0 si0Var, Context context) {
        super(context, null, false, null);
        this.f41183r0 = si0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        si0 si0Var = this.f41183r0;
        si0Var.S.setImageCoords(si0Var.X.getAvatarImageView().getX(), si0Var.X.getAvatarImageView().getY(), si0Var.X.getAvatarImageView().getWidth(), si0Var.X.getAvatarImageView().getHeight());
        if (si0Var.U) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, si0Var.S.getCenterX(), si0Var.S.getCenterY());
            si0Var.S.draw(canvas);
            canvas.restore();
        }
        if (si0Var.T) {
            int centerX = (int) (si0Var.S.getCenterX() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (si0Var.S.getCenterY() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.g6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.g6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41183r0.S.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41183r0.S.onDetachedFromWindow();
    }
}
