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
public class tk0 extends RecyclerView implements ug.a {
    public static int[] Y2;
    public static boolean Z2;
    public static final Method f30596a3;
    public static final Paint f30597b3;
    public static final Path f30598c3;
    public static final float[] f30599d3;
    public int A1;
    public boolean A2;
    public org.telegram.ui.Cells.y B1;
    public boolean B2;
    public int C1;
    public final ew C2;
    public View D1;
    public final zs D2;
    public final Rect E1;
    public Matrix E2;
    public boolean F1;
    public boolean F2;
    public int G1;
    public ek0 G2;
    public boolean H1;
    public org.telegram.messenger.r20 H2;
    public boolean I1;
    public org.telegram.messenger.r20 I2;
    public boolean J1;
    public px J2;
    public m2.t K1;
    public ArrayList K2;
    public View L1;
    public float L2;
    public int M1;
    public float[] M2;
    public boolean N1;
    public float[] N2;
    public boolean O1;
    public int O2;
    public boolean P1;
    public boolean P2;
    public kk0 Q1;
    public int Q2;
    public boolean R1;
    public l9 R2;
    public boolean S0;
    public dk0 S1;
    public boolean S2;
    public gk0 T0;
    public eb0 T1;
    public boolean T2;
    public hk0 U0;
    public boolean U1;
    public rk0 U2;
    public ik0 V0;
    public boolean V1;
    public int V2;
    public jk0 W0;
    public boolean W1;
    public ArrayList W2;
    public boolean X0;
    public int X1;
    public final Path X2;
    public s4.s0 Y0;
    public int Y1;
    public fk0 Z0;
    public int Z1;
    public View f30600a1;
    public int a2;
    public jg.l0 f30601b1;
    public boolean f30602b2;
    public lg.k f30603c1;
    public boolean f30604c2;
    public zj0 f30605d1;
    public int f30606d2;
    public ok0 f30607e1;
    public int f30608e2;
    public boolean f30609f1;
    public m.c3 f30610f2;
    public boolean f30611g1;
    public boolean f30612g2;
    public boolean f30613h1;
    public boolean f30614h2;
    public boolean f30615i1;
    public float f30616i2;
    public Drawable f30617j1;
    public float f30618j2;
    public float f30619k1;
    public int[] f30620k2;
    public float l1;
    public wj0 f30621l2;
    public long f30622m1;
    public q0.a f30623m2;
    public ArrayList f30624n1;
    public final org.telegram.ui.ActionBar.p6 f30625n2;
    public ArrayList f30626o1;
    public boolean f30627o2;
    public View f30628p1;
    public final td f30629p2;
    public int f30630q1;
    public boolean f30631q2;
    public int f30632r1;
    public final xj0 f30633r2;
    public int f30634s1;
    public Paint f30635s2;
    public int f30636t1;
    public boolean f30637t2;
    public int f30638u1;
    public int f30639u2;
    public boolean f30640v1;
    public org.telegram.messenger.l9 f30641v2;
    public int f30642w1;
    public int f30643w2;
    public boolean f30644x1;
    public int f30645x2;
    public boolean f30646y1;
    public boolean f30647y2;
    public boolean f30648z1;
    public int f30649z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        f30596a3 = method;
        f30597b3 = new Paint(1);
        new Paint(1);
        f30598c3 = new Path();
        f30599d3 = new float[8];
    }

    public tk0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        if (view.getTag(2131296419) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static boolean a1(View view) {
        if (view instanceof nk0) {
            zt0 zt0Var = (zt0) ((nk0) view);
            if (zt0Var.f33175b2 && zt0Var.f33189f2 > 0) {
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
        if (view.getTag(2131296419) != null) {
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
        this.D2.f33159b.add(new ws(runnable, 1));
    }

    @Override
    public final View E(float f7, float f10) {
        float f11;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                if ((!(childAt instanceof org.telegram.ui.Cells.q1) && !(childAt instanceof org.telegram.ui.Cells.s0)) || childAt.getVisibility() != 4) {
                    float f12 = 0.0f;
                    if (i10 == 0) {
                        f11 = childAt.getTranslationX();
                    } else {
                        f11 = 0.0f;
                    }
                    if (i10 == 0) {
                        f12 = childAt.getTranslationY();
                    }
                    if (f7 >= childAt.getLeft() + f11 && f7 <= childAt.getRight() + f11 && f10 >= childAt.getTop() + f12 && f10 <= childAt.getBottom() + f12) {
                        return childAt;
                    }
                }
            }
        }
        return null;
    }

    public boolean E0(float f7) {
        return true;
    }

    public boolean F0(View view) {
        return true;
    }

    public boolean H0(View view, float f7, float f10) {
        return true;
    }

    public final void I0(boolean z10) {
        lg.k kVar = this.f30603c1;
        if (kVar != null) {
            org.telegram.messenger.i0.r(kVar);
            this.f30603c1 = null;
        }
        View view = this.L1;
        if (view != null) {
            if (z10) {
                j1(view, 0.0f, 0.0f, false);
            }
            this.L1 = null;
            m1(view, null);
        }
        this.E1.setEmpty();
        kk0 kk0Var = this.Q1;
        if (kk0Var != null) {
            org.telegram.messenger.i0.r(kk0Var);
            this.Q1 = null;
        }
        this.N1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j10) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            s4.m0 X = X(i10);
            if ((X instanceof ug.a) && ((X != this.G2 && X != this.R2) || this.F2)) {
                ((ug.a) X).d(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x10 = childAt.getX();
            float y3 = childAt.getY();
            if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                this.A2 = true;
                drawChild(canvas, childAt, j10);
                this.A2 = false;
            }
        }
    }

    public final void K0(boolean z10) {
        int i10;
        if (!this.f30611g1) {
            int i11 = 0;
            if (getAdapter() != null && this.f30600a1 != null) {
                boolean R0 = R0();
                if (R0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (!this.W1 || !org.telegram.messenger.tz.c()) {
                    z10 = false;
                }
                if (z10) {
                    if (this.f30649z2 != i10) {
                        this.f30649z2 = i10;
                        if (i10 == 0) {
                            this.f30600a1.animate().setListener(null).cancel();
                            if (this.f30600a1.getVisibility() == 8) {
                                this.f30600a1.setVisibility(0);
                                this.f30600a1.setAlpha(0.0f);
                                if (this.X1 == 1) {
                                    this.f30600a1.setScaleX(0.7f);
                                    this.f30600a1.setScaleY(0.7f);
                                }
                            }
                            this.f30600a1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.f30600a1.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.f30600a1.animate().alpha(0.0f);
                            if (this.X1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new t60(this, 14)).start();
                        }
                    }
                } else {
                    this.f30649z2 = i10;
                    this.f30600a1.setVisibility(i10);
                    this.f30600a1.setAlpha(1.0f);
                }
                if (this.f30646y1) {
                    if (!b1() || !this.T2) {
                        if (R0) {
                            i11 = 4;
                        }
                        if (getVisibility() != i11) {
                            setVisibility(i11);
                        }
                        this.U1 = true;
                    }
                }
            } else if (this.U1 && getVisibility() != 0) {
                setVisibility(0);
                this.U1 = false;
            }
        }
    }

    public final void L0(boolean z10) {
        zj0 zj0Var;
        int paddingTop;
        s4.c1 T;
        zj0 zj0Var2;
        View view;
        boolean z11;
        int i10;
        s4.c1 T2;
        int b10;
        int S;
        boolean z12;
        int i11;
        int i12;
        if (((this.I1 || z10) && this.f30605d1 != null) || (this.f30642w1 != 0 && this.f30607e1 != null)) {
            s4.n0 layoutManager = getLayoutManager();
            if (layoutManager instanceof s4.a0) {
                s4.a0 a0Var = (s4.a0) layoutManager;
                if (a0Var.f47868o == 1) {
                    if (this.f30607e1 != null) {
                        if (this.f30642w1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i13 = this.f30642w1;
                        float f7 = 32.0f;
                        int i14 = Integer.MAX_VALUE;
                        if (i13 != 1 && i13 != 3) {
                            if (i13 == 2) {
                                this.l1 = 0.0f;
                                if (this.f30607e1.b() != 0) {
                                    int childCount = getChildCount();
                                    int i15 = 0;
                                    int i16 = Integer.MAX_VALUE;
                                    View view2 = null;
                                    View view3 = null;
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        View childAt = getChildAt(i17);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f30638u1 + paddingTop) {
                                            if (bottom < i14) {
                                                view3 = childAt;
                                                i14 = bottom;
                                            }
                                            i15 = Math.max(i15, bottom);
                                            if (bottom >= org.telegram.messenger.i0.L(32.0f) + this.f30638u1 + paddingTop && bottom < i16) {
                                                view2 = childAt;
                                                i16 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T2 = T(view3)) != null && (S = this.f30607e1.S((b10 = T2.b()))) >= 0) {
                                        if (this.f30630q1 != S || this.f30628p1 == null) {
                                            View view4 = this.f30628p1;
                                            if (view4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            View T3 = this.f30607e1.T(S, view4);
                                            if (z12) {
                                                S0(T3, false);
                                            }
                                            this.f30628p1 = T3;
                                            T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f30628p1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f30628p1.getMeasuredHeight());
                                            this.f30630q1 = S;
                                        }
                                        if (this.f30628p1 != null && view2 != null && view2.getClass() != this.f30628p1.getClass()) {
                                            this.l1 = 1.0f;
                                        }
                                        int M = this.f30607e1.M(S);
                                        int Q = this.f30607e1.Q(b10);
                                        if (i15 != 0 && i15 < getMeasuredHeight() - getPaddingBottom()) {
                                            i11 = -paddingTop;
                                        } else {
                                            i11 = this.f30638u1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f30628p1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f30638u1);
                                            if (height2 < height) {
                                                i12 = height2 - height;
                                            } else {
                                                i12 = paddingTop;
                                            }
                                            if (i12 < 0) {
                                                this.f30628p1.setTag(Integer.valueOf(paddingTop + i11 + i12));
                                            } else {
                                                this.f30628p1.setTag(Integer.valueOf(paddingTop + i11));
                                            }
                                        } else {
                                            this.f30628p1.setTag(Integer.valueOf(paddingTop + i11));
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
                        int i18 = 0;
                        int i19 = 0;
                        int i20 = Integer.MAX_VALUE;
                        View view6 = null;
                        while (i18 < childCount2) {
                            View childAt2 = getChildAt(i18);
                            float f10 = f7;
                            int bottom2 = childAt2.getBottom();
                            if (bottom2 > this.f30638u1 + paddingTop) {
                                if (bottom2 < i14) {
                                    i14 = bottom2;
                                    view6 = childAt2;
                                }
                                i19 = Math.max(i19, bottom2);
                                if (bottom2 >= org.telegram.messenger.i0.L(f10) + this.f30638u1 + paddingTop && bottom2 < i20) {
                                    i20 = bottom2;
                                }
                            }
                            i18++;
                            f7 = f10;
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(a0Var.N0() - b11) + 1;
                            if ((this.I1 || z10) && (zj0Var2 = this.f30605d1) != null && !zj0Var2.f33092n && (getAdapter() instanceof ak0)) {
                                this.f30605d1.setProgress(Math.min(1.0f, b11 / ((this.f30607e1.b() - abs) + 1)));
                            }
                            this.f30626o1.addAll(this.f30624n1);
                            this.f30624n1.clear();
                            if (this.f30607e1.b() != 0) {
                                if (this.f30630q1 != b11 || this.f30632r1 != abs) {
                                    this.f30630q1 = b11;
                                    this.f30632r1 = abs;
                                    this.f30636t1 = 1;
                                    int S2 = this.f30607e1.S(b11);
                                    this.f30634s1 = S2;
                                    int M2 = (this.f30607e1.M(S2) + b11) - this.f30607e1.Q(b11);
                                    while (M2 < b11 + abs) {
                                        M2 += this.f30607e1.M(this.f30634s1 + this.f30636t1);
                                        this.f30636t1++;
                                    }
                                }
                                if (this.f30642w1 != 3) {
                                    int i21 = b11;
                                    for (int i22 = this.f30634s1; i22 < this.f30634s1 + this.f30636t1; i22++) {
                                        if (!this.f30626o1.isEmpty()) {
                                            view = (View) this.f30626o1.get(0);
                                            this.f30626o1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        View T4 = this.f30607e1.T(i22, view);
                                        if (z11) {
                                            S0(T4, false);
                                        }
                                        this.f30624n1.add(T4);
                                        int M3 = this.f30607e1.M(i22);
                                        if (i22 == this.f30634s1) {
                                            int Q2 = this.f30607e1.Q(i21);
                                            if (Q2 == M3 - 1) {
                                                T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                            } else if (Q2 == M3 - 2) {
                                                View childAt3 = getChildAt(i21 - b11);
                                                if (childAt3 != null) {
                                                    i10 = childAt3.getTop() + paddingTop;
                                                } else {
                                                    i10 = -org.telegram.messenger.i0.L(100.0f);
                                                }
                                                T4.setTag(Integer.valueOf(Math.min(i10, 0)));
                                            } else {
                                                T4.setTag(0);
                                            }
                                            i21 = (M3 - this.f30607e1.Q(b11)) + i21;
                                        } else {
                                            View childAt4 = getChildAt(i21 - b11);
                                            if (childAt4 != null) {
                                                T4.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                            } else {
                                                T4.setTag(Integer.valueOf(-org.telegram.messenger.i0.L(100.0f)));
                                            }
                                            i21 += M3;
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
                    int L0 = a0Var.L0();
                    Math.abs(a0Var.N0() - L0);
                    if (L0 != -1) {
                        if ((this.I1 || z10) && (zj0Var = this.f30605d1) != null && !zj0Var.f33092n) {
                            s4.g0 adapter = getAdapter();
                            if (adapter instanceof ak0) {
                                ak0 ak0Var = (ak0) adapter;
                                float H = ak0Var.H(this);
                                this.f30605d1.setIsVisible(ak0Var.E(this));
                                this.f30605d1.setProgress(Math.min(1.0f, H));
                                this.f30605d1.a(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void M0(float f7, float f10) {
        boolean z10;
        org.telegram.messenger.ej ejVar;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.f30620k2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f7, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            m.c3 c3Var = this.f30610f2;
            int[] iArr2 = this.f30620k2;
            org.telegram.ui.un unVar = (org.telegram.ui.un) c3Var.d;
            iArr2[0] = (int) unVar.L9;
            iArr2[1] = unVar.Ua;
            View childAt = getChildAt(i10);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.f30608e2;
                if (i11 != S) {
                    int i12 = this.f30606d2;
                    if (i11 <= i12 && S <= i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.un unVar2 = (org.telegram.ui.un) this.f30610f2.d;
                    org.telegram.ui.fm fmVar = unVar2.C0;
                    ArrayList arrayList = unVar2.K6;
                    int i13 = S - fmVar.J;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i13);
                        if (jjVar.U == 0 && jjVar.z2() && (ejVar = (org.telegram.messenger.ej) unVar2.N6.f(jjVar.d1())) != null) {
                            ArrayList arrayList2 = ejVar.d;
                            if (z10) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf((org.telegram.messenger.jj) arrayList2.get(size)) + unVar2.C0.J;
                        }
                    }
                    if (z10) {
                        int i14 = this.f30608e2;
                        if (S > i14) {
                            if (!this.f30610f2.f12381a) {
                                for (int i15 = i14 + 1; i15 <= S; i15++) {
                                    if (i15 != this.f30606d2 && this.f30610f2.a(i15)) {
                                        this.f30610f2.c(i15, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i14 > S) {
                                if (i14 != this.f30606d2 && this.f30610f2.a(i14)) {
                                    this.f30610f2.c(i14, false, min2, min);
                                }
                                i14--;
                            }
                        }
                    } else {
                        int i16 = this.f30608e2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.f30606d2 && this.f30610f2.a(i16)) {
                                    this.f30610f2.c(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.f30610f2.f12381a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.f30606d2 && this.f30610f2.a(i17)) {
                                    this.f30610f2.c(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f30610f2.f12381a) {
                    this.f30608e2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void N0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (this.R2 == null && view != null && u1(view) && ((Boolean) this.G2.f25822a.a(view)).booleanValue() && i1(view)) {
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
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(view.getX(), Math.max((-this.L2) - this.Q2, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight() + this.L2, G0(view)));
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
            Path path = this.X2;
            if (!z10 && !z11) {
                path.rewind();
                float f7 = this.L2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z10) {
                path.rewind();
                path.addRoundRect(rectF, this.M2, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void O0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f7;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof y70) {
                f7 = ((y70) view2).getBottomInfoMargin();
            } else {
                f7 = 0.0f;
            }
            RectF rectF = org.telegram.messenger.i0.P;
            float left = view.getLeft();
            float f12 = (-this.L2) - this.Q2;
            float v12 = v1(view);
            if (z10) {
                f10 = this.L2;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(f12, v12 - f10);
            float right = view.getRight();
            float height = getHeight() + this.L2;
            float G0 = G0(view2);
            if (z11) {
                f11 = this.L2;
            }
            rectF.set(left, max, right, Math.min(height, (G0 + f11) - f7));
            if (rectF.bottom >= rectF.top) {
                float f13 = this.L2;
                this.J2.k(canvas, rectF, Float.valueOf(f13), Float.valueOf(f13), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void P0(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tk0.P0(android.graphics.Canvas):void");
    }

    public final void Q0(Canvas canvas) {
        org.telegram.ui.Cells.y yVar;
        q0.a aVar;
        View view;
        Rect rect = this.E1;
        if (!rect.isEmpty() && (yVar = this.B1) != null) {
            int i10 = this.G1;
            if ((i10 == -2 || i10 == this.C1) && this.D1 != null) {
                if (getAdapter() instanceof sk0) {
                    ((sk0) getAdapter()).getClass();
                }
                this.B1.setBounds(this.D1.getLeft(), this.D1.getTop(), this.D1.getRight(), this.D1.getBottom());
            } else {
                yVar.setBounds(rect);
            }
            canvas.save();
            int i11 = this.G1;
            if ((i11 == -2 || i11 == this.C1) && (aVar = this.f30623m2) != null) {
                aVar.accept(canvas);
            }
            int i12 = this.G1;
            if ((i12 == -2 || i12 == this.C1) && (view = this.D1) != null) {
                canvas.translate(view.getX() - rect.left, this.D1.getY() - rect.top);
                this.B1.setAlpha((int) (this.D1.getAlpha() * 255.0f));
            }
            if (this.G2 != null) {
                canvas.save();
                N0(canvas, this.D1);
                this.B1.draw(canvas);
                canvas.restore();
            } else {
                this.B1.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean R0() {
        if (getAdapter() != null && !this.V1 && getAdapter().b() == 0) {
            return true;
        }
        return false;
    }

    public final void S0(View view, boolean z10) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z10) {
                return;
            }
            int i10 = this.f30642w1;
            if (i10 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            } else if (i10 == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final View T0(int i10) {
        if (i10 != -1) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R == i10) {
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
                    return org.telegram.ui.ActionBar.t6.d0(0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.f30625n2));
                }
                z12 = z13;
            }
            Path path = new Path();
            if ((!z11 && !z12) || z10) {
                path.rewind();
                float f7 = this.L2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.M2, Path.Direction.CW);
            } else if (!z12) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
            }
            return new yj0(this, view, path, rectF);
        }
        return null;
    }

    public Integer V0(int i10) {
        org.telegram.messenger.l9 l9Var = this.f30641v2;
        if (l9Var != null) {
            return (Integer) l9Var.l(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint W0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.p6 p6Var = this.f30625n2;
        if (p6Var != null) {
            paint = p6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.t6.V0(str);
    }

    public final boolean X0(int i10, View view) {
        int R;
        if (view != null && i10 <= 0 && getAdapter() != null && this.I2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.I2.a(Integer.valueOf(getAdapter().d(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Y0() {
        ys[] ysVarArr;
        for (ys ysVar : this.D2.f33158a) {
            if (ysVar != null && ysVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z0(int i10, View view) {
        int R;
        if (view != null && i10 >= getChildCount() - 1 && getAdapter() != null && this.I2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().b() - 1) {
            return ((Boolean) this.I2.a(Integer.valueOf(getAdapter().d(R + 1)))).booleanValue();
        }
        return false;
    }

    public final boolean b1() {
        if (this.G2 == null && this.R2 == null) {
            return false;
        }
        return true;
    }

    public final void c1() {
        if (!this.f30611g1) {
            this.f30611g1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.f30600a1;
            if (view != null && view.getVisibility() != 8) {
                this.f30600a1.setVisibility(8);
            }
        }
    }

    @Override
    public final boolean canScrollVertically(int i10) {
        if (this.R1 && super.canScrollVertically(i10)) {
            return true;
        }
        return false;
    }

    public void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Y0() && getOverScrollMode() != 2) {
            if (this.E2 == null) {
                this.E2 = new Matrix();
            }
            int save = canvas.save();
            Matrix matrix = getMatrix();
            if (!matrix.isIdentity() && matrix.invert(this.E2)) {
                canvas.concat(this.E2);
            }
            canvas.translate(-getLeft(), -getTop());
            try {
                super.drawChild(canvas, this, uptimeMillis);
                return;
            } catch (Throwable th2) {
                try {
                    org.telegram.messenger.f8.g(th2, true);
                    return;
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
        J0(canvas, rectF, uptimeMillis);
    }

    public final void d1(boolean z10) {
        View view = this.L1;
        if (view != null) {
            j1(view, 0.0f, 0.0f, false);
            this.L1 = null;
            if (z10) {
                m1(view, null);
            }
        }
        if (!z10) {
            this.B1.setState(StateSet.NOTHING);
            this.E1.setEmpty();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f7;
        wj0 wj0Var = this.f30621l2;
        if (wj0Var != null) {
            tk0 tk0Var = wj0Var.f32209a;
            if (wj0Var.d || wj0Var.e) {
                for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
                    View childAt = tk0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !wj0Var.f32211c.contains(childAt)) {
                        Float f10 = (Float) wj0Var.f32210b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                wj0Var.d = false;
            }
        }
        if (this.S0 && this.f30648z1) {
            Q0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.S0 && !this.f30648z1) {
            Q0(canvas);
        }
        jg.l0 l0Var = this.f30601b1;
        if (l0Var != null) {
            l0Var.draw(canvas);
        }
        if (!this.f30644x1) {
            int i11 = this.f30642w1;
            float f11 = 0.0f;
            if (i11 == 1) {
                if (this.f30607e1 != null && !this.f30624n1.isEmpty()) {
                    for (int i12 = 0; i12 < this.f30624n1.size(); i12++) {
                        View view2 = (View) this.f30624n1.get(i12);
                        int save = canvas.save();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        if (org.telegram.messenger.cd.X) {
                            f7 = getWidth() - view2.getWidth();
                        } else {
                            f7 = 0.0f;
                        }
                        canvas.translate(f7, intValue);
                        canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                        view2.draw(canvas);
                        canvas.restoreToCount(save);
                    }
                }
            } else if (i11 == 2 && this.f30607e1 != null && (view = this.f30628p1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f30628p1.getTag()).intValue();
                if (org.telegram.messenger.cd.X) {
                    f11 = getWidth() - this.f30628p1.getWidth();
                }
                canvas.translate(f11, intValue2);
                Drawable drawable = this.f30617j1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f30628p1.getMeasuredHeight(), getWidth(), this.f30617j1.getIntrinsicHeight() + this.f30628p1.getMeasuredHeight());
                    this.f30617j1.setAlpha((int) (this.f30619k1 * 255.0f));
                    this.f30617j1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.f30622m1);
                    this.f30622m1 = elapsedRealtime;
                    float f12 = this.f30619k1;
                    float f13 = this.l1;
                    if (f12 < f13) {
                        float f14 = (((float) min) / 180.0f) + f12;
                        this.f30619k1 = f14;
                        if (f14 > f13) {
                            this.f30619k1 = f13;
                        }
                        invalidate();
                    } else if (f12 > f13) {
                        float f15 = f12 - (((float) min) / 180.0f);
                        this.f30619k1 = f15;
                        if (f15 < f13) {
                            this.f30619k1 = f13;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f30628p1.getMeasuredHeight());
                this.f30628p1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f30645x2 == 0 && this.f30647y2) {
                setOverScrollMode(0);
            }
            this.f30645x2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.f30645x2 - 1;
            this.f30645x2 = i10;
            if (i10 == 0 && this.f30647y2) {
                setOverScrollMode(2);
            }
        }
        zj0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.f33077a0 && fastScroll.f33091l0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f30607e1 != null && (view = this.f30628p1) != null && view.getAlpha() != 0.0f && this.f30628p1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.G2 != null && !this.A2) {
            canvas.save();
            N0(canvas, view);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1();
    }

    public final void e1(dk0 dk0Var, int i10, boolean z10) {
        eb0 eb0Var = this.T1;
        if (eb0Var != null) {
            org.telegram.messenger.i0.r(eb0Var);
            this.T1 = null;
        }
        s4.c1 K = K(dk0Var.run());
        if (K != null) {
            View view = K.f47898a;
            int c10 = K.c();
            this.f30643w2 = c10;
            k1(c10, view);
            org.telegram.ui.Cells.y yVar = this.B1;
            if (yVar != null) {
                Drawable current = yVar.getCurrent();
                if (current instanceof TransitionDrawable) {
                    if (this.V0 == null && this.U0 == null) {
                        ((TransitionDrawable) current).resetTransition();
                    } else {
                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                    }
                }
                this.B1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
            }
            org.telegram.ui.Cells.y yVar2 = this.B1;
            if (yVar2 != null && yVar2.isStateful() && this.B1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.B1);
            }
            if (i10 > 0) {
                this.S1 = null;
                eb0 eb0Var2 = new eb0(this, 19);
                this.T1 = eb0Var2;
                org.telegram.messenger.i0.h3(eb0Var2, i10);
            }
        } else if (z10) {
            this.S1 = dk0Var;
        }
    }

    public final void f1() {
        org.telegram.messenger.r20 r20Var;
        px pxVar;
        s4.m0 m0Var = this.G2;
        if (m0Var != null) {
            q0(m0Var);
            this.G2 = null;
        }
        s4.m0 m0Var2 = this.R2;
        if (m0Var2 != null) {
            q0(m0Var2);
            this.R2 = null;
        }
        org.telegram.messenger.r20 r20Var2 = this.H2;
        if (r20Var2 != null && (r20Var = this.I2) != null && (pxVar = this.J2) != null) {
            if (!this.S2) {
                l9 l9Var = new l9(this, r20Var2, r20Var, this.O2, this.L2, pxVar, this.P2, this.T2, this.U2);
                this.R2 = l9Var;
                i(l9Var);
                return;
            }
            ek0 ek0Var = new ek0(this, r20Var2, this.O2, this.P2);
            this.G2 = ek0Var;
            i(ek0Var);
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            yVar.f7258b = true;
        } else if (Y0() && getOverScrollMode() != 2) {
            yVar.f7258b = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i10 = 0; i10 < itemDecorationCount; i10++) {
                s4.m0 X = X(i10);
                if ((X instanceof ug.a) && ((X != this.G2 && X != this.R2) || this.F2)) {
                    ((ug.a) X).g(yVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                float x10 = childAt.getX();
                float y3 = childAt.getY();
                if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                    yVar.getClass();
                    android.support.v4.media.session.w.a(yVar, childAt);
                }
            }
        }
    }

    @Override
    public final void g0(View view) {
        if (getAdapter() instanceof sk0) {
            s4.c1 G = G(view);
            if (G != null) {
                view.setEnabled(((sk0) getAdapter()).D(G));
                if (this.f30627o2) {
                    view.setAccessibilityDelegate(this.f30629p2);
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
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.k6) {
                ((org.telegram.ui.ActionBar.k6) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    public View getEmptyView() {
        return this.f30600a1;
    }

    public zj0 getFastScroll() {
        return this.f30605d1;
    }

    public ArrayList<View> getHeaders() {
        return this.f30624n1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f30626o1;
    }

    public gk0 getOnItemClickListener() {
        return this.T0;
    }

    public s4.s0 getOnScrollListener() {
        return this.Y0;
    }

    public View getPinnedHeader() {
        return this.f30628p1;
    }

    public View getPressedChildView() {
        return this.L1;
    }

    public int getSectionColorForDecoration() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.f30625n2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return i0.b.o(org.telegram.ui.ActionBar.t6.w0(this.V2, this.f30625n2), 255);
    }

    public boolean getSectionsDrawBackground() {
        return this.T2;
    }

    public int getSectionsOverscanTop() {
        return this.Q2;
    }

    public Drawable getSelectorDrawable() {
        return this.B1;
    }

    public int getSelectorDrawableColor() {
        return this.f30639u2;
    }

    public Rect getSelectorRect() {
        return this.E1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public final boolean h1(int i10) {
        if (this.K2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.K2.size(); i11++) {
                long longValue = ((Long) this.K2.get(i11)).longValue();
                Typeface typeface = org.telegram.messenger.i0.f15999a;
                int i12 = (int) (longValue >> 32);
                int i13 = (int) longValue;
                if (i10 >= i12 && i10 <= i13) {
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
        l9 l9Var = this.R2;
        if (l9Var != null) {
            return l9Var.u(view);
        }
        ek0 ek0Var = this.G2;
        if (ek0Var != null && ((Boolean) ek0Var.f25822a.a(view)).booleanValue()) {
            return true;
        }
        return false;
    }

    public void j1(View view, float f7, float f10, boolean z10) {
        if (!this.f30613h1 && view != null) {
            view.setPressed(z10);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    public final void k1(int i10, View view) {
        boolean z10;
        int i11;
        int i12;
        eb0 eb0Var = this.T1;
        if (eb0Var != null) {
            org.telegram.messenger.i0.r(eb0Var);
            this.T1 = null;
            this.S1 = null;
        }
        if (this.B1 != null) {
            if (i10 != this.C1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getAdapter() instanceof sk0) {
                ((sk0) getAdapter()).getClass();
            }
            if (i10 != -1) {
                this.C1 = i10;
            }
            this.D1 = view;
            if (this.A1 == 8) {
                org.telegram.ui.ActionBar.t6.G1(this.B1, this.Y1, 0);
            } else if (this.Z1 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.y yVar = this.B1;
                if (i10 == 0) {
                    i11 = this.Z1;
                } else {
                    i11 = 0;
                }
                if (i10 == getAdapter().b() - 2) {
                    i12 = this.Z1;
                } else {
                    i12 = 0;
                }
                org.telegram.ui.ActionBar.t6.G1(yVar, i11, i12);
            }
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            Rect rect = this.E1;
            rect.set(left, top, right, bottom);
            boolean isEnabled = view.isEnabled();
            if (this.F1 != isEnabled) {
                this.F1 = isEnabled;
            }
            if (z10) {
                this.B1.setVisible(false, false);
                this.B1.setState(StateSet.NOTHING);
            }
            setListSelectorColor(V0(i10));
            this.B1.setBounds(rect);
            if (z10 && getVisibility() == 0) {
                this.B1.setVisible(true, false);
            }
        }
    }

    public final void l1() {
        int i10;
        eb0 eb0Var = this.T1;
        if (eb0Var != null) {
            org.telegram.messenger.i0.r(eb0Var);
            this.T1.run();
            this.T1 = null;
            this.D1 = null;
            return;
        }
        this.T1 = null;
        this.S1 = null;
        View view = this.D1;
        if (view != null && (i10 = this.f30643w2) != -1) {
            k1(i10, view);
            org.telegram.ui.Cells.y yVar = this.B1;
            if (yVar != null) {
                yVar.setState(new int[0]);
                invalidateDrawable(this.B1);
            }
            this.D1 = null;
            this.f30643w2 = -1;
            return;
        }
        org.telegram.ui.Cells.y yVar2 = this.B1;
        if (yVar2 != null) {
            Drawable current = yVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.y yVar3 = this.B1;
        if (yVar3 != null && yVar3.isStateful() && this.B1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.B1);
        }
    }

    public final void m1(View view, MotionEvent motionEvent) {
        if (view != null) {
            Rect rect = this.E1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    k1(this.M1, view);
                    org.telegram.ui.Cells.y yVar = this.B1;
                    if (yVar != null) {
                        Drawable current = yVar.getCurrent();
                        if (current instanceof TransitionDrawable) {
                            ((TransitionDrawable) current).resetTransition();
                        }
                        if (motionEvent != null) {
                            this.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                    }
                } else {
                    rect.setEmpty();
                }
                y1();
            }
        }
    }

    public final void n1(tk0 tk0Var, boolean z10) {
        ViewParent parent;
        if (tk0Var != null && (parent = tk0Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void o1(int i10, boolean z10) {
        this.W1 = z10;
        this.X1 = i10;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zj0 zj0Var = this.f30605d1;
        if (zj0Var != null && zj0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f30605d1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f30605d1);
            }
            ((ViewGroup) getParent()).addView(this.f30605d1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        wj0 wj0Var = this.f30621l2;
        if (wj0Var != null) {
            wj0Var.a();
        }
        if (this.f30637t2) {
            this.f30637t2 = false;
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19639k1, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.O1) {
                n1(this, true);
            }
            if (this.Z0 != null) {
                int i10 = org.telegram.ui.un.f42169ad;
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        zj0 zj0Var = this.f30605d1;
        if (zj0Var != null) {
            this.H1 = true;
            if (zj0Var.f33076a) {
                i14 = getPaddingTop();
            } else {
                i14 = zj0Var.f33087h0;
            }
            int i15 = i11 + i14;
            zj0 zj0Var2 = this.f30605d1;
            if (zj0Var2.f33086g0) {
                zj0Var2.layout(0, i15, zj0Var2.getMeasuredWidth(), this.f30605d1.getMeasuredHeight() + i15);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f30605d1.getMeasuredWidth();
                zj0 zj0Var3 = this.f30605d1;
                zj0Var3.layout(measuredWidth, i15, zj0Var3.getMeasuredWidth() + measuredWidth, this.f30605d1.getMeasuredHeight() + i15);
            }
            this.H1 = false;
        }
        L0(false);
        dk0 dk0Var = this.S1;
        if (dk0Var != null) {
            e1(dk0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        zj0 zj0Var = this.f30605d1;
        if (zj0Var != null && zj0Var.getLayoutParams() != null) {
            zj0 zj0Var2 = this.f30605d1;
            if (zj0Var2.f33076a) {
                i12 = getPaddingTop();
            } else {
                i12 = zj0Var2.f33087h0;
            }
            int measuredHeight = (getMeasuredHeight() - i12) - getPaddingBottom();
            this.f30605d1.getLayoutParams().height = measuredHeight;
            this.f30605d1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.a2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        jg.l0 l0Var = this.f30601b1;
        if (l0Var != null) {
            l0Var.requestLayout();
        }
        int i14 = this.f30642w1;
        if (i14 == 1) {
            if (this.f30607e1 != null && !this.f30624n1.isEmpty()) {
                for (int i15 = 0; i15 < this.f30624n1.size(); i15++) {
                    S0((View) this.f30624n1.get(i15), true);
                }
            }
        } else if (i14 == 2 && this.f30607e1 != null && (view = this.f30628p1) != null) {
            S0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        zj0 zj0Var = this.f30605d1;
        if (zj0Var != null && zj0Var.f33092n) {
            return false;
        }
        boolean z10 = this.f30602b2;
        ew ewVar = this.C2;
        if (z10 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f30616i2 == Float.MAX_VALUE && this.f30618j2 == Float.MAX_VALUE) {
                this.f30616i2 = motionEvent.getX();
                this.f30618j2 = motionEvent.getY();
            }
            if (!this.f30604c2 && Math.abs(motionEvent.getY() - this.f30618j2) > this.a2) {
                this.f30604c2 = true;
                n1(this, true);
            }
            if (this.f30604c2) {
                M0(motionEvent.getX(), motionEvent.getY());
                m.c3 c3Var = this.f30610f2;
                int[] iArr = this.f30620k2;
                org.telegram.ui.un unVar = (org.telegram.ui.un) c3Var.d;
                iArr[0] = (int) unVar.L9;
                iArr[1] = unVar.Ua;
                if (motionEvent.getY() > (getMeasuredHeight() - org.telegram.messenger.i0.L(56.0f)) - this.f30620k2[1] && (this.f30608e2 >= this.f30606d2 || !this.f30610f2.f12381a)) {
                    this.f30614h2 = false;
                    if (!this.f30612g2) {
                        this.f30612g2 = true;
                        org.telegram.messenger.i0.r(ewVar);
                        org.telegram.messenger.i0.g3(ewVar);
                        return true;
                    }
                } else if (motionEvent.getY() < org.telegram.messenger.i0.L(56.0f) + this.f30620k2[0] && (this.f30608e2 <= this.f30606d2 || !this.f30610f2.f12381a)) {
                    this.f30614h2 = true;
                    if (!this.f30612g2) {
                        this.f30612g2 = true;
                        org.telegram.messenger.i0.r(ewVar);
                        org.telegram.messenger.i0.g3(ewVar);
                        return true;
                    }
                } else {
                    this.f30612g2 = false;
                    org.telegram.messenger.i0.r(ewVar);
                }
            }
            return true;
        }
        this.f30616i2 = Float.MAX_VALUE;
        this.f30618j2 = Float.MAX_VALUE;
        this.f30602b2 = false;
        this.f30604c2 = false;
        n1(this, false);
        this.f30612g2 = false;
        org.telegram.messenger.i0.r(ewVar);
        return super.onTouchEvent(motionEvent);
    }

    public final void p1(jk0 jk0Var, long j10) {
        boolean z10;
        this.W0 = jk0Var;
        m2.t tVar = this.K1;
        if (jk0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        q10 q10Var = (q10) tVar.f12684b;
        q10Var.f29506t = z10;
        q10Var.f29507u = j10;
    }

    public final void q1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.B2 = true;
        setPadding(i10, i11, i12, i13);
        this.B2 = false;
    }

    public final void r1() {
        s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
    }

    @Override
    public void requestLayout() {
        if (!this.V1 && !this.B2) {
            super.requestLayout();
        }
    }

    public void s1(int i10, float f7, boolean z10) {
        org.telegram.ui.zh zhVar = new org.telegram.ui.zh(4);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new i(this, zhVar, sparseIntArray, 2), new di(sparseIntArray, 2));
        t1((org.telegram.messenger.r20) pair.first, (org.telegram.messenger.r20) pair.second, i10, f7, z10);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f30627o2 = z10;
    }

    @Override
    public void setAdapter(s4.g0 g0Var) {
        s4.g0 adapter = getAdapter();
        xj0 xj0Var = this.f30633r2;
        if (adapter != null) {
            adapter.f47932a.unregisterObserver(xj0Var);
        }
        ArrayList arrayList = this.f30624n1;
        if (arrayList != null) {
            arrayList.clear();
            this.f30626o1.clear();
        }
        this.f30630q1 = -1;
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        this.f30628p1 = null;
        if (g0Var instanceof ok0) {
            this.f30607e1 = (ok0) g0Var;
        } else {
            this.f30607e1 = null;
        }
        super.setAdapter(g0Var);
        if (g0Var != null) {
            g0Var.B(xj0Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f30615i1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f30640v1 = z10;
    }

    public void setBitmapSectionsBackgroundColorKey(int i10) {
        if (this.V2 == i10) {
            return;
        }
        this.V2 = i10;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.F2 = z10;
        if (z10) {
            setLegacySections(false);
        }
    }

    public void setDisableHighlightState(boolean z10) {
        this.f30613h1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.O1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.S0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.f30648z1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.f30600a1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.f30600a1 = view;
            if (this.W1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f30611g1) {
                View view3 = this.f30600a1;
                if (view3 != null) {
                    this.f30649z2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.f30649z2 = -1;
            K0(false);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.f30605d1 = new zj0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f30605d1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        int i10;
        zj0 zj0Var = this.f30605d1;
        if (zj0Var == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        zj0Var.setVisibility(i10);
        this.f30605d1.f33077a0 = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.f30646y1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.P1 = z10;
    }

    @Override
    public void setItemAnimator(s4.l0 l0Var) {
        super.setItemAnimator(l0Var);
    }

    public void setItemSelectorColorProvider(org.telegram.messenger.l9 l9Var) {
        this.f30641v2 = l9Var;
    }

    public void setItemsEnterAnimator(wj0 wj0Var) {
        this.f30621l2 = wj0Var;
    }

    public void setLegacySections(boolean z10) {
        if (this.S2 == z10) {
            return;
        }
        this.S2 = z10;
        f1();
        a0();
        invalidate();
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i10;
        if (num == null) {
            if (b1()) {
                i10 = org.telegram.ui.ActionBar.t6.f21038j6;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.f21020i6;
            }
            intValue = org.telegram.ui.ActionBar.t6.w0(i10, this.f30625n2);
        } else {
            intValue = num.intValue();
        }
        this.f30639u2 = intValue;
        org.telegram.ui.ActionBar.t6.H1(this.B1, intValue, true);
    }

    public void setOnInterceptTouchListener(fk0 fk0Var) {
        this.Z0 = fk0Var;
    }

    public void setOnItemClickListener(gk0 gk0Var) {
        this.T0 = gk0Var;
    }

    public void setOnItemLongClickListener(ik0 ik0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.V0 = ik0Var;
        m2.t tVar = this.K1;
        boolean z10 = ik0Var != null;
        q10 q10Var = (q10) tVar.f12684b;
        q10Var.f29506t = z10;
        q10Var.f29507u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(s4.s0 s0Var) {
        this.Y0 = s0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.f30617j1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.f30638u1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f30631q2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.R1 = z10;
    }

    public void setSections(boolean z10) {
        s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), z10);
    }

    public void setSectionsDrawBackground(boolean z10) {
        if (this.T2 != z10) {
            this.T2 = z10;
            if (z10) {
                setLegacySections(false);
            }
            l9 l9Var = this.R2;
            if (l9Var != null) {
                tk0 tk0Var = l9Var.f28038a;
                if (l9Var.K != z10) {
                    l9Var.K = z10;
                    tk0Var.a0();
                    tk0Var.invalidate();
                }
                this.f30646y1 = false;
                if (this.f30600a1 != null) {
                    setVisibility(0);
                }
            }
        }
    }

    public void setSectionsDrawingMode(rk0 rk0Var) {
        if (this.U2 != rk0Var) {
            this.U2 = rk0Var;
            l9 l9Var = this.R2;
            if (l9Var != null) {
                tk0 tk0Var = l9Var.f28038a;
                if (l9Var.L != rk0Var) {
                    l9Var.L = rk0Var;
                    tk0Var.a0();
                    tk0Var.invalidate();
                }
            }
        }
    }

    public void setSectionsOverscanTop(int i10) {
        this.Q2 = i10;
    }

    public void setSectionsType(int i10) {
        this.f30642w1 = i10;
        if (i10 != 1 && i10 != 3) {
            return;
        }
        this.f30624n1 = new ArrayList();
        this.f30626o1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i10) {
        this.f30639u2 = i10;
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            yVar.setCallback(null);
        }
        int i11 = this.A1;
        if (i11 == 8) {
            this.B1 = org.telegram.ui.ActionBar.t6.a0(i10, this.Y1, 0);
        } else if (i11 == 9) {
            this.B1 = null;
        } else {
            int i12 = this.Z1;
            if (i12 > 0) {
                this.B1 = org.telegram.ui.ActionBar.t6.a0(i10, i12, i12);
            } else {
                int i13 = this.Y1;
                if (i13 > 0 && i11 != 1) {
                    this.B1 = org.telegram.ui.ActionBar.t6.k0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.B1 = org.telegram.ui.ActionBar.t6.h0(i10, 2, -1);
                } else {
                    this.B1 = org.telegram.ui.ActionBar.t6.h0(i10, i11, i13);
                }
            }
        }
        org.telegram.ui.Cells.y yVar2 = this.B1;
        if (yVar2 != null) {
            yVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i10) {
        this.Y1 = i10;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.f30623m2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.A1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f30644x1 = z10;
    }

    public void setTopBottomSelectorRadius(int i10) {
        this.Z1 = i10;
    }

    public void setTranslateSelector(boolean z10) {
        int i10;
        if (z10) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        this.G1 = i10;
    }

    public void setTranslateSelectorPosition(int i10) {
        if (i10 <= 0) {
            i10 = -1;
        }
        this.G1 = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        zj0 zj0Var = this.f30605d1;
        if (zj0Var != null) {
            zj0Var.setTranslationY(f7);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (Y2 != null) {
            super.setVerticalScrollBarEnabled(z10);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            this.U1 = false;
        }
    }

    public final void t1(org.telegram.messenger.r20 r20Var, org.telegram.messenger.r20 r20Var2, int i10, float f7, boolean z10) {
        px pxVar = new px(this, 16);
        org.telegram.ui.ActionBar.a7.m(this, 20, org.telegram.ui.ActionBar.t6.f21038j6, this.f30625n2);
        this.H2 = r20Var;
        this.I2 = r20Var2;
        this.O2 = i10;
        this.P2 = z10;
        this.L2 = f7;
        this.M2 = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.N2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
        this.J2 = pxVar;
        f1();
    }

    public boolean u1(View view) {
        return true;
    }

    @Override
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (this.X0) {
            jk0 jk0Var = this.W0;
            if (jk0Var != null) {
                jk0Var.p(i11);
            }
            iArr[0] = i10;
            iArr[1] = i11;
            return true;
        }
        return super.v(i10, i11, i12, iArr, iArr2);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.B1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public boolean w1() {
        return this.G;
    }

    public final void x1() {
        zj0 zj0Var = this.f30605d1;
        if (zj0Var != null) {
            zj0Var.updateColors();
        }
    }

    public final void y1() {
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null && yVar.isStateful()) {
            if (this.L1 != null) {
                if (this.B1.setState(getDrawableStateForSelector())) {
                    invalidateDrawable(this.B1);
                }
            } else if (this.T1 == null) {
                this.B1.setState(StateSet.NOTHING);
            }
        }
    }

    public tk0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.S0 = true;
        this.f30615i1 = true;
        this.f30630q1 = -1;
        this.f30632r1 = -1;
        this.f30644x1 = false;
        this.f30646y1 = true;
        this.A1 = 2;
        this.E1 = new Rect();
        this.G1 = -1;
        this.R1 = true;
        this.f30616i2 = Float.MAX_VALUE;
        this.f30618j2 = Float.MAX_VALUE;
        this.f30627o2 = true;
        this.f30629p2 = new td(1);
        this.f30631q2 = true;
        this.f30633r2 = new xj0(this, 0);
        this.C2 = new ew(this, 8);
        this.S2 = true;
        this.U2 = rk0.f29947a;
        this.V2 = org.telegram.ui.ActionBar.t6.f20872a7;
        this.X2 = new Path();
        this.f30625n2 = p6Var;
        zs zsVar = new zs();
        this.D2 = zsVar;
        setEdgeEffectFactory(zsVar);
        org.telegram.ui.ActionBar.a7.m(this, 21, org.telegram.ui.ActionBar.t6.f21206s8, p6Var);
        org.telegram.ui.ActionBar.a7.m(this, 20, org.telegram.ui.ActionBar.t6.f21020i6, p6Var);
        try {
            if (!Z2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                Y2 = iArr;
                if (iArr == null) {
                    Y2 = new int[0];
                }
                Z2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(Y2);
            Method method = f30596a3;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
        super.setOnScrollListener(new ag.u(this, 28));
        this.E.add(new mk0(context, this));
    }

    public void setOnItemClickListener(hk0 hk0Var) {
        this.U0 = hk0Var;
    }

    public void setOnItemLongClickListener(jk0 jk0Var) {
        p1(jk0Var, ViewConfiguration.getLongPressTimeout());
    }
}
