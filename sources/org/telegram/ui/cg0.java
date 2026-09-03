package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class cg0 extends AnimatorListenerAdapter {
    public final int f33141a;
    public final dg0 f33142b;

    public cg0(dg0 dg0Var, int i10) {
        this.f33141a = i10;
        this.f33142b = dg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33141a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f33142b.h.requestFocus();
                    return;
                }
                return;
            default:
                dg0 dg0Var = this.f33142b;
                if (dg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) dg0Var.getParent()).removeView(dg0Var);
                }
                dg0Var.f33465c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33141a) {
            case 0:
                dg0 dg0Var = this.f33142b;
                dg0Var.f33465c.setVisibility(8);
                int measuredWidth = (int) (dg0Var.f33464b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (dg0Var.f33464b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                dg0Var.f33464b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                dg0Var.d.setBackground(new BitmapDrawable(dg0Var.getContext().getResources(), createBitmap));
                dg0Var.d.setAlpha(0.0f);
                dg0Var.d.setVisibility(0);
                dg0Var.f33464b.addView(dg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
