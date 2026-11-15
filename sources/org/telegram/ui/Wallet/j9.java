package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.er;
public final class j9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44031a;
    public final float f44032b;
    public final float f44033c;
    public final float d;
    public final float f44034e;
    public final int f44035f;
    public final KeyEvent.Callback f44036g;

    public j9(KeyEvent.Callback callback, float f10, float f11, float f12, float f13, int i7, int i10) {
        this.f44031a = i10;
        this.f44036g = callback;
        this.f44032b = f10;
        this.f44033c = f11;
        this.d = f12;
        this.f44034e = f13;
        this.f44035f = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44031a) {
            case 0:
                o9 o9Var = (o9) this.f44036g;
                o9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                er erVar = er.h;
                float interpolation = erVar.getInterpolation(floatValue);
                float interpolation2 = erVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                w6 w6Var = o9Var.d;
                float f10 = this.f44033c;
                float f11 = this.f44032b;
                w6Var.setAlpha(((f10 - f11) * interpolation2) + f11);
                TextView textView = o9Var.f44277f;
                float f12 = this.f44034e;
                float f13 = this.d;
                textView.setAlpha(((f12 - f13) * interpolation2) + f13);
                FrameLayout frameLayout = o9Var.f44276e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i7 = this.f44035f;
                layoutParams.width = Math.round(((o9Var.E - i7) * interpolation) + i7);
                frameLayout.requestLayout();
                return;
            default:
                zh.k kVar = (zh.k) this.f44036g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f61441y = floatValue2;
                float f14 = this.f44032b;
                float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f14, floatValue2, f14);
                zh.j jVar = kVar.E;
                jVar.setScaleX(z10);
                jVar.setScaleY(z10);
                jVar.setTranslationX((1.0f - kVar.f61441y) * this.f44033c);
                jVar.setTranslationY((1.0f - kVar.f61441y) * this.d);
                int i10 = (int) ((1.0f - kVar.f61441y) * this.f44034e);
                kVar.h.N(i10, i10);
                float a10 = c8.i9.a((kVar.f61441y * 2.0f) - 1.0f, 0.0f, 1.0f);
                kVar.f61433c.setAlpha((int) (a10 * 255.0f));
                kVar.d.setAlpha(a10);
                kVar.f61434e.setAlpha(a10);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f61435f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - kVar.f61441y) * this.f44035f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a10);
                BitmapDrawable bitmapDrawable = kVar.f61440x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (kVar.f61441y * 255.0f));
                }
                kVar.f61436n.setAlpha(a10);
                return;
        }
    }
}
