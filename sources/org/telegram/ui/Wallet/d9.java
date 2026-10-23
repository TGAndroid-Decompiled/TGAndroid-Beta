package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bs;
public final class d9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34415a;
    public final float f34416b;
    public final float f34417c;
    public final float d;
    public final float e;
    public final int f34418f;
    public final KeyEvent.Callback f34419g;

    public d9(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34415a = i11;
        this.f34419g = callback;
        this.f34416b = f7;
        this.f34417c = f10;
        this.d = f11;
        this.e = f12;
        this.f34418f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34415a) {
            case 0:
                i9 i9Var = (i9) this.f34419g;
                i9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bs bsVar = bs.h;
                float interpolation = bsVar.getInterpolation(floatValue);
                float interpolation2 = bsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                m6 m6Var = i9Var.d;
                float f7 = this.f34417c;
                float f10 = this.f34416b;
                m6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = i9Var.f34612f;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = i9Var.e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34418f;
                layoutParams.width = Math.round(((i9Var.f34618y - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                xh.j jVar = (xh.j) this.f34419g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f50305x = floatValue2;
                float f13 = this.f34416b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, floatValue2, f13);
                xh.i iVar = jVar.f50306y;
                iVar.setScaleX(y3);
                iVar.setScaleY(y3);
                iVar.setTranslationX((1.0f - jVar.f50305x) * this.f34417c);
                iVar.setTranslationY((1.0f - jVar.f50305x) * this.d);
                int i11 = (int) ((1.0f - jVar.f50305x) * this.e);
                jVar.h.N(i11, i11);
                float a2 = w7.r.a((jVar.f50305x * 2.0f) - 1.0f, 0.0f, 1.0f);
                jVar.f50299c.setAlpha((int) (a2 * 255.0f));
                jVar.d.setAlpha(a2);
                jVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f50300f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - jVar.f50305x) * this.f34418f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = jVar.f50304w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (jVar.f50305x * 255.0f));
                }
                jVar.f50301n.setAlpha(a2);
                return;
        }
    }
}
