package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class fg implements ValueAnimator.AnimatorUpdateListener {
    public final int f37329a;
    public final float f37330b;
    public final Object f37331c;

    public fg(Object obj, float f7, int i10) {
        this.f37329a = i10;
        this.f37331c = obj;
        this.f37330b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f37329a) {
            case 0:
                sn snVar = (sn) this.f37331c;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.T8 = floatValue;
                snVar.X8 = floatValue / this.f37330b;
                View view = snVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f37331c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f37330b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.co) this.f37331c).E.setTranslationY(AndroidUtilities.lerp(this.f37330b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((hv0) this.f37331c).R.setTranslationY(AndroidUtilities.lerp(this.f37330b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                n11 n11Var = (n11) this.f37331c;
                n11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f37330b, floatValue3);
                n11Var.f39690a.setTranslationX(lerp);
                n11Var.f39691b.setTranslationX(lerp);
                ImageView imageView = n11Var.f39692c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.vp vpVar = n11Var.f39693f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                vpVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                vpVar.setScaleX(f7);
                vpVar.setScaleY(f7);
                vpVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
            case 5:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.f37331c;
                m3Var.getClass();
                m3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f37330b) % 360.0f;
                m3Var.f34806a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.f37331c;
                j8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j8Var.f34653c = j8Var.c();
                j8Var.d = this.f37330b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j8Var.f34657s = z10;
                return;
        }
    }
}
