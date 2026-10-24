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
public final class ay0 extends FrameLayout {
    public static int G;
    public boolean E;
    public float F;
    public final int f24836a;
    public float f24837b;
    public boolean f24838c;
    public boolean d;
    public final u9 e;
    public final ImageView f24839f;
    public final ai.wd h;
    public final View f24840n;
    public boolean f24841r;
    public final int f24842s;
    public SvgHelper.SvgDrawable v;
    public boolean f24843w;
    public ValueAnimator f24844x;
    public float f24845y;

    public ay0(Context context, int i10) {
        super(context);
        this.f24836a = i10;
        int i11 = G;
        G = i11 + 1;
        this.f24842s = i11;
        if (i10 == 2) {
            u9 u9Var = new u9(getContext());
            this.e = u9Var;
            u9Var.setLayerNum(1);
            u9Var.setAspectFit(false);
            u9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(u9Var, w7.z5.e(26, 26, 17));
            this.f24840n = u9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f24839f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, w7.z5.e(24, 24, 17));
            this.f24840n = imageView;
        } else {
            u9 u9Var2 = new u9(getContext());
            this.e = u9Var2;
            u9Var2.setLayerNum(1);
            u9Var2.setAspectFit(true);
            u9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(u9Var2, w7.z5.e(26, 26, 17));
            this.f24840n = u9Var2;
        }
        ai.wd wdVar = new ai.wd(context, 24);
        this.h = wdVar;
        wdVar.addOnLayoutChangeListener(new y70(this, 1));
        wdVar.setLines(1);
        wdVar.setEllipsize(TextUtils.TruncateAt.END);
        wdVar.setTextSize(1, 11.0f);
        wdVar.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(wdVar, org.telegram.ui.ActionBar.k6.G6, null);
        addView(wdVar, w7.z5.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        wdVar.setVisibility(8);
    }

    public final void a(float f7) {
        float f10;
        float f11;
        int i10 = this.f24836a;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f24841r;
        View view = this.f24840n;
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
            int i11 = jn0.f27728t0;
            float f12 = 1.0f - f7;
            view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f7));
            view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
            float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
            ai.wd wdVar = this.h;
            wdVar.setAlpha(max);
            wdVar.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
            wdVar.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
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
        int i11 = this.f24836a;
        if (i11 != 2) {
            this.f24841r = z10;
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
            View view = this.f24840n;
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
            if (i11 != 1 && this.f24843w) {
                this.e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
