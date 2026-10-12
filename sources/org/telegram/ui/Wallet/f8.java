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
    public final int f34764a;
    public final float f34765b;
    public final float f34766c;
    public final float d;
    public final float f34767e;
    public final int f34768f;
    public final KeyEvent.Callback f34769g;

    public f8(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34764a = i11;
        this.f34769g = callback;
        this.f34765b = f7;
        this.f34766c = f10;
        this.d = f11;
        this.f34767e = f12;
        this.f34768f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34764a) {
            case 0:
                k8 k8Var = (k8) this.f34769g;
                k8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                js jsVar = js.h;
                float interpolation = jsVar.getInterpolation(floatValue);
                float interpolation2 = jsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                e6 e6Var = k8Var.f34982c;
                float f7 = this.f34766c;
                float f10 = this.f34765b;
                e6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = k8Var.f34983e;
                float f11 = this.f34767e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = k8Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34768f;
                layoutParams.width = Math.round(((k8Var.f34989x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                wh.k kVar = (wh.k) this.f34769g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f50655x = floatValue2;
                float f13 = this.f34765b;
                float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f13, floatValue2, f13);
                wh.j jVar = kVar.f50656y;
                jVar.setScaleX(y3);
                jVar.setScaleY(y3);
                jVar.setTranslationX((1.0f - kVar.f50655x) * this.f34766c);
                jVar.setTranslationY((1.0f - kVar.f50655x) * this.d);
                int i11 = (int) ((1.0f - kVar.f50655x) * this.f34767e);
                kVar.h.N(i11, i11);
                float a2 = w7.n.a((kVar.f50655x * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f50648c.setAlpha((int) (a2 * 255.0f));
                kVar.d.setAlpha(a2);
                kVar.f50649e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f50650f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f50655x) * this.f34768f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = kVar.f50654w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f50655x * 255.0f));
                }
                kVar.f50651n.setAlpha(a2);
                return;
        }
    }
}
