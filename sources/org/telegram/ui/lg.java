package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lg implements ValueAnimator.AnimatorUpdateListener {
    public final int f34971a;
    public final float f34972b;
    public final Object f34973c;

    public lg(Object obj, float f7, int i10) {
        this.f34971a = i10;
        this.f34973c = obj;
        this.f34972b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f34971a) {
            case 0:
                xn xnVar = (xn) this.f34973c;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.H8 = floatValue;
                xnVar.L8 = floatValue / this.f34972b;
                View view = xnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f34973c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f34972b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.vn) this.f34973c).E.setTranslationY(AndroidUtilities.lerp(this.f34972b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((tv0) this.f34973c).R.setTranslationY(AndroidUtilities.lerp(this.f34972b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                z11 z11Var = (z11) this.f34973c;
                z11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f34972b, floatValue3);
                z11Var.f39935a.setTranslationX(lerp);
                z11Var.f39936b.setTranslationX(lerp);
                ImageView imageView = z11Var.f39937c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.op opVar = z11Var.f39938f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                opVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                opVar.setScaleX(f7);
                opVar.setScaleY(f7);
                opVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
        }
    }
}
