package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class eg0 extends AnimatorListenerAdapter {
    public final int f32917a;
    public final fg0 f32918b;

    public eg0(fg0 fg0Var, int i10) {
        this.f32917a = i10;
        this.f32918b = fg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32917a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f32918b.h.requestFocus();
                    return;
                }
                return;
            default:
                fg0 fg0Var = this.f32918b;
                if (fg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) fg0Var.getParent()).removeView(fg0Var);
                }
                fg0Var.f33314c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32917a) {
            case 0:
                fg0 fg0Var = this.f32918b;
                fg0Var.f33314c.setVisibility(8);
                int measuredWidth = (int) (fg0Var.f33313b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (fg0Var.f33313b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                fg0Var.f33313b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                fg0Var.d.setBackground(new BitmapDrawable(fg0Var.getContext().getResources(), createBitmap));
                fg0Var.d.setAlpha(0.0f);
                fg0Var.d.setVisibility(0);
                fg0Var.f33313b.addView(fg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
