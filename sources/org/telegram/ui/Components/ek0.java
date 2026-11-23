package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
public class ek0 extends RecyclerView implements eh.a {
    public static int[] Z2;
    public static boolean f34842a3;
    public static final Method f34843b3;
    public static final Paint f34844c3;
    public static final Path f34845d3;
    public static final float[] f34846e3;
    public boolean A1;
    public int A2;
    public int B1;
    public boolean B2;
    public org.telegram.ui.Cells.y C1;
    public boolean C2;
    public int D1;
    public final ik D2;
    public View E1;
    public final dt E2;
    public final Rect F1;
    public Matrix F2;
    public boolean G1;
    public boolean G2;
    public int H1;
    public oj0 H2;
    public boolean I1;
    public org.telegram.messenger.z10 I2;
    public boolean J1;
    public org.telegram.messenger.z10 J2;
    public boolean K1;
    public ky K2;
    public qf L1;
    public ArrayList L2;
    public View M1;
    public float M2;
    public int N1;
    public float[] N2;
    public boolean O1;
    public float[] O2;
    public boolean P1;
    public int P2;
    public boolean Q1;
    public boolean Q2;
    public vj0 R1;
    public int R2;
    public boolean S1;
    public v9 S2;
    public boolean T0;
    public nj0 T1;
    public boolean T2;
    public qj0 U0;
    public hb0 U1;
    public boolean U2;
    public rj0 V0;
    public boolean V1;
    public ck0 V2;
    public sj0 W0;
    public boolean W1;
    public int W2;
    public tj0 X0;
    public boolean X1;
    public ArrayList X2;
    public boolean Y0;
    public int Y1;
    public final Path Y2;
    public v4.u0 Z0;
    public int Z1;
    public pj0 f34847a1;
    public int f34848a2;
    public View f34849b1;
    public int f34850b2;
    public bi.e3 f34851c1;
    public boolean f34852c2;
    public uj0 f34853d1;
    public boolean d2;
    public jj0 f34854e1;
    public int f34855e2;
    public zj0 f34856f1;
    public int f34857f2;
    public boolean f34858g1;
    public m.b3 f34859g2;
    public boolean f34860h1;
    public boolean f34861h2;
    public boolean f34862i1;
    public boolean f34863i2;
    public boolean f34864j1;
    public float f34865j2;
    public Drawable f34866k1;
    public float f34867k2;
    public float l1;
    public int[] f34868l2;
    public float f34869m1;
    public hj0 f34870m2;
    public long n1;
    public q0.a f34871n2;
    public ArrayList f34872o1;
    public final org.telegram.ui.ActionBar.h6 f34873o2;
    public ArrayList f34874p1;
    public boolean f34875p2;
    public View f34876q1;
    public final he f34877q2;
    public int f34878r1;
    public boolean f34879r2;
    public int f34880s1;
    public final jg.m1 f34881s2;
    public int f34882t1;
    public Paint f34883t2;
    public int f34884u1;
    public boolean f34885u2;
    public int f34886v1;
    public int f34887v2;
    public boolean f34888w1;
    public org.telegram.messenger.j9 f34889w2;
    public int f34890x1;
    public int f34891x2;
    public boolean f34892y1;
    public int f34893y2;
    public boolean f34894z1;
    public boolean f34895z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        f34843b3 = method;
        f34844c3 = new Paint(1);
        new Paint(1);
        f34845d3 = new Path();
        f34846e3 = new float[8];
    }

    public ek0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        if (view.getTag(2131296421) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static boolean a1(View view) {
        if (view instanceof yj0) {
            jt0 jt0Var = (jt0) ((yj0) view);
            if (jt0Var.f36620c2 && jt0Var.f36633g2 > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    private int[] getDrawableStateForSelector() {
        int[] onCreateDrawableState = onCreateDrawableState(1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = 16842919;
        return onCreateDrawableState;
    }

    public static float v1(View view) {
        if (view.getTag(2131296421) != null) {
            return view.getTop();
        }
        return view.getY();
    }

    @Override
    public final void C0() {
        try {
            super.C0();
        } catch (NullPointerException unused) {
        }
    }

    public final void D0(Runnable runnable) {
        this.E2.f34568b.add(new at(runnable, 1));
    }

    @Override
    public final View E(float f10, float f11) {
        float f12;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < 2; i7++) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                if ((!(childAt instanceof org.telegram.ui.Cells.r1) && !(childAt instanceof org.telegram.ui.Cells.v0)) || childAt.getVisibility() != 4) {
                    float f13 = 0.0f;
                    if (i7 == 0) {
                        f12 = childAt.getTranslationX();
                    } else {
                        f12 = 0.0f;
                    }
                    if (i7 == 0) {
                        f13 = childAt.getTranslationY();
                    }
                    if (f10 >= childAt.getLeft() + f12 && f10 <= childAt.getRight() + f12 && f11 >= childAt.getTop() + f13 && f11 <= childAt.getBottom() + f13) {
                        return childAt;
                    }
                }
            }
        }
        return null;
    }

    public boolean E0(float f10) {
        return true;
    }

    public boolean F0(View view) {
        return true;
    }

    public boolean H0(View view, float f10, float f11) {
        return true;
    }

    public final void I0(boolean z10) {
        uj0 uj0Var = this.f34853d1;
        if (uj0Var != null) {
            org.telegram.messenger.g0.r(uj0Var);
            this.f34853d1 = null;
        }
        View view = this.M1;
        if (view != null) {
            if (z10) {
                j1(view, 0.0f, 0.0f, false);
            }
            this.M1 = null;
            m1(view, null);
        }
        this.F1.setEmpty();
        vj0 vj0Var = this.R1;
        if (vj0Var != null) {
            org.telegram.messenger.g0.r(vj0Var);
            this.R1 = null;
        }
        this.O1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j3) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i7 = 0; i7 < itemDecorationCount; i7++) {
            v4.o0 X = X(i7);
            if ((X instanceof eh.a) && ((X != this.H2 && X != this.S2) || this.G2)) {
                ((eh.a) X).d(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                this.B2 = true;
                drawChild(canvas, childAt, j3);
                this.B2 = false;
            }
        }
    }

    public final void K0(boolean z10) {
        int i7;
        if (!this.f34860h1) {
            int i10 = 0;
            if (getAdapter() != null && this.f34849b1 != null) {
                boolean R0 = R0();
                if (R0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                if (!this.X1 || !org.telegram.messenger.cz.c()) {
                    z10 = false;
                }
                if (z10) {
                    if (this.A2 != i7) {
                        this.A2 = i7;
                        if (i7 == 0) {
                            this.f34849b1.animate().setListener(null).cancel();
                            if (this.f34849b1.getVisibility() == 8) {
                                this.f34849b1.setVisibility(0);
                                this.f34849b1.setAlpha(0.0f);
                                if (this.Y1 == 1) {
                                    this.f34849b1.setScaleX(0.7f);
                                    this.f34849b1.setScaleY(0.7f);
                                }
                            }
                            this.f34849b1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.f34849b1.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.f34849b1.animate().alpha(0.0f);
                            if (this.Y1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new s60(this, 14)).start();
                        }
                    }
                } else {
                    this.A2 = i7;
                    this.f34849b1.setVisibility(i7);
                    this.f34849b1.setAlpha(1.0f);
                }
                if (this.f34894z1) {
                    if (!b1() || !this.U2) {
                        if (R0) {
                            i10 = 4;
                        }
                        if (getVisibility() != i10) {
                            setVisibility(i10);
                        }
                        this.V1 = true;
                    }
                }
            } else if (this.V1 && getVisibility() != 0) {
                setVisibility(0);
                this.V1 = false;
            }
        }
    }

    public final void L0(boolean z10) {
        jj0 jj0Var;
        int paddingTop;
        v4.f1 T;
        jj0 jj0Var2;
        View view;
        boolean z11;
        int i7;
        v4.f1 T2;
        int b10;
        int S;
        boolean z12;
        int i10;
        int i11;
        if (((this.J1 || z10) && this.f34854e1 != null) || (this.f34890x1 != 0 && this.f34856f1 != null)) {
            v4.p0 layoutManager = getLayoutManager();
            if (layoutManager instanceof v4.c0) {
                v4.c0 c0Var = (v4.c0) layoutManager;
                if (c0Var.f59117o == 1) {
                    if (this.f34856f1 != null) {
                        if (this.f34890x1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i12 = this.f34890x1;
                        float f10 = 32.0f;
                        int i13 = Integer.MAX_VALUE;
                        if (i12 != 1 && i12 != 3) {
                            if (i12 == 2) {
                                this.f34869m1 = 0.0f;
                                if (this.f34856f1.b() != 0) {
                                    int childCount = getChildCount();
                                    int i14 = 0;
                                    int i15 = Integer.MAX_VALUE;
                                    View view2 = null;
                                    View view3 = null;
                                    for (int i16 = 0; i16 < childCount; i16++) {
                                        View childAt = getChildAt(i16);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f34886v1 + paddingTop) {
                                            if (bottom < i13) {
                                                view3 = childAt;
                                                i13 = bottom;
                                            }
                                            i14 = Math.max(i14, bottom);
                                            if (bottom >= org.telegram.messenger.g0.L(32.0f) + this.f34886v1 + paddingTop && bottom < i15) {
                                                view2 = childAt;
                                                i15 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T2 = T(view3)) != null && (S = this.f34856f1.S((b10 = T2.b()))) >= 0) {
                                        if (this.f34878r1 != S || this.f34876q1 == null) {
                                            View view4 = this.f34876q1;
                                            if (view4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            View T3 = this.f34856f1.T(S, view4);
                                            if (z12) {
                                                S0(T3, false);
                                            }
                                            this.f34876q1 = T3;
                                            T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f34876q1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f34876q1.getMeasuredHeight());
                                            this.f34878r1 = S;
                                        }
                                        if (this.f34876q1 != null && view2 != null && view2.getClass() != this.f34876q1.getClass()) {
                                            this.f34869m1 = 1.0f;
                                        }
                                        int M = this.f34856f1.M(S);
                                        int Q = this.f34856f1.Q(b10);
                                        if (i14 != 0 && i14 < getMeasuredHeight() - getPaddingBottom()) {
                                            i10 = -paddingTop;
                                        } else {
                                            i10 = this.f34886v1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f34876q1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f34886v1);
                                            if (height2 < height) {
                                                i11 = height2 - height;
                                            } else {
                                                i11 = paddingTop;
                                            }
                                            if (i11 < 0) {
                                                this.f34876q1.setTag(Integer.valueOf(paddingTop + i10 + i11));
                                            } else {
                                                this.f34876q1.setTag(Integer.valueOf(paddingTop + i10));
                                            }
                                        } else {
                                            this.f34876q1.setTag(Integer.valueOf(paddingTop + i10));
                                        }
                                        invalidate();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        int childCount2 = getChildCount();
                        int i17 = 0;
                        int i18 = 0;
                        int i19 = Integer.MAX_VALUE;
                        View view6 = null;
                        while (i17 < childCount2) {
                            View childAt2 = getChildAt(i17);
                            float f11 = f10;
                            int bottom2 = childAt2.getBottom();
                            if (bottom2 > this.f34886v1 + paddingTop) {
                                if (bottom2 < i13) {
                                    i13 = bottom2;
                                    view6 = childAt2;
                                }
                                i18 = Math.max(i18, bottom2);
                                if (bottom2 >= org.telegram.messenger.g0.L(f11) + this.f34886v1 + paddingTop && bottom2 < i19) {
                                    i19 = bottom2;
                                }
                            }
                            i17++;
                            f10 = f11;
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(c0Var.N0() - b11) + 1;
                            if ((this.J1 || z10) && (jj0Var2 = this.f34854e1) != null && !jj0Var2.f36540n && (getAdapter() instanceof kj0)) {
                                this.f34854e1.setProgress(Math.min(1.0f, b11 / ((this.f34856f1.b() - abs) + 1)));
                            }
                            this.f34874p1.addAll(this.f34872o1);
                            this.f34872o1.clear();
                            if (this.f34856f1.b() != 0) {
                                if (this.f34878r1 != b11 || this.f34880s1 != abs) {
                                    this.f34878r1 = b11;
                                    this.f34880s1 = abs;
                                    this.f34884u1 = 1;
                                    int S2 = this.f34856f1.S(b11);
                                    this.f34882t1 = S2;
                                    int M2 = (this.f34856f1.M(S2) + b11) - this.f34856f1.Q(b11);
                                    while (M2 < b11 + abs) {
                                        M2 += this.f34856f1.M(this.f34882t1 + this.f34884u1);
                                        this.f34884u1++;
                                    }
                                }
                                if (this.f34890x1 != 3) {
                                    int i20 = b11;
                                    for (int i21 = this.f34882t1; i21 < this.f34882t1 + this.f34884u1; i21++) {
                                        if (!this.f34874p1.isEmpty()) {
                                            view = (View) this.f34874p1.get(0);
                                            this.f34874p1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        View T4 = this.f34856f1.T(i21, view);
                                        if (z11) {
                                            S0(T4, false);
                                        }
                                        this.f34872o1.add(T4);
                                        int M3 = this.f34856f1.M(i21);
                                        if (i21 == this.f34882t1) {
                                            int Q2 = this.f34856f1.Q(i20);
                                            if (Q2 == M3 - 1) {
                                                T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                            } else if (Q2 == M3 - 2) {
                                                View childAt3 = getChildAt(i20 - b11);
                                                if (childAt3 != null) {
                                                    i7 = childAt3.getTop() + paddingTop;
                                                } else {
                                                    i7 = -org.telegram.messenger.g0.L(100.0f);
                                                }
                                                T4.setTag(Integer.valueOf(Math.min(i7, 0)));
                                            } else {
                                                T4.setTag(0);
                                            }
                                            i20 = (M3 - this.f34856f1.Q(b11)) + i20;
                                        } else {
                                            View childAt4 = getChildAt(i20 - b11);
                                            if (childAt4 != null) {
                                                T4.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                            } else {
                                                T4.setTag(Integer.valueOf(-org.telegram.messenger.g0.L(100.0f)));
                                            }
                                            i20 += M3;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int L0 = c0Var.L0();
                    Math.abs(c0Var.N0() - L0);
                    if (L0 != -1) {
                        if ((this.J1 || z10) && (jj0Var = this.f34854e1) != null && !jj0Var.f36540n) {
                            v4.i0 adapter = getAdapter();
                            if (adapter instanceof kj0) {
                                kj0 kj0Var = (kj0) adapter;
                                float H = kj0Var.H(this);
                                this.f34854e1.setIsVisible(kj0Var.E(this));
                                this.f34854e1.setProgress(Math.min(1.0f, H));
                                this.f34854e1.b(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void M0(float f10, float f11) {
        boolean z10;
        org.telegram.messenger.bj bjVar;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.f34868l2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f11, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f10, 0.0f));
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            m.b3 b3Var = this.f34859g2;
            int[] iArr2 = this.f34868l2;
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) b3Var.d;
            iArr2[0] = (int) bnVar.P9;
            iArr2[1] = bnVar.Ya;
            View childAt = getChildAt(i7);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i10 = this.f34857f2;
                if (i10 != S) {
                    int i11 = this.f34855e2;
                    if (i10 <= i11 && S <= i11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) this.f34859g2.d;
                    org.telegram.ui.kl klVar = bnVar2.D0;
                    ArrayList arrayList = bnVar2.M6;
                    int i12 = S - klVar.K;
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i12);
                        if (gjVar.U == 0 && gjVar.z2() && (bjVar = (org.telegram.messenger.bj) bnVar2.P6.f(gjVar.c1())) != null) {
                            ArrayList arrayList2 = bjVar.d;
                            if (z10) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf((org.telegram.messenger.gj) arrayList2.get(size)) + bnVar2.D0.K;
                        }
                    }
                    if (z10) {
                        int i13 = this.f34857f2;
                        if (S > i13) {
                            if (!this.f34859g2.f20052a) {
                                for (int i14 = i13 + 1; i14 <= S; i14++) {
                                    if (i14 != this.f34855e2 && this.f34859g2.a(i14)) {
                                        this.f34859g2.d(min2, min, i14, true);
                                    }
                                }
                            }
                        } else {
                            while (i13 > S) {
                                if (i13 != this.f34855e2 && this.f34859g2.a(i13)) {
                                    this.f34859g2.d(min2, min, i13, false);
                                }
                                i13--;
                            }
                        }
                    } else {
                        int i15 = this.f34857f2;
                        if (S > i15) {
                            while (i15 < S) {
                                if (i15 != this.f34855e2 && this.f34859g2.a(i15)) {
                                    this.f34859g2.d(min2, min, i15, false);
                                }
                                i15++;
                            }
                        } else if (!this.f34859g2.f20052a) {
                            for (int i16 = i15 - 1; i16 >= S; i16--) {
                                if (i16 != this.f34855e2 && this.f34859g2.a(i16)) {
                                    this.f34859g2.d(min2, min, i16, true);
                                }
                            }
                        }
                    }
                }
                if (!this.f34859g2.f20052a) {
                    this.f34857f2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void N0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (this.S2 == null && view != null && u1(view) && ((Boolean) this.H2.f38245a.a(view)).booleanValue() && i1(view)) {
            int R = RecyclerView.R(view);
            boolean z12 = false;
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View T0 = T0(R - 1);
                View T02 = T0(R + 1);
                if (T0 != null && i1(T0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (T02 != null && i1(T02)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(view.getX(), Math.max((-this.M2) - this.R2, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight() + this.M2, G0(view)));
            if (z10 && z11) {
                if (v1(view) >= rectF.top) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (G0(view) <= rectF.bottom) {
                    z12 = true;
                }
                if (!z10 || !z12) {
                    z11 = z12;
                } else {
                    return;
                }
            }
            Path path = this.Y2;
            if (!z10 && !z11) {
                path.rewind();
                float f10 = this.M2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z10) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.O2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void O0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f10;
        float f11;
        if (view != null && view2 != null) {
            float f12 = 0.0f;
            if (view2 instanceof v70) {
                f10 = ((v70) view2).getBottomInfoMargin();
            } else {
                f10 = 0.0f;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            float left = view.getLeft();
            float f13 = (-this.M2) - this.R2;
            float v12 = v1(view);
            if (z10) {
                f11 = this.M2;
            } else {
                f11 = 0.0f;
            }
            float max = Math.max(f13, v12 - f11);
            float right = view.getRight();
            float height = getHeight() + this.M2;
            float G0 = G0(view2);
            if (z11) {
                f12 = this.M2;
            }
            rectF.set(left, max, right, Math.min(height, (G0 + f12) - f10));
            if (rectF.bottom >= rectF.top) {
                float f14 = this.M2;
                this.K2.l(canvas, rectF, Float.valueOf(f14), Float.valueOf(f14), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void P0(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ek0.P0(android.graphics.Canvas):void");
    }

    public final void Q0(Canvas canvas) {
        org.telegram.ui.Cells.y yVar;
        q0.a aVar;
        View view;
        Rect rect = this.F1;
        if (!rect.isEmpty() && (yVar = this.C1) != null) {
            int i7 = this.H1;
            if ((i7 == -2 || i7 == this.D1) && this.E1 != null) {
                if (getAdapter() instanceof dk0) {
                    ((dk0) getAdapter()).getClass();
                }
                this.C1.setBounds(this.E1.getLeft(), this.E1.getTop(), this.E1.getRight(), this.E1.getBottom());
            } else {
                yVar.setBounds(rect);
            }
            canvas.save();
            int i10 = this.H1;
            if ((i10 == -2 || i10 == this.D1) && (aVar = this.f34871n2) != null) {
                aVar.accept(canvas);
            }
            int i11 = this.H1;
            if ((i11 == -2 || i11 == this.D1) && (view = this.E1) != null) {
                canvas.translate(view.getX() - rect.left, this.E1.getY() - rect.top);
                this.C1.setAlpha((int) (this.E1.getAlpha() * 255.0f));
            }
            if (this.H2 != null) {
                canvas.save();
                N0(canvas, this.E1);
                this.C1.draw(canvas);
                canvas.restore();
            } else {
                this.C1.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean R0() {
        if (getAdapter() != null && !this.W1 && getAdapter().b() == 0) {
            return true;
        }
        return false;
    }

    public final void S0(View view, boolean z10) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z10) {
                return;
            }
            int i7 = this.f34890x1;
            if (i7 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final View T0(int i7) {
        if (i7 != -1) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R == i7) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    public final Drawable U0(View view, boolean z10) {
        boolean z11;
        boolean z12;
        if (view.getParent() == this && b1() && i1(view)) {
            int R = RecyclerView.R(view);
            boolean z13 = true;
            if (R == -1) {
                z12 = false;
                z11 = false;
            } else {
                View T0 = T0(R - 1);
                View T02 = T0(R + 1);
                if (T0 != null && i1(T0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (T02 != null && i1(T02)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            RectF rectF = new RectF();
            rectF.set(view.getX(), Math.max(0.0f, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
            if (z11 && z12 && !z10) {
                if (v1(view) >= rectF.top) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (G0(view) > rectF.bottom) {
                    z13 = false;
                }
                if (z11 && z13) {
                    return org.telegram.ui.ActionBar.m6.d0(0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, this.f34873o2));
                }
                z12 = z13;
            }
            Path path = new Path();
            if ((!z11 && !z12) || z10) {
                path.rewind();
                float f10 = this.M2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
            } else if (!z12) {
                path.rewind();
                path.addRoundRect(rectF, this.O2, Path.Direction.CW);
            }
            return new ij0(this, view, path, rectF);
        }
        return null;
    }

    public Integer V0(int i7) {
        org.telegram.messenger.j9 j9Var = this.f34889w2;
        if (j9Var != null) {
            return (Integer) j9Var.m(Integer.valueOf(i7));
        }
        return null;
    }

    public final Paint W0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.h6 h6Var = this.f34873o2;
        if (h6Var != null) {
            paint = h6Var.g(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.m6.V0(str);
    }

    public final boolean X0(int i7, View view) {
        int R;
        if (view != null && i7 <= 0 && getAdapter() != null && this.J2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.J2.a(Integer.valueOf(getAdapter().d(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Y0() {
        ct[] ctVarArr;
        for (ct ctVar : this.E2.f34567a) {
            if (ctVar != null && ctVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z0(int i7, View view) {
        int R;
        if (view != null && i7 >= getChildCount() - 1 && getAdapter() != null && this.J2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().b() - 1) {
            return ((Boolean) this.J2.a(Integer.valueOf(getAdapter().d(R + 1)))).booleanValue();
        }
        return false;
    }

    public final boolean b1() {
        if (this.H2 == null && this.S2 == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            aVar.f8401a = true;
        } else if (Y0() && getOverScrollMode() != 2) {
            aVar.f8401a = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i7 = 0; i7 < itemDecorationCount; i7++) {
                v4.o0 X = X(i7);
                if ((X instanceof eh.a) && ((X != this.H2 && X != this.S2) || this.G2)) {
                    ((eh.a) X).c(aVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                float x10 = childAt.getX();
                float y10 = childAt.getY();
                if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                    aVar.getClass();
                    android.support.v4.media.session.w.a(aVar, childAt);
                }
            }
        }
    }

    public final void c1() {
        if (!this.f34860h1) {
            this.f34860h1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.f34849b1;
            if (view != null && view.getVisibility() != 8) {
                this.f34849b1.setVisibility(8);
            }
        }
    }

    @Override
    public final boolean canScrollVertically(int i7) {
        if (this.S1 && super.canScrollVertically(i7)) {
            return true;
        }
        return false;
    }

    public void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Y0() && getOverScrollMode() != 2) {
            if (this.F2 == null) {
                this.F2 = new Matrix();
            }
            int save = canvas.save();
            Matrix matrix = getMatrix();
            if (!matrix.isIdentity() && matrix.invert(this.F2)) {
                canvas.concat(this.F2);
            }
            canvas.translate(-getLeft(), -getTop());
            try {
                super.drawChild(canvas, this, uptimeMillis);
                return;
            } catch (Throwable th2) {
                try {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
        J0(canvas, rectF, uptimeMillis);
    }

    public final void d1(boolean z10) {
        View view = this.M1;
        if (view != null) {
            j1(view, 0.0f, 0.0f, false);
            this.M1 = null;
            if (z10) {
                m1(view, null);
            }
        }
        if (!z10) {
            this.C1.setState(StateSet.NOTHING);
            this.F1.setEmpty();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f10;
        hj0 hj0Var = this.f34870m2;
        if (hj0Var != null) {
            ek0 ek0Var = hj0Var.f35921a;
            if (hj0Var.d || hj0Var.f35924e) {
                for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                    View childAt = ek0Var.getChildAt(i7);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !hj0Var.f35923c.contains(childAt)) {
                        Float f11 = (Float) hj0Var.f35922b.get(R, null);
                        if (f11 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f11.floatValue());
                        }
                    }
                }
                hj0Var.d = false;
            }
        }
        if (this.T0 && this.A1) {
            Q0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.T0 && !this.A1) {
            Q0(canvas);
        }
        bi.e3 e3Var = this.f34851c1;
        if (e3Var != null) {
            e3Var.draw(canvas);
        }
        if (!this.f34892y1) {
            int i10 = this.f34890x1;
            float f12 = 0.0f;
            if (i10 == 1) {
                if (this.f34856f1 != null && !this.f34872o1.isEmpty()) {
                    for (int i11 = 0; i11 < this.f34872o1.size(); i11++) {
                        View view2 = (View) this.f34872o1.get(i11);
                        int save = canvas.save();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        if (org.telegram.messenger.hd.f24444a0) {
                            f10 = getWidth() - view2.getWidth();
                        } else {
                            f10 = 0.0f;
                        }
                        canvas.translate(f10, intValue);
                        canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                        view2.draw(canvas);
                        canvas.restoreToCount(save);
                    }
                }
            } else if (i10 == 2 && this.f34856f1 != null && (view = this.f34876q1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f34876q1.getTag()).intValue();
                if (org.telegram.messenger.hd.f24444a0) {
                    f12 = getWidth() - this.f34876q1.getWidth();
                }
                canvas.translate(f12, intValue2);
                Drawable drawable = this.f34866k1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f34876q1.getMeasuredHeight(), getWidth(), this.f34866k1.getIntrinsicHeight() + this.f34876q1.getMeasuredHeight());
                    this.f34866k1.setAlpha((int) (this.l1 * 255.0f));
                    this.f34866k1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.n1);
                    this.n1 = elapsedRealtime;
                    float f13 = this.l1;
                    float f14 = this.f34869m1;
                    if (f13 < f14) {
                        float f15 = (((float) min) / 180.0f) + f13;
                        this.l1 = f15;
                        if (f15 > f14) {
                            this.l1 = f14;
                        }
                        invalidate();
                    } else if (f13 > f14) {
                        float f16 = f13 - (((float) min) / 180.0f);
                        this.l1 = f16;
                        if (f16 < f14) {
                            this.l1 = f14;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f34876q1.getMeasuredHeight());
                this.f34876q1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f34893y2 == 0 && this.f34895z2) {
                setOverScrollMode(0);
            }
            this.f34893y2++;
        } else if (action == 1 || action == 3) {
            int i7 = this.f34893y2 - 1;
            this.f34893y2 = i7;
            if (i7 == 0 && this.f34895z2) {
                setOverScrollMode(2);
            }
        }
        jj0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.f36526b0 && fastScroll.m0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f34856f1 != null && (view = this.f34876q1) != null && view.getAlpha() != 0.0f && this.f34876q1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.H2 != null && !this.B2) {
            canvas.save();
            N0(canvas, view);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1();
    }

    public final void e1(nj0 nj0Var, int i7, boolean z10) {
        hb0 hb0Var = this.U1;
        if (hb0Var != null) {
            org.telegram.messenger.g0.r(hb0Var);
            this.U1 = null;
        }
        v4.f1 K = K(nj0Var.run());
        if (K != null) {
            View view = K.f59165a;
            int c10 = K.c();
            this.f34891x2 = c10;
            k1(c10, view);
            org.telegram.ui.Cells.y yVar = this.C1;
            if (yVar != null) {
                Drawable current = yVar.getCurrent();
                if (current instanceof TransitionDrawable) {
                    if (this.W0 == null && this.V0 == null) {
                        ((TransitionDrawable) current).resetTransition();
                    } else {
                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                    }
                }
                this.C1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
            }
            org.telegram.ui.Cells.y yVar2 = this.C1;
            if (yVar2 != null && yVar2.isStateful() && this.C1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.C1);
            }
            if (i7 > 0) {
                this.T1 = null;
                hb0 hb0Var2 = new hb0(this, 17);
                this.U1 = hb0Var2;
                org.telegram.messenger.g0.h3(hb0Var2, i7);
            }
        } else if (z10) {
            this.T1 = nj0Var;
        }
    }

    public final void f1() {
        org.telegram.messenger.z10 z10Var;
        ky kyVar;
        v4.o0 o0Var = this.H2;
        if (o0Var != null) {
            q0(o0Var);
            this.H2 = null;
        }
        v4.o0 o0Var2 = this.S2;
        if (o0Var2 != null) {
            q0(o0Var2);
            this.S2 = null;
        }
        org.telegram.messenger.z10 z10Var2 = this.I2;
        if (z10Var2 != null && (z10Var = this.J2) != null && (kyVar = this.K2) != null) {
            if (!this.T2) {
                v9 v9Var = new v9(this, z10Var2, z10Var, this.P2, this.M2, kyVar, this.Q2, this.U2, this.V2);
                this.S2 = v9Var;
                i(v9Var);
                return;
            }
            oj0 oj0Var = new oj0(this, z10Var2, this.P2, this.Q2);
            this.H2 = oj0Var;
            i(oj0Var);
        }
    }

    @Override
    public final void g0(View view) {
        if (getAdapter() instanceof dk0) {
            v4.f1 G = G(view);
            if (G != null) {
                view.setEnabled(((dk0) getAdapter()).D(G));
                if (this.f34875p2) {
                    view.setAccessibilityDelegate(this.f34877q2);
                    return;
                }
                return;
            }
            return;
        }
        view.setEnabled(false);
        view.setAccessibilityDelegate(null);
    }

    public void g1() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof org.telegram.ui.ActionBar.b6) {
                ((org.telegram.ui.ActionBar.b6) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    public View getEmptyView() {
        return this.f34849b1;
    }

    public jj0 getFastScroll() {
        return this.f34854e1;
    }

    public ArrayList<View> getHeaders() {
        return this.f34872o1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f34874p1;
    }

    public qj0 getOnItemClickListener() {
        return this.U0;
    }

    public v4.u0 getOnScrollListener() {
        return this.Z0;
    }

    public View getPinnedHeader() {
        return this.f34876q1;
    }

    public View getPressedChildView() {
        return this.M1;
    }

    public int getSectionColorForDecoration() {
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, this.f34873o2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return i0.a.o(org.telegram.ui.ActionBar.m6.w0(this.W2, this.f34873o2), 255);
    }

    public boolean getSectionsDrawBackground() {
        return this.U2;
    }

    public int getSectionsOverscanTop() {
        return this.R2;
    }

    public Drawable getSelectorDrawable() {
        return this.C1;
    }

    public int getSelectorDrawableColor() {
        return this.f34887v2;
    }

    public Rect getSelectorRect() {
        return this.F1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public final boolean h1(int i7) {
        if (this.L2 != null && i7 >= 0) {
            for (int i10 = 0; i10 < this.L2.size(); i10++) {
                long longValue = ((Long) this.L2.get(i10)).longValue();
                Typeface typeface = org.telegram.messenger.g0.f24018a;
                int i11 = (int) (longValue >> 32);
                int i12 = (int) longValue;
                if (i7 >= i11 && i7 <= i12) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i1(View view) {
        v9 v9Var = this.S2;
        if (v9Var != null) {
            return v9Var.u(view);
        }
        oj0 oj0Var = this.H2;
        if (oj0Var != null && ((Boolean) oj0Var.f38245a.a(view)).booleanValue()) {
            return true;
        }
        return false;
    }

    public void j1(View view, float f10, float f11, boolean z10) {
        if (!this.f34862i1 && view != null) {
            view.setPressed(z10);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.C1;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    public final void k1(int i7, View view) {
        boolean z10;
        int i10;
        int i11;
        hb0 hb0Var = this.U1;
        if (hb0Var != null) {
            org.telegram.messenger.g0.r(hb0Var);
            this.U1 = null;
            this.T1 = null;
        }
        if (this.C1 != null) {
            if (i7 != this.D1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getAdapter() instanceof dk0) {
                ((dk0) getAdapter()).getClass();
            }
            if (i7 != -1) {
                this.D1 = i7;
            }
            this.E1 = view;
            if (this.B1 == 8) {
                org.telegram.ui.ActionBar.m6.G1(this.C1, this.Z1, 0);
            } else if (this.f34848a2 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.y yVar = this.C1;
                if (i7 == 0) {
                    i10 = this.f34848a2;
                } else {
                    i10 = 0;
                }
                if (i7 == getAdapter().b() - 2) {
                    i11 = this.f34848a2;
                } else {
                    i11 = 0;
                }
                org.telegram.ui.ActionBar.m6.G1(yVar, i10, i11);
            }
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            Rect rect = this.F1;
            rect.set(left, top, right, bottom);
            boolean isEnabled = view.isEnabled();
            if (this.G1 != isEnabled) {
                this.G1 = isEnabled;
            }
            if (z10) {
                this.C1.setVisible(false, false);
                this.C1.setState(StateSet.NOTHING);
            }
            setListSelectorColor(V0(i7));
            this.C1.setBounds(rect);
            if (z10 && getVisibility() == 0) {
                this.C1.setVisible(true, false);
            }
        }
    }

    public final void l1() {
        int i7;
        hb0 hb0Var = this.U1;
        if (hb0Var != null) {
            org.telegram.messenger.g0.r(hb0Var);
            this.U1.run();
            this.U1 = null;
            this.E1 = null;
            return;
        }
        this.U1 = null;
        this.T1 = null;
        View view = this.E1;
        if (view != null && (i7 = this.f34891x2) != -1) {
            k1(i7, view);
            org.telegram.ui.Cells.y yVar = this.C1;
            if (yVar != null) {
                yVar.setState(new int[0]);
                invalidateDrawable(this.C1);
            }
            this.E1 = null;
            this.f34891x2 = -1;
            return;
        }
        org.telegram.ui.Cells.y yVar2 = this.C1;
        if (yVar2 != null) {
            Drawable current = yVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.y yVar3 = this.C1;
        if (yVar3 != null && yVar3.isStateful() && this.C1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.C1);
        }
    }

    public final void m1(View view, MotionEvent motionEvent) {
        if (view != null) {
            Rect rect = this.F1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    k1(this.N1, view);
                    org.telegram.ui.Cells.y yVar = this.C1;
                    if (yVar != null) {
                        Drawable current = yVar.getCurrent();
                        if (current instanceof TransitionDrawable) {
                            ((TransitionDrawable) current).resetTransition();
                        }
                        if (motionEvent != null) {
                            this.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                    }
                } else {
                    rect.setEmpty();
                }
                y1();
            }
        }
    }

    public final void n1(ek0 ek0Var, boolean z10) {
        ViewParent parent;
        if (ek0Var != null && (parent = ek0Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void o1(int i7, boolean z10) {
        this.X1 = z10;
        this.Y1 = i7;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        jj0 jj0Var = this.f34854e1;
        if (jj0Var != null && jj0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f34854e1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f34854e1);
            }
            ((ViewGroup) getParent()).addView(this.f34854e1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D1 = -1;
        this.E1 = null;
        this.F1.setEmpty();
        hj0 hj0Var = this.f34870m2;
        if (hj0Var != null) {
            hj0Var.a();
        }
        if (this.f34885u2) {
            this.f34885u2 = false;
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25334k1, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.P1) {
                n1(this, true);
            }
            if (this.f34847a1 != null) {
                int i7 = org.telegram.ui.bn.f45940md;
                return true;
            } else if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        jj0 jj0Var = this.f34854e1;
        if (jj0Var != null) {
            this.I1 = true;
            if (jj0Var.f36523a) {
                i13 = getPaddingTop();
            } else {
                i13 = jj0Var.f36536i0;
            }
            int i14 = i10 + i13;
            jj0 jj0Var2 = this.f34854e1;
            if (jj0Var2.f36535h0) {
                jj0Var2.layout(0, i14, jj0Var2.getMeasuredWidth(), this.f34854e1.getMeasuredHeight() + i14);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f34854e1.getMeasuredWidth();
                jj0 jj0Var3 = this.f34854e1;
                jj0Var3.layout(measuredWidth, i14, jj0Var3.getMeasuredWidth() + measuredWidth, this.f34854e1.getMeasuredHeight() + i14);
            }
            this.I1 = false;
        }
        L0(false);
        nj0 nj0Var = this.T1;
        if (nj0Var != null) {
            e1(nj0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        super.onMeasure(i7, i10);
        jj0 jj0Var = this.f34854e1;
        if (jj0Var != null && jj0Var.getLayoutParams() != null) {
            jj0 jj0Var2 = this.f34854e1;
            if (jj0Var2.f36523a) {
                i11 = getPaddingTop();
            } else {
                i11 = jj0Var2.f36536i0;
            }
            int measuredHeight = (getMeasuredHeight() - i11) - getPaddingBottom();
            this.f34854e1.getLayoutParams().height = measuredHeight;
            this.f34854e1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.f34850b2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        View view;
        super.onSizeChanged(i7, i10, i11, i12);
        bi.e3 e3Var = this.f34851c1;
        if (e3Var != null) {
            e3Var.requestLayout();
        }
        int i13 = this.f34890x1;
        if (i13 == 1) {
            if (this.f34856f1 != null && !this.f34872o1.isEmpty()) {
                for (int i14 = 0; i14 < this.f34872o1.size(); i14++) {
                    S0((View) this.f34872o1.get(i14), true);
                }
            }
        } else if (i13 == 2 && this.f34856f1 != null && (view = this.f34876q1) != null) {
            S0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        jj0 jj0Var = this.f34854e1;
        if (jj0Var != null && jj0Var.f36540n) {
            return false;
        }
        boolean z10 = this.f34852c2;
        ik ikVar = this.D2;
        if (z10 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f34865j2 == Float.MAX_VALUE && this.f34867k2 == Float.MAX_VALUE) {
                this.f34865j2 = motionEvent.getX();
                this.f34867k2 = motionEvent.getY();
            }
            if (!this.d2 && Math.abs(motionEvent.getY() - this.f34867k2) > this.f34850b2) {
                this.d2 = true;
                n1(this, true);
            }
            if (this.d2) {
                M0(motionEvent.getX(), motionEvent.getY());
                m.b3 b3Var = this.f34859g2;
                int[] iArr = this.f34868l2;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) b3Var.d;
                iArr[0] = (int) bnVar.P9;
                iArr[1] = bnVar.Ya;
                if (motionEvent.getY() > (getMeasuredHeight() - org.telegram.messenger.g0.L(56.0f)) - this.f34868l2[1] && (this.f34857f2 >= this.f34855e2 || !this.f34859g2.f20052a)) {
                    this.f34863i2 = false;
                    if (!this.f34861h2) {
                        this.f34861h2 = true;
                        org.telegram.messenger.g0.r(ikVar);
                        org.telegram.messenger.g0.g3(ikVar);
                        return true;
                    }
                } else if (motionEvent.getY() < org.telegram.messenger.g0.L(56.0f) + this.f34868l2[0] && (this.f34857f2 <= this.f34855e2 || !this.f34859g2.f20052a)) {
                    this.f34863i2 = true;
                    if (!this.f34861h2) {
                        this.f34861h2 = true;
                        org.telegram.messenger.g0.r(ikVar);
                        org.telegram.messenger.g0.g3(ikVar);
                        return true;
                    }
                } else {
                    this.f34861h2 = false;
                    org.telegram.messenger.g0.r(ikVar);
                }
            }
            return true;
        }
        this.f34865j2 = Float.MAX_VALUE;
        this.f34867k2 = Float.MAX_VALUE;
        this.f34852c2 = false;
        this.d2 = false;
        n1(this, false);
        this.f34861h2 = false;
        org.telegram.messenger.g0.r(ikVar);
        return super.onTouchEvent(motionEvent);
    }

    public final void p1(tj0 tj0Var, long j3) {
        boolean z10;
        this.X0 = tj0Var;
        qf qfVar = this.L1;
        if (tj0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o10 o10Var = (o10) qfVar.f38896b;
        o10Var.f38055t = z10;
        o10Var.f38056u = j3;
    }

    public final void q1(int i7, int i10, int i11, int i12) {
        if (getPaddingLeft() == i7 && getPaddingTop() == i10 && getPaddingRight() == i11 && getPaddingBottom() == i12) {
            return;
        }
        this.C2 = true;
        setPadding(i7, i10, i11, i12);
        this.C2 = false;
    }

    public final void r1() {
        s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
    }

    @Override
    public void requestLayout() {
        if (!this.W1 && !this.C2) {
            super.requestLayout();
        }
    }

    public void s1(int i7, float f10, boolean z10) {
        ci.y yVar = new ci.y(7);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new hi.q4(this, yVar, sparseIntArray, 3), new wi(sparseIntArray, 2));
        t1((org.telegram.messenger.z10) pair.first, (org.telegram.messenger.z10) pair.second, i7, f10, z10);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f34875p2 = z10;
    }

    @Override
    public void setAdapter(v4.i0 i0Var) {
        v4.i0 adapter = getAdapter();
        jg.m1 m1Var = this.f34881s2;
        if (adapter != null) {
            adapter.f59201a.unregisterObserver(m1Var);
        }
        ArrayList arrayList = this.f34872o1;
        if (arrayList != null) {
            arrayList.clear();
            this.f34874p1.clear();
        }
        this.f34878r1 = -1;
        this.D1 = -1;
        this.E1 = null;
        this.F1.setEmpty();
        this.f34876q1 = null;
        if (i0Var instanceof zj0) {
            this.f34856f1 = (zj0) i0Var;
        } else {
            this.f34856f1 = null;
        }
        super.setAdapter(i0Var);
        if (i0Var != null) {
            i0Var.B(m1Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f34864j1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f34888w1 = z10;
    }

    public void setBitmapSectionsBackgroundColorKey(int i7) {
        if (this.W2 == i7) {
            return;
        }
        this.W2 = i7;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.G2 = z10;
        if (z10) {
            setLegacySections(false);
        }
    }

    public void setDisableHighlightState(boolean z10) {
        this.f34862i1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.P1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.T0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.A1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.f34849b1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.f34849b1 = view;
            if (this.X1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f34860h1) {
                View view3 = this.f34849b1;
                if (view3 != null) {
                    this.A2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.A2 = -1;
            K0(false);
        }
    }

    public void setFastScrollEnabled(int i7) {
        this.f34854e1 = new jj0(this, getContext(), i7);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f34854e1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        int i7;
        jj0 jj0Var = this.f34854e1;
        if (jj0Var == null) {
            return;
        }
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        jj0Var.setVisibility(i7);
        this.f34854e1.f36526b0 = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.f34894z1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.Q1 = z10;
    }

    @Override
    public void setItemAnimator(v4.n0 n0Var) {
        super.setItemAnimator(n0Var);
    }

    public void setItemSelectorColorProvider(org.telegram.messenger.j9 j9Var) {
        this.f34889w2 = j9Var;
    }

    public void setItemsEnterAnimator(hj0 hj0Var) {
        this.f34870m2 = hj0Var;
    }

    public void setLegacySections(boolean z10) {
        if (this.T2 == z10) {
            return;
        }
        this.T2 = z10;
        f1();
        a0();
        invalidate();
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i7;
        if (num == null) {
            if (b1()) {
                i7 = org.telegram.ui.ActionBar.m6.f29490j6;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.f29473i6;
            }
            intValue = org.telegram.ui.ActionBar.m6.w0(i7, this.f34873o2);
        } else {
            intValue = num.intValue();
        }
        this.f34887v2 = intValue;
        org.telegram.ui.ActionBar.m6.H1(this.C1, intValue, true);
    }

    public void setOnInterceptTouchListener(pj0 pj0Var) {
        this.f34847a1 = pj0Var;
    }

    public void setOnItemClickListener(qj0 qj0Var) {
        this.U0 = qj0Var;
    }

    public void setOnItemLongClickListener(sj0 sj0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.W0 = sj0Var;
        qf qfVar = this.L1;
        boolean z10 = sj0Var != null;
        o10 o10Var = (o10) qfVar.f38896b;
        o10Var.f38055t = z10;
        o10Var.f38056u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(v4.u0 u0Var) {
        this.Z0 = u0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.f34866k1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i7) {
        this.f34886v1 = i7;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f34879r2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.S1 = z10;
    }

    public void setSections(boolean z10) {
        s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), z10);
    }

    public void setSectionsDrawBackground(boolean z10) {
        if (this.U2 != z10) {
            this.U2 = z10;
            if (z10) {
                setLegacySections(false);
            }
            v9 v9Var = this.S2;
            if (v9Var != null) {
                ek0 ek0Var = v9Var.f40726a;
                if (v9Var.L != z10) {
                    v9Var.L = z10;
                    ek0Var.a0();
                    ek0Var.invalidate();
                }
                this.f34894z1 = false;
                if (this.f34849b1 != null) {
                    setVisibility(0);
                }
            }
        }
    }

    public void setSectionsDrawingMode(ck0 ck0Var) {
        if (this.V2 != ck0Var) {
            this.V2 = ck0Var;
            v9 v9Var = this.S2;
            if (v9Var != null) {
                ek0 ek0Var = v9Var.f40726a;
                if (v9Var.M != ck0Var) {
                    v9Var.M = ck0Var;
                    ek0Var.a0();
                    ek0Var.invalidate();
                }
            }
        }
    }

    public void setSectionsOverscanTop(int i7) {
        this.R2 = i7;
    }

    public void setSectionsType(int i7) {
        this.f34890x1 = i7;
        if (i7 != 1 && i7 != 3) {
            return;
        }
        this.f34872o1 = new ArrayList();
        this.f34874p1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i7) {
        this.f34887v2 = i7;
        org.telegram.ui.Cells.y yVar = this.C1;
        if (yVar != null) {
            yVar.setCallback(null);
        }
        int i10 = this.B1;
        if (i10 == 8) {
            this.C1 = org.telegram.ui.ActionBar.m6.a0(i7, this.Z1, 0);
        } else if (i10 == 9) {
            this.C1 = null;
        } else {
            int i11 = this.f34848a2;
            if (i11 > 0) {
                this.C1 = org.telegram.ui.ActionBar.m6.a0(i7, i11, i11);
            } else {
                int i12 = this.Z1;
                if (i12 > 0 && i10 != 1) {
                    this.C1 = org.telegram.ui.ActionBar.m6.k0(i12, i12, i12, i12, 0, i7, -16777216);
                } else if (i10 == 2) {
                    this.C1 = org.telegram.ui.ActionBar.m6.h0(i7, 2, -1);
                } else {
                    this.C1 = org.telegram.ui.ActionBar.m6.h0(i7, i10, i12);
                }
            }
        }
        org.telegram.ui.Cells.y yVar2 = this.C1;
        if (yVar2 != null) {
            yVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i7) {
        this.Z1 = i7;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.f34871n2 = aVar;
    }

    public void setSelectorType(int i7) {
        this.B1 = i7;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f34892y1 = z10;
    }

    public void setTopBottomSelectorRadius(int i7) {
        this.f34848a2 = i7;
    }

    public void setTranslateSelector(boolean z10) {
        int i7;
        if (z10) {
            i7 = -2;
        } else {
            i7 = -1;
        }
        this.H1 = i7;
    }

    public void setTranslateSelectorPosition(int i7) {
        if (i7 <= 0) {
            i7 = -1;
        }
        this.H1 = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        jj0 jj0Var = this.f34854e1;
        if (jj0Var != null) {
            jj0Var.setTranslationY(f10);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (Z2 != null) {
            super.setVerticalScrollBarEnabled(z10);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 != 0) {
            this.V1 = false;
        }
    }

    public final void t1(org.telegram.messenger.z10 z10Var, org.telegram.messenger.z10 z10Var2, int i7, float f10, boolean z10) {
        ky kyVar = new ky(this, 15);
        org.telegram.ui.ActionBar.t6.l(this, 20, org.telegram.ui.ActionBar.m6.f29490j6, this.f34873o2);
        this.I2 = z10Var;
        this.J2 = z10Var2;
        this.P2 = i7;
        this.Q2 = z10;
        this.M2 = f10;
        this.N2 = new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f};
        this.O2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10};
        this.K2 = kyVar;
        f1();
    }

    public boolean u1(View view) {
        return true;
    }

    @Override
    public final boolean v(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        if (this.Y0) {
            tj0 tj0Var = this.X0;
            if (tj0Var != null) {
                tj0Var.r(i10);
            }
            iArr[0] = i7;
            iArr[1] = i10;
            return true;
        }
        return super.v(i7, i10, i11, iArr, iArr2);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.C1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public boolean w1() {
        return this.H;
    }

    public final void x1() {
        jj0 jj0Var = this.f34854e1;
        if (jj0Var != null) {
            jj0Var.updateColors();
        }
    }

    public final void y1() {
        org.telegram.ui.Cells.y yVar = this.C1;
        if (yVar != null && yVar.isStateful()) {
            if (this.M1 != null) {
                if (this.C1.setState(getDrawableStateForSelector())) {
                    invalidateDrawable(this.C1);
                }
            } else if (this.U1 == null) {
                this.C1.setState(StateSet.NOTHING);
            }
        }
    }

    public ek0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.T0 = true;
        this.f34864j1 = true;
        this.f34878r1 = -1;
        this.f34880s1 = -1;
        this.f34892y1 = false;
        this.f34894z1 = true;
        this.B1 = 2;
        this.F1 = new Rect();
        this.H1 = -1;
        this.S1 = true;
        this.f34865j2 = Float.MAX_VALUE;
        this.f34867k2 = Float.MAX_VALUE;
        this.f34875p2 = true;
        this.f34877q2 = new he(1);
        this.f34879r2 = true;
        this.f34881s2 = new jg.m1(this, 1);
        this.D2 = new ik(this, 13);
        this.T2 = true;
        this.V2 = ck0.f34209a;
        this.W2 = org.telegram.ui.ActionBar.m6.f29324a7;
        this.Y2 = new Path();
        this.f34873o2 = h6Var;
        dt dtVar = new dt();
        this.E2 = dtVar;
        setEdgeEffectFactory(dtVar);
        org.telegram.ui.ActionBar.t6.l(this, 21, org.telegram.ui.ActionBar.m6.f29661s8, h6Var);
        org.telegram.ui.ActionBar.t6.l(this, 20, org.telegram.ui.ActionBar.m6.f29473i6, h6Var);
        try {
            if (!f34842a3) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                Z2 = iArr;
                if (iArr == null) {
                    Z2 = new int[0];
                }
                f34842a3 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(Z2);
            Method method = f34843b3;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        super.setOnScrollListener(new oa(this, 16));
        this.F.add(new xj0(context, this));
    }

    public void setOnItemClickListener(rj0 rj0Var) {
        this.V0 = rj0Var;
    }

    public void setOnItemLongClickListener(tj0 tj0Var) {
        p1(tj0Var, ViewConfiguration.getLongPressTimeout());
    }
}
