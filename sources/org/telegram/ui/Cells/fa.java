package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.z20;
public final class fa implements ViewTreeObserver.OnPreDrawListener {
    public final int f20279a;
    public final Object f20280b;

    public fa(Object obj, int i10) {
        this.f20279a = i10;
        this.f20280b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10 = this.f20279a;
        Object obj = this.f20280b;
        switch (i10) {
            case 0:
                ha haVar = ((ga) obj).f20336a;
                haVar.getViewTreeObserver().removeOnPreDrawListener(this);
                haVar.getTransitionParams().j();
                haVar.getTransitionParams().f();
                haVar.getTransitionParams().f21067g = true;
                haVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.t4(this, 13));
                ofFloat.start();
                return false;
            case 1:
                ((ou) obj).f27054a.f29760c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                z20 z20Var = (z20) obj;
                d30 d30Var = z20Var.f30718f;
                org.telegram.ui.v7 v7Var = z20Var.e;
                v7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = z20Var.G;
                v7Var.getLocationOnScreen(iArr);
                float f7 = z20Var.f30720r.x + z20Var.Q;
                f30 f30Var = z20Var.U;
                float measuredWidth = ((f30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((f30Var.getMeasuredWidth() / 2.0f) + (z20Var.f30720r.y + z20Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < v7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + d30Var.getMeasuredWidth() < v7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    d30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredHeight();
                    d30Var.setTranslationY((int) (measuredWidth2 - (d30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / v7Var.getMeasuredHeight(), 1.0f - dp)))));
                    d30Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - d30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / v7Var.getMeasuredHeight(), 1.0f - dp2));
                    d30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - d30Var.getMeasuredWidth()));
                    d30Var.setTranslationY((int) (measuredWidth2 - (d30Var.getMeasuredHeight() * max)));
                    d30Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > v7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredWidth();
                    d30Var.setTranslationX((int) (measuredWidth - (d30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / v7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    d30Var.setTranslationY((int) ((measuredWidth2 - d30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    d30Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredWidth();
                    d30Var.setTranslationX((int) (measuredWidth - (d30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / v7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    d30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    d30Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((ci.s6) obj).invalidate();
                return true;
            default:
                q91 q91Var = (q91) ((ki.c) obj).f13662b;
                q91Var.f27524n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = q91Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    q91Var.e.setImageDrawable(null);
                    Bitmap bitmap = q91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        q91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new m71(this, 3));
                q91Var.f27525r = 0;
                return true;
        }
    }
}
