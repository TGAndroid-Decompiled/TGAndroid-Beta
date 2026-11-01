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
public final class o9 extends FrameLayout implements org.telegram.messenger.vs, org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public int E;
    public int F;
    public TextView f29062a;
    public TextView f29063b;
    public jg.l0 f29064c;
    public jg.l0 d;
    public gi0 e;
    public ScrollView f29065f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate f29066n;
    public String f29067r;
    public int f29068s;
    public int f29069w;
    public GradientDrawable f29070x;
    public GradientDrawable f29071y;

    public final void a(boolean z10) {
        jg.l0 l0Var = this.d;
        TextView textView = this.f29063b;
        jg.l0 l0Var2 = this.f29064c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        if (z10) {
            l0Var2.setVisibility(0);
            l0Var.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, property3, 0.1f), ObjectAnimator.ofFloat(textView, property2, 0.1f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(l0Var2, property3, 1.0f), ObjectAnimator.ofFloat(l0Var2, property2, 1.0f), ObjectAnimator.ofFloat(l0Var2, property, 1.0f));
        } else {
            textView.setVisibility(0);
            l0Var.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(l0Var2, property3, 0.1f), ObjectAnimator.ofFloat(l0Var2, property2, 0.1f), ObjectAnimator.ofFloat(l0Var2, property, 0.0f), ObjectAnimator.ofFloat(textView, property3, 1.0f), ObjectAnimator.ofFloat(textView, property2, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f));
        }
        this.h.addListener(new eg.m(16, this, z10));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.Y1) {
            String str = (String) objArr[0];
            String str2 = this.f29067r;
            if (str2 != null && str2.equals(str)) {
                a(false);
                org.telegram.messenger.w0.f18944a.v((Activity) getContext(), this.f29066n.document);
            }
        } else if (i10 == org.telegram.messenger.at.Z1) {
            String str3 = (String) objArr[0];
            String str4 = this.f29067r;
            if (str4 != null && str4.equals(str3)) {
                a(false);
            }
        } else if (i10 == org.telegram.messenger.at.X1) {
            String str5 = (String) objArr[0];
            String str6 = this.f29067r;
            if (str6 != null && str6.equals(str5)) {
                this.e.e(true, Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.f29070x;
        ScrollView scrollView = this.f29065f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), org.telegram.messenger.i0.L(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.f29071y;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - org.telegram.messenger.i0.L(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            org.telegram.messenger.at.f(this.f29068s).n(this, org.telegram.messenger.at.Y1);
            org.telegram.messenger.at.f(this.f29068s).n(this, org.telegram.messenger.at.Z1);
            org.telegram.messenger.at.f(this.f29068s).n(this, org.telegram.messenger.at.X1);
        }
    }

    @Override
    public final void updateColors() {
        boolean z10;
        boolean z11;
        int x02;
        ScrollView scrollView;
        GradientDrawable gradientDrawable = this.f29071y;
        GradientDrawable gradientDrawable2 = this.f29070x;
        try {
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false);
            if (this.D) {
                if (x03 != this.E) {
                }
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21207s8, false);
                scrollView = this.f29065f;
                if (scrollView != null && (!this.D || x02 != this.F)) {
                    this.F = x02;
                    org.telegram.messenger.i0.y3(scrollView, x02);
                }
                this.D = true;
                invalidate();
            }
            this.E = x03;
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
            x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21207s8, false);
            scrollView = this.f29065f;
            if (scrollView != null) {
                this.F = x02;
                org.telegram.messenger.i0.y3(scrollView, x02);
            }
            this.D = true;
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
