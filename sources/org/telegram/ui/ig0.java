package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f38711a;
    public final jg0 f38712b;

    public ig0(jg0 jg0Var, int i10) {
        this.f38711a = i10;
        this.f38712b = jg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38711a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f38712b.h.requestFocus();
                    return;
                }
                return;
            default:
                jg0 jg0Var = this.f38712b;
                if (jg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) jg0Var.getParent()).removeView(jg0Var);
                }
                jg0Var.f39077c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38711a) {
            case 0:
                jg0 jg0Var = this.f38712b;
                jg0Var.f39077c.setVisibility(8);
                int measuredWidth = (int) (jg0Var.f39076b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (jg0Var.f39076b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false));
                jg0Var.f39076b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                jg0Var.d.setBackground(new BitmapDrawable(jg0Var.getContext().getResources(), createBitmap));
                jg0Var.d.setAlpha(0.0f);
                jg0Var.d.setVisibility(0);
                jg0Var.f39076b.addView(jg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
