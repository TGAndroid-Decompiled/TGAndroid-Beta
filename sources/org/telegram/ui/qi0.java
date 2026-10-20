package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class qi0 extends org.telegram.ui.Components.oo {
    public final ui0 f40587v0;

    public qi0(ui0 ui0Var, Context context) {
        super(context, null, false, null);
        this.f40587v0 = ui0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ui0 ui0Var = this.f40587v0;
        ui0Var.W.setImageCoords(ui0Var.f41988b0.getAvatarImageView().getX(), ui0Var.f41988b0.getAvatarImageView().getY(), ui0Var.f41988b0.getAvatarImageView().getWidth(), ui0Var.f41988b0.getAvatarImageView().getHeight());
        if (ui0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, ui0Var.W.getCenterX(), ui0Var.W.getCenterY());
            ui0Var.W.draw(canvas);
            canvas.restore();
        }
        if (ui0Var.X) {
            int centerX = (int) (ui0Var.W.getCenterX() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (ui0Var.W.getCenterY() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.h6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.h6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40587v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40587v0.W.onDetachedFromWindow();
    }
}
