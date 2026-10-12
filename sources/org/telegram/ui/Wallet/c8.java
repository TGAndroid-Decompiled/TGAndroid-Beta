package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.es;
public final class c8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33026a;
    public final float f33027b;
    public final float f33028c;
    public final float d;
    public final float e;
    public final int f33029f;
    public final KeyEvent.Callback f33030g;

    public c8(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f33026a = i11;
        this.f33030g = callback;
        this.f33027b = f7;
        this.f33028c = f10;
        this.d = f11;
        this.e = f12;
        this.f33029f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33026a) {
            case 0:
                h8 h8Var = (h8) this.f33030g;
                h8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                es esVar = es.h;
                float interpolation = esVar.getInterpolation(floatValue);
                float interpolation2 = esVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                b6 b6Var = h8Var.f33252c;
                float f7 = this.f33028c;
                float f10 = this.f33027b;
                b6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = h8Var.e;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = h8Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f33029f;
                layoutParams.width = Math.round(((h8Var.f33258x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                xh.k kVar = (xh.k) this.f33030g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f48473x = floatValue2;
                float f13 = this.f33027b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, floatValue2, f13);
                xh.j jVar = kVar.f48474y;
                jVar.setScaleX(y3);
                jVar.setScaleY(y3);
                jVar.setTranslationX((1.0f - kVar.f48473x) * this.f33028c);
                jVar.setTranslationY((1.0f - kVar.f48473x) * this.d);
                int i11 = (int) ((1.0f - kVar.f48473x) * this.e);
                kVar.h.N(i11, i11);
                float a2 = w7.s.a((kVar.f48473x * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f48467c.setAlpha((int) (a2 * 255.0f));
                kVar.d.setAlpha(a2);
                kVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f48468f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f48473x) * this.f33029f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = kVar.f48472w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f48473x * 255.0f));
                }
                kVar.f48469n.setAlpha(a2);
                return;
        }
    }
}
