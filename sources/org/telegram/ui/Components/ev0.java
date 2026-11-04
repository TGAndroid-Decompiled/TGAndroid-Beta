package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class ev0 extends FrameLayout {
    public static int H;
    public float E;
    public boolean F;
    public float G;
    public final int f33468a;
    public float f33469b;
    public boolean f33470c;
    public boolean d;
    public final k9 f33471e;
    public final ImageView f33472f;
    public final ci.ec h;
    public final View f33473n;
    public boolean f33474r;
    public final int f33475s;
    public org.telegram.messenger.jz f33476w;
    public boolean f33477x;
    public ValueAnimator f33478y;

    public ev0(Context context, int i3) {
        super(context);
        this.f33468a = i3;
        int i10 = H;
        H = i10 + 1;
        this.f33475s = i10;
        if (i3 == 2) {
            k9 k9Var = new k9(getContext());
            this.f33471e = k9Var;
            k9Var.setLayerNum(1);
            k9Var.setAspectFit(false);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(k9Var, b8.mf.e(26, 26, 17));
            this.f33473n = k9Var;
        } else if (i3 == 1) {
            ImageView imageView = new ImageView(context);
            this.f33472f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, b8.mf.e(24, 24, 17));
            this.f33473n = imageView;
        } else {
            k9 k9Var2 = new k9(getContext());
            this.f33471e = k9Var2;
            k9Var2.setLayerNum(1);
            k9Var2.setAspectFit(true);
            k9Var2.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(k9Var2, b8.mf.e(26, 26, 17));
            this.f33473n = k9Var2;
        }
        ci.ec ecVar = new ci.ec(context, 26);
        this.h = ecVar;
        ecVar.addOnLayoutChangeListener(new v50(this, 1));
        ecVar.setLines(1);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        ecVar.setTextSize(1, 11.0f);
        ecVar.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.G6, null);
        addView(ecVar, b8.mf.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        ecVar.setVisibility(8);
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int i3 = this.f33468a;
        if (i3 == 2) {
            return;
        }
        boolean z10 = this.f33474r;
        View view = this.f33473n;
        if (z10) {
            if (i3 == 1) {
                f11 = 24.0f;
            } else {
                f11 = 26.0f;
            }
            if (i3 == 1) {
                f12 = 38.0f;
            } else {
                f12 = 44.0f;
            }
            int i10 = vk0.f39144u0;
            float f13 = 1.0f - f10;
            view.setTranslationY((((org.telegram.messenger.g0.L(36.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(86.0f - f12) / 2.0f)) * f13) - (org.telegram.messenger.g0.L(8.0f) * f10));
            view.setTranslationX(((org.telegram.messenger.g0.L(33.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(64.0f - f12) / 2.0f)) * f13);
            float max = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
            ci.ec ecVar = this.h;
            ecVar.setAlpha(max);
            ecVar.setTranslationY((-org.telegram.messenger.g0.L(40.0f)) * f13);
            ecVar.setTranslationX((-org.telegram.messenger.g0.L(12.0f)) * f13);
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
        int i3;
        int i10 = this.f33468a;
        if (i10 != 2) {
            this.f33474r = z10;
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
            View view = this.f33473n;
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
                i3 = 0;
            } else {
                i3 = 8;
            }
            this.h.setVisibility(i3);
            if (i10 != 1 && this.f33477x) {
                this.f33471e.setRoundRadius(org.telegram.messenger.g0.L(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
