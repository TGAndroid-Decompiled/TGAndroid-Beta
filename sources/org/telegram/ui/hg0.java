package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class hg0 extends AnimatorListenerAdapter {
    public final int f37068a;
    public final ig0 f37069b;

    public hg0(ig0 ig0Var, int i10) {
        this.f37068a = i10;
        this.f37069b = ig0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37068a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f37069b.h.requestFocus();
                    return;
                }
                return;
            default:
                ig0 ig0Var = this.f37069b;
                if (ig0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) ig0Var.getParent()).removeView(ig0Var);
                }
                ig0Var.f37420c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37068a) {
            case 0:
                ig0 ig0Var = this.f37069b;
                ig0Var.f37420c.setVisibility(8);
                int measuredWidth = (int) (ig0Var.f37419b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (ig0Var.f37419b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20818d6, false));
                ig0Var.f37419b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                ig0Var.d.setBackground(new BitmapDrawable(ig0Var.getContext().getResources(), createBitmap));
                ig0Var.d.setAlpha(0.0f);
                ig0Var.d.setVisibility(0);
                ig0Var.f37419b.addView(ig0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
