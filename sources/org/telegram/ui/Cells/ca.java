package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.zt;
public final class ca implements ViewTreeObserver.OnPreDrawListener {
    public final int f24210a;
    public final Object f24211b;

    public ca(Object obj, int i9) {
        this.f24210a = i9;
        this.f24211b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i9 = this.f24210a;
        Object obj = this.f24211b;
        switch (i9) {
            case 0:
                ea eaVar = ((da) obj).f24247a;
                eaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                eaVar.getTransitionParams().j();
                eaVar.getTransitionParams().f();
                eaVar.getTransitionParams().f25167g = true;
                eaVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new mh.x(this, 19));
                ofFloat.start();
                return false;
            case 1:
                ((zt) obj).f35375a.f28869c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                j20 j20Var = (j20) obj;
                n20 n20Var = j20Var.f29602f;
                org.telegram.ui.t7 t7Var = j20Var.f29601e;
                t7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = j20Var.C;
                t7Var.getLocationOnScreen(iArr);
                float f10 = j20Var.f29604r.x + j20Var.M;
                p20 p20Var = j20Var.Q;
                float measuredWidth = ((p20Var.getMeasuredWidth() / 2.0f) + f10) - iArr[0];
                float measuredWidth2 = ((p20Var.getMeasuredWidth() / 2.0f) + (j20Var.f29604r.y + j20Var.N)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < t7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + n20Var.getMeasuredWidth() < t7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    n20Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / n20Var.getMeasuredHeight();
                    n20Var.setTranslationY((int) (measuredWidth2 - (n20Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / t7Var.getMeasuredHeight(), 1.0f - dp)))));
                    n20Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - n20Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / n20Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / t7Var.getMeasuredHeight(), 1.0f - dp2));
                    n20Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - n20Var.getMeasuredWidth()));
                    n20Var.setTranslationY((int) (measuredWidth2 - (n20Var.getMeasuredHeight() * max)));
                    n20Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > t7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / n20Var.getMeasuredWidth();
                    n20Var.setTranslationX((int) (measuredWidth - (n20Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / t7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    n20Var.setTranslationY((int) ((measuredWidth2 - n20Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    n20Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / n20Var.getMeasuredWidth();
                    n20Var.setTranslationX((int) (measuredWidth - (n20Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / t7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    n20Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    n20Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((kh.h6) obj).invalidate();
                return true;
            default:
                g81 g81Var = (g81) ((dh.i) obj).f4589b;
                g81Var.f28704n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = g81Var.f28699e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    g81Var.f28699e.setImageDrawable(null);
                    Bitmap bitmap = g81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        g81Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new b61(this, 3));
                g81Var.f28705r = 0;
                return true;
        }
    }
}
