package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.qu;
public final class fa implements ViewTreeObserver.OnPreDrawListener {
    public final int f20315a;
    public final Object f20316b;

    public fa(Object obj, int i10) {
        this.f20315a = i10;
        this.f20316b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10 = this.f20315a;
        Object obj = this.f20316b;
        switch (i10) {
            case 0:
                ha haVar = ((ga) obj).f20372a;
                haVar.getViewTreeObserver().removeOnPreDrawListener(this);
                haVar.getTransitionParams().j();
                haVar.getTransitionParams().f();
                haVar.getTransitionParams().f21103g = true;
                haVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.t4(this, 13));
                ofFloat.start();
                return false;
            case 1:
                ((qu) obj).f27834a.f30481c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                c30 c30Var = (c30) obj;
                g30 g30Var = c30Var.f23187f;
                org.telegram.ui.u7 u7Var = c30Var.e;
                u7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = c30Var.G;
                u7Var.getLocationOnScreen(iArr);
                float f7 = c30Var.f23189r.x + c30Var.Q;
                i30 i30Var = c30Var.U;
                float measuredWidth = ((i30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((i30Var.getMeasuredWidth() / 2.0f) + (c30Var.f23189r.y + c30Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < u7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + g30Var.getMeasuredWidth() < u7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    g30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredHeight();
                    g30Var.setTranslationY((int) (measuredWidth2 - (g30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / u7Var.getMeasuredHeight(), 1.0f - dp)))));
                    g30Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - g30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / u7Var.getMeasuredHeight(), 1.0f - dp2));
                    g30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - g30Var.getMeasuredWidth()));
                    g30Var.setTranslationY((int) (measuredWidth2 - (g30Var.getMeasuredHeight() * max)));
                    g30Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > u7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredWidth();
                    g30Var.setTranslationX((int) (measuredWidth - (g30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / u7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    g30Var.setTranslationY((int) ((measuredWidth2 - g30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    g30Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredWidth();
                    g30Var.setTranslationX((int) (measuredWidth - (g30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / u7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    g30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    g30Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((ci.r6) obj).invalidate();
                return true;
            default:
                q91 q91Var = (q91) ((ki.d) obj).f13671b;
                q91Var.f27623n.getViewTreeObserver().removeOnPreDrawListener(this);
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
                AndroidUtilities.runOnUIThread(new i71(this, 4));
                q91Var.f27624r = 0;
                return true;
        }
    }
}
