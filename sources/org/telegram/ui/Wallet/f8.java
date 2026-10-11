package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.is;
public final class f8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34989a;
    public final float f34990b;
    public final float f34991c;
    public final float d;
    public final float f34992e;
    public final int f34993f;
    public final KeyEvent.Callback f34994g;

    public f8(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34989a = i11;
        this.f34994g = callback;
        this.f34990b = f7;
        this.f34991c = f10;
        this.d = f11;
        this.f34992e = f12;
        this.f34993f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34989a) {
            case 0:
                k8 k8Var = (k8) this.f34994g;
                k8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                is isVar = is.h;
                float interpolation = isVar.getInterpolation(floatValue);
                float interpolation2 = isVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                e6 e6Var = k8Var.f35208c;
                float f7 = this.f34991c;
                float f10 = this.f34990b;
                e6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = k8Var.f35209e;
                float f11 = this.f34992e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = k8Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34993f;
                layoutParams.width = Math.round(((k8Var.f35215x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                wh.k kVar = (wh.k) this.f34994g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f50548x = floatValue2;
                float f13 = this.f34990b;
                float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f13, floatValue2, f13);
                wh.j jVar = kVar.f50549y;
                jVar.setScaleX(y3);
                jVar.setScaleY(y3);
                jVar.setTranslationX((1.0f - kVar.f50548x) * this.f34991c);
                jVar.setTranslationY((1.0f - kVar.f50548x) * this.d);
                int i11 = (int) ((1.0f - kVar.f50548x) * this.f34992e);
                kVar.h.N(i11, i11);
                float a2 = w7.o.a((kVar.f50548x * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f50541c.setAlpha((int) (a2 * 255.0f));
                kVar.d.setAlpha(a2);
                kVar.f50542e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f50543f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f50548x) * this.f34993f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = kVar.f50547w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f50548x * 255.0f));
                }
                kVar.f50544n.setAlpha(a2);
                return;
        }
    }
}
