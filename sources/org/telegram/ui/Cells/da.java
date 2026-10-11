package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.fv;
import org.telegram.ui.Components.ia1;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.x30;
public final class da implements ViewTreeObserver.OnPreDrawListener {
    public final int f21987a;
    public final Object f21988b;

    public da(Object obj, int i10) {
        this.f21987a = i10;
        this.f21988b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        boolean z10;
        int i10 = this.f21987a;
        Object obj = this.f21988b;
        switch (i10) {
            case 0:
                fa faVar = ((ea) obj).f22046a;
                faVar.getViewTreeObserver().removeOnPreDrawListener(this);
                faVar.getTransitionParams().j();
                faVar.getTransitionParams().f();
                faVar.getTransitionParams().f22944g = true;
                faVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.s4(this, 13));
                ofFloat.start();
                return false;
            case 1:
                ((fv) obj).f26497a.f28865c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                r30 r30Var = (r30) obj;
                v30 v30Var = r30Var.f30326f;
                org.telegram.ui.s7 s7Var = r30Var.f30325e;
                s7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                s7Var.getLocationOnScreen(r30Var.G);
                float f7 = r30Var.f30328r.x + r30Var.Q;
                x30 x30Var = r30Var.U;
                float measuredWidth = ((x30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((x30Var.getMeasuredWidth() / 2.0f) + (r30Var.f30328r.y + r30Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < s7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + v30Var.getMeasuredWidth() < s7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    v30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / v30Var.getMeasuredHeight();
                    v30Var.setTranslationY((int) (measuredWidth2 - (v30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / s7Var.getMeasuredHeight(), 1.0f - dp)))));
                    v30Var.a(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - v30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / v30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / s7Var.getMeasuredHeight(), 1.0f - dp2));
                    v30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - v30Var.getMeasuredWidth()));
                    v30Var.setTranslationY((int) (measuredWidth2 - (v30Var.getMeasuredHeight() * max)));
                    v30Var.a(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > s7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / v30Var.getMeasuredWidth();
                    v30Var.setTranslationX((int) (measuredWidth - (v30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / s7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    v30Var.setTranslationY((int) ((measuredWidth2 - v30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    v30Var.a(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / v30Var.getMeasuredWidth();
                    v30Var.setTranslationX((int) (measuredWidth - (v30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / s7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    v30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    v30Var.a(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((ci.r6) obj).invalidate();
                return true;
            default:
                ia1 ia1Var = (ia1) ((ki.d) obj).f14911b;
                ia1Var.f27262n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = ia1Var.f27253e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    ia1Var.f27253e.setImageDrawable(null);
                    Bitmap bitmap = ia1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ia1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new e81(this, 3));
                ia1Var.f27263r = 0;
                return true;
        }
    }
}
