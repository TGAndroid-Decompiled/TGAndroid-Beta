package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aa1;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.h30;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.su;
public final class fa implements ViewTreeObserver.OnPreDrawListener {
    public final int f22121a;
    public final Object f22122b;

    public fa(Object obj, int i10) {
        this.f22121a = i10;
        this.f22122b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10 = this.f22121a;
        Object obj = this.f22122b;
        switch (i10) {
            case 0:
                ha haVar = ((ga) obj).f22186a;
                haVar.getViewTreeObserver().removeOnPreDrawListener(this);
                haVar.getTransitionParams().j();
                haVar.getTransitionParams().f();
                haVar.getTransitionParams().f22965g = true;
                haVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.u4(this, 13));
                ofFloat.start();
                return false;
            case 1:
                ((su) obj).f30950a.f33643c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                d30 d30Var = (d30) obj;
                h30 h30Var = d30Var.f25608f;
                org.telegram.ui.x7 x7Var = d30Var.f25607e;
                x7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = d30Var.G;
                x7Var.getLocationOnScreen(iArr);
                float f7 = d30Var.f25610r.x + d30Var.Q;
                j30 j30Var = d30Var.U;
                float measuredWidth = ((j30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((j30Var.getMeasuredWidth() / 2.0f) + (d30Var.f25610r.y + d30Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < x7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + h30Var.getMeasuredWidth() < x7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    h30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / h30Var.getMeasuredHeight();
                    h30Var.setTranslationY((int) (measuredWidth2 - (h30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / x7Var.getMeasuredHeight(), 1.0f - dp)))));
                    h30Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - h30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / h30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / x7Var.getMeasuredHeight(), 1.0f - dp2));
                    h30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - h30Var.getMeasuredWidth()));
                    h30Var.setTranslationY((int) (measuredWidth2 - (h30Var.getMeasuredHeight() * max)));
                    h30Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > x7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / h30Var.getMeasuredWidth();
                    h30Var.setTranslationX((int) (measuredWidth - (h30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / x7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    h30Var.setTranslationY((int) ((measuredWidth2 - h30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    h30Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / h30Var.getMeasuredWidth();
                    h30Var.setTranslationX((int) (measuredWidth - (h30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / x7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    h30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    h30Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((ci.r6) obj).invalidate();
                return true;
            default:
                aa1 aa1Var = (aa1) ((ki.d) obj).f14863b;
                aa1Var.f24570n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = aa1Var.f24561e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    aa1Var.f24561e.setImageDrawable(null);
                    Bitmap bitmap = aa1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        aa1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new q61(this, 6));
                aa1Var.f24571r = 0;
                return true;
        }
    }
}
