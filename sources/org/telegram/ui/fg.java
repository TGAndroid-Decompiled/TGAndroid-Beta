package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class fg implements ValueAnimator.AnimatorUpdateListener {
    public final int f36906a;
    public final float f36907b;
    public final Object f36908c;

    public fg(Object obj, float f7, int i10) {
        this.f36906a = i10;
        this.f36908c = obj;
        this.f36907b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f36906a) {
            case 0:
                sn snVar = (sn) this.f36908c;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.H8 = floatValue;
                snVar.L8 = floatValue / this.f36907b;
                View view = snVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f36908c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f36907b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.fo) this.f36908c).E.setTranslationY(AndroidUtilities.lerp(this.f36907b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((hv0) this.f36908c).R.setTranslationY(AndroidUtilities.lerp(this.f36907b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                m11 m11Var = (m11) this.f36908c;
                m11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f36907b, floatValue3);
                m11Var.f38965a.setTranslationX(lerp);
                m11Var.f38966b.setTranslationX(lerp);
                ImageView imageView = m11Var.f38967c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.xp xpVar = m11Var.f38968f;
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
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.f36908c;
                m3Var.getClass();
                m3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f36907b) % 360.0f;
                m3Var.f34482a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.f36908c;
                i8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.f34311c = i8Var.c();
                i8Var.d = this.f36907b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i8Var.f34315s = z10;
                return;
        }
    }
}
