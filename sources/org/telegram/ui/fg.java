package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class fg implements ValueAnimator.AnimatorUpdateListener {
    public final int f37327a;
    public final float f37328b;
    public final Object f37329c;

    public fg(Object obj, float f7, int i10) {
        this.f37327a = i10;
        this.f37329c = obj;
        this.f37328b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f37327a) {
            case 0:
                sn snVar = (sn) this.f37329c;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.T8 = floatValue;
                snVar.X8 = floatValue / this.f37328b;
                View view = snVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f37329c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f37328b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.fo) this.f37329c).E.setTranslationY(AndroidUtilities.lerp(this.f37328b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((iv0) this.f37329c).R.setTranslationY(AndroidUtilities.lerp(this.f37328b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                o11 o11Var = (o11) this.f37329c;
                o11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f37328b, floatValue3);
                o11Var.f40043a.setTranslationX(lerp);
                o11Var.f40044b.setTranslationX(lerp);
                ImageView imageView = o11Var.f40045c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.xp xpVar = o11Var.f40046f;
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
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.f37329c;
                m3Var.getClass();
                m3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f37328b) % 360.0f;
                m3Var.f34804a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.f37329c;
                j8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j8Var.f34651c = j8Var.c();
                j8Var.d = this.f37328b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j8Var.f34655s = z10;
                return;
        }
    }
}
