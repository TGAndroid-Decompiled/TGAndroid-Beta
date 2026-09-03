package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class gg implements ValueAnimator.AnimatorUpdateListener {
    public final int f37095a;
    public final float f37096b;
    public final Object f37097c;

    public gg(Object obj, float f10, int i10) {
        this.f37095a = i10;
        this.f37097c = obj;
        this.f37096b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f37095a) {
            case 0:
                xn xnVar = (xn) this.f37097c;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.E8 = floatValue;
                xnVar.I8 = floatValue / this.f37096b;
                View view = xnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f37097c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f37096b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.rn) this.f37097c).B.setTranslationY(AndroidUtilities.lerp(this.f37096b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((mv0) this.f37097c).O.setTranslationY(AndroidUtilities.lerp(this.f37096b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                v11 v11Var = (v11) this.f37097c;
                v11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f37096b, floatValue3);
                v11Var.f41988a.setTranslationX(lerp);
                v11Var.f41989b.setTranslationX(lerp);
                ImageView imageView = v11Var.f41990c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.np npVar = v11Var.f41992f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                npVar.setTranslationX(i10 + lerp);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                npVar.setScaleX(f10);
                npVar.setScaleY(f10);
                npVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                return;
        }
    }
}
