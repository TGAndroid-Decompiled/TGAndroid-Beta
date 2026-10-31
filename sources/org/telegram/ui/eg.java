package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class eg implements ValueAnimator.AnimatorUpdateListener {
    public final int f37045a;
    public final float f37046b;
    public final Object f37047c;

    public eg(Object obj, float f7, int i10) {
        this.f37045a = i10;
        this.f37047c = obj;
        this.f37046b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f37045a) {
            case 0:
                un unVar = (un) this.f37047c;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.V8 = floatValue;
                unVar.Z8 = floatValue / this.f37046b;
                View view = unVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f37047c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f37046b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.jn) this.f37047c).E.setTranslationY(org.telegram.messenger.i0.T1(this.f37046b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((at0) this.f37047c).R.setTranslationY(org.telegram.messenger.i0.T1(this.f37046b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                cz0 cz0Var = (cz0) this.f37047c;
                cz0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.i0.T1(0.0f, this.f37046b, floatValue3);
                cz0Var.f36574a.setTranslationX(T1);
                cz0Var.f36575b.setTranslationX(T1);
                ImageView imageView = cz0Var.f36576c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.ep epVar = cz0Var.f36577f;
                if (org.telegram.messenger.cd.X) {
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
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.f37047c;
                d4Var.getClass();
                d4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f37046b) % 360.0f;
                d4Var.f34377a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) this.f37047c;
                u8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u8Var.f35283c = u8Var.c();
                u8Var.d = this.f37046b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u8Var.f35287s = z10;
                return;
        }
    }
}
