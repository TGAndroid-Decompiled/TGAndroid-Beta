package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class y9 extends FrameLayout implements org.telegram.messenger.gs, org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public int F;
    public int G;
    public TextView f42359a;
    public TextView f42360b;
    public bi.e3 f42361c;
    public bi.e3 d;
    public sh0 f42362e;
    public ScrollView f42363f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate f42364n;
    public String f42365r;
    public int f42366s;
    public int f42367w;
    public GradientDrawable f42368x;
    public GradientDrawable f42369y;

    public final void a(boolean z10) {
        bi.e3 e3Var = this.d;
        TextView textView = this.f42360b;
        bi.e3 e3Var2 = this.f42361c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        if (z10) {
            e3Var2.setVisibility(0);
            e3Var.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, property3, 0.1f), ObjectAnimator.ofFloat(textView, property2, 0.1f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(e3Var2, property3, 1.0f), ObjectAnimator.ofFloat(e3Var2, property2, 1.0f), ObjectAnimator.ofFloat(e3Var2, property, 1.0f));
        } else {
            textView.setVisibility(0);
            e3Var.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(e3Var2, property3, 0.1f), ObjectAnimator.ofFloat(e3Var2, property2, 0.1f), ObjectAnimator.ofFloat(e3Var2, property, 0.0f), ObjectAnimator.ofFloat(textView, property3, 1.0f), ObjectAnimator.ofFloat(textView, property2, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f));
        }
        this.h.addListener(new org.telegram.ui.on(1, this, z10));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.Y1) {
            String str = (String) objArr[0];
            String str2 = this.f42365r;
            if (str2 != null && str2.equals(str)) {
                a(false);
                org.telegram.messenger.t0.f26930a.v((Activity) getContext(), this.f42364n.document);
            }
        } else if (i7 == org.telegram.messenger.ls.Z1) {
            String str3 = (String) objArr[0];
            String str4 = this.f42365r;
            if (str4 != null && str4.equals(str3)) {
                a(false);
            }
        } else if (i7 == org.telegram.messenger.ls.X1) {
            String str5 = (String) objArr[0];
            String str6 = this.f42365r;
            if (str6 != null && str6.equals(str5)) {
                this.f42362e.e(true, Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.f42368x;
        ScrollView scrollView = this.f42363f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), org.telegram.messenger.g0.L(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.f42369y;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - org.telegram.messenger.g0.L(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8) {
            org.telegram.messenger.ls.f(this.f42366s).n(this, org.telegram.messenger.ls.Y1);
            org.telegram.messenger.ls.f(this.f42366s).n(this, org.telegram.messenger.ls.Z1);
            org.telegram.messenger.ls.f(this.f42366s).n(this, org.telegram.messenger.ls.X1);
        }
    }

    @Override
    public final void updateColors() {
        boolean z10;
        boolean z11;
        int x02;
        ScrollView scrollView;
        GradientDrawable gradientDrawable = this.f42369y;
        GradientDrawable gradientDrawable2 = this.f42368x;
        try {
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false);
            if (this.E) {
                if (x03 != this.F) {
                }
                x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29661s8, false);
                scrollView = this.f42363f;
                if (scrollView != null && (!this.E || x02 != this.G)) {
                    this.G = x02;
                    org.telegram.messenger.g0.x3(scrollView, x02);
                }
                this.E = true;
                invalidate();
            }
            this.F = x03;
            if (gradientDrawable2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                gradientDrawable2.setColors(new int[]{x03, 0});
            }
            if (gradientDrawable != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                gradientDrawable.setColors(new int[]{x03, 0});
            }
            x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29661s8, false);
            scrollView = this.f42363f;
            if (scrollView != null) {
                this.G = x02;
                org.telegram.messenger.g0.x3(scrollView, x02);
            }
            this.E = true;
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
