package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.ma1;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.wu;
public final class ha implements ViewTreeObserver.OnPreDrawListener {
    public final int f24211a;
    public final Object f24212b;

    public ha(Object obj, int i10) {
        this.f24211a = i10;
        this.f24212b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        boolean z10;
        int i10 = this.f24211a;
        Object obj = this.f24212b;
        switch (i10) {
            case 0:
                ja jaVar = ((ia) obj).f24258a;
                jaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                jaVar.getTransitionParams().j();
                jaVar.getTransitionParams().f();
                jaVar.getTransitionParams().f24870g = true;
                jaVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 9));
                ofFloat.addListener(new kg.e(this, 20));
                ofFloat.start();
                return false;
            case 1:
                ((wu) obj).f34532a.f27606c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                k30 k30Var = (k30) obj;
                o30 o30Var = k30Var.f29792f;
                org.telegram.ui.a8 a8Var = k30Var.e;
                a8Var.getViewTreeObserver().removeOnPreDrawListener(this);
                a8Var.getLocationOnScreen(k30Var.G);
                float f7 = k30Var.f29794r.x + k30Var.Q;
                q30 q30Var = k30Var.U;
                float measuredWidth = ((q30Var.getMeasuredWidth() / 2.0f) + f7) - iArr[0];
                float measuredWidth2 = ((q30Var.getMeasuredWidth() / 2.0f) + (k30Var.f29794r.y + k30Var.R)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < a8Var.getMeasuredHeight()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + o30Var.getMeasuredWidth() < a8Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    o30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / o30Var.getMeasuredHeight();
                    o30Var.setTranslationY((int) (measuredWidth2 - (o30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / a8Var.getMeasuredHeight(), 1.0f - dp)))));
                    o30Var.a(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - o30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float dp2 = AndroidUtilities.dp(40.0f) / o30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / a8Var.getMeasuredHeight(), 1.0f - dp2));
                    o30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - o30Var.getMeasuredWidth()));
                    o30Var.setTranslationY((int) (measuredWidth2 - (o30Var.getMeasuredHeight() * max)));
                    o30Var.a(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > a8Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / o30Var.getMeasuredWidth();
                    o30Var.setTranslationX((int) (measuredWidth - (o30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / a8Var.getMeasuredWidth(), 1.0f - dp3)))));
                    o30Var.setTranslationY((int) ((measuredWidth2 - o30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    o30Var.a(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / o30Var.getMeasuredWidth();
                    o30Var.setTranslationX((int) (measuredWidth - (o30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / a8Var.getMeasuredWidth(), 1.0f - dp4)))));
                    o30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    o30Var.a(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((fi.f6) obj).invalidate();
                return true;
            default:
                ma1 ma1Var = (ma1) ((v50) obj).f33568b;
                ma1Var.f30501n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = ma1Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    ma1Var.e.setImageDrawable(null);
                    Bitmap bitmap = ma1Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ma1Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new s51(this, 9));
                ma1Var.f30502r = 0;
                return true;
        }
    }
}
