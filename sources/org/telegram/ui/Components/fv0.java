package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class fv0 extends FrameLayout {
    public static int G;
    public float D;
    public boolean E;
    public float F;
    public final int f33629a;
    public float f33630b;
    public boolean f33631c;
    public boolean d;
    public final l9 f33632e;
    public final ImageView f33633f;
    public final bi.md h;
    public final View f33634n;
    public boolean f33635r;
    public final int f33636s;
    public org.telegram.messenger.rz f33637w;
    public boolean f33638x;
    public ValueAnimator f33639y;

    public fv0(Context context, int i7) {
        super(context);
        this.f33629a = i7;
        int i10 = G;
        G = i10 + 1;
        this.f33636s = i10;
        if (i7 == 2) {
            l9 l9Var = new l9(getContext());
            this.f33632e = l9Var;
            l9Var.setLayerNum(1);
            l9Var.setAspectFit(false);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(l9Var, c8.ha.e(26, 26, 17));
            this.f33634n = l9Var;
        } else if (i7 == 1) {
            ImageView imageView = new ImageView(context);
            this.f33633f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, c8.ha.e(24, 24, 17));
            this.f33634n = imageView;
        } else {
            l9 l9Var2 = new l9(getContext());
            this.f33632e = l9Var2;
            l9Var2.setLayerNum(1);
            l9Var2.setAspectFit(true);
            l9Var2.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(l9Var2, c8.ha.e(26, 26, 17));
            this.f33634n = l9Var2;
        }
        bi.md mdVar = new bi.md(context, 26);
        this.h = mdVar;
        mdVar.addOnLayoutChangeListener(new z50(this, 1));
        mdVar.setLines(1);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setTextSize(1, 11.0f);
        mdVar.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.G6, null);
        addView(mdVar, c8.ha.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        mdVar.setVisibility(8);
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int i7 = this.f33629a;
        if (i7 == 2) {
            return;
        }
        boolean z9 = this.f33635r;
        View view = this.f33634n;
        if (z9) {
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
            int i10 = rk0.f37711t0;
            float f13 = 1.0f - f10;
            view.setTranslationY((((org.telegram.messenger.g0.L(36.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(86.0f - f12) / 2.0f)) * f13) - (org.telegram.messenger.g0.L(8.0f) * f10));
            view.setTranslationX(((org.telegram.messenger.g0.L(33.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(64.0f - f12) / 2.0f)) * f13);
            float max = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
            bi.md mdVar = this.h;
            mdVar.setAlpha(max);
            mdVar.setTranslationY((-org.telegram.messenger.g0.L(40.0f)) * f13);
            mdVar.setTranslationX((-org.telegram.messenger.g0.L(12.0f)) * f13);
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
        return this.F;
    }

    public void setExpanded(boolean z9) {
        float f10;
        float f11;
        float f12;
        int i7;
        int i10 = this.f33629a;
        if (i10 != 2) {
            this.f33635r = z9;
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
            View view = this.f33634n;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z9) {
                f12 = f11;
            } else {
                f12 = f10;
            }
            layoutParams.width = org.telegram.messenger.g0.L(f12);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (z9) {
                f10 = f11;
            }
            layoutParams2.height = org.telegram.messenger.g0.L(f10);
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            this.h.setVisibility(i7);
            if (i10 != 1 && this.f33638x) {
                this.f33632e.setRoundRadius(org.telegram.messenger.g0.L(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
