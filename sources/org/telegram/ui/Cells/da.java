package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da1;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.x71;
public final class da implements ViewTreeObserver.OnPreDrawListener {
    public final int f22293a;
    public final Object f22294b;

    public da(Object obj, int i10) {
        this.f22293a = i10;
        this.f22294b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        boolean z10;
        int i10 = this.f22293a;
        Object obj = this.f22294b;
        switch (i10) {
            case 0:
                fa faVar = ((ea) obj).f22345a;
                faVar.getViewTreeObserver().removeOnPreDrawListener(this);
                faVar.getTransitionParams().j();
                faVar.getTransitionParams().f();
                faVar.getTransitionParams().f23155g = true;
                faVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new m.a(this, 18));
                ofFloat.start();
                return false;
            case 1:
                ((vu) obj).f32053a.f25429c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                i30 i30Var = (i30) obj;
                m30 m30Var = i30Var.f27192f;
                org.telegram.ui.x7 x7Var = i30Var.e;
                x7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                x7Var.getLocationOnScreen(i30Var.G);
                float f7 = i30Var.f27194r.x + i30Var.Q;
                o30 o30Var = i30Var.U;
                float measuredWidth = ((o30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((o30Var.getMeasuredWidth() / 2.0f) + (i30Var.f27194r.y + i30Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < x7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + m30Var.getMeasuredWidth() < x7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    m30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / m30Var.getMeasuredHeight();
                    m30Var.setTranslationY((int) (measuredWidth2 - (m30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / x7Var.getMeasuredHeight(), 1.0f - dp)))));
                    m30Var.a(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - m30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / m30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / x7Var.getMeasuredHeight(), 1.0f - dp2));
                    m30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - m30Var.getMeasuredWidth()));
                    m30Var.setTranslationY((int) (measuredWidth2 - (m30Var.getMeasuredHeight() * max)));
                    m30Var.a(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > x7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / m30Var.getMeasuredWidth();
                    m30Var.setTranslationX((int) (measuredWidth - (m30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / x7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    m30Var.setTranslationY((int) ((measuredWidth2 - m30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    m30Var.a(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / m30Var.getMeasuredWidth();
                    m30Var.setTranslationX((int) (measuredWidth - (m30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / x7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    m30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    m30Var.a(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((ei.g6) obj).invalidate();
                return true;
            default:
                da1 da1Var = (da1) ((t50) obj).f30644b;
                da1Var.f25579n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = da1Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    da1Var.e.setImageDrawable(null);
                    Bitmap bitmap = da1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        da1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new x71(this, 4));
                da1Var.f25580r = 0;
                return true;
        }
    }
}
