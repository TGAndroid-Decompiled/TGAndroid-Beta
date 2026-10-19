package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pf0 extends AnimatorListenerAdapter {
    public final int f40218a;
    public final qf0 f40219b;

    public pf0(qf0 qf0Var, int i10) {
        this.f40218a = i10;
        this.f40219b = qf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40218a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f40219b.h.requestFocus();
                    return;
                }
                return;
            default:
                qf0 qf0Var = this.f40219b;
                if (qf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qf0Var.getParent()).removeView(qf0Var);
                }
                qf0Var.f40562c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40218a) {
            case 0:
                qf0 qf0Var = this.f40219b;
                qf0Var.f40562c.setVisibility(8);
                int measuredWidth = (int) (qf0Var.f40561b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (qf0Var.f40561b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
                qf0Var.f40561b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                qf0Var.d.setBackground(new BitmapDrawable(qf0Var.getContext().getResources(), createBitmap));
                qf0Var.d.setAlpha(0.0f);
                qf0Var.d.setVisibility(0);
                qf0Var.f40561b.addView(qf0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
