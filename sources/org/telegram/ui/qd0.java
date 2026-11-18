package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class qd0 extends AnimatorListenerAdapter {
    public final int f51209a;
    public final rd0 f51210b;

    public qd0(rd0 rd0Var, int i7) {
        this.f51209a = i7;
        this.f51210b = rd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51209a) {
            case 0:
                if (org.telegram.messenger.g0.C1()) {
                    this.f51210b.h.requestFocus();
                    return;
                }
                return;
            default:
                rd0 rd0Var = this.f51210b;
                if (rd0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) rd0Var.getParent()).removeView(rd0Var);
                }
                rd0Var.f51571c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f51209a) {
            case 0:
                rd0 rd0Var = this.f51210b;
                rd0Var.f51571c.setVisibility(8);
                int measuredWidth = (int) (rd0Var.f51570b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (rd0Var.f51570b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false));
                rd0Var.f51570b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                rd0Var.d.setBackground(new BitmapDrawable(rd0Var.getContext().getResources(), createBitmap));
                rd0Var.d.setAlpha(0.0f);
                rd0Var.d.setVisibility(0);
                rd0Var.f51570b.addView(rd0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
