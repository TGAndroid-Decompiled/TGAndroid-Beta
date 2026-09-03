package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.h30;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.z61;
public final class aa implements ViewTreeObserver.OnPreDrawListener {
    public final int f20821a;
    public final Object f20822b;

    public aa(Object obj, int i10) {
        this.f20821a = i10;
        this.f20822b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z4;
        int i10 = this.f20821a;
        Object obj = this.f20822b;
        switch (i10) {
            case 0:
                ca caVar = ((ba) obj).f20862a;
                caVar.getViewTreeObserver().removeOnPreDrawListener(this);
                caVar.getTransitionParams().j();
                caVar.getTransitionParams().f();
                caVar.getTransitionParams().f21773g = true;
                caVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.u5(this, 12));
                ofFloat.start();
                return false;
            case 1:
                ((hu) obj).f25496a.f27652c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                b30 b30Var = (b30) obj;
                f30 f30Var = b30Var.f23535f;
                org.telegram.ui.y7 y7Var = b30Var.e;
                y7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = b30Var.D;
                y7Var.getLocationOnScreen(iArr);
                float f10 = b30Var.f23537r.x + b30Var.N;
                h30 h30Var = b30Var.R;
                float measuredWidth = ((h30Var.getMeasuredWidth() / 2.0f) + f10) - iArr[0];
                float measuredWidth2 = ((h30Var.getMeasuredWidth() / 2.0f) + (b30Var.f23537r.y + b30Var.O)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < y7Var.getMeasuredHeight()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + f30Var.getMeasuredWidth() < y7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z4) {
                    f30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / f30Var.getMeasuredHeight();
                    f30Var.setTranslationY((int) (measuredWidth2 - (f30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / y7Var.getMeasuredHeight(), 1.0f - dp)))));
                    f30Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - f30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z4) {
                    float dp2 = AndroidUtilities.dp(40.0f) / f30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / y7Var.getMeasuredHeight(), 1.0f - dp2));
                    f30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - f30Var.getMeasuredWidth()));
                    f30Var.setTranslationY((int) (measuredWidth2 - (f30Var.getMeasuredHeight() * max)));
                    f30Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > y7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / f30Var.getMeasuredWidth();
                    f30Var.setTranslationX((int) (measuredWidth - (f30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / y7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    f30Var.setTranslationY((int) ((measuredWidth2 - f30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    f30Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / f30Var.getMeasuredWidth();
                    f30Var.setTranslationX((int) (measuredWidth - (f30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / y7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    f30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    f30Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((eg.i0) obj).invalidate();
                return true;
            default:
                e91 e91Var = (e91) ((ih.h) obj).f7563b;
                e91Var.f24542n.getViewTreeObserver().removeOnPreDrawListener(this);
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
                e91Var.f24543r = 0;
                return true;
        }
    }
}
