package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hs;
public final class c8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34767a;
    public final float f34768b;
    public final float f34769c;
    public final float d;
    public final float f34770e;
    public final int f34771f;
    public final KeyEvent.Callback f34772g;

    public c8(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34767a = i11;
        this.f34772g = callback;
        this.f34768b = f7;
        this.f34769c = f10;
        this.d = f11;
        this.f34770e = f12;
        this.f34771f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34767a) {
            case 0:
                h8 h8Var = (h8) this.f34772g;
                h8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hs hsVar = hs.h;
                float interpolation = hsVar.getInterpolation(floatValue);
                float interpolation2 = hsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                b6 b6Var = h8Var.f34985c;
                float f7 = this.f34769c;
                float f10 = this.f34768b;
                b6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = h8Var.f34986e;
                float f11 = this.f34770e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = h8Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34771f;
                layoutParams.width = Math.round(((h8Var.f34992x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                wh.k kVar = (wh.k) this.f34772g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f50424x = floatValue2;
                float f13 = this.f34768b;
                float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f13, floatValue2, f13);
                wh.j jVar = kVar.f50425y;
                jVar.setScaleX(y3);
                jVar.setScaleY(y3);
                jVar.setTranslationX((1.0f - kVar.f50424x) * this.f34769c);
                jVar.setTranslationY((1.0f - kVar.f50424x) * this.d);
                int i11 = (int) ((1.0f - kVar.f50424x) * this.f34770e);
                kVar.h.N(i11, i11);
                float a2 = w7.o.a((kVar.f50424x * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f50417c.setAlpha((int) (a2 * 255.0f));
                kVar.d.setAlpha(a2);
                kVar.f50418e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f50419f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f50424x) * this.f34771f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = kVar.f50423w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f50424x * 255.0f));
                }
                kVar.f50420n.setAlpha(a2);
                return;
        }
    }
}
