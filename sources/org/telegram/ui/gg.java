package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class gg implements ValueAnimator.AnimatorUpdateListener {
    public final int f37187a;
    public final float f37188b;
    public final Object f37189c;

    public gg(Object obj, float f10, int i10) {
        this.f37187a = i10;
        this.f37189c = obj;
        this.f37188b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f37187a) {
            case 0:
                xn xnVar = (xn) this.f37189c;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.E8 = floatValue;
                xnVar.I8 = floatValue / this.f37188b;
                View view = xnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f37189c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f37188b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.sn) this.f37189c).B.setTranslationY(AndroidUtilities.lerp(this.f37188b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((hv0) this.f37189c).O.setTranslationY(AndroidUtilities.lerp(this.f37188b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                r11 r11Var = (r11) this.f37189c;
                r11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f37188b, floatValue3);
                r11Var.f40745a.setTranslationX(lerp);
                r11Var.f40746b.setTranslationX(lerp);
                ImageView imageView = r11Var.f40747c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.np npVar = r11Var.f40749f;
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
