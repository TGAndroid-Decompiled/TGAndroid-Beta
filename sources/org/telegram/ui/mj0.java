package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class mj0 extends org.telegram.ui.Components.ro {
    public final qj0 f38278v0;

    public mj0(qj0 qj0Var, Context context) {
        super(context, null, false, null);
        this.f38278v0 = qj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        qj0 qj0Var = this.f38278v0;
        qj0Var.W.setImageCoords(qj0Var.f39472b0.getAvatarImageView().getX(), qj0Var.f39472b0.getAvatarImageView().getY(), qj0Var.f39472b0.getAvatarImageView().getWidth(), qj0Var.f39472b0.getAvatarImageView().getHeight());
        if (qj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, qj0Var.W.getCenterX(), qj0Var.W.getCenterY());
            qj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (qj0Var.X) {
            int centerX = (int) (qj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (qj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.g6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.g6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38278v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38278v0.W.onDetachedFromWindow();
    }
}
