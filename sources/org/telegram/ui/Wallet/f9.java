package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bs;
public final class f9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34208a;
    public final float f34209b;
    public final float f34210c;
    public final float d;
    public final float e;
    public final int f34211f;
    public final KeyEvent.Callback f34212g;

    public f9(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34208a = i11;
        this.f34212g = callback;
        this.f34209b = f7;
        this.f34210c = f10;
        this.d = f11;
        this.e = f12;
        this.f34211f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34208a) {
            case 0:
                k9 k9Var = (k9) this.f34212g;
                k9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bs bsVar = bs.h;
                float interpolation = bsVar.getInterpolation(floatValue);
                float interpolation2 = bsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                p6 p6Var = k9Var.f34445c;
                float f7 = this.f34210c;
                float f10 = this.f34209b;
                p6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = k9Var.e;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = k9Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34211f;
                layoutParams.width = Math.round(((k9Var.f34451x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                xh.j jVar = (xh.j) this.f34212g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f49877x = floatValue2;
                float f13 = this.f34209b;
                float x10 = com.google.android.gms.internal.cast.a6.x(1.0f, f13, floatValue2, f13);
                xh.i iVar = jVar.f49878y;
                iVar.setScaleX(x10);
                iVar.setScaleY(x10);
                iVar.setTranslationX((1.0f - jVar.f49877x) * this.f34210c);
                iVar.setTranslationY((1.0f - jVar.f49877x) * this.d);
                int i11 = (int) ((1.0f - jVar.f49877x) * this.e);
                jVar.h.N(i11, i11);
                float a2 = w7.r.a((jVar.f49877x * 2.0f) - 1.0f, 0.0f, 1.0f);
                jVar.f49871c.setAlpha((int) (a2 * 255.0f));
                jVar.d.setAlpha(a2);
                jVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f49872f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - jVar.f49877x) * this.f34211f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = jVar.f49876w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (jVar.f49877x * 255.0f));
                }
                jVar.f49873n.setAlpha(a2);
                return;
        }
    }
}
