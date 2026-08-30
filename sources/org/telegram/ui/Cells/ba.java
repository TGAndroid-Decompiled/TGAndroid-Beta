package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.z61;
public final class ba implements ViewTreeObserver.OnPreDrawListener {
    public final int f20890a;
    public final Object f20891b;

    public ba(Object obj, int i10) {
        this.f20890a = i10;
        this.f20891b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z4;
        int i10 = this.f20890a;
        Object obj = this.f20891b;
        switch (i10) {
            case 0:
                da daVar = ((ca) obj).f20933a;
                daVar.getViewTreeObserver().removeOnPreDrawListener(this);
                daVar.getTransitionParams().j();
                daVar.getTransitionParams().f();
                daVar.getTransitionParams().f21842g = true;
                daVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.s5(this, 12));
                ofFloat.start();
                return false;
            case 1:
                ((iu) obj).f25786a.f27985c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                a30 a30Var = (a30) obj;
                e30 e30Var = a30Var.f23282f;
                org.telegram.ui.w7 w7Var = a30Var.e;
                w7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = a30Var.D;
                w7Var.getLocationOnScreen(iArr);
                float f10 = a30Var.f23284r.x + a30Var.N;
                g30 g30Var = a30Var.R;
                float measuredWidth = ((g30Var.getMeasuredWidth() / 2.0f) + f10) - iArr[0];
                float measuredWidth2 = ((g30Var.getMeasuredWidth() / 2.0f) + (a30Var.f23284r.y + a30Var.O)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < w7Var.getMeasuredHeight()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + e30Var.getMeasuredWidth() < w7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z4) {
                    e30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredHeight();
                    e30Var.setTranslationY((int) (measuredWidth2 - (e30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - dp)))));
                    e30Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - e30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z4) {
                    float dp2 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - dp2));
                    e30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - e30Var.getMeasuredWidth()));
                    e30Var.setTranslationY((int) (measuredWidth2 - (e30Var.getMeasuredHeight() * max)));
                    e30Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > w7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredWidth();
                    e30Var.setTranslationX((int) (measuredWidth - (e30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / w7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    e30Var.setTranslationY((int) ((measuredWidth2 - e30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    e30Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / e30Var.getMeasuredWidth();
                    e30Var.setTranslationX((int) (measuredWidth - (e30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / w7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    e30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    e30Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((eg.i0) obj).invalidate();
                return true;
            default:
                e91 e91Var = (e91) ((ih.h) obj).f7581b;
                e91Var.f24536n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = e91Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    e91Var.e.setImageDrawable(null);
                    Bitmap bitmap = e91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        e91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new z61(this, 3));
                e91Var.f24537r = 0;
                return true;
        }
    }
}
