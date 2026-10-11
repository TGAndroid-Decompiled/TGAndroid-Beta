package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lg implements ValueAnimator.AnimatorUpdateListener {
    public final int f39691a;
    public final float f39692b;
    public final Object f39693c;

    public lg(Object obj, float f7, int i10) {
        this.f39691a = i10;
        this.f39693c = obj;
        this.f39692b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f39691a) {
            case 0:
                zn znVar = (zn) this.f39693c;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.H8 = floatValue;
                znVar.L8 = floatValue / this.f39692b;
                View view = znVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f39693c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f39692b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.lo) this.f39693c).E.setTranslationY(AndroidUtilities.lerp(this.f39692b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((zv0) this.f39693c).R.setTranslationY(AndroidUtilities.lerp(this.f39692b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                e21 e21Var = (e21) this.f39693c;
                e21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f39692b, floatValue3);
                e21Var.f37219a.setTranslationX(lerp);
                e21Var.f37220b.setTranslationX(lerp);
                ImageView imageView = e21Var.f37221c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.dq dqVar = e21Var.f37223f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                dqVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                dqVar.setScaleX(f7);
                dqVar.setScaleY(f7);
                dqVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) this.f39693c;
                f3Var.getClass();
                f3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f39692b) % 360.0f;
                f3Var.f34930a.invalidate();
                return;
        }
    }
}
