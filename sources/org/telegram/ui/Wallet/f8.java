package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.is;
public final class f8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34955a;
    public final float f34956b;
    public final float f34957c;
    public final float d;
    public final float f34958e;
    public final int f34959f;
    public final KeyEvent.Callback f34960g;

    public f8(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34955a = i11;
        this.f34960g = callback;
        this.f34956b = f7;
        this.f34957c = f10;
        this.d = f11;
        this.f34958e = f12;
        this.f34959f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34955a) {
            case 0:
                k8 k8Var = (k8) this.f34960g;
                k8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                is isVar = is.h;
                float interpolation = isVar.getInterpolation(floatValue);
                float interpolation2 = isVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                e6 e6Var = k8Var.f35174c;
                float f7 = this.f34957c;
                float f10 = this.f34956b;
                e6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = k8Var.f35175e;
                float f11 = this.f34958e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = k8Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34959f;
                layoutParams.width = Math.round(((k8Var.f35181x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                wh.k kVar = (wh.k) this.f34960g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f50514x = floatValue2;
                float f13 = this.f34956b;
                float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f13, floatValue2, f13);
                wh.j jVar = kVar.f50515y;
                jVar.setScaleX(y3);
                jVar.setScaleY(y3);
                jVar.setTranslationX((1.0f - kVar.f50514x) * this.f34957c);
                jVar.setTranslationY((1.0f - kVar.f50514x) * this.d);
                int i11 = (int) ((1.0f - kVar.f50514x) * this.f34958e);
                kVar.h.N(i11, i11);
                float a2 = w7.o.a((kVar.f50514x * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f50507c.setAlpha((int) (a2 * 255.0f));
                kVar.d.setAlpha(a2);
                kVar.f50508e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f50509f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f50514x) * this.f34959f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = kVar.f50513w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f50514x * 255.0f));
                }
                kVar.f50510n.setAlpha(a2);
                return;
        }
    }
}
