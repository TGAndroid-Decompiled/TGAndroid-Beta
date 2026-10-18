package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class fg implements ValueAnimator.AnimatorUpdateListener {
    public final int f36922a;
    public final float f36923b;
    public final Object f36924c;

    public fg(Object obj, float f7, int i10) {
        this.f36922a = i10;
        this.f36924c = obj;
        this.f36923b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f36922a) {
            case 0:
                sn snVar = (sn) this.f36924c;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.H8 = floatValue;
                snVar.L8 = floatValue / this.f36923b;
                View view = snVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f36924c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f36923b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.fo) this.f36924c).E.setTranslationY(AndroidUtilities.lerp(this.f36923b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((hv0) this.f36924c).R.setTranslationY(AndroidUtilities.lerp(this.f36923b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                m11 m11Var = (m11) this.f36924c;
                m11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f36923b, floatValue3);
                m11Var.f39009a.setTranslationX(lerp);
                m11Var.f39010b.setTranslationX(lerp);
                ImageView imageView = m11Var.f39011c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.xp xpVar = m11Var.f39012f;
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
                org.telegram.ui.Wallet.l3 l3Var = (org.telegram.ui.Wallet.l3) this.f36924c;
                l3Var.getClass();
                l3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f36923b) % 360.0f;
                l3Var.f34446a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.o8 o8Var = (org.telegram.ui.Wallet.o8) this.f36924c;
                o8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.f34683c = o8Var.c();
                o8Var.d = this.f36923b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o8Var.f34687s = z10;
                return;
        }
    }
}
