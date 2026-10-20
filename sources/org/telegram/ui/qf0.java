package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qf0 extends AnimatorListenerAdapter {
    public final int f40561a;
    public final rf0 f40562b;

    public qf0(rf0 rf0Var, int i10) {
        this.f40561a = i10;
        this.f40562b = rf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40561a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f40562b.h.requestFocus();
                    return;
                }
                return;
            default:
                rf0 rf0Var = this.f40562b;
                if (rf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) rf0Var.getParent()).removeView(rf0Var);
                }
                rf0Var.f41203c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40561a) {
            case 0:
                rf0 rf0Var = this.f40562b;
                rf0Var.f41203c.setVisibility(8);
                int measuredWidth = (int) (rf0Var.f41202b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (rf0Var.f41202b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                rf0Var.f41202b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                rf0Var.d.setBackground(new BitmapDrawable(rf0Var.getContext().getResources(), createBitmap));
                rf0Var.d.setAlpha(0.0f);
                rf0Var.d.setVisibility(0);
                rf0Var.f41202b.addView(rf0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
