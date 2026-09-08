package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ng implements ValueAnimator.AnimatorUpdateListener {
    public final int f38975a;
    public final float f38976b;
    public final Object f38977c;

    public ng(Object obj, float f7, int i10) {
        this.f38975a = i10;
        this.f38977c = obj;
        this.f38976b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f38975a) {
            case 0:
                co coVar = (co) this.f38977c;
                coVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.H8 = floatValue;
                coVar.L8 = floatValue / this.f38976b;
                View view = coVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f38977c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f38976b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.tn) this.f38977c).E.setTranslationY(AndroidUtilities.lerp(this.f38976b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((zv0) this.f38977c).R.setTranslationY(AndroidUtilities.lerp(this.f38976b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                i21 i21Var = (i21) this.f38977c;
                i21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f38976b, floatValue3);
                i21Var.f37198a.setTranslationX(lerp);
                i21Var.f37199b.setTranslationX(lerp);
                ImageView imageView = i21Var.f37200c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.mp mpVar = i21Var.f37202f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                mpVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                mpVar.setScaleX(f7);
                mpVar.setScaleY(f7);
                mpVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
        }
    }
}
