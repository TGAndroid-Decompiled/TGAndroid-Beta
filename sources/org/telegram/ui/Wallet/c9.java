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
    public final int f34073a;
    public final float f34074b;
    public final float f34075c;
    public final float d;
    public final float e;
    public final int f34076f;
    public final KeyEvent.Callback f34077g;

    public c9(KeyEvent.Callback callback, float f7, float f10, float f11, float f12, int i10, int i11) {
        this.f34073a = i11;
        this.f34077g = callback;
        this.f34074b = f7;
        this.f34075c = f10;
        this.d = f11;
        this.e = f12;
        this.f34076f = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34073a) {
            case 0:
                h9 h9Var = (h9) this.f34077g;
                h9Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bs bsVar = bs.h;
                float interpolation = bsVar.getInterpolation(floatValue);
                float interpolation2 = bsVar.getInterpolation(Math.min(1.0f, (floatValue * 320.0f) / 120.0f));
                m6 m6Var = h9Var.f34286c;
                float f7 = this.f34075c;
                float f10 = this.f34074b;
                m6Var.setAlpha(((f7 - f10) * interpolation2) + f10);
                TextView textView = h9Var.e;
                float f11 = this.e;
                float f12 = this.d;
                textView.setAlpha(((f11 - f12) * interpolation2) + f12);
                FrameLayout frameLayout = h9Var.d;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int i10 = this.f34076f;
                layoutParams.width = Math.round(((h9Var.f34292x - i10) * interpolation) + i10);
                frameLayout.requestLayout();
                return;
            default:
                xh.j jVar = (xh.j) this.f34077g;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f49854x = floatValue2;
                float f13 = this.f34074b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, floatValue2, f13);
                xh.i iVar = jVar.f49855y;
                iVar.setScaleX(y3);
                iVar.setScaleY(y3);
                iVar.setTranslationX((1.0f - jVar.f49854x) * this.f34075c);
                iVar.setTranslationY((1.0f - jVar.f49854x) * this.d);
                int i11 = (int) ((1.0f - jVar.f49854x) * this.e);
                jVar.h.N(i11, i11);
                float a2 = w7.r.a((jVar.f49854x * 2.0f) - 1.0f, 0.0f, 1.0f);
                jVar.f49848c.setAlpha((int) (a2 * 255.0f));
                jVar.d.setAlpha(a2);
                jVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f49849f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - jVar.f49854x) * this.f34076f);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = jVar.f49853w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (jVar.f49854x * 255.0f));
                }
                jVar.f49850n.setAlpha(a2);
                return;
        }
    }
}
