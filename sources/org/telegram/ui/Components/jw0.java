package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class jw0 extends FrameLayout {
    public static int G;
    public float D;
    public boolean E;
    public float F;
    public final int f27497a;
    public float f27498b;
    public boolean f27499c;
    public boolean d;
    public final g9 e;
    public final ImageView f27500f;
    public final ag.j3 h;
    public final View f27501n;
    public boolean f27502r;
    public final int f27503s;
    public org.telegram.messenger.c00 f27504w;
    public boolean f27505x;
    public ValueAnimator f27506y;

    public jw0(Context context, int i10) {
        super(context);
        this.f27497a = i10;
        int i11 = G;
        G = i11 + 1;
        this.f27503s = i11;
        if (i10 == 2) {
            g9 g9Var = new g9(getContext());
            this.e = g9Var;
            g9Var.setLayerNum(1);
            g9Var.setAspectFit(false);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(6.0f));
            addView(g9Var, w7.b6.e(26, 26, 17));
            this.f27501n = g9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f27500f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, w7.b6.e(24, 24, 17));
            this.f27501n = imageView;
        } else {
            g9 g9Var2 = new g9(getContext());
            this.e = g9Var2;
            g9Var2.setLayerNum(1);
            g9Var2.setAspectFit(true);
            g9Var2.setRoundRadius(org.telegram.messenger.i0.L(6.0f));
            addView(g9Var2, w7.b6.e(26, 26, 17));
            this.f27501n = g9Var2;
        }
        ag.j3 j3Var = new ag.j3(context, 23);
        this.h = j3Var;
        j3Var.addOnLayoutChangeListener(new o60(this, 1));
        j3Var.setLines(1);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        j3Var.setTextSize(1, 11.0f);
        j3Var.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.G6, null);
        addView(j3Var, w7.b6.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        j3Var.setVisibility(8);
    }

    public final void a(float f7) {
        float f10;
        float f11;
        int i10 = this.f27497a;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f27502r;
        View view = this.f27501n;
        if (z10) {
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
            int i11 = ul0.f30963t0;
            float f12 = 1.0f - f7;
            view.setTranslationY((((org.telegram.messenger.i0.L(36.0f - f10) / 2.0f) - (org.telegram.messenger.i0.L(86.0f - f11) / 2.0f)) * f12) - (org.telegram.messenger.i0.L(8.0f) * f7));
            view.setTranslationX(((org.telegram.messenger.i0.L(33.0f - f10) / 2.0f) - (org.telegram.messenger.i0.L(64.0f - f11) / 2.0f)) * f12);
            float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
            ag.j3 j3Var = this.h;
            j3Var.setAlpha(max);
            j3Var.setTranslationY((-org.telegram.messenger.i0.L(40.0f)) * f12);
            j3Var.setTranslationX((-org.telegram.messenger.i0.L(12.0f)) * f12);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            float f13 = ((f10 / f11) * f12) + f7;
            view.setScaleX(f13);
            view.setScaleY(f13);
            return;
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public float getTextWidth() {
        return this.F;
    }

    public void setExpanded(boolean z10) {
        float f7;
        float f10;
        float f11;
        int i10;
        int i11 = this.f27497a;
        if (i11 != 2) {
            this.f27502r = z10;
            if (i11 == 1) {
                f7 = 24.0f;
            } else {
                f7 = 26.0f;
            }
            if (i11 == 1) {
                f10 = 38.0f;
            } else {
                f10 = 44.0f;
            }
            View view = this.f27501n;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z10) {
                f11 = f10;
            } else {
                f11 = f7;
            }
            layoutParams.width = org.telegram.messenger.i0.L(f11);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (z10) {
                f7 = f10;
            }
            layoutParams2.height = org.telegram.messenger.i0.L(f7);
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.h.setVisibility(i10);
            if (i11 != 1 && this.f27505x) {
                this.e.setRoundRadius(org.telegram.messenger.i0.L(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
