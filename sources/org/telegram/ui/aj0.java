package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class aj0 extends org.telegram.ui.Components.fo {
    public final ej0 f31810v0;

    public aj0(ej0 ej0Var, Context context) {
        super(context, null, false, null);
        this.f31810v0 = ej0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ej0 ej0Var = this.f31810v0;
        ej0Var.W.setImageCoords(ej0Var.f32947b0.getAvatarImageView().getX(), ej0Var.f32947b0.getAvatarImageView().getY(), ej0Var.f32947b0.getAvatarImageView().getWidth(), ej0Var.f32947b0.getAvatarImageView().getHeight());
        if (ej0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, ej0Var.W.getCenterX(), ej0Var.W.getCenterY());
            ej0Var.W.draw(canvas);
            canvas.restore();
        }
        if (ej0Var.X) {
            int centerX = (int) (ej0Var.W.getCenterX() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (ej0Var.W.getCenterY() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.h6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.h6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31810v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31810v0.W.onDetachedFromWindow();
    }
}
