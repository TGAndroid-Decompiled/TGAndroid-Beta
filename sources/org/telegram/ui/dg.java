package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class dg implements ValueAnimator.AnimatorUpdateListener {
    public final int f36367a;
    public final float f36368b;
    public final Object f36369c;

    public dg(Object obj, float f7, int i10) {
        this.f36367a = i10;
        this.f36369c = obj;
        this.f36368b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f36367a) {
            case 0:
                qn qnVar = (qn) this.f36369c;
                qnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.H8 = floatValue;
                qnVar.L8 = floatValue / this.f36368b;
                View view = qnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f36369c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f36368b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.fo) this.f36369c).E.setTranslationY(AndroidUtilities.lerp(this.f36368b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((fv0) this.f36369c).R.setTranslationY(AndroidUtilities.lerp(this.f36368b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                k11 k11Var = (k11) this.f36369c;
                k11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f36368b, floatValue3);
                k11Var.f38392a.setTranslationX(lerp);
                k11Var.f38393b.setTranslationX(lerp);
                ImageView imageView = k11Var.f38394c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.xp xpVar = k11Var.f38395f;
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
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) this.f36369c;
                n3Var.getClass();
                n3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f36368b) % 360.0f;
                n3Var.f34559a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.f36369c;
                i8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.f34343c = i8Var.c();
                i8Var.d = this.f36368b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i8Var.f34347s = z10;
                return;
        }
    }
}
