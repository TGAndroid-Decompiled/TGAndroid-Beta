package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class hg0 extends org.telegram.ui.Components.zn {
    public final mg0 B0;

    public hg0(mg0 mg0Var, Context context) {
        super(context, null, false, null);
        this.B0 = mg0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mg0 mg0Var = this.B0;
        mg0Var.X.z0(mg0Var.f50059c0.getAvatarImageView().getX(), mg0Var.f50059c0.getAvatarImageView().getY(), mg0Var.f50059c0.getAvatarImageView().getWidth(), mg0Var.f50059c0.getAvatarImageView().getHeight());
        if (mg0Var.Z) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, mg0Var.X.r(), mg0Var.X.s());
            mg0Var.X.h(canvas, null);
            canvas.restore();
        }
        if (mg0Var.Y) {
            int r10 = (int) (mg0Var.X.r() - (org.telegram.ui.ActionBar.n6.U0.getIntrinsicWidth() / 2));
            int s5 = (int) (mg0Var.X.s() - (org.telegram.ui.ActionBar.n6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.n6.U0;
            drawable.setBounds(r10, s5, drawable.getIntrinsicWidth() + r10, org.telegram.ui.ActionBar.n6.U0.getIntrinsicHeight() + s5);
            org.telegram.ui.ActionBar.n6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0.X.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0.X.S();
    }
}
