package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class fj0 extends org.telegram.ui.Components.eo {
    public final jj0 f33615v0;

    public fj0(jj0 jj0Var, Context context) {
        super(context, null, false, null);
        this.f33615v0 = jj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        jj0 jj0Var = this.f33615v0;
        jj0Var.W.setImageCoords(jj0Var.f34925b0.getAvatarImageView().getX(), jj0Var.f34925b0.getAvatarImageView().getY(), jj0Var.f34925b0.getAvatarImageView().getWidth(), jj0Var.f34925b0.getAvatarImageView().getHeight());
        if (jj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, jj0Var.W.getCenterX(), jj0Var.W.getCenterY());
            jj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (jj0Var.X) {
            int centerX = (int) (jj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (jj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.i6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.i6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33615v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33615v0.W.onDetachedFromWindow();
    }
}
