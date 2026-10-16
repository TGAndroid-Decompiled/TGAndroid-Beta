package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.es;
public final class d8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32798a;
    public final float f32799b;
    public final float f32800c;
    public final float d;
    public final float e;
    public final int f32801f;
    public final KeyEvent.Callback f32802g;

    public d8(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f32798a = i11;
        this.f32802g = callback;
        this.f32799b = f7;
        this.f32800c = f10;
        this.d = f11;
        this.e = f12;
        this.f32801f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32798a) {
            case 0:
                i8 i8Var = (i8) this.f32802g;
                i8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                es esVar = es.h;
                float interpolation = esVar.getInterpolation(floatValue);
                float interpolation2 = esVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                c6 c6Var = i8Var.f33035c;
                float f7 = this.f32800c;
                float f10 = this.f32799b;
                c6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = i8Var.e;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = i8Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f32801f;
                layoutParams.width = Math.round(((i8Var.f33041x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                xh.k kVar = (xh.k) this.f32802g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f48472x = floatValue2;
                float f13 = this.f32799b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, floatValue2, f13);
                xh.j jVar = kVar.f48473y;
                jVar.setScaleX(y3);
                jVar.setScaleY(y3);
                jVar.setTranslationX((1.0f - kVar.f48472x) * this.f32800c);
                jVar.setTranslationY((1.0f - kVar.f48472x) * this.d);
                int i11 = (int) ((1.0f - kVar.f48472x) * this.e);
                kVar.h.N(i11, i11);
                float a2 = w7.r.a((kVar.f48472x * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f48466c.setAlpha((int) (a2 * 255.0f));
                kVar.d.setAlpha(a2);
                kVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f48467f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f48472x) * this.f32801f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = kVar.f48471w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f48472x * 255.0f));
                }
                kVar.f48468n.setAlpha(a2);
                return;
        }
    }
}
