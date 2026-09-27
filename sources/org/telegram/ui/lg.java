package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lg implements ValueAnimator.AnimatorUpdateListener {
    public final int f35343a;
    public final float f35344b;
    public final Object f35345c;

    public lg(Object obj, float f7, int i10) {
        this.f35343a = i10;
        this.f35345c = obj;
        this.f35344b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f35343a) {
            case 0:
                xn xnVar = (xn) this.f35345c;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.H8 = floatValue;
                xnVar.L8 = floatValue / this.f35344b;
                View view = xnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f35345c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f35344b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.wn) this.f35345c).E.setTranslationY(AndroidUtilities.lerp(this.f35344b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((uv0) this.f35345c).R.setTranslationY(AndroidUtilities.lerp(this.f35344b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                y11 y11Var = (y11) this.f35345c;
                y11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f35344b, floatValue3);
                y11Var.f40092a.setTranslationX(lerp);
                y11Var.f40093b.setTranslationX(lerp);
                ImageView imageView = y11Var.f40094c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.pp ppVar = y11Var.f40095f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                ppVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                ppVar.setScaleX(f7);
                ppVar.setScaleY(f7);
                ppVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
        }
    }
}
