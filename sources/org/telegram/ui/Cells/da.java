package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.ha1;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.w30;
public final class da implements ViewTreeObserver.OnPreDrawListener {
    public final int f21995a;
    public final Object f21996b;

    public da(Object obj, int i10) {
        this.f21995a = i10;
        this.f21996b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        boolean z10;
        int i10 = this.f21995a;
        Object obj = this.f21996b;
        switch (i10) {
            case 0:
                fa faVar = ((ea) obj).f22054a;
                faVar.getViewTreeObserver().removeOnPreDrawListener(this);
                faVar.getTransitionParams().j();
                faVar.getTransitionParams().f();
                faVar.getTransitionParams().f22952g = true;
                faVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.t4(this, 13));
                ofFloat.start();
                return false;
            case 1:
                ((ev) obj).f26171a.f28599c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                q30 q30Var = (q30) obj;
                u30 u30Var = q30Var.f30018f;
                org.telegram.ui.t7 t7Var = q30Var.f30017e;
                t7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                t7Var.getLocationOnScreen(q30Var.G);
                float f7 = q30Var.f30020r.x + q30Var.Q;
                w30 w30Var = q30Var.U;
                float measuredWidth = ((w30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((w30Var.getMeasuredWidth() / 2.0f) + (q30Var.f30020r.y + q30Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < t7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + u30Var.getMeasuredWidth() < t7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    u30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / u30Var.getMeasuredHeight();
                    u30Var.setTranslationY((int) (measuredWidth2 - (u30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / t7Var.getMeasuredHeight(), 1.0f - dp)))));
                    u30Var.a(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - u30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / u30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / t7Var.getMeasuredHeight(), 1.0f - dp2));
                    u30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - u30Var.getMeasuredWidth()));
                    u30Var.setTranslationY((int) (measuredWidth2 - (u30Var.getMeasuredHeight() * max)));
                    u30Var.a(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > t7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / u30Var.getMeasuredWidth();
                    u30Var.setTranslationX((int) (measuredWidth - (u30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / t7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    u30Var.setTranslationY((int) ((measuredWidth2 - u30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    u30Var.a(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / u30Var.getMeasuredWidth();
                    u30Var.setTranslationX((int) (measuredWidth - (u30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / t7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    u30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    u30Var.a(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((ci.r6) obj).invalidate();
                return true;
            default:
                ha1 ha1Var = (ha1) ((ki.d) obj).f14912b;
                ha1Var.f27028n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = ha1Var.f27019e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    ha1Var.f27019e.setImageDrawable(null);
                    Bitmap bitmap = ha1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ha1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new c81(this, 3));
                ha1Var.f27029r = 0;
                return true;
        }
    }
}
