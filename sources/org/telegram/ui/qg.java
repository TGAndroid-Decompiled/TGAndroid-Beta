package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class qg implements ValueAnimator.AnimatorUpdateListener {
    public final int f39153a;
    public final float f39154b;
    public final Object f39155c;

    public qg(Object obj, float f7, int i10) {
        this.f39153a = i10;
        this.f39155c = obj;
        this.f39154b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f39153a) {
            case 0:
                fo foVar = (fo) this.f39155c;
                foVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar.H8 = floatValue;
                foVar.L8 = floatValue / this.f39154b;
                View view = foVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f39155c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f39154b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.io) this.f39155c).E.setTranslationY(AndroidUtilities.lerp(this.f39154b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((fw0) this.f39155c).R.setTranslationY(AndroidUtilities.lerp(this.f39154b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                n21 n21Var = (n21) this.f39155c;
                n21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f39154b, floatValue3);
                n21Var.f38121a.setTranslationX(lerp);
                n21Var.f38122b.setTranslationX(lerp);
                ImageView imageView = n21Var.f38123c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.aq aqVar = n21Var.f38124f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                aqVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                aqVar.setScaleX(f7);
                aqVar.setScaleY(f7);
                aqVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) this.f39155c;
                e3Var.getClass();
                e3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f39154b) % 360.0f;
                e3Var.f32822a.invalidate();
                return;
        }
    }
}
