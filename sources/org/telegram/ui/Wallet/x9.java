package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.nr;
public final class x9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45323a;
    public final float f45324b;
    public final float f45325c;
    public final float d;
    public final float f45326e;
    public final int f45327f;
    public final KeyEvent.Callback f45328g;

    public x9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.f45323a = i10;
        this.f45328g = callback;
        this.f45324b = f10;
        this.f45325c = f11;
        this.d = f12;
        this.f45326e = f13;
        this.f45327f = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45323a) {
            case 0:
                ca caVar = (ca) this.f45328g;
                caVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nr nrVar = nr.h;
                float interpolation = nrVar.getInterpolation(floatValue);
                float interpolation2 = nrVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                m7 m7Var = caVar.d;
                float f10 = this.f45325c;
                float f11 = this.f45324b;
                m7Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = caVar.f44049f;
                float f12 = this.f45326e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = caVar.f44048e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i7 = this.f45327f;
                layoutParams.width = Math.round(((caVar.E - i7) * interpolation) + i7);
                frameLayout.requestLayout();
                return;
            default:
                zh.k kVar = (zh.k) this.f45328g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f62049y = floatValue2;
                float f14 = this.f45324b;
                float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f14, floatValue2, f14);
                zh.j jVar = kVar.E;
                jVar.setScaleX(z10);
                jVar.setScaleY(z10);
                jVar.setTranslationX((1.0f - kVar.f62049y) * this.f45325c);
                jVar.setTranslationY((1.0f - kVar.f62049y) * this.d);
                int i10 = (int) ((1.0f - kVar.f62049y) * this.f45326e);
                kVar.h.N(i10, i10);
                float a10 = c8.l9.a((kVar.f62049y * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f62041c.setAlpha((int) (a10 * 255.0f));
                kVar.d.setAlpha(a10);
                kVar.f62042e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f62043f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f62049y) * this.f45327f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = kVar.f62048x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f62049y * 255.0f));
                }
                kVar.f62044n.setAlpha(a10);
                return;
        }
    }
}
