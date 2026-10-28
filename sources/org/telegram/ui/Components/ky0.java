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
public final class ky0 extends FrameLayout {
    public static int G;
    public boolean E;
    public float F;
    public final int f30051a;
    public float f30052b;
    public boolean f30053c;
    public boolean d;
    public final y9 e;
    public final ImageView f30054f;
    public final bi.md h;
    public final View f30055n;
    public boolean f30056r;
    public final int f30057s;
    public SvgHelper.SvgDrawable v;
    public boolean f30058w;
    public ValueAnimator f30059x;
    public float f30060y;

    public ky0(Context context, int i10) {
        super(context);
        this.f30051a = i10;
        int i11 = G;
        G = i11 + 1;
        this.f30057s = i11;
        if (i10 == 2) {
            y9 y9Var = new y9(getContext());
            this.e = y9Var;
            y9Var.setLayerNum(1);
            y9Var.setAspectFit(false);
            y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(y9Var, kb1.i(26, 26, 17));
            this.f30055n = y9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f30054f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, kb1.i(24, 24, 17));
            this.f30055n = imageView;
        } else {
            y9 y9Var2 = new y9(getContext());
            this.e = y9Var2;
            y9Var2.setLayerNum(1);
            y9Var2.setAspectFit(true);
            y9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(y9Var2, kb1.i(26, 26, 17));
            this.f30055n = y9Var2;
        }
        bi.md mdVar = new bi.md(context, 24);
        this.h = mdVar;
        mdVar.addOnLayoutChangeListener(new c80(this, 1));
        mdVar.setLines(1);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setTextSize(1, 11.0f);
        mdVar.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(mdVar, org.telegram.ui.ActionBar.y6.G6, null);
        addView(mdVar, kb1.h(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        mdVar.setVisibility(8);
    }

    public final void a(float f7) {
        float f10;
        float f11;
        int i10 = this.f30051a;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f30056r;
        View view = this.f30055n;
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
            int i11 = qn0.f31946t0;
            float f12 = 1.0f - f7;
            view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f7));
            view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
            float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
            bi.md mdVar = this.h;
            mdVar.setAlpha(max);
            mdVar.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
            mdVar.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
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
        int i11 = this.f30051a;
        if (i11 != 2) {
            this.f30056r = z10;
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
            View view = this.f30055n;
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
            if (i11 != 1 && this.f30058w) {
                this.e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
