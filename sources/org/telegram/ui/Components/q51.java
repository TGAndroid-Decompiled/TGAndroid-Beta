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
public abstract class q51 extends org.telegram.ui.ActionBar.w2 {
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
    public final vy M1;
    public final boolean N1;
    public TextView f38697m1;
    public final FrameLayout n1;
    public final di.b1 f38698o1;
    public dk0 f38699p1;
    public dk0 f38700q1;
    public final Drawable f38701r1;
    public final View f38702s1;
    public AnimatorSet f38703t1;
    public final mv0 f38704u1;
    public final vz f38705v1;
    public final p51 f38706w1;
    public final RectF f38707x1;
    public int f38708y1;
    public float f38709z1;

    static {
        new org.telegram.ui.Cells.o8("colorProgress", 10);
    }

    public q51(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        this.f38707x1 = new RectF();
        this.B1 = true;
        this.C1 = true;
        this.D1 = org.telegram.ui.ActionBar.n6.zj;
        this.E1 = org.telegram.ui.ActionBar.n6.f29543i6;
        int i10 = org.telegram.ui.ActionBar.n6.f29386a;
        int i11 = org.telegram.ui.ActionBar.n6.f29451d6;
        this.F1 = i11;
        this.G1 = i11;
        this.H1 = org.telegram.ui.ActionBar.n6.G6;
        int i12 = org.telegram.ui.ActionBar.n6.f29843y6;
        this.I1 = i12;
        this.J1 = i12;
        int i13 = org.telegram.ui.ActionBar.n6.Q5;
        this.K1 = i13;
        this.L1 = i13;
        this.N1 = true;
        this.J0 = i6Var;
        Q0();
        this.f30255q0 = 75;
        this.f30223a = i7;
        this.f38701r1 = i5.c.g(context, 2131232733);
        o51 J0 = J0(context);
        this.f30226b = J0;
        J0.setWillNotDraw(false);
        this.f30226b.setClipChildren(false);
        ViewGroup viewGroup = this.f30226b;
        int i14 = this.f30261u0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n1 = frameLayout;
        p51 p51Var = new p51(this, context, i6Var);
        this.f38706w1 = p51Var;
        p51Var.f33887y = true;
        p51Var.updateColors();
        p51Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(p51Var, c8.na.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        vz vzVar = new vz(context, null);
        this.f38705v1 = vzVar;
        vzVar.setViewType(6);
        vzVar.f41457x = false;
        vzVar.setUseHeaderOffset(true);
        mv0 mv0Var = new mv0(context, vzVar, 1, null);
        this.f38704u1 = mv0Var;
        mv0Var.addView(vzVar, 0, c8.na.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String N0 = org.telegram.messenger.gd.N0(2131747974, null);
        xh.l lVar = mv0Var.d;
        lVar.setText(N0);
        String N02 = org.telegram.messenger.gd.N0(2131745611, null);
        j80 j80Var = mv0Var.f37553e;
        j80Var.setText(N02);
        mv0Var.setVisibility(8);
        mv0Var.setAnimateLayoutChange(true);
        mv0Var.e(true, false);
        int i15 = this.H1;
        int i16 = this.I1;
        int i17 = this.F1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.i6 i6Var2 = mv0Var.f37555n;
        org.telegram.ui.ActionBar.u6.U(lVar, i15, i6Var2);
        j80Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.u6.U(j80Var, i16, i6Var2);
        mv0Var.H = i17;
        this.f30226b.addView(mv0Var, c8.na.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, i6Var, 28);
        this.f38698o1 = b1Var;
        b1Var.setOverScrollMode(2);
        b1Var.setTag(13);
        b1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        b1Var.setClipToPadding(false);
        b1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.u6.l(b1Var, 20, this.E1, i6Var);
        getContext();
        vy vyVar = new vy(org.telegram.messenger.g0.L(8.0f), 0, b1Var);
        this.M1 = vyVar;
        vyVar.P = false;
        b1Var.setLayoutManager(vyVar);
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        this.f30226b.addView(b1Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b1Var.setOnScrollListener(new na(this, 22));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.f38702s1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.f30226b.addView(view, layoutParams);
        this.f30226b.addView(frameLayout, c8.na.e(-1, 58, 51));
        N0(0.0f);
        b1Var.setEmptyView(mv0Var);
        b1Var.X1 = true;
        b1Var.Y1 = 0;
    }

    @Override
    public final boolean F() {
        return false;
    }

    public o51 J0(Context context) {
        return new o51(this, context);
    }

    public abstract void K0(MotionEvent motionEvent, ah.i iVar);

    public final void L0(boolean z10) {
        Integer num;
        float f10;
        View view = this.f38702s1;
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
            AnimatorSet animatorSet = this.f38703t1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f38703t1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f38703t1.setDuration(150L);
            this.f38703t1.addListener(new org.telegram.ui.on(26, this, z10));
            this.f38703t1.start();
        }
    }

    public abstract void M0(String str);

    public final void N0(float f10) {
        int i7;
        this.f38709z1 = f10;
        this.A1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.n6.w0(this.F1, this.J0), org.telegram.ui.ActionBar.n6.w0(this.G1, this.J0));
        this.f38701r1.setColorFilter(new PorterDuffColorFilter(this.A1, PorterDuff.Mode.MULTIPLY));
        P(this.A1);
        int i10 = this.A1;
        this.H0 = i10;
        di.b1 b1Var = this.f38698o1;
        b1Var.setGlowColor(i10);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, this.J1, false), org.telegram.ui.ActionBar.n6.x0(null, this.I1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, this.L1, false), org.telegram.ui.ActionBar.n6.x0(null, this.K1, false));
        int childCount = b1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = b1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.a4) {
                ((org.telegram.ui.Cells.a4) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                if (this.f38702s1.getTag() != null) {
                    i7 = this.K1;
                } else {
                    i7 = this.L1;
                }
                g4Var.f(i7, S02);
            }
        }
        this.f30226b.invalidate();
        b1Var.invalidate();
        this.f30229c.invalidate();
    }

    public void O0(int i7) {
        this.f38698o1.setTopGlowOffset(i7);
        float f10 = i7;
        this.n1.setTranslationY(f10);
        this.f38704u1.setTranslationY(f10);
        this.f30226b.invalidate();
    }

    public final void P0(int i7) {
        if (!isShowing()) {
            return;
        }
        this.f38698o1.getViewTreeObserver().addOnPreDrawListener(new kr0(this, i7, 1));
    }

    public void R0() {
        int i7;
        int i10;
        di.b1 b1Var = this.f38698o1;
        if (b1Var.getChildCount() > 0) {
            v4.f1 K = b1Var.K(0);
            if (K != null) {
                i7 = K.f59245a.getTop() - org.telegram.messenger.g0.L(8.0f);
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
            if (this.f38708y1 != i7) {
                this.f38708y1 = i7;
                O0(i7);
            }
        }
    }

    @Override
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.f38706w1.K);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i7;
        if (this.f38697m1 == null) {
            TextView textView = new TextView(getContext());
            this.f38697m1 = textView;
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, this.J0);
            this.f38697m1.setTextSize(1, 20.0f);
            this.f38697m1.setTypeface(org.telegram.messenger.g0.o());
            this.f38697m1.setLines(1);
            this.f38697m1.setMaxLines(1);
            this.f38697m1.setSingleLine(true);
            TextView textView2 = this.f38697m1;
            if (org.telegram.messenger.gd.f24314a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView2.setGravity(i7 | 16);
            this.f38697m1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f38697m1;
            FrameLayout.LayoutParams d = c8.na.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.n1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f38706w1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.f38697m1.setText(charSequence);
    }

    public void Q0() {
    }
}
