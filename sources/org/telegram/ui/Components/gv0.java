package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class gv0 extends FrameLayout {
    public static int G;
    public float D;
    public boolean E;
    public float F;
    public final int f33982a;
    public float f33983b;
    public boolean f33984c;
    public boolean d;
    public final k9 f33985e;
    public final ImageView f33986f;
    public final bi.md h;
    public final View f33987n;
    public boolean f33988r;
    public final int f33989s;
    public org.telegram.messenger.rz f33990w;
    public boolean f33991x;
    public ValueAnimator f33992y;

    public gv0(Context context, int i7) {
        super(context);
        this.f33982a = i7;
        int i10 = G;
        G = i10 + 1;
        this.f33989s = i10;
        if (i7 == 2) {
            k9 k9Var = new k9(getContext());
            this.f33985e = k9Var;
            k9Var.setLayerNum(1);
            k9Var.setAspectFit(false);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(k9Var, c8.ha.e(26, 26, 17));
            this.f33987n = k9Var;
        } else if (i7 == 1) {
            ImageView imageView = new ImageView(context);
            this.f33986f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, c8.ha.e(24, 24, 17));
            this.f33987n = imageView;
        } else {
            k9 k9Var2 = new k9(getContext());
            this.f33985e = k9Var2;
            k9Var2.setLayerNum(1);
            k9Var2.setAspectFit(true);
            k9Var2.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(k9Var2, c8.ha.e(26, 26, 17));
            this.f33987n = k9Var2;
        }
        bi.md mdVar = new bi.md(context, 26);
        this.h = mdVar;
        mdVar.addOnLayoutChangeListener(new z50(this, 1));
        mdVar.setLines(1);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setTextSize(1, 11.0f);
        mdVar.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(mdVar, org.telegram.ui.ActionBar.m6.G6, null);
        addView(mdVar, c8.ha.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        mdVar.setVisibility(8);
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int i7 = this.f33982a;
        if (i7 == 2) {
            return;
        }
        boolean z9 = this.f33988r;
        View view = this.f33987n;
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
            int i10 = rk0.f37679t0;
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
        int i10 = this.f33982a;
        if (i10 != 2) {
            this.f33988r = z9;
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
            View view = this.f33987n;
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
            if (i10 != 1 && this.f33991x) {
                this.f33985e.setRoundRadius(org.telegram.messenger.g0.L(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
