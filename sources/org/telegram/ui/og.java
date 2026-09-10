package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class og implements ValueAnimator.AnimatorUpdateListener {
    public final int f35487a;
    public final float f35488b;
    public final Object f35489c;

    public og(Object obj, float f7, int i10) {
        this.f35487a = i10;
        this.f35489c = obj;
        this.f35488b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f35487a) {
            case 0:
                eo eoVar = (eo) this.f35489c;
                eoVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar.H8 = floatValue;
                eoVar.L8 = floatValue / this.f35488b;
                View view = eoVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f35489c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f35488b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.zn) this.f35489c).E.setTranslationY(AndroidUtilities.lerp(this.f35488b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((bw0) this.f35489c).R.setTranslationY(AndroidUtilities.lerp(this.f35488b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                m21 m21Var = (m21) this.f35489c;
                m21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f35488b, floatValue3);
                m21Var.f34825a.setTranslationX(lerp);
                m21Var.f34826b.setTranslationX(lerp);
                ImageView imageView = m21Var.f34827c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.tp tpVar = m21Var.f34828f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                tpVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                tpVar.setScaleX(f7);
                tpVar.setScaleY(f7);
                tpVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
        }
    }
}
