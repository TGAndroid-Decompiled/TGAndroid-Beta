package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public abstract class e51 extends org.telegram.ui.ActionBar.u2 {
    public int A1;
    public boolean B1;
    public boolean C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public int L1;
    public final qy M1;
    public final boolean N1;
    public TextView f34203m1;
    public final FrameLayout n1;
    public final di.c1 f34204o1;
    public tj0 f34205p1;
    public tj0 f34206q1;
    public final Drawable f34207r1;
    public final View f34208s1;
    public AnimatorSet f34209t1;
    public final cv0 f34210u1;
    public final pz f34211v1;
    public final d51 f34212w1;
    public final RectF f34213x1;
    public int f34214y1;
    public float f34215z1;

    static {
        new org.telegram.ui.Cells.n8("colorProgress", 10);
    }

    public e51(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.f34213x1 = new RectF();
        this.B1 = true;
        this.C1 = true;
        this.D1 = org.telegram.ui.ActionBar.j6.zj;
        this.E1 = org.telegram.ui.ActionBar.j6.f28941i6;
        int i10 = org.telegram.ui.ActionBar.j6.f28784a;
        int i11 = org.telegram.ui.ActionBar.j6.f28849d6;
        this.F1 = i11;
        this.G1 = i11;
        this.H1 = org.telegram.ui.ActionBar.j6.G6;
        int i12 = org.telegram.ui.ActionBar.j6.f29241y6;
        this.I1 = i12;
        this.J1 = i12;
        int i13 = org.telegram.ui.ActionBar.j6.Q5;
        this.K1 = i13;
        this.L1 = i13;
        this.N1 = true;
        this.J0 = e6Var;
        P0();
        this.f29711q0 = 75;
        this.f29679a = i7;
        this.f34207r1 = i5.c.g(context, 2131232729);
        c51 I0 = I0(context);
        this.f29682b = I0;
        I0.setWillNotDraw(false);
        this.f29682b.setClipChildren(false);
        ViewGroup viewGroup = this.f29682b;
        int i14 = this.f29717u0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n1 = frameLayout;
        d51 d51Var = new d51(this, context, e6Var);
        this.f34212w1 = d51Var;
        d51Var.f40206y = true;
        d51Var.updateColors();
        d51Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(d51Var, c8.ja.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        pz pzVar = new pz(context, null);
        this.f34211v1 = pzVar;
        pzVar.setViewType(6);
        pzVar.f38448x = false;
        pzVar.setUseHeaderOffset(true);
        cv0 cv0Var = new cv0(context, pzVar, 1, null);
        this.f34210u1 = cv0Var;
        cv0Var.addView(pzVar, 0, c8.ja.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = org.telegram.messenger.hd.M0(2131748167, null);
        xh.l lVar = cv0Var.d;
        lVar.setText(M0);
        String M02 = org.telegram.messenger.hd.M0(2131745807, null);
        z70 z70Var = cv0Var.f33707e;
        z70Var.setText(M02);
        cv0Var.setVisibility(8);
        cv0Var.setAnimateLayoutChange(true);
        cv0Var.e(true, false);
        int i15 = this.H1;
        int i16 = this.I1;
        int i17 = this.F1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.e6 e6Var2 = cv0Var.f33709n;
        org.telegram.ui.ActionBar.q6.U(lVar, i15, e6Var2);
        z70Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.q6.U(z70Var, i16, e6Var2);
        cv0Var.H = i17;
        this.f29682b.addView(cv0Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        di.c1 c1Var = new di.c1(this, context, e6Var, 28);
        this.f34204o1 = c1Var;
        c1Var.setOverScrollMode(2);
        c1Var.setTag(13);
        c1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        c1Var.setClipToPadding(false);
        c1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.q6.l(c1Var, 20, this.E1, e6Var);
        getContext();
        qy qyVar = new qy(org.telegram.messenger.g0.L(8.0f), 0, c1Var);
        this.M1 = qyVar;
        qyVar.P = false;
        c1Var.setLayoutManager(qyVar);
        c1Var.setHorizontalScrollBarEnabled(false);
        c1Var.setVerticalScrollBarEnabled(false);
        this.f29682b.addView(c1Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c1Var.setOnScrollListener(new ri(this, 21));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.f34208s1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.f29682b.addView(view, layoutParams);
        this.f29682b.addView(frameLayout, c8.ja.e(-1, 58, 51));
        M0(0.0f);
        c1Var.setEmptyView(cv0Var);
        c1Var.X1 = true;
        c1Var.Y1 = 0;
    }

    @Override
    public final boolean H() {
        return false;
    }

    public c51 I0(Context context) {
        return new c51(this, context);
    }

    public abstract void J0(MotionEvent motionEvent, ah.i iVar);

    public final void K0(boolean z10) {
        Integer num;
        float f10;
        View view = this.f34208s1;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z10) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.f34209t1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f34209t1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f34209t1.setDuration(150L);
            this.f34209t1.addListener(new org.telegram.ui.nn(26, this, z10));
            this.f34209t1.start();
        }
    }

    public abstract void L0(String str);

    public final void M0(float f10) {
        int i7;
        this.f34215z1 = f10;
        this.A1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.w0(this.F1, this.J0), org.telegram.ui.ActionBar.j6.w0(this.G1, this.J0));
        this.f34207r1.setColorFilter(new PorterDuffColorFilter(this.A1, PorterDuff.Mode.MULTIPLY));
        P(this.A1);
        int i10 = this.A1;
        this.H0 = i10;
        di.c1 c1Var = this.f34204o1;
        c1Var.setGlowColor(i10);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, this.J1, false), org.telegram.ui.ActionBar.j6.x0(null, this.I1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, this.L1, false), org.telegram.ui.ActionBar.j6.x0(null, this.K1, false));
        int childCount = c1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = c1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                if (this.f34208s1.getTag() != null) {
                    i7 = this.K1;
                } else {
                    i7 = this.L1;
                }
                f4Var.f(i7, S02);
            }
        }
        this.f29682b.invalidate();
        c1Var.invalidate();
        this.f29685c.invalidate();
    }

    public void N0(int i7) {
        this.f34204o1.setTopGlowOffset(i7);
        float f10 = i7;
        this.n1.setTranslationY(f10);
        this.f34210u1.setTranslationY(f10);
        this.f29682b.invalidate();
    }

    public final void O0(int i7) {
        if (!isShowing()) {
            return;
        }
        this.f34204o1.getViewTreeObserver().addOnPreDrawListener(new br0(this, i7, 1));
    }

    public void Q0() {
        int i7;
        int i10;
        di.c1 c1Var = this.f34204o1;
        if (c1Var.getChildCount() > 0) {
            v4.e1 K = c1Var.K(0);
            if (K != null) {
                i7 = K.f58535a.getTop() - org.telegram.messenger.g0.L(8.0f);
            } else {
                i7 = 0;
            }
            if (i7 > 0 && K != null && K.b() == 0) {
                i10 = i7;
            } else {
                i10 = 0;
            }
            if (i7 >= 0 && K != null && K.b() == 0) {
                K0(false);
            } else {
                K0(true);
                i7 = i10;
            }
            if (this.f34214y1 != i7) {
                this.f34214y1 = i7;
                N0(i7);
            }
        }
    }

    @Override
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.f34212w1.K);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i7;
        if (this.f34203m1 == null) {
            TextView textView = new TextView(getContext());
            this.f34203m1 = textView;
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, this.J0);
            this.f34203m1.setTextSize(1, 20.0f);
            this.f34203m1.setTypeface(org.telegram.messenger.g0.o());
            this.f34203m1.setLines(1);
            this.f34203m1.setMaxLines(1);
            this.f34203m1.setSingleLine(true);
            TextView textView2 = this.f34203m1;
            if (org.telegram.messenger.hd.f24101a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView2.setGravity(i7 | 16);
            this.f34203m1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f34203m1;
            FrameLayout.LayoutParams d = c8.ja.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.n1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f34212w1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.f34203m1.setText(charSequence);
    }

    public void P0() {
    }
}
