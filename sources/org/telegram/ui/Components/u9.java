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
public final class u9 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public int E;
    public int F;
    public TextView f38554a;
    public TextView f38555b;
    public bi.e5 f38556c;
    public bi.e5 d;
    public dh0 f38557e;
    public ScrollView f38558f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate f38559n;
    public String f38560r;
    public int f38561s;
    public int f38562w;
    public GradientDrawable f38563x;
    public GradientDrawable f38564y;

    public final void a(boolean z9) {
        bi.e5 e5Var = this.d;
        TextView textView = this.f38555b;
        bi.e5 e5Var2 = this.f38556c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        if (z9) {
            e5Var2.setVisibility(0);
            e5Var.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, property3, 0.1f), ObjectAnimator.ofFloat(textView, property2, 0.1f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(e5Var2, property3, 1.0f), ObjectAnimator.ofFloat(e5Var2, property2, 1.0f), ObjectAnimator.ofFloat(e5Var2, property, 1.0f));
        } else {
            textView.setVisibility(0);
            e5Var.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(e5Var2, property3, 0.1f), ObjectAnimator.ofFloat(e5Var2, property2, 0.1f), ObjectAnimator.ofFloat(e5Var2, property, 0.0f), ObjectAnimator.ofFloat(textView, property3, 1.0f), ObjectAnimator.ofFloat(textView, property2, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f));
        }
        this.h.addListener(new t9(0, this, z9));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.Y1) {
            String str = (String) objArr[0];
            String str2 = this.f38560r;
            if (str2 != null && str2.equals(str)) {
                a(false);
                org.telegram.messenger.t0.f25554a.v((Activity) getContext(), this.f38559n.document);
            }
        } else if (i7 == org.telegram.messenger.qs.Z1) {
            String str3 = (String) objArr[0];
            String str4 = this.f38560r;
            if (str4 != null && str4.equals(str3)) {
                a(false);
            }
        } else if (i7 == org.telegram.messenger.qs.X1) {
            String str5 = (String) objArr[0];
            String str6 = this.f38560r;
            if (str6 != null && str6.equals(str5)) {
                this.f38557e.e(true, Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.f38563x;
        ScrollView scrollView = this.f38558f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), org.telegram.messenger.g0.L(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.f38564y;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - org.telegram.messenger.g0.L(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8) {
            org.telegram.messenger.qs.f(this.f38561s).n(this, org.telegram.messenger.qs.Y1);
            org.telegram.messenger.qs.f(this.f38561s).n(this, org.telegram.messenger.qs.Z1);
            org.telegram.messenger.qs.f(this.f38561s).n(this, org.telegram.messenger.qs.X1);
        }
    }

    @Override
    public final void updateColors() {
        boolean z9;
        boolean z10;
        int x02;
        ScrollView scrollView;
        GradientDrawable gradientDrawable = this.f38564y;
        GradientDrawable gradientDrawable2 = this.f38563x;
        try {
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false);
            if (this.D) {
                if (x03 != this.E) {
                }
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28128s8, false);
                scrollView = this.f38558f;
                if (scrollView != null && (!this.D || x02 != this.F)) {
                    this.F = x02;
                    org.telegram.messenger.g0.z3(scrollView, x02);
                }
                this.D = true;
                invalidate();
            }
            this.E = x03;
            if (gradientDrawable2 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                gradientDrawable2.setColors(new int[]{x03, 0});
            }
            if (gradientDrawable != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                gradientDrawable.setColors(new int[]{x03, 0});
            }
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28128s8, false);
            scrollView = this.f38558f;
            if (scrollView != null) {
                this.F = x02;
                org.telegram.messenger.g0.z3(scrollView, x02);
            }
            this.D = true;
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
