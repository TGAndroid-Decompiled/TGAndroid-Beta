package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class kg0 extends AnimatorListenerAdapter {
    public final int f35096a;
    public final lg0 f35097b;

    public kg0(lg0 lg0Var, int i10) {
        this.f35096a = i10;
        this.f35097b = lg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35096a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f35097b.h.requestFocus();
                    return;
                }
                return;
            default:
                lg0 lg0Var = this.f35097b;
                if (lg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) lg0Var.getParent()).removeView(lg0Var);
                }
                lg0Var.f35371c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35096a) {
            case 0:
                lg0 lg0Var = this.f35097b;
                lg0Var.f35371c.setVisibility(8);
                int measuredWidth = (int) (lg0Var.f35370b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (lg0Var.f35370b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                lg0Var.f35370b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                lg0Var.d.setBackground(new BitmapDrawable(lg0Var.getContext().getResources(), createBitmap));
                lg0Var.d.setAlpha(0.0f);
                lg0Var.d.setVisibility(0);
                lg0Var.f35370b.addView(lg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
