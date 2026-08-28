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
public class wk0 extends RecyclerView implements jg.a {
    public static int[] M2;
    public static boolean N2;
    public static final Method O2;
    public static final Paint P2;
    public static final Paint Q2;
    public static final Path R2;
    public static final float[] S2;
    public int A1;
    public final at A2;
    public View B1;
    public Matrix B2;
    public final Rect C1;
    public boolean C2;
    public boolean D1;
    public kk0 D2;
    public int E1;
    public Utilities.CallbackReturn E2;
    public boolean F1;
    public Utilities.Callback5 F2;
    public boolean G1;
    public ArrayList G2;
    public boolean H1;
    public float H2;
    public n5.e0 I1;
    public float[] I2;
    public View J1;
    public float[] J2;
    public int K1;
    public ArrayList K2;
    public boolean L1;
    public final Path L2;
    public boolean M1;
    public boolean N1;
    public qk0 O1;
    public boolean P1;
    public boolean Q0;
    public jk0 Q1;
    public mk0 R0;
    public ib0 R1;
    public nk0 S0;
    public boolean S1;
    public ok0 T0;
    public boolean T1;
    public pk0 U0;
    public boolean U1;
    public boolean V0;
    public int V1;
    public f2.d1 W0;
    public int W1;
    public lk0 X0;
    public int X1;
    public View Y0;
    public int Y1;
    public fh.d2 Z0;
    public boolean Z1;
    public ag.d f34239a1;
    public boolean a2;
    public fk0 f34240b1;
    public int f34241b2;
    public sk0 f34242c1;
    public int f34243c2;
    public boolean f34244d1;
    public org.telegram.ui.ei f34245d2;
    public boolean f34246e1;
    public boolean f34247e2;
    public boolean f34248f1;
    public boolean f34249f2;
    public boolean f34250g1;
    public float f34251g2;
    public Drawable f34252h1;
    public float f34253h2;
    public float f34254i1;
    public int[] f34255i2;
    public float f34256j1;
    public dk0 f34257j2;
    public long f34258k1;
    public q0.a f34259k2;
    public ArrayList l1;
    public final org.telegram.ui.ActionBar.b6 f34260l2;
    public ArrayList f34261m1;
    public boolean f34262m2;
    public View f34263n1;
    public final fe f34264n2;
    public int f34265o1;
    public boolean f34266o2;
    public int f34267p1;
    public final f2.i1 f34268p2;
    public int f34269q1;
    public Paint f34270q2;
    public int f34271r1;
    public boolean f34272r2;
    public int f34273s1;
    public GenericProvider f34274s2;
    public boolean f34275t1;
    public int f34276t2;
    public int f34277u1;
    public int f34278u2;
    public boolean f34279v1;
    public boolean f34280v2;
    public boolean f34281w1;
    public int f34282w2;
    public boolean f34283x1;
    public boolean f34284x2;
    public int f34285y1;
    public boolean f34286y2;
    public org.telegram.ui.Cells.z f34287z1;
    public final m.i3 f34288z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        O2 = method;
        P2 = new Paint(1);
        Q2 = new Paint(1);
        R2 = new Path();
        S2 = new float[8];
    }

    public wk0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        if (view.getTag(R.id.dragging) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static void N0(Canvas canvas, RectF rectF, float f10, float f11, float f12, org.telegram.ui.ActionBar.b6 b6Var) {
        boolean z10 = SharedConfig.shadowsInSections;
        Paint paint = P2;
        Paint paint2 = Q2;
        if (z10) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.f6.l1(f12, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.f6.l1(f12, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(f12, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var)));
        if (f10 == f11) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f10, f10, paint2);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        Path path = R2;
        path.rewind();
        float[] fArr = S2;
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
        this.A2.f26898b.add(new ys(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.Z0 == null) {
            this.Z0 = new fh.d2(this, getContext(), 19);
        }
        this.Z0.addView(clippingImageView, layoutParams);
    }

    @Override
    public final View E(float f10, float f11) {
        float f12;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < 2; i9++) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                if ((!(childAt instanceof org.telegram.ui.Cells.t1) && !(childAt instanceof org.telegram.ui.Cells.w0)) || childAt.getVisibility() != 4) {
                    float f13 = 0.0f;
                    if (i9 == 0) {
                        f12 = childAt.getTranslationX();
                    } else {
                        f12 = 0.0f;
                    }
                    if (i9 == 0) {
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
        ag.d dVar = this.f34239a1;
        if (dVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dVar);
            this.f34239a1 = null;
        }
        View view = this.J1;
        if (view != null) {
            if (z10) {
                h1(view, 0.0f, 0.0f, false);
            }
            this.J1 = null;
            k1(null, view);
        }
        this.C1.setEmpty();
        qk0 qk0Var = this.O1;
        if (qk0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(qk0Var);
            this.O1 = null;
        }
        this.L1 = false;
    }

    public final void J0(boolean z10) {
        int i9;
        if (!this.f34246e1) {
            int i10 = 0;
            if (getAdapter() != null && this.Y0 != null) {
                boolean S0 = S0();
                if (S0) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                if ((this.U1 && SharedConfig.animationsEnabled()) ? false : false) {
                    if (this.f34282w2 != i9) {
                        this.f34282w2 = i9;
                        if (i9 == 0) {
                            this.Y0.animate().setListener(null).cancel();
                            if (this.Y0.getVisibility() == 8) {
                                this.Y0.setVisibility(0);
                                this.Y0.setAlpha(0.0f);
                                if (this.V1 == 1) {
                                    this.Y0.setScaleX(0.7f);
                                    this.Y0.setScaleY(0.7f);
                                }
                            }
                            this.Y0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.Y0.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.Y0.animate().alpha(0.0f);
                            if (this.V1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new r60(this, 13)).start();
                        }
                    }
                } else {
                    this.f34282w2 = i9;
                    this.Y0.setVisibility(i9);
                    this.Y0.setAlpha(1.0f);
                }
                if (this.f34281w1) {
                    if (S0) {
                        i10 = 4;
                    }
                    if (getVisibility() != i10) {
                        setVisibility(i10);
                    }
                    this.S1 = true;
                }
            } else if (this.S1 && getVisibility() != 0) {
                setVisibility(0);
                this.S1 = false;
            }
        }
    }

    public final void K0(boolean z10) {
        fk0 fk0Var;
        int paddingTop;
        f2.q1 T;
        fk0 fk0Var2;
        View view;
        boolean z11;
        int i9;
        f2.q1 T2;
        int b10;
        int S;
        boolean z12;
        int i10;
        int i11;
        if (((this.G1 || z10) && this.f34240b1 != null) || (this.f34277u1 != 0 && this.f34242c1 != null)) {
            f2.z0 layoutManager = getLayoutManager();
            if (layoutManager instanceof f2.m0) {
                f2.m0 m0Var = (f2.m0) layoutManager;
                if (m0Var.f5432o == 1) {
                    if (this.f34242c1 != null) {
                        if (this.f34277u1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i12 = this.f34277u1;
                        int i13 = Integer.MAX_VALUE;
                        if (i12 != 1 && i12 != 3) {
                            if (i12 == 2) {
                                this.f34256j1 = 0.0f;
                                if (this.f34242c1.h() != 0) {
                                    int childCount = getChildCount();
                                    View view2 = null;
                                    int i14 = Integer.MAX_VALUE;
                                    View view3 = null;
                                    int i15 = 0;
                                    for (int i16 = 0; i16 < childCount; i16++) {
                                        View childAt = getChildAt(i16);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f34273s1 + paddingTop) {
                                            if (bottom < i13) {
                                                view3 = childAt;
                                                i13 = bottom;
                                            }
                                            i15 = Math.max(i15, bottom);
                                            if (bottom >= AndroidUtilities.dp(32.0f) + this.f34273s1 + paddingTop && bottom < i14) {
                                                view2 = childAt;
                                                i14 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T2 = T(view3)) != null && (S = this.f34242c1.S((b10 = T2.b()))) >= 0) {
                                        if (this.f34265o1 != S || this.f34263n1 == null) {
                                            View view4 = this.f34263n1;
                                            if (view4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            View T3 = this.f34242c1.T(S, view4);
                                            if (z12) {
                                                T0(T3, false);
                                            }
                                            this.f34263n1 = T3;
                                            T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f34263n1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f34263n1.getMeasuredHeight());
                                            this.f34265o1 = S;
                                        }
                                        if (this.f34263n1 != null && view2 != null && view2.getClass() != this.f34263n1.getClass()) {
                                            this.f34256j1 = 1.0f;
                                        }
                                        int M = this.f34242c1.M(S);
                                        int Q = this.f34242c1.Q(b10);
                                        if (i15 != 0 && i15 < getMeasuredHeight() - getPaddingBottom()) {
                                            i10 = -paddingTop;
                                        } else {
                                            i10 = this.f34273s1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f34263n1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f34273s1);
                                            if (height2 < height) {
                                                i11 = height2 - height;
                                            } else {
                                                i11 = paddingTop;
                                            }
                                            if (i11 < 0) {
                                                this.f34263n1.setTag(Integer.valueOf(paddingTop + i10 + i11));
                                            } else {
                                                this.f34263n1.setTag(Integer.valueOf(paddingTop + i10));
                                            }
                                        } else {
                                            this.f34263n1.setTag(Integer.valueOf(paddingTop + i10));
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
                        int i17 = Integer.MAX_VALUE;
                        View view6 = null;
                        int i18 = 0;
                        for (int i19 = 0; i19 < childCount2; i19++) {
                            View childAt2 = getChildAt(i19);
                            int bottom2 = childAt2.getBottom();
                            if (bottom2 > this.f34273s1 + paddingTop) {
                                if (bottom2 < i13) {
                                    i13 = bottom2;
                                    view6 = childAt2;
                                }
                                i18 = Math.max(i18, bottom2);
                                if (bottom2 >= AndroidUtilities.dp(32.0f) + this.f34273s1 + paddingTop && bottom2 < i17) {
                                    i17 = bottom2;
                                }
                            }
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(m0Var.N0() - b11) + 1;
                            if ((this.G1 || z10) && (fk0Var2 = this.f34240b1) != null && !fk0Var2.f28480n && (getAdapter() instanceof gk0)) {
                                this.f34240b1.setProgress(Math.min(1.0f, b11 / ((this.f34242c1.h() - abs) + 1)));
                            }
                            this.f34261m1.addAll(this.l1);
                            this.l1.clear();
                            if (this.f34242c1.h() != 0) {
                                if (this.f34265o1 != b11 || this.f34267p1 != abs) {
                                    this.f34265o1 = b11;
                                    this.f34267p1 = abs;
                                    this.f34271r1 = 1;
                                    int S3 = this.f34242c1.S(b11);
                                    this.f34269q1 = S3;
                                    int M3 = (this.f34242c1.M(S3) + b11) - this.f34242c1.Q(b11);
                                    while (M3 < b11 + abs) {
                                        M3 += this.f34242c1.M(this.f34269q1 + this.f34271r1);
                                        this.f34271r1++;
                                    }
                                }
                                if (this.f34277u1 != 3) {
                                    int i20 = b11;
                                    for (int i21 = this.f34269q1; i21 < this.f34269q1 + this.f34271r1; i21++) {
                                        if (!this.f34261m1.isEmpty()) {
                                            view = (View) this.f34261m1.get(0);
                                            this.f34261m1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        View T4 = this.f34242c1.T(i21, view);
                                        if (z11) {
                                            T0(T4, false);
                                        }
                                        this.l1.add(T4);
                                        int M4 = this.f34242c1.M(i21);
                                        if (i21 == this.f34269q1) {
                                            int Q3 = this.f34242c1.Q(i20);
                                            if (Q3 == M4 - 1) {
                                                T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                            } else if (Q3 == M4 - 2) {
                                                View childAt3 = getChildAt(i20 - b11);
                                                if (childAt3 != null) {
                                                    i9 = childAt3.getTop() + paddingTop;
                                                } else {
                                                    i9 = -AndroidUtilities.dp(100.0f);
                                                }
                                                T4.setTag(Integer.valueOf(Math.min(i9, 0)));
                                            } else {
                                                T4.setTag(0);
                                            }
                                            i20 = (M4 - this.f34242c1.Q(b11)) + i20;
                                        } else {
                                            View childAt4 = getChildAt(i20 - b11);
                                            if (childAt4 != null) {
                                                T4.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                            } else {
                                                T4.setTag(Integer.valueOf(-AndroidUtilities.dp(100.0f)));
                                            }
                                            i20 += M4;
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
                    int L0 = m0Var.L0();
                    Math.abs(m0Var.N0() - L0);
                    if (L0 != -1) {
                        if ((this.G1 || z10) && (fk0Var = this.f34240b1) != null && !fk0Var.f28480n) {
                            f2.r0 adapter = getAdapter();
                            if (adapter instanceof gk0) {
                                gk0 gk0Var = (gk0) adapter;
                                float H = gk0Var.H(this);
                                this.f34240b1.setIsVisible(gk0Var.E(this));
                                this.f34240b1.setProgress(Math.min(1.0f, H));
                                this.f34240b1.a(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void L0(float f10, float f11) {
        boolean z10;
        MessageObject.GroupedMessages groupedMessages;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.f34255i2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f11, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f10, 0.0f));
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            org.telegram.ui.ei eiVar = this.f34245d2;
            int[] iArr2 = this.f34255i2;
            org.telegram.ui.qn qnVar = eiVar.d;
            iArr2[0] = (int) qnVar.o9;
            iArr2[1] = qnVar.f42123wa;
            View childAt = getChildAt(i9);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i10 = this.f34243c2;
                if (i10 != S) {
                    int i11 = this.f34241b2;
                    if (i10 <= i11 && S <= i11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.qn qnVar2 = this.f34245d2.d;
                    org.telegram.ui.bm bmVar = qnVar2.f42114w0;
                    ArrayList arrayList = qnVar2.f42042q6;
                    int i12 = S - bmVar.F;
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i12);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) qnVar2.f42083t6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            if (z10) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf(arrayList2.get(size)) + qnVar2.f42114w0.F;
                        }
                    }
                    if (z10) {
                        int i13 = this.f34243c2;
                        if (S > i13) {
                            if (!this.f34245d2.f37961a) {
                                for (int i14 = i13 + 1; i14 <= S; i14++) {
                                    if (i14 != this.f34241b2 && this.f34245d2.a(i14)) {
                                        this.f34245d2.b(i14, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i13 > S) {
                                if (i13 != this.f34241b2 && this.f34245d2.a(i13)) {
                                    this.f34245d2.b(i13, false, min2, min);
                                }
                                i13--;
                            }
                        }
                    } else {
                        int i15 = this.f34243c2;
                        if (S > i15) {
                            while (i15 < S) {
                                if (i15 != this.f34241b2 && this.f34245d2.a(i15)) {
                                    this.f34245d2.b(i15, false, min2, min);
                                }
                                i15++;
                            }
                        } else if (!this.f34245d2.f37961a) {
                            for (int i16 = i15 - 1; i16 >= S; i16--) {
                                if (i16 != this.f34241b2 && this.f34245d2.a(i16)) {
                                    this.f34245d2.b(i16, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f34245d2.f37961a) {
                    this.f34243c2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void M0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (view != null && ((Boolean) this.D2.f30190a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z12 = false;
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                if (U0 != null && ((Boolean) this.D2.f30190a.run(U0)).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (U02 != null && ((Boolean) this.D2.f30190a.run(U02)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(-this.H2, t1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.H2), G0(view)));
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
            Path path = this.L2;
            if (!z10 && !z11) {
                path.rewind();
                float f10 = this.H2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z10) {
                path.rewind();
                path.addRoundRect(rectF, this.I2, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.J2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void O0(Canvas canvas, int i9, int i10, int i11, int i12, int i13) {
        if (i10 >= i9 && i9 >= 0 && i10 >= 0) {
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt = getChildAt(i16);
                if (childAt != null) {
                    int R = RecyclerView.R(childAt);
                    int top = childAt.getTop();
                    if (R >= i9 && R <= i10) {
                        i14 = Math.min(top, i14);
                        i15 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i15);
                    }
                }
            }
            if (i14 < i15) {
                if (this.f34270q2 == null) {
                    this.f34270q2 = new Paint(1);
                }
                this.f34270q2.setColor(i11);
                canvas.drawRect(0.0f, i14 - i12, getWidth(), i15 + i13, this.f34270q2);
            }
        }
    }

    public final void P0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f10;
        float f11;
        if (view != null && view2 != null) {
            float f12 = 0.0f;
            if (view2 instanceof t70) {
                f10 = ((t70) view2).getBottomInfoMargin();
            } else {
                f10 = 0.0f;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float left = view.getLeft();
            float f13 = -this.H2;
            float t12 = t1(view);
            if (z10) {
                f11 = this.H2;
            } else {
                f11 = 0.0f;
            }
            float max = Math.max(f13, t12 - f11);
            float right = view.getRight();
            float height = getHeight() - (-this.H2);
            float G0 = G0(view2);
            if (z11) {
                f12 = this.H2;
            }
            rectF.set(left, max, right, Math.min(height, (G0 + f12) - f10));
            if (rectF.bottom >= rectF.top) {
                this.F2.mo18run(canvas, rectF, Float.valueOf(this.H2), Float.valueOf(this.H2), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void Q0(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wk0.Q0(android.graphics.Canvas):void");
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.C1;
        if (!rect.isEmpty() && (zVar = this.f34287z1) != null) {
            int i9 = this.E1;
            if ((i9 == -2 || i9 == this.A1) && this.B1 != null) {
                if (getAdapter() instanceof vk0) {
                    ((vk0) getAdapter()).getClass();
                }
                this.f34287z1.setBounds(this.B1.getLeft(), this.B1.getTop(), this.B1.getRight(), this.B1.getBottom());
            } else {
                zVar.setBounds(rect);
            }
            canvas.save();
            int i10 = this.E1;
            if ((i10 == -2 || i10 == this.A1) && (aVar = this.f34259k2) != null) {
                aVar.accept(canvas);
            }
            int i11 = this.E1;
            if ((i11 == -2 || i11 == this.A1) && (view = this.B1) != null) {
                canvas.translate(view.getX() - rect.left, this.B1.getY() - rect.top);
                this.f34287z1.setAlpha((int) (this.B1.getAlpha() * 255.0f));
            }
            if (b1()) {
                canvas.save();
                M0(canvas, this.B1);
                this.f34287z1.draw(canvas);
                canvas.restore();
            } else {
                this.f34287z1.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean S0() {
        if (getAdapter() != null && !this.T1 && getAdapter().h() == 0) {
            return true;
        }
        return false;
    }

    public final void T0(View view, boolean z10) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z10) {
                return;
            }
            int i9 = this.f34277u1;
            if (i9 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (i9 == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final View U0(int i9) {
        if (i9 != -1) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R == i9) {
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
        if (view.getParent() == this && b1() && ((Boolean) this.D2.f30190a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z13 = true;
            if (R == -1) {
                z12 = false;
                z11 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                if (U0 != null && ((Boolean) this.D2.f30190a.run(U0)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (U02 != null && ((Boolean) this.D2.f30190a.run(U02)).booleanValue()) {
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
                    return org.telegram.ui.ActionBar.f6.b0(0, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, this.f34260l2));
                }
                z12 = z13;
            }
            Path path = new Path();
            if ((!z11 && !z12) || z10) {
                path.rewind();
                float f10 = this.H2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.I2, Path.Direction.CW);
            } else if (!z12) {
                path.rewind();
                path.addRoundRect(rectF, this.J2, Path.Direction.CW);
            }
            return new ek0(this, view, path, rectF);
        }
        return null;
    }

    public Integer W0(int i9) {
        GenericProvider genericProvider = this.f34274s2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i9));
        }
        return null;
    }

    public final Paint X0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.b6 b6Var = this.f34260l2;
        if (b6Var != null) {
            paint = b6Var.O(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    public final boolean Y0(int i9, View view) {
        int R;
        if (view != null && i9 <= 0 && getAdapter() != null && this.E2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.E2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Z0() {
        zs[] zsVarArr;
        for (zs zsVar : this.A2.f26897a) {
            if (zsVar != null && zsVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i9, View view) {
        int R;
        if (view != null && i9 >= getChildCount() - 1 && getAdapter() != null && this.E2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().h() - 1) {
            return ((Boolean) this.E2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
        }
        return false;
    }

    public final boolean b1() {
        if (this.D2 != null) {
            return true;
        }
        return false;
    }

    public final void c1() {
        if (!this.f34246e1) {
            this.f34246e1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.Y0;
            if (view != null && view.getVisibility() != 8) {
                this.Y0.setVisibility(8);
            }
        }
    }

    @Override
    public final boolean canScrollVertically(int i9) {
        if (this.P1 && super.canScrollVertically(i9)) {
            return true;
        }
        return false;
    }

    public final void d1(boolean z10) {
        View view = this.J1;
        if (view != null) {
            h1(view, 0.0f, 0.0f, false);
            this.J1 = null;
            if (z10) {
                k1(null, view);
            }
        }
        if (!z10) {
            this.f34287z1.setState(StateSet.NOTHING);
            this.C1.setEmpty();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f10;
        dk0 dk0Var = this.f34257j2;
        if (dk0Var != null) {
            wk0 wk0Var = dk0Var.f27745a;
            if (dk0Var.d || dk0Var.f27748e) {
                for (int i9 = 0; i9 < wk0Var.getChildCount(); i9++) {
                    View childAt = wk0Var.getChildAt(i9);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !dk0Var.f27747c.contains(childAt)) {
                        Float f11 = (Float) dk0Var.f27746b.get(R, null);
                        if (f11 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f11.floatValue());
                        }
                    }
                }
                dk0Var.d = false;
            }
        }
        if (this.Q0 && this.f34283x1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.Q0 && !this.f34283x1) {
            R0(canvas);
        }
        fh.d2 d2Var = this.Z0;
        if (d2Var != null) {
            d2Var.draw(canvas);
        }
        if (!this.f34279v1) {
            int i10 = this.f34277u1;
            float f12 = 0.0f;
            if (i10 == 1) {
                if (this.f34242c1 != null && !this.l1.isEmpty()) {
                    for (int i11 = 0; i11 < this.l1.size(); i11++) {
                        View view2 = (View) this.l1.get(i11);
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
            } else if (i10 == 2 && this.f34242c1 != null && (view = this.f34263n1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f34263n1.getTag()).intValue();
                if (LocaleController.isRTL) {
                    f12 = getWidth() - this.f34263n1.getWidth();
                }
                canvas.translate(f12, intValue2);
                Drawable drawable = this.f34252h1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f34263n1.getMeasuredHeight(), getWidth(), this.f34252h1.getIntrinsicHeight() + this.f34263n1.getMeasuredHeight());
                    this.f34252h1.setAlpha((int) (this.f34254i1 * 255.0f));
                    this.f34252h1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.f34258k1);
                    this.f34258k1 = elapsedRealtime;
                    float f13 = this.f34254i1;
                    float f14 = this.f34256j1;
                    if (f13 < f14) {
                        float f15 = (((float) min) / 180.0f) + f13;
                        this.f34254i1 = f15;
                        if (f15 > f14) {
                            this.f34254i1 = f14;
                        }
                        invalidate();
                    } else if (f13 > f14) {
                        float f16 = f13 - (((float) min) / 180.0f);
                        this.f34254i1 = f16;
                        if (f16 < f14) {
                            this.f34254i1 = f14;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f34263n1.getMeasuredHeight());
                this.f34263n1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f34278u2 == 0 && this.f34280v2) {
                setOverScrollMode(0);
            }
            this.f34278u2++;
        } else if (action == 1 || action == 3) {
            int i9 = this.f34278u2 - 1;
            this.f34278u2 = i9;
            if (i9 == 0 && this.f34280v2) {
                setOverScrollMode(2);
            }
        }
        fk0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.T && fastScroll.f28475g0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f34242c1 != null && (view = this.f34263n1) != null && view.getAlpha() != 0.0f && this.f34263n1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (b1() && !this.f34284x2) {
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
        v1();
    }

    public void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Z0() && getOverScrollMode() != 2) {
            if (this.B2 == null) {
                this.B2 = new Matrix();
            }
            canvas.save();
            if (getMatrix().invert(this.B2)) {
                canvas.concat(this.B2);
            }
            canvas.translate(-getX(), -getY());
            try {
                super.drawChild(canvas, this, uptimeMillis);
            } catch (Throwable th) {
                FileLog.e(th);
            }
            canvas.restore();
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i9 = 0; i9 < itemDecorationCount; i9++) {
            f2.y0 X = X(i9);
            if ((X instanceof jg.a) && (X != this.D2 || this.C2)) {
                ((jg.a) X).e(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                this.f34284x2 = true;
                drawChild(canvas, childAt, uptimeMillis);
                this.f34284x2 = false;
            }
        }
    }

    public final void e1(jk0 jk0Var, int i9, boolean z10) {
        ib0 ib0Var = this.R1;
        if (ib0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ib0Var);
            this.R1 = null;
        }
        f2.q1 K = K(jk0Var.run());
        if (K != null) {
            View view = K.f5501a;
            int c10 = K.c();
            this.f34276t2 = c10;
            i1(c10, view);
            org.telegram.ui.Cells.z zVar = this.f34287z1;
            if (zVar != null) {
                Drawable current = zVar.getCurrent();
                if (current instanceof TransitionDrawable) {
                    if (this.T0 == null && this.S0 == null) {
                        ((TransitionDrawable) current).resetTransition();
                    } else {
                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                    }
                }
                this.f34287z1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
            }
            org.telegram.ui.Cells.z zVar2 = this.f34287z1;
            if (zVar2 != null && zVar2.isStateful() && this.f34287z1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.f34287z1);
            }
            if (i9 > 0) {
                this.Q1 = null;
                ib0 ib0Var2 = new ib0(this, 19);
                this.R1 = ib0Var2;
                AndroidUtilities.runOnUIThread(ib0Var2, i9);
            }
        } else if (z10) {
            this.Q1 = jk0Var;
        }
    }

    @Override
    public final void f0(View view) {
        if (getAdapter() instanceof vk0) {
            f2.q1 G = G(view);
            if (G != null) {
                view.setEnabled(((vk0) getAdapter()).D(G));
                if (this.f34262m2) {
                    view.setAccessibilityDelegate(this.f34264n2);
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
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof org.telegram.ui.ActionBar.w5) {
                ((org.telegram.ui.ActionBar.w5) childAt).d();
            }
            childAt.invalidate();
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            xVar.f7046b = true;
        } else if (Z0() && getOverScrollMode() != 2) {
            xVar.f7046b = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i9 = 0; i9 < itemDecorationCount; i9++) {
                f2.y0 X = X(i9);
                if ((X instanceof jg.a) && (X != this.D2 || this.C2)) {
                    ((jg.a) X).g(xVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                float x10 = childAt.getX();
                float y10 = childAt.getY();
                if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                    xVar.getClass();
                    android.support.v4.media.session.z.a(xVar, childAt);
                }
            }
        }
    }

    public final boolean g1(int i9) {
        if (this.G2 != null && i9 >= 0) {
            for (int i10 = 0; i10 < this.G2.size(); i10++) {
                long longValue = ((Long) this.G2.get(i10)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                if (i9 >= unpackA && i9 <= unpackB) {
                    return true;
                }
            }
        }
        return false;
    }

    public View getEmptyView() {
        return this.Y0;
    }

    public fk0 getFastScroll() {
        return this.f34240b1;
    }

    public ArrayList<View> getHeaders() {
        return this.l1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f34261m1;
    }

    public mk0 getOnItemClickListener() {
        return this.R0;
    }

    public f2.d1 getOnScrollListener() {
        return this.W0;
    }

    public View getPinnedHeader() {
        return this.f34263n1;
    }

    public View getPressedChildView() {
        return this.J1;
    }

    public Drawable getSelectorDrawable() {
        return this.f34287z1;
    }

    public Rect getSelectorRect() {
        return this.C1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public void h1(View view, float f10, float f11, boolean z10) {
        if (!this.f34248f1 && view != null) {
            view.setPressed(z10);
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void i1(int i9, View view) {
        boolean z10;
        int i10;
        int i11;
        ib0 ib0Var = this.R1;
        if (ib0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ib0Var);
            this.R1 = null;
            this.Q1 = null;
        }
        if (this.f34287z1 != null) {
            if (i9 != this.A1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getAdapter() instanceof vk0) {
                ((vk0) getAdapter()).getClass();
            }
            if (i9 != -1) {
                this.A1 = i9;
            }
            this.B1 = view;
            if (this.f34285y1 == 8) {
                org.telegram.ui.ActionBar.f6.A1(this.f34287z1, this.W1, 0);
            } else if (this.X1 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.z zVar = this.f34287z1;
                if (i9 == 0) {
                    i10 = this.X1;
                } else {
                    i10 = 0;
                }
                if (i9 == getAdapter().h() - 2) {
                    i11 = this.X1;
                } else {
                    i11 = 0;
                }
                org.telegram.ui.ActionBar.f6.A1(zVar, i10, i11);
            }
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            Rect rect = this.C1;
            rect.set(left, top, right, bottom);
            boolean isEnabled = view.isEnabled();
            if (this.D1 != isEnabled) {
                this.D1 = isEnabled;
            }
            if (z10) {
                this.f34287z1.setVisible(false, false);
                this.f34287z1.setState(StateSet.NOTHING);
            }
            setListSelectorColor(W0(i9));
            this.f34287z1.setBounds(rect);
            if (z10 && getVisibility() == 0) {
                this.f34287z1.setVisible(true, false);
            }
        }
    }

    public final void j1() {
        int i9;
        ib0 ib0Var = this.R1;
        if (ib0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ib0Var);
            this.R1.run();
            this.R1 = null;
            this.B1 = null;
            return;
        }
        this.R1 = null;
        this.Q1 = null;
        View view = this.B1;
        if (view != null && (i9 = this.f34276t2) != -1) {
            i1(i9, view);
            org.telegram.ui.Cells.z zVar = this.f34287z1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.f34287z1);
            }
            this.B1 = null;
            this.f34276t2 = -1;
            return;
        }
        org.telegram.ui.Cells.z zVar2 = this.f34287z1;
        if (zVar2 != null) {
            Drawable current = zVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.z zVar3 = this.f34287z1;
        if (zVar3 != null && zVar3.isStateful() && this.f34287z1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.f34287z1);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f34287z1;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    public final void k1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.C1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    i1(this.K1, view);
                    org.telegram.ui.Cells.z zVar = this.f34287z1;
                    if (zVar != null) {
                        Drawable current = zVar.getCurrent();
                        if (current instanceof TransitionDrawable) {
                            ((TransitionDrawable) current).resetTransition();
                        }
                        if (motionEvent != null) {
                            this.f34287z1.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                    }
                } else {
                    rect.setEmpty();
                }
                v1();
            }
        }
    }

    public final void l1(wk0 wk0Var, boolean z10) {
        ViewParent parent;
        if (wk0Var != null && (parent = wk0Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void m1(int i9, boolean z10) {
        this.U1 = z10;
        this.V1 = i9;
    }

    public final void n1(pk0 pk0Var, long j10) {
        boolean z10;
        this.U0 = pk0Var;
        n5.e0 e0Var = this.I1;
        if (pk0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        v10 v10Var = (v10) e0Var.f18488b;
        v10Var.f33224t = z10;
        v10Var.f33225u = j10;
    }

    public final void o1(int i9, int i10, int i11, int i12) {
        if (getPaddingLeft() == i9 && getPaddingTop() == i10 && getPaddingRight() == i11 && getPaddingBottom() == i12) {
            return;
        }
        this.f34286y2 = true;
        setPadding(i9, i10, i11, i12);
        this.f34286y2 = false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fk0 fk0Var = this.f34240b1;
        if (fk0Var != null && fk0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f34240b1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f34240b1);
            }
            ((ViewGroup) getParent()).addView(this.f34240b1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A1 = -1;
        this.B1 = null;
        this.C1.setEmpty();
        dk0 dk0Var = this.f34257j2;
        if (dk0Var != null) {
            dk0Var.a();
        }
        if (this.f34272r2) {
            this.f34272r2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.M1) {
                l1(this, true);
            }
            if (this.X0 != null) {
                int i9 = org.telegram.ui.qn.Dc;
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        fk0 fk0Var = this.f34240b1;
        if (fk0Var != null) {
            this.F1 = true;
            if (fk0Var.f28464a) {
                i13 = getPaddingTop();
            } else {
                i13 = fk0Var.f28470d0;
            }
            int i14 = i10 + i13;
            fk0 fk0Var2 = this.f34240b1;
            if (fk0Var2.f28469c0) {
                fk0Var2.layout(0, i14, fk0Var2.getMeasuredWidth(), this.f34240b1.getMeasuredHeight() + i14);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f34240b1.getMeasuredWidth();
                fk0 fk0Var3 = this.f34240b1;
                fk0Var3.layout(measuredWidth, i14, fk0Var3.getMeasuredWidth() + measuredWidth, this.f34240b1.getMeasuredHeight() + i14);
            }
            this.F1 = false;
        }
        K0(false);
        jk0 jk0Var = this.Q1;
        if (jk0Var != null) {
            e1(jk0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        super.onMeasure(i9, i10);
        fk0 fk0Var = this.f34240b1;
        if (fk0Var != null && fk0Var.getLayoutParams() != null) {
            fk0 fk0Var2 = this.f34240b1;
            if (fk0Var2.f28464a) {
                i11 = getPaddingTop();
            } else {
                i11 = fk0Var2.f28470d0;
            }
            int measuredHeight = (getMeasuredHeight() - i11) - getPaddingBottom();
            this.f34240b1.getLayoutParams().height = measuredHeight;
            this.f34240b1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.Y1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        View view;
        super.onSizeChanged(i9, i10, i11, i12);
        fh.d2 d2Var = this.Z0;
        if (d2Var != null) {
            d2Var.requestLayout();
        }
        int i13 = this.f34277u1;
        if (i13 == 1) {
            if (this.f34242c1 != null && !this.l1.isEmpty()) {
                for (int i14 = 0; i14 < this.l1.size(); i14++) {
                    T0((View) this.l1.get(i14), true);
                }
            }
        } else if (i13 == 2 && this.f34242c1 != null && (view = this.f34263n1) != null) {
            T0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        fk0 fk0Var = this.f34240b1;
        if (fk0Var != null && fk0Var.f28480n) {
            return false;
        }
        boolean z10 = this.Z1;
        m.i3 i3Var = this.f34288z2;
        if (z10 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f34251g2 == Float.MAX_VALUE && this.f34253h2 == Float.MAX_VALUE) {
                this.f34251g2 = motionEvent.getX();
                this.f34253h2 = motionEvent.getY();
            }
            if (!this.a2 && Math.abs(motionEvent.getY() - this.f34253h2) > this.Y1) {
                this.a2 = true;
                l1(this, true);
            }
            if (this.a2) {
                L0(motionEvent.getX(), motionEvent.getY());
                org.telegram.ui.ei eiVar = this.f34245d2;
                int[] iArr = this.f34255i2;
                org.telegram.ui.qn qnVar = eiVar.d;
                iArr[0] = (int) qnVar.o9;
                iArr[1] = qnVar.f42123wa;
                if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.f34255i2[1] && (this.f34243c2 >= this.f34241b2 || !this.f34245d2.f37961a)) {
                    this.f34249f2 = false;
                    if (!this.f34247e2) {
                        this.f34247e2 = true;
                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                        AndroidUtilities.runOnUIThread(i3Var);
                        return true;
                    }
                } else if (motionEvent.getY() < AndroidUtilities.dp(56.0f) + this.f34255i2[0] && (this.f34243c2 <= this.f34241b2 || !this.f34245d2.f37961a)) {
                    this.f34249f2 = true;
                    if (!this.f34247e2) {
                        this.f34247e2 = true;
                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                        AndroidUtilities.runOnUIThread(i3Var);
                        return true;
                    }
                } else {
                    this.f34247e2 = false;
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                }
            }
            return true;
        }
        this.f34251g2 = Float.MAX_VALUE;
        this.f34253h2 = Float.MAX_VALUE;
        this.Z1 = false;
        this.a2 = false;
        l1(this, false);
        this.f34247e2 = false;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        return super.onTouchEvent(motionEvent);
    }

    public void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void q1(int i9, float f10, boolean z10) {
        r1(new mh.c(5), i9, f10, new wu(this, 15), z10);
    }

    public final void r1(Utilities.CallbackReturn callbackReturn, int i9, float f10, Utilities.Callback5 callback5, boolean z10) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new kh.f5(this, callbackReturn, sparseIntArray, 3), new mi(sparseIntArray, 2));
        s1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i9, f10, callback5, z10);
    }

    @Override
    public void requestLayout() {
        if (!this.T1 && !this.f34286y2) {
            super.requestLayout();
        }
    }

    public final void s1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i9, float f10, Utilities.Callback5 callback5, boolean z10) {
        setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23109j6, this.f34260l2));
        this.E2 = callbackReturn2;
        this.H2 = f10;
        this.I2 = new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f};
        this.J2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10};
        this.F2 = callback5;
        f2.y0 y0Var = this.D2;
        if (y0Var != null) {
            p0(y0Var);
        }
        kk0 kk0Var = new kk0(this, callbackReturn, i9, z10);
        this.D2 = kk0Var;
        i(kk0Var);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f34262m2 = z10;
    }

    @Override
    public void setAdapter(f2.r0 r0Var) {
        f2.r0 adapter = getAdapter();
        f2.i1 i1Var = this.f34268p2;
        if (adapter != null) {
            adapter.f5523a.unregisterObserver(i1Var);
        }
        ArrayList arrayList = this.l1;
        if (arrayList != null) {
            arrayList.clear();
            this.f34261m1.clear();
        }
        this.f34265o1 = -1;
        this.A1 = -1;
        this.B1 = null;
        this.C1.setEmpty();
        this.f34263n1 = null;
        if (r0Var instanceof sk0) {
            this.f34242c1 = (sk0) r0Var;
        } else {
            this.f34242c1 = null;
        }
        super.setAdapter(r0Var);
        if (r0Var != null) {
            r0Var.B(i1Var);
        }
        J0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f34250g1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f34275t1 = z10;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.C2 = z10;
    }

    public void setDisableHighlightState(boolean z10) {
        this.f34248f1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.M1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.Q0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.f34283x1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.Y0;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.Y0 = view;
            if (this.U1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f34246e1) {
                View view3 = this.Y0;
                if (view3 != null) {
                    this.f34282w2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.f34282w2 = -1;
            J0(false);
        }
    }

    public void setFastScrollEnabled(int i9) {
        this.f34240b1 = new fk0(this, getContext(), i9);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f34240b1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        int i9;
        fk0 fk0Var = this.f34240b1;
        if (fk0Var == null) {
            return;
        }
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        fk0Var.setVisibility(i9);
        this.f34240b1.T = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.f34281w1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.N1 = z10;
    }

    @Override
    public void setItemAnimator(f2.w0 w0Var) {
        super.setItemAnimator(w0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.f34274s2 = genericProvider;
    }

    public void setItemsEnterAnimator(dk0 dk0Var) {
        this.f34257j2 = dk0Var;
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i9;
        org.telegram.ui.Cells.z zVar = this.f34287z1;
        if (num == null) {
            if (b1()) {
                i9 = org.telegram.ui.ActionBar.f6.f23109j6;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.f23092i6;
            }
            intValue = org.telegram.ui.ActionBar.f6.v0(i9, this.f34260l2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.f6.B1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(lk0 lk0Var) {
        this.X0 = lk0Var;
    }

    public void setOnItemClickListener(mk0 mk0Var) {
        this.R0 = mk0Var;
    }

    public void setOnItemLongClickListener(ok0 ok0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.T0 = ok0Var;
        n5.e0 e0Var = this.I1;
        boolean z10 = ok0Var != null;
        v10 v10Var = (v10) e0Var.f18488b;
        v10Var.f33224t = z10;
        v10Var.f33225u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(f2.d1 d1Var) {
        this.W0 = d1Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.f34252h1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i9) {
        this.f34273s1 = i9;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f34266o2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.P1 = z10;
    }

    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsType(int i9) {
        this.f34277u1 = i9;
        if (i9 != 1 && i9 != 3) {
            return;
        }
        this.l1 = new ArrayList();
        this.f34261m1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i9) {
        org.telegram.ui.Cells.z zVar = this.f34287z1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i10 = this.f34285y1;
        if (i10 == 8) {
            this.f34287z1 = org.telegram.ui.ActionBar.f6.Y(i9, this.W1, 0);
        } else if (i10 == 9) {
            this.f34287z1 = null;
        } else {
            int i11 = this.X1;
            if (i11 > 0) {
                this.f34287z1 = org.telegram.ui.ActionBar.f6.Y(i9, i11, i11);
            } else {
                int i12 = this.W1;
                if (i12 > 0 && i10 != 1) {
                    this.f34287z1 = org.telegram.ui.ActionBar.f6.i0(i12, i12, i12, i12, 0, i9, -16777216);
                } else if (i10 == 2) {
                    this.f34287z1 = org.telegram.ui.ActionBar.f6.f0(i9, 2, -1);
                } else {
                    this.f34287z1 = org.telegram.ui.ActionBar.f6.f0(i9, i10, i12);
                }
            }
        }
        org.telegram.ui.Cells.z zVar2 = this.f34287z1;
        if (zVar2 != null) {
            zVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i9) {
        this.W1 = i9;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.f34259k2 = aVar;
    }

    public void setSelectorType(int i9) {
        this.f34285y1 = i9;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f34279v1 = z10;
    }

    public void setTopBottomSelectorRadius(int i9) {
        this.X1 = i9;
    }

    public void setTranslateSelector(boolean z10) {
        int i9;
        if (z10) {
            i9 = -2;
        } else {
            i9 = -1;
        }
        this.E1 = i9;
    }

    public void setTranslateSelectorPosition(int i9) {
        if (i9 <= 0) {
            i9 = -1;
        }
        this.E1 = i9;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        fk0 fk0Var = this.f34240b1;
        if (fk0Var != null) {
            fk0Var.setTranslationY(f10);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (M2 != null) {
            super.setVerticalScrollBarEnabled(z10);
        }
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 != 0) {
            this.S1 = false;
        }
    }

    public boolean u1() {
        return this.C;
    }

    @Override
    public final boolean v(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        if (this.V0) {
            pk0 pk0Var = this.U0;
            if (pk0Var != null) {
                pk0Var.u(i10);
            }
            iArr[0] = i9;
            iArr[1] = i10;
            return true;
        }
        return super.v(i9, i10, i11, iArr, iArr2);
    }

    public final void v1() {
        org.telegram.ui.Cells.z zVar = this.f34287z1;
        if (zVar != null && zVar.isStateful()) {
            if (this.J1 != null) {
                if (this.f34287z1.setState(getDrawableStateForSelector())) {
                    invalidateDrawable(this.f34287z1);
                }
            } else if (this.R1 == null) {
                this.f34287z1.setState(StateSet.NOTHING);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f34287z1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public wk0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.Q0 = true;
        this.f34250g1 = true;
        this.f34265o1 = -1;
        this.f34267p1 = -1;
        this.f34279v1 = false;
        this.f34281w1 = true;
        this.f34285y1 = 2;
        this.C1 = new Rect();
        this.E1 = -1;
        this.P1 = true;
        this.f34251g2 = Float.MAX_VALUE;
        this.f34253h2 = Float.MAX_VALUE;
        this.f34262m2 = true;
        this.f34264n2 = new fe(1);
        this.f34266o2 = true;
        this.f34268p2 = new f2.i1(this, 2);
        this.f34288z2 = new m.i3(this, 26);
        this.L2 = new Path();
        this.f34260l2 = b6Var;
        at atVar = new at();
        this.A2 = atVar;
        setEdgeEffectFactory(atVar);
        setGlowColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23269s8, b6Var));
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 2, -1);
        this.f34287z1 = f02;
        f02.setCallback(this);
        try {
            if (!N2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                M2 = iArr;
                if (iArr == null) {
                    M2 = new int[0];
                }
                N2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(M2);
            Method method = O2;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        super.setOnScrollListener(new kn(this, 9));
        this.A.add(new f2.a0(this, context));
    }

    public void setOnItemClickListener(nk0 nk0Var) {
        this.S0 = nk0Var;
    }

    public void setOnItemLongClickListener(pk0 pk0Var) {
        n1(pk0Var, ViewConfiguration.getLongPressTimeout());
    }
}
