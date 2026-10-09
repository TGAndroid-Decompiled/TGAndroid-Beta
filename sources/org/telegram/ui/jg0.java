package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class jg0 extends AnimatorListenerAdapter {
    public final int f38934a;
    public final kg0 f38935b;

    public jg0(kg0 kg0Var, int i10) {
        this.f38934a = i10;
        this.f38935b = kg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38934a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f38935b.h.requestFocus();
                    return;
                }
                return;
            default:
                kg0 kg0Var = this.f38935b;
                if (kg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) kg0Var.getParent()).removeView(kg0Var);
                }
                kg0Var.f39279c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38934a) {
            case 0:
                kg0 kg0Var = this.f38935b;
                kg0Var.f39279c.setVisibility(8);
                int measuredWidth = (int) (kg0Var.f39278b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (kg0Var.f39278b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
                kg0Var.f39278b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                kg0Var.d.setBackground(new BitmapDrawable(kg0Var.getContext().getResources(), createBitmap));
                kg0Var.d.setAlpha(0.0f);
                kg0Var.d.setVisibility(0);
                kg0Var.f39278b.addView(kg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
