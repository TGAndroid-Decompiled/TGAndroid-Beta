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
    public final int f45293a;
    public final float f45294b;
    public final float f45295c;
    public final float d;
    public final float f45296e;
    public final int f45297f;
    public final KeyEvent.Callback f45298g;

    public x9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.f45293a = i10;
        this.f45298g = callback;
        this.f45294b = f10;
        this.f45295c = f11;
        this.d = f12;
        this.f45296e = f13;
        this.f45297f = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45293a) {
            case 0:
                ca caVar = (ca) this.f45298g;
                caVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nr nrVar = nr.h;
                float interpolation = nrVar.getInterpolation(floatValue);
                float interpolation2 = nrVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                m7 m7Var = caVar.d;
                float f10 = this.f45295c;
                float f11 = this.f45294b;
                m7Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = caVar.f44019f;
                float f12 = this.f45296e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = caVar.f44018e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i7 = this.f45297f;
                layoutParams.width = Math.round(((caVar.E - i7) * interpolation) + i7);
                frameLayout.requestLayout();
                return;
            default:
                zh.k kVar = (zh.k) this.f45298g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f62018y = floatValue2;
                float f14 = this.f45294b;
                float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f14, floatValue2, f14);
                zh.j jVar = kVar.E;
                jVar.setScaleX(z10);
                jVar.setScaleY(z10);
                jVar.setTranslationX((1.0f - kVar.f62018y) * this.f45295c);
                jVar.setTranslationY((1.0f - kVar.f62018y) * this.d);
                int i10 = (int) ((1.0f - kVar.f62018y) * this.f45296e);
                kVar.h.N(i10, i10);
                float a10 = c8.m9.a((kVar.f62018y * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f62010c.setAlpha((int) (a10 * 255.0f));
                kVar.d.setAlpha(a10);
                kVar.f62011e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f62012f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f62018y) * this.f45297f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = kVar.f62017x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f62018y * 255.0f));
                }
                kVar.f62013n.setAlpha(a10);
                return;
        }
    }
}
