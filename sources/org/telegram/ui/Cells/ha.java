package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.t50;
public final class ha implements ViewTreeObserver.OnPreDrawListener {
    public final int f19284a;
    public final Object f19285b;

    public ha(Object obj, int i10) {
        this.f19284a = i10;
        this.f19285b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        int i10 = this.f19284a;
        Object obj = this.f19285b;
        switch (i10) {
            case 0:
                ja jaVar = ((ia) obj).f19322a;
                jaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                jaVar.getTransitionParams().j();
                jaVar.getTransitionParams().f();
                jaVar.getTransitionParams().f19945g = true;
                jaVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new v5(this, 3));
                ofFloat.start();
                return false;
            case 1:
                ((su) obj).f27216a.f29811c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                j30 j30Var = (j30) obj;
                n30 n30Var = j30Var.f24215f;
                org.telegram.ui.t7 t7Var = j30Var.e;
                t7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = j30Var.G;
                t7Var.getLocationOnScreen(iArr);
                float f7 = j30Var.f24217r.x + j30Var.Q;
                p30 p30Var = j30Var.U;
                float measuredWidth = ((p30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((p30Var.getMeasuredWidth() / 2.0f) + (j30Var.f24217r.y + j30Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < t7Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + n30Var.getMeasuredWidth() < t7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    n30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / n30Var.getMeasuredHeight();
                    n30Var.setTranslationY((int) (measuredWidth2 - (n30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / t7Var.getMeasuredHeight(), 1.0f - dp)))));
                    n30Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - n30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / n30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / t7Var.getMeasuredHeight(), 1.0f - dp2));
                    n30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - n30Var.getMeasuredWidth()));
                    n30Var.setTranslationY((int) (measuredWidth2 - (n30Var.getMeasuredHeight() * max)));
                    n30Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > t7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / n30Var.getMeasuredWidth();
                    n30Var.setTranslationX((int) (measuredWidth - (n30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / t7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    n30Var.setTranslationY((int) ((measuredWidth2 - n30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    n30Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / n30Var.getMeasuredWidth();
                    n30Var.setTranslationX((int) (measuredWidth - (n30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / t7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    n30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    n30Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((bi.s7) obj).invalidate();
                return true;
            default:
                o91 o91Var = (o91) ((t50) obj).f27335b;
                o91Var.f25730n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = o91Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    o91Var.e.setImageDrawable(null);
                    Bitmap bitmap = o91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        o91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new k71(this, 3));
                o91Var.f25731r = 0;
                return true;
        }
    }
}
