package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.lr;
public final class x9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45283a;
    public final float f45284b;
    public final float f45285c;
    public final float d;
    public final float f45286e;
    public final int f45287f;
    public final KeyEvent.Callback f45288g;

    public x9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.f45283a = i10;
        this.f45288g = callback;
        this.f45284b = f10;
        this.f45285c = f11;
        this.d = f12;
        this.f45286e = f13;
        this.f45287f = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45283a) {
            case 0:
                ca caVar = (ca) this.f45288g;
                caVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lr lrVar = lr.h;
                float interpolation = lrVar.getInterpolation(floatValue);
                float interpolation2 = lrVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                m7 m7Var = caVar.d;
                float f10 = this.f45285c;
                float f11 = this.f45284b;
                m7Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = caVar.f44009f;
                float f12 = this.f45286e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = caVar.f44008e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i7 = this.f45287f;
                layoutParams.width = Math.round(((caVar.E - i7) * interpolation) + i7);
                frameLayout.requestLayout();
                return;
            default:
                zh.k kVar = (zh.k) this.f45288g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f62007y = floatValue2;
                float f14 = this.f45284b;
                float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f14, floatValue2, f14);
                zh.j jVar = kVar.E;
                jVar.setScaleX(z10);
                jVar.setScaleY(z10);
                jVar.setTranslationX((1.0f - kVar.f62007y) * this.f45285c);
                jVar.setTranslationY((1.0f - kVar.f62007y) * this.d);
                int i10 = (int) ((1.0f - kVar.f62007y) * this.f45286e);
                kVar.h.N(i10, i10);
                float a10 = c8.l9.a((kVar.f62007y * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f61999c.setAlpha((int) (a10 * 255.0f));
                kVar.d.setAlpha(a10);
                kVar.f62000e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f62001f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f62007y) * this.f45287f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = kVar.f62006x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f62007y * 255.0f));
                }
                kVar.f62002n.setAlpha(a10);
                return;
        }
    }
}
