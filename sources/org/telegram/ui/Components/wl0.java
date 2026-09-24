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
import android.widget.FrameLayout;
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
public class wl0 extends RecyclerView implements bh.a {
    public static int[] Q2;
    public static boolean R2;
    public static final Method S2;
    public static final Paint T2;
    public static final Paint U2;
    public static final Path V2;
    public static final float[] W2;
    public boolean A1;
    public int A2;
    public boolean B1;
    public boolean B2;
    public int C1;
    public boolean C2;
    public org.telegram.ui.Cells.z D1;
    public final org.telegram.ui.Cells.t6 D2;
    public int E1;
    public final pt E2;
    public View F1;
    public Matrix F2;
    public final Rect G1;
    public boolean G2;
    public boolean H1;
    public il0 H2;
    public int I1;
    public Utilities.CallbackReturn I2;
    public boolean J1;
    public Utilities.Callback5 J2;
    public boolean K1;
    public ArrayList K2;
    public boolean L1;
    public float L2;
    public ka.c M1;
    public float[] M2;
    public View N1;
    public float[] N2;
    public int O1;
    public ArrayList O2;
    public boolean P1;
    public final Path P2;
    public boolean Q1;
    public boolean R1;
    public pl0 S1;
    public boolean T1;
    public boolean U0;
    public hl0 U1;
    public kl0 V0;
    public ic0 V1;
    public ll0 W0;
    public boolean W1;
    public ml0 X0;
    public boolean X1;
    public nl0 Y0;
    public boolean Y1;
    public boolean Z0;
    public int Z1;
    public s4.s0 f30065a1;
    public int a2;
    public jl0 f30066b1;
    public int f30067b2;
    public View f30068c1;
    public int f30069c2;
    public ai.f0 f30070d1;
    public boolean f30071d2;
    public ol0 f30072e1;
    public boolean f30073e2;
    public dl0 f30074f1;
    public int f30075f2;
    public sl0 f30076g1;
    public int f30077g2;
    public boolean f30078h1;
    public org.telegram.ui.ni f30079h2;
    public boolean f30080i1;
    public boolean f30081i2;
    public boolean f30082j1;
    public boolean f30083j2;
    public boolean f30084k1;
    public float f30085k2;
    public Drawable l1;
    public float f30086l2;
    public float f30087m1;
    public int[] f30088m2;
    public float f30089n1;
    public bl0 f30090n2;
    public long f30091o1;
    public q0.a f30092o2;
    public ArrayList f30093p1;
    public final org.telegram.ui.ActionBar.d6 f30094p2;
    public ArrayList f30095q1;
    public boolean f30096q2;
    public View f30097r1;
    public final qe f30098r2;
    public int f30099s1;
    public boolean f30100s2;
    public int f30101t1;
    public final gg.p1 f30102t2;
    public int f30103u1;
    public Paint f30104u2;
    public int f30105v1;
    public boolean f30106v2;
    public int f30107w1;
    public GenericProvider f30108w2;
    public boolean f30109x1;
    public int f30110x2;
    public int f30111y1;
    public int f30112y2;
    public boolean f30113z1;
    public boolean f30114z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        S2 = method;
        T2 = new Paint(1);
        U2 = new Paint(1);
        V2 = new Path();
        W2 = new float[8];
    }

    public wl0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        if (view.getTag(R.id.dragging) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static void O0(Canvas canvas, RectF rectF, float f7, float f10, float f11, org.telegram.ui.ActionBar.d6 d6Var) {
        boolean z10 = SharedConfig.shadowsInSections;
        Paint paint = T2;
        Paint paint2 = U2;
        if (z10) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.h6.l1(f11, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.h6.l1(f11, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.h6.l1(f11, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045d6, d6Var)));
        if (f7 == f10) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f7, f7, paint2);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        Path path = V2;
        path.rewind();
        float[] fArr = W2;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        if (SharedConfig.shadowsInSections) {
            canvas.drawPath(path, paint2);
        }
        canvas.drawPath(path, paint);
    }

    private int[] getDrawableStateForSelector() {
        int[] onCreateDrawableState = onCreateDrawableState(1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = 16842919;
        return onCreateDrawableState;
    }

    public static float t1(View view) {
        if (view.getTag(R.id.dragging) != null) {
            return view.getTop();
        }
        return view.getY();
    }

    @Override
    public final void B0() {
        try {
            super.B0();
        } catch (NullPointerException unused) {
        }
    }

    public final void C0(Runnable runnable) {
        this.E2.f27418b.add(new mt(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.f30070d1 == null) {
            this.f30070d1 = new ai.f0(this, getContext(), 16);
        }
        this.f30070d1.addView(clippingImageView, layoutParams);
    }

    @Override
    public final View E(float f7, float f10) {
        float f11;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                if ((!(childAt instanceof org.telegram.ui.Cells.u1) && !(childAt instanceof org.telegram.ui.Cells.w0)) || childAt.getVisibility() != 4) {
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
        ol0 ol0Var = this.f30072e1;
        if (ol0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ol0Var);
            this.f30072e1 = null;
        }
        View view = this.N1;
        if (view != null) {
            if (z10) {
                h1(view, 0.0f, 0.0f, false);
            }
            this.N1 = null;
            k1(null, view);
        }
        this.G1.setEmpty();
        pl0 pl0Var = this.S1;
        if (pl0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(pl0Var);
            this.S1 = null;
        }
        this.P1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j3) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            s4.n0 X = X(i10);
            if ((X instanceof bh.a) && (X != this.H2 || this.G2)) {
                ((bh.a) X).f(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x10 = childAt.getX();
            float y3 = childAt.getY();
            if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                this.B2 = true;
                drawChild(canvas, childAt, j3);
                this.B2 = false;
            }
        }
    }

    public final void K0(boolean z10) {
        int i10;
        if (!this.f30080i1) {
            int i11 = 0;
            if (getAdapter() != null && this.f30068c1 != null) {
                boolean S0 = S0();
                if (S0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if ((this.Y1 && SharedConfig.animationsEnabled()) ? false : false) {
                    if (this.A2 != i10) {
                        this.A2 = i10;
                        if (i10 == 0) {
                            this.f30068c1.animate().setListener(null).cancel();
                            if (this.f30068c1.getVisibility() == 8) {
                                this.f30068c1.setVisibility(0);
                                this.f30068c1.setAlpha(0.0f);
                                if (this.Z1 == 1) {
                                    this.f30068c1.setScaleX(0.7f);
                                    this.f30068c1.setScaleY(0.7f);
                                }
                            }
                            this.f30068c1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.f30068c1.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.f30068c1.animate().alpha(0.0f);
                            if (this.Z1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new fd0(this, 8)).start();
                        }
                    }
                } else {
                    this.A2 = i10;
                    this.f30068c1.setVisibility(i10);
                    this.f30068c1.setAlpha(1.0f);
                }
                if (this.A1) {
                    if (S0) {
                        i11 = 4;
                    }
                    if (getVisibility() != i11) {
                        setVisibility(i11);
                    }
                    this.W1 = true;
                }
            } else if (this.W1 && getVisibility() != 0) {
                setVisibility(0);
                this.W1 = false;
            }
        }
    }

    public final void L0(boolean z10) {
        dl0 dl0Var;
        int paddingTop;
        s4.c1 T;
        dl0 dl0Var2;
        View view;
        boolean z11;
        int i10;
        s4.c1 T3;
        int b10;
        int S;
        boolean z12;
        int i11;
        int i12;
        if (((this.K1 || z10) && this.f30074f1 != null) || (this.f30111y1 != 0 && this.f30076g1 != null)) {
            s4.o0 layoutManager = getLayoutManager();
            if (layoutManager instanceof s4.c0) {
                s4.c0 c0Var = (s4.c0) layoutManager;
                if (c0Var.f42934o == 1) {
                    if (this.f30076g1 != null) {
                        if (this.f30111y1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i13 = this.f30111y1;
                        int i14 = Integer.MAX_VALUE;
                        if (i13 != 1 && i13 != 3) {
                            if (i13 == 2) {
                                this.f30089n1 = 0.0f;
                                if (this.f30076g1.h() != 0) {
                                    int childCount = getChildCount();
                                    View view2 = null;
                                    int i15 = Integer.MAX_VALUE;
                                    View view3 = null;
                                    int i16 = 0;
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        View childAt = getChildAt(i17);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f30107w1 + paddingTop) {
                                            if (bottom < i14) {
                                                view3 = childAt;
                                                i14 = bottom;
                                            }
                                            i16 = Math.max(i16, bottom);
                                            if (bottom >= AndroidUtilities.dp(32.0f) + this.f30107w1 + paddingTop && bottom < i15) {
                                                view2 = childAt;
                                                i15 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T3 = T(view3)) != null && (S = this.f30076g1.S((b10 = T3.b()))) >= 0) {
                                        if (this.f30099s1 != S || this.f30097r1 == null) {
                                            View view4 = this.f30097r1;
                                            if (view4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            View T4 = this.f30076g1.T(S, view4);
                                            if (z12) {
                                                T0(T4, false);
                                            }
                                            this.f30097r1 = T4;
                                            T4.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f30097r1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f30097r1.getMeasuredHeight());
                                            this.f30099s1 = S;
                                        }
                                        if (this.f30097r1 != null && view2 != null && view2.getClass() != this.f30097r1.getClass()) {
                                            this.f30089n1 = 1.0f;
                                        }
                                        int M = this.f30076g1.M(S);
                                        int Q = this.f30076g1.Q(b10);
                                        if (i16 != 0 && i16 < getMeasuredHeight() - getPaddingBottom()) {
                                            i11 = -paddingTop;
                                        } else {
                                            i11 = this.f30107w1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f30097r1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f30107w1);
                                            if (height2 < height) {
                                                i12 = height2 - height;
                                            } else {
                                                i12 = paddingTop;
                                            }
                                            if (i12 < 0) {
                                                this.f30097r1.setTag(Integer.valueOf(paddingTop + i11 + i12));
                                            } else {
                                                this.f30097r1.setTag(Integer.valueOf(paddingTop + i11));
                                            }
                                        } else {
                                            this.f30097r1.setTag(Integer.valueOf(paddingTop + i11));
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
                        int i18 = Integer.MAX_VALUE;
                        View view6 = null;
                        int i19 = 0;
                        for (int i20 = 0; i20 < childCount2; i20++) {
                            View childAt2 = getChildAt(i20);
                            int bottom2 = childAt2.getBottom();
                            if (bottom2 > this.f30107w1 + paddingTop) {
                                if (bottom2 < i14) {
                                    i14 = bottom2;
                                    view6 = childAt2;
                                }
                                i19 = Math.max(i19, bottom2);
                                if (bottom2 >= AndroidUtilities.dp(32.0f) + this.f30107w1 + paddingTop && bottom2 < i18) {
                                    i18 = bottom2;
                                }
                            }
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(c0Var.N0() - b11) + 1;
                            if ((this.K1 || z10) && (dl0Var2 = this.f30074f1) != null && !dl0Var2.f23647n && (getAdapter() instanceof el0)) {
                                this.f30074f1.setProgress(Math.min(1.0f, b11 / ((this.f30076g1.h() - abs) + 1)));
                            }
                            this.f30095q1.addAll(this.f30093p1);
                            this.f30093p1.clear();
                            if (this.f30076g1.h() != 0) {
                                if (this.f30099s1 != b11 || this.f30101t1 != abs) {
                                    this.f30099s1 = b11;
                                    this.f30101t1 = abs;
                                    this.f30105v1 = 1;
                                    int S3 = this.f30076g1.S(b11);
                                    this.f30103u1 = S3;
                                    int M2 = (this.f30076g1.M(S3) + b11) - this.f30076g1.Q(b11);
                                    while (M2 < b11 + abs) {
                                        M2 += this.f30076g1.M(this.f30103u1 + this.f30105v1);
                                        this.f30105v1++;
                                    }
                                }
                                if (this.f30111y1 != 3) {
                                    int i21 = b11;
                                    for (int i22 = this.f30103u1; i22 < this.f30103u1 + this.f30105v1; i22++) {
                                        if (!this.f30095q1.isEmpty()) {
                                            view = (View) this.f30095q1.get(0);
                                            this.f30095q1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        View T5 = this.f30076g1.T(i22, view);
                                        if (z11) {
                                            T0(T5, false);
                                        }
                                        this.f30093p1.add(T5);
                                        int M3 = this.f30076g1.M(i22);
                                        if (i22 == this.f30103u1) {
                                            int Q3 = this.f30076g1.Q(i21);
                                            if (Q3 == M3 - 1) {
                                                T5.setTag(Integer.valueOf((-T5.getHeight()) + paddingTop));
                                            } else if (Q3 == M3 - 2) {
                                                View childAt3 = getChildAt(i21 - b11);
                                                if (childAt3 != null) {
                                                    i10 = childAt3.getTop() + paddingTop;
                                                } else {
                                                    i10 = -AndroidUtilities.dp(100.0f);
                                                }
                                                T5.setTag(Integer.valueOf(Math.min(i10, 0)));
                                            } else {
                                                T5.setTag(0);
                                            }
                                            i21 = (M3 - this.f30076g1.Q(b11)) + i21;
                                        } else {
                                            View childAt4 = getChildAt(i21 - b11);
                                            if (childAt4 != null) {
                                                T5.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                            } else {
                                                T5.setTag(Integer.valueOf(-AndroidUtilities.dp(100.0f)));
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
                        if ((this.K1 || z10) && (dl0Var = this.f30074f1) != null && !dl0Var.f23647n) {
                            s4.h0 adapter = getAdapter();
                            if (adapter instanceof el0) {
                                el0 el0Var = (el0) adapter;
                                float H = el0Var.H(this);
                                this.f30074f1.setIsVisible(el0Var.E(this));
                                this.f30074f1.setProgress(Math.min(1.0f, H));
                                this.f30074f1.a(false);
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
        int[] iArr = this.f30088m2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f7, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.ni niVar = this.f30079h2;
            int[] iArr2 = this.f30088m2;
            org.telegram.ui.wn wnVar = niVar.d;
            iArr2[0] = (int) wnVar.f39625s9;
            iArr2[1] = wnVar.Aa;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.f30077g2;
                if (i11 != S) {
                    int i12 = this.f30075f2;
                    if (i11 <= i12 && S <= i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.wn wnVar2 = this.f30079h2.d;
                    org.telegram.ui.jm jmVar = wnVar2.A0;
                    ArrayList arrayList = wnVar2.f39647u6;
                    int i13 = S - jmVar.J;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) wnVar2.f39686x6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            if (z10) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf(arrayList2.get(size)) + wnVar2.A0.J;
                        }
                    }
                    if (z10) {
                        int i14 = this.f30077g2;
                        if (S > i14) {
                            if (!this.f30079h2.f35877a) {
                                for (int i15 = i14 + 1; i15 <= S; i15++) {
                                    if (i15 != this.f30075f2 && this.f30079h2.a(i15)) {
                                        this.f30079h2.b(i15, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i14 > S) {
                                if (i14 != this.f30075f2 && this.f30079h2.a(i14)) {
                                    this.f30079h2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        }
                    } else {
                        int i16 = this.f30077g2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.f30075f2 && this.f30079h2.a(i16)) {
                                    this.f30079h2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.f30079h2.f35877a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.f30075f2 && this.f30079h2.a(i17)) {
                                    this.f30079h2.b(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f30079h2.f35877a) {
                    this.f30077g2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void N0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (view != null && ((Boolean) this.H2.f25082a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z12 = false;
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                if (U0 != null && ((Boolean) this.H2.f25082a.run(U0)).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (U02 != null && ((Boolean) this.H2.f25082a.run(U02)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(-this.L2, t1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.L2), G0(view)));
            if (z10 && z11) {
                if (t1(view) >= rectF.top) {
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
            Path path = this.P2;
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

    public final void P0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f7;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof v80) {
                f7 = ((v80) view2).getBottomInfoMargin();
            } else {
                f7 = 0.0f;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float left = view.getLeft();
            float f12 = -this.L2;
            float t12 = t1(view);
            if (z10) {
                f10 = this.L2;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(f12, t12 - f10);
            float right = view.getRight();
            float height = getHeight() - (-this.L2);
            float G0 = G0(view2);
            if (z11) {
                f11 = this.L2;
            }
            rectF.set(left, max, right, Math.min(height, (G0 + f11) - f7));
            if (rectF.bottom >= rectF.top) {
                this.J2.mo17run(canvas, rectF, Float.valueOf(this.L2), Float.valueOf(this.L2), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void Q0(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wl0.Q0(android.graphics.Canvas):void");
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.G1;
        if (!rect.isEmpty() && (zVar = this.D1) != null) {
            int i10 = this.I1;
            if ((i10 == -2 || i10 == this.E1) && this.F1 != null) {
                if (getAdapter() instanceof vl0) {
                    ((vl0) getAdapter()).getClass();
                }
                this.D1.setBounds(this.F1.getLeft(), this.F1.getTop(), this.F1.getRight(), this.F1.getBottom());
            } else {
                zVar.setBounds(rect);
            }
            canvas.save();
            int i11 = this.I1;
            if ((i11 == -2 || i11 == this.E1) && (aVar = this.f30092o2) != null) {
                aVar.accept(canvas);
            }
            int i12 = this.I1;
            if ((i12 == -2 || i12 == this.E1) && (view = this.F1) != null) {
                canvas.translate(view.getX() - rect.left, this.F1.getY() - rect.top);
                this.D1.setAlpha((int) (this.F1.getAlpha() * 255.0f));
            }
            if (b1()) {
                canvas.save();
                N0(canvas, this.F1);
                this.D1.draw(canvas);
                canvas.restore();
            } else {
                this.D1.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean S0() {
        if (getAdapter() != null && !this.X1 && getAdapter().h() == 0) {
            return true;
        }
        return false;
    }

    public final void T0(View view, boolean z10) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z10) {
                return;
            }
            int i10 = this.f30111y1;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
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
        boolean z11;
        boolean z12;
        if (view.getParent() == this && b1() && ((Boolean) this.H2.f25082a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z13 = true;
            if (R == -1) {
                z12 = false;
                z11 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                if (U0 != null && ((Boolean) this.H2.f25082a.run(U0)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (U02 != null && ((Boolean) this.H2.f25082a.run(U02)).booleanValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            RectF rectF = new RectF();
            rectF.set(view.getX(), Math.max(0.0f, t1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
            if (z11 && z12 && !z10) {
                if (t1(view) >= rectF.top) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (G0(view) > rectF.bottom) {
                    z13 = false;
                }
                if (z11 && z13) {
                    return org.telegram.ui.ActionBar.h6.b0(0, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045d6, this.f30094p2));
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
            return new cl0(this, view, path, rectF);
        }
        return null;
    }

    public Integer W0(int i10) {
        GenericProvider genericProvider = this.f30108w2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint X0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30094p2;
        if (d6Var != null) {
            paint = d6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.h6.S0(str);
    }

    public final boolean Y0(int i10, View view) {
        int R;
        if (view != null && i10 <= 0 && getAdapter() != null && this.I2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.I2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Z0() {
        ot[] otVarArr;
        for (ot otVar : this.E2.f27417a) {
            if (otVar != null && otVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i10, View view) {
        int R;
        if (view != null && i10 >= getChildCount() - 1 && getAdapter() != null && this.I2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().h() - 1) {
            return ((Boolean) this.I2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
        }
        return false;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            aVar.f417a = true;
        } else if (Z0() && getOverScrollMode() != 2) {
            aVar.f417a = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i10 = 0; i10 < itemDecorationCount; i10++) {
                s4.n0 X = X(i10);
                if ((X instanceof bh.a) && (X != this.H2 || this.G2)) {
                    ((bh.a) X).b(aVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                float x10 = childAt.getX();
                float y3 = childAt.getY();
                if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                    aVar.getClass();
                    ah.e.a(aVar, childAt);
                }
            }
        }
    }

    public final boolean b1() {
        if (this.H2 != null) {
            return true;
        }
        return false;
    }

    public final void c1() {
        if (!this.f30080i1) {
            this.f30080i1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.f30068c1;
            if (view != null && view.getVisibility() != 8) {
                this.f30068c1.setVisibility(8);
            }
        }
    }

    @Override
    public final boolean canScrollVertically(int i10) {
        if (this.T1 && super.canScrollVertically(i10)) {
            return true;
        }
        return false;
    }

    public final void d1(boolean z10) {
        View view = this.N1;
        if (view != null) {
            h1(view, 0.0f, 0.0f, false);
            this.N1 = null;
            if (z10) {
                k1(null, view);
            }
        }
        if (!z10) {
            this.D1.setState(StateSet.NOTHING);
            this.G1.setEmpty();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f7;
        bl0 bl0Var = this.f30090n2;
        if (bl0Var != null) {
            wl0 wl0Var = bl0Var.f23013a;
            if (bl0Var.d || bl0Var.e) {
                for (int i10 = 0; i10 < wl0Var.getChildCount(); i10++) {
                    View childAt = wl0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !bl0Var.f23015c.contains(childAt)) {
                        Float f10 = (Float) bl0Var.f23014b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                bl0Var.d = false;
            }
        }
        if (this.U0 && this.B1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.U0 && !this.B1) {
            R0(canvas);
        }
        ai.f0 f0Var = this.f30070d1;
        if (f0Var != null) {
            f0Var.draw(canvas);
        }
        if (!this.f30113z1) {
            int i11 = this.f30111y1;
            float f11 = 0.0f;
            if (i11 == 1) {
                if (this.f30076g1 != null && !this.f30093p1.isEmpty()) {
                    for (int i12 = 0; i12 < this.f30093p1.size(); i12++) {
                        View view2 = (View) this.f30093p1.get(i12);
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
            } else if (i11 == 2 && this.f30076g1 != null && (view = this.f30097r1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f30097r1.getTag()).intValue();
                if (LocaleController.isRTL) {
                    f11 = getWidth() - this.f30097r1.getWidth();
                }
                canvas.translate(f11, intValue2);
                Drawable drawable = this.l1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f30097r1.getMeasuredHeight(), getWidth(), this.l1.getIntrinsicHeight() + this.f30097r1.getMeasuredHeight());
                    this.l1.setAlpha((int) (this.f30087m1 * 255.0f));
                    this.l1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.f30091o1);
                    this.f30091o1 = elapsedRealtime;
                    float f12 = this.f30087m1;
                    float f13 = this.f30089n1;
                    if (f12 < f13) {
                        float f14 = (((float) min) / 180.0f) + f12;
                        this.f30087m1 = f14;
                        if (f14 > f13) {
                            this.f30087m1 = f13;
                        }
                        invalidate();
                    } else if (f12 > f13) {
                        float f15 = f12 - (((float) min) / 180.0f);
                        this.f30087m1 = f15;
                        if (f15 < f13) {
                            this.f30087m1 = f13;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f30097r1.getMeasuredHeight());
                this.f30097r1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f30112y2 == 0 && this.f30114z2) {
                setOverScrollMode(0);
            }
            this.f30112y2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.f30112y2 - 1;
            this.f30112y2 = i10;
            if (i10 == 0 && this.f30114z2) {
                setOverScrollMode(2);
            }
        }
        dl0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.f23632a0 && fastScroll.f23645k0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f30076g1 != null && (view = this.f30097r1) != null && view.getAlpha() != 0.0f && this.f30097r1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (b1() && !this.B2) {
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
        v1();
    }

    public final void e1(hl0 hl0Var, int i10, boolean z10) {
        ic0 ic0Var = this.V1;
        if (ic0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ic0Var);
            this.V1 = null;
        }
        s4.c1 K = K(hl0Var.run());
        if (K != null) {
            View view = K.f42946a;
            int c10 = K.c();
            this.f30110x2 = c10;
            i1(c10, view);
            org.telegram.ui.Cells.z zVar = this.D1;
            if (zVar != null) {
                Drawable current = zVar.getCurrent();
                if (current instanceof TransitionDrawable) {
                    if (this.X0 == null && this.W0 == null) {
                        ((TransitionDrawable) current).resetTransition();
                    } else {
                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                    }
                }
                this.D1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
            }
            org.telegram.ui.Cells.z zVar2 = this.D1;
            if (zVar2 != null && zVar2.isStateful() && this.D1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.D1);
            }
            if (i10 > 0) {
                this.U1 = null;
                ic0 ic0Var2 = new ic0(this, 20);
                this.V1 = ic0Var2;
                AndroidUtilities.runOnUIThread(ic0Var2, i10);
            }
        } else if (z10) {
            this.U1 = hl0Var;
        }
    }

    public void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Z0() && getOverScrollMode() != 2) {
            if (this.F2 == null) {
                this.F2 = new Matrix();
            }
            canvas.save();
            if (getMatrix().invert(this.F2)) {
                canvas.concat(this.F2);
            }
            canvas.translate(-getX(), -getY());
            try {
                super.drawChild(canvas, this, uptimeMillis);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
            canvas.restore();
            return;
        }
        J0(canvas, rectF, uptimeMillis);
    }

    @Override
    public final void f0(View view) {
        if (getAdapter() instanceof vl0) {
            s4.c1 G = G(view);
            if (G != null) {
                view.setEnabled(((vl0) getAdapter()).D(G));
                if (this.f30096q2) {
                    view.setAccessibilityDelegate(this.f30098r2);
                    return;
                }
                return;
            }
            return;
        }
        view.setEnabled(false);
        view.setAccessibilityDelegate(null);
    }

    public void f1() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.x5) {
                ((org.telegram.ui.ActionBar.x5) childAt).e();
            }
            childAt.invalidate();
        }
    }

    public final boolean g1(int i10) {
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

    public View getEmptyView() {
        return this.f30068c1;
    }

    public dl0 getFastScroll() {
        return this.f30074f1;
    }

    public ArrayList<View> getHeaders() {
        return this.f30093p1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f30095q1;
    }

    public kl0 getOnItemClickListener() {
        return this.V0;
    }

    public s4.s0 getOnScrollListener() {
        return this.f30065a1;
    }

    public View getPinnedHeader() {
        return this.f30097r1;
    }

    public View getPressedChildView() {
        return this.N1;
    }

    public Drawable getSelectorDrawable() {
        return this.D1;
    }

    public Rect getSelectorRect() {
        return this.G1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public void h1(View view, float f7, float f10, boolean z10) {
        if (!this.f30082j1 && view != null) {
            view.setPressed(z10);
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void i1(int i10, View view) {
        boolean z10;
        int i11;
        int i12;
        ic0 ic0Var = this.V1;
        if (ic0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ic0Var);
            this.V1 = null;
            this.U1 = null;
        }
        if (this.D1 != null) {
            if (i10 != this.E1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getAdapter() instanceof vl0) {
                ((vl0) getAdapter()).getClass();
            }
            if (i10 != -1) {
                this.E1 = i10;
            }
            this.F1 = view;
            if (this.C1 == 8) {
                org.telegram.ui.ActionBar.h6.A1(this.D1, this.a2, 0);
            } else if (this.f30067b2 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.z zVar = this.D1;
                if (i10 == 0) {
                    i11 = this.f30067b2;
                } else {
                    i11 = 0;
                }
                if (i10 == getAdapter().h() - 2) {
                    i12 = this.f30067b2;
                } else {
                    i12 = 0;
                }
                org.telegram.ui.ActionBar.h6.A1(zVar, i11, i12);
            }
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            Rect rect = this.G1;
            rect.set(left, top, right, bottom);
            boolean isEnabled = view.isEnabled();
            if (this.H1 != isEnabled) {
                this.H1 = isEnabled;
            }
            if (z10) {
                this.D1.setVisible(false, false);
                this.D1.setState(StateSet.NOTHING);
            }
            setListSelectorColor(W0(i10));
            this.D1.setBounds(rect);
            if (z10 && getVisibility() == 0) {
                this.D1.setVisible(true, false);
            }
        }
    }

    public final void j1() {
        int i10;
        ic0 ic0Var = this.V1;
        if (ic0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ic0Var);
            this.V1.run();
            this.V1 = null;
            this.F1 = null;
            return;
        }
        this.V1 = null;
        this.U1 = null;
        View view = this.F1;
        if (view != null && (i10 = this.f30110x2) != -1) {
            i1(i10, view);
            org.telegram.ui.Cells.z zVar = this.D1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.D1);
            }
            this.F1 = null;
            this.f30110x2 = -1;
            return;
        }
        org.telegram.ui.Cells.z zVar2 = this.D1;
        if (zVar2 != null) {
            Drawable current = zVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.z zVar3 = this.D1;
        if (zVar3 != null && zVar3.isStateful() && this.D1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.D1);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.D1;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    public final void k1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.G1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    i1(this.O1, view);
                    org.telegram.ui.Cells.z zVar = this.D1;
                    if (zVar != null) {
                        Drawable current = zVar.getCurrent();
                        if (current instanceof TransitionDrawable) {
                            ((TransitionDrawable) current).resetTransition();
                        }
                        if (motionEvent != null) {
                            this.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                    }
                } else {
                    rect.setEmpty();
                }
                v1();
            }
        }
    }

    public final void l1(wl0 wl0Var, boolean z10) {
        ViewParent parent;
        if (wl0Var != null && (parent = wl0Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void m1(int i10, boolean z10) {
        this.Y1 = z10;
        this.Z1 = i10;
    }

    public final void n1(nl0 nl0Var, long j3) {
        boolean z10;
        this.Y0 = nl0Var;
        ka.c cVar = this.M1;
        if (nl0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l20 l20Var = (l20) cVar.f13552b;
        l20Var.f26002t = z10;
        l20Var.f26003u = j3;
    }

    public final void o1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.C2 = true;
        setPadding(i10, i11, i12, i13);
        this.C2 = false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dl0 dl0Var = this.f30074f1;
        if (dl0Var != null && dl0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f30074f1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f30074f1);
            }
            ((ViewGroup) getParent()).addView(this.f30074f1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E1 = -1;
        this.F1 = null;
        this.G1.setEmpty();
        bl0 bl0Var = this.f30090n2;
        if (bl0Var != null) {
            bl0Var.a();
        }
        if (this.f30106v2) {
            this.f30106v2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.Q1) {
                l1(this, true);
            }
            if (this.f30066b1 != null) {
                int i10 = org.telegram.ui.wn.Gc;
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
        dl0 dl0Var = this.f30074f1;
        if (dl0Var != null) {
            this.J1 = true;
            if (dl0Var.f23631a) {
                i14 = getPaddingTop();
            } else {
                i14 = dl0Var.f23642h0;
            }
            int i15 = i11 + i14;
            dl0 dl0Var2 = this.f30074f1;
            if (dl0Var2.f23641g0) {
                dl0Var2.layout(0, i15, dl0Var2.getMeasuredWidth(), this.f30074f1.getMeasuredHeight() + i15);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f30074f1.getMeasuredWidth();
                dl0 dl0Var3 = this.f30074f1;
                dl0Var3.layout(measuredWidth, i15, dl0Var3.getMeasuredWidth() + measuredWidth, this.f30074f1.getMeasuredHeight() + i15);
            }
            this.J1 = false;
        }
        L0(false);
        hl0 hl0Var = this.U1;
        if (hl0Var != null) {
            e1(hl0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        dl0 dl0Var = this.f30074f1;
        if (dl0Var != null && dl0Var.getLayoutParams() != null) {
            dl0 dl0Var2 = this.f30074f1;
            if (dl0Var2.f23631a) {
                i12 = getPaddingTop();
            } else {
                i12 = dl0Var2.f23642h0;
            }
            int measuredHeight = (getMeasuredHeight() - i12) - getPaddingBottom();
            this.f30074f1.getLayoutParams().height = measuredHeight;
            this.f30074f1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.f30069c2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        ai.f0 f0Var = this.f30070d1;
        if (f0Var != null) {
            f0Var.requestLayout();
        }
        int i14 = this.f30111y1;
        if (i14 == 1) {
            if (this.f30076g1 != null && !this.f30093p1.isEmpty()) {
                for (int i15 = 0; i15 < this.f30093p1.size(); i15++) {
                    T0((View) this.f30093p1.get(i15), true);
                }
            }
        } else if (i14 == 2 && this.f30076g1 != null && (view = this.f30097r1) != null) {
            T0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        dl0 dl0Var = this.f30074f1;
        if (dl0Var != null && dl0Var.f23647n) {
            return false;
        }
        boolean z10 = this.f30071d2;
        org.telegram.ui.Cells.t6 t6Var = this.D2;
        if (z10 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f30085k2 == Float.MAX_VALUE && this.f30086l2 == Float.MAX_VALUE) {
                this.f30085k2 = motionEvent.getX();
                this.f30086l2 = motionEvent.getY();
            }
            if (!this.f30073e2 && Math.abs(motionEvent.getY() - this.f30086l2) > this.f30069c2) {
                this.f30073e2 = true;
                l1(this, true);
            }
            if (this.f30073e2) {
                M0(motionEvent.getX(), motionEvent.getY());
                org.telegram.ui.ni niVar = this.f30079h2;
                int[] iArr = this.f30088m2;
                org.telegram.ui.wn wnVar = niVar.d;
                iArr[0] = (int) wnVar.f39625s9;
                iArr[1] = wnVar.Aa;
                if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.f30088m2[1] && (this.f30077g2 >= this.f30075f2 || !this.f30079h2.f35877a)) {
                    this.f30083j2 = false;
                    if (!this.f30081i2) {
                        this.f30081i2 = true;
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        AndroidUtilities.runOnUIThread(t6Var);
                        return true;
                    }
                } else if (motionEvent.getY() < AndroidUtilities.dp(56.0f) + this.f30088m2[0] && (this.f30077g2 <= this.f30075f2 || !this.f30079h2.f35877a)) {
                    this.f30083j2 = true;
                    if (!this.f30081i2) {
                        this.f30081i2 = true;
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        AndroidUtilities.runOnUIThread(t6Var);
                        return true;
                    }
                } else {
                    this.f30081i2 = false;
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                }
            }
            return true;
        }
        this.f30085k2 = Float.MAX_VALUE;
        this.f30086l2 = Float.MAX_VALUE;
        this.f30071d2 = false;
        this.f30073e2 = false;
        l1(this, false);
        this.f30081i2 = false;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        return super.onTouchEvent(motionEvent);
    }

    public void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void q1(int i10, float f7, boolean z10) {
        r1(new ei.c(5), i10, f7, new nv(this, 16), z10);
    }

    public final void r1(Utilities.CallbackReturn callbackReturn, int i10, float f7, Utilities.Callback5 callback5, boolean z10) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new ci.o5(this, callbackReturn, sparseIntArray, 3), new yi(sparseIntArray, 2));
        s1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f7, callback5, z10);
    }

    @Override
    public void requestLayout() {
        if (!this.X1 && !this.C2) {
            super.requestLayout();
        }
    }

    public final void s1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, Utilities.Callback5 callback5, boolean z10) {
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19152j6, this.f30094p2));
        this.I2 = callbackReturn2;
        this.L2 = f7;
        this.M2 = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.N2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
        this.J2 = callback5;
        s4.n0 n0Var = this.H2;
        if (n0Var != null) {
            p0(n0Var);
        }
        il0 il0Var = new il0(this, callbackReturn, i10, z10);
        this.H2 = il0Var;
        i(il0Var);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f30096q2 = z10;
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        s4.h0 adapter = getAdapter();
        gg.p1 p1Var = this.f30102t2;
        if (adapter != null) {
            adapter.f42995a.unregisterObserver(p1Var);
        }
        ArrayList arrayList = this.f30093p1;
        if (arrayList != null) {
            arrayList.clear();
            this.f30095q1.clear();
        }
        this.f30099s1 = -1;
        this.E1 = -1;
        this.F1 = null;
        this.G1.setEmpty();
        this.f30097r1 = null;
        if (h0Var instanceof sl0) {
            this.f30076g1 = (sl0) h0Var;
        } else {
            this.f30076g1 = null;
        }
        super.setAdapter(h0Var);
        if (h0Var != null) {
            h0Var.B(p1Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f30084k1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f30109x1 = z10;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.G2 = z10;
    }

    public void setDisableHighlightState(boolean z10) {
        this.f30082j1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.Q1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.U0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.B1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.f30068c1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.f30068c1 = view;
            if (this.Y1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f30080i1) {
                View view3 = this.f30068c1;
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

    public void setFastScrollEnabled(int i10) {
        this.f30074f1 = new dl0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f30074f1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        int i10;
        dl0 dl0Var = this.f30074f1;
        if (dl0Var == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        dl0Var.setVisibility(i10);
        this.f30074f1.f23632a0 = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.A1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.R1 = z10;
    }

    @Override
    public void setItemAnimator(s4.m0 m0Var) {
        super.setItemAnimator(m0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.f30108w2 = genericProvider;
    }

    public void setItemsEnterAnimator(bl0 bl0Var) {
        this.f30090n2 = bl0Var;
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i10;
        org.telegram.ui.Cells.z zVar = this.D1;
        if (num == null) {
            if (b1()) {
                i10 = org.telegram.ui.ActionBar.h6.f19152j6;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f19134i6;
            }
            intValue = org.telegram.ui.ActionBar.h6.v0(i10, this.f30094p2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.h6.B1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(jl0 jl0Var) {
        this.f30066b1 = jl0Var;
    }

    public void setOnItemClickListener(kl0 kl0Var) {
        this.V0 = kl0Var;
    }

    public void setOnItemLongClickListener(ml0 ml0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.X0 = ml0Var;
        ka.c cVar = this.M1;
        boolean z10 = ml0Var != null;
        l20 l20Var = (l20) cVar.f13552b;
        l20Var.f26002t = z10;
        l20Var.f26003u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(s4.s0 s0Var) {
        this.f30065a1 = s0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.l1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.f30107w1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f30100s2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.T1 = z10;
    }

    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsType(int i10) {
        this.f30111y1 = i10;
        if (i10 != 1 && i10 != 3) {
            return;
        }
        this.f30093p1 = new ArrayList();
        this.f30095q1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i10) {
        org.telegram.ui.Cells.z zVar = this.D1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i11 = this.C1;
        if (i11 == 8) {
            this.D1 = org.telegram.ui.ActionBar.h6.Y(i10, this.a2, 0);
        } else if (i11 == 9) {
            this.D1 = null;
        } else {
            int i12 = this.f30067b2;
            if (i12 > 0) {
                this.D1 = org.telegram.ui.ActionBar.h6.Y(i10, i12, i12);
            } else {
                int i13 = this.a2;
                if (i13 > 0 && i11 != 1) {
                    this.D1 = org.telegram.ui.ActionBar.h6.i0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.D1 = org.telegram.ui.ActionBar.h6.f0(i10, 2, -1);
                } else {
                    this.D1 = org.telegram.ui.ActionBar.h6.f0(i10, i11, i13);
                }
            }
        }
        org.telegram.ui.Cells.z zVar2 = this.D1;
        if (zVar2 != null) {
            zVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i10) {
        this.a2 = i10;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.f30092o2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.C1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f30113z1 = z10;
    }

    public void setTopBottomSelectorRadius(int i10) {
        this.f30067b2 = i10;
    }

    public void setTranslateSelector(boolean z10) {
        int i10;
        if (z10) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        this.I1 = i10;
    }

    public void setTranslateSelectorPosition(int i10) {
        if (i10 <= 0) {
            i10 = -1;
        }
        this.I1 = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        dl0 dl0Var = this.f30074f1;
        if (dl0Var != null) {
            dl0Var.setTranslationY(f7);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (Q2 != null) {
            super.setVerticalScrollBarEnabled(z10);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            this.W1 = false;
        }
    }

    public boolean u1() {
        return this.G;
    }

    @Override
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (this.Z0) {
            nl0 nl0Var = this.Y0;
            if (nl0Var != null) {
                nl0Var.q(i11);
            }
            iArr[0] = i10;
            iArr[1] = i11;
            return true;
        }
        return super.v(i10, i11, i12, iArr, iArr2);
    }

    public final void v1() {
        org.telegram.ui.Cells.z zVar = this.D1;
        if (zVar != null && zVar.isStateful()) {
            if (this.N1 != null) {
                if (this.D1.setState(getDrawableStateForSelector())) {
                    invalidateDrawable(this.D1);
                }
            } else if (this.V1 == null) {
                this.D1.setState(StateSet.NOTHING);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.D1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public wl0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.U0 = true;
        this.f30084k1 = true;
        this.f30099s1 = -1;
        this.f30101t1 = -1;
        this.f30113z1 = false;
        this.A1 = true;
        this.C1 = 2;
        this.G1 = new Rect();
        this.I1 = -1;
        this.T1 = true;
        this.f30085k2 = Float.MAX_VALUE;
        this.f30086l2 = Float.MAX_VALUE;
        this.f30096q2 = true;
        this.f30098r2 = new qe(1);
        this.f30100s2 = true;
        this.f30102t2 = new gg.p1(this, 1);
        this.D2 = new org.telegram.ui.Cells.t6(this, 20);
        this.P2 = new Path();
        this.f30094p2 = d6Var;
        pt ptVar = new pt();
        this.E2 = ptVar;
        setEdgeEffectFactory(ptVar);
        setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19323s8, d6Var));
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19134i6, d6Var), 2, -1);
        this.D1 = f02;
        f02.setCallback(this);
        try {
            if (!R2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                Q2 = iArr;
                if (iArr == null) {
                    Q2 = new int[0];
                }
                R2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(Q2);
            Method method = S2;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.setOnScrollListener(new ug0(this, 2));
        this.E.add(new rl0(this, context));
    }

    public void setOnItemClickListener(ll0 ll0Var) {
        this.W0 = ll0Var;
    }

    public void setOnItemLongClickListener(nl0 nl0Var) {
        n1(nl0Var, ViewConfiguration.getLongPressTimeout());
    }
}
