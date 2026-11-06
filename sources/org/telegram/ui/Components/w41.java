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
public abstract class w41 extends org.telegram.ui.ActionBar.v2 {
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public final ly I1;
    public final boolean J1;
    public TextView f39831i1;
    public final FrameLayout f39832j1;
    public final bi.q1 f39833k1;
    public oj0 l1;
    public oj0 f39834m1;
    public final Drawable n1;
    public final View f39835o1;
    public AnimatorSet f39836p1;
    public final av0 f39837q1;
    public final lz f39838r1;
    public final v41 f39839s1;
    public final RectF f39840t1;
    public int f39841u1;
    public float f39842v1;
    public int f39843w1;
    public boolean f39844x1;
    public boolean f39845y1;
    public int f39846z1;

    static {
        new org.telegram.ui.Cells.o8("colorProgress", 10);
    }

    public w41(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.f39840t1 = new RectF();
        this.f39844x1 = true;
        this.f39845y1 = true;
        this.f39846z1 = org.telegram.ui.ActionBar.k6.wj;
        this.A1 = org.telegram.ui.ActionBar.k6.f27940i6;
        int i10 = org.telegram.ui.ActionBar.k6.f27784a;
        int i11 = org.telegram.ui.ActionBar.k6.f27848d6;
        this.B1 = i11;
        this.C1 = i11;
        this.D1 = org.telegram.ui.ActionBar.k6.G6;
        int i12 = org.telegram.ui.ActionBar.k6.f28240y6;
        this.E1 = i12;
        this.F1 = i12;
        int i13 = org.telegram.ui.ActionBar.k6.Q5;
        this.G1 = i13;
        this.H1 = i13;
        this.J1 = true;
        this.I0 = f6Var;
        P0();
        this.f28639p0 = 75;
        this.f28612a = i7;
        this.n1 = jg.g.h(context, 2131232728);
        u41 I0 = I0(context);
        this.f28615b = I0;
        I0.setWillNotDraw(false);
        this.f28615b.setClipChildren(false);
        ViewGroup viewGroup = this.f28615b;
        int i14 = this.f28645t0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39832j1 = frameLayout;
        v41 v41Var = new v41(this, context, f6Var);
        this.f39839s1 = v41Var;
        v41Var.f37561y = true;
        v41Var.updateColors();
        v41Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(v41Var, c8.ha.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        lz lzVar = new lz(context, null);
        this.f39838r1 = lzVar;
        lzVar.setViewType(6);
        lzVar.f35802x = false;
        lzVar.setUseHeaderOffset(true);
        av0 av0Var = new av0(context, lzVar, 1, null);
        this.f39837q1 = av0Var;
        av0Var.addView(lzVar, 0, c8.ha.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = org.telegram.messenger.hd.M0(2131748166, null);
        xh.l lVar = av0Var.d;
        lVar.setText(M0);
        String M02 = org.telegram.messenger.hd.M0(2131745808, null);
        w70 w70Var = av0Var.f31917e;
        w70Var.setText(M02);
        av0Var.setVisibility(8);
        av0Var.setAnimateLayoutChange(true);
        av0Var.e(true, false);
        int i15 = this.D1;
        int i16 = this.E1;
        int i17 = this.B1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.f6 f6Var2 = av0Var.f31919n;
        org.telegram.ui.ActionBar.r6.V(lVar, i15, f6Var2);
        w70Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.r6.V(w70Var, i16, f6Var2);
        av0Var.G = i17;
        this.f28615b.addView(av0Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, f6Var, 28);
        this.f39833k1 = q1Var;
        q1Var.setOverScrollMode(2);
        q1Var.setTag(13);
        q1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        q1Var.setClipToPadding(false);
        q1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.r6.m(q1Var, 20, this.A1, f6Var);
        getContext();
        ly lyVar = new ly(org.telegram.messenger.g0.L(8.0f), 0, q1Var);
        this.I1 = lyVar;
        lyVar.P = false;
        q1Var.setLayoutManager(lyVar);
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        this.f28615b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        q1Var.setOnScrollListener(new ui(this, 19));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.f39835o1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.f28615b.addView(view, layoutParams);
        this.f28615b.addView(frameLayout, c8.ha.e(-1, 58, 51));
        M0(0.0f);
        q1Var.setEmptyView(av0Var);
        q1Var.W1 = true;
        q1Var.X1 = 0;
    }

    @Override
    public final boolean G() {
        return false;
    }

    public u41 I0(Context context) {
        return new u41(this, context);
    }

    public abstract void J0(MotionEvent motionEvent, ah.i iVar);

    public final void K0(boolean z9) {
        Integer num;
        float f10;
        View view = this.f39835o1;
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
            AnimatorSet animatorSet = this.f39836p1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f39836p1 = animatorSet2;
            Property property = View.ALPHA;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f39836p1.setDuration(150L);
            this.f39836p1.addListener(new t9(25, this, z9));
            this.f39836p1.start();
        }
    }

    public abstract void L0(String str);

    public final void M0(float f10) {
        int i7;
        this.f39842v1 = f10;
        this.f39843w1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(this.B1, this.I0), org.telegram.ui.ActionBar.k6.w0(this.C1, this.I0));
        this.n1.setColorFilter(new PorterDuffColorFilter(this.f39843w1, PorterDuff.Mode.MULTIPLY));
        O(this.f39843w1);
        int i10 = this.f39843w1;
        this.G0 = i10;
        bi.q1 q1Var = this.f39833k1;
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
                if (this.f39835o1.getTag() != null) {
                    i7 = this.G1;
                } else {
                    i7 = this.H1;
                }
                f4Var.f(i7, S02);
            }
        }
        this.f28615b.invalidate();
        q1Var.invalidate();
        this.f28618c.invalidate();
    }

    public void N0(int i7) {
        this.f39833k1.setTopGlowOffset(i7);
        float f10 = i7;
        this.f39832j1.setTranslationY(f10);
        this.f39837q1.setTranslationY(f10);
        this.f28615b.invalidate();
    }

    public final void O0(int i7) {
        if (!isShowing()) {
            return;
        }
        this.f39833k1.getViewTreeObserver().addOnPreDrawListener(new zq0(this, i7, 1));
    }

    public void Q0() {
        int i7;
        int i10;
        bi.q1 q1Var = this.f39833k1;
        if (q1Var.getChildCount() > 0) {
            v4.d1 K = q1Var.K(0);
            if (K != null) {
                i7 = K.f56927a.getTop() - org.telegram.messenger.g0.L(8.0f);
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
            if (this.f39841u1 != i7) {
                this.f39841u1 = i7;
                N0(i7);
            }
        }
    }

    @Override
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.f39839s1.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i7;
        if (this.f39831i1 == null) {
            TextView textView = new TextView(getContext());
            this.f39831i1 = textView;
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, this.I0);
            this.f39831i1.setTextSize(1, 20.0f);
            this.f39831i1.setTypeface(org.telegram.messenger.g0.o());
            this.f39831i1.setLines(1);
            this.f39831i1.setMaxLines(1);
            this.f39831i1.setSingleLine(true);
            TextView textView2 = this.f39831i1;
            if (org.telegram.messenger.hd.f22871a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView2.setGravity(i7 | 16);
            this.f39831i1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f39831i1;
            FrameLayout.LayoutParams d = c8.ha.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f39832j1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f39839s1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.f39831i1.setText(charSequence);
    }

    public void P0() {
    }
}
