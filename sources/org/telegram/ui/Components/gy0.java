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
public final class gy0 extends FrameLayout {
    public static int G;
    public boolean E;
    public float F;
    public final int f26895a;
    public float f26896b;
    public boolean f26897c;
    public boolean d;
    public final y9 f26898e;
    public final ImageView f26899f;
    public final ai.q4 h;
    public final View f26900n;
    public boolean f26901r;
    public final int f26902s;
    public SvgHelper.SvgDrawable v;
    public boolean f26903w;
    public ValueAnimator f26904x;
    public float f26905y;

    public gy0(Context context, int i10) {
        super(context);
        this.f26895a = i10;
        int i11 = G;
        G = i11 + 1;
        this.f26902s = i11;
        if (i10 == 2) {
            y9 y9Var = new y9(getContext());
            this.f26898e = y9Var;
            y9Var.setLayerNum(1);
            y9Var.setAspectFit(false);
            y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(y9Var, w7.x5.e(26, 26, 17));
            this.f26900n = y9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f26899f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, w7.x5.e(24, 24, 17));
            this.f26900n = imageView;
        } else {
            y9 y9Var2 = new y9(getContext());
            this.f26898e = y9Var2;
            y9Var2.setLayerNum(1);
            y9Var2.setAspectFit(true);
            y9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(y9Var2, w7.x5.e(26, 26, 17));
            this.f26900n = y9Var2;
        }
        ai.q4 q4Var = new ai.q4(context, 24);
        this.h = q4Var;
        q4Var.addOnLayoutChangeListener(new g80(this, 1));
        q4Var.setLines(1);
        q4Var.setEllipsize(TextUtils.TruncateAt.END);
        q4Var.setTextSize(1, 11.0f);
        q4Var.setGravity(1);
        q4Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        addView(q4Var, w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 10.0f, -1, 81));
        q4Var.setVisibility(8);
    }

    public final void a(float f7) {
        float f10;
        float f11;
        int i10 = this.f26895a;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f26901r;
        View view = this.f26900n;
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
            int i11 = pn0.f29898t0;
            float f12 = 1.0f - f7;
            view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f7));
            view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
            float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
            ai.q4 q4Var = this.h;
            q4Var.setAlpha(max);
            q4Var.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
            q4Var.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
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
        int i11 = this.f26895a;
        if (i11 != 2) {
            this.f26901r = z10;
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
            View view = this.f26900n;
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
            if (i11 != 1 && this.f26903w) {
                this.f26898e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
