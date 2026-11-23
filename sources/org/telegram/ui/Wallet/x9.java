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
    public final int f45327a;
    public final float f45328b;
    public final float f45329c;
    public final float d;
    public final float f45330e;
    public final int f45331f;
    public final KeyEvent.Callback f45332g;

    public x9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.f45327a = i10;
        this.f45332g = callback;
        this.f45328b = f10;
        this.f45329c = f11;
        this.d = f12;
        this.f45330e = f13;
        this.f45331f = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45327a) {
            case 0:
                ca caVar = (ca) this.f45332g;
                caVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nr nrVar = nr.h;
                float interpolation = nrVar.getInterpolation(floatValue);
                float interpolation2 = nrVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                m7 m7Var = caVar.d;
                float f10 = this.f45329c;
                float f11 = this.f45328b;
                m7Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = caVar.f44053f;
                float f12 = this.f45330e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = caVar.f44052e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i7 = this.f45331f;
                layoutParams.width = Math.round(((caVar.E - i7) * interpolation) + i7);
                frameLayout.requestLayout();
                return;
            default:
                zh.k kVar = (zh.k) this.f45332g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f62053y = floatValue2;
                float f14 = this.f45328b;
                float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f14, floatValue2, f14);
                zh.j jVar = kVar.E;
                jVar.setScaleX(z10);
                jVar.setScaleY(z10);
                jVar.setTranslationX((1.0f - kVar.f62053y) * this.f45329c);
                jVar.setTranslationY((1.0f - kVar.f62053y) * this.d);
                int i10 = (int) ((1.0f - kVar.f62053y) * this.f45330e);
                kVar.h.N(i10, i10);
                float a10 = c8.l9.a((kVar.f62053y * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f62045c.setAlpha((int) (a10 * 255.0f));
                kVar.d.setAlpha(a10);
                kVar.f62046e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f62047f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f62053y) * this.f45331f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = kVar.f62052x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f62053y * 255.0f));
                }
                kVar.f62048n.setAlpha(a10);
                return;
        }
    }
}
