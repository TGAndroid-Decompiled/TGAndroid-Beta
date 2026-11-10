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
public abstract class c51 extends org.telegram.ui.ActionBar.w2 {
    public boolean A1;
    public boolean B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public final ly L1;
    public final boolean M1;
    public TextView l1;
    public final FrameLayout f32463m1;
    public final bi.q1 n1;
    public oj0 f32464o1;
    public oj0 f32465p1;
    public final Drawable f32466q1;
    public final View f32467r1;
    public AnimatorSet f32468s1;
    public final bv0 f32469t1;
    public final lz f32470u1;
    public final b51 f32471v1;
    public final RectF f32472w1;
    public int f32473x1;
    public float f32474y1;
    public int f32475z1;

    static {
        new org.telegram.ui.Cells.o8("colorProgress", 10);
    }

    public c51(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.f32472w1 = new RectF();
        this.A1 = true;
        this.B1 = true;
        this.C1 = org.telegram.ui.ActionBar.m6.wj;
        this.D1 = org.telegram.ui.ActionBar.m6.f27982i6;
        int i10 = org.telegram.ui.ActionBar.m6.f27826a;
        int i11 = org.telegram.ui.ActionBar.m6.f27890d6;
        this.E1 = i11;
        this.F1 = i11;
        this.G1 = org.telegram.ui.ActionBar.m6.G6;
        int i12 = org.telegram.ui.ActionBar.m6.f28282y6;
        this.H1 = i12;
        this.I1 = i12;
        int i13 = org.telegram.ui.ActionBar.m6.Q5;
        this.J1 = i13;
        this.K1 = i13;
        this.M1 = true;
        this.I0 = h6Var;
        P0();
        this.f28699p0 = 75;
        this.f28669a = i7;
        this.f32466q1 = jg.g.h(context, 2131232728);
        a51 I0 = I0(context);
        this.f28672b = I0;
        I0.setWillNotDraw(false);
        this.f28672b.setClipChildren(false);
        ViewGroup viewGroup = this.f28672b;
        int i14 = this.f28705t0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32463m1 = frameLayout;
        b51 b51Var = new b51(this, context, h6Var);
        this.f32471v1 = b51Var;
        b51Var.f37450y = true;
        b51Var.updateColors();
        b51Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(b51Var, c8.ha.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        lz lzVar = new lz(context, null);
        this.f32470u1 = lzVar;
        lzVar.setViewType(6);
        lzVar.f35774x = false;
        lzVar.setUseHeaderOffset(true);
        bv0 bv0Var = new bv0(context, lzVar, 1, null);
        this.f32469t1 = bv0Var;
        bv0Var.addView(lzVar, 0, c8.ha.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = org.telegram.messenger.id.M0(2131748167, null);
        xh.l lVar = bv0Var.d;
        lVar.setText(M0);
        String M02 = org.telegram.messenger.id.M0(2131745807, null);
        w70 w70Var = bv0Var.f32368e;
        w70Var.setText(M02);
        bv0Var.setVisibility(8);
        bv0Var.setAnimateLayoutChange(true);
        bv0Var.e(true, false);
        int i15 = this.G1;
        int i16 = this.H1;
        int i17 = this.E1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.h6 h6Var2 = bv0Var.f32370n;
        org.telegram.ui.ActionBar.t6.U(lVar, i15, h6Var2);
        w70Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.t6.U(w70Var, i16, h6Var2);
        bv0Var.G = i17;
        this.f28672b.addView(bv0Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, h6Var, 28);
        this.n1 = q1Var;
        q1Var.setOverScrollMode(2);
        q1Var.setTag(13);
        q1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        q1Var.setClipToPadding(false);
        q1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.t6.l(q1Var, 20, this.D1, h6Var);
        getContext();
        ly lyVar = new ly(org.telegram.messenger.g0.L(8.0f), 0, q1Var);
        this.L1 = lyVar;
        lyVar.P = false;
        q1Var.setLayoutManager(lyVar);
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        this.f28672b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        q1Var.setOnScrollListener(new ti(this, 19));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.f32467r1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.f28672b.addView(view, layoutParams);
        this.f28672b.addView(frameLayout, c8.ha.e(-1, 58, 51));
        M0(0.0f);
        q1Var.setEmptyView(bv0Var);
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
        View view = this.f32467r1;
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
            AnimatorSet animatorSet = this.f32468s1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32468s1 = animatorSet2;
            Property property = View.ALPHA;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f32468s1.setDuration(150L);
            this.f32468s1.addListener(new s9(25, this, z9));
            this.f32468s1.start();
        }
    }

    public abstract void L0(String str);

    public final void M0(float f10) {
        int i7;
        this.f32474y1 = f10;
        this.f32475z1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.w0(this.E1, this.I0), org.telegram.ui.ActionBar.m6.w0(this.F1, this.I0));
        this.f32466q1.setColorFilter(new PorterDuffColorFilter(this.f32475z1, PorterDuff.Mode.MULTIPLY));
        O(this.f32475z1);
        int i10 = this.f32475z1;
        this.G0 = i10;
        bi.q1 q1Var = this.n1;
        q1Var.setGlowColor(i10);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, this.I1, false), org.telegram.ui.ActionBar.m6.x0(null, this.H1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, this.K1, false), org.telegram.ui.ActionBar.m6.x0(null, this.J1, false));
        int childCount = q1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = q1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                if (this.f32467r1.getTag() != null) {
                    i7 = this.J1;
                } else {
                    i7 = this.K1;
                }
                f4Var.f(i7, S02);
            }
        }
        this.f28672b.invalidate();
        q1Var.invalidate();
        this.f28675c.invalidate();
    }

    public void N0(int i7) {
        this.n1.setTopGlowOffset(i7);
        float f10 = i7;
        this.f32463m1.setTranslationY(f10);
        this.f32469t1.setTranslationY(f10);
        this.f28672b.invalidate();
    }

    public final void O0(int i7) {
        if (!isShowing()) {
            return;
        }
        this.n1.getViewTreeObserver().addOnPreDrawListener(new ar0(this, i7, 1));
    }

    public void Q0() {
        int i7;
        int i10;
        bi.q1 q1Var = this.n1;
        if (q1Var.getChildCount() > 0) {
            v4.d1 K = q1Var.K(0);
            if (K != null) {
                i7 = K.f57052a.getTop() - org.telegram.messenger.g0.L(8.0f);
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
            if (this.f32473x1 != i7) {
                this.f32473x1 = i7;
                N0(i7);
            }
        }
    }

    @Override
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.f32471v1.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i7;
        if (this.l1 == null) {
            TextView textView = new TextView(getContext());
            this.l1 = textView;
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, this.I0);
            this.l1.setTextSize(1, 20.0f);
            this.l1.setTypeface(org.telegram.messenger.g0.o());
            this.l1.setLines(1);
            this.l1.setMaxLines(1);
            this.l1.setSingleLine(true);
            TextView textView2 = this.l1;
            if (org.telegram.messenger.id.f23161a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView2.setGravity(i7 | 16);
            this.l1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.l1;
            FrameLayout.LayoutParams d = c8.ha.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f32463m1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f32471v1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.l1.setText(charSequence);
    }

    public void P0() {
    }
}
