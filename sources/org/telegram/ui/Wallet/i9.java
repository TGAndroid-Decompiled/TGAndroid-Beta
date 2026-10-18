package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bs;
public final class i9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34342a;
    public final float f34343b;
    public final float f34344c;
    public final float d;
    public final float e;
    public final int f34345f;
    public final KeyEvent.Callback f34346g;

    public i9(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34342a = i11;
        this.f34346g = callback;
        this.f34343b = f7;
        this.f34344c = f10;
        this.d = f11;
        this.e = f12;
        this.f34345f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34342a) {
            case 0:
                n9 n9Var = (n9) this.f34346g;
                n9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bs bsVar = bs.h;
                float interpolation = bsVar.getInterpolation(floatValue);
                float interpolation2 = bsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                s6 s6Var = n9Var.f34648c;
                float f7 = this.f34344c;
                float f10 = this.f34343b;
                s6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = n9Var.e;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = n9Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34345f;
                layoutParams.width = Math.round(((n9Var.f34654x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                xh.j jVar = (xh.j) this.f34346g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f49902x = floatValue2;
                float f13 = this.f34343b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, floatValue2, f13);
                xh.i iVar = jVar.f49903y;
                iVar.setScaleX(y3);
                iVar.setScaleY(y3);
                iVar.setTranslationX((1.0f - jVar.f49902x) * this.f34344c);
                iVar.setTranslationY((1.0f - jVar.f49902x) * this.d);
                int i11 = (int) ((1.0f - jVar.f49902x) * this.e);
                jVar.h.N(i11, i11);
                float a2 = w7.r.a((jVar.f49902x * 2.0f) - 1.0f, 0.0f, 1.0f);
                jVar.f49896c.setAlpha((int) (a2 * 255.0f));
                jVar.d.setAlpha(a2);
                jVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f49897f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - jVar.f49902x) * this.f34345f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = jVar.f49901w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (jVar.f49902x * 255.0f));
                }
                jVar.f49898n.setAlpha(a2);
                return;
        }
    }
}
