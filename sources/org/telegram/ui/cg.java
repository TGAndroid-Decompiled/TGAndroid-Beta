package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class cg implements ValueAnimator.AnimatorUpdateListener {
    public final int f37198a;
    public final float f37199b;
    public final Object f37200c;

    public cg(Object obj, float f10, int i9) {
        this.f37198a = i9;
        this.f37200c = obj;
        this.f37199b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9;
        switch (this.f37198a) {
            case 0:
                qn qnVar = (qn) this.f37200c;
                qnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.D8 = floatValue;
                qnVar.H8 = floatValue / this.f37199b;
                View view = qnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f37200c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.f37199b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.jn) this.f37200c).A.setTranslationY(AndroidUtilities.lerp(this.f37199b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((xu0) this.f37200c).N.setTranslationY(AndroidUtilities.lerp(this.f37199b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                c11 c11Var = (c11) this.f37200c;
                c11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f37199b, floatValue3);
                c11Var.f37037a.setTranslationX(lerp);
                c11Var.f37038b.setTranslationX(lerp);
                ImageView imageView = c11Var.f37039c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.dp dpVar = c11Var.f37041f;
                if (LocaleController.isRTL) {
                    i9 = AndroidUtilities.dp(32.0f);
                } else {
                    i9 = -AndroidUtilities.dp(32.0f);
                }
                dpVar.setTranslationX(i9 + lerp);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                dpVar.setScaleX(f10);
                dpVar.setScaleY(f10);
                dpVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                return;
        }
    }
}
