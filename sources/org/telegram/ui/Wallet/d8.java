package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hs;
public final class d8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34832a;
    public final float f34833b;
    public final float f34834c;
    public final float d;
    public final float f34835e;
    public final int f34836f;
    public final KeyEvent.Callback f34837g;

    public d8(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34832a = i11;
        this.f34837g = callback;
        this.f34833b = f7;
        this.f34834c = f10;
        this.d = f11;
        this.f34835e = f12;
        this.f34836f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34832a) {
            case 0:
                i8 i8Var = (i8) this.f34837g;
                i8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hs hsVar = hs.h;
                float interpolation = hsVar.getInterpolation(floatValue);
                float interpolation2 = hsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                c6 c6Var = i8Var.f35048c;
                float f7 = this.f34834c;
                float f10 = this.f34833b;
                c6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = i8Var.f35049e;
                float f11 = this.f34835e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = i8Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34836f;
                layoutParams.width = Math.round(((i8Var.f35055x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                wh.k kVar = (wh.k) this.f34837g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f50426x = floatValue2;
                float f13 = this.f34833b;
                float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f13, floatValue2, f13);
                wh.j jVar = kVar.f50427y;
                jVar.setScaleX(y3);
                jVar.setScaleY(y3);
                jVar.setTranslationX((1.0f - kVar.f50426x) * this.f34834c);
                jVar.setTranslationY((1.0f - kVar.f50426x) * this.d);
                int i11 = (int) ((1.0f - kVar.f50426x) * this.f34835e);
                kVar.h.N(i11, i11);
                float a2 = w7.o.a((kVar.f50426x * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f50419c.setAlpha((int) (a2 * 255.0f));
                kVar.d.setAlpha(a2);
                kVar.f50420e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f50421f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f50426x) * this.f34836f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = kVar.f50425w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f50426x * 255.0f));
                }
                kVar.f50422n.setAlpha(a2);
                return;
        }
    }
}
