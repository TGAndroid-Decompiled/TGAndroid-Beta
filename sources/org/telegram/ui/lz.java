package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lz extends LinearLayout {
    public final org.telegram.ui.ActionBar.f6 f35566a;
    public final FrameLayout f35567b;
    public final org.telegram.ui.Components.v9 f35568c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.v9 f35569f;
    public final FrameLayout h;
    public ValueAnimator f35570n;
    public float f35571r;

    public lz(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f35566a = f6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35567b = frameLayout;
        w7.a6.b(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, w7.y5.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.f35568c = v9Var;
        v9Var.setImageDrawable(new org.telegram.ui.Components.kj0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f)));
        frameLayout.addView(v9Var, w7.y5.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.j6.f19511z6;
        TextView b10 = w7.c6.b(context, 14.0f, i10, true, null);
        b10.setPadding(org.telegram.ui.Cells.c1.c(12.0f, R.string.TopicsLayoutTabs, b10), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(b10, w7.y5.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(13.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        frameLayout2.addView(frameLayout3, w7.y5.e(-2, 26, 17));
        int i12 = org.telegram.ui.ActionBar.j6.f19163g6;
        TextView b11 = w7.c6.b(context, 14.0f, i12, true, null);
        b11.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(b11, w7.y5.e(-2, -2, 17));
        frameLayout.addView(frameLayout2, w7.y5.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e = frameLayout4;
        w7.a6.b(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, w7.y5.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.v9 v9Var2 = new org.telegram.ui.Components.v9(context);
        this.f35569f = v9Var2;
        v9Var2.setImageDrawable(new org.telegram.ui.Components.kj0(R.raw.topics_list, AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(v9Var2, w7.y5.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView b12 = w7.c6.b(context, 14.0f, i10, true, null);
        b12.setPadding(org.telegram.ui.Cells.c1.c(12.0f, R.string.TopicsLayoutList, b12), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(b12, w7.y5.e(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout6.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        frameLayout5.addView(frameLayout6, w7.y5.e(-2, 26, 17));
        TextView b13 = w7.c6.b(context, 14.0f, i12, true, null);
        b13.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(b13, w7.y5.e(-2, -2, 17));
        frameLayout4.addView(frameLayout5, w7.y5.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        a(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        ValueAnimator valueAnimator = this.f35570n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35570n = null;
        }
        org.telegram.ui.Components.v9 v9Var = this.f35569f;
        org.telegram.ui.Components.v9 v9Var2 = this.f35568c;
        FrameLayout frameLayout = this.h;
        FrameLayout frameLayout2 = this.d;
        float f23 = 1.0f;
        if (z11) {
            ViewPropertyAnimator animate = frameLayout2.animate();
            if (!z10) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f17);
            if (!z10) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f18);
            if (!z10) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            ViewPropertyAnimator alpha = scaleY.alpha(f19);
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
            alpha.setInterpolator(qrVar).setDuration(320L).start();
            ViewPropertyAnimator animate2 = frameLayout.animate();
            if (z10) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = animate2.scaleX(f20);
            if (z10) {
                f21 = 0.0f;
            } else {
                f21 = 1.0f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f21);
            if (z10) {
                f22 = 0.0f;
            } else {
                f22 = 1.0f;
            }
            scaleY2.alpha(f22).setInterpolator(qrVar).setDuration(320L).start();
            float f24 = this.f35571r;
            if (!z10) {
                f23 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f24, f23);
            this.f35570n = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 10));
            this.f35570n.addListener(new org.telegram.ui.Components.ba(27, this, z10));
            this.f35570n.setInterpolator(qrVar);
            this.f35570n.setDuration(320L);
            this.f35570n.start();
        } else {
            frameLayout2.animate().cancel();
            frameLayout.animate().cancel();
            if (!z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            frameLayout2.setScaleX(f7);
            if (!z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            frameLayout2.setScaleY(f10);
            if (!z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            frameLayout2.setAlpha(f11);
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            frameLayout.setScaleX(f12);
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            frameLayout.setScaleY(f13);
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            frameLayout.setAlpha(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            this.f35571r = f15;
            int i10 = org.telegram.ui.ActionBar.j6.C6;
            org.telegram.ui.ActionBar.f6 f6Var = this.f35566a;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            int i11 = org.telegram.ui.ActionBar.j6.Oh;
            int d = i0.a.d(this.f35571r, v02, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            v9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
            v9Var2.invalidate();
            v9Var.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.f35571r, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)), mode));
            v9Var.invalidate();
        }
        if (z10) {
            v9Var = v9Var2;
        }
        org.telegram.ui.Components.kj0 lottieAnimation = v9Var.getImageReceiver().getLottieAnimation();
        if (lottieAnimation != null) {
            float t10 = lottieAnimation.t();
            if (z10) {
                f16 = 0.85f;
            } else {
                f16 = 0.8f;
            }
            if (t10 > f16) {
                lottieAnimation.T(0.0f, false);
            }
            lottieAnimation.H(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
