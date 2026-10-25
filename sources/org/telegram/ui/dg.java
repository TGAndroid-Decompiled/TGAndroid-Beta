package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class dg implements ValueAnimator.AnimatorUpdateListener {
    public final int f38856a;
    public final float f38857b;
    public final Object f38858c;

    public dg(Object obj, float f7, int i10) {
        this.f38856a = i10;
        this.f38858c = obj;
        this.f38857b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        boolean z10;
        switch (this.f38856a) {
            case 0:
                un unVar = (un) this.f38858c;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.T8 = floatValue;
                unVar.X8 = floatValue / this.f38857b;
                View view = unVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f38858c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view2 = (View) arrayList.get(i11);
                    if (view2 != null) {
                        view2.setTranslationY(this.f38857b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.go) this.f38858c).E.setTranslationY(AndroidUtilities.lerp(this.f38857b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((mv0) this.f38858c).R.setTranslationY(AndroidUtilities.lerp(this.f38857b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                s11 s11Var = (s11) this.f38858c;
                s11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.f38857b, floatValue3);
                s11Var.f43335a.setTranslationX(lerp);
                s11Var.f43336b.setTranslationX(lerp);
                ImageView imageView = s11Var.f43337c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.zp zpVar = s11Var.f43338f;
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = -AndroidUtilities.dp(32.0f);
                }
                zpVar.setTranslationX(i10 + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                zpVar.setScaleX(f7);
                zpVar.setScaleY(f7);
                zpVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                return;
            case 5:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.f38858c;
                m3Var.getClass();
                m3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f38857b) % 360.0f;
                m3Var.f36884a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.f38858c;
                i8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.f36682c = i8Var.c();
                i8Var.d = this.f38857b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i8Var.f36686s = z10;
                return;
        }
    }
}
