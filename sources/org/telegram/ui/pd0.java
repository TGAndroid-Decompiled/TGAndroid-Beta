package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f50861a;
    public final qd0 f50862b;

    public pd0(qd0 qd0Var, int i7) {
        this.f50861a = i7;
        this.f50862b = qd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50861a) {
            case 0:
                if (org.telegram.messenger.g0.C1()) {
                    this.f50862b.h.requestFocus();
                    return;
                }
                return;
            default:
                qd0 qd0Var = this.f50862b;
                if (qd0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qd0Var.getParent()).removeView(qd0Var);
                }
                qd0Var.f51257c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f50861a) {
            case 0:
                qd0 qd0Var = this.f50862b;
                qd0Var.f51257c.setVisibility(8);
                int measuredWidth = (int) (qd0Var.f51256b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (qd0Var.f51256b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false));
                qd0Var.f51256b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                qd0Var.d.setBackground(new BitmapDrawable(qd0Var.getContext().getResources(), createBitmap));
                qd0Var.d.setAlpha(0.0f);
                qd0Var.d.setVisibility(0);
                qd0Var.f51256b.addView(qd0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
