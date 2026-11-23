package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class rv0 extends FrameLayout {
    public static int H;
    public float E;
    public boolean F;
    public float G;
    public final int f39417a;
    public float f39418b;
    public boolean f39419c;
    public boolean d;
    public final p9 f39420e;
    public final ImageView f39421f;
    public final di.xb h;
    public final View f39422n;
    public boolean f39423r;
    public final int f39424s;
    public org.telegram.messenger.kz f39425w;
    public boolean f39426x;
    public ValueAnimator f39427y;

    public rv0(Context context, int i7) {
        super(context);
        this.f39417a = i7;
        int i10 = H;
        H = i10 + 1;
        this.f39424s = i10;
        if (i7 == 2) {
            p9 p9Var = new p9(getContext());
            this.f39420e = p9Var;
            p9Var.setLayerNum(1);
            p9Var.setAspectFit(false);
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(p9Var, c8.na.e(26, 26, 17));
            this.f39422n = p9Var;
        } else if (i7 == 1) {
            ImageView imageView = new ImageView(context);
            this.f39421f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, c8.na.e(24, 24, 17));
            this.f39422n = imageView;
        } else {
            p9 p9Var2 = new p9(getContext());
            this.f39420e = p9Var2;
            p9Var2.setLayerNum(1);
            p9Var2.setAspectFit(true);
            p9Var2.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(p9Var2, c8.na.e(26, 26, 17));
            this.f39422n = p9Var2;
        }
        di.xb xbVar = new di.xb(context, 26);
        this.h = xbVar;
        xbVar.addOnLayoutChangeListener(new l60(this, 1));
        xbVar.setLines(1);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.setTextSize(1, 11.0f);
        xbVar.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.G6, null);
        addView(xbVar, c8.na.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        xbVar.setVisibility(8);
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int i7 = this.f39417a;
        if (i7 == 2) {
            return;
        }
        boolean z10 = this.f39423r;
        View view = this.f39422n;
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
            int i10 = gl0.f35468u0;
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
        int i10 = this.f39417a;
        if (i10 != 2) {
            this.f39423r = z10;
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
            View view = this.f39422n;
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
            if (i10 != 1 && this.f39426x) {
                this.f39420e.setRoundRadius(org.telegram.messenger.g0.L(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
