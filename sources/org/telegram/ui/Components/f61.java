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
public abstract class f61 extends org.telegram.ui.ActionBar.z2 {
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public final az I1;
    public final boolean J1;
    public TextView f26086i1;
    public final FrameLayout f26087j1;
    public final ag.b1 f26088k1;
    public tk0 l1;
    public tk0 f26089m1;
    public final Drawable f26090n1;
    public final View f26091o1;
    public AnimatorSet f26092p1;
    public final ew0 f26093q1;
    public final zz f26094r1;
    public final e61 f26095s1;
    public final RectF f26096t1;
    public int f26097u1;
    public float f26098v1;
    public int f26099w1;
    public boolean f26100x1;
    public boolean f26101y1;
    public int f26102z1;

    static {
        new mh.g("colorProgress", 12);
    }

    public f61(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        this.f26096t1 = new RectF();
        this.f26100x1 = true;
        this.f26101y1 = true;
        this.f26102z1 = org.telegram.ui.ActionBar.t6.wj;
        this.A1 = org.telegram.ui.ActionBar.t6.f21021i6;
        int i11 = org.telegram.ui.ActionBar.t6.f20866a;
        int i12 = org.telegram.ui.ActionBar.t6.f20930d6;
        this.B1 = i12;
        this.C1 = i12;
        this.D1 = org.telegram.ui.ActionBar.t6.G6;
        int i13 = org.telegram.ui.ActionBar.t6.f21312y6;
        this.E1 = i13;
        this.F1 = i13;
        int i14 = org.telegram.ui.ActionBar.t6.Q5;
        this.G1 = i14;
        this.H1 = i14;
        this.J1 = true;
        this.I0 = p6Var;
        P0();
        this.f21610p0 = 75;
        this.f21584a = i10;
        this.f26090n1 = i0.a.f(context, 2131232725);
        d61 I0 = I0(context);
        this.f21587b = I0;
        I0.setWillNotDraw(false);
        this.f21587b.setClipChildren(false);
        ViewGroup viewGroup = this.f21587b;
        int i15 = this.f21616t0;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26087j1 = frameLayout;
        e61 e61Var = new e61(this, context, p6Var);
        this.f26095s1 = e61Var;
        e61Var.f26639y = true;
        e61Var.updateColors();
        e61Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        frameLayout.addView(e61Var, w7.b6.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        zz zzVar = new zz(context, null);
        this.f26094r1 = zzVar;
        zzVar.setViewType(6);
        zzVar.f33280x = false;
        zzVar.setUseHeaderOffset(true);
        ew0 ew0Var = new ew0(context, zzVar, 1, null);
        this.f26093q1 = ew0Var;
        ew0Var.addView(zzVar, 0, w7.b6.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String L0 = org.telegram.messenger.dd.L0(2131748183, null);
        nh.p pVar = ew0Var.d;
        pVar.setText(L0);
        String L02 = org.telegram.messenger.dd.L0(2131745824, null);
        p80 p80Var = ew0Var.e;
        p80Var.setText(L02);
        ew0Var.setVisibility(8);
        ew0Var.setAnimateLayoutChange(true);
        ew0Var.e(true, false);
        int i16 = this.D1;
        int i17 = this.E1;
        int i18 = this.B1;
        pVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.p6 p6Var2 = ew0Var.f25950n;
        org.telegram.ui.ActionBar.a7.V(pVar, i16, p6Var2);
        p80Var.setTag(Integer.valueOf(i17));
        org.telegram.ui.ActionBar.a7.V(p80Var, i17, p6Var2);
        ew0Var.G = i18;
        this.f21587b.addView(ew0Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ag.b1 b1Var = new ag.b1(this, context, p6Var, 23);
        this.f26088k1 = b1Var;
        b1Var.setOverScrollMode(2);
        b1Var.setTag(13);
        b1Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
        b1Var.setClipToPadding(false);
        b1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.a7.m(b1Var, 20, this.A1, p6Var);
        getContext();
        az azVar = new az(org.telegram.messenger.i0.L(8.0f), 0, b1Var);
        this.I1 = azVar;
        azVar.P = false;
        b1Var.setLayoutManager(azVar);
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        this.f21587b.addView(b1Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b1Var.setOnScrollListener(new cu0(this, 4));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.i0.L(58.0f);
        View view = new View(context);
        this.f26091o1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.f21587b.addView(view, layoutParams);
        this.f21587b.addView(frameLayout, w7.b6.e(-1, 58, 51));
        M0(0.0f);
        b1Var.setEmptyView(ew0Var);
        b1Var.W1 = true;
        b1Var.X1 = 0;
    }

    @Override
    public final boolean H() {
        return false;
    }

    public d61 I0(Context context) {
        return new d61(this, context);
    }

    public abstract void J0(MotionEvent motionEvent, org.telegram.ui.ActionBar.n0 n0Var);

    public final void K0(boolean z10) {
        Integer num;
        float f7;
        View view = this.f26091o1;
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
            AnimatorSet animatorSet = this.f26092p1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f26092p1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f26092p1.setDuration(150L);
            this.f26092p1.addListener(new ha0(11, this, z10));
            this.f26092p1.start();
        }
    }

    public abstract void L0(String str);

    public final void M0(float f7) {
        int i10;
        this.f26098v1 = f7;
        this.f26099w1 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(this.B1, this.I0), org.telegram.ui.ActionBar.t6.w0(this.C1, this.I0));
        this.f26090n1.setColorFilter(new PorterDuffColorFilter(this.f26099w1, PorterDuff.Mode.MULTIPLY));
        P(this.f26099w1);
        int i11 = this.f26099w1;
        this.G0 = i11;
        ag.b1 b1Var = this.f26088k1;
        b1Var.setGlowColor(i11);
        int S0 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, this.F1, false), org.telegram.ui.ActionBar.t6.x0(null, this.E1, false));
        int S02 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, this.H1, false), org.telegram.ui.ActionBar.t6.x0(null, this.G1, false));
        int childCount = b1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = b1Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                ((org.telegram.ui.Cells.b4) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.h4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                if (this.f26091o1.getTag() != null) {
                    i10 = this.G1;
                } else {
                    i10 = this.H1;
                }
                h4Var.f(i10, S02);
            }
        }
        this.f21587b.invalidate();
        b1Var.invalidate();
        this.f21590c.invalidate();
    }

    public void N0(int i10) {
        this.f26088k1.setTopGlowOffset(i10);
        float f7 = i10;
        this.f26087j1.setTranslationY(f7);
        this.f26093q1.setTranslationY(f7);
        this.f21587b.invalidate();
    }

    public final void O0(int i10) {
        if (!isShowing()) {
            return;
        }
        this.f26088k1.getViewTreeObserver().addOnPreDrawListener(new bs0(this, i10, 1));
    }

    public void Q0() {
        int i10;
        int i11;
        ag.b1 b1Var = this.f26088k1;
        if (b1Var.getChildCount() > 0) {
            s4.c1 K = b1Var.K(0);
            if (K != null) {
                i10 = K.f47909a.getTop() - org.telegram.messenger.i0.L(8.0f);
            } else {
                i10 = 0;
            }
            if (i10 > 0 && K != null && K.b() == 0) {
                i11 = i10;
            } else {
                i11 = 0;
            }
            if (i10 >= 0 && K != null && K.b() == 0) {
                K0(false);
            } else {
                K0(true);
                i10 = i11;
            }
            if (this.f26097u1 != i10) {
                this.f26097u1 = i10;
                N0(i10);
            }
        }
    }

    @Override
    public void dismiss() {
        org.telegram.messenger.i0.v1(this.f26095s1.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f26086i1 == null) {
            TextView textView = new TextView(getContext());
            this.f26086i1 = textView;
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, this.I0);
            this.f26086i1.setTextSize(1, 20.0f);
            this.f26086i1.setTypeface(org.telegram.messenger.i0.o());
            this.f26086i1.setLines(1);
            this.f26086i1.setMaxLines(1);
            this.f26086i1.setSingleLine(true);
            TextView textView2 = this.f26086i1;
            if (org.telegram.messenger.dd.X) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f26086i1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f26086i1;
            FrameLayout.LayoutParams d = w7.b6.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f26087j1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f26095s1.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.i0.L(94.0f);
        }
        this.f26086i1.setText(charSequence);
    }

    public void P0() {
    }
}
