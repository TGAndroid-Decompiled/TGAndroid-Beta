package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gg0 extends AnimatorListenerAdapter {
    public final int f33925a;
    public final hg0 f33926b;

    public gg0(hg0 hg0Var, int i10) {
        this.f33925a = i10;
        this.f33926b = hg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33925a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f33926b.h.requestFocus();
                    return;
                }
                return;
            default:
                hg0 hg0Var = this.f33926b;
                if (hg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) hg0Var.getParent()).removeView(hg0Var);
                }
                hg0Var.f34219c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33925a) {
            case 0:
                hg0 hg0Var = this.f33926b;
                hg0Var.f34219c.setVisibility(8);
                int measuredWidth = (int) (hg0Var.f34218b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (hg0Var.f34218b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                hg0Var.f34218b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                hg0Var.d.setBackground(new BitmapDrawable(hg0Var.getContext().getResources(), createBitmap));
                hg0Var.d.setAlpha(0.0f);
                hg0Var.d.setVisibility(0);
                hg0Var.f34218b.addView(hg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
