package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dg0 extends AnimatorListenerAdapter {
    public final int f33116a;
    public final eg0 f33117b;

    public dg0(eg0 eg0Var, int i10) {
        this.f33116a = i10;
        this.f33117b = eg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33116a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f33117b.h.requestFocus();
                    return;
                }
                return;
            default:
                eg0 eg0Var = this.f33117b;
                if (eg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) eg0Var.getParent()).removeView(eg0Var);
                }
                eg0Var.f33399c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33116a) {
            case 0:
                eg0 eg0Var = this.f33117b;
                eg0Var.f33399c.setVisibility(8);
                int measuredWidth = (int) (eg0Var.f33398b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (eg0Var.f33398b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
                eg0Var.f33398b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                eg0Var.d.setBackground(new BitmapDrawable(eg0Var.getContext().getResources(), createBitmap));
                eg0Var.d.setAlpha(0.0f);
                eg0Var.d.setVisibility(0);
                eg0Var.f33398b.addView(eg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
