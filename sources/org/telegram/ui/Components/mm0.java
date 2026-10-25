package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public class mm0 extends RecyclerView implements dh.a {
    public static int[] Z2;
    public static boolean f30614a3;
    public static final Method f30615b3;
    public static final Paint f30616c3;
    public static final Path f30617d3;
    public static final float[] f30618e3;
    public int A1;
    public boolean A2;
    public org.telegram.ui.Cells.y B1;
    public boolean B2;
    public int C1;
    public final m.g3 C2;
    public View D1;
    public final yt D2;
    public final Rect E1;
    public Matrix E2;
    public boolean F1;
    public boolean F2;
    public int G1;
    public xl0 G2;
    public boolean H1;
    public Utilities.CallbackReturn H2;
    public boolean I1;
    public Utilities.CallbackReturn I2;
    public boolean J1;
    public tv J2;
    public jg.i K1;
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
    public em0 Q1;
    public boolean Q2;
    public boolean R1;
    public boolean R2;
    public boolean S0;
    public wl0 S1;
    public ea S2;
    public zl0 T0;
    public wa0 T1;
    public boolean T2;
    public am0 U0;
    public boolean U1;
    public boolean U2;
    public bm0 V0;
    public boolean V1;
    public km0 V2;
    public cm0 W0;
    public boolean W1;
    public int W2;
    public boolean X0;
    public int X1;
    public ArrayList X2;
    public s4.u0 Y0;
    public int Y1;
    public final Path Y2;
    public yl0 Z0;
    public int Z1;
    public View f30619a1;
    public int a2;
    public bh.r f30620b1;
    public boolean f30621b2;
    public dm0 f30622c1;
    public boolean f30623c2;
    public sl0 f30624d1;
    public int f30625d2;
    public hm0 f30626e1;
    public int f30627e2;
    public boolean f30628f1;
    public org.telegram.ui.ti f30629f2;
    public boolean f30630g1;
    public boolean f30631g2;
    public boolean f30632h1;
    public boolean f30633h2;
    public boolean f30634i1;
    public float f30635i2;
    public Drawable f30636j1;
    public float f30637j2;
    public float f30638k1;
    public int[] f30639k2;
    public float l1;
    public ql0 f30640l2;
    public long f30641m1;
    public q0.a f30642m2;
    public ArrayList f30643n1;
    public final org.telegram.ui.ActionBar.u6 f30644n2;
    public ArrayList f30645o1;
    public boolean f30646o2;
    public View f30647p1;
    public final pe f30648p2;
    public int f30649q1;
    public boolean f30650q2;
    public int f30651r1;
    public final ig.o1 f30652r2;
    public int f30653s1;
    public Paint f30654s2;
    public int f30655t1;
    public boolean f30656t2;
    public int f30657u1;
    public int f30658u2;
    public boolean f30659v1;
    public GenericProvider f30660v2;
    public int f30661w1;
    public int f30662w2;
    public boolean f30663x1;
    public int f30664x2;
    public boolean f30665y1;
    public boolean f30666y2;
    public boolean f30667z1;
    public int f30668z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        f30615b3 = method;
        f30616c3 = new Paint(1);
        new Paint(1);
        f30617d3 = new Path();
        f30618e3 = new float[8];
    }

    public mm0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        if (view.getTag(R.id.dragging) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    private int[] getDrawableStateForSelector() {
        int[] onCreateDrawableState = onCreateDrawableState(1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = 16842919;
        return onCreateDrawableState;
    }

    public static float y1(View view) {
        if (view.getTag(R.id.dragging) != null) {
            return view.getTop();
        }
        return view.getY();
    }

    public final void A1() {
        sl0 sl0Var = this.f30624d1;
        if (sl0Var != null) {
            sl0Var.updateColors();
        }
    }

    public final void B1() {
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

    @Override
    public final void C0() {
        try {
            super.C0();
        } catch (NullPointerException unused) {
        }
    }

    public final void D0(Runnable runnable) {
        this.D2.f35136b.add(new vt(runnable, 1));
    }

    @Override
    public final View E(float f7, float f10) {
        float f11;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                if ((!(childAt instanceof org.telegram.ui.Cells.s1) && !(childAt instanceof org.telegram.ui.Cells.v0)) || childAt.getVisibility() != 4) {
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
        dm0 dm0Var = this.f30622c1;
        if (dm0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(dm0Var);
            this.f30622c1 = null;
        }
        View view = this.L1;
        if (view != null) {
            if (z10) {
                k1(view, 0.0f, 0.0f, false);
            }
            this.L1 = null;
            n1(null, view);
        }
        this.E1.setEmpty();
        em0 em0Var = this.Q1;
        if (em0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(em0Var);
            this.Q1 = null;
        }
        this.N1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j10) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            s4.n0 X = X(i10);
            if ((X instanceof dh.a) && ((X != this.G2 && X != this.S2) || this.F2)) {
                ((dh.a) X).f(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x9 = childAt.getX();
            float y3 = childAt.getY();
            if (rectF.intersects(x9, y3, childAt.getWidth() + x9, childAt.getHeight() + y3)) {
                this.A2 = true;
                drawChild(canvas, childAt, j10);
                this.A2 = false;
            }
        }
    }

    public final void K0(boolean z10) {
        int i10;
        if (!this.f30630g1) {
            int i11 = 0;
            if (getAdapter() != null && this.f30619a1 != null) {
                boolean S0 = S0();
                if (S0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (!this.W1 || !SharedConfig.animationsEnabled()) {
                    z10 = false;
                }
                if (z10) {
                    if (this.f30668z2 != i10) {
                        this.f30668z2 = i10;
                        if (i10 == 0) {
                            this.f30619a1.animate().setListener(null).cancel();
                            if (this.f30619a1.getVisibility() == 8) {
                                this.f30619a1.setVisibility(0);
                                this.f30619a1.setAlpha(0.0f);
                                if (this.X1 == 1) {
                                    this.f30619a1.setScaleX(0.7f);
                                    this.f30619a1.setScaleY(0.7f);
                                }
                            }
                            this.f30619a1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.f30619a1.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.f30619a1.animate().alpha(0.0f);
                            if (this.X1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new i10(this, 15)).start();
                        }
                    }
                } else {
                    this.f30668z2 = i10;
                    this.f30619a1.setVisibility(i10);
                    this.f30619a1.setAlpha(1.0f);
                }
                if (this.f30665y1) {
                    if (!b1() || !this.U2) {
                        if (S0) {
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
        sl0 sl0Var;
        int paddingTop;
        s4.e1 T;
        sl0 sl0Var2;
        View view;
        boolean z11;
        int i10;
        s4.e1 T2;
        int b10;
        int S;
        boolean z12;
        int i11;
        int i12;
        if (((this.I1 || z10) && this.f30624d1 != null) || (this.f30661w1 != 0 && this.f30626e1 != null)) {
            s4.p0 layoutManager = getLayoutManager();
            if (layoutManager instanceof s4.c0) {
                s4.c0 c0Var = (s4.c0) layoutManager;
                if (c0Var.f47705o == 1) {
                    if (this.f30626e1 != null) {
                        if (this.f30661w1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i13 = this.f30661w1;
                        float f7 = 32.0f;
                        int i14 = Integer.MAX_VALUE;
                        if (i13 != 1 && i13 != 3) {
                            if (i13 == 2) {
                                this.l1 = 0.0f;
                                if (this.f30626e1.h() != 0) {
                                    int childCount = getChildCount();
                                    int i15 = 0;
                                    int i16 = Integer.MAX_VALUE;
                                    View view2 = null;
                                    View view3 = null;
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        View childAt = getChildAt(i17);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f30657u1 + paddingTop) {
                                            if (bottom < i14) {
                                                view3 = childAt;
                                                i14 = bottom;
                                            }
                                            i15 = Math.max(i15, bottom);
                                            if (bottom >= AndroidUtilities.dp(32.0f) + this.f30657u1 + paddingTop && bottom < i16) {
                                                view2 = childAt;
                                                i16 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T2 = T(view3)) != null && (S = this.f30626e1.S((b10 = T2.b()))) >= 0) {
                                        if (this.f30649q1 != S || this.f30647p1 == null) {
                                            View view4 = this.f30647p1;
                                            if (view4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            View T3 = this.f30626e1.T(S, view4);
                                            if (z12) {
                                                T0(T3, false);
                                            }
                                            this.f30647p1 = T3;
                                            T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f30647p1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f30647p1.getMeasuredHeight());
                                            this.f30649q1 = S;
                                        }
                                        if (this.f30647p1 != null && view2 != null && view2.getClass() != this.f30647p1.getClass()) {
                                            this.l1 = 1.0f;
                                        }
                                        int M = this.f30626e1.M(S);
                                        int Q = this.f30626e1.Q(b10);
                                        if (i15 != 0 && i15 < getMeasuredHeight() - getPaddingBottom()) {
                                            i11 = -paddingTop;
                                        } else {
                                            i11 = this.f30657u1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f30647p1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f30657u1);
                                            if (height2 < height) {
                                                i12 = height2 - height;
                                            } else {
                                                i12 = paddingTop;
                                            }
                                            if (i12 < 0) {
                                                this.f30647p1.setTag(Integer.valueOf(paddingTop + i11 + i12));
                                            } else {
                                                this.f30647p1.setTag(Integer.valueOf(paddingTop + i11));
                                            }
                                        } else {
                                            this.f30647p1.setTag(Integer.valueOf(paddingTop + i11));
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
                            if (bottom2 > this.f30657u1 + paddingTop) {
                                if (bottom2 < i14) {
                                    i14 = bottom2;
                                    view6 = childAt2;
                                }
                                i19 = Math.max(i19, bottom2);
                                if (bottom2 >= AndroidUtilities.dp(f10) + this.f30657u1 + paddingTop && bottom2 < i20) {
                                    i20 = bottom2;
                                }
                            }
                            i18++;
                            f7 = f10;
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(c0Var.N0() - b11) + 1;
                            if ((this.I1 || z10) && (sl0Var2 = this.f30624d1) != null && !sl0Var2.f32638n && (getAdapter() instanceof tl0)) {
                                this.f30624d1.setProgress(Math.min(1.0f, b11 / ((this.f30626e1.h() - abs) + 1)));
                            }
                            this.f30645o1.addAll(this.f30643n1);
                            this.f30643n1.clear();
                            if (this.f30626e1.h() != 0) {
                                if (this.f30649q1 != b11 || this.f30651r1 != abs) {
                                    this.f30649q1 = b11;
                                    this.f30651r1 = abs;
                                    this.f30655t1 = 1;
                                    int S2 = this.f30626e1.S(b11);
                                    this.f30653s1 = S2;
                                    int M2 = (this.f30626e1.M(S2) + b11) - this.f30626e1.Q(b11);
                                    while (M2 < b11 + abs) {
                                        M2 += this.f30626e1.M(this.f30653s1 + this.f30655t1);
                                        this.f30655t1++;
                                    }
                                }
                                if (this.f30661w1 != 3) {
                                    int i21 = b11;
                                    for (int i22 = this.f30653s1; i22 < this.f30653s1 + this.f30655t1; i22++) {
                                        if (!this.f30645o1.isEmpty()) {
                                            view = (View) this.f30645o1.get(0);
                                            this.f30645o1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        View T4 = this.f30626e1.T(i22, view);
                                        if (z11) {
                                            T0(T4, false);
                                        }
                                        this.f30643n1.add(T4);
                                        int M3 = this.f30626e1.M(i22);
                                        if (i22 == this.f30653s1) {
                                            int Q2 = this.f30626e1.Q(i21);
                                            if (Q2 == M3 - 1) {
                                                T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                            } else if (Q2 == M3 - 2) {
                                                View childAt3 = getChildAt(i21 - b11);
                                                if (childAt3 != null) {
                                                    i10 = childAt3.getTop() + paddingTop;
                                                } else {
                                                    i10 = -AndroidUtilities.dp(100.0f);
                                                }
                                                T4.setTag(Integer.valueOf(Math.min(i10, 0)));
                                            } else {
                                                T4.setTag(0);
                                            }
                                            i21 = (M3 - this.f30626e1.Q(b11)) + i21;
                                        } else {
                                            View childAt4 = getChildAt(i21 - b11);
                                            if (childAt4 != null) {
                                                T4.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                            } else {
                                                T4.setTag(Integer.valueOf(-AndroidUtilities.dp(100.0f)));
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
                    int L0 = c0Var.L0();
                    Math.abs(c0Var.N0() - L0);
                    if (L0 != -1) {
                        if ((this.I1 || z10) && (sl0Var = this.f30624d1) != null && !sl0Var.f32638n) {
                            s4.h0 adapter = getAdapter();
                            if (adapter instanceof tl0) {
                                tl0 tl0Var = (tl0) adapter;
                                float H = tl0Var.H(this);
                                this.f30624d1.setIsVisible(tl0Var.E(this));
                                this.f30624d1.setProgress(Math.min(1.0f, H));
                                this.f30624d1.a(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void M0(float f7, float f10) {
        boolean z10;
        MessageObject.GroupedMessages groupedMessages;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.f30639k2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f7, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.ti tiVar = this.f30629f2;
            int[] iArr2 = this.f30639k2;
            org.telegram.ui.un unVar = tiVar.d;
            iArr2[0] = (int) unVar.E9;
            iArr2[1] = unVar.Na;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.f30627e2;
                if (i11 != S) {
                    int i12 = this.f30625d2;
                    if (i11 <= i12 && S <= i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.un unVar2 = this.f30629f2.d;
                    org.telegram.ui.fm fmVar = unVar2.A0;
                    ArrayList arrayList = unVar2.G6;
                    int i13 = S - fmVar.J;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) unVar2.J6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            if (z10) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf(arrayList2.get(size)) + unVar2.A0.J;
                        }
                    }
                    if (z10) {
                        int i14 = this.f30627e2;
                        if (S > i14) {
                            if (!this.f30629f2.f43845a) {
                                for (int i15 = i14 + 1; i15 <= S; i15++) {
                                    if (i15 != this.f30625d2 && this.f30629f2.a(i15)) {
                                        this.f30629f2.b(i15, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i14 > S) {
                                if (i14 != this.f30625d2 && this.f30629f2.a(i14)) {
                                    this.f30629f2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        }
                    } else {
                        int i16 = this.f30627e2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.f30625d2 && this.f30629f2.a(i16)) {
                                    this.f30629f2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.f30629f2.f43845a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.f30625d2 && this.f30629f2.a(i17)) {
                                    this.f30629f2.b(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f30629f2.f43845a) {
                    this.f30627e2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void N0(Canvas canvas, View view) {
        boolean i12;
        boolean i13;
        if (this.S2 == null && view != null && x1(view) && ((Boolean) this.G2.f34771a.run(view)).booleanValue() && j1(view)) {
            int R = RecyclerView.R(view);
            boolean z10 = false;
            if (R == -1) {
                i13 = false;
                i12 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                i12 = i1(U0, true);
                i13 = i1(U02, false);
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(q1(), y1(view)), view.getX() + view.getWidth(), Math.min(p1(), G0(view)));
            if (i12 && i13) {
                if (y1(view) >= rectF.top) {
                    i12 = true;
                } else {
                    i12 = false;
                }
                if (G0(view) <= rectF.bottom) {
                    z10 = true;
                }
                if (!i12 || !z10) {
                    i13 = z10;
                } else {
                    return;
                }
            }
            Path path = this.Y2;
            if (!i12 && !i13) {
                path.rewind();
                float f7 = this.L2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!i12) {
                path.rewind();
                path.addRoundRect(rectF, this.M2, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!i13) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void O0(Canvas canvas) {
        float f7;
        float height;
        boolean z10 = this.Q2;
        if (!z10 && !this.R2) {
            return;
        }
        if (z10) {
            f7 = getSectionsEdgeTop();
        } else {
            f7 = -getHeight();
        }
        float width = getWidth();
        if (this.R2) {
            height = getSectionsEdgeBottom();
        } else {
            height = getHeight() * 2;
        }
        canvas.clipRect(0.0f, f7, width, height);
    }

    public final void P0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f7;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof g90) {
                f7 = ((g90) view2).getBottomInfoMargin();
            } else {
                f7 = 0.0f;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float left = view.getLeft();
            float q12 = q1();
            float y12 = y1(view);
            if (z10) {
                f10 = this.L2;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(q12, y12 - f10);
            float right = view.getRight();
            float p12 = p1();
            float G0 = G0(view2);
            if (z11) {
                f11 = this.L2;
            }
            rectF.set(left, max, right, Math.min(p12, (G0 + f11) - f7));
            if (rectF.bottom >= rectF.top) {
                float f12 = this.L2;
                this.J2.mo5run(canvas, rectF, Float.valueOf(f12), Float.valueOf(f12), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void Q0(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mm0.Q0(android.graphics.Canvas):void");
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.y yVar;
        q0.a aVar;
        View view;
        Rect rect = this.E1;
        if (!rect.isEmpty() && (yVar = this.B1) != null) {
            int i10 = this.G1;
            if ((i10 == -2 || i10 == this.C1) && this.D1 != null) {
                if (getAdapter() instanceof lm0) {
                    ((lm0) getAdapter()).getClass();
                }
                this.B1.setBounds(this.D1.getLeft(), this.D1.getTop(), this.D1.getRight(), this.D1.getBottom());
            } else {
                yVar.setBounds(rect);
            }
            canvas.save();
            int i11 = this.G1;
            if ((i11 == -2 || i11 == this.C1) && (aVar = this.f30642m2) != null) {
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

    public boolean S0() {
        if (getAdapter() != null && !this.V1 && getAdapter().h() == 0) {
            return true;
        }
        return false;
    }

    public final void T0(View view, boolean z10) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z10) {
                return;
            }
            int i10 = this.f30661w1;
            if (i10 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final View U0(int i10) {
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

    public final Drawable V0(View view, boolean z10) {
        boolean i12;
        boolean i13;
        float f7;
        float height;
        if (view.getParent() == this && b1() && j1(view)) {
            int R = RecyclerView.R(view);
            boolean z11 = true;
            if (R == -1) {
                i13 = false;
                i12 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                i12 = i1(U0, true);
                i13 = i1(U02, false);
            }
            RectF rectF = new RectF();
            float x9 = view.getX();
            if (this.Q2) {
                f7 = getSectionsEdgeTop();
            } else {
                f7 = 0.0f;
            }
            float max = Math.max(f7, y1(view));
            float x10 = view.getX() + view.getWidth();
            if (this.R2) {
                height = getSectionsEdgeBottom();
            } else {
                height = getHeight();
            }
            rectF.set(x9, max, x10, Math.min(height, G0(view)));
            if (i12 && i13 && !z10) {
                if (y1(view) >= rectF.top) {
                    i12 = true;
                } else {
                    i12 = false;
                }
                if (G0(view) > rectF.bottom) {
                    z11 = false;
                }
                if (i12 && z11) {
                    return org.telegram.ui.ActionBar.y6.c0(0, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23354d6, this.f30644n2));
                }
                i13 = z11;
            }
            Path path = new Path();
            if ((!i12 && !i13) || z10) {
                path.rewind();
                float f10 = this.L2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            } else if (!i12) {
                path.rewind();
                path.addRoundRect(rectF, this.M2, Path.Direction.CW);
            } else if (!i13) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
            }
            return new rl0(this, view, path, rectF);
        }
        return null;
    }

    public Integer W0(int i10) {
        GenericProvider genericProvider = this.f30660v2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint X0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.u6 u6Var = this.f30644n2;
        if (u6Var != null) {
            paint = u6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.y6.U0(str);
    }

    public final boolean Y0(int i10, View view) {
        int R;
        if (!this.Q2 && view != null && i10 <= 0 && getAdapter() != null && this.I2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.I2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Z0() {
        xt[] xtVarArr;
        for (xt xtVar : this.D2.f35135a) {
            if (xtVar != null && xtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i10, View view) {
        int R;
        if (!this.R2 && view != null && i10 >= getChildCount() - 1 && getAdapter() != null && this.I2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().h() - 1) {
            return ((Boolean) this.I2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
        }
        return false;
    }

    @Override
    public final void b(ch.a aVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            aVar.f6296a = true;
        } else if (Z0() && getOverScrollMode() != 2) {
            aVar.f6296a = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i10 = 0; i10 < itemDecorationCount; i10++) {
                s4.n0 X = X(i10);
                if ((X instanceof dh.a) && ((X != this.G2 && X != this.S2) || this.F2)) {
                    ((dh.a) X).b(aVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                float x9 = childAt.getX();
                float y3 = childAt.getY();
                if (rectF.intersects(x9, y3, childAt.getWidth() + x9, childAt.getHeight() + y3)) {
                    aVar.getClass();
                    android.support.v4.media.session.x.a(aVar, childAt);
                }
            }
        }
    }

    public final boolean b1() {
        if (this.G2 == null && this.S2 == null) {
            return false;
        }
        return true;
    }

    public final void c1() {
        if (!this.f30630g1) {
            this.f30630g1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.f30619a1;
            if (view != null && view.getVisibility() != 8) {
                this.f30619a1.setVisibility(8);
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

    public final void d1(boolean z10) {
        View view = this.L1;
        if (view != null) {
            k1(view, 0.0f, 0.0f, false);
            this.L1 = null;
            if (z10) {
                n1(null, view);
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
        ql0 ql0Var = this.f30640l2;
        if (ql0Var != null) {
            mm0 mm0Var = ql0Var.f31950a;
            if (ql0Var.d || ql0Var.e) {
                for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
                    View childAt = mm0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !ql0Var.f31952c.contains(childAt)) {
                        Float f10 = (Float) ql0Var.f31951b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                ql0Var.d = false;
            }
        }
        if (this.S0 && this.f30667z1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.S0 && !this.f30667z1) {
            R0(canvas);
        }
        bh.r rVar = this.f30620b1;
        if (rVar != null) {
            rVar.draw(canvas);
        }
        if (!this.f30663x1) {
            int i11 = this.f30661w1;
            float f11 = 0.0f;
            if (i11 == 1) {
                if (this.f30626e1 != null && !this.f30643n1.isEmpty()) {
                    for (int i12 = 0; i12 < this.f30643n1.size(); i12++) {
                        View view2 = (View) this.f30643n1.get(i12);
                        int save = canvas.save();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        if (LocaleController.isRTL) {
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
            } else if (i11 == 2 && this.f30626e1 != null && (view = this.f30647p1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f30647p1.getTag()).intValue();
                if (LocaleController.isRTL) {
                    f11 = getWidth() - this.f30647p1.getWidth();
                }
                canvas.translate(f11, intValue2);
                Drawable drawable = this.f30636j1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f30647p1.getMeasuredHeight(), getWidth(), this.f30636j1.getIntrinsicHeight() + this.f30647p1.getMeasuredHeight());
                    this.f30636j1.setAlpha((int) (this.f30638k1 * 255.0f));
                    this.f30636j1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.f30641m1);
                    this.f30641m1 = elapsedRealtime;
                    float f12 = this.f30638k1;
                    float f13 = this.l1;
                    if (f12 < f13) {
                        float f14 = (((float) min) / 180.0f) + f12;
                        this.f30638k1 = f14;
                        if (f14 > f13) {
                            this.f30638k1 = f13;
                        }
                        invalidate();
                    } else if (f12 > f13) {
                        float f15 = f12 - (((float) min) / 180.0f);
                        this.f30638k1 = f15;
                        if (f15 < f13) {
                            this.f30638k1 = f13;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f30647p1.getMeasuredHeight());
                this.f30647p1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f30664x2 == 0 && this.f30666y2) {
                setOverScrollMode(0);
            }
            this.f30664x2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.f30664x2 - 1;
            this.f30664x2 = i10;
            if (i10 == 0 && this.f30666y2) {
                setOverScrollMode(2);
            }
        }
        sl0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.f32623a0 && fastScroll.f32637l0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f30626e1 != null && (view = this.f30647p1) != null && view.getAlpha() != 0.0f && this.f30647p1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.G2 != null && !this.A2) {
            canvas.save();
            O0(canvas);
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
        B1();
    }

    public final void e1(wl0 wl0Var, int i10, boolean z10) {
        wa0 wa0Var = this.T1;
        if (wa0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(wa0Var);
            this.T1 = null;
        }
        s4.e1 K = K(wl0Var.run());
        if (K != null) {
            View view = K.f47735a;
            int c10 = K.c();
            this.f30662w2 = c10;
            l1(c10, view);
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
                wa0 wa0Var2 = new wa0(this, 21);
                this.T1 = wa0Var2;
                AndroidUtilities.runOnUIThread(wa0Var2, i10);
            }
        } else if (z10) {
            this.S1 = wl0Var;
        }
    }

    public void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Z0() && getOverScrollMode() != 2) {
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
                    FileLog.e(th2);
                    return;
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
        J0(canvas, rectF, uptimeMillis);
    }

    public final void f1() {
        Utilities.CallbackReturn callbackReturn;
        tv tvVar;
        s4.n0 n0Var = this.G2;
        if (n0Var != null) {
            q0(n0Var);
            this.G2 = null;
        }
        s4.n0 n0Var2 = this.S2;
        if (n0Var2 != null) {
            q0(n0Var2);
            this.S2 = null;
        }
        Utilities.CallbackReturn callbackReturn2 = this.H2;
        if (callbackReturn2 != null && (callbackReturn = this.I2) != null && (tvVar = this.J2) != null) {
            if (!this.T2 && !this.Q2 && !this.R2) {
                ea eaVar = new ea(this, callbackReturn2, callbackReturn, this.O2, this.L2, tvVar, this.P2, this.U2, this.V2);
                this.S2 = eaVar;
                i(eaVar);
                return;
            }
            xl0 xl0Var = new xl0(this, callbackReturn2, this.O2, this.P2);
            this.G2 = xl0Var;
            i(xl0Var);
        }
    }

    @Override
    public final void g0(View view) {
        if (getAdapter() instanceof lm0) {
            s4.e1 G = G(view);
            if (G != null) {
                view.setEnabled(((lm0) getAdapter()).D(G));
                if (this.f30646o2) {
                    view.setAccessibilityDelegate(this.f30648p2);
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
            if (childAt instanceof org.telegram.ui.ActionBar.p6) {
                ((org.telegram.ui.ActionBar.p6) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    public View getEmptyView() {
        return this.f30619a1;
    }

    public sl0 getFastScroll() {
        return this.f30624d1;
    }

    public ArrayList<View> getHeaders() {
        return this.f30643n1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f30645o1;
    }

    public zl0 getOnItemClickListener() {
        return this.T0;
    }

    public s4.u0 getOnScrollListener() {
        return this.Y0;
    }

    public View getPinnedHeader() {
        return this.f30647p1;
    }

    public View getPressedChildView() {
        return this.L1;
    }

    public int getSectionColorForDecoration() {
        return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23354d6, this.f30644n2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return i0.a.o(org.telegram.ui.ActionBar.y6.w0(this.W2, this.f30644n2), 255);
    }

    public boolean getSectionsDrawBackground() {
        return this.U2;
    }

    public float getSectionsEdgeBottom() {
        return getHeight() - getPaddingBottom();
    }

    public float getSectionsEdgeTop() {
        return getPaddingTop();
    }

    public Drawable getSelectorDrawable() {
        return this.B1;
    }

    public int getSelectorDrawableColor() {
        return this.f30658u2;
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
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                if (i10 >= unpackA && i10 <= unpackB) {
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

    public final boolean i1(View view, boolean z10) {
        if (view != null && j1(view)) {
            if (z10) {
                if (!this.Q2 || G0(view) > q1()) {
                    return true;
                }
                return false;
            } else if (!this.R2 || y1(view) < p1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean j1(View view) {
        ea eaVar = this.S2;
        if (eaVar != null) {
            return eaVar.u(view);
        }
        xl0 xl0Var = this.G2;
        if (xl0Var != null && ((Boolean) xl0Var.f34771a.run(view)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    public void k1(View view, float f7, float f10, boolean z10) {
        if (!this.f30632h1 && view != null) {
            view.setPressed(z10);
        }
    }

    public final void l1(int i10, View view) {
        boolean z10;
        int i11;
        int i12;
        wa0 wa0Var = this.T1;
        if (wa0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(wa0Var);
            this.T1 = null;
            this.S1 = null;
        }
        if (this.B1 != null) {
            if (i10 != this.C1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getAdapter() instanceof lm0) {
                ((lm0) getAdapter()).getClass();
            }
            if (i10 != -1) {
                this.C1 = i10;
            }
            this.D1 = view;
            if (this.A1 == 8) {
                org.telegram.ui.ActionBar.y6.D1(this.B1, this.Y1, 0);
            } else if (this.Z1 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.y yVar = this.B1;
                if (i10 == 0) {
                    i11 = this.Z1;
                } else {
                    i11 = 0;
                }
                if (i10 == getAdapter().h() - 2) {
                    i12 = this.Z1;
                } else {
                    i12 = 0;
                }
                org.telegram.ui.ActionBar.y6.D1(yVar, i11, i12);
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
            setListSelectorColor(W0(i10));
            this.B1.setBounds(rect);
            if (z10 && getVisibility() == 0) {
                this.B1.setVisible(true, false);
            }
        }
    }

    public final void m1() {
        int i10;
        wa0 wa0Var = this.T1;
        if (wa0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(wa0Var);
            this.T1.run();
            this.T1 = null;
            this.D1 = null;
            return;
        }
        this.T1 = null;
        this.S1 = null;
        View view = this.D1;
        if (view != null && (i10 = this.f30662w2) != -1) {
            l1(i10, view);
            org.telegram.ui.Cells.y yVar = this.B1;
            if (yVar != null) {
                yVar.setState(new int[0]);
                invalidateDrawable(this.B1);
            }
            this.D1 = null;
            this.f30662w2 = -1;
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

    public final void n1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.E1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    l1(this.M1, view);
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
                B1();
            }
        }
    }

    public final void o1(mm0 mm0Var, boolean z10) {
        ViewParent parent;
        if (mm0Var != null && (parent = mm0Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sl0 sl0Var = this.f30624d1;
        if (sl0Var != null && sl0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f30624d1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f30624d1);
            }
            ((ViewGroup) getParent()).addView(this.f30624d1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        ql0 ql0Var = this.f30640l2;
        if (ql0Var != null) {
            ql0Var.a();
        }
        if (this.f30656t2) {
            this.f30656t2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.O1) {
                o1(this, true);
            }
            if (this.Z0 != null) {
                int i10 = org.telegram.ui.un.f44168bd;
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
        sl0 sl0Var = this.f30624d1;
        if (sl0Var != null) {
            this.H1 = true;
            if (sl0Var.f32622a) {
                i14 = getPaddingTop();
            } else {
                i14 = sl0Var.f32633h0;
            }
            int i15 = i11 + i14;
            sl0 sl0Var2 = this.f30624d1;
            if (sl0Var2.f32632g0) {
                sl0Var2.layout(0, i15, sl0Var2.getMeasuredWidth(), this.f30624d1.getMeasuredHeight() + i15);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f30624d1.getMeasuredWidth();
                sl0 sl0Var3 = this.f30624d1;
                sl0Var3.layout(measuredWidth, i15, sl0Var3.getMeasuredWidth() + measuredWidth, this.f30624d1.getMeasuredHeight() + i15);
            }
            this.H1 = false;
        }
        L0(false);
        wl0 wl0Var = this.S1;
        if (wl0Var != null) {
            e1(wl0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        sl0 sl0Var = this.f30624d1;
        if (sl0Var != null && sl0Var.getLayoutParams() != null) {
            sl0 sl0Var2 = this.f30624d1;
            if (sl0Var2.f32622a) {
                i12 = getPaddingTop();
            } else {
                i12 = sl0Var2.f32633h0;
            }
            int measuredHeight = (getMeasuredHeight() - i12) - getPaddingBottom();
            this.f30624d1.getLayoutParams().height = measuredHeight;
            this.f30624d1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.a2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        bh.r rVar = this.f30620b1;
        if (rVar != null) {
            rVar.requestLayout();
        }
        int i14 = this.f30661w1;
        if (i14 == 1) {
            if (this.f30626e1 != null && !this.f30643n1.isEmpty()) {
                for (int i15 = 0; i15 < this.f30643n1.size(); i15++) {
                    T0((View) this.f30643n1.get(i15), true);
                }
            }
        } else if (i14 == 2 && this.f30626e1 != null && (view = this.f30647p1) != null) {
            T0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        sl0 sl0Var = this.f30624d1;
        if (sl0Var != null && sl0Var.f32638n) {
            return false;
        }
        boolean z10 = this.f30621b2;
        m.g3 g3Var = this.C2;
        if (z10 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f30635i2 == Float.MAX_VALUE && this.f30637j2 == Float.MAX_VALUE) {
                this.f30635i2 = motionEvent.getX();
                this.f30637j2 = motionEvent.getY();
            }
            if (!this.f30623c2 && Math.abs(motionEvent.getY() - this.f30637j2) > this.a2) {
                this.f30623c2 = true;
                o1(this, true);
            }
            if (this.f30623c2) {
                M0(motionEvent.getX(), motionEvent.getY());
                org.telegram.ui.ti tiVar = this.f30629f2;
                int[] iArr = this.f30639k2;
                org.telegram.ui.un unVar = tiVar.d;
                iArr[0] = (int) unVar.E9;
                iArr[1] = unVar.Na;
                if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.f30639k2[1] && (this.f30627e2 >= this.f30625d2 || !this.f30629f2.f43845a)) {
                    this.f30633h2 = false;
                    if (!this.f30631g2) {
                        this.f30631g2 = true;
                        AndroidUtilities.cancelRunOnUIThread(g3Var);
                        AndroidUtilities.runOnUIThread(g3Var);
                        return true;
                    }
                } else if (motionEvent.getY() < AndroidUtilities.dp(56.0f) + this.f30639k2[0] && (this.f30627e2 <= this.f30625d2 || !this.f30629f2.f43845a)) {
                    this.f30633h2 = true;
                    if (!this.f30631g2) {
                        this.f30631g2 = true;
                        AndroidUtilities.cancelRunOnUIThread(g3Var);
                        AndroidUtilities.runOnUIThread(g3Var);
                        return true;
                    }
                } else {
                    this.f30631g2 = false;
                    AndroidUtilities.cancelRunOnUIThread(g3Var);
                }
            }
            return true;
        }
        this.f30635i2 = Float.MAX_VALUE;
        this.f30637j2 = Float.MAX_VALUE;
        this.f30621b2 = false;
        this.f30623c2 = false;
        o1(this, false);
        this.f30631g2 = false;
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        return super.onTouchEvent(motionEvent);
    }

    public final float p1() {
        if (this.R2) {
            return getSectionsEdgeBottom();
        }
        return getHeight() + this.L2;
    }

    public final float q1() {
        if (this.Q2) {
            return getSectionsEdgeTop();
        }
        return -this.L2;
    }

    public final void r1(int i10, boolean z10) {
        this.W1 = z10;
        this.X1 = i10;
    }

    @Override
    public void requestLayout() {
        if (!this.V1 && !this.B2) {
            super.requestLayout();
        }
    }

    public final void s1(cm0 cm0Var, long j10) {
        boolean z10;
        this.W0 = cm0Var;
        jg.i iVar = this.K1;
        if (cm0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        v20 v20Var = (v20) iVar.f15726a;
        v20Var.f33553t = z10;
        v20Var.f33554u = j10;
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f30646o2 = z10;
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        s4.h0 adapter = getAdapter();
        ig.o1 o1Var = this.f30652r2;
        if (adapter != null) {
            adapter.f47765a.unregisterObserver(o1Var);
        }
        ArrayList arrayList = this.f30643n1;
        if (arrayList != null) {
            arrayList.clear();
            this.f30645o1.clear();
        }
        this.f30649q1 = -1;
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        this.f30647p1 = null;
        if (h0Var instanceof hm0) {
            this.f30626e1 = (hm0) h0Var;
        } else {
            this.f30626e1 = null;
        }
        super.setAdapter(h0Var);
        if (h0Var != null) {
            h0Var.B(o1Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f30634i1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f30659v1 = z10;
    }

    public void setBitmapSectionsBackgroundColorKey(int i10) {
        if (this.W2 == i10) {
            return;
        }
        this.W2 = i10;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.F2 = z10;
        if (z10) {
            setSectionsRounding(false);
        }
    }

    public void setDisableHighlightState(boolean z10) {
        this.f30632h1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.O1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.S0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.f30667z1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.f30619a1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.f30619a1 = view;
            if (this.W1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f30630g1) {
                View view3 = this.f30619a1;
                if (view3 != null) {
                    this.f30668z2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.f30668z2 = -1;
            K0(false);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.f30624d1 = new sl0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f30624d1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        int i10;
        sl0 sl0Var = this.f30624d1;
        if (sl0Var == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        sl0Var.setVisibility(i10);
        this.f30624d1.f32623a0 = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.f30665y1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.P1 = z10;
    }

    @Override
    public void setItemAnimator(s4.m0 m0Var) {
        super.setItemAnimator(m0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.f30660v2 = genericProvider;
    }

    public void setItemsEnterAnimator(ql0 ql0Var) {
        this.f30640l2 = ql0Var;
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
        int i10;
        if (num == null) {
            if (b1()) {
                i10 = org.telegram.ui.ActionBar.y6.f23463j6;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.f23446i6;
            }
            intValue = org.telegram.ui.ActionBar.y6.w0(i10, this.f30644n2);
        } else {
            intValue = num.intValue();
        }
        this.f30658u2 = intValue;
        org.telegram.ui.ActionBar.y6.E1(this.B1, intValue, true);
    }

    public void setOnInterceptTouchListener(yl0 yl0Var) {
        this.Z0 = yl0Var;
    }

    public void setOnItemClickListener(zl0 zl0Var) {
        this.T0 = zl0Var;
    }

    public void setOnItemLongClickListener(bm0 bm0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.V0 = bm0Var;
        jg.i iVar = this.K1;
        boolean z10 = bm0Var != null;
        v20 v20Var = (v20) iVar.f15726a;
        v20Var.f33553t = z10;
        v20Var.f33554u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(s4.u0 u0Var) {
        this.Y0 = u0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.f30636j1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.f30657u1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f30650q2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.R1 = z10;
    }

    public void setSections(boolean z10) {
        v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsDrawBackground(boolean z10) {
        if (this.U2 != z10) {
            this.U2 = z10;
            ea eaVar = this.S2;
            if (eaVar != null) {
                mm0 mm0Var = eaVar.f27772a;
                if (eaVar.K != z10) {
                    eaVar.K = z10;
                    mm0Var.a0();
                    mm0Var.invalidate();
                }
                this.f30665y1 = false;
                if (this.f30619a1 != null) {
                    setVisibility(0);
                }
            }
        }
    }

    public void setSectionsDrawingMode(km0 km0Var) {
        if (this.V2 != km0Var) {
            this.V2 = km0Var;
            ea eaVar = this.S2;
            if (eaVar != null) {
                mm0 mm0Var = eaVar.f27772a;
                if (eaVar.L != km0Var) {
                    eaVar.L = km0Var;
                    mm0Var.a0();
                    mm0Var.invalidate();
                }
            }
        }
    }

    public void setSectionsRounding(boolean z10) {
        if (this.Q2 == z10 && this.R2 == z10) {
            return;
        }
        this.Q2 = z10;
        this.R2 = z10;
        f1();
        invalidate();
    }

    public void setSectionsType(int i10) {
        this.f30661w1 = i10;
        if (i10 != 1 && i10 != 3) {
            return;
        }
        this.f30643n1 = new ArrayList();
        this.f30645o1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i10) {
        this.f30658u2 = i10;
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            yVar.setCallback(null);
        }
        int i11 = this.A1;
        if (i11 == 8) {
            this.B1 = org.telegram.ui.ActionBar.y6.Z(i10, this.Y1, 0);
        } else if (i11 == 9) {
            this.B1 = null;
        } else {
            int i12 = this.Z1;
            if (i12 > 0) {
                this.B1 = org.telegram.ui.ActionBar.y6.Z(i10, i12, i12);
            } else {
                int i13 = this.Y1;
                if (i13 > 0 && i11 != 1) {
                    this.B1 = org.telegram.ui.ActionBar.y6.j0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.B1 = org.telegram.ui.ActionBar.y6.g0(i10, 2, -1);
                } else {
                    this.B1 = org.telegram.ui.ActionBar.y6.g0(i10, i11, i13);
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
        this.f30642m2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.A1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f30663x1 = z10;
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
        sl0 sl0Var = this.f30624d1;
        if (sl0Var != null) {
            sl0Var.setTranslationY(f7);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (Z2 != null) {
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

    public final void t1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.B2 = true;
        setPadding(i10, i11, i12, i13);
        this.B2 = false;
    }

    public final void u1() {
        v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (this.X0) {
            cm0 cm0Var = this.W0;
            if (cm0Var != null) {
                cm0Var.o(i11);
            }
            iArr[0] = i10;
            iArr[1] = i11;
            return true;
        }
        return super.v(i10, i11, i12, iArr, iArr2);
    }

    public void v1(int i10, float f7, boolean z10) {
        ai.d0 d0Var = new ai.d0(7);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new fi.d5(this, d0Var, sparseIntArray, 3), new vi(sparseIntArray, 2));
        w1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f7, z10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.B1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, boolean z10) {
        tv tvVar = new tv(this, 18);
        org.telegram.ui.ActionBar.f7.m(this, 20, org.telegram.ui.ActionBar.y6.f23463j6, this.f30644n2);
        this.H2 = callbackReturn;
        this.I2 = callbackReturn2;
        this.O2 = i10;
        this.P2 = z10;
        this.L2 = f7;
        this.M2 = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.N2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
        this.J2 = tvVar;
        if (AndroidUtilities.isTablet() && !this.F2) {
            this.R2 = true;
            this.Q2 = true;
        }
        f1();
    }

    public boolean x1(View view) {
        return true;
    }

    public boolean z1() {
        return this.G;
    }

    public mm0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.S0 = true;
        this.f30634i1 = true;
        this.f30649q1 = -1;
        this.f30651r1 = -1;
        this.f30663x1 = false;
        this.f30665y1 = true;
        this.A1 = 2;
        this.E1 = new Rect();
        this.G1 = -1;
        this.R1 = true;
        this.f30635i2 = Float.MAX_VALUE;
        this.f30637j2 = Float.MAX_VALUE;
        this.f30646o2 = true;
        this.f30648p2 = new pe(1);
        this.f30650q2 = true;
        this.f30652r2 = new ig.o1(this, 1);
        this.C2 = new m.g3(this, 24);
        this.V2 = km0.f29940a;
        this.W2 = org.telegram.ui.ActionBar.y6.f23297a7;
        this.Y2 = new Path();
        this.f30644n2 = u6Var;
        yt ytVar = new yt();
        this.D2 = ytVar;
        setEdgeEffectFactory(ytVar);
        org.telegram.ui.ActionBar.f7.m(this, 21, org.telegram.ui.ActionBar.y6.f23634s8, u6Var);
        org.telegram.ui.ActionBar.f7.m(this, 20, org.telegram.ui.ActionBar.y6.f23446i6, u6Var);
        try {
            if (!f30614a3) {
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
                f30614a3 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(Z2);
            Method method = f30615b3;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.setOnScrollListener(new ml(this, 11));
        this.E.add(new gm0(context, this));
    }

    public void setOnItemClickListener(am0 am0Var) {
        this.U0 = am0Var;
    }

    public void setOnItemLongClickListener(cm0 cm0Var) {
        s1(cm0Var, ViewConfiguration.getLongPressTimeout());
    }
}
