package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ng0 extends AnimatorListenerAdapter {
    public final int f38391a;
    public final og0 f38392b;

    public ng0(og0 og0Var, int i10) {
        this.f38391a = i10;
        this.f38392b = og0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38391a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f38392b.h.requestFocus();
                    return;
                }
                return;
            default:
                og0 og0Var = this.f38392b;
                if (og0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) og0Var.getParent()).removeView(og0Var);
                }
                og0Var.f38643c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38391a) {
            case 0:
                og0 og0Var = this.f38392b;
                og0Var.f38643c.setVisibility(8);
                int measuredWidth = (int) (og0Var.f38642b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (og0Var.f38642b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                og0Var.f38642b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                og0Var.d.setBackground(new BitmapDrawable(og0Var.getContext().getResources(), createBitmap));
                og0Var.d.setAlpha(0.0f);
                og0Var.d.setVisibility(0);
                og0Var.f38642b.addView(og0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
