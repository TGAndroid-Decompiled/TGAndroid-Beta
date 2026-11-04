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
public final class t9 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public int F;
    public int G;
    public TextView f38353a;
    public TextView f38354b;
    public ai.o2 f38355c;
    public ai.o2 d;
    public gh0 f38356e;
    public ScrollView f38357f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate f38358n;
    public String f38359r;
    public int f38360s;
    public int f38361w;
    public GradientDrawable f38362x;
    public GradientDrawable f38363y;

    public final void a(boolean z10) {
        ai.o2 o2Var = this.d;
        TextView textView = this.f38354b;
        ai.o2 o2Var2 = this.f38355c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        if (z10) {
            o2Var2.setVisibility(0);
            o2Var.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, property3, 0.1f), ObjectAnimator.ofFloat(textView, property2, 0.1f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(o2Var2, property3, 1.0f), ObjectAnimator.ofFloat(o2Var2, property2, 1.0f), ObjectAnimator.ofFloat(o2Var2, property, 1.0f));
        } else {
            textView.setVisibility(0);
            o2Var.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(o2Var2, property3, 0.1f), ObjectAnimator.ofFloat(o2Var2, property2, 0.1f), ObjectAnimator.ofFloat(o2Var2, property, 0.0f), ObjectAnimator.ofFloat(textView, property3, 1.0f), ObjectAnimator.ofFloat(textView, property2, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f));
        }
        this.h.addListener(new s9(0, this, z10));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.Y1) {
            String str = (String) objArr[0];
            String str2 = this.f38359r;
            if (str2 != null && str2.equals(str)) {
                a(false);
                org.telegram.messenger.t0.f25456a.v((Activity) getContext(), this.f38358n.document);
            }
        } else if (i3 == org.telegram.messenger.hs.Z1) {
            String str3 = (String) objArr[0];
            String str4 = this.f38359r;
            if (str4 != null && str4.equals(str3)) {
                a(false);
            }
        } else if (i3 == org.telegram.messenger.hs.X1) {
            String str5 = (String) objArr[0];
            String str6 = this.f38359r;
            if (str6 != null && str6.equals(str5)) {
                this.f38356e.e(true, Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.f38362x;
        ScrollView scrollView = this.f38357f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), org.telegram.messenger.g0.L(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.f38363y;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - org.telegram.messenger.g0.L(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 == 8) {
            org.telegram.messenger.hs.f(this.f38360s).n(this, org.telegram.messenger.hs.Y1);
            org.telegram.messenger.hs.f(this.f38360s).n(this, org.telegram.messenger.hs.Z1);
            org.telegram.messenger.hs.f(this.f38360s).n(this, org.telegram.messenger.hs.X1);
        }
    }

    @Override
    public final void updateColors() {
        boolean z10;
        boolean z11;
        int x02;
        ScrollView scrollView;
        GradientDrawable gradientDrawable = this.f38363y;
        GradientDrawable gradientDrawable2 = this.f38362x;
        try {
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
            if (this.E) {
                if (x03 != this.F) {
                }
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28160s8, false);
                scrollView = this.f38357f;
                if (scrollView != null && (!this.E || x02 != this.G)) {
                    this.G = x02;
                    org.telegram.messenger.g0.z3(scrollView, x02);
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
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28160s8, false);
            scrollView = this.f38357f;
            if (scrollView != null) {
                this.G = x02;
                org.telegram.messenger.g0.z3(scrollView, x02);
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
