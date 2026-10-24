package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.zr;
public final class d9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34417a;
    public final float f34418b;
    public final float f34419c;
    public final float d;
    public final float e;
    public final int f34420f;
    public final KeyEvent.Callback f34421g;

    public d9(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34417a = i11;
        this.f34421g = callback;
        this.f34418b = f7;
        this.f34419c = f10;
        this.d = f11;
        this.e = f12;
        this.f34420f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34417a) {
            case 0:
                i9 i9Var = (i9) this.f34421g;
                i9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zr zrVar = zr.h;
                float interpolation = zrVar.getInterpolation(floatValue);
                float interpolation2 = zrVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                m6 m6Var = i9Var.d;
                float f7 = this.f34419c;
                float f10 = this.f34418b;
                m6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = i9Var.f34614f;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = i9Var.e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34420f;
                layoutParams.width = Math.round(((i9Var.f34620y - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                xh.j jVar = (xh.j) this.f34421g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f50304x = floatValue2;
                float f13 = this.f34418b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, floatValue2, f13);
                xh.i iVar = jVar.f50305y;
                iVar.setScaleX(y3);
                iVar.setScaleY(y3);
                iVar.setTranslationX((1.0f - jVar.f50304x) * this.f34419c);
                iVar.setTranslationY((1.0f - jVar.f50304x) * this.d);
                int i11 = (int) ((1.0f - jVar.f50304x) * this.e);
                jVar.h.N(i11, i11);
                float a2 = w7.r.a((jVar.f50304x * 2.0f) - 1.0f, 0.0f, 1.0f);
                jVar.f50298c.setAlpha((int) (a2 * 255.0f));
                jVar.d.setAlpha(a2);
                jVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f50299f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - jVar.f50304x) * this.f34420f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = jVar.f50303w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (jVar.f50304x * 255.0f));
                }
                jVar.f50300n.setAlpha(a2);
                return;
        }
    }
}
