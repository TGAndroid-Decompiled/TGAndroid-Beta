package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.w20;
public final class z9 implements ViewTreeObserver.OnPreDrawListener {
    public final int f26065a;
    public final Object f26066b;

    public z9(Object obj, int i10) {
        this.f26065a = i10;
        this.f26066b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10 = this.f26065a;
        Object obj = this.f26066b;
        switch (i10) {
            case 0:
                ba baVar = ((aa) obj).f24101a;
                baVar.getViewTreeObserver().removeOnPreDrawListener(this);
                baVar.getTransitionParams().j();
                baVar.getTransitionParams().f();
                baVar.getTransitionParams().f25123g = true;
                baVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new nh.q5(this, 21));
                ofFloat.start();
                return false;
            case 1:
                ((fu) obj).f28533a.f30765c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                w20 w20Var = (w20) obj;
                a30 a30Var = w20Var.f34279f;
                org.telegram.ui.s7 s7Var = w20Var.f34278e;
                s7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = w20Var.C;
                s7Var.getLocationOnScreen(iArr);
                float f9 = w20Var.f34281r.x + w20Var.M;
                c30 c30Var = w20Var.Q;
                float measuredWidth = ((c30Var.getMeasuredWidth() / 2.0f) + f9) - iArr[0];
                float measuredWidth2 = ((c30Var.getMeasuredWidth() / 2.0f) + (w20Var.f34281r.y + w20Var.N)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < s7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + a30Var.getMeasuredWidth() < s7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    a30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / a30Var.getMeasuredHeight();
                    a30Var.setTranslationY((int) (measuredWidth2 - (a30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / s7Var.getMeasuredHeight(), 1.0f - dp)))));
                    a30Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - a30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / a30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / s7Var.getMeasuredHeight(), 1.0f - dp2));
                    a30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - a30Var.getMeasuredWidth()));
                    a30Var.setTranslationY((int) (measuredWidth2 - (a30Var.getMeasuredHeight() * max)));
                    a30Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > s7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / a30Var.getMeasuredWidth();
                    a30Var.setTranslationX((int) (measuredWidth - (a30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / s7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    a30Var.setTranslationY((int) ((measuredWidth2 - a30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    a30Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / a30Var.getMeasuredWidth();
                    a30Var.setTranslationX((int) (measuredWidth - (a30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / s7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    a30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    a30Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((cg.i0) obj).invalidate();
                return true;
            default:
                s81 s81Var = (s81) ((gh.h) obj).f7379b;
                s81Var.f32581n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = s81Var.f32576e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    s81Var.f32576e.setImageDrawable(null);
                    Bitmap bitmap = s81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        s81Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new o61(this, 3));
                s81Var.f32582r = 0;
                return true;
        }
    }
}
