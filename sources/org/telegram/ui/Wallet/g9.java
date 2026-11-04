package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.be;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xq;
public final class g9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42586a;
    public final float f42587b;
    public final float f42588c;
    public final float d;
    public final float f42589e;
    public final int f42590f;
    public final KeyEvent.Callback f42591g;

    public g9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i3, int i10) {
        this.f42586a = i10;
        this.f42591g = callback;
        this.f42587b = f10;
        this.f42588c = f11;
        this.d = f12;
        this.f42589e = f13;
        this.f42590f = i3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42586a) {
            case 0:
                l9 l9Var = (l9) this.f42591g;
                l9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xq xqVar = xq.h;
                float interpolation = xqVar.getInterpolation(floatValue);
                float interpolation2 = xqVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                u6 u6Var = l9Var.d;
                float f10 = this.f42588c;
                float f11 = this.f42587b;
                u6Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = l9Var.f42797f;
                float f12 = this.f42589e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = l9Var.f42796e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i3 = this.f42590f;
                layoutParams.width = Math.round(((l9Var.E - i3) * interpolation) + i3);
                frameLayout.requestLayout();
                return;
            default:
                zh.j jVar = (zh.j) this.f42591g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f60579y = floatValue2;
                float f14 = this.f42587b;
                float y9 = com.google.android.recaptcha.internal.a.y(1.0f, f14, floatValue2, f14);
                zh.i iVar = jVar.E;
                iVar.setScaleX(y9);
                iVar.setScaleY(y9);
                iVar.setTranslationX((1.0f - jVar.f60579y) * this.f42588c);
                iVar.setTranslationY((1.0f - jVar.f60579y) * this.d);
                int i10 = (int) ((1.0f - jVar.f60579y) * this.f42589e);
                jVar.h.N(i10, i10);
                float a10 = be.a((jVar.f60579y * 2.0f) - 1.0f, 0.0f, 1.0f);
                jVar.f60571c.setAlpha((int) (a10 * 255.0f));
                jVar.d.setAlpha(a10);
                jVar.f60572e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f60573f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - jVar.f60579y) * this.f42590f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = jVar.f60578x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (jVar.f60579y * 255.0f));
                }
                jVar.f60574n.setAlpha(a10);
                return;
        }
    }
}
