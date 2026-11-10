package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.wq;
public final class i9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42649a;
    public final float f42650b;
    public final float f42651c;
    public final float d;
    public final float f42652e;
    public final int f42653f;
    public final KeyEvent.Callback f42654g;

    public i9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.f42649a = i10;
        this.f42654g = callback;
        this.f42650b = f10;
        this.f42651c = f11;
        this.d = f12;
        this.f42652e = f13;
        this.f42653f = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42649a) {
            case 0:
                n9 n9Var = (n9) this.f42654g;
                n9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wq wqVar = wq.h;
                float interpolation = wqVar.getInterpolation(floatValue);
                float interpolation2 = wqVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                x6 x6Var = n9Var.d;
                float f10 = this.f42651c;
                float f11 = this.f42650b;
                x6Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = n9Var.f42871f;
                float f12 = this.f42652e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = n9Var.f42870e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i7 = this.f42653f;
                layoutParams.width = Math.round(((n9Var.D - i7) * interpolation) + i7);
                frameLayout.requestLayout();
                return;
            default:
                yh.l lVar = (yh.l) this.f42654g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.f59549y = floatValue2;
                float f14 = this.f42650b;
                float z9 = com.google.android.recaptcha.internal.a.z(1.0f, f14, floatValue2, f14);
                yh.k kVar = lVar.D;
                kVar.setScaleX(z9);
                kVar.setScaleY(z9);
                kVar.setTranslationX((1.0f - lVar.f59549y) * this.f42651c);
                kVar.setTranslationY((1.0f - lVar.f59549y) * this.d);
                int i10 = (int) ((1.0f - lVar.f59549y) * this.f42652e);
                lVar.h.N(i10, i10);
                float a10 = c8.j9.a((lVar.f59549y * 2.0f) - 1.0f, 0.0f, 1.0f);
                lVar.f59541c.setAlpha((int) (a10 * 255.0f));
                lVar.d.setAlpha(a10);
                lVar.f59542e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lVar.f59543f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - lVar.f59549y) * this.f42653f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = lVar.f59548x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (lVar.f59549y * 255.0f));
                }
                lVar.f59544n.setAlpha(a10);
                return;
        }
    }
}
