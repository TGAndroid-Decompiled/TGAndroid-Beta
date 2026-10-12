package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.ca1;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.v71;
public final class da implements ViewTreeObserver.OnPreDrawListener {
    public final int f21090a;
    public final Object f21091b;

    public da(Object obj, int i10) {
        this.f21090a = i10;
        this.f21091b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        boolean z10;
        int i10 = this.f21090a;
        Object obj = this.f21091b;
        switch (i10) {
            case 0:
                fa faVar = ((ea) obj).f21127a;
                faVar.getViewTreeObserver().removeOnPreDrawListener(this);
                faVar.getTransitionParams().j();
                faVar.getTransitionParams().f();
                faVar.getTransitionParams().f21989g = true;
                faVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.u0(this, 16));
                ofFloat.start();
                return false;
            case 1:
                ((av) obj).f23629a.f25752c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                m30 m30Var = (m30) obj;
                q30 q30Var = m30Var.f27183f;
                org.telegram.ui.y7 y7Var = m30Var.e;
                y7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                y7Var.getLocationOnScreen(m30Var.G);
                float f7 = m30Var.f27185r.x + m30Var.Q;
                s30 s30Var = m30Var.U;
                float measuredWidth = ((s30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((s30Var.getMeasuredWidth() / 2.0f) + (m30Var.f27185r.y + m30Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < y7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + q30Var.getMeasuredWidth() < y7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    q30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / q30Var.getMeasuredHeight();
                    q30Var.setTranslationY((int) (measuredWidth2 - (q30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / y7Var.getMeasuredHeight(), 1.0f - dp)))));
                    q30Var.a(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - q30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / q30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / y7Var.getMeasuredHeight(), 1.0f - dp2));
                    q30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - q30Var.getMeasuredWidth()));
                    q30Var.setTranslationY((int) (measuredWidth2 - (q30Var.getMeasuredHeight() * max)));
                    q30Var.a(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > y7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / q30Var.getMeasuredWidth();
                    q30Var.setTranslationX((int) (measuredWidth - (q30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / y7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    q30Var.setTranslationY((int) ((measuredWidth2 - q30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    q30Var.a(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / q30Var.getMeasuredWidth();
                    q30Var.setTranslationX((int) (measuredWidth - (q30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / y7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    q30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    q30Var.a(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((di.p6) obj).invalidate();
                return true;
            default:
                ca1 ca1Var = (ca1) ((li.e) obj).f14763b;
                ca1Var.f24005n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = ca1Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    ca1Var.e.setImageDrawable(null);
                    Bitmap bitmap = ca1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ca1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new v71(this, 4));
                ca1Var.f24006r = 0;
                return true;
        }
    }
}
