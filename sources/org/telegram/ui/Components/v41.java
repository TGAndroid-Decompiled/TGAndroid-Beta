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
public abstract class v41 extends org.telegram.ui.ActionBar.t2 {
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public final jy J1;
    public final boolean K1;
    public TextView f38993j1;
    public final FrameLayout k1;
    public final ci.j1 f38994l1;
    public sj0 m1;
    public sj0 f38995n1;
    public final Drawable f38996o1;
    public final View f38997p1;
    public AnimatorSet f38998q1;
    public final zu0 f38999r1;
    public final iz f39000s1;
    public final u41 f39001t1;
    public final RectF f39002u1;
    public int f39003v1;
    public float f39004w1;
    public int f39005x1;
    public boolean f39006y1;
    public boolean f39007z1;

    static {
        new org.telegram.ui.Cells.n8("colorProgress", 10);
    }

    public v41(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.f39002u1 = new RectF();
        this.f39006y1 = true;
        this.f39007z1 = true;
        this.A1 = org.telegram.ui.ActionBar.k6.wj;
        this.B1 = org.telegram.ui.ActionBar.k6.f27972i6;
        int i10 = org.telegram.ui.ActionBar.k6.f27816a;
        int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
        this.C1 = i11;
        this.D1 = i11;
        this.E1 = org.telegram.ui.ActionBar.k6.G6;
        int i12 = org.telegram.ui.ActionBar.k6.f28273y6;
        this.F1 = i12;
        this.G1 = i12;
        int i13 = org.telegram.ui.ActionBar.k6.Q5;
        this.H1 = i13;
        this.I1 = i13;
        this.K1 = true;
        this.J0 = e6Var;
        P0();
        this.f28612q0 = 75;
        this.f28583a = i3;
        this.f38996o1 = k2.p1.g(context, 2131232726);
        t41 I0 = I0(context);
        this.f28586b = I0;
        I0.setWillNotDraw(false);
        this.f28586b.setClipChildren(false);
        ViewGroup viewGroup = this.f28586b;
        int i14 = this.f28618u0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.k1 = frameLayout;
        u41 u41Var = new u41(this, context, e6Var);
        this.f39001t1 = u41Var;
        u41Var.f36306y = true;
        u41Var.updateColors();
        u41Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(u41Var, b8.mf.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        iz izVar = new iz(context, null);
        this.f39000s1 = izVar;
        izVar.setViewType(6);
        izVar.f34869x = false;
        izVar.setUseHeaderOffset(true);
        zu0 zu0Var = new zu0(context, izVar, 1, null);
        this.f38999r1 = zu0Var;
        zu0Var.addView(izVar, 0, b8.mf.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = org.telegram.messenger.bd.M0(2131748175, null);
        yh.l lVar = zu0Var.d;
        lVar.setText(M0);
        String M02 = org.telegram.messenger.bd.M0(2131745817, null);
        s70 s70Var = zu0Var.f41128e;
        s70Var.setText(M02);
        zu0Var.setVisibility(8);
        zu0Var.setAnimateLayoutChange(true);
        zu0Var.e(true, false);
        int i15 = this.E1;
        int i16 = this.F1;
        int i17 = this.C1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.e6 e6Var2 = zu0Var.f41130n;
        org.telegram.ui.ActionBar.r6.V(lVar, i15, e6Var2);
        s70Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.r6.V(s70Var, i16, e6Var2);
        zu0Var.H = i17;
        this.f28586b.addView(zu0Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 28);
        this.f38994l1 = j1Var;
        j1Var.setOverScrollMode(2);
        j1Var.setTag(13);
        j1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        j1Var.setClipToPadding(false);
        j1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.r6.m(j1Var, 20, this.B1, e6Var);
        getContext();
        jy jyVar = new jy(org.telegram.messenger.g0.L(8.0f), 0, j1Var);
        this.J1 = jyVar;
        jyVar.P = false;
        j1Var.setLayoutManager(jyVar);
        j1Var.setHorizontalScrollBarEnabled(false);
        j1Var.setVerticalScrollBarEnabled(false);
        this.f28586b.addView(j1Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        j1Var.setOnScrollListener(new ji(this, 21));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.f38997p1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.f28586b.addView(view, layoutParams);
        this.f28586b.addView(frameLayout, b8.mf.e(-1, 58, 51));
        M0(0.0f);
        j1Var.setEmptyView(zu0Var);
        j1Var.X1 = true;
        j1Var.Y1 = 0;
    }

    @Override
    public final boolean G() {
        return false;
    }

    public t41 I0(Context context) {
        return new t41(this, context);
    }

    public abstract void J0(MotionEvent motionEvent, bh.g gVar);

    public final void K0(boolean z10) {
        Integer num;
        float f10;
        View view = this.f38997p1;
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
            AnimatorSet animatorSet = this.f38998q1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f38998q1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f38998q1.setDuration(150L);
            this.f38998q1.addListener(new s9(25, this, z10));
            this.f38998q1.start();
        }
    }

    public abstract void L0(String str);

    public final void M0(float f10) {
        int i3;
        this.f39004w1 = f10;
        this.f39005x1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(this.C1, this.J0), org.telegram.ui.ActionBar.k6.w0(this.D1, this.J0));
        this.f38996o1.setColorFilter(new PorterDuffColorFilter(this.f39005x1, PorterDuff.Mode.MULTIPLY));
        O(this.f39005x1);
        int i10 = this.f39005x1;
        this.H0 = i10;
        ci.j1 j1Var = this.f38994l1;
        j1Var.setGlowColor(i10);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, this.G1, false), org.telegram.ui.ActionBar.k6.x0(null, this.F1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, this.I1, false), org.telegram.ui.ActionBar.k6.x0(null, this.H1, false));
        int childCount = j1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = j1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                if (this.f38997p1.getTag() != null) {
                    i3 = this.H1;
                } else {
                    i3 = this.I1;
                }
                f4Var.f(i3, S02);
            }
        }
        this.f28586b.invalidate();
        j1Var.invalidate();
        this.f28589c.invalidate();
    }

    public void N0(int i3) {
        this.f38994l1.setTopGlowOffset(i3);
        float f10 = i3;
        this.k1.setTranslationY(f10);
        this.f38999r1.setTranslationY(f10);
        this.f28586b.invalidate();
    }

    public final void O0(int i3) {
        if (!isShowing()) {
            return;
        }
        this.f38994l1.getViewTreeObserver().addOnPreDrawListener(new zq0(this, i3, 1));
    }

    public void Q0() {
        int i3;
        int i10;
        ci.j1 j1Var = this.f38994l1;
        if (j1Var.getChildCount() > 0) {
            u4.d1 K = j1Var.K(0);
            if (K != null) {
                i3 = K.f55540a.getTop() - org.telegram.messenger.g0.L(8.0f);
            } else {
                i3 = 0;
            }
            if (i3 > 0 && K != null && K.b() == 0) {
                i10 = i3;
            } else {
                i10 = 0;
            }
            if (i3 >= 0 && K != null && K.b() == 0) {
                K0(false);
            } else {
                K0(true);
                i3 = i10;
            }
            if (this.f39003v1 != i3) {
                this.f39003v1 = i3;
                N0(i3);
            }
        }
    }

    @Override
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.f39001t1.K);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i3;
        if (this.f38993j1 == null) {
            TextView textView = new TextView(getContext());
            this.f38993j1 = textView;
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, this.J0);
            this.f38993j1.setTextSize(1, 20.0f);
            this.f38993j1.setTypeface(org.telegram.messenger.g0.o());
            this.f38993j1.setLines(1);
            this.f38993j1.setMaxLines(1);
            this.f38993j1.setSingleLine(true);
            TextView textView2 = this.f38993j1;
            if (org.telegram.messenger.bd.f21784a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView2.setGravity(i3 | 16);
            this.f38993j1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f38993j1;
            FrameLayout.LayoutParams d = b8.mf.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.k1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f39001t1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.f38993j1.setText(charSequence);
    }

    public void P0() {
    }
}
