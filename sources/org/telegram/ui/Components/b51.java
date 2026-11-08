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
public abstract class b51 extends org.telegram.ui.ActionBar.v2 {
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public final my I1;
    public final boolean J1;
    public TextView f32041i1;
    public final FrameLayout f32042j1;
    public final bi.q1 f32043k1;
    public oj0 l1;
    public oj0 f32044m1;
    public final Drawable n1;
    public final View f32045o1;
    public AnimatorSet f32046p1;
    public final av0 f32047q1;
    public final mz f32048r1;
    public final a51 f32049s1;
    public final RectF f32050t1;
    public int f32051u1;
    public float f32052v1;
    public int f32053w1;
    public boolean f32054x1;
    public boolean f32055y1;
    public int f32056z1;

    static {
        new org.telegram.ui.Cells.o8("colorProgress", 10);
    }

    public b51(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.f32050t1 = new RectF();
        this.f32054x1 = true;
        this.f32055y1 = true;
        this.f32056z1 = org.telegram.ui.ActionBar.k6.wj;
        this.A1 = org.telegram.ui.ActionBar.k6.f27944i6;
        int i10 = org.telegram.ui.ActionBar.k6.f27788a;
        int i11 = org.telegram.ui.ActionBar.k6.f27852d6;
        this.B1 = i11;
        this.C1 = i11;
        this.D1 = org.telegram.ui.ActionBar.k6.G6;
        int i12 = org.telegram.ui.ActionBar.k6.f28244y6;
        this.E1 = i12;
        this.F1 = i12;
        int i13 = org.telegram.ui.ActionBar.k6.Q5;
        this.G1 = i13;
        this.H1 = i13;
        this.J1 = true;
        this.I0 = f6Var;
        P0();
        this.f28643p0 = 75;
        this.f28616a = i7;
        this.n1 = jg.g.h(context, 2131232728);
        z41 I0 = I0(context);
        this.f28619b = I0;
        I0.setWillNotDraw(false);
        this.f28619b.setClipChildren(false);
        ViewGroup viewGroup = this.f28619b;
        int i14 = this.f28649t0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32042j1 = frameLayout;
        a51 a51Var = new a51(this, context, f6Var);
        this.f32049s1 = a51Var;
        a51Var.f37828y = true;
        a51Var.updateColors();
        a51Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(a51Var, c8.ha.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        mz mzVar = new mz(context, null);
        this.f32048r1 = mzVar;
        mzVar.setViewType(6);
        mzVar.f36172x = false;
        mzVar.setUseHeaderOffset(true);
        av0 av0Var = new av0(context, mzVar, 1, null);
        this.f32047q1 = av0Var;
        av0Var.addView(mzVar, 0, c8.ha.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = org.telegram.messenger.id.M0(2131748168, null);
        xh.l lVar = av0Var.d;
        lVar.setText(M0);
        String M02 = org.telegram.messenger.id.M0(2131745810, null);
        w70 w70Var = av0Var.f31927e;
        w70Var.setText(M02);
        av0Var.setVisibility(8);
        av0Var.setAnimateLayoutChange(true);
        av0Var.e(true, false);
        int i15 = this.D1;
        int i16 = this.E1;
        int i17 = this.B1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.f6 f6Var2 = av0Var.f31929n;
        org.telegram.ui.ActionBar.r6.V(lVar, i15, f6Var2);
        w70Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.r6.V(w70Var, i16, f6Var2);
        av0Var.G = i17;
        this.f28619b.addView(av0Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, f6Var, 28);
        this.f32043k1 = q1Var;
        q1Var.setOverScrollMode(2);
        q1Var.setTag(13);
        q1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        q1Var.setClipToPadding(false);
        q1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.r6.m(q1Var, 20, this.A1, f6Var);
        getContext();
        my myVar = new my(org.telegram.messenger.g0.L(8.0f), 0, q1Var);
        this.I1 = myVar;
        myVar.P = false;
        q1Var.setLayoutManager(myVar);
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        this.f28619b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        q1Var.setOnScrollListener(new ui(this, 19));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.f32045o1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.f28619b.addView(view, layoutParams);
        this.f28619b.addView(frameLayout, c8.ha.e(-1, 58, 51));
        M0(0.0f);
        q1Var.setEmptyView(av0Var);
        q1Var.W1 = true;
        q1Var.X1 = 0;
    }

    @Override
    public final boolean G() {
        return false;
    }

    public z41 I0(Context context) {
        return new z41(this, context);
    }

    public abstract void J0(MotionEvent motionEvent, ah.i iVar);

    public final void K0(boolean z9) {
        Integer num;
        float f10;
        View view = this.f32045o1;
        if ((z9 && view.getTag() != null) || (!z9 && view.getTag() == null)) {
            if (z9) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z9) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.f32046p1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32046p1 = animatorSet2;
            Property property = View.ALPHA;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f32046p1.setDuration(150L);
            this.f32046p1.addListener(new t9(25, this, z9));
            this.f32046p1.start();
        }
    }

    public abstract void L0(String str);

    public final void M0(float f10) {
        int i7;
        this.f32052v1 = f10;
        this.f32053w1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(this.B1, this.I0), org.telegram.ui.ActionBar.k6.w0(this.C1, this.I0));
        this.n1.setColorFilter(new PorterDuffColorFilter(this.f32053w1, PorterDuff.Mode.MULTIPLY));
        O(this.f32053w1);
        int i10 = this.f32053w1;
        this.G0 = i10;
        bi.q1 q1Var = this.f32043k1;
        q1Var.setGlowColor(i10);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, this.F1, false), org.telegram.ui.ActionBar.k6.x0(null, this.E1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, this.H1, false), org.telegram.ui.ActionBar.k6.x0(null, this.G1, false));
        int childCount = q1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = q1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                if (this.f32045o1.getTag() != null) {
                    i7 = this.G1;
                } else {
                    i7 = this.H1;
                }
                f4Var.f(i7, S02);
            }
        }
        this.f28619b.invalidate();
        q1Var.invalidate();
        this.f28622c.invalidate();
    }

    public void N0(int i7) {
        this.f32043k1.setTopGlowOffset(i7);
        float f10 = i7;
        this.f32042j1.setTranslationY(f10);
        this.f32047q1.setTranslationY(f10);
        this.f28619b.invalidate();
    }

    public final void O0(int i7) {
        if (!isShowing()) {
            return;
        }
        this.f32043k1.getViewTreeObserver().addOnPreDrawListener(new zq0(this, i7, 1));
    }

    public void Q0() {
        int i7;
        int i10;
        bi.q1 q1Var = this.f32043k1;
        if (q1Var.getChildCount() > 0) {
            v4.d1 K = q1Var.K(0);
            if (K != null) {
                i7 = K.f57044a.getTop() - org.telegram.messenger.g0.L(8.0f);
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
            if (this.f32051u1 != i7) {
                this.f32051u1 = i7;
                N0(i7);
            }
        }
    }

    @Override
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.f32049s1.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i7;
        if (this.f32041i1 == null) {
            TextView textView = new TextView(getContext());
            this.f32041i1 = textView;
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, this.I0);
            this.f32041i1.setTextSize(1, 20.0f);
            this.f32041i1.setTypeface(org.telegram.messenger.g0.o());
            this.f32041i1.setLines(1);
            this.f32041i1.setMaxLines(1);
            this.f32041i1.setSingleLine(true);
            TextView textView2 = this.f32041i1;
            if (org.telegram.messenger.id.f23157a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView2.setGravity(i7 | 16);
            this.f32041i1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f32041i1;
            FrameLayout.LayoutParams d = c8.ha.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f32042j1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f32049s1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.f32041i1.setText(charSequence);
    }

    public void P0() {
    }
}
