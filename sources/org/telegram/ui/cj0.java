package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class cj0 extends org.telegram.ui.Components.go {
    public final gj0 f32737v0;

    public cj0(gj0 gj0Var, Context context) {
        super(context, null, false, null);
        this.f32737v0 = gj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        gj0 gj0Var = this.f32737v0;
        gj0Var.W.setImageCoords(gj0Var.f33957b0.getAvatarImageView().getX(), gj0Var.f33957b0.getAvatarImageView().getY(), gj0Var.f33957b0.getAvatarImageView().getWidth(), gj0Var.f33957b0.getAvatarImageView().getHeight());
        if (gj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, gj0Var.W.getCenterX(), gj0Var.W.getCenterY());
            gj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (gj0Var.X) {
            int centerX = (int) (gj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (gj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.i6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.i6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32737v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32737v0.W.onDetachedFromWindow();
    }
}
