package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class od0 extends AnimatorListenerAdapter {
    public final int f48377a;
    public final pd0 f48378b;

    public od0(pd0 pd0Var, int i7) {
        this.f48377a = i7;
        this.f48378b = pd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48377a) {
            case 0:
                if (org.telegram.messenger.g0.C1()) {
                    this.f48378b.h.requestFocus();
                    return;
                }
                return;
            default:
                pd0 pd0Var = this.f48378b;
                if (pd0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pd0Var.getParent()).removeView(pd0Var);
                }
                pd0Var.f48806c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f48377a) {
            case 0:
                pd0 pd0Var = this.f48378b;
                pd0Var.f48806c.setVisibility(8);
                int measuredWidth = (int) (pd0Var.f48805b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (pd0Var.f48805b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
                pd0Var.f48805b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                pd0Var.d.setBackground(new BitmapDrawable(pd0Var.getContext().getResources(), createBitmap));
                pd0Var.d.setAlpha(0.0f);
                pd0Var.d.setVisibility(0);
                pd0Var.f48805b.addView(pd0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
