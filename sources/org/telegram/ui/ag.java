package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ag implements ValueAnimator.AnimatorUpdateListener {
    public final int f36543a;
    public final float f36544b;
    public final Object f36545c;

    public ag(Object obj, float f9, int i10) {
        this.f36543a = i10;
        this.f36545c = obj;
        this.f36544b = f9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f36543a) {
            case 0:
                tn tnVar = (tn) this.f36545c;
                tnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar.D8 = floatValue;
                tnVar.H8 = floatValue / this.f36544b;
                View view = tnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f36545c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f36544b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.on) this.f36545c).A.setTranslationY(AndroidUtilities.lerp(this.f36544b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((vu0) this.f36545c).N.setTranslationY(AndroidUtilities.lerp(this.f36544b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                d11 d11Var = (d11) this.f36545c;
                d11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f36544b, floatValue3);
                d11Var.f37269a.setTranslationX(lerp);
                d11Var.f37270b.setTranslationX(lerp);
                ImageView imageView = d11Var.f37271c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.hp hpVar = d11Var.f37273f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                hpVar.setTranslationX(i10 + lerp);
                float f9 = (floatValue3 * 0.5f) + 0.5f;
                hpVar.setScaleX(f9);
                hpVar.setScaleY(f9);
                hpVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
        }
    }
}
