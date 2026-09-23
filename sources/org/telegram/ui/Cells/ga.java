package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.w61;
public final class ga implements ViewTreeObserver.OnPreDrawListener {
    public final int f20121a;
    public final Object f20122b;

    public ga(Object obj, int i10) {
        this.f20121a = i10;
        this.f20122b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10 = this.f20121a;
        Object obj = this.f20122b;
        switch (i10) {
            case 0:
                ia iaVar = ((ha) obj).f20169a;
                iaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                iaVar.getTransitionParams().j();
                iaVar.getTransitionParams().f();
                iaVar.getTransitionParams().f20819g = true;
                iaVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.u4(this, 13));
                ofFloat.start();
                return false;
            case 1:
                ((pu) obj).f27135a.f29811c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                a30 a30Var = (a30) obj;
                e30 e30Var = a30Var.f22341f;
                org.telegram.ui.u7 u7Var = a30Var.e;
                u7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = a30Var.G;
                u7Var.getLocationOnScreen(iArr);
                float f7 = a30Var.f22343r.x + a30Var.Q;
                g30 g30Var = a30Var.U;
                float measuredWidth = ((g30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((g30Var.getMeasuredWidth() / 2.0f) + (a30Var.f22343r.y + a30Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < u7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + e30Var.getMeasuredWidth() < u7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    e30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredHeight();
                    e30Var.setTranslationY((int) (measuredWidth2 - (e30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / u7Var.getMeasuredHeight(), 1.0f - dp)))));
                    e30Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - e30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / u7Var.getMeasuredHeight(), 1.0f - dp2));
                    e30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - e30Var.getMeasuredWidth()));
                    e30Var.setTranslationY((int) (measuredWidth2 - (e30Var.getMeasuredHeight() * max)));
                    e30Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > u7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredWidth();
                    e30Var.setTranslationX((int) (measuredWidth - (e30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / u7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    e30Var.setTranslationY((int) ((measuredWidth2 - e30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    e30Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredWidth();
                    e30Var.setTranslationX((int) (measuredWidth - (e30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / u7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    e30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    e30Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((ci.r6) obj).invalidate();
                return true;
            default:
                b91 b91Var = (b91) ((k50) obj).f25517b;
                b91Var.f22634n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = b91Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    b91Var.e.setImageDrawable(null);
                    Bitmap bitmap = b91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        b91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new w61(this, 3));
                b91Var.f22635r = 0;
                return true;
        }
    }
}
