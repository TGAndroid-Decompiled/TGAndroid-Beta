package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ag0 extends AnimatorListenerAdapter {
    public final int f32581a;
    public final bg0 f32582b;

    public ag0(bg0 bg0Var, int i10) {
        this.f32581a = i10;
        this.f32582b = bg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32581a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f32582b.h.requestFocus();
                    return;
                }
                return;
            default:
                bg0 bg0Var = this.f32582b;
                if (bg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) bg0Var.getParent()).removeView(bg0Var);
                }
                bg0Var.f32956c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32581a) {
            case 0:
                bg0 bg0Var = this.f32582b;
                bg0Var.f32956c.setVisibility(8);
                int measuredWidth = (int) (bg0Var.f32955b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (bg0Var.f32955b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                bg0Var.f32955b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                bg0Var.d.setBackground(new BitmapDrawable(bg0Var.getContext().getResources(), createBitmap));
                bg0Var.d.setAlpha(0.0f);
                bg0Var.d.setVisibility(0);
                bg0Var.f32955b.addView(bg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
