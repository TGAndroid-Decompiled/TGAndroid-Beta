package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lg implements ValueAnimator.AnimatorUpdateListener {
    public final int f35455a;
    public final float f35456b;
    public final Object f35457c;

    public lg(Object obj, float f7, int i10) {
        this.f35455a = i10;
        this.f35457c = obj;
        this.f35456b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f35455a) {
            case 0:
                zn znVar = (zn) this.f35457c;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.H8 = floatValue;
                znVar.L8 = floatValue / this.f35456b;
                View view = znVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f35457c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f35456b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.un) this.f35457c).E.setTranslationY(AndroidUtilities.lerp(this.f35456b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((aw0) this.f35457c).R.setTranslationY(AndroidUtilities.lerp(this.f35456b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                f21 f21Var = (f21) this.f35457c;
                f21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f35456b, floatValue3);
                f21Var.f33479a.setTranslationX(lerp);
                f21Var.f33480b.setTranslationX(lerp);
                ImageView imageView = f21Var.f33481c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.np npVar = f21Var.f33482f;
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
