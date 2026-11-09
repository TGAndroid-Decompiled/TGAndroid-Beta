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
public abstract class c51 extends org.telegram.ui.ActionBar.v2 {
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
    public TextView f32528i1;
    public final FrameLayout f32529j1;
    public final bi.q1 f32530k1;
    public pj0 l1;
    public pj0 f32531m1;
    public final Drawable n1;
    public final View f32532o1;
    public AnimatorSet f32533p1;
    public final cv0 f32534q1;
    public final mz f32535r1;
    public final b51 f32536s1;
    public final RectF f32537t1;
    public int f32538u1;
    public float f32539v1;
    public int f32540w1;
    public boolean f32541x1;
    public boolean f32542y1;
    public int f32543z1;

    static {
        new org.telegram.ui.Cells.o8("colorProgress", 10);
    }

    public c51(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.f32537t1 = new RectF();
        this.f32541x1 = true;
        this.f32542y1 = true;
        this.f32543z1 = org.telegram.ui.ActionBar.l6.wj;
        this.A1 = org.telegram.ui.ActionBar.l6.f27957i6;
        int i10 = org.telegram.ui.ActionBar.l6.f27801a;
        int i11 = org.telegram.ui.ActionBar.l6.f27865d6;
        this.B1 = i11;
        this.C1 = i11;
        this.D1 = org.telegram.ui.ActionBar.l6.G6;
        int i12 = org.telegram.ui.ActionBar.l6.f28257y6;
        this.E1 = i12;
        this.F1 = i12;
        int i13 = org.telegram.ui.ActionBar.l6.Q5;
        this.G1 = i13;
        this.H1 = i13;
        this.J1 = true;
        this.I0 = g6Var;
        P0();
        this.f28648p0 = 75;
        this.f28621a = i7;
        this.n1 = jg.g.h(context, 2131232728);
        a51 I0 = I0(context);
        this.f28624b = I0;
        I0.setWillNotDraw(false);
        this.f28624b.setClipChildren(false);
        ViewGroup viewGroup = this.f28624b;
        int i14 = this.f28654t0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32529j1 = frameLayout;
        b51 b51Var = new b51(this, context, g6Var);
        this.f32536s1 = b51Var;
        b51Var.f37861y = true;
        b51Var.updateColors();
        b51Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(b51Var, c8.ha.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        mz mzVar = new mz(context, null);
        this.f32535r1 = mzVar;
        mzVar.setViewType(6);
        mzVar.f36181x = false;
        mzVar.setUseHeaderOffset(true);
        cv0 cv0Var = new cv0(context, mzVar, 1, null);
        this.f32534q1 = cv0Var;
        cv0Var.addView(mzVar, 0, c8.ha.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = org.telegram.messenger.id.M0(2131748167, null);
        xh.l lVar = cv0Var.d;
        lVar.setText(M0);
        String M02 = org.telegram.messenger.id.M0(2131745807, null);
        x70 x70Var = cv0Var.f32768e;
        x70Var.setText(M02);
        cv0Var.setVisibility(8);
        cv0Var.setAnimateLayoutChange(true);
        cv0Var.e(true, false);
        int i15 = this.D1;
        int i16 = this.E1;
        int i17 = this.B1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.g6 g6Var2 = cv0Var.f32770n;
        org.telegram.ui.ActionBar.s6.U(lVar, i15, g6Var2);
        x70Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.s6.U(x70Var, i16, g6Var2);
        cv0Var.G = i17;
        this.f28624b.addView(cv0Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, g6Var, 28);
        this.f32530k1 = q1Var;
        q1Var.setOverScrollMode(2);
        q1Var.setTag(13);
        q1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        q1Var.setClipToPadding(false);
        q1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.s6.l(q1Var, 20, this.A1, g6Var);
        getContext();
        my myVar = new my(org.telegram.messenger.g0.L(8.0f), 0, q1Var);
        this.I1 = myVar;
        myVar.P = false;
        q1Var.setLayoutManager(myVar);
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        this.f28624b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        q1Var.setOnScrollListener(new ui(this, 19));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.f32532o1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.f28624b.addView(view, layoutParams);
        this.f28624b.addView(frameLayout, c8.ha.e(-1, 58, 51));
        M0(0.0f);
        q1Var.setEmptyView(cv0Var);
        q1Var.W1 = true;
        q1Var.X1 = 0;
    }

    @Override
    public final boolean G() {
        return false;
    }

    public a51 I0(Context context) {
        return new a51(this, context);
    }

    public abstract void J0(MotionEvent motionEvent, ah.i iVar);

    public final void K0(boolean z9) {
        Integer num;
        float f10;
        View view = this.f32532o1;
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
            AnimatorSet animatorSet = this.f32533p1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32533p1 = animatorSet2;
            Property property = View.ALPHA;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f32533p1.setDuration(150L);
            this.f32533p1.addListener(new t9(25, this, z9));
            this.f32533p1.start();
        }
    }

    public abstract void L0(String str);

    public final void M0(float f10) {
        int i7;
        this.f32539v1 = f10;
        this.f32540w1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.w0(this.B1, this.I0), org.telegram.ui.ActionBar.l6.w0(this.C1, this.I0));
        this.n1.setColorFilter(new PorterDuffColorFilter(this.f32540w1, PorterDuff.Mode.MULTIPLY));
        O(this.f32540w1);
        int i10 = this.f32540w1;
        this.G0 = i10;
        bi.q1 q1Var = this.f32530k1;
        q1Var.setGlowColor(i10);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, this.F1, false), org.telegram.ui.ActionBar.l6.x0(null, this.E1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, this.H1, false), org.telegram.ui.ActionBar.l6.x0(null, this.G1, false));
        int childCount = q1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = q1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                if (this.f32532o1.getTag() != null) {
                    i7 = this.G1;
                } else {
                    i7 = this.H1;
                }
                f4Var.f(i7, S02);
            }
        }
        this.f28624b.invalidate();
        q1Var.invalidate();
        this.f28627c.invalidate();
    }

    public void N0(int i7) {
        this.f32530k1.setTopGlowOffset(i7);
        float f10 = i7;
        this.f32529j1.setTranslationY(f10);
        this.f32534q1.setTranslationY(f10);
        this.f28624b.invalidate();
    }

    public final void O0(int i7) {
        if (!isShowing()) {
            return;
        }
        this.f32530k1.getViewTreeObserver().addOnPreDrawListener(new br0(this, i7, 1));
    }

    public void Q0() {
        int i7;
        int i10;
        bi.q1 q1Var = this.f32530k1;
        if (q1Var.getChildCount() > 0) {
            v4.d1 K = q1Var.K(0);
            if (K != null) {
                i7 = K.f57056a.getTop() - org.telegram.messenger.g0.L(8.0f);
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
            if (this.f32538u1 != i7) {
                this.f32538u1 = i7;
                N0(i7);
            }
        }
    }

    @Override
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.f32536s1.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i7;
        if (this.f32528i1 == null) {
            TextView textView = new TextView(getContext());
            this.f32528i1 = textView;
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, this.I0);
            this.f32528i1.setTextSize(1, 20.0f);
            this.f32528i1.setTypeface(org.telegram.messenger.g0.o());
            this.f32528i1.setLines(1);
            this.f32528i1.setMaxLines(1);
            this.f32528i1.setSingleLine(true);
            TextView textView2 = this.f32528i1;
            if (org.telegram.messenger.id.f23157a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView2.setGravity(i7 | 16);
            this.f32528i1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f32528i1;
            FrameLayout.LayoutParams d = c8.ha.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f32529j1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f32536s1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.f32528i1.setText(charSequence);
    }

    public void P0() {
    }
}
