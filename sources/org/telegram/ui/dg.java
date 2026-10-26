package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class dg implements ValueAnimator.AnimatorUpdateListener {
    public final int f38859a;
    public final float f38860b;
    public final Object f38861c;

    public dg(Object obj, float f7, int i10) {
        this.f38859a = i10;
        this.f38861c = obj;
        this.f38860b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f38859a) {
            case 0:
                un unVar = (un) this.f38861c;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.T8 = floatValue;
                unVar.X8 = floatValue / this.f38860b;
                View view = unVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f38861c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f38860b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.go) this.f38861c).E.setTranslationY(AndroidUtilities.lerp(this.f38860b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((mv0) this.f38861c).R.setTranslationY(AndroidUtilities.lerp(this.f38860b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                s11 s11Var = (s11) this.f38861c;
                s11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f38860b, floatValue3);
                s11Var.f43338a.setTranslationX(lerp);
                s11Var.f43339b.setTranslationX(lerp);
                ImageView imageView = s11Var.f43340c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.zp zpVar = s11Var.f43341f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                zpVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                zpVar.setScaleX(f7);
                zpVar.setScaleY(f7);
                zpVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
            case 5:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.f38861c;
                m3Var.getClass();
                m3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f38860b) % 360.0f;
                m3Var.f36887a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.f38861c;
                i8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.f36685c = i8Var.c();
                i8Var.d = this.f38860b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i8Var.f36689s = z10;
                return;
        }
    }
}
