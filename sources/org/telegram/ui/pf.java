package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class pf implements ValueAnimator.AnimatorUpdateListener {
    public final int f50252a;
    public final float f50253b;
    public final Object f50254c;

    public pf(Object obj, float f10, int i7) {
        this.f50252a = i7;
        this.f50254c = obj;
        this.f50253b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        boolean z10;
        switch (this.f50252a) {
            case 0:
                an anVar = (an) this.f50254c;
                anVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.W8 = floatValue;
                anVar.f45126a9 = floatValue / this.f50253b;
                View view = anVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f50254c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.f50253b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.jn) this.f50254c).F.setTranslationY(org.telegram.messenger.g0.T1(this.f50253b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((nr0) this.f50254c).S.setTranslationY(org.telegram.messenger.g0.T1(this.f50253b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                mx0 mx0Var = (mx0) this.f50254c;
                mx0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.f50253b, floatValue3);
                mx0Var.f49329a.setTranslationX(T1);
                mx0Var.f49330b.setTranslationX(T1);
                ImageView imageView = mx0Var.f49331c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.fp fpVar = mx0Var.f49333f;
                if (org.telegram.messenger.hd.f24104a0) {
                    i7 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i7 = -org.telegram.messenger.g0.L(32.0f);
                }
                fpVar.setTranslationX(i7 + T1);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                fpVar.setScaleX(f10);
                fpVar.setScaleY(f10);
                fpVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                return;
            case 5:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) this.f50254c;
                c4Var.getClass();
                c4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f50253b) % 360.0f;
                c4Var.f43571a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.q8 q8Var = (org.telegram.ui.Wallet.q8) this.f50254c;
                q8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.f44397c = q8Var.c();
                q8Var.d = this.f50253b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q8Var.f44402s = z10;
                return;
        }
    }
}
