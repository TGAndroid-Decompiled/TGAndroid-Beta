package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.yt;

public final class y9 implements ViewTreeObserver.OnPreDrawListener {

    public final int f26012a;

    public final Object f26013b;

    public y9(Object obj, int i10) {
        this.f26012a = i10;
        this.f26013b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f26012a;
        int i11 = 3;
        Object obj = this.f26013b;
        switch (i10) {
            case 0:
                aa aaVar = ((z9) obj).f26051a;
                aaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                aaVar.getTransitionParams().j();
                aaVar.getTransitionParams().f();
                aaVar.getTransitionParams().f25118g = true;
                aaVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new r(this, 8));
                valueAnimatorOfFloat.addListener(new lh.h9(this, 21));
                valueAnimatorOfFloat.start();
                return false;
            case 1:
                ((yt) obj).f34961a.f28451c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                n20 n20Var = (n20) obj;
                r20 r20Var = n20Var.f30823f;
                org.telegram.ui.u7 u7Var = n20Var.f30822e;
                u7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = n20Var.C;
                u7Var.getLocationOnScreen(iArr);
                float f10 = n20Var.f30825r.x + n20Var.M;
                t20 t20Var = n20Var.Q;
                float measuredWidth = ((t20Var.getMeasuredWidth() / 2.0f) + f10) - iArr[0];
                float measuredWidth2 = ((t20Var.getMeasuredWidth() / 2.0f) + (n20Var.f30825r.y + n20Var.N)) - iArr[1];
                boolean z10 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) u7Var.getMeasuredHeight());
                if (AndroidUtilities.dp(61.0f) + measuredWidth + r20Var.getMeasuredWidth() < u7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z10) {
                    r20Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / u7Var.getMeasuredHeight();
                    float fDp = AndroidUtilities.dp(40.0f) / r20Var.getMeasuredHeight();
                    r20Var.setTranslationY((int) (measuredWidth2 - (r20Var.getMeasuredHeight() * Math.max(fDp, Math.min(measuredHeight, 1.0f - fDp)))));
                    r20Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - r20Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z10) {
                    float measuredHeight2 = measuredWidth2 / u7Var.getMeasuredHeight();
                    float fDp2 = AndroidUtilities.dp(40.0f) / r20Var.getMeasuredHeight();
                    float fMax = Math.max(fDp2, Math.min(measuredHeight2, 1.0f - fDp2));
                    r20Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - r20Var.getMeasuredWidth()));
                    r20Var.setTranslationY((int) (measuredWidth2 - (r20Var.getMeasuredHeight() * fMax)));
                    r20Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > u7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / u7Var.getMeasuredWidth();
                    float fDp3 = AndroidUtilities.dp(40.0f) / r20Var.getMeasuredWidth();
                    r20Var.setTranslationX((int) (measuredWidth - (r20Var.getMeasuredWidth() * Math.max(fDp3, Math.min(measuredWidth3, 1.0f - fDp3)))));
                    r20Var.setTranslationY((int) ((measuredWidth2 - r20Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    r20Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float measuredWidth4 = measuredWidth / u7Var.getMeasuredWidth();
                    float fDp4 = AndroidUtilities.dp(40.0f) / r20Var.getMeasuredWidth();
                    r20Var.setTranslationX((int) (measuredWidth - (r20Var.getMeasuredWidth() * Math.max(fDp4, Math.min(measuredWidth4, 1.0f - fDp4)))));
                    r20Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    r20Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((ag.t0) obj).invalidate();
                return true;
            default:
                i81 i81Var = (i81) ((eh.h) obj).f5487b;
                i81Var.f29307n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = i81Var.f29302e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    i81Var.f29302e.setImageDrawable(null);
                    Bitmap bitmap = i81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        i81Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new d61(this, i11));
                i81Var.f29308r = 0;
                return true;
        }
    }
}
