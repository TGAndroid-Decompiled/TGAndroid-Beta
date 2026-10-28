package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class eg implements ValueAnimator.AnimatorUpdateListener {
    public final int f38860a;
    public final float f38861b;
    public final Object f38862c;

    public eg(Object obj, float f7, int i10) {
        this.f38860a = i10;
        this.f38862c = obj;
        this.f38861b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f38860a) {
            case 0:
                wn wnVar = (wn) this.f38862c;
                wnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.X8 = floatValue;
                wnVar.f45067b9 = floatValue / this.f38861b;
                View view = wnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f38862c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f38861b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.go) this.f38862c).E.setTranslationY(AndroidUtilities.lerp(this.f38861b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((ov0) this.f38862c).R.setTranslationY(AndroidUtilities.lerp(this.f38861b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                u11 u11Var = (u11) this.f38862c;
                u11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f38861b, floatValue3);
                u11Var.f43829a.setTranslationX(lerp);
                u11Var.f43830b.setTranslationX(lerp);
                ImageView imageView = u11Var.f43831c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.aq aqVar = u11Var.f43832f;
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
            case 5:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.f38862c;
                m3Var.getClass();
                m3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f38861b) % 360.0f;
                m3Var.f36892a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.f38862c;
                i8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.f36710c = i8Var.c();
                i8Var.d = this.f38861b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i8Var.f36714s = z10;
                return;
        }
    }
}
