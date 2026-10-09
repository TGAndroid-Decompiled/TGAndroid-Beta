package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lg implements ValueAnimator.AnimatorUpdateListener {
    public final int f39567a;
    public final float f39568b;
    public final Object f39569c;

    public lg(Object obj, float f7, int i10) {
        this.f39567a = i10;
        this.f39569c = obj;
        this.f39568b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f39567a) {
            case 0:
                zn znVar = (zn) this.f39569c;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.H8 = floatValue;
                znVar.L8 = floatValue / this.f39568b;
                View view = znVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f39569c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f39568b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.lo) this.f39569c).E.setTranslationY(AndroidUtilities.lerp(this.f39568b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((aw0) this.f39569c).R.setTranslationY(AndroidUtilities.lerp(this.f39568b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                f21 f21Var = (f21) this.f39569c;
                f21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f39568b, floatValue3);
                f21Var.f37426a.setTranslationX(lerp);
                f21Var.f37427b.setTranslationX(lerp);
                ImageView imageView = f21Var.f37428c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.dq dqVar = f21Var.f37430f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                dqVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                dqVar.setScaleX(f7);
                dqVar.setScaleY(f7);
                dqVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
            default:
                org.telegram.ui.Wallet.c3 c3Var = (org.telegram.ui.Wallet.c3) this.f39569c;
                c3Var.getClass();
                c3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f39568b) % 360.0f;
                c3Var.f34708a.invalidate();
                return;
        }
    }
}
