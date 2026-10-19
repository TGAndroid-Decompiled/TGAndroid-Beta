package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class pi0 extends org.telegram.ui.Components.oo {
    public final ti0 f40243v0;

    public pi0(ti0 ti0Var, Context context) {
        super(context, null, false, null);
        this.f40243v0 = ti0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ti0 ti0Var = this.f40243v0;
        ti0Var.W.setImageCoords(ti0Var.f41687b0.getAvatarImageView().getX(), ti0Var.f41687b0.getAvatarImageView().getY(), ti0Var.f41687b0.getAvatarImageView().getWidth(), ti0Var.f41687b0.getAvatarImageView().getHeight());
        if (ti0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, ti0Var.W.getCenterX(), ti0Var.W.getCenterY());
            ti0Var.W.draw(canvas);
            canvas.restore();
        }
        if (ti0Var.X) {
            int centerX = (int) (ti0Var.W.getCenterX() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (ti0Var.W.getCenterY() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.h6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.h6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40243v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40243v0.W.onDetachedFromWindow();
    }
}
