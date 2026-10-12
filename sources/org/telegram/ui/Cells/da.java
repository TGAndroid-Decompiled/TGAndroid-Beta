package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.ma1;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.z30;
public final class da implements ViewTreeObserver.OnPreDrawListener {
    public final int f21756a;
    public final Object f21757b;

    public da(Object obj, int i10) {
        this.f21756a = i10;
        this.f21757b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        boolean z10;
        int i10 = this.f21756a;
        Object obj = this.f21757b;
        switch (i10) {
            case 0:
                fa faVar = ((ea) obj).f21818a;
                faVar.getViewTreeObserver().removeOnPreDrawListener(this);
                faVar.getTransitionParams().j();
                faVar.getTransitionParams().f();
                faVar.getTransitionParams().f22715g = true;
                faVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.w4(this, 13));
                ofFloat.start();
                return false;
            case 1:
                ((hv) obj).f26913a.f29297c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                t30 t30Var = (t30) obj;
                x30 x30Var = t30Var.f30748f;
                org.telegram.ui.w7 w7Var = t30Var.f30747e;
                w7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                w7Var.getLocationOnScreen(t30Var.G);
                float f7 = t30Var.f30750r.x + t30Var.Q;
                z30 z30Var = t30Var.U;
                float measuredWidth = ((z30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((z30Var.getMeasuredWidth() / 2.0f) + (t30Var.f30750r.y + t30Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < w7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + x30Var.getMeasuredWidth() < w7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    x30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / x30Var.getMeasuredHeight();
                    x30Var.setTranslationY((int) (measuredWidth2 - (x30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - dp)))));
                    x30Var.a(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - x30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / x30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - dp2));
                    x30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - x30Var.getMeasuredWidth()));
                    x30Var.setTranslationY((int) (measuredWidth2 - (x30Var.getMeasuredHeight() * max)));
                    x30Var.a(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > w7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / x30Var.getMeasuredWidth();
                    x30Var.setTranslationX((int) (measuredWidth - (x30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / w7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    x30Var.setTranslationY((int) ((measuredWidth2 - x30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    x30Var.a(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / x30Var.getMeasuredWidth();
                    x30Var.setTranslationX((int) (measuredWidth - (x30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / w7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    x30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    x30Var.a(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((ci.r6) obj).invalidate();
                return true;
            default:
                ma1 ma1Var = (ma1) ((e60) obj).f25608b;
                ma1Var.f28519n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = ma1Var.f28510e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    ma1Var.f28510e.setImageDrawable(null);
                    Bitmap bitmap = ma1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ma1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new d81(this, 4));
                ma1Var.f28520r = 0;
                return true;
        }
    }
}
