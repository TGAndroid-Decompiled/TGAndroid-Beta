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

public final class nw0 extends FrameLayout {
    public static int C;
    public boolean A;
    public float B;

    public final int f31043a;

    public float f31044b;

    public boolean f31045c;
    public boolean d;

    public final n9 f31046e;

    public final ImageView f31047f;
    public final cg.q h;

    public final View f31048n;

    public boolean f31049r;

    public final int f31050s;
    public SvgHelper.SvgDrawable v;

    public boolean f31051w;

    public ValueAnimator f31052x;

    public float f31053y;

    public nw0(Context context, int i10) {
        super(context);
        this.f31043a = i10;
        int i11 = C;
        C = i11 + 1;
        this.f31050s = i11;
        if (i10 == 2) {
            n9 n9Var = new n9(getContext());
            this.f31046e = n9Var;
            n9Var.setLayerNum(1);
            n9Var.setAspectFit(false);
            n9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(n9Var, h7.z5.e(26, 26, 17));
            this.f31048n = n9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f31047f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, h7.z5.e(24, 24, 17));
            this.f31048n = imageView;
        } else {
            n9 n9Var2 = new n9(getContext());
            this.f31046e = n9Var2;
            n9Var2.setLayerNum(1);
            n9Var2.setAspectFit(true);
            n9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(n9Var2, h7.z5.e(26, 26, 17));
            this.f31048n = n9Var2;
        }
        cg.q qVar = new cg.q(context, 25);
        this.h = qVar;
        qVar.addOnLayoutChangeListener(new s60(this, 1));
        qVar.setLines(1);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setTextSize(1, 11.0f);
        qVar.setGravity(1);
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        addView(qVar, h7.z5.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        qVar.setVisibility(8);
    }

    public final void a(float f10) {
        int i10 = this.f31043a;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f31049r;
        View view = this.f31048n;
        if (!z10) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        float f11 = i10 == 1 ? 24.0f : 26.0f;
        float f12 = i10 == 1 ? 38.0f : 44.0f;
        float fDp = AndroidUtilities.dp(33.0f - f11) / 2.0f;
        float fDp2 = AndroidUtilities.dp(36.0f - f11) / 2.0f;
        int i11 = vl0.f33440p0;
        float fDp3 = AndroidUtilities.dp(64.0f - f12) / 2.0f;
        float f13 = 1.0f - f10;
        view.setTranslationY(((fDp2 - (AndroidUtilities.dp(86.0f - f12) / 2.0f)) * f13) - (AndroidUtilities.dp(8.0f) * f10));
        view.setTranslationX((fDp - fDp3) * f13);
        float fMax = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
        cg.q qVar = this.h;
        qVar.setAlpha(fMax);
        qVar.setTranslationY((-AndroidUtilities.dp(40.0f)) * f13);
        qVar.setTranslationX((-AndroidUtilities.dp(12.0f)) * f13);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        float f14 = ((f11 / f12) * f13) + f10;
        view.setScaleX(f14);
        view.setScaleY(f14);
    }

    public float getTextWidth() {
        return this.B;
    }

    public void setExpanded(boolean z10) {
        int i10 = this.f31043a;
        if (i10 == 2) {
            return;
        }
        this.f31049r = z10;
        float f10 = i10 == 1 ? 24.0f : 26.0f;
        float f11 = i10 == 1 ? 38.0f : 44.0f;
        View view = this.f31048n;
        view.getLayoutParams().width = AndroidUtilities.dp(z10 ? f11 : f10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z10) {
            f10 = f11;
        }
        layoutParams.height = AndroidUtilities.dp(f10);
        this.h.setVisibility(z10 ? 0 : 8);
        if (i10 == 1 || !this.f31051w) {
            return;
        }
        this.f31046e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
    }
}
