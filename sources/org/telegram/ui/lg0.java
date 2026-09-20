package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f35440a;
    public final mg0 f35441b;

    public lg0(mg0 mg0Var, int i10) {
        this.f35440a = i10;
        this.f35441b = mg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35440a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f35441b.h.requestFocus();
                    return;
                }
                return;
            default:
                mg0 mg0Var = this.f35441b;
                if (mg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) mg0Var.getParent()).removeView(mg0Var);
                }
                mg0Var.f35722c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35440a) {
            case 0:
                mg0 mg0Var = this.f35441b;
                mg0Var.f35722c.setVisibility(8);
                int measuredWidth = (int) (mg0Var.f35721b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (mg0Var.f35721b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                mg0Var.f35721b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                mg0Var.d.setBackground(new BitmapDrawable(mg0Var.getContext().getResources(), createBitmap));
                mg0Var.d.setAlpha(0.0f);
                mg0Var.d.setVisibility(0);
                mg0Var.f35721b.addView(mg0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
