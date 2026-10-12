package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class og0 extends AnimatorListenerAdapter {
    public final int f38952a;
    public final pg0 f38953b;

    public og0(pg0 pg0Var, int i10) {
        this.f38952a = i10;
        this.f38953b = pg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38952a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f38953b.h.requestFocus();
                    return;
                }
                return;
            default:
                pg0 pg0Var = this.f38953b;
                if (pg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pg0Var.getParent()).removeView(pg0Var);
                }
                pg0Var.f39217c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38952a) {
            case 0:
                pg0 pg0Var = this.f38953b;
                pg0Var.f39217c.setVisibility(8);
                int measuredWidth = (int) (pg0Var.f39216b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (pg0Var.f39216b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                pg0Var.f39216b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                pg0Var.d.setBackground(new BitmapDrawable(pg0Var.getContext().getResources(), createBitmap));
                pg0Var.d.setAlpha(0.0f);
                pg0Var.d.setVisibility(0);
                pg0Var.f39216b.addView(pg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
