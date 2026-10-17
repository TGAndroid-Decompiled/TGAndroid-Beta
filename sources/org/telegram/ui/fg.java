package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class fg implements ValueAnimator.AnimatorUpdateListener {
    public final int f36899a;
    public final float f36900b;
    public final Object f36901c;

    public fg(Object obj, float f7, int i10) {
        this.f36899a = i10;
        this.f36901c = obj;
        this.f36900b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f36899a) {
            case 0:
                sn snVar = (sn) this.f36901c;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.H8 = floatValue;
                snVar.L8 = floatValue / this.f36900b;
                View view = snVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f36901c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f36900b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.fo) this.f36901c).E.setTranslationY(AndroidUtilities.lerp(this.f36900b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((hv0) this.f36901c).R.setTranslationY(AndroidUtilities.lerp(this.f36900b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                m11 m11Var = (m11) this.f36901c;
                m11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f36900b, floatValue3);
                m11Var.f38984a.setTranslationX(lerp);
                m11Var.f38985b.setTranslationX(lerp);
                ImageView imageView = m11Var.f38986c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.xp xpVar = m11Var.f38987f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                xpVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                xpVar.setScaleX(f7);
                xpVar.setScaleY(f7);
                xpVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
            case 5:
                org.telegram.ui.Wallet.k3 k3Var = (org.telegram.ui.Wallet.k3) this.f36901c;
                k3Var.getClass();
                k3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f36900b) % 360.0f;
                k3Var.f34385a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.l8 l8Var = (org.telegram.ui.Wallet.l8) this.f36901c;
                l8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.f34518c = l8Var.c();
                l8Var.d = this.f36900b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l8Var.f34522s = z10;
                return;
        }
    }
}
