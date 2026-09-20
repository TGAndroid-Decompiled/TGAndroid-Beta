package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class ij0 extends org.telegram.ui.Components.eo {
    public final mj0 f34595v0;

    public ij0(mj0 mj0Var, Context context) {
        super(context, null, false, null);
        this.f34595v0 = mj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mj0 mj0Var = this.f34595v0;
        mj0Var.W.setImageCoords(mj0Var.f35750b0.getAvatarImageView().getX(), mj0Var.f35750b0.getAvatarImageView().getY(), mj0Var.f35750b0.getAvatarImageView().getWidth(), mj0Var.f35750b0.getAvatarImageView().getHeight());
        if (mj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, mj0Var.W.getCenterX(), mj0Var.W.getCenterY());
            mj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (mj0Var.X) {
            int centerX = (int) (mj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (mj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.j6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.j6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34595v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34595v0.W.onDetachedFromWindow();
    }
}
