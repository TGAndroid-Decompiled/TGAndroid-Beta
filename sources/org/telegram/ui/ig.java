package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ig implements ValueAnimator.AnimatorUpdateListener {
    public final int f34514a;
    public final float f34515b;
    public final Object f34516c;

    public ig(Object obj, float f7, int i10) {
        this.f34514a = i10;
        this.f34516c = obj;
        this.f34515b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f34514a) {
            case 0:
                wn wnVar = (wn) this.f34516c;
                wnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.H8 = floatValue;
                wnVar.L8 = floatValue / this.f34515b;
                View view = wnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f34516c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f34515b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.vn) this.f34516c).E.setTranslationY(AndroidUtilities.lerp(this.f34515b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((rv0) this.f34516c).R.setTranslationY(AndroidUtilities.lerp(this.f34515b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                x11 x11Var = (x11) this.f34516c;
                x11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f34515b, floatValue3);
                x11Var.f39794a.setTranslationX(lerp);
                x11Var.f39795b.setTranslationX(lerp);
                ImageView imageView = x11Var.f39796c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.op opVar = x11Var.f39797f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                opVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                opVar.setScaleX(f7);
                opVar.setScaleY(f7);
                opVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
        }
    }
}
