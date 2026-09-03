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
public class rl0 extends RecyclerView implements og.a {
    public static int[] N2;
    public static boolean O2;
    public static final Method P2;
    public static final Paint Q2;
    public static final Paint R2;
    public static final Path S2;
    public static final float[] T2;
    public org.telegram.ui.Cells.z A1;
    public final m2.b A2;
    public int B1;
    public final jt B2;
    public View C1;
    public Matrix C2;
    public final Rect D1;
    public boolean D2;
    public boolean E1;
    public fl0 E2;
    public int F1;
    public Utilities.CallbackReturn F2;
    public boolean G1;
    public Utilities.Callback5 G2;
    public boolean H1;
    public ArrayList H2;
    public boolean I1;
    public float I2;
    public o2.i J1;
    public float[] J2;
    public View K1;
    public float[] K2;
    public int L1;
    public ArrayList L2;
    public boolean M1;
    public final Path M2;
    public boolean N1;
    public boolean O1;
    public ll0 P1;
    public boolean Q1;
    public boolean R0;
    public el0 R1;
    public hl0 S0;
    public dc0 S1;
    public il0 T0;
    public boolean T1;
    public jl0 U0;
    public boolean U1;
    public kl0 V0;
    public boolean V1;
    public boolean W0;
    public int W1;
    public f2.z0 X0;
    public int X1;
    public gl0 Y0;
    public int Y1;
    public View Z0;
    public int Z1;
    public dg.u2 f28488a1;
    public boolean a2;
    public fg.d f28489b1;
    public boolean f28490b2;
    public al0 f28491c1;
    public int f28492c2;
    public nl0 f28493d1;
    public int f28494d2;
    public boolean f28495e1;
    public org.telegram.ui.oi f28496e2;
    public boolean f28497f1;
    public boolean f28498f2;
    public boolean f28499g1;
    public boolean f28500g2;
    public boolean f28501h1;
    public float f28502h2;
    public Drawable f28503i1;
    public float f28504i2;
    public float f28505j1;
    public int[] f28506j2;
    public float f28507k1;
    public yk0 f28508k2;
    public long l1;
    public q0.a f28509l2;
    public ArrayList f28510m1;
    public final org.telegram.ui.ActionBar.f6 f28511m2;
    public ArrayList f28512n1;
    public boolean f28513n2;
    public View f28514o1;
    public final fe f28515o2;
    public int f28516p1;
    public boolean f28517p2;
    public int f28518q1;
    public final f2.d1 f28519q2;
    public int f28520r1;
    public Paint f28521r2;
    public int f28522s1;
    public boolean f28523s2;
    public int f28524t1;
    public GenericProvider f28525t2;
    public boolean f28526u1;
    public int f28527u2;
    public int f28528v1;
    public int f28529v2;
    public boolean f28530w1;
    public boolean f28531w2;
    public boolean f28532x1;
    public int f28533x2;
    public boolean f28534y1;
    public boolean f28535y2;
    public int f28536z1;
    public boolean f28537z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        P2 = method;
        Q2 = new Paint(1);
        R2 = new Paint(1);
        S2 = new Path();
        T2 = new float[8];
    }

    public rl0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        if (view.getTag(R.id.dragging) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static void N0(Canvas canvas, RectF rectF, float f10, float f11, float f12, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean z4 = SharedConfig.shadowsInSections;
        Paint paint = Q2;
        Paint paint2 = R2;
        if (z4) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.j6.l1(f12, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.j6.l1(f12, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(f12, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var)));
        if (f10 == f11) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f10, f10, paint2);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        Path path = S2;
        path.rewind();
        float[] fArr = T2;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[7] = f11;
        fArr[6] = f11;
        fArr[5] = f11;
        fArr[4] = f11;
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

    public static float s1(View view) {
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
        this.B2.f26051b.add(new gt(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.f28488a1 == null) {
            this.f28488a1 = new dg.u2(this, getContext(), 22);
        }
        this.f28488a1.addView(clippingImageView, layoutParams);
    }

    @Override
    public final View E(float f10, float f11) {
        float f12;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                if ((!(childAt instanceof org.telegram.ui.Cells.s1) && !(childAt instanceof org.telegram.ui.Cells.v0)) || childAt.getVisibility() != 4) {
                    float f13 = 0.0f;
                    if (i10 == 0) {
                        f12 = childAt.getTranslationX();
                    } else {
                        f12 = 0.0f;
                    }
                    if (i10 == 0) {
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

    public final void I0(boolean z4) {
        fg.d dVar = this.f28489b1;
        if (dVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dVar);
            this.f28489b1 = null;
        }
        View view = this.K1;
        if (view != null) {
            if (z4) {
                g1(view, 0.0f, 0.0f, false);
            }
            this.K1 = null;
            j1(null, view);
        }
        this.D1.setEmpty();
        ll0 ll0Var = this.P1;
        if (ll0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ll0Var);
            this.P1 = null;
        }
        this.M1 = false;
    }

    public final void J0(boolean z4) {
        int i10;
        if (!this.f28497f1) {
            int i11 = 0;
            if (getAdapter() != null && this.Z0 != null) {
                boolean R0 = R0();
                if (R0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if ((this.V1 && SharedConfig.animationsEnabled()) ? false : false) {
                    if (this.f28533x2 != i10) {
                        this.f28533x2 = i10;
                        if (i10 == 0) {
                            this.Z0.animate().setListener(null).cancel();
                            if (this.Z0.getVisibility() == 8) {
                                this.Z0.setVisibility(0);
                                this.Z0.setAlpha(0.0f);
                                if (this.W1 == 1) {
                                    this.Z0.setScaleX(0.7f);
                                    this.Z0.setScaleY(0.7f);
                                }
                            }
                            this.Z0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.Z0.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.Z0.animate().alpha(0.0f);
                            if (this.W1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new od0(this, 6)).start();
                        }
                    }
                } else {
                    this.f28533x2 = i10;
                    this.Z0.setVisibility(i10);
                    this.Z0.setAlpha(1.0f);
                }
                if (this.f28532x1) {
                    if (R0) {
                        i11 = 4;
                    }
                    if (getVisibility() != i11) {
                        setVisibility(i11);
                    }
                    this.T1 = true;
                }
            } else if (this.T1 && getVisibility() != 0) {
                setVisibility(0);
                this.T1 = false;
            }
        }
    }

    public final void K0(boolean z4) {
        al0 al0Var;
        int paddingTop;
        f2.l1 T;
        al0 al0Var2;
        View view;
        boolean z10;
        int i10;
        f2.l1 T3;
        int b10;
        int S;
        boolean z11;
        int i11;
        int i12;
        if (((this.H1 || z4) && this.f28491c1 != null) || (this.f28528v1 != 0 && this.f28493d1 != null)) {
            f2.v0 layoutManager = getLayoutManager();
            if (layoutManager instanceof f2.i0) {
                f2.i0 i0Var = (f2.i0) layoutManager;
                if (i0Var.f5720o == 1) {
                    if (this.f28493d1 != null) {
                        if (this.f28528v1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i13 = this.f28528v1;
                        int i14 = Integer.MAX_VALUE;
                        if (i13 != 1 && i13 != 3) {
                            if (i13 == 2) {
                                this.f28507k1 = 0.0f;
                                if (this.f28493d1.h() != 0) {
                                    int childCount = getChildCount();
                                    View view2 = null;
                                    int i15 = Integer.MAX_VALUE;
                                    View view3 = null;
                                    int i16 = 0;
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        View childAt = getChildAt(i17);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f28524t1 + paddingTop) {
                                            if (bottom < i14) {
                                                view3 = childAt;
                                                i14 = bottom;
                                            }
                                            i16 = Math.max(i16, bottom);
                                            if (bottom >= AndroidUtilities.dp(32.0f) + this.f28524t1 + paddingTop && bottom < i15) {
                                                view2 = childAt;
                                                i15 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T3 = T(view3)) != null && (S = this.f28493d1.S((b10 = T3.b()))) >= 0) {
                                        if (this.f28516p1 != S || this.f28514o1 == null) {
                                            View view4 = this.f28514o1;
                                            if (view4 == null) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            View T4 = this.f28493d1.T(S, view4);
                                            if (z11) {
                                                S0(T4, false);
                                            }
                                            this.f28514o1 = T4;
                                            T4.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f28514o1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f28514o1.getMeasuredHeight());
                                            this.f28516p1 = S;
                                        }
                                        if (this.f28514o1 != null && view2 != null && view2.getClass() != this.f28514o1.getClass()) {
                                            this.f28507k1 = 1.0f;
                                        }
                                        int M = this.f28493d1.M(S);
                                        int Q = this.f28493d1.Q(b10);
                                        if (i16 != 0 && i16 < getMeasuredHeight() - getPaddingBottom()) {
                                            i11 = -paddingTop;
                                        } else {
                                            i11 = this.f28524t1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f28514o1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f28524t1);
                                            if (height2 < height) {
                                                i12 = height2 - height;
                                            } else {
                                                i12 = paddingTop;
                                            }
                                            if (i12 < 0) {
                                                this.f28514o1.setTag(Integer.valueOf(paddingTop + i11 + i12));
                                            } else {
                                                this.f28514o1.setTag(Integer.valueOf(paddingTop + i11));
                                            }
                                        } else {
                                            this.f28514o1.setTag(Integer.valueOf(paddingTop + i11));
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
                            if (bottom2 > this.f28524t1 + paddingTop) {
                                if (bottom2 < i14) {
                                    i14 = bottom2;
                                    view6 = childAt2;
                                }
                                i19 = Math.max(i19, bottom2);
                                if (bottom2 >= AndroidUtilities.dp(32.0f) + this.f28524t1 + paddingTop && bottom2 < i18) {
                                    i18 = bottom2;
                                }
                            }
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(i0Var.N0() - b11) + 1;
                            if ((this.H1 || z4) && (al0Var2 = this.f28491c1) != null && !al0Var2.f23446n && (getAdapter() instanceof bl0)) {
                                this.f28491c1.setProgress(Math.min(1.0f, b11 / ((this.f28493d1.h() - abs) + 1)));
                            }
                            this.f28512n1.addAll(this.f28510m1);
                            this.f28510m1.clear();
                            if (this.f28493d1.h() != 0) {
                                if (this.f28516p1 != b11 || this.f28518q1 != abs) {
                                    this.f28516p1 = b11;
                                    this.f28518q1 = abs;
                                    this.f28522s1 = 1;
                                    int S3 = this.f28493d1.S(b11);
                                    this.f28520r1 = S3;
                                    int M2 = (this.f28493d1.M(S3) + b11) - this.f28493d1.Q(b11);
                                    while (M2 < b11 + abs) {
                                        M2 += this.f28493d1.M(this.f28520r1 + this.f28522s1);
                                        this.f28522s1++;
                                    }
                                }
                                if (this.f28528v1 != 3) {
                                    int i21 = b11;
                                    for (int i22 = this.f28520r1; i22 < this.f28520r1 + this.f28522s1; i22++) {
                                        if (!this.f28512n1.isEmpty()) {
                                            view = (View) this.f28512n1.get(0);
                                            this.f28512n1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        View T5 = this.f28493d1.T(i22, view);
                                        if (z10) {
                                            S0(T5, false);
                                        }
                                        this.f28510m1.add(T5);
                                        int M3 = this.f28493d1.M(i22);
                                        if (i22 == this.f28520r1) {
                                            int Q3 = this.f28493d1.Q(i21);
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
                                            i21 = (M3 - this.f28493d1.Q(b11)) + i21;
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
                    int L0 = i0Var.L0();
                    Math.abs(i0Var.N0() - L0);
                    if (L0 != -1) {
                        if ((this.H1 || z4) && (al0Var = this.f28491c1) != null && !al0Var.f23446n) {
                            f2.o0 adapter = getAdapter();
                            if (adapter instanceof bl0) {
                                bl0 bl0Var = (bl0) adapter;
                                float H = bl0Var.H(this);
                                this.f28491c1.setIsVisible(bl0Var.E(this));
                                this.f28491c1.setProgress(Math.min(1.0f, H));
                                this.f28491c1.a(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void L0(float f10, float f11) {
        boolean z4;
        MessageObject.GroupedMessages groupedMessages;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.f28506j2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f11, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f10, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.oi oiVar = this.f28496e2;
            int[] iArr2 = this.f28506j2;
            org.telegram.ui.zn znVar = oiVar.d;
            iArr2[0] = (int) znVar.f40707p9;
            iArr2[1] = znVar.f40810xa;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.f28494d2;
                if (i11 != S) {
                    int i12 = this.f28492c2;
                    if (i11 <= i12 && S <= i12) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    org.telegram.ui.zn znVar2 = this.f28496e2.d;
                    org.telegram.ui.lm lmVar = znVar2.f40800x0;
                    ArrayList arrayList = znVar2.f40730r6;
                    int i13 = S - lmVar.G;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) znVar2.f40765u6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            if (z4) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf(arrayList2.get(size)) + znVar2.f40800x0.G;
                        }
                    }
                    if (z4) {
                        int i14 = this.f28494d2;
                        if (S > i14) {
                            if (!this.f28496e2.f36821a) {
                                for (int i15 = i14 + 1; i15 <= S; i15++) {
                                    if (i15 != this.f28492c2 && this.f28496e2.a(i15)) {
                                        this.f28496e2.b(i15, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i14 > S) {
                                if (i14 != this.f28492c2 && this.f28496e2.a(i14)) {
                                    this.f28496e2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        }
                    } else {
                        int i16 = this.f28494d2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.f28492c2 && this.f28496e2.a(i16)) {
                                    this.f28496e2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.f28496e2.f36821a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.f28492c2 && this.f28496e2.a(i17)) {
                                    this.f28496e2.b(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f28496e2.f36821a) {
                    this.f28494d2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void M0(Canvas canvas, View view) {
        boolean z4;
        boolean z10;
        if (view != null && ((Boolean) this.E2.f24911a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z11 = false;
            if (R == -1) {
                z10 = false;
                z4 = false;
            } else {
                View T0 = T0(R - 1);
                View T02 = T0(R + 1);
                if (T0 != null && ((Boolean) this.E2.f24911a.run(T0)).booleanValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (T02 != null && ((Boolean) this.E2.f24911a.run(T02)).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(-this.I2, s1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.I2), G0(view)));
            if (z4 && z10) {
                if (s1(view) >= rectF.top) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (G0(view) <= rectF.bottom) {
                    z11 = true;
                }
                if (!z4 || !z11) {
                    z10 = z11;
                } else {
                    return;
                }
            }
            Path path = this.M2;
            if (!z4 && !z10) {
                path.rewind();
                float f10 = this.I2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z4) {
                path.rewind();
                path.addRoundRect(rectF, this.J2, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z10) {
                path.rewind();
                path.addRoundRect(rectF, this.K2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void O0(Canvas canvas, View view, View view2, boolean z4, boolean z10) {
        float f10;
        float f11;
        if (view != null && view2 != null) {
            float f12 = 0.0f;
            if (view2 instanceof m80) {
                f10 = ((m80) view2).getBottomInfoMargin();
            } else {
                f10 = 0.0f;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float left = view.getLeft();
            float f13 = -this.I2;
            float s12 = s1(view);
            if (z4) {
                f11 = this.I2;
            } else {
                f11 = 0.0f;
            }
            float max = Math.max(f13, s12 - f11);
            float right = view.getRight();
            float height = getHeight() - (-this.I2);
            float G0 = G0(view2);
            if (z10) {
                f12 = this.I2;
            }
            rectF.set(left, max, right, Math.min(height, (G0 + f12) - f10));
            if (rectF.bottom >= rectF.top) {
                this.G2.mo27run(canvas, rectF, Float.valueOf(this.I2), Float.valueOf(this.I2), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void P0(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rl0.P0(android.graphics.Canvas):void");
    }

    public final void Q0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.D1;
        if (!rect.isEmpty() && (zVar = this.A1) != null) {
            int i10 = this.F1;
            if ((i10 == -2 || i10 == this.B1) && this.C1 != null) {
                if (getAdapter() instanceof ql0) {
                    ((ql0) getAdapter()).getClass();
                }
                this.A1.setBounds(this.C1.getLeft(), this.C1.getTop(), this.C1.getRight(), this.C1.getBottom());
            } else {
                zVar.setBounds(rect);
            }
            canvas.save();
            int i11 = this.F1;
            if ((i11 == -2 || i11 == this.B1) && (aVar = this.f28509l2) != null) {
                aVar.accept(canvas);
            }
            int i12 = this.F1;
            if ((i12 == -2 || i12 == this.B1) && (view = this.C1) != null) {
                canvas.translate(view.getX() - rect.left, this.C1.getY() - rect.top);
                this.A1.setAlpha((int) (this.C1.getAlpha() * 255.0f));
            }
            if (a1()) {
                canvas.save();
                M0(canvas, this.C1);
                this.A1.draw(canvas);
                canvas.restore();
            } else {
                this.A1.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean R0() {
        if (getAdapter() != null && !this.U1 && getAdapter().h() == 0) {
            return true;
        }
        return false;
    }

    public final void S0(View view, boolean z4) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z4) {
                return;
            }
            int i10 = this.f28528v1;
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
                } catch (Exception e6) {
                    FileLog.e(e6);
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

    public final Drawable U0(View view, boolean z4) {
        boolean z10;
        boolean z11;
        if (view.getParent() == this && a1() && ((Boolean) this.E2.f24911a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z12 = true;
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View T0 = T0(R - 1);
                View T02 = T0(R + 1);
                if (T0 != null && ((Boolean) this.E2.f24911a.run(T0)).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (T02 != null && ((Boolean) this.E2.f24911a.run(T02)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            RectF rectF = new RectF();
            rectF.set(view.getX(), Math.max(0.0f, s1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
            if (z10 && z11 && !z4) {
                if (s1(view) >= rectF.top) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (G0(view) > rectF.bottom) {
                    z12 = false;
                }
                if (z10 && z12) {
                    return org.telegram.ui.ActionBar.j6.b0(0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, this.f28511m2));
                }
                z11 = z12;
            }
            Path path = new Path();
            if ((!z10 && !z11) || z4) {
                path.rewind();
                float f10 = this.I2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            } else if (!z10) {
                path.rewind();
                path.addRoundRect(rectF, this.J2, Path.Direction.CW);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.K2, Path.Direction.CW);
            }
            return new zk0(this, view, path, rectF);
        }
        return null;
    }

    public Integer V0(int i10) {
        GenericProvider genericProvider = this.f28525t2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint W0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.f28511m2;
        if (f6Var != null) {
            paint = f6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    public final boolean X0(int i10, View view) {
        int R;
        if (view != null && i10 <= 0 && getAdapter() != null && this.F2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.F2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Y0() {
        ht[] htVarArr;
        for (ht htVar : this.B2.f26050a) {
            if (htVar != null && htVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z0(int i10, View view) {
        int R;
        if (view != null && i10 >= getChildCount() - 1 && getAdapter() != null && this.F2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().h() - 1) {
            return ((Boolean) this.F2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
        }
        return false;
    }

    public final boolean a1() {
        if (this.E2 != null) {
            return true;
        }
        return false;
    }

    public final void b1() {
        if (!this.f28497f1) {
            this.f28497f1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.Z0;
            if (view != null && view.getVisibility() != 8) {
                this.Z0.setVisibility(8);
            }
        }
    }

    public final void c1(boolean z4) {
        View view = this.K1;
        if (view != null) {
            g1(view, 0.0f, 0.0f, false);
            this.K1 = null;
            if (z4) {
                j1(null, view);
            }
        }
        if (!z4) {
            this.A1.setState(StateSet.NOTHING);
            this.D1.setEmpty();
        }
    }

    @Override
    public final boolean canScrollVertically(int i10) {
        if (this.Q1 && super.canScrollVertically(i10)) {
            return true;
        }
        return false;
    }

    public final void d1(el0 el0Var, int i10, boolean z4) {
        dc0 dc0Var = this.S1;
        if (dc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(dc0Var);
            this.S1 = null;
        }
        f2.l1 K = K(el0Var.run());
        if (K != null) {
            View view = K.f5774a;
            int c3 = K.c();
            this.f28527u2 = c3;
            h1(c3, view);
            org.telegram.ui.Cells.z zVar = this.A1;
            if (zVar != null) {
                Drawable current = zVar.getCurrent();
                if (current instanceof TransitionDrawable) {
                    if (this.U0 == null && this.T0 == null) {
                        ((TransitionDrawable) current).resetTransition();
                    } else {
                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                    }
                }
                this.A1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
            }
            org.telegram.ui.Cells.z zVar2 = this.A1;
            if (zVar2 != null && zVar2.isStateful() && this.A1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.A1);
            }
            if (i10 > 0) {
                this.R1 = null;
                dc0 dc0Var2 = new dc0(this, 19);
                this.S1 = dc0Var2;
                AndroidUtilities.runOnUIThread(dc0Var2, i10);
            }
        } else if (z4) {
            this.R1 = el0Var;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f10;
        yk0 yk0Var = this.f28508k2;
        if (yk0Var != null) {
            rl0 rl0Var = yk0Var.f31045a;
            if (yk0Var.d || yk0Var.e) {
                for (int i10 = 0; i10 < rl0Var.getChildCount(); i10++) {
                    View childAt = rl0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !yk0Var.f31047c.contains(childAt)) {
                        Float f11 = (Float) yk0Var.f31046b.get(R, null);
                        if (f11 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f11.floatValue());
                        }
                    }
                }
                yk0Var.d = false;
            }
        }
        if (this.R0 && this.f28534y1) {
            Q0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.R0 && !this.f28534y1) {
            Q0(canvas);
        }
        dg.u2 u2Var = this.f28488a1;
        if (u2Var != null) {
            u2Var.draw(canvas);
        }
        if (!this.f28530w1) {
            int i11 = this.f28528v1;
            float f12 = 0.0f;
            if (i11 == 1) {
                if (this.f28493d1 != null && !this.f28510m1.isEmpty()) {
                    for (int i12 = 0; i12 < this.f28510m1.size(); i12++) {
                        View view2 = (View) this.f28510m1.get(i12);
                        int save = canvas.save();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        if (LocaleController.isRTL) {
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
            } else if (i11 == 2 && this.f28493d1 != null && (view = this.f28514o1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f28514o1.getTag()).intValue();
                if (LocaleController.isRTL) {
                    f12 = getWidth() - this.f28514o1.getWidth();
                }
                canvas.translate(f12, intValue2);
                Drawable drawable = this.f28503i1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f28514o1.getMeasuredHeight(), getWidth(), this.f28503i1.getIntrinsicHeight() + this.f28514o1.getMeasuredHeight());
                    this.f28503i1.setAlpha((int) (this.f28505j1 * 255.0f));
                    this.f28503i1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.l1);
                    this.l1 = elapsedRealtime;
                    float f13 = this.f28505j1;
                    float f14 = this.f28507k1;
                    if (f13 < f14) {
                        float f15 = (((float) min) / 180.0f) + f13;
                        this.f28505j1 = f15;
                        if (f15 > f14) {
                            this.f28505j1 = f14;
                        }
                        invalidate();
                    } else if (f13 > f14) {
                        float f16 = f13 - (((float) min) / 180.0f);
                        this.f28505j1 = f16;
                        if (f16 < f14) {
                            this.f28505j1 = f14;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f28514o1.getMeasuredHeight());
                this.f28514o1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f28529v2 == 0 && this.f28531w2) {
                setOverScrollMode(0);
            }
            this.f28529v2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.f28529v2 - 1;
            this.f28529v2 = i10;
            if (i10 == 0 && this.f28531w2) {
                setOverScrollMode(2);
            }
        }
        al0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.U && fastScroll.f23441h0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f28493d1 != null && (view = this.f28514o1) != null && view.getAlpha() != 0.0f && this.f28514o1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (a1() && !this.f28535y2) {
            canvas.save();
            M0(canvas, view);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        u1();
    }

    public void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Y0() && getOverScrollMode() != 2) {
            if (this.C2 == null) {
                this.C2 = new Matrix();
            }
            canvas.save();
            if (getMatrix().invert(this.C2)) {
                canvas.concat(this.C2);
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
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            f2.u0 X = X(i10);
            if ((X instanceof og.a) && (X != this.E2 || this.D2)) {
                ((og.a) X).e(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                this.f28535y2 = true;
                drawChild(canvas, childAt, uptimeMillis);
                this.f28535y2 = false;
            }
        }
    }

    public void e1() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.a6) {
                ((org.telegram.ui.ActionBar.a6) childAt).e();
            }
            childAt.invalidate();
        }
    }

    @Override
    public final void f0(View view) {
        if (getAdapter() instanceof ql0) {
            f2.l1 G = G(view);
            if (G != null) {
                view.setEnabled(((ql0) getAdapter()).D(G));
                if (this.f28513n2) {
                    view.setAccessibilityDelegate(this.f28515o2);
                    return;
                }
                return;
            }
            return;
        }
        view.setEnabled(false);
        view.setAccessibilityDelegate(null);
    }

    public final boolean f1(int i10) {
        if (this.H2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.H2.size(); i11++) {
                long longValue = ((Long) this.H2.get(i11)).longValue();
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
    public final void g(g.x xVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            xVar.f6327b = true;
        } else if (Y0() && getOverScrollMode() != 2) {
            xVar.f6327b = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i10 = 0; i10 < itemDecorationCount; i10++) {
                f2.u0 X = X(i10);
                if ((X instanceof og.a) && (X != this.E2 || this.D2)) {
                    ((og.a) X).g(xVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                float x10 = childAt.getX();
                float y10 = childAt.getY();
                if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                    xVar.getClass();
                    android.support.v4.media.session.y.a(xVar, childAt);
                }
            }
        }
    }

    public void g1(View view, float f10, float f11, boolean z4) {
        if (!this.f28499g1 && view != null) {
            view.setPressed(z4);
        }
    }

    public View getEmptyView() {
        return this.Z0;
    }

    public al0 getFastScroll() {
        return this.f28491c1;
    }

    public ArrayList<View> getHeaders() {
        return this.f28510m1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f28512n1;
    }

    public hl0 getOnItemClickListener() {
        return this.S0;
    }

    public f2.z0 getOnScrollListener() {
        return this.X0;
    }

    public View getPinnedHeader() {
        return this.f28514o1;
    }

    public View getPressedChildView() {
        return this.K1;
    }

    public Drawable getSelectorDrawable() {
        return this.A1;
    }

    public Rect getSelectorRect() {
        return this.D1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public final void h1(int i10, View view) {
        boolean z4;
        int i11;
        int i12;
        dc0 dc0Var = this.S1;
        if (dc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(dc0Var);
            this.S1 = null;
            this.R1 = null;
        }
        if (this.A1 != null) {
            if (i10 != this.B1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (getAdapter() instanceof ql0) {
                ((ql0) getAdapter()).getClass();
            }
            if (i10 != -1) {
                this.B1 = i10;
            }
            this.C1 = view;
            if (this.f28536z1 == 8) {
                org.telegram.ui.ActionBar.j6.A1(this.A1, this.X1, 0);
            } else if (this.Y1 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.z zVar = this.A1;
                if (i10 == 0) {
                    i11 = this.Y1;
                } else {
                    i11 = 0;
                }
                if (i10 == getAdapter().h() - 2) {
                    i12 = this.Y1;
                } else {
                    i12 = 0;
                }
                org.telegram.ui.ActionBar.j6.A1(zVar, i11, i12);
            }
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            Rect rect = this.D1;
            rect.set(left, top, right, bottom);
            boolean isEnabled = view.isEnabled();
            if (this.E1 != isEnabled) {
                this.E1 = isEnabled;
            }
            if (z4) {
                this.A1.setVisible(false, false);
                this.A1.setState(StateSet.NOTHING);
            }
            setListSelectorColor(V0(i10));
            this.A1.setBounds(rect);
            if (z4 && getVisibility() == 0) {
                this.A1.setVisible(true, false);
            }
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void i1() {
        int i10;
        dc0 dc0Var = this.S1;
        if (dc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(dc0Var);
            this.S1.run();
            this.S1 = null;
            this.C1 = null;
            return;
        }
        this.S1 = null;
        this.R1 = null;
        View view = this.C1;
        if (view != null && (i10 = this.f28527u2) != -1) {
            h1(i10, view);
            org.telegram.ui.Cells.z zVar = this.A1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.A1);
            }
            this.C1 = null;
            this.f28527u2 = -1;
            return;
        }
        org.telegram.ui.Cells.z zVar2 = this.A1;
        if (zVar2 != null) {
            Drawable current = zVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.z zVar3 = this.A1;
        if (zVar3 != null && zVar3.isStateful() && this.A1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.A1);
        }
    }

    public final void j1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.D1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    h1(this.L1, view);
                    org.telegram.ui.Cells.z zVar = this.A1;
                    if (zVar != null) {
                        Drawable current = zVar.getCurrent();
                        if (current instanceof TransitionDrawable) {
                            ((TransitionDrawable) current).resetTransition();
                        }
                        if (motionEvent != null) {
                            this.A1.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                    }
                } else {
                    rect.setEmpty();
                }
                u1();
            }
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.A1;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    public final void k1(rl0 rl0Var, boolean z4) {
        ViewParent parent;
        if (rl0Var != null && (parent = rl0Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z4);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z4);
        }
    }

    public final void l1(int i10, boolean z4) {
        this.V1 = z4;
        this.W1 = i10;
    }

    public final void m1(kl0 kl0Var, long j10) {
        boolean z4;
        this.V0 = kl0Var;
        o2.i iVar = this.J1;
        if (kl0Var != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        m20 m20Var = (m20) iVar.f16195b;
        m20Var.f26943t = z4;
        m20Var.f26944u = j10;
    }

    public final void n1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.f28537z2 = true;
        setPadding(i10, i11, i12, i13);
        this.f28537z2 = false;
    }

    public void o1() {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        al0 al0Var = this.f28491c1;
        if (al0Var != null && al0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f28491c1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f28491c1);
            }
            ((ViewGroup) getParent()).addView(this.f28491c1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B1 = -1;
        this.C1 = null;
        this.D1.setEmpty();
        yk0 yk0Var = this.f28508k2;
        if (yk0Var != null) {
            yk0Var.a();
        }
        if (this.f28523s2) {
            this.f28523s2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.N1) {
                k1(this, true);
            }
            if (this.Y0 != null) {
                int i10 = org.telegram.ui.zn.Ec;
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
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        al0 al0Var = this.f28491c1;
        if (al0Var != null) {
            this.G1 = true;
            if (al0Var.f23430a) {
                i14 = getPaddingTop();
            } else {
                i14 = al0Var.f23437e0;
            }
            int i15 = i11 + i14;
            al0 al0Var2 = this.f28491c1;
            if (al0Var2.f23436d0) {
                al0Var2.layout(0, i15, al0Var2.getMeasuredWidth(), this.f28491c1.getMeasuredHeight() + i15);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f28491c1.getMeasuredWidth();
                al0 al0Var3 = this.f28491c1;
                al0Var3.layout(measuredWidth, i15, al0Var3.getMeasuredWidth() + measuredWidth, this.f28491c1.getMeasuredHeight() + i15);
            }
            this.G1 = false;
        }
        K0(false);
        el0 el0Var = this.R1;
        if (el0Var != null) {
            d1(el0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        al0 al0Var = this.f28491c1;
        if (al0Var != null && al0Var.getLayoutParams() != null) {
            al0 al0Var2 = this.f28491c1;
            if (al0Var2.f23430a) {
                i12 = getPaddingTop();
            } else {
                i12 = al0Var2.f23437e0;
            }
            int measuredHeight = (getMeasuredHeight() - i12) - getPaddingBottom();
            this.f28491c1.getLayoutParams().height = measuredHeight;
            this.f28491c1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.Z1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        dg.u2 u2Var = this.f28488a1;
        if (u2Var != null) {
            u2Var.requestLayout();
        }
        int i14 = this.f28528v1;
        if (i14 == 1) {
            if (this.f28493d1 != null && !this.f28510m1.isEmpty()) {
                for (int i15 = 0; i15 < this.f28510m1.size(); i15++) {
                    S0((View) this.f28510m1.get(i15), true);
                }
            }
        } else if (i14 == 2 && this.f28493d1 != null && (view = this.f28514o1) != null) {
            S0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        al0 al0Var = this.f28491c1;
        if (al0Var != null && al0Var.f23446n) {
            return false;
        }
        boolean z4 = this.a2;
        m2.b bVar = this.A2;
        if (z4 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f28502h2 == Float.MAX_VALUE && this.f28504i2 == Float.MAX_VALUE) {
                this.f28502h2 = motionEvent.getX();
                this.f28504i2 = motionEvent.getY();
            }
            if (!this.f28490b2 && Math.abs(motionEvent.getY() - this.f28504i2) > this.Z1) {
                this.f28490b2 = true;
                k1(this, true);
            }
            if (this.f28490b2) {
                L0(motionEvent.getX(), motionEvent.getY());
                org.telegram.ui.oi oiVar = this.f28496e2;
                int[] iArr = this.f28506j2;
                org.telegram.ui.zn znVar = oiVar.d;
                iArr[0] = (int) znVar.f40707p9;
                iArr[1] = znVar.f40810xa;
                if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.f28506j2[1] && (this.f28494d2 >= this.f28492c2 || !this.f28496e2.f36821a)) {
                    this.f28500g2 = false;
                    if (!this.f28498f2) {
                        this.f28498f2 = true;
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar);
                        return true;
                    }
                } else if (motionEvent.getY() < AndroidUtilities.dp(56.0f) + this.f28506j2[0] && (this.f28494d2 <= this.f28492c2 || !this.f28496e2.f36821a)) {
                    this.f28500g2 = true;
                    if (!this.f28498f2) {
                        this.f28498f2 = true;
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar);
                        return true;
                    }
                } else {
                    this.f28498f2 = false;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                }
            }
            return true;
        }
        this.f28502h2 = Float.MAX_VALUE;
        this.f28504i2 = Float.MAX_VALUE;
        this.a2 = false;
        this.f28490b2 = false;
        k1(this, false);
        this.f28498f2 = false;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        return super.onTouchEvent(motionEvent);
    }

    public void p1(int i10, float f10, boolean z4) {
        q1(new org.telegram.ui.yh(4), i10, f10, new ev(this, 15), z4);
    }

    public final void q1(Utilities.CallbackReturn callbackReturn, int i10, float f10, Utilities.Callback5 callback5, boolean z4) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new i(this, callbackReturn, sparseIntArray, 2), new ni(sparseIntArray, 2));
        r1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f10, callback5, z4);
    }

    public final void r1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f10, Utilities.Callback5 callback5, boolean z4) {
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19988j6, this.f28511m2));
        this.F2 = callbackReturn2;
        this.I2 = f10;
        this.J2 = new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f};
        this.K2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10};
        this.G2 = callback5;
        f2.u0 u0Var = this.E2;
        if (u0Var != null) {
            p0(u0Var);
        }
        fl0 fl0Var = new fl0(this, callbackReturn, i10, z4);
        this.E2 = fl0Var;
        i(fl0Var);
    }

    @Override
    public void requestLayout() {
        if (!this.U1 && !this.f28537z2) {
            super.requestLayout();
        }
    }

    public void setAccessibilityEnabled(boolean z4) {
        this.f28513n2 = z4;
    }

    @Override
    public void setAdapter(f2.o0 o0Var) {
        f2.o0 adapter = getAdapter();
        f2.d1 d1Var = this.f28519q2;
        if (adapter != null) {
            adapter.f5805a.unregisterObserver(d1Var);
        }
        ArrayList arrayList = this.f28510m1;
        if (arrayList != null) {
            arrayList.clear();
            this.f28512n1.clear();
        }
        this.f28516p1 = -1;
        this.B1 = -1;
        this.C1 = null;
        this.D1.setEmpty();
        this.f28514o1 = null;
        if (o0Var instanceof nl0) {
            this.f28493d1 = (nl0) o0Var;
        } else {
            this.f28493d1 = null;
        }
        super.setAdapter(o0Var);
        if (o0Var != null) {
            o0Var.B(d1Var);
        }
        J0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z4) {
        this.f28501h1 = z4;
    }

    public void setAllowStopHeaveOperations(boolean z4) {
        this.f28526u1 = z4;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z4) {
        this.D2 = z4;
    }

    public void setDisableHighlightState(boolean z4) {
        this.f28499g1 = z4;
    }

    public void setDisallowInterceptTouchEvents(boolean z4) {
        this.N1 = z4;
    }

    public void setDrawSelection(boolean z4) {
        this.R0 = z4;
    }

    public void setDrawSelectorBehind(boolean z4) {
        this.f28534y1 = z4;
    }

    public void setEmptyView(View view) {
        View view2 = this.Z0;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.Z0 = view;
            if (this.V1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f28497f1) {
                View view3 = this.Z0;
                if (view3 != null) {
                    this.f28533x2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.f28533x2 = -1;
            J0(false);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.f28491c1 = new al0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f28491c1);
        }
    }

    public void setFastScrollVisible(boolean z4) {
        int i10;
        al0 al0Var = this.f28491c1;
        if (al0Var == null) {
            return;
        }
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        al0Var.setVisibility(i10);
        this.f28491c1.U = z4;
    }

    public void setHideIfEmpty(boolean z4) {
        this.f28532x1 = z4;
    }

    public void setInstantClick(boolean z4) {
        this.O1 = z4;
    }

    @Override
    public void setItemAnimator(f2.t0 t0Var) {
        super.setItemAnimator(t0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.f28525t2 = genericProvider;
    }

    public void setItemsEnterAnimator(yk0 yk0Var) {
        this.f28508k2 = yk0Var;
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i10;
        org.telegram.ui.Cells.z zVar = this.A1;
        if (num == null) {
            if (a1()) {
                i10 = org.telegram.ui.ActionBar.j6.f19988j6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f19971i6;
            }
            intValue = org.telegram.ui.ActionBar.j6.v0(i10, this.f28511m2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.j6.B1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(gl0 gl0Var) {
        this.Y0 = gl0Var;
    }

    public void setOnItemClickListener(hl0 hl0Var) {
        this.S0 = hl0Var;
    }

    public void setOnItemLongClickListener(jl0 jl0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.U0 = jl0Var;
        o2.i iVar = this.J1;
        boolean z4 = jl0Var != null;
        m20 m20Var = (m20) iVar.f16195b;
        m20Var.f26943t = z4;
        m20Var.f26944u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(f2.z0 z0Var) {
        this.X0 = z0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.f28503i1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.f28524t1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z4) {
        this.f28517p2 = z4;
    }

    public void setScrollEnabled(boolean z4) {
        this.Q1 = z4;
    }

    public void setSections(boolean z4) {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z4);
    }

    public void setSectionsType(int i10) {
        this.f28528v1 = i10;
        if (i10 != 1 && i10 != 3) {
            return;
        }
        this.f28510m1 = new ArrayList();
        this.f28512n1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i10) {
        org.telegram.ui.Cells.z zVar = this.A1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i11 = this.f28536z1;
        if (i11 == 8) {
            this.A1 = org.telegram.ui.ActionBar.j6.Y(i10, this.X1, 0);
        } else if (i11 == 9) {
            this.A1 = null;
        } else {
            int i12 = this.Y1;
            if (i12 > 0) {
                this.A1 = org.telegram.ui.ActionBar.j6.Y(i10, i12, i12);
            } else {
                int i13 = this.X1;
                if (i13 > 0 && i11 != 1) {
                    this.A1 = org.telegram.ui.ActionBar.j6.i0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.A1 = org.telegram.ui.ActionBar.j6.f0(i10, 2, -1);
                } else {
                    this.A1 = org.telegram.ui.ActionBar.j6.f0(i10, i11, i13);
                }
            }
        }
        org.telegram.ui.Cells.z zVar2 = this.A1;
        if (zVar2 != null) {
            zVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i10) {
        this.X1 = i10;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.f28509l2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.f28536z1 = i10;
    }

    public void setSkipDrawSection(boolean z4) {
        this.f28530w1 = z4;
    }

    public void setTopBottomSelectorRadius(int i10) {
        this.Y1 = i10;
    }

    public void setTranslateSelector(boolean z4) {
        int i10;
        if (z4) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        this.F1 = i10;
    }

    public void setTranslateSelectorPosition(int i10) {
        if (i10 <= 0) {
            i10 = -1;
        }
        this.F1 = i10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        al0 al0Var = this.f28491c1;
        if (al0Var != null) {
            al0Var.setTranslationY(f10);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z4) {
        if (N2 != null) {
            super.setVerticalScrollBarEnabled(z4);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            this.T1 = false;
        }
    }

    public boolean t1() {
        return this.D;
    }

    public final void u1() {
        org.telegram.ui.Cells.z zVar = this.A1;
        if (zVar != null && zVar.isStateful()) {
            if (this.K1 != null) {
                if (this.A1.setState(getDrawableStateForSelector())) {
                    invalidateDrawable(this.A1);
                }
            } else if (this.S1 == null) {
                this.A1.setState(StateSet.NOTHING);
            }
        }
    }

    @Override
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (this.W0) {
            kl0 kl0Var = this.V0;
            if (kl0Var != null) {
                kl0Var.p(i11);
            }
            iArr[0] = i10;
            iArr[1] = i11;
            return true;
        }
        return super.v(i10, i11, i12, iArr, iArr2);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.A1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public rl0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.R0 = true;
        this.f28501h1 = true;
        this.f28516p1 = -1;
        this.f28518q1 = -1;
        this.f28530w1 = false;
        this.f28532x1 = true;
        this.f28536z1 = 2;
        this.D1 = new Rect();
        this.F1 = -1;
        this.Q1 = true;
        this.f28502h2 = Float.MAX_VALUE;
        this.f28504i2 = Float.MAX_VALUE;
        this.f28513n2 = true;
        this.f28515o2 = new fe(1);
        this.f28517p2 = true;
        this.f28519q2 = new f2.d1(this, 1);
        this.A2 = new m2.b(this, 28);
        this.M2 = new Path();
        this.f28511m2 = f6Var;
        jt jtVar = new jt();
        this.B2 = jtVar;
        setEdgeEffectFactory(jtVar);
        setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20151s8, f6Var));
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var), 2, -1);
        this.A1 = f02;
        f02.setCallback(this);
        try {
            if (!O2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                N2 = iArr;
                if (iArr == null) {
                    N2 = new int[0];
                }
                O2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(N2);
            Method method = P2;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.setOnScrollListener(new mb0(this, 3));
        this.B.add(new f2.y(this, context));
    }

    public void setOnItemClickListener(il0 il0Var) {
        this.T0 = il0Var;
    }

    public void setOnItemLongClickListener(kl0 kl0Var) {
        m1(kl0Var, ViewConfiguration.getLongPressTimeout());
    }
}
