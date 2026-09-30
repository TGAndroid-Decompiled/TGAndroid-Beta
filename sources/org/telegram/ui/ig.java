package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ig implements ValueAnimator.AnimatorUpdateListener {
    public final int f34608a;
    public final float f34609b;
    public final Object f34610c;

    public ig(Object obj, float f7, int i10) {
        this.f34608a = i10;
        this.f34610c = obj;
        this.f34609b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f34608a) {
            case 0:
                wn wnVar = (wn) this.f34610c;
                wnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.H8 = floatValue;
                wnVar.L8 = floatValue / this.f34609b;
                View view = wnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f34610c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f34609b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.xn) this.f34610c).E.setTranslationY(AndroidUtilities.lerp(this.f34609b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((rv0) this.f34610c).R.setTranslationY(AndroidUtilities.lerp(this.f34609b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                x11 x11Var = (x11) this.f34610c;
                x11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f34609b, floatValue3);
                x11Var.f39891a.setTranslationX(lerp);
                x11Var.f39892b.setTranslationX(lerp);
                ImageView imageView = x11Var.f39893c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.qp qpVar = x11Var.f39894f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                qpVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                qpVar.setScaleX(f7);
                qpVar.setScaleY(f7);
                qpVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
        }
    }
}
