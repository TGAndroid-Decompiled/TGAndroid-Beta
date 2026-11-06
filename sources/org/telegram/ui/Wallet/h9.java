package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xq;
public final class h9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42595a;
    public final float f42596b;
    public final float f42597c;
    public final float d;
    public final float f42598e;
    public final int f42599f;
    public final KeyEvent.Callback f42600g;

    public h9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.f42595a = i10;
        this.f42600g = callback;
        this.f42596b = f10;
        this.f42597c = f11;
        this.d = f12;
        this.f42598e = f13;
        this.f42599f = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42595a) {
            case 0:
                m9 m9Var = (m9) this.f42600g;
                m9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xq xqVar = xq.h;
                float interpolation = xqVar.getInterpolation(floatValue);
                float interpolation2 = xqVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                w6 w6Var = m9Var.d;
                float f10 = this.f42597c;
                float f11 = this.f42596b;
                w6Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = m9Var.f42782f;
                float f12 = this.f42598e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = m9Var.f42781e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i7 = this.f42599f;
                layoutParams.width = Math.round(((m9Var.D - i7) * interpolation) + i7);
                frameLayout.requestLayout();
                return;
            default:
                yh.l lVar = (yh.l) this.f42600g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.f59444y = floatValue2;
                float f14 = this.f42596b;
                float z9 = com.google.android.recaptcha.internal.a.z(1.0f, f14, floatValue2, f14);
                yh.k kVar = lVar.D;
                kVar.setScaleX(z9);
                kVar.setScaleY(z9);
                kVar.setTranslationX((1.0f - lVar.f59444y) * this.f42597c);
                kVar.setTranslationY((1.0f - lVar.f59444y) * this.d);
                int i10 = (int) ((1.0f - lVar.f59444y) * this.f42598e);
                lVar.h.N(i10, i10);
                float a10 = c8.j9.a((lVar.f59444y * 2.0f) - 1.0f, 0.0f, 1.0f);
                lVar.f59436c.setAlpha((int) (a10 * 255.0f));
                lVar.d.setAlpha(a10);
                lVar.f59437e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lVar.f59438f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - lVar.f59444y) * this.f42599f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = lVar.f59443x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (lVar.f59444y * 255.0f));
                }
                lVar.f59439n.setAlpha(a10);
                return;
        }
    }
}
