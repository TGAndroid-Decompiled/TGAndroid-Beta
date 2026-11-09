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
public class qj0 extends RecyclerView implements eh.a {
    public static int[] Y2;
    public static boolean Z2;
    public static final Method f37353a3;
    public static final Paint f37354b3;
    public static final Path f37355c3;
    public static final float[] f37356d3;
    public int A1;
    public boolean A2;
    public org.telegram.ui.Cells.y B1;
    public boolean B2;
    public int C1;
    public final et C2;
    public View D1;
    public final os D2;
    public final Rect E1;
    public Matrix E2;
    public boolean F1;
    public boolean F2;
    public int G1;
    public aj0 G2;
    public boolean H1;
    public org.telegram.messenger.d20 H2;
    public boolean I1;
    public org.telegram.messenger.d20 I2;
    public boolean J1;
    public bx J2;
    public rt K1;
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
    public hj0 Q1;
    public int Q2;
    public boolean R1;
    public q9 R2;
    public boolean S0;
    public zi0 S1;
    public boolean S2;
    public cj0 T0;
    public pb0 T1;
    public boolean T2;
    public dj0 U0;
    public boolean U1;
    public oj0 U2;
    public ej0 V0;
    public boolean V1;
    public int V2;
    public fj0 W0;
    public boolean W1;
    public ArrayList W2;
    public boolean X0;
    public int X1;
    public final Path X2;
    public v4.s0 Y0;
    public int Y1;
    public bj0 Z0;
    public int Z1;
    public View f37357a1;
    public int f37358a2;
    public bi.e5 f37359b1;
    public boolean f37360b2;
    public gj0 f37361c1;
    public boolean f37362c2;
    public vi0 f37363d1;
    public int d2;
    public lj0 f37364e1;
    public int f37365e2;
    public boolean f37366f1;
    public m.c3 f37367f2;
    public boolean f37368g1;
    public boolean f37369g2;
    public boolean f37370h1;
    public boolean f37371h2;
    public boolean f37372i1;
    public float f37373i2;
    public Drawable f37374j1;
    public float f37375j2;
    public float f37376k1;
    public int[] f37377k2;
    public float l1;
    public ti0 f37378l2;
    public long f37379m1;
    public q0.a f37380m2;
    public ArrayList n1;
    public final org.telegram.ui.ActionBar.g6 f37381n2;
    public ArrayList f37382o1;
    public boolean f37383o2;
    public View f37384p1;
    public final yd f37385p2;
    public int f37386q1;
    public boolean f37387q2;
    public int f37388r1;
    public final jg.n1 f37389r2;
    public int f37390s1;
    public Paint f37391s2;
    public int f37392t1;
    public boolean f37393t2;
    public int f37394u1;
    public int f37395u2;
    public boolean f37396v1;
    public org.telegram.messenger.k9 f37397v2;
    public int f37398w1;
    public int f37399w2;
    public boolean f37400x1;
    public int f37401x2;
    public boolean f37402y1;
    public boolean f37403y2;
    public boolean f37404z1;
    public int f37405z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        f37353a3 = method;
        f37354b3 = new Paint(1);
        new Paint(1);
        f37355c3 = new Path();
        f37356d3 = new float[8];
    }

    public qj0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        if (view.getTag(2131296419) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static boolean a1(View view) {
        if (view instanceof kj0) {
            zs0 zs0Var = (zs0) ((kj0) view);
            if (zs0Var.f41063b2 && zs0Var.f41077f2 > 0) {
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
        this.D2.f36777b.add(new ls(runnable, 1));
    }

    @Override
    public final View E(float f10, float f11) {
        float f12;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < 2; i7++) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                if ((!(childAt instanceof org.telegram.ui.Cells.q1) && !(childAt instanceof org.telegram.ui.Cells.t0)) || childAt.getVisibility() != 4) {
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

    public final void I0(boolean z9) {
        gj0 gj0Var = this.f37361c1;
        if (gj0Var != null) {
            org.telegram.messenger.g0.r(gj0Var);
            this.f37361c1 = null;
        }
        View view = this.L1;
        if (view != null) {
            if (z9) {
                j1(view, 0.0f, 0.0f, false);
            }
            this.L1 = null;
            m1(view, null);
        }
        this.E1.setEmpty();
        hj0 hj0Var = this.Q1;
        if (hj0Var != null) {
            org.telegram.messenger.g0.r(hj0Var);
            this.Q1 = null;
        }
        this.N1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j3) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i7 = 0; i7 < itemDecorationCount; i7++) {
            v4.m0 X = X(i7);
            if ((X instanceof eh.a) && ((X != this.G2 && X != this.R2) || this.F2)) {
                ((eh.a) X).d(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                this.A2 = true;
                drawChild(canvas, childAt, j3);
                this.A2 = false;
            }
        }
    }

    public final void K0(boolean z9) {
        int i7;
        if (!this.f37368g1) {
            int i10 = 0;
            if (getAdapter() != null && this.f37357a1 != null) {
                boolean R0 = R0();
                if (R0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                if (!this.W1 || !org.telegram.messenger.iz.c()) {
                    z9 = false;
                }
                if (z9) {
                    if (this.f37405z2 != i7) {
                        this.f37405z2 = i7;
                        if (i7 == 0) {
                            this.f37357a1.animate().setListener(null).cancel();
                            if (this.f37357a1.getVisibility() == 8) {
                                this.f37357a1.setVisibility(0);
                                this.f37357a1.setAlpha(0.0f);
                                if (this.X1 == 1) {
                                    this.f37357a1.setScaleX(0.7f);
                                    this.f37357a1.setScaleY(0.7f);
                                }
                            }
                            this.f37357a1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.f37357a1.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.f37357a1.animate().alpha(0.0f);
                            if (this.X1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new f60(this, 14)).start();
                        }
                    }
                } else {
                    this.f37405z2 = i7;
                    this.f37357a1.setVisibility(i7);
                    this.f37357a1.setAlpha(1.0f);
                }
                if (this.f37402y1) {
                    if (!b1() || !this.T2) {
                        if (R0) {
                            i10 = 4;
                        }
                        if (getVisibility() != i10) {
                            setVisibility(i10);
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

    public final void L0(boolean z9) {
        vi0 vi0Var;
        int paddingTop;
        v4.d1 T;
        vi0 vi0Var2;
        View view;
        boolean z10;
        int i7;
        v4.d1 T2;
        int b10;
        int S;
        boolean z11;
        int i10;
        int i11;
        if (((this.I1 || z9) && this.f37363d1 != null) || (this.f37398w1 != 0 && this.f37364e1 != null)) {
            v4.n0 layoutManager = getLayoutManager();
            if (layoutManager instanceof v4.b0) {
                v4.b0 b0Var = (v4.b0) layoutManager;
                if (b0Var.f57025o == 1) {
                    if (this.f37364e1 != null) {
                        if (this.f37398w1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i12 = this.f37398w1;
                        float f10 = 32.0f;
                        int i13 = Integer.MAX_VALUE;
                        if (i12 != 1 && i12 != 3) {
                            if (i12 == 2) {
                                this.l1 = 0.0f;
                                if (this.f37364e1.b() != 0) {
                                    int childCount = getChildCount();
                                    int i14 = 0;
                                    int i15 = Integer.MAX_VALUE;
                                    View view2 = null;
                                    View view3 = null;
                                    for (int i16 = 0; i16 < childCount; i16++) {
                                        View childAt = getChildAt(i16);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f37394u1 + paddingTop) {
                                            if (bottom < i13) {
                                                view3 = childAt;
                                                i13 = bottom;
                                            }
                                            i14 = Math.max(i14, bottom);
                                            if (bottom >= org.telegram.messenger.g0.L(32.0f) + this.f37394u1 + paddingTop && bottom < i15) {
                                                view2 = childAt;
                                                i15 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T2 = T(view3)) != null && (S = this.f37364e1.S((b10 = T2.b()))) >= 0) {
                                        if (this.f37386q1 != S || this.f37384p1 == null) {
                                            View view4 = this.f37384p1;
                                            if (view4 == null) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            View T3 = this.f37364e1.T(S, view4);
                                            if (z11) {
                                                S0(T3, false);
                                            }
                                            this.f37384p1 = T3;
                                            T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f37384p1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f37384p1.getMeasuredHeight());
                                            this.f37386q1 = S;
                                        }
                                        if (this.f37384p1 != null && view2 != null && view2.getClass() != this.f37384p1.getClass()) {
                                            this.l1 = 1.0f;
                                        }
                                        int M = this.f37364e1.M(S);
                                        int Q = this.f37364e1.Q(b10);
                                        if (i14 != 0 && i14 < getMeasuredHeight() - getPaddingBottom()) {
                                            i10 = -paddingTop;
                                        } else {
                                            i10 = this.f37394u1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f37384p1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f37394u1);
                                            if (height2 < height) {
                                                i11 = height2 - height;
                                            } else {
                                                i11 = paddingTop;
                                            }
                                            if (i11 < 0) {
                                                this.f37384p1.setTag(Integer.valueOf(paddingTop + i10 + i11));
                                            } else {
                                                this.f37384p1.setTag(Integer.valueOf(paddingTop + i10));
                                            }
                                        } else {
                                            this.f37384p1.setTag(Integer.valueOf(paddingTop + i10));
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
                            if (bottom2 > this.f37394u1 + paddingTop) {
                                if (bottom2 < i13) {
                                    i13 = bottom2;
                                    view6 = childAt2;
                                }
                                i18 = Math.max(i18, bottom2);
                                if (bottom2 >= org.telegram.messenger.g0.L(f11) + this.f37394u1 + paddingTop && bottom2 < i19) {
                                    i19 = bottom2;
                                }
                            }
                            i17++;
                            f10 = f11;
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(b0Var.N0() - b11) + 1;
                            if ((this.I1 || z9) && (vi0Var2 = this.f37363d1) != null && !vi0Var2.f39096n && (getAdapter() instanceof wi0)) {
                                this.f37363d1.setProgress(Math.min(1.0f, b11 / ((this.f37364e1.b() - abs) + 1)));
                            }
                            this.f37382o1.addAll(this.n1);
                            this.n1.clear();
                            if (this.f37364e1.b() != 0) {
                                if (this.f37386q1 != b11 || this.f37388r1 != abs) {
                                    this.f37386q1 = b11;
                                    this.f37388r1 = abs;
                                    this.f37392t1 = 1;
                                    int S2 = this.f37364e1.S(b11);
                                    this.f37390s1 = S2;
                                    int M2 = (this.f37364e1.M(S2) + b11) - this.f37364e1.Q(b11);
                                    while (M2 < b11 + abs) {
                                        M2 += this.f37364e1.M(this.f37390s1 + this.f37392t1);
                                        this.f37392t1++;
                                    }
                                }
                                if (this.f37398w1 != 3) {
                                    int i20 = b11;
                                    for (int i21 = this.f37390s1; i21 < this.f37390s1 + this.f37392t1; i21++) {
                                        if (!this.f37382o1.isEmpty()) {
                                            view = (View) this.f37382o1.get(0);
                                            this.f37382o1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        View T4 = this.f37364e1.T(i21, view);
                                        if (z10) {
                                            S0(T4, false);
                                        }
                                        this.n1.add(T4);
                                        int M3 = this.f37364e1.M(i21);
                                        if (i21 == this.f37390s1) {
                                            int Q2 = this.f37364e1.Q(i20);
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
                                            i20 = (M3 - this.f37364e1.Q(b11)) + i20;
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
                    int L0 = b0Var.L0();
                    Math.abs(b0Var.N0() - L0);
                    if (L0 != -1) {
                        if ((this.I1 || z9) && (vi0Var = this.f37363d1) != null && !vi0Var.f39096n) {
                            v4.g0 adapter = getAdapter();
                            if (adapter instanceof wi0) {
                                wi0 wi0Var = (wi0) adapter;
                                float H = wi0Var.H(this);
                                this.f37363d1.setIsVisible(wi0Var.E(this));
                                this.f37363d1.setProgress(Math.min(1.0f, H));
                                this.f37363d1.b(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void M0(float f10, float f11) {
        boolean z9;
        org.telegram.messenger.dj djVar;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.f37377k2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f11, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f10, 0.0f));
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            m.c3 c3Var = this.f37367f2;
            int[] iArr2 = this.f37377k2;
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) c3Var.d;
            iArr2[0] = (int) cnVar.N9;
            iArr2[1] = cnVar.Wa;
            View childAt = getChildAt(i7);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i10 = this.f37365e2;
                if (i10 != S) {
                    int i11 = this.d2;
                    if (i10 <= i11 && S <= i11) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    org.telegram.ui.cn cnVar2 = (org.telegram.ui.cn) this.f37367f2.d;
                    org.telegram.ui.ll llVar = cnVar2.C0;
                    ArrayList arrayList = cnVar2.K6;
                    int i12 = S - llVar.J;
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i12);
                        if (ijVar.U == 0 && ijVar.z2() && (djVar = (org.telegram.messenger.dj) cnVar2.N6.f(ijVar.c1())) != null) {
                            ArrayList arrayList2 = djVar.d;
                            if (z9) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf((org.telegram.messenger.ij) arrayList2.get(size)) + cnVar2.C0.J;
                        }
                    }
                    if (z9) {
                        int i13 = this.f37365e2;
                        if (S > i13) {
                            if (!this.f37367f2.f19075a) {
                                for (int i14 = i13 + 1; i14 <= S; i14++) {
                                    if (i14 != this.d2 && this.f37367f2.a(i14)) {
                                        this.f37367f2.c(i14, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i13 > S) {
                                if (i13 != this.d2 && this.f37367f2.a(i13)) {
                                    this.f37367f2.c(i13, false, min2, min);
                                }
                                i13--;
                            }
                        }
                    } else {
                        int i15 = this.f37365e2;
                        if (S > i15) {
                            while (i15 < S) {
                                if (i15 != this.d2 && this.f37367f2.a(i15)) {
                                    this.f37367f2.c(i15, false, min2, min);
                                }
                                i15++;
                            }
                        } else if (!this.f37367f2.f19075a) {
                            for (int i16 = i15 - 1; i16 >= S; i16--) {
                                if (i16 != this.d2 && this.f37367f2.a(i16)) {
                                    this.f37367f2.c(i16, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f37367f2.f19075a) {
                    this.f37365e2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void N0(Canvas canvas, View view) {
        boolean z9;
        boolean z10;
        if (this.R2 == null && view != null && u1(view) && ((Boolean) this.G2.f31868a.a(view)).booleanValue() && i1(view)) {
            int R = RecyclerView.R(view);
            boolean z11 = false;
            if (R == -1) {
                z10 = false;
                z9 = false;
            } else {
                View T0 = T0(R - 1);
                View T02 = T0(R + 1);
                if (T0 != null && i1(T0)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (T02 != null && i1(T02)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(view.getX(), Math.max((-this.L2) - this.Q2, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight() + this.L2, G0(view)));
            if (z9 && z10) {
                if (v1(view) >= rectF.top) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (G0(view) <= rectF.bottom) {
                    z11 = true;
                }
                if (!z9 || !z11) {
                    z10 = z11;
                } else {
                    return;
                }
            }
            Path path = this.X2;
            if (!z9 && !z10) {
                path.rewind();
                float f10 = this.L2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z9) {
                path.rewind();
                path.addRoundRect(rectF, this.M2, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z10) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void O0(Canvas canvas, View view, View view2, boolean z9, boolean z10) {
        float f10;
        float f11;
        if (view != null && view2 != null) {
            float f12 = 0.0f;
            if (view2 instanceof g70) {
                f10 = ((g70) view2).getBottomInfoMargin();
            } else {
                f10 = 0.0f;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            float left = view.getLeft();
            float f13 = (-this.L2) - this.Q2;
            float v12 = v1(view);
            if (z9) {
                f11 = this.L2;
            } else {
                f11 = 0.0f;
            }
            float max = Math.max(f13, v12 - f11);
            float right = view.getRight();
            float height = getHeight() + this.L2;
            float G0 = G0(view2);
            if (z10) {
                f12 = this.L2;
            }
            rectF.set(left, max, right, Math.min(height, (G0 + f12) - f10));
            if (rectF.bottom >= rectF.top) {
                float f14 = this.L2;
                this.J2.i(canvas, rectF, Float.valueOf(f14), Float.valueOf(f14), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void P0(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qj0.P0(android.graphics.Canvas):void");
    }

    public final void Q0(Canvas canvas) {
        org.telegram.ui.Cells.y yVar;
        q0.a aVar;
        View view;
        Rect rect = this.E1;
        if (!rect.isEmpty() && (yVar = this.B1) != null) {
            int i7 = this.G1;
            if ((i7 == -2 || i7 == this.C1) && this.D1 != null) {
                if (getAdapter() instanceof pj0) {
                    ((pj0) getAdapter()).getClass();
                }
                this.B1.setBounds(this.D1.getLeft(), this.D1.getTop(), this.D1.getRight(), this.D1.getBottom());
            } else {
                yVar.setBounds(rect);
            }
            canvas.save();
            int i10 = this.G1;
            if ((i10 == -2 || i10 == this.C1) && (aVar = this.f37380m2) != null) {
                aVar.accept(canvas);
            }
            int i11 = this.G1;
            if ((i11 == -2 || i11 == this.C1) && (view = this.D1) != null) {
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

    public final void S0(View view, boolean z9) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z9) {
                return;
            }
            int i7 = this.f37398w1;
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

    public final Drawable U0(View view, boolean z9) {
        boolean z10;
        boolean z11;
        if (view.getParent() == this && b1() && i1(view)) {
            int R = RecyclerView.R(view);
            boolean z12 = true;
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
            RectF rectF = new RectF();
            rectF.set(view.getX(), Math.max(0.0f, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
            if (z10 && z11 && !z9) {
                if (v1(view) >= rectF.top) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (G0(view) > rectF.bottom) {
                    z12 = false;
                }
                if (z10 && z12) {
                    return org.telegram.ui.ActionBar.l6.d0(0, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.f37381n2));
                }
                z11 = z12;
            }
            Path path = new Path();
            if ((!z10 && !z11) || z9) {
                path.rewind();
                float f10 = this.L2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            } else if (!z10) {
                path.rewind();
                path.addRoundRect(rectF, this.M2, Path.Direction.CW);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
            }
            return new ui0(this, view, path, rectF);
        }
        return null;
    }

    public Integer V0(int i7) {
        org.telegram.messenger.k9 k9Var = this.f37397v2;
        if (k9Var != null) {
            return (Integer) k9Var.j(Integer.valueOf(i7));
        }
        return null;
    }

    public final Paint W0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.g6 g6Var = this.f37381n2;
        if (g6Var != null) {
            paint = g6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.l6.V0(str);
    }

    public final boolean X0(int i7, View view) {
        int R;
        if (view != null && i7 <= 0 && getAdapter() != null && this.I2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.I2.a(Integer.valueOf(getAdapter().d(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Y0() {
        ns[] nsVarArr;
        for (ns nsVar : this.D2.f36776a) {
            if (nsVar != null && nsVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z0(int i7, View view) {
        int R;
        if (view != null && i7 >= getChildCount() - 1 && getAdapter() != null && this.I2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().b() - 1) {
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

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            aVar.f8698a = true;
        } else if (Y0() && getOverScrollMode() != 2) {
            aVar.f8698a = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i7 = 0; i7 < itemDecorationCount; i7++) {
                v4.m0 X = X(i7);
                if ((X instanceof eh.a) && ((X != this.G2 && X != this.R2) || this.F2)) {
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
        if (!this.f37368g1) {
            this.f37368g1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.f37357a1;
            if (view != null && view.getVisibility() != 8) {
                this.f37357a1.setVisibility(8);
            }
        }
    }

    @Override
    public final boolean canScrollVertically(int i7) {
        if (this.R1 && super.canScrollVertically(i7)) {
            return true;
        }
        return false;
    }

    @Override
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
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
        J0(canvas, rectF, uptimeMillis);
    }

    public final void d1(boolean z9) {
        View view = this.L1;
        if (view != null) {
            j1(view, 0.0f, 0.0f, false);
            this.L1 = null;
            if (z9) {
                m1(view, null);
            }
        }
        if (!z9) {
            this.B1.setState(StateSet.NOTHING);
            this.E1.setEmpty();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f10;
        ti0 ti0Var = this.f37378l2;
        if (ti0Var != null) {
            qj0 qj0Var = ti0Var.f38430a;
            if (ti0Var.d || ti0Var.f38433e) {
                for (int i7 = 0; i7 < qj0Var.getChildCount(); i7++) {
                    View childAt = qj0Var.getChildAt(i7);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !ti0Var.f38432c.contains(childAt)) {
                        Float f11 = (Float) ti0Var.f38431b.get(R, null);
                        if (f11 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f11.floatValue());
                        }
                    }
                }
                ti0Var.d = false;
            }
        }
        if (this.S0 && this.f37404z1) {
            Q0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.S0 && !this.f37404z1) {
            Q0(canvas);
        }
        bi.e5 e5Var = this.f37359b1;
        if (e5Var != null) {
            e5Var.draw(canvas);
        }
        if (!this.f37400x1) {
            int i10 = this.f37398w1;
            float f12 = 0.0f;
            if (i10 == 1) {
                if (this.f37364e1 != null && !this.n1.isEmpty()) {
                    for (int i11 = 0; i11 < this.n1.size(); i11++) {
                        View view2 = (View) this.n1.get(i11);
                        int save = canvas.save();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        if (org.telegram.messenger.id.f23157a0) {
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
            } else if (i10 == 2 && this.f37364e1 != null && (view = this.f37384p1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f37384p1.getTag()).intValue();
                if (org.telegram.messenger.id.f23157a0) {
                    f12 = getWidth() - this.f37384p1.getWidth();
                }
                canvas.translate(f12, intValue2);
                Drawable drawable = this.f37374j1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f37384p1.getMeasuredHeight(), getWidth(), this.f37374j1.getIntrinsicHeight() + this.f37384p1.getMeasuredHeight());
                    this.f37374j1.setAlpha((int) (this.f37376k1 * 255.0f));
                    this.f37374j1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.f37379m1);
                    this.f37379m1 = elapsedRealtime;
                    float f13 = this.f37376k1;
                    float f14 = this.l1;
                    if (f13 < f14) {
                        float f15 = (((float) min) / 180.0f) + f13;
                        this.f37376k1 = f15;
                        if (f15 > f14) {
                            this.f37376k1 = f14;
                        }
                        invalidate();
                    } else if (f13 > f14) {
                        float f16 = f13 - (((float) min) / 180.0f);
                        this.f37376k1 = f16;
                        if (f16 < f14) {
                            this.f37376k1 = f14;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f37384p1.getMeasuredHeight());
                this.f37384p1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f37401x2 == 0 && this.f37403y2) {
                setOverScrollMode(0);
            }
            this.f37401x2++;
        } else if (action == 1 || action == 3) {
            int i7 = this.f37401x2 - 1;
            this.f37401x2 = i7;
            if (i7 == 0 && this.f37403y2) {
                setOverScrollMode(2);
            }
        }
        vi0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.f39080a0 && fastScroll.f39095l0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f37364e1 != null && (view = this.f37384p1) != null && view.getAlpha() != 0.0f && this.f37384p1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.G2 != null && !this.A2) {
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

    public final void e1(zi0 zi0Var, int i7, boolean z9) {
        pb0 pb0Var = this.T1;
        if (pb0Var != null) {
            org.telegram.messenger.g0.r(pb0Var);
            this.T1 = null;
        }
        v4.d1 K = K(zi0Var.run());
        if (K != null) {
            View view = K.f57056a;
            int c10 = K.c();
            this.f37399w2 = c10;
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
            if (i7 > 0) {
                this.S1 = null;
                pb0 pb0Var2 = new pb0(this, 14);
                this.T1 = pb0Var2;
                org.telegram.messenger.g0.i3(pb0Var2, i7);
            }
        } else if (z9) {
            this.S1 = zi0Var;
        }
    }

    public final void f1() {
        org.telegram.messenger.d20 d20Var;
        bx bxVar;
        v4.m0 m0Var = this.G2;
        if (m0Var != null) {
            q0(m0Var);
            this.G2 = null;
        }
        v4.m0 m0Var2 = this.R2;
        if (m0Var2 != null) {
            q0(m0Var2);
            this.R2 = null;
        }
        org.telegram.messenger.d20 d20Var2 = this.H2;
        if (d20Var2 != null && (d20Var = this.I2) != null && (bxVar = this.J2) != null) {
            if (!this.S2) {
                q9 q9Var = new q9(this, d20Var2, d20Var, this.O2, this.L2, bxVar, this.P2, this.T2, this.U2);
                this.R2 = q9Var;
                i(q9Var);
                return;
            }
            aj0 aj0Var = new aj0(this, d20Var2, this.O2, this.P2);
            this.G2 = aj0Var;
            i(aj0Var);
        }
    }

    @Override
    public final void g0(View view) {
        if (getAdapter() instanceof pj0) {
            v4.d1 G = G(view);
            if (G != null) {
                view.setEnabled(((pj0) getAdapter()).D(G));
                if (this.f37383o2) {
                    view.setAccessibilityDelegate(this.f37385p2);
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
        return this.f37357a1;
    }

    public vi0 getFastScroll() {
        return this.f37363d1;
    }

    public ArrayList<View> getHeaders() {
        return this.n1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f37382o1;
    }

    public cj0 getOnItemClickListener() {
        return this.T0;
    }

    public v4.s0 getOnScrollListener() {
        return this.Y0;
    }

    public View getPinnedHeader() {
        return this.f37384p1;
    }

    public View getPressedChildView() {
        return this.L1;
    }

    public int getSectionColorForDecoration() {
        return org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.f37381n2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return i0.a.o(org.telegram.ui.ActionBar.l6.w0(this.V2, this.f37381n2), 255);
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
        return this.f37395u2;
    }

    public Rect getSelectorRect() {
        return this.E1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public final boolean h1(int i7) {
        if (this.K2 != null && i7 >= 0) {
            for (int i10 = 0; i10 < this.K2.size(); i10++) {
                long longValue = ((Long) this.K2.get(i10)).longValue();
                Typeface typeface = org.telegram.messenger.g0.f22535a;
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
        q9 q9Var = this.R2;
        if (q9Var != null) {
            return q9Var.u(view);
        }
        aj0 aj0Var = this.G2;
        if (aj0Var != null && ((Boolean) aj0Var.f31868a.a(view)).booleanValue()) {
            return true;
        }
        return false;
    }

    public void j1(View view, float f10, float f11, boolean z9) {
        if (!this.f37370h1 && view != null) {
            view.setPressed(z9);
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

    public final void k1(int i7, View view) {
        boolean z9;
        int i10;
        int i11;
        pb0 pb0Var = this.T1;
        if (pb0Var != null) {
            org.telegram.messenger.g0.r(pb0Var);
            this.T1 = null;
            this.S1 = null;
        }
        if (this.B1 != null) {
            if (i7 != this.C1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (getAdapter() instanceof pj0) {
                ((pj0) getAdapter()).getClass();
            }
            if (i7 != -1) {
                this.C1 = i7;
            }
            this.D1 = view;
            if (this.A1 == 8) {
                org.telegram.ui.ActionBar.l6.G1(this.B1, this.Y1, 0);
            } else if (this.Z1 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.y yVar = this.B1;
                if (i7 == 0) {
                    i10 = this.Z1;
                } else {
                    i10 = 0;
                }
                if (i7 == getAdapter().b() - 2) {
                    i11 = this.Z1;
                } else {
                    i11 = 0;
                }
                org.telegram.ui.ActionBar.l6.G1(yVar, i10, i11);
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
            if (z9) {
                this.B1.setVisible(false, false);
                this.B1.setState(StateSet.NOTHING);
            }
            setListSelectorColor(V0(i7));
            this.B1.setBounds(rect);
            if (z9 && getVisibility() == 0) {
                this.B1.setVisible(true, false);
            }
        }
    }

    public final void l1() {
        int i7;
        pb0 pb0Var = this.T1;
        if (pb0Var != null) {
            org.telegram.messenger.g0.r(pb0Var);
            this.T1.run();
            this.T1 = null;
            this.D1 = null;
            return;
        }
        this.T1 = null;
        this.S1 = null;
        View view = this.D1;
        if (view != null && (i7 = this.f37399w2) != -1) {
            k1(i7, view);
            org.telegram.ui.Cells.y yVar = this.B1;
            if (yVar != null) {
                yVar.setState(new int[0]);
                invalidateDrawable(this.B1);
            }
            this.D1 = null;
            this.f37399w2 = -1;
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

    public final void n1(qj0 qj0Var, boolean z9) {
        ViewParent parent;
        if (qj0Var != null && (parent = qj0Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z9);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z9);
        }
    }

    public final void o1(int i7, boolean z9) {
        this.W1 = z9;
        this.X1 = i7;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vi0 vi0Var = this.f37363d1;
        if (vi0Var != null && vi0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f37363d1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f37363d1);
            }
            ((ViewGroup) getParent()).addView(this.f37363d1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        ti0 ti0Var = this.f37378l2;
        if (ti0Var != null) {
            ti0Var.a();
        }
        if (this.f37393t2) {
            this.f37393t2 = false;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25026k1, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.O1) {
                n1(this, true);
            }
            if (this.Z0 != null) {
                int i7 = org.telegram.ui.cn.f44367kd;
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        vi0 vi0Var = this.f37363d1;
        if (vi0Var != null) {
            this.H1 = true;
            if (vi0Var.f39079a) {
                i13 = getPaddingTop();
            } else {
                i13 = vi0Var.f39091h0;
            }
            int i14 = i10 + i13;
            vi0 vi0Var2 = this.f37363d1;
            if (vi0Var2.f39090g0) {
                vi0Var2.layout(0, i14, vi0Var2.getMeasuredWidth(), this.f37363d1.getMeasuredHeight() + i14);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f37363d1.getMeasuredWidth();
                vi0 vi0Var3 = this.f37363d1;
                vi0Var3.layout(measuredWidth, i14, vi0Var3.getMeasuredWidth() + measuredWidth, this.f37363d1.getMeasuredHeight() + i14);
            }
            this.H1 = false;
        }
        L0(false);
        zi0 zi0Var = this.S1;
        if (zi0Var != null) {
            e1(zi0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        super.onMeasure(i7, i10);
        vi0 vi0Var = this.f37363d1;
        if (vi0Var != null && vi0Var.getLayoutParams() != null) {
            vi0 vi0Var2 = this.f37363d1;
            if (vi0Var2.f39079a) {
                i11 = getPaddingTop();
            } else {
                i11 = vi0Var2.f39091h0;
            }
            int measuredHeight = (getMeasuredHeight() - i11) - getPaddingBottom();
            this.f37363d1.getLayoutParams().height = measuredHeight;
            this.f37363d1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.f37358a2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        View view;
        super.onSizeChanged(i7, i10, i11, i12);
        bi.e5 e5Var = this.f37359b1;
        if (e5Var != null) {
            e5Var.requestLayout();
        }
        int i13 = this.f37398w1;
        if (i13 == 1) {
            if (this.f37364e1 != null && !this.n1.isEmpty()) {
                for (int i14 = 0; i14 < this.n1.size(); i14++) {
                    S0((View) this.n1.get(i14), true);
                }
            }
        } else if (i13 == 2 && this.f37364e1 != null && (view = this.f37384p1) != null) {
            S0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        vi0 vi0Var = this.f37363d1;
        if (vi0Var != null && vi0Var.f39096n) {
            return false;
        }
        boolean z9 = this.f37360b2;
        et etVar = this.C2;
        if (z9 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f37373i2 == Float.MAX_VALUE && this.f37375j2 == Float.MAX_VALUE) {
                this.f37373i2 = motionEvent.getX();
                this.f37375j2 = motionEvent.getY();
            }
            if (!this.f37362c2 && Math.abs(motionEvent.getY() - this.f37375j2) > this.f37358a2) {
                this.f37362c2 = true;
                n1(this, true);
            }
            if (this.f37362c2) {
                M0(motionEvent.getX(), motionEvent.getY());
                m.c3 c3Var = this.f37367f2;
                int[] iArr = this.f37377k2;
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) c3Var.d;
                iArr[0] = (int) cnVar.N9;
                iArr[1] = cnVar.Wa;
                if (motionEvent.getY() > (getMeasuredHeight() - org.telegram.messenger.g0.L(56.0f)) - this.f37377k2[1] && (this.f37365e2 >= this.d2 || !this.f37367f2.f19075a)) {
                    this.f37371h2 = false;
                    if (!this.f37369g2) {
                        this.f37369g2 = true;
                        org.telegram.messenger.g0.r(etVar);
                        org.telegram.messenger.g0.h3(etVar);
                        return true;
                    }
                } else if (motionEvent.getY() < org.telegram.messenger.g0.L(56.0f) + this.f37377k2[0] && (this.f37365e2 <= this.d2 || !this.f37367f2.f19075a)) {
                    this.f37371h2 = true;
                    if (!this.f37369g2) {
                        this.f37369g2 = true;
                        org.telegram.messenger.g0.r(etVar);
                        org.telegram.messenger.g0.h3(etVar);
                        return true;
                    }
                } else {
                    this.f37369g2 = false;
                    org.telegram.messenger.g0.r(etVar);
                }
            }
            return true;
        }
        this.f37373i2 = Float.MAX_VALUE;
        this.f37375j2 = Float.MAX_VALUE;
        this.f37360b2 = false;
        this.f37362c2 = false;
        n1(this, false);
        this.f37369g2 = false;
        org.telegram.messenger.g0.r(etVar);
        return super.onTouchEvent(motionEvent);
    }

    public final void p1(fj0 fj0Var, long j3) {
        boolean z9;
        this.W0 = fj0Var;
        rt rtVar = this.K1;
        if (fj0Var != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        b10 b10Var = (b10) rtVar.f37805b;
        b10Var.f32061t = z9;
        b10Var.f32062u = j3;
    }

    public final void q1(int i7, int i10, int i11, int i12) {
        if (getPaddingLeft() == i7 && getPaddingTop() == i10 && getPaddingRight() == i11 && getPaddingBottom() == i12) {
            return;
        }
        this.B2 = true;
        setPadding(i7, i10, i11, i12);
        this.B2 = false;
    }

    public final void r1() {
        s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
    }

    @Override
    public void requestLayout() {
        if (!this.V1 && !this.B2) {
            super.requestLayout();
        }
    }

    public void s1(int i7, float f10, boolean z9) {
        ai.c0 c0Var = new ai.c0(7);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new fi.u4(this, c0Var, sparseIntArray, 3), new fi(sparseIntArray, 2));
        t1((org.telegram.messenger.d20) pair.first, (org.telegram.messenger.d20) pair.second, i7, f10, z9);
    }

    public void setAccessibilityEnabled(boolean z9) {
        this.f37383o2 = z9;
    }

    @Override
    public void setAdapter(v4.g0 g0Var) {
        v4.g0 adapter = getAdapter();
        jg.n1 n1Var = this.f37389r2;
        if (adapter != null) {
            adapter.f57089a.unregisterObserver(n1Var);
        }
        ArrayList arrayList = this.n1;
        if (arrayList != null) {
            arrayList.clear();
            this.f37382o1.clear();
        }
        this.f37386q1 = -1;
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        this.f37384p1 = null;
        if (g0Var instanceof lj0) {
            this.f37364e1 = (lj0) g0Var;
        } else {
            this.f37364e1 = null;
        }
        super.setAdapter(g0Var);
        if (g0Var != null) {
            g0Var.B(n1Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z9) {
        this.f37372i1 = z9;
    }

    public void setAllowStopHeaveOperations(boolean z9) {
        this.f37396v1 = z9;
    }

    public void setBitmapSectionsBackgroundColorKey(int i7) {
        if (this.V2 == i7) {
            return;
        }
        this.V2 = i7;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z9) {
        this.F2 = z9;
        if (z9) {
            setLegacySections(false);
        }
    }

    public void setDisableHighlightState(boolean z9) {
        this.f37370h1 = z9;
    }

    public void setDisallowInterceptTouchEvents(boolean z9) {
        this.O1 = z9;
    }

    public void setDrawSelection(boolean z9) {
        this.S0 = z9;
    }

    public void setDrawSelectorBehind(boolean z9) {
        this.f37404z1 = z9;
    }

    public void setEmptyView(View view) {
        View view2 = this.f37357a1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.f37357a1 = view;
            if (this.W1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f37368g1) {
                View view3 = this.f37357a1;
                if (view3 != null) {
                    this.f37405z2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.f37405z2 = -1;
            K0(false);
        }
    }

    public void setFastScrollEnabled(int i7) {
        this.f37363d1 = new vi0(this, getContext(), i7);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f37363d1);
        }
    }

    public void setFastScrollVisible(boolean z9) {
        int i7;
        vi0 vi0Var = this.f37363d1;
        if (vi0Var == null) {
            return;
        }
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        vi0Var.setVisibility(i7);
        this.f37363d1.f39080a0 = z9;
    }

    public void setHideIfEmpty(boolean z9) {
        this.f37402y1 = z9;
    }

    public void setInstantClick(boolean z9) {
        this.P1 = z9;
    }

    @Override
    public void setItemAnimator(v4.l0 l0Var) {
        super.setItemAnimator(l0Var);
    }

    public void setItemSelectorColorProvider(org.telegram.messenger.k9 k9Var) {
        this.f37397v2 = k9Var;
    }

    public void setItemsEnterAnimator(ti0 ti0Var) {
        this.f37378l2 = ti0Var;
    }

    public void setLegacySections(boolean z9) {
        if (this.S2 == z9) {
            return;
        }
        this.S2 = z9;
        f1();
        a0();
        invalidate();
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i7;
        if (num == null) {
            if (b1()) {
                i7 = org.telegram.ui.ActionBar.l6.f27974j6;
            } else {
                i7 = org.telegram.ui.ActionBar.l6.f27957i6;
            }
            intValue = org.telegram.ui.ActionBar.l6.w0(i7, this.f37381n2);
        } else {
            intValue = num.intValue();
        }
        this.f37395u2 = intValue;
        org.telegram.ui.ActionBar.l6.H1(this.B1, intValue, true);
    }

    public void setOnInterceptTouchListener(bj0 bj0Var) {
        this.Z0 = bj0Var;
    }

    public void setOnItemClickListener(cj0 cj0Var) {
        this.T0 = cj0Var;
    }

    public void setOnItemLongClickListener(ej0 ej0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.V0 = ej0Var;
        rt rtVar = this.K1;
        boolean z9 = ej0Var != null;
        b10 b10Var = (b10) rtVar.f37805b;
        b10Var.f32061t = z9;
        b10Var.f32062u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(v4.s0 s0Var) {
        this.Y0 = s0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.f37374j1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i7) {
        this.f37394u1 = i7;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z9) {
        this.f37387q2 = z9;
    }

    public void setScrollEnabled(boolean z9) {
        this.R1 = z9;
    }

    public void setSections(boolean z9) {
        s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), z9);
    }

    public void setSectionsDrawBackground(boolean z9) {
        if (this.T2 != z9) {
            this.T2 = z9;
            if (z9) {
                setLegacySections(false);
            }
            q9 q9Var = this.R2;
            if (q9Var != null) {
                qj0 qj0Var = q9Var.f37262a;
                if (q9Var.K != z9) {
                    q9Var.K = z9;
                    qj0Var.a0();
                    qj0Var.invalidate();
                }
                this.f37402y1 = false;
                if (this.f37357a1 != null) {
                    setVisibility(0);
                }
            }
        }
    }

    public void setSectionsDrawingMode(oj0 oj0Var) {
        if (this.U2 != oj0Var) {
            this.U2 = oj0Var;
            q9 q9Var = this.R2;
            if (q9Var != null) {
                qj0 qj0Var = q9Var.f37262a;
                if (q9Var.L != oj0Var) {
                    q9Var.L = oj0Var;
                    qj0Var.a0();
                    qj0Var.invalidate();
                }
            }
        }
    }

    public void setSectionsOverscanTop(int i7) {
        this.Q2 = i7;
    }

    public void setSectionsType(int i7) {
        this.f37398w1 = i7;
        if (i7 != 1 && i7 != 3) {
            return;
        }
        this.n1 = new ArrayList();
        this.f37382o1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i7) {
        this.f37395u2 = i7;
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            yVar.setCallback(null);
        }
        int i10 = this.A1;
        if (i10 == 8) {
            this.B1 = org.telegram.ui.ActionBar.l6.a0(i7, this.Y1, 0);
        } else if (i10 == 9) {
            this.B1 = null;
        } else {
            int i11 = this.Z1;
            if (i11 > 0) {
                this.B1 = org.telegram.ui.ActionBar.l6.a0(i7, i11, i11);
            } else {
                int i12 = this.Y1;
                if (i12 > 0 && i10 != 1) {
                    this.B1 = org.telegram.ui.ActionBar.l6.k0(i12, i12, i12, i12, 0, i7, -16777216);
                } else if (i10 == 2) {
                    this.B1 = org.telegram.ui.ActionBar.l6.h0(i7, 2, -1);
                } else {
                    this.B1 = org.telegram.ui.ActionBar.l6.h0(i7, i10, i12);
                }
            }
        }
        org.telegram.ui.Cells.y yVar2 = this.B1;
        if (yVar2 != null) {
            yVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i7) {
        this.Y1 = i7;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.f37380m2 = aVar;
    }

    public void setSelectorType(int i7) {
        this.A1 = i7;
    }

    public void setSkipDrawSection(boolean z9) {
        this.f37400x1 = z9;
    }

    public void setTopBottomSelectorRadius(int i7) {
        this.Z1 = i7;
    }

    public void setTranslateSelector(boolean z9) {
        int i7;
        if (z9) {
            i7 = -2;
        } else {
            i7 = -1;
        }
        this.G1 = i7;
    }

    public void setTranslateSelectorPosition(int i7) {
        if (i7 <= 0) {
            i7 = -1;
        }
        this.G1 = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        vi0 vi0Var = this.f37363d1;
        if (vi0Var != null) {
            vi0Var.setTranslationY(f10);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z9) {
        if (Y2 != null) {
            super.setVerticalScrollBarEnabled(z9);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 != 0) {
            this.U1 = false;
        }
    }

    public final void t1(org.telegram.messenger.d20 d20Var, org.telegram.messenger.d20 d20Var2, int i7, float f10, boolean z9) {
        bx bxVar = new bx(this, 16);
        org.telegram.ui.ActionBar.s6.l(this, 20, org.telegram.ui.ActionBar.l6.f27974j6, this.f37381n2);
        this.H2 = d20Var;
        this.I2 = d20Var2;
        this.O2 = i7;
        this.P2 = z9;
        this.L2 = f10;
        this.M2 = new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f};
        this.N2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10};
        this.J2 = bxVar;
        f1();
    }

    public boolean u1(View view) {
        return true;
    }

    @Override
    public final boolean v(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        if (this.X0) {
            fj0 fj0Var = this.W0;
            if (fj0Var != null) {
                fj0Var.q(i10);
            }
            iArr[0] = i7;
            iArr[1] = i10;
            return true;
        }
        return super.v(i7, i10, i11, iArr, iArr2);
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
        vi0 vi0Var = this.f37363d1;
        if (vi0Var != null) {
            vi0Var.updateColors();
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

    public qj0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.S0 = true;
        this.f37372i1 = true;
        this.f37386q1 = -1;
        this.f37388r1 = -1;
        this.f37400x1 = false;
        this.f37402y1 = true;
        this.A1 = 2;
        this.E1 = new Rect();
        this.G1 = -1;
        this.R1 = true;
        this.f37373i2 = Float.MAX_VALUE;
        this.f37375j2 = Float.MAX_VALUE;
        this.f37383o2 = true;
        this.f37385p2 = new yd(1);
        this.f37387q2 = true;
        this.f37389r2 = new jg.n1(this, 1);
        this.C2 = new et(this, 10);
        this.S2 = true;
        this.U2 = oj0.f36731a;
        this.V2 = org.telegram.ui.ActionBar.l6.f27809a7;
        this.X2 = new Path();
        this.f37381n2 = g6Var;
        os osVar = new os();
        this.D2 = osVar;
        setEdgeEffectFactory(osVar);
        org.telegram.ui.ActionBar.s6.l(this, 21, org.telegram.ui.ActionBar.l6.f28145s8, g6Var);
        org.telegram.ui.ActionBar.s6.l(this, 20, org.telegram.ui.ActionBar.l6.f27957i6, g6Var);
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
            Method method = f37353a3;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        super.setOnScrollListener(new ui(this, 13));
        this.E.add(new jj0(context, this));
    }

    public void setOnItemClickListener(dj0 dj0Var) {
        this.U0 = dj0Var;
    }

    public void setOnItemLongClickListener(fj0 fj0Var) {
        p1(fj0Var, ViewConfiguration.getLongPressTimeout());
    }
}
