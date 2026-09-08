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
    public final org.telegram.ui.ActionBar.f6 f38544a;
    public final FrameLayout f38545b;
    public final org.telegram.ui.Components.x9 f38546c;
    public final FrameLayout d;
    public final FrameLayout f38547e;
    public final org.telegram.ui.Components.x9 f38548f;
    public final FrameLayout h;
    public ValueAnimator f38549n;
    public float f38550r;

    public lz(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38544a = f6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38545b = frameLayout;
        w7.z5.b(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, w7.x5.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f38546c = x9Var;
        x9Var.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f)));
        frameLayout.addView(x9Var, w7.x5.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.j6.f21088z6;
        TextView b10 = w7.b6.b(context, 14.0f, i10, true, null);
        b10.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.TopicsLayoutTabs, b10), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(b10, w7.x5.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(13.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        frameLayout2.addView(frameLayout3, w7.x5.e(-2, 26, 17));
        int i12 = org.telegram.ui.ActionBar.j6.f20745g6;
        TextView b11 = w7.b6.b(context, 14.0f, i12, true, null);
        b11.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(b11, w7.x5.e(-2, -2, 17));
        frameLayout.addView(frameLayout2, w7.x5.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f38547e = frameLayout4;
        w7.z5.b(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, w7.x5.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.x9 x9Var2 = new org.telegram.ui.Components.x9(context);
        this.f38548f = x9Var2;
        x9Var2.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.topics_list, AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(x9Var2, w7.x5.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView b12 = w7.b6.b(context, 14.0f, i10, true, null);
        b12.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.TopicsLayoutList, b12), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(b12, w7.x5.e(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout6.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        frameLayout5.addView(frameLayout6, w7.x5.e(-2, 26, 17));
        TextView b13 = w7.b6.b(context, 14.0f, i12, true, null);
        b13.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(b13, w7.x5.e(-2, -2, 17));
        frameLayout4.addView(frameLayout5, w7.x5.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
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
        ValueAnimator valueAnimator = this.f38549n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38549n = null;
        }
        org.telegram.ui.Components.x9 x9Var = this.f38548f;
        org.telegram.ui.Components.x9 x9Var2 = this.f38546c;
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
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            alpha.setInterpolator(prVar).setDuration(320L).start();
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
            scaleY2.alpha(f22).setInterpolator(prVar).setDuration(320L).start();
            float f24 = this.f38550r;
            if (!z10) {
                f23 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f24, f23);
            this.f38549n = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 11));
            this.f38549n.addListener(new to(28, this, z10));
            this.f38549n.setInterpolator(prVar);
            this.f38549n.setDuration(320L);
            this.f38549n.start();
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
            this.f38550r = f15;
            int i10 = org.telegram.ui.ActionBar.j6.C6;
            org.telegram.ui.ActionBar.f6 f6Var = this.f38544a;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            int i11 = org.telegram.ui.ActionBar.j6.Oh;
            int d = i0.a.d(this.f38550r, v02, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            x9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
            x9Var2.invalidate();
            x9Var.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.f38550r, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)), mode));
            x9Var.invalidate();
        }
        if (z10) {
            x9Var = x9Var2;
        }
        org.telegram.ui.Components.xi0 lottieAnimation = x9Var.getImageReceiver().getLottieAnimation();
        if (lottieAnimation != null) {
            float r10 = lottieAnimation.r();
            if (z10) {
                f16 = 0.85f;
            } else {
                f16 = 0.8f;
            }
            if (r10 > f16) {
                lottieAnimation.Q(0.0f, false);
            }
            lottieAnimation.F(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
