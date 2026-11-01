package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class eg implements ValueAnimator.AnimatorUpdateListener {
    public final int f36821a;
    public final float f36822b;
    public final Object f36823c;

    public eg(Object obj, float f7, int i10) {
        this.f36821a = i10;
        this.f36823c = obj;
        this.f36822b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f36821a) {
            case 0:
                un unVar = (un) this.f36823c;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.V8 = floatValue;
                unVar.Z8 = floatValue / this.f36822b;
                View view = unVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f36823c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f36822b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.jn) this.f36823c).E.setTranslationY(org.telegram.messenger.i0.T1(this.f36822b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((zs0) this.f36823c).R.setTranslationY(org.telegram.messenger.i0.T1(this.f36822b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                bz0 bz0Var = (bz0) this.f36823c;
                bz0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.i0.T1(0.0f, this.f36822b, floatValue3);
                bz0Var.f36135a.setTranslationX(T1);
                bz0Var.f36136b.setTranslationX(T1);
                ImageView imageView = bz0Var.f36137c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.ep epVar = bz0Var.f36138f;
                if (org.telegram.messenger.dd.X) {
                    i10 = org.telegram.messenger.i0.L(32.0f);
                } else {
                    i10 = -org.telegram.messenger.i0.L(32.0f);
                }
                epVar.setTranslationX(i10 + T1);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                epVar.setScaleX(f7);
                epVar.setScaleY(f7);
                epVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
            case 5:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.f36823c;
                d4Var.getClass();
                d4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f36822b) % 360.0f;
                d4Var.f34382a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) this.f36823c;
                u8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u8Var.f35289c = u8Var.c();
                u8Var.d = this.f36822b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u8Var.f35293s = z10;
                return;
        }
    }
}
