package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class hv0 extends FrameLayout {
    public static int H;
    public float E;
    public boolean F;
    public float G;
    public final int f35343a;
    public float f35344b;
    public boolean f35345c;
    public boolean d;
    public final i9 f35346e;
    public final ImageView f35347f;
    public final di.tb h;
    public final View f35348n;
    public boolean f35349r;
    public final int f35350s;
    public org.telegram.messenger.pz f35351w;
    public boolean f35352x;
    public ValueAnimator f35353y;

    public hv0(Context context, int i7) {
        super(context);
        this.f35343a = i7;
        int i10 = H;
        H = i10 + 1;
        this.f35350s = i10;
        if (i7 == 2) {
            i9 i9Var = new i9(getContext());
            this.f35346e = i9Var;
            i9Var.setLayerNum(1);
            i9Var.setAspectFit(false);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(i9Var, c8.ja.e(26, 26, 17));
            this.f35348n = i9Var;
        } else if (i7 == 1) {
            ImageView imageView = new ImageView(context);
            this.f35347f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, c8.ja.e(24, 24, 17));
            this.f35348n = imageView;
        } else {
            i9 i9Var2 = new i9(getContext());
            this.f35346e = i9Var2;
            i9Var2.setLayerNum(1);
            i9Var2.setAspectFit(true);
            i9Var2.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(i9Var2, c8.ja.e(26, 26, 17));
            this.f35348n = i9Var2;
        }
        di.tb tbVar = new di.tb(context, 26);
        this.h = tbVar;
        tbVar.addOnLayoutChangeListener(new c60(this, 1));
        tbVar.setLines(1);
        tbVar.setEllipsize(TextUtils.TruncateAt.END);
        tbVar.setTextSize(1, 11.0f);
        tbVar.setGravity(1);
        org.telegram.ui.ActionBar.q6.U(tbVar, org.telegram.ui.ActionBar.j6.G6, null);
        addView(tbVar, c8.ja.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        tbVar.setVisibility(8);
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int i7 = this.f35343a;
        if (i7 == 2) {
            return;
        }
        boolean z10 = this.f35349r;
        View view = this.f35348n;
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
            int i10 = wk0.f41375u0;
            float f13 = 1.0f - f10;
            view.setTranslationY((((org.telegram.messenger.g0.L(36.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(86.0f - f12) / 2.0f)) * f13) - (org.telegram.messenger.g0.L(8.0f) * f10));
            view.setTranslationX(((org.telegram.messenger.g0.L(33.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(64.0f - f12) / 2.0f)) * f13);
            float max = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
            di.tb tbVar = this.h;
            tbVar.setAlpha(max);
            tbVar.setTranslationY((-org.telegram.messenger.g0.L(40.0f)) * f13);
            tbVar.setTranslationX((-org.telegram.messenger.g0.L(12.0f)) * f13);
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
        int i10 = this.f35343a;
        if (i10 != 2) {
            this.f35349r = z10;
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
            View view = this.f35348n;
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
            if (i10 != 1 && this.f35352x) {
                this.f35346e.setRoundRadius(org.telegram.messenger.g0.L(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
