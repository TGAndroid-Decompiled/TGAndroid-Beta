package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.js;
public final class f8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34766a;
    public final float f34767b;
    public final float f34768c;
    public final float d;
    public final float f34769e;
    public final int f34770f;
    public final KeyEvent.Callback f34771g;

    public f8(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34766a = i11;
        this.f34771g = callback;
        this.f34767b = f7;
        this.f34768c = f10;
        this.d = f11;
        this.f34769e = f12;
        this.f34770f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34766a) {
            case 0:
                k8 k8Var = (k8) this.f34771g;
                k8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                js jsVar = js.h;
                float interpolation = jsVar.getInterpolation(floatValue);
                float interpolation2 = jsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                e6 e6Var = k8Var.f34984c;
                float f7 = this.f34768c;
                float f10 = this.f34767b;
                e6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = k8Var.f34985e;
                float f11 = this.f34769e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = k8Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34770f;
                layoutParams.width = Math.round(((k8Var.f34991x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                wh.k kVar = (wh.k) this.f34771g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f50663x = floatValue2;
                float f13 = this.f34767b;
                float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f13, floatValue2, f13);
                wh.j jVar = kVar.f50664y;
                jVar.setScaleX(y3);
                jVar.setScaleY(y3);
                jVar.setTranslationX((1.0f - kVar.f50663x) * this.f34768c);
                jVar.setTranslationY((1.0f - kVar.f50663x) * this.d);
                int i11 = (int) ((1.0f - kVar.f50663x) * this.f34769e);
                kVar.h.N(i11, i11);
                float a2 = w7.n.a((kVar.f50663x * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f50656c.setAlpha((int) (a2 * 255.0f));
                kVar.d.setAlpha(a2);
                kVar.f50657e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f50658f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f50663x) * this.f34770f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = kVar.f50662w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f50663x * 255.0f));
                }
                kVar.f50659n.setAlpha(a2);
                return;
        }
    }
}
