package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class by0 extends FrameLayout {
    public static int G;
    public boolean E;
    public float F;
    public final int f23871a;
    public float f23872b;
    public boolean f23873c;
    public boolean d;
    public final z9 e;
    public final ImageView f23874f;
    public final bi.f4 h;
    public final View f23875n;
    public boolean f23876r;
    public final int f23877s;
    public SvgHelper.SvgDrawable v;
    public boolean f23878w;
    public ValueAnimator f23879x;
    public float f23880y;

    public by0(Context context, int i10) {
        super(context);
        this.f23871a = i10;
        int i11 = G;
        G = i11 + 1;
        this.f23877s = i11;
        if (i10 == 2) {
            z9 z9Var = new z9(getContext());
            this.e = z9Var;
            z9Var.setLayerNum(1);
            z9Var.setAspectFit(false);
            z9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(z9Var, w7.a6.e(26, 26, 17));
            this.f23875n = z9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f23874f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, w7.a6.e(24, 24, 17));
            this.f23875n = imageView;
        } else {
            z9 z9Var2 = new z9(getContext());
            this.e = z9Var2;
            z9Var2.setLayerNum(1);
            z9Var2.setAspectFit(true);
            z9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(z9Var2, w7.a6.e(26, 26, 17));
            this.f23875n = z9Var2;
        }
        bi.f4 f4Var = new bi.f4(context, 24);
        this.h = f4Var;
        f4Var.addOnLayoutChangeListener(new d80(this, 1));
        f4Var.setLines(1);
        f4Var.setEllipsize(TextUtils.TruncateAt.END);
        f4Var.setTextSize(1, 11.0f);
        f4Var.setGravity(1);
        f4Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        addView(f4Var, w7.a6.a(-2.0f, 8.0f, 0.0f, 8.0f, 10.0f, -1, 81));
        f4Var.setVisibility(8);
    }

    public final void a(float f7) {
        float f10;
        float f11;
        int i10 = this.f23871a;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f23876r;
        View view = this.f23875n;
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
            int i11 = kn0.f26733t0;
            float f12 = 1.0f - f7;
            view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f7));
            view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
            float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
            bi.f4 f4Var = this.h;
            f4Var.setAlpha(max);
            f4Var.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
            f4Var.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
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
        int i11 = this.f23871a;
        if (i11 != 2) {
            this.f23876r = z10;
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
            View view = this.f23875n;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z10) {
                f11 = f10;
            } else {
                f11 = f7;
            }
            layoutParams.width = AndroidUtilities.dp(f11);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (z10) {
                f7 = f10;
            }
            layoutParams2.height = AndroidUtilities.dp(f7);
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.h.setVisibility(i10);
            if (i11 != 1 && this.f23878w) {
                this.e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
