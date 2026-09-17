package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.z20;
public final class fa implements ViewTreeObserver.OnPreDrawListener {
    public final int f20122a;
    public final Object f20123b;

    public fa(Object obj, int i10) {
        this.f20122a = i10;
        this.f20123b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10 = this.f20122a;
        Object obj = this.f20123b;
        switch (i10) {
            case 0:
                ha haVar = ((ga) obj).f20167a;
                haVar.getViewTreeObserver().removeOnPreDrawListener(this);
                haVar.getTransitionParams().j();
                haVar.getTransitionParams().f();
                haVar.getTransitionParams().f20864g = true;
                haVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.t4(this, 13));
                ofFloat.start();
                return false;
            case 1:
                ((ou) obj).f26848a.f29410c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                z20 z20Var = (z20) obj;
                d30 d30Var = z20Var.f30381f;
                org.telegram.ui.w7 w7Var = z20Var.e;
                w7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = z20Var.G;
                w7Var.getLocationOnScreen(iArr);
                float f7 = z20Var.f30383r.x + z20Var.Q;
                f30 f30Var = z20Var.U;
                float measuredWidth = ((f30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((f30Var.getMeasuredWidth() / 2.0f) + (z20Var.f30383r.y + z20Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < w7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + d30Var.getMeasuredWidth() < w7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    d30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredHeight();
                    d30Var.setTranslationY((int) (measuredWidth2 - (d30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - dp)))));
                    d30Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - d30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - dp2));
                    d30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - d30Var.getMeasuredWidth()));
                    d30Var.setTranslationY((int) (measuredWidth2 - (d30Var.getMeasuredHeight() * max)));
                    d30Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > w7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredWidth();
                    d30Var.setTranslationX((int) (measuredWidth - (d30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / w7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    d30Var.setTranslationY((int) ((measuredWidth2 - d30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    d30Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / d30Var.getMeasuredWidth();
                    d30Var.setTranslationX((int) (measuredWidth - (d30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / w7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    d30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    d30Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((ci.s6) obj).invalidate();
                return true;
            default:
                d91 d91Var = (d91) ((j50) obj).f25117b;
                d91Var.f23279n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = d91Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    d91Var.e.setImageDrawable(null);
                    Bitmap bitmap = d91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        d91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new y61(this, 3));
                d91Var.f23280r = 0;
                return true;
        }
    }
}
