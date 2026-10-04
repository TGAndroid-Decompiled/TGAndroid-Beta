package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class dj0 extends org.telegram.ui.Components.ho {
    public final hj0 f35792v0;

    public dj0(hj0 hj0Var, Context context) {
        super(context, null, false, null);
        this.f35792v0 = hj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hj0 hj0Var = this.f35792v0;
        hj0Var.W.setImageCoords(hj0Var.f37096b0.getAvatarImageView().getX(), hj0Var.f37096b0.getAvatarImageView().getY(), hj0Var.f37096b0.getAvatarImageView().getWidth(), hj0Var.f37096b0.getAvatarImageView().getHeight());
        if (hj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, hj0Var.W.getCenterX(), hj0Var.W.getCenterY());
            hj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (hj0Var.X) {
            int centerX = (int) (hj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (hj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.i6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.i6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35792v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35792v0.W.onDetachedFromWindow();
    }
}
