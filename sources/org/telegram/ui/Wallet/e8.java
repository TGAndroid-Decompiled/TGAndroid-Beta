package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.is;
public final class e8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34923a;
    public final float f34924b;
    public final float f34925c;
    public final float d;
    public final float f34926e;
    public final int f34927f;
    public final KeyEvent.Callback f34928g;

    public e8(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34923a = i11;
        this.f34928g = callback;
        this.f34924b = f7;
        this.f34925c = f10;
        this.d = f11;
        this.f34926e = f12;
        this.f34927f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34923a) {
            case 0:
                j8 j8Var = (j8) this.f34928g;
                j8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                is isVar = is.h;
                float interpolation = isVar.getInterpolation(floatValue);
                float interpolation2 = isVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                d6 d6Var = j8Var.f35144c;
                float f7 = this.f34925c;
                float f10 = this.f34924b;
                d6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = j8Var.f35145e;
                float f11 = this.f34926e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = j8Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34927f;
                layoutParams.width = Math.round(((j8Var.f35151x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                wh.k kVar = (wh.k) this.f34928g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f50470x = floatValue2;
                float f13 = this.f34924b;
                float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f13, floatValue2, f13);
                wh.j jVar = kVar.f50471y;
                jVar.setScaleX(y3);
                jVar.setScaleY(y3);
                jVar.setTranslationX((1.0f - kVar.f50470x) * this.f34925c);
                jVar.setTranslationY((1.0f - kVar.f50470x) * this.d);
                int i11 = (int) ((1.0f - kVar.f50470x) * this.f34926e);
                kVar.h.N(i11, i11);
                float a2 = w7.o.a((kVar.f50470x * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f50463c.setAlpha((int) (a2 * 255.0f));
                kVar.d.setAlpha(a2);
                kVar.f50464e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f50465f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f50470x) * this.f34927f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = kVar.f50469w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f50470x * 255.0f));
                }
                kVar.f50466n.setAlpha(a2);
                return;
        }
    }
}
