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
public final class lw0 extends FrameLayout {
    public static int C;
    public boolean A;
    public float B;
    public final int f30568a;
    public float f30569b;
    public boolean f30570c;
    public boolean d;
    public final o9 f30571e;
    public final ImageView f30572f;
    public final bg.t h;
    public final View f30573n;
    public boolean f30574r;
    public final int f30575s;
    public SvgHelper.SvgDrawable v;
    public boolean f30576w;
    public ValueAnimator f30577x;
    public float f30578y;

    public lw0(Context context, int i9) {
        super(context);
        this.f30568a = i9;
        int i10 = C;
        C = i10 + 1;
        this.f30575s = i10;
        if (i9 == 2) {
            o9 o9Var = new o9(getContext());
            this.f30571e = o9Var;
            o9Var.setLayerNum(1);
            o9Var.setAspectFit(false);
            o9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(o9Var, g7.e6.e(26, 26, 17));
            this.f30573n = o9Var;
        } else if (i9 == 1) {
            ImageView imageView = new ImageView(context);
            this.f30572f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, g7.e6.e(24, 24, 17));
            this.f30573n = imageView;
        } else {
            o9 o9Var2 = new o9(getContext());
            this.f30571e = o9Var2;
            o9Var2.setLayerNum(1);
            o9Var2.setAspectFit(true);
            o9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(o9Var2, g7.e6.e(26, 26, 17));
            this.f30573n = o9Var2;
        }
        bg.t tVar = new bg.t(context, 25);
        this.h = tVar;
        tVar.addOnLayoutChangeListener(new n60(this, 1));
        tVar.setLines(1);
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        tVar.setTextSize(1, 11.0f);
        tVar.setGravity(1);
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        addView(tVar, g7.e6.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        tVar.setVisibility(8);
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int i9 = this.f30568a;
        if (i9 == 2) {
            return;
        }
        boolean z10 = this.f30574r;
        View view = this.f30573n;
        if (z10) {
            if (i9 == 1) {
                f11 = 24.0f;
            } else {
                f11 = 26.0f;
            }
            if (i9 == 1) {
                f12 = 38.0f;
            } else {
                f12 = 44.0f;
            }
            int i10 = sl0.f32492p0;
            float f13 = 1.0f - f10;
            view.setTranslationY((((AndroidUtilities.dp(36.0f - f11) / 2.0f) - (AndroidUtilities.dp(86.0f - f12) / 2.0f)) * f13) - (AndroidUtilities.dp(8.0f) * f10));
            view.setTranslationX(((AndroidUtilities.dp(33.0f - f11) / 2.0f) - (AndroidUtilities.dp(64.0f - f12) / 2.0f)) * f13);
            float max = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
            bg.t tVar = this.h;
            tVar.setAlpha(max);
            tVar.setTranslationY((-AndroidUtilities.dp(40.0f)) * f13);
            tVar.setTranslationX((-AndroidUtilities.dp(12.0f)) * f13);
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
        return this.B;
    }

    public void setExpanded(boolean z10) {
        float f10;
        float f11;
        float f12;
        int i9;
        int i10 = this.f30568a;
        if (i10 != 2) {
            this.f30574r = z10;
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
            View view = this.f30573n;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z10) {
                f12 = f11;
            } else {
                f12 = f10;
            }
            layoutParams.width = AndroidUtilities.dp(f12);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (z10) {
                f10 = f11;
            }
            layoutParams2.height = AndroidUtilities.dp(f10);
            if (z10) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            this.h.setVisibility(i9);
            if (i10 != 1 && this.f30576w) {
                this.f30571e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
