package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xq;
public final class f9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42483a;
    public final float f42484b;
    public final float f42485c;
    public final float d;
    public final float f42486e;
    public final int f42487f;
    public final KeyEvent.Callback f42488g;

    public f9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.f42483a = i10;
        this.f42488g = callback;
        this.f42484b = f10;
        this.f42485c = f11;
        this.d = f12;
        this.f42486e = f13;
        this.f42487f = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42483a) {
            case 0:
                k9 k9Var = (k9) this.f42488g;
                k9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xq xqVar = xq.h;
                float interpolation = xqVar.getInterpolation(floatValue);
                float interpolation2 = xqVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                u6 u6Var = k9Var.d;
                float f10 = this.f42485c;
                float f11 = this.f42484b;
                u6Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = k9Var.f42670f;
                float f12 = this.f42486e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = k9Var.f42669e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i7 = this.f42487f;
                layoutParams.width = Math.round(((k9Var.D - i7) * interpolation) + i7);
                frameLayout.requestLayout();
                return;
            default:
                yh.l lVar = (yh.l) this.f42488g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.f59551y = floatValue2;
                float f14 = this.f42484b;
                float z9 = com.google.android.recaptcha.internal.a.z(1.0f, f14, floatValue2, f14);
                yh.k kVar = lVar.D;
                kVar.setScaleX(z9);
                kVar.setScaleY(z9);
                kVar.setTranslationX((1.0f - lVar.f59551y) * this.f42485c);
                kVar.setTranslationY((1.0f - lVar.f59551y) * this.d);
                int i10 = (int) ((1.0f - lVar.f59551y) * this.f42486e);
                lVar.h.N(i10, i10);
                float a10 = c8.j9.a((lVar.f59551y * 2.0f) - 1.0f, 0.0f, 1.0f);
                lVar.f59543c.setAlpha((int) (a10 * 255.0f));
                lVar.d.setAlpha(a10);
                lVar.f59544e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lVar.f59545f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - lVar.f59551y) * this.f42487f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = lVar.f59550x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (lVar.f59551y * 255.0f));
                }
                lVar.f59546n.setAlpha(a10);
                return;
        }
    }
}
