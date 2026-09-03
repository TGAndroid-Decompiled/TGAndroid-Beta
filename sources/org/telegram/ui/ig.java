package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ig implements ValueAnimator.AnimatorUpdateListener {
    public final int f34924a;
    public final float f34925b;
    public final Object f34926c;

    public ig(Object obj, float f10, int i10) {
        this.f34924a = i10;
        this.f34926c = obj;
        this.f34925b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f34924a) {
            case 0:
                zn znVar = (zn) this.f34926c;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.E8 = floatValue;
                znVar.I8 = floatValue / this.f34925b;
                View view = znVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f34926c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f34925b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.pn) this.f34926c).B.setTranslationY(AndroidUtilities.lerp(this.f34925b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((mv0) this.f34926c).O.setTranslationY(AndroidUtilities.lerp(this.f34925b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                v11 v11Var = (v11) this.f34926c;
                v11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f34925b, floatValue3);
                v11Var.f38952a.setTranslationX(lerp);
                v11Var.f38953b.setTranslationX(lerp);
                ImageView imageView = v11Var.f38954c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.kp kpVar = v11Var.f38955f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                kpVar.setTranslationX(i10 + lerp);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                kpVar.setScaleX(f10);
                kpVar.setScaleY(f10);
                kpVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                return;
        }
    }
}
