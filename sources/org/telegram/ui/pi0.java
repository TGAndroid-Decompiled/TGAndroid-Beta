package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class pi0 extends org.telegram.ui.Components.tn {
    public final ti0 f41543r0;

    public pi0(ti0 ti0Var, Context context) {
        super(context, null, false, null);
        this.f41543r0 = ti0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ti0 ti0Var = this.f41543r0;
        ti0Var.S.setImageCoords(ti0Var.X.getAvatarImageView().getX(), ti0Var.X.getAvatarImageView().getY(), ti0Var.X.getAvatarImageView().getWidth(), ti0Var.X.getAvatarImageView().getHeight());
        if (ti0Var.U) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, ti0Var.S.getCenterX(), ti0Var.S.getCenterY());
            ti0Var.S.draw(canvas);
            canvas.restore();
        }
        if (ti0Var.T) {
            int centerX = (int) (ti0Var.S.getCenterX() - (org.telegram.ui.ActionBar.f6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (ti0Var.S.getCenterY() - (org.telegram.ui.ActionBar.f6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.f6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.f6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.f6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41543r0.S.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41543r0.S.onDetachedFromWindow();
    }
}
