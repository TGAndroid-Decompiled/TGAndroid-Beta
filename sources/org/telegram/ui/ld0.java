package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class ld0 extends AnimatorListenerAdapter {
    public final int f47308a;
    public final md0 f47309b;

    public ld0(md0 md0Var, int i3) {
        this.f47308a = i3;
        this.f47309b = md0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47308a) {
            case 0:
                if (org.telegram.messenger.g0.C1()) {
                    this.f47309b.h.requestFocus();
                    return;
                }
                return;
            default:
                md0 md0Var = this.f47309b;
                if (md0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) md0Var.getParent()).removeView(md0Var);
                }
                md0Var.f47655c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f47308a) {
            case 0:
                md0 md0Var = this.f47309b;
                md0Var.f47655c.setVisibility(8);
                int measuredWidth = (int) (md0Var.f47654b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (md0Var.f47654b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
                md0Var.f47654b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                md0Var.d.setBackground(new BitmapDrawable(md0Var.getContext().getResources(), createBitmap));
                md0Var.d.setAlpha(0.0f);
                md0Var.d.setVisibility(0);
                md0Var.f47654b.addView(md0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
