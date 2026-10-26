package org.telegram.ui.Wallet;

import a8.ee;
import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ds;
public final class c9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36435a;
    public final float f36436b;
    public final float f36437c;
    public final float d;
    public final float e;
    public final int f36438f;
    public final KeyEvent.Callback f36439g;

    public c9(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f36435a = i11;
        this.f36439g = callback;
        this.f36436b = f7;
        this.f36437c = f10;
        this.d = f11;
        this.e = f12;
        this.f36438f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36435a) {
            case 0:
                h9 h9Var = (h9) this.f36439g;
                h9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ds dsVar = ds.h;
                float interpolation = dsVar.getInterpolation(floatValue);
                float interpolation2 = dsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                l6 l6Var = h9Var.d;
                float f7 = this.f36437c;
                float f10 = this.f36436b;
                l6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = h9Var.f36644f;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = h9Var.e;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f36438f;
                layoutParams.width = Math.round(((h9Var.f36650y - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                yh.j jVar = (yh.j) this.f36439g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f52608x = floatValue2;
                float f13 = this.f36436b;
                float z10 = c3.h0.z(1.0f, f13, floatValue2, f13);
                yh.i iVar = jVar.f52609y;
                iVar.setScaleX(z10);
                iVar.setScaleY(z10);
                iVar.setTranslationX((1.0f - jVar.f52608x) * this.f36437c);
                iVar.setTranslationY((1.0f - jVar.f52608x) * this.d);
                int i11 = (int) ((1.0f - jVar.f52608x) * this.e);
                jVar.h.N(i11, i11);
                float a2 = ee.a((jVar.f52608x * 2.0f) - 1.0f, 0.0f, 1.0f);
                jVar.f52602c.setAlpha((int) (a2 * 255.0f));
                jVar.d.setAlpha(a2);
                jVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f52603f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - jVar.f52608x) * this.f36438f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = jVar.f52607w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (jVar.f52608x * 255.0f));
                }
                jVar.f52604n.setAlpha(a2);
                return;
        }
    }
}
