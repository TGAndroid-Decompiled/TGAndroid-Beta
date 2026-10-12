package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class qg implements ValueAnimator.AnimatorUpdateListener {
    public final int f39438a;
    public final float f39439b;
    public final Object f39440c;

    public qg(Object obj, float f7, int i10) {
        this.f39438a = i10;
        this.f39440c = obj;
        this.f39439b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f39438a) {
            case 0:
                fo foVar = (fo) this.f39440c;
                foVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar.H8 = floatValue;
                foVar.L8 = floatValue / this.f39439b;
                View view = foVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f39440c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f39439b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.io) this.f39440c).E.setTranslationY(AndroidUtilities.lerp(this.f39439b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((gw0) this.f39440c).R.setTranslationY(AndroidUtilities.lerp(this.f39439b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                n21 n21Var = (n21) this.f39440c;
                n21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f39439b, floatValue3);
                n21Var.f38406a.setTranslationX(lerp);
                n21Var.f38407b.setTranslationX(lerp);
                ImageView imageView = n21Var.f38408c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.aq aqVar = n21Var.f38409f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                aqVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                aqVar.setScaleX(f7);
                aqVar.setScaleY(f7);
                aqVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
            default:
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) this.f39440c;
                d3Var.getClass();
                d3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f39439b) % 360.0f;
                d3Var.f33045a.invalidate();
                return;
        }
    }
}
