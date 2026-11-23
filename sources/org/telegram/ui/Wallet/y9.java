package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.kr;
public final class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45455a;
    public final float f45456b;
    public final float f45457c;
    public final float d;
    public final float f45458e;
    public final int f45459f;
    public final KeyEvent.Callback f45460g;

    public y9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.f45455a = i10;
        this.f45460g = callback;
        this.f45456b = f10;
        this.f45457c = f11;
        this.d = f12;
        this.f45458e = f13;
        this.f45459f = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45455a) {
            case 0:
                da daVar = (da) this.f45460g;
                daVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kr krVar = kr.h;
                float interpolation = krVar.getInterpolation(floatValue);
                float interpolation2 = krVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                n7 n7Var = daVar.d;
                float f10 = this.f45457c;
                float f11 = this.f45456b;
                n7Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = daVar.f44179f;
                float f12 = this.f45458e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = daVar.f44178e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i7 = this.f45459f;
                layoutParams.width = Math.round(((daVar.E - i7) * interpolation) + i7);
                frameLayout.requestLayout();
                return;
            default:
                zh.k kVar = (zh.k) this.f45460g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f62136y = floatValue2;
                float f14 = this.f45456b;
                float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f14, floatValue2, f14);
                zh.j jVar = kVar.E;
                jVar.setScaleX(z10);
                jVar.setScaleY(z10);
                jVar.setTranslationX((1.0f - kVar.f62136y) * this.f45457c);
                jVar.setTranslationY((1.0f - kVar.f62136y) * this.d);
                int i10 = (int) ((1.0f - kVar.f62136y) * this.f45458e);
                kVar.h.N(i10, i10);
                float a10 = c8.m9.a((kVar.f62136y * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f62128c.setAlpha((int) (a10 * 255.0f));
                kVar.d.setAlpha(a10);
                kVar.f62129e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f62130f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f62136y) * this.f45459f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = kVar.f62135x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f62136y * 255.0f));
                }
                kVar.f62131n.setAlpha(a10);
                return;
        }
    }
}
