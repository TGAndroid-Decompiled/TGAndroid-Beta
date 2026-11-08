package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xq;
public final class g9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42565a;
    public final float f42566b;
    public final float f42567c;
    public final float d;
    public final float f42568e;
    public final int f42569f;
    public final KeyEvent.Callback f42570g;

    public g9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.f42565a = i10;
        this.f42570g = callback;
        this.f42566b = f10;
        this.f42567c = f11;
        this.d = f12;
        this.f42568e = f13;
        this.f42569f = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42565a) {
            case 0:
                l9 l9Var = (l9) this.f42570g;
                l9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xq xqVar = xq.h;
                float interpolation = xqVar.getInterpolation(floatValue);
                float interpolation2 = xqVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                v6 v6Var = l9Var.d;
                float f10 = this.f42567c;
                float f11 = this.f42566b;
                v6Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = l9Var.f42751f;
                float f12 = this.f42568e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = l9Var.f42750e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i7 = this.f42569f;
                layoutParams.width = Math.round(((l9Var.D - i7) * interpolation) + i7);
                frameLayout.requestLayout();
                return;
            default:
                yh.l lVar = (yh.l) this.f42570g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.f59541y = floatValue2;
                float f14 = this.f42566b;
                float z9 = com.google.android.recaptcha.internal.a.z(1.0f, f14, floatValue2, f14);
                yh.k kVar = lVar.D;
                kVar.setScaleX(z9);
                kVar.setScaleY(z9);
                kVar.setTranslationX((1.0f - lVar.f59541y) * this.f42567c);
                kVar.setTranslationY((1.0f - lVar.f59541y) * this.d);
                int i10 = (int) ((1.0f - lVar.f59541y) * this.f42568e);
                lVar.h.N(i10, i10);
                float a10 = c8.j9.a((lVar.f59541y * 2.0f) - 1.0f, 0.0f, 1.0f);
                lVar.f59533c.setAlpha((int) (a10 * 255.0f));
                lVar.d.setAlpha(a10);
                lVar.f59534e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lVar.f59535f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - lVar.f59541y) * this.f42569f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = lVar.f59540x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (lVar.f59541y * 255.0f));
                }
                lVar.f59536n.setAlpha(a10);
                return;
        }
    }
}
