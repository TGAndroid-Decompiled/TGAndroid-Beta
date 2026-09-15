package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ng implements ValueAnimator.AnimatorUpdateListener {
    public final int f35972a;
    public final float f35973b;
    public final Object f35974c;

    public ng(Object obj, float f7, int i10) {
        this.f35972a = i10;
        this.f35974c = obj;
        this.f35973b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f35972a) {
            case 0:
                bo boVar = (bo) this.f35974c;
                boVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.H8 = floatValue;
                boVar.L8 = floatValue / this.f35973b;
                View view = boVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f35974c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f35973b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.un) this.f35974c).E.setTranslationY(AndroidUtilities.lerp(this.f35973b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((aw0) this.f35974c).R.setTranslationY(AndroidUtilities.lerp(this.f35973b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                g21 g21Var = (g21) this.f35974c;
                g21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f35973b, floatValue3);
                g21Var.f33737a.setTranslationX(lerp);
                g21Var.f33738b.setTranslationX(lerp);
                ImageView imageView = g21Var.f33739c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.np npVar = g21Var.f33740f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                npVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                npVar.setScaleX(f7);
                npVar.setScaleY(f7);
                npVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
        }
    }
}
