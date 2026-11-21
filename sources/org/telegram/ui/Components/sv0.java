package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class sv0 extends FrameLayout {
    public static int H;
    public float E;
    public boolean F;
    public float G;
    public final int f39704a;
    public float f39705b;
    public boolean f39706c;
    public boolean d;
    public final q9 f39707e;
    public final ImageView f39708f;
    public final di.xb h;
    public final View f39709n;
    public boolean f39710r;
    public final int f39711s;
    public org.telegram.messenger.lz f39712w;
    public boolean f39713x;
    public ValueAnimator f39714y;

    public sv0(Context context, int i7) {
        super(context);
        this.f39704a = i7;
        int i10 = H;
        H = i10 + 1;
        this.f39711s = i10;
        if (i7 == 2) {
            q9 q9Var = new q9(getContext());
            this.f39707e = q9Var;
            q9Var.setLayerNum(1);
            q9Var.setAspectFit(false);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(q9Var, c8.ma.e(26, 26, 17));
            this.f39709n = q9Var;
        } else if (i7 == 1) {
            ImageView imageView = new ImageView(context);
            this.f39708f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, c8.ma.e(24, 24, 17));
            this.f39709n = imageView;
        } else {
            q9 q9Var2 = new q9(getContext());
            this.f39707e = q9Var2;
            q9Var2.setLayerNum(1);
            q9Var2.setAspectFit(true);
            q9Var2.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(q9Var2, c8.ma.e(26, 26, 17));
            this.f39709n = q9Var2;
        }
        di.xb xbVar = new di.xb(context, 26);
        this.h = xbVar;
        xbVar.addOnLayoutChangeListener(new o60(this, 1));
        xbVar.setLines(1);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.setTextSize(1, 11.0f);
        xbVar.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(xbVar, org.telegram.ui.ActionBar.m6.G6, null);
        addView(xbVar, c8.ma.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        xbVar.setVisibility(8);
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int i7 = this.f39704a;
        if (i7 == 2) {
            return;
        }
        boolean z10 = this.f39710r;
        View view = this.f39709n;
        if (z10) {
            if (i7 == 1) {
                f11 = 24.0f;
            } else {
                f11 = 26.0f;
            }
            if (i7 == 1) {
                f12 = 38.0f;
            } else {
                f12 = 44.0f;
            }
            int i10 = gl0.f35585u0;
            float f13 = 1.0f - f10;
            view.setTranslationY((((org.telegram.messenger.g0.L(36.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(86.0f - f12) / 2.0f)) * f13) - (org.telegram.messenger.g0.L(8.0f) * f10));
            view.setTranslationX(((org.telegram.messenger.g0.L(33.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(64.0f - f12) / 2.0f)) * f13);
            float max = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
            di.xb xbVar = this.h;
            xbVar.setAlpha(max);
            xbVar.setTranslationY((-org.telegram.messenger.g0.L(40.0f)) * f13);
            xbVar.setTranslationX((-org.telegram.messenger.g0.L(12.0f)) * f13);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            float f14 = ((f11 / f12) * f13) + f10;
            view.setScaleX(f14);
            view.setScaleY(f14);
            return;
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public float getTextWidth() {
        return this.G;
    }

    public void setExpanded(boolean z10) {
        float f10;
        float f11;
        float f12;
        int i7;
        int i10 = this.f39704a;
        if (i10 != 2) {
            this.f39710r = z10;
            if (i10 == 1) {
                f10 = 24.0f;
            } else {
                f10 = 26.0f;
            }
            if (i10 == 1) {
                f11 = 38.0f;
            } else {
                f11 = 44.0f;
            }
            View view = this.f39709n;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z10) {
                f12 = f11;
            } else {
                f12 = f10;
            }
            layoutParams.width = org.telegram.messenger.g0.L(f12);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (z10) {
                f10 = f11;
            }
            layoutParams2.height = org.telegram.messenger.g0.L(f10);
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            this.h.setVisibility(i7);
            if (i10 != 1 && this.f39713x) {
                this.f39707e.setRoundRadius(org.telegram.messenger.g0.L(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
