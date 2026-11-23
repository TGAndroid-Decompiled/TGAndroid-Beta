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
public abstract class r51 extends org.telegram.ui.ActionBar.w2 {
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
    public final yy M1;
    public final boolean N1;
    public TextView f39080m1;
    public final FrameLayout n1;
    public final di.b1 f39081o1;
    public dk0 f39082p1;
    public dk0 f39083q1;
    public final Drawable f39084r1;
    public final View f39085s1;
    public AnimatorSet f39086t1;
    public final nv0 f39087u1;
    public final yz f39088v1;
    public final q51 f39089w1;
    public final RectF f39090x1;
    public int f39091y1;
    public float f39092z1;

    static {
        new org.telegram.ui.Cells.p8("colorProgress", 10);
    }

    public r51(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.f39090x1 = new RectF();
        this.B1 = true;
        this.C1 = true;
        this.D1 = org.telegram.ui.ActionBar.m6.zj;
        this.E1 = org.telegram.ui.ActionBar.m6.f29473i6;
        int i10 = org.telegram.ui.ActionBar.m6.f29316a;
        int i11 = org.telegram.ui.ActionBar.m6.f29381d6;
        this.F1 = i11;
        this.G1 = i11;
        this.H1 = org.telegram.ui.ActionBar.m6.G6;
        int i12 = org.telegram.ui.ActionBar.m6.f29773y6;
        this.I1 = i12;
        this.J1 = i12;
        int i13 = org.telegram.ui.ActionBar.m6.Q5;
        this.K1 = i13;
        this.L1 = i13;
        this.N1 = true;
        this.J0 = h6Var;
        Q0();
        this.f30205q0 = 75;
        this.f30173a = i7;
        this.f39084r1 = i5.c.g(context, 2131232730);
        p51 J0 = J0(context);
        this.f30176b = J0;
        J0.setWillNotDraw(false);
        this.f30176b.setClipChildren(false);
        ViewGroup viewGroup = this.f30176b;
        int i14 = this.f30211u0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n1 = frameLayout;
        q51 q51Var = new q51(this, context, h6Var);
        this.f39089w1 = q51Var;
        q51Var.f34646y = true;
        q51Var.updateColors();
        q51Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(q51Var, c8.ma.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        yz yzVar = new yz(context, null);
        this.f39088v1 = yzVar;
        yzVar.setViewType(6);
        yzVar.f42605x = false;
        yzVar.setUseHeaderOffset(true);
        nv0 nv0Var = new nv0(context, yzVar, 1, null);
        this.f39087u1 = nv0Var;
        nv0Var.addView(yzVar, 0, c8.ma.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String N0 = org.telegram.messenger.hd.N0(2131747974, null);
        xh.l lVar = nv0Var.d;
        lVar.setText(N0);
        String N02 = org.telegram.messenger.hd.N0(2131745611, null);
        m80 m80Var = nv0Var.f37995e;
        m80Var.setText(N02);
        nv0Var.setVisibility(8);
        nv0Var.setAnimateLayoutChange(true);
        nv0Var.e(true, false);
        int i15 = this.H1;
        int i16 = this.I1;
        int i17 = this.F1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.h6 h6Var2 = nv0Var.f37997n;
        org.telegram.ui.ActionBar.t6.U(lVar, i15, h6Var2);
        m80Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.t6.U(m80Var, i16, h6Var2);
        nv0Var.H = i17;
        this.f30176b.addView(nv0Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, h6Var, 28);
        this.f39081o1 = b1Var;
        b1Var.setOverScrollMode(2);
        b1Var.setTag(13);
        b1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        b1Var.setClipToPadding(false);
        b1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.t6.l(b1Var, 20, this.E1, h6Var);
        getContext();
        yy yyVar = new yy(org.telegram.messenger.g0.L(8.0f), 0, b1Var);
        this.M1 = yyVar;
        yyVar.P = false;
        b1Var.setLayoutManager(yyVar);
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        this.f30176b.addView(b1Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b1Var.setOnScrollListener(new oa(this, 22));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.f39085s1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.f30176b.addView(view, layoutParams);
        this.f30176b.addView(frameLayout, c8.ma.e(-1, 58, 51));
        N0(0.0f);
        b1Var.setEmptyView(nv0Var);
        b1Var.X1 = true;
        b1Var.Y1 = 0;
    }

    @Override
    public final boolean G() {
        return false;
    }

    public p51 J0(Context context) {
        return new p51(this, context);
    }

    public abstract void K0(MotionEvent motionEvent, ah.i iVar);

    public final void L0(boolean z10) {
        Integer num;
        float f10;
        View view = this.f39085s1;
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
            AnimatorSet animatorSet = this.f39086t1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f39086t1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f39086t1.setDuration(150L);
            this.f39086t1.addListener(new org.telegram.ui.on(26, this, z10));
            this.f39086t1.start();
        }
    }

    public abstract void M0(String str);

    public final void N0(float f10) {
        int i7;
        this.f39092z1 = f10;
        this.A1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.w0(this.F1, this.J0), org.telegram.ui.ActionBar.m6.w0(this.G1, this.J0));
        this.f39084r1.setColorFilter(new PorterDuffColorFilter(this.A1, PorterDuff.Mode.MULTIPLY));
        P(this.A1);
        int i10 = this.A1;
        this.H0 = i10;
        di.b1 b1Var = this.f39081o1;
        b1Var.setGlowColor(i10);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, this.J1, false), org.telegram.ui.ActionBar.m6.x0(null, this.I1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, this.L1, false), org.telegram.ui.ActionBar.m6.x0(null, this.K1, false));
        int childCount = b1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = b1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.a4) {
                ((org.telegram.ui.Cells.a4) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                if (this.f39085s1.getTag() != null) {
                    i7 = this.K1;
                } else {
                    i7 = this.L1;
                }
                g4Var.f(i7, S02);
            }
        }
        this.f30176b.invalidate();
        b1Var.invalidate();
        this.f30179c.invalidate();
    }

    public void O0(int i7) {
        this.f39081o1.setTopGlowOffset(i7);
        float f10 = i7;
        this.n1.setTranslationY(f10);
        this.f39087u1.setTranslationY(f10);
        this.f30176b.invalidate();
    }

    public final void P0(int i7) {
        if (!isShowing()) {
            return;
        }
        this.f39081o1.getViewTreeObserver().addOnPreDrawListener(new lr0(this, i7, 1));
    }

    public void R0() {
        int i7;
        int i10;
        di.b1 b1Var = this.f39081o1;
        if (b1Var.getChildCount() > 0) {
            v4.f1 K = b1Var.K(0);
            if (K != null) {
                i7 = K.f59165a.getTop() - org.telegram.messenger.g0.L(8.0f);
            } else {
                i7 = 0;
            }
            if (i7 > 0 && K != null && K.b() == 0) {
                i10 = i7;
            } else {
                i10 = 0;
            }
            if (i7 >= 0 && K != null && K.b() == 0) {
                L0(false);
            } else {
                L0(true);
                i7 = i10;
            }
            if (this.f39091y1 != i7) {
                this.f39091y1 = i7;
                O0(i7);
            }
        }
    }

    @Override
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.f39089w1.K);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i7;
        if (this.f39080m1 == null) {
            TextView textView = new TextView(getContext());
            this.f39080m1 = textView;
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, this.J0);
            this.f39080m1.setTextSize(1, 20.0f);
            this.f39080m1.setTypeface(org.telegram.messenger.g0.o());
            this.f39080m1.setLines(1);
            this.f39080m1.setMaxLines(1);
            this.f39080m1.setSingleLine(true);
            TextView textView2 = this.f39080m1;
            if (org.telegram.messenger.hd.f24444a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView2.setGravity(i7 | 16);
            this.f39080m1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f39080m1;
            FrameLayout.LayoutParams d = c8.ma.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.n1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f39089w1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.f39080m1.setText(charSequence);
    }

    public void Q0() {
    }
}
