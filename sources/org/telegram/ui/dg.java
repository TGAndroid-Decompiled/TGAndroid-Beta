package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class dg implements ValueAnimator.AnimatorUpdateListener {

    public final int f37394a;

    public final float f37395b;

    public final Object f37396c;

    public dg(Object obj, float f10, int i10) {
        this.f37394a = i10;
        this.f37396c = obj;
        this.f37395b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37394a) {
            case 0:
                rn rnVar = (rn) this.f37396c;
                rnVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar.D8 = fFloatValue;
                rnVar.H8 = fFloatValue / this.f37395b;
                View view = rnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f37396c;
                float fFloatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.f37395b * fFloatValue2);
                    }
                }
                break;
            case 2:
                ((org.telegram.ui.Components.in) this.f37396c).A.setTranslationY(AndroidUtilities.lerp(this.f37395b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ((yu0) this.f37396c).N.setTranslationY(AndroidUtilities.lerp(this.f37395b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            default:
                d11 d11Var = (d11) this.f37396c;
                d11Var.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fLerp = AndroidUtilities.lerp(0.0f, this.f37395b, fFloatValue3);
                d11Var.f37232a.setTranslationX(fLerp);
                d11Var.f37233b.setTranslationX(fLerp);
                ImageView imageView = d11Var.f37234c;
                imageView.setTranslationX(fLerp);
                org.telegram.ui.Components.bp bpVar = d11Var.f37236f;
                bpVar.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : -AndroidUtilities.dp(32.0f)) + fLerp);
                float f10 = (fFloatValue3 * 0.5f) + 0.5f;
                bpVar.setScaleX(f10);
                bpVar.setScaleY(f10);
                bpVar.setAlpha(fFloatValue3);
                float f11 = 1.0f - fFloatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                break;
        }
    }
}
