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
public final class cx0 extends FrameLayout {
    public static int G;
    public boolean E;
    public float F;
    public final int f25133a;
    public float f25134b;
    public boolean f25135c;
    public boolean d;
    public final x9 f25136e;
    public final ImageView f25137f;
    public final bi.c4 h;
    public final View f25138n;
    public boolean f25139r;
    public final int f25140s;
    public SvgHelper.SvgDrawable v;
    public boolean f25141w;
    public ValueAnimator f25142x;
    public float f25143y;

    public cx0(Context context, int i10) {
        super(context);
        this.f25133a = i10;
        int i11 = G;
        G = i11 + 1;
        this.f25140s = i11;
        if (i10 == 2) {
            x9 x9Var = new x9(getContext());
            this.f25136e = x9Var;
            x9Var.setLayerNum(1);
            x9Var.setAspectFit(false);
            x9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(x9Var, w7.x5.e(26, 26, 17));
            this.f25138n = x9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f25137f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, w7.x5.e(24, 24, 17));
            this.f25138n = imageView;
        } else {
            x9 x9Var2 = new x9(getContext());
            this.f25136e = x9Var2;
            x9Var2.setLayerNum(1);
            x9Var2.setAspectFit(true);
            x9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(x9Var2, w7.x5.e(26, 26, 17));
            this.f25138n = x9Var2;
        }
        bi.c4 c4Var = new bi.c4(context, 24);
        this.h = c4Var;
        c4Var.addOnLayoutChangeListener(new e70(this, 1));
        c4Var.setLines(1);
        c4Var.setEllipsize(TextUtils.TruncateAt.END);
        c4Var.setTextSize(1, 11.0f);
        c4Var.setGravity(1);
        c4Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(c4Var, w7.x5.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        c4Var.setVisibility(8);
    }

    public final void a(float f7) {
        float f10;
        float f11;
        int i10 = this.f25133a;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f25139r;
        View view = this.f25138n;
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
            int i11 = im0.f27190t0;
            float f12 = 1.0f - f7;
            view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f7));
            view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
            float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
            bi.c4 c4Var = this.h;
            c4Var.setAlpha(max);
            c4Var.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
            c4Var.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
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
        int i11 = this.f25133a;
        if (i11 != 2) {
            this.f25139r = z10;
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
            View view = this.f25138n;
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
            if (i11 != 1 && this.f25141w) {
                this.f25136e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
