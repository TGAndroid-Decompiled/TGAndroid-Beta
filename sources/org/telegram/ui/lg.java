package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lg implements ValueAnimator.AnimatorUpdateListener {
    public final int f39569a;
    public final float f39570b;
    public final Object f39571c;

    public lg(Object obj, float f7, int i10) {
        this.f39569a = i10;
        this.f39571c = obj;
        this.f39570b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f39569a) {
            case 0:
                zn znVar = (zn) this.f39571c;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.H8 = floatValue;
                znVar.L8 = floatValue / this.f39570b;
                View view = znVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f39571c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f39570b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.lo) this.f39571c).E.setTranslationY(AndroidUtilities.lerp(this.f39570b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((aw0) this.f39571c).R.setTranslationY(AndroidUtilities.lerp(this.f39570b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                f21 f21Var = (f21) this.f39571c;
                f21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f39570b, floatValue3);
                f21Var.f37428a.setTranslationX(lerp);
                f21Var.f37429b.setTranslationX(lerp);
                ImageView imageView = f21Var.f37430c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.dq dqVar = f21Var.f37432f;
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
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) this.f39571c;
                d3Var.getClass();
                d3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f39570b) % 360.0f;
                d3Var.f34773a.invalidate();
                return;
        }
    }
}
