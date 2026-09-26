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
public final class ox0 extends FrameLayout {
    public static int G;
    public boolean E;
    public float F;
    public final int f27128a;
    public float f27129b;
    public boolean f27130c;
    public boolean d;
    public final w9 e;
    public final ImageView f27131f;
    public final ai.p4 h;
    public final View f27132n;
    public boolean f27133r;
    public final int f27134s;
    public SvgHelper.SvgDrawable v;
    public boolean f27135w;
    public ValueAnimator f27136x;
    public float f27137y;

    public ox0(Context context, int i10) {
        super(context);
        this.f27128a = i10;
        int i11 = G;
        G = i11 + 1;
        this.f27134s = i11;
        if (i10 == 2) {
            w9 w9Var = new w9(getContext());
            this.e = w9Var;
            w9Var.setLayerNum(1);
            w9Var.setAspectFit(false);
            w9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(w9Var, w7.y5.e(26, 26, 17));
            this.f27132n = w9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f27131f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, w7.y5.e(24, 24, 17));
            this.f27132n = imageView;
        } else {
            w9 w9Var2 = new w9(getContext());
            this.e = w9Var2;
            w9Var2.setLayerNum(1);
            w9Var2.setAspectFit(true);
            w9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(w9Var2, w7.y5.e(26, 26, 17));
            this.f27132n = w9Var2;
        }
        ai.p4 p4Var = new ai.p4(context, 24);
        this.h = p4Var;
        p4Var.addOnLayoutChangeListener(new q70(this, 1));
        p4Var.setLines(1);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        p4Var.setTextSize(1, 11.0f);
        p4Var.setGravity(1);
        p4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        addView(p4Var, w7.y5.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        p4Var.setVisibility(8);
    }

    public final void a(float f7) {
        float f10;
        float f11;
        int i10 = this.f27128a;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f27133r;
        View view = this.f27132n;
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
            int i11 = vm0.f29123t0;
            float f12 = 1.0f - f7;
            view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f7));
            view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
            float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
            ai.p4 p4Var = this.h;
            p4Var.setAlpha(max);
            p4Var.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
            p4Var.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
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
        int i11 = this.f27128a;
        if (i11 != 2) {
            this.f27133r = z10;
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
            View view = this.f27132n;
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
            if (i11 != 1 && this.f27135w) {
                this.e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
