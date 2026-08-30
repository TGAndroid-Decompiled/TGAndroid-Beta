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
public final class gz extends LinearLayout {
    public final org.telegram.ui.ActionBar.f6 f34702a;
    public final FrameLayout f34703b;
    public final org.telegram.ui.Components.p9 f34704c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.p9 f34705f;
    public final FrameLayout h;
    public ValueAnimator f34706n;
    public float f34707r;

    public gz(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f34702a = f6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34703b = frameLayout;
        k7.d6.b(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, k7.b6.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f34704c = p9Var;
        p9Var.setImageDrawable(new org.telegram.ui.Components.gj0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), "topics_tabs", AndroidUtilities.dp(160.0f)));
        frameLayout.addView(p9Var, k7.b6.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.j6.f20298z6;
        TextView b10 = k7.f6.b(context, 14.0f, i10, true, null);
        b10.setPadding(b.e(12.0f, R.string.TopicsLayoutTabs, b10), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(b10, k7.b6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(13.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        frameLayout2.addView(frameLayout3, k7.b6.e(-2, 26, 17));
        int i12 = org.telegram.ui.ActionBar.j6.f19960g6;
        TextView b11 = k7.f6.b(context, 14.0f, i12, true, null);
        b11.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(b11, k7.b6.e(-2, -2, 17));
        frameLayout.addView(frameLayout2, k7.b6.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e = frameLayout4;
        k7.d6.b(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, k7.b6.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
        this.f34705f = p9Var2;
        p9Var2.setImageDrawable(new org.telegram.ui.Components.gj0(R.raw.topics_list, AndroidUtilities.dp(160.0f), "topics_list", AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(p9Var2, k7.b6.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView b12 = k7.f6.b(context, 14.0f, i10, true, null);
        b12.setPadding(b.e(12.0f, R.string.TopicsLayoutList, b12), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(b12, k7.b6.e(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout6.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        frameLayout5.addView(frameLayout6, k7.b6.e(-2, 26, 17));
        TextView b13 = k7.f6.b(context, 14.0f, i12, true, null);
        b13.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(b13, k7.b6.e(-2, -2, 17));
        frameLayout4.addView(frameLayout5, k7.b6.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        a(false, false);
    }

    public final void a(boolean z4, boolean z10) {
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
        float f23;
        ValueAnimator valueAnimator = this.f34706n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f34706n = null;
        }
        org.telegram.ui.Components.p9 p9Var = this.f34705f;
        org.telegram.ui.Components.p9 p9Var2 = this.f34704c;
        FrameLayout frameLayout = this.h;
        FrameLayout frameLayout2 = this.d;
        float f24 = 1.0f;
        if (z10) {
            ViewPropertyAnimator animate = frameLayout2.animate();
            if (!z4) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f18);
            if (!z4) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f19);
            if (!z4) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            ViewPropertyAnimator alpha = scaleY.alpha(f20);
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
            alpha.setInterpolator(nrVar).setDuration(320L).start();
            ViewPropertyAnimator animate2 = frameLayout.animate();
            if (z4) {
                f21 = 0.0f;
            } else {
                f21 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = animate2.scaleX(f21);
            if (z4) {
                f22 = 0.0f;
            } else {
                f22 = 1.0f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f22);
            if (z4) {
                f23 = 0.0f;
            } else {
                f23 = 1.0f;
            }
            scaleY2.alpha(f23).setInterpolator(nrVar).setDuration(320L).start();
            float f25 = this.f34707r;
            if (!z4) {
                f24 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f25, f24);
            this.f34706n = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 11));
            this.f34706n.addListener(new org.telegram.ui.Components.l00(19, this, z4));
            this.f34706n.setInterpolator(nrVar);
            this.f34706n.setDuration(320L);
            this.f34706n.start();
        } else {
            frameLayout2.animate().cancel();
            frameLayout.animate().cancel();
            if (!z4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            frameLayout2.setScaleX(f10);
            if (!z4) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            frameLayout2.setScaleY(f11);
            if (!z4) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            frameLayout2.setAlpha(f12);
            if (z4) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            frameLayout.setScaleX(f13);
            if (z4) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            frameLayout.setScaleY(f14);
            if (z4) {
                f15 = 0.0f;
            } else {
                f15 = 1.0f;
            }
            frameLayout.setAlpha(f15);
            if (z4) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            this.f34707r = f16;
            int i10 = org.telegram.ui.ActionBar.j6.C6;
            org.telegram.ui.ActionBar.f6 f6Var = this.f34702a;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            int i11 = org.telegram.ui.ActionBar.j6.Oh;
            int d = i0.a.d(this.f34707r, v02, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            p9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
            p9Var2.invalidate();
            p9Var.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.f34707r, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)), mode));
            p9Var.invalidate();
        }
        if (z4) {
            p9Var = p9Var2;
        }
        org.telegram.ui.Components.gj0 lottieAnimation = p9Var.getImageReceiver().getLottieAnimation();
        if (lottieAnimation != null) {
            float r10 = lottieAnimation.r();
            if (z4) {
                f17 = 0.85f;
            } else {
                f17 = 0.8f;
            }
            if (r10 > f17) {
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
