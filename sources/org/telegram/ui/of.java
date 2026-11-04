package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class of implements ValueAnimator.AnimatorUpdateListener {
    public final int f48279a;
    public final float f48280b;
    public final Object f48281c;

    public of(Object obj, float f10, int i3) {
        this.f48279a = i3;
        this.f48281c = obj;
        this.f48280b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3;
        boolean z10;
        switch (this.f48279a) {
            case 0:
                wm wmVar = (wm) this.f48281c;
                wmVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar.W8 = floatValue;
                wmVar.f51246a9 = floatValue / this.f48280b;
                View view = wmVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f48281c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.f48280b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.an) this.f48281c).F.setTranslationY(org.telegram.messenger.g0.T1(this.f48280b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((fr0) this.f48281c).S.setTranslationY(org.telegram.messenger.g0.T1(this.f48280b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                fx0 fx0Var = (fx0) this.f48281c;
                fx0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.f48280b, floatValue3);
                fx0Var.f45396a.setTranslationX(T1);
                fx0Var.f45397b.setTranslationX(T1);
                ImageView imageView = fx0Var.f45398c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.wo woVar = fx0Var.f45400f;
                if (org.telegram.messenger.bd.f21784a0) {
                    i3 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i3 = -org.telegram.messenger.g0.L(32.0f);
                }
                woVar.setTranslationX(i3 + T1);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                woVar.setScaleX(f10);
                woVar.setScaleY(f10);
                woVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                return;
            case 5:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) this.f48281c;
                b4Var.getClass();
                b4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f48280b) % 360.0f;
                b4Var.f42232a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.o8 o8Var = (org.telegram.ui.Wallet.o8) this.f48281c;
                o8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.f43016c = o8Var.c();
                o8Var.d = this.f48280b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o8Var.f43021s = z10;
                return;
        }
    }
}
