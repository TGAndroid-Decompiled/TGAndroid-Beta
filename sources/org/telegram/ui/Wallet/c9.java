package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bs;
public final class c9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34086a;
    public final float f34087b;
    public final float f34088c;
    public final float d;
    public final float e;
    public final int f34089f;
    public final KeyEvent.Callback f34090g;

    public c9(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34086a = i11;
        this.f34090g = callback;
        this.f34087b = f7;
        this.f34088c = f10;
        this.d = f11;
        this.e = f12;
        this.f34089f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34086a) {
            case 0:
                h9 h9Var = (h9) this.f34090g;
                h9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bs bsVar = bs.h;
                float interpolation = bsVar.getInterpolation(floatValue);
                float interpolation2 = bsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                m6 m6Var = h9Var.f34299c;
                float f7 = this.f34088c;
                float f10 = this.f34087b;
                m6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = h9Var.e;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = h9Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34089f;
                layoutParams.width = Math.round(((h9Var.f34305x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                xh.j jVar = (xh.j) this.f34090g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f49865x = floatValue2;
                float f13 = this.f34087b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, floatValue2, f13);
                xh.i iVar = jVar.f49866y;
                iVar.setScaleX(y3);
                iVar.setScaleY(y3);
                iVar.setTranslationX((1.0f - jVar.f49865x) * this.f34088c);
                iVar.setTranslationY((1.0f - jVar.f49865x) * this.d);
                int i11 = (int) ((1.0f - jVar.f49865x) * this.e);
                jVar.h.N(i11, i11);
                float a2 = w7.r.a((jVar.f49865x * 2.0f) - 1.0f, 0.0f, 1.0f);
                jVar.f49859c.setAlpha((int) (a2 * 255.0f));
                jVar.d.setAlpha(a2);
                jVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f49860f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - jVar.f49865x) * this.f34089f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = jVar.f49864w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (jVar.f49865x * 255.0f));
                }
                jVar.f49861n.setAlpha(a2);
                return;
        }
    }
}
