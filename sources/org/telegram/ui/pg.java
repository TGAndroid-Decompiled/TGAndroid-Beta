package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class pg implements ValueAnimator.AnimatorUpdateListener {
    public final int f40955a;
    public final float f40956b;
    public final Object f40957c;

    public pg(Object obj, float f7, int i10) {
        this.f40955a = i10;
        this.f40957c = obj;
        this.f40956b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f40955a) {
            case 0:
                eo eoVar = (eo) this.f40957c;
                eoVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar.H8 = floatValue;
                eoVar.L8 = floatValue / this.f40956b;
                View view = eoVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f40957c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f40956b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.no) this.f40957c).E.setTranslationY(AndroidUtilities.lerp(this.f40956b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((cw0) this.f40957c).R.setTranslationY(AndroidUtilities.lerp(this.f40956b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                i21 i21Var = (i21) this.f40957c;
                i21Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f40956b, floatValue3);
                i21Var.f38603a.setTranslationX(lerp);
                i21Var.f38604b.setTranslationX(lerp);
                ImageView imageView = i21Var.f38605c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.fq fqVar = i21Var.f38607f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                fqVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                fqVar.setScaleX(f7);
                fqVar.setScaleY(f7);
                fqVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) this.f40957c;
                f3Var.getClass();
                f3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f40956b) % 360.0f;
                f3Var.f34707a.invalidate();
                return;
        }
    }
}
