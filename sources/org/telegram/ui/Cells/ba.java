package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.ku;
public final class ba implements ViewTreeObserver.OnPreDrawListener {
    public final int f22620a;
    public final Object f22621b;

    public ba(Object obj, int i10) {
        this.f22620a = i10;
        this.f22621b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z4;
        int i10 = this.f22620a;
        Object obj = this.f22621b;
        switch (i10) {
            case 0:
                da daVar = ((ca) obj).f22667a;
                daVar.getViewTreeObserver().removeOnPreDrawListener(this);
                daVar.getTransitionParams().j();
                daVar.getTransitionParams().f();
                daVar.getTransitionParams().f23638g = true;
                daVar.getTransitionParams().K1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r(this, 8));
                ofFloat.addListener(new org.telegram.ui.s5(this, 12));
                ofFloat.start();
                return false;
            case 1:
                ((ku) obj).f28451a.f30856c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            case 2:
                c30 c30Var = (c30) obj;
                g30 g30Var = c30Var.f25775f;
                org.telegram.ui.w7 w7Var = c30Var.f25774e;
                w7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = c30Var.D;
                w7Var.getLocationOnScreen(iArr);
                float f10 = c30Var.f25777r.x + c30Var.N;
                i30 i30Var = c30Var.R;
                float measuredWidth = ((i30Var.getMeasuredWidth() / 2.0f) + f10) - iArr[0];
                float measuredWidth2 = ((i30Var.getMeasuredWidth() / 2.0f) + (c30Var.f25777r.y + c30Var.O)) - iArr[1];
                if (measuredWidth2 - AndroidUtilities.dp(61.0f) > 0.0f && AndroidUtilities.dp(61.0f) + measuredWidth2 < w7Var.getMeasuredHeight()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (AndroidUtilities.dp(61.0f) + measuredWidth + g30Var.getMeasuredWidth() < w7Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z4) {
                    g30Var.setTranslationX(AndroidUtilities.dp(61.0f) + measuredWidth);
                    float dp = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredHeight();
                    g30Var.setTranslationY((int) (measuredWidth2 - (g30Var.getMeasuredHeight() * Math.max(dp, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - dp)))));
                    g30Var.c(measuredWidth, measuredWidth2, 0);
                } else if ((measuredWidth - AndroidUtilities.dp(61.0f)) - g30Var.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z4) {
                    float dp2 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredHeight();
                    float max = Math.max(dp2, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - dp2));
                    g30Var.setTranslationX((int) ((measuredWidth - AndroidUtilities.dp(61.0f)) - g30Var.getMeasuredWidth()));
                    g30Var.setTranslationY((int) (measuredWidth2 - (g30Var.getMeasuredHeight() * max)));
                    g30Var.c(measuredWidth, measuredWidth2, 1);
                } else if (measuredWidth2 > w7Var.getMeasuredHeight() * 0.3f) {
                    float dp3 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredWidth();
                    g30Var.setTranslationX((int) (measuredWidth - (g30Var.getMeasuredWidth() * Math.max(dp3, Math.min(measuredWidth / w7Var.getMeasuredWidth(), 1.0f - dp3)))));
                    g30Var.setTranslationY((int) ((measuredWidth2 - g30Var.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                    g30Var.c(measuredWidth, measuredWidth2, 3);
                } else {
                    float dp4 = AndroidUtilities.dp(40.0f) / g30Var.getMeasuredWidth();
                    g30Var.setTranslationX((int) (measuredWidth - (g30Var.getMeasuredWidth() * Math.max(dp4, Math.min(measuredWidth / w7Var.getMeasuredWidth(), 1.0f - dp4)))));
                    g30Var.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                    g30Var.c(measuredWidth, measuredWidth2, 2);
                }
                return false;
            case 3:
                ((fg.i0) obj).invalidate();
                return true;
            default:
                f91 f91Var = (f91) ((jh.h) obj).f10109b;
                f91Var.f26825n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = f91Var.f26819e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    f91Var.f26819e.setImageDrawable(null);
                    Bitmap bitmap = f91Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        f91Var.h = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new b71(this, 3));
                f91Var.f26826r = 0;
                return true;
        }
    }
}
