package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class mg implements ValueAnimator.AnimatorUpdateListener {
    public final int f38589a;
    public final float f38590b;
    public final Object f38591c;

    public mg(Object obj, float f7, int i10) {
        this.f38589a = i10;
        this.f38591c = obj;
        this.f38590b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f38589a) {
            case 0:
                yn ynVar = (yn) this.f38591c;
                ynVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar.F8 = floatValue;
                ynVar.J8 = floatValue / this.f38590b;
                View view = ynVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f38591c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f38590b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.xn) this.f38591c).E.setTranslationY(AndroidUtilities.lerp(this.f38590b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((uv0) this.f38591c).R.setTranslationY(AndroidUtilities.lerp(this.f38590b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                y11 y11Var = (y11) this.f38591c;
                y11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f38590b, floatValue3);
                y11Var.f43004a.setTranslationX(lerp);
                y11Var.f43005b.setTranslationX(lerp);
                ImageView imageView = y11Var.f43006c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.qp qpVar = y11Var.f43008f;
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
