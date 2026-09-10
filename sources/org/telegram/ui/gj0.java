package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class gj0 extends org.telegram.ui.Components.jo {
    public final kj0 f33125v0;

    public gj0(kj0 kj0Var, Context context) {
        super(context, null, false, null);
        this.f33125v0 = kj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        kj0 kj0Var = this.f33125v0;
        kj0Var.W.setImageCoords(kj0Var.f34387b0.getAvatarImageView().getX(), kj0Var.f34387b0.getAvatarImageView().getY(), kj0Var.f34387b0.getAvatarImageView().getWidth(), kj0Var.f34387b0.getAvatarImageView().getHeight());
        if (kj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, kj0Var.W.getCenterX(), kj0Var.W.getCenterY());
            kj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (kj0Var.X) {
            int centerX = (int) (kj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (kj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.j6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.j6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33125v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33125v0.W.onDetachedFromWindow();
    }
}
