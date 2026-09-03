package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f35527a;
    public final cg0 f35528b;

    public bg0(cg0 cg0Var, int i10) {
        this.f35527a = i10;
        this.f35528b = cg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35527a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f35528b.h.requestFocus();
                    return;
                }
                return;
            default:
                cg0 cg0Var = this.f35528b;
                if (cg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) cg0Var.getParent()).removeView(cg0Var);
                }
                cg0Var.f35794c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35527a) {
            case 0:
                cg0 cg0Var = this.f35528b;
                cg0Var.f35794c.setVisibility(8);
                int measuredWidth = (int) (cg0Var.f35793b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (cg0Var.f35793b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                cg0Var.f35793b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                cg0Var.d.setBackground(new BitmapDrawable(cg0Var.getContext().getResources(), createBitmap));
                cg0Var.d.setAlpha(0.0f);
                cg0Var.d.setVisibility(0);
                cg0Var.f35793b.addView(cg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
