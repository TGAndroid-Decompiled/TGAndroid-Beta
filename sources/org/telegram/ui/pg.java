package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class pg implements ValueAnimator.AnimatorUpdateListener {
    public final int f36621a;
    public final float f36622b;
    public final Object f36623c;

    public pg(Object obj, float f7, int i10) {
        this.f36621a = i10;
        this.f36623c = obj;
        this.f36622b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f36621a) {
            case 0:
                bo boVar = (bo) this.f36623c;
                boVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.H8 = floatValue;
                boVar.L8 = floatValue / this.f36622b;
                View view = boVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f36623c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f36622b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.un) this.f36623c).E.setTranslationY(AndroidUtilities.lerp(this.f36622b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((cw0) this.f36623c).R.setTranslationY(AndroidUtilities.lerp(this.f36622b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                h21 h21Var = (h21) this.f36623c;
                h21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f36622b, floatValue3);
                h21Var.f34110a.setTranslationX(lerp);
                h21Var.f34111b.setTranslationX(lerp);
                ImageView imageView = h21Var.f34112c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.np npVar = h21Var.f34113f;
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
