package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class gg implements ValueAnimator.AnimatorUpdateListener {
    public final int f34611a;
    public final float f34612b;
    public final Object f34613c;

    public gg(Object obj, float f10, int i10) {
        this.f34611a = i10;
        this.f34613c = obj;
        this.f34612b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f34611a) {
            case 0:
                xn xnVar = (xn) this.f34613c;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.E8 = floatValue;
                xnVar.I8 = floatValue / this.f34612b;
                View view = xnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f34613c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f34612b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.qn) this.f34613c).B.setTranslationY(AndroidUtilities.lerp(this.f34612b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((fv0) this.f34613c).O.setTranslationY(AndroidUtilities.lerp(this.f34612b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                o11 o11Var = (o11) this.f34613c;
                o11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f34612b, floatValue3);
                o11Var.f36766a.setTranslationX(lerp);
                o11Var.f36767b.setTranslationX(lerp);
                ImageView imageView = o11Var.f36768c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.lp lpVar = o11Var.f36769f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                lpVar.setTranslationX(i10 + lerp);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                lpVar.setScaleX(f10);
                lpVar.setScaleY(f10);
                lpVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                return;
        }
    }
}
