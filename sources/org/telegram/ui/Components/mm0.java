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
public class mm0 extends RecyclerView implements ch.a {
    public static int[] R2;
    public static boolean S2;
    public static final Method T2;
    public static final Paint U2;
    public static final Paint V2;
    public static final Path W2;
    public static final float[] X2;
    public int A1;
    public boolean A2;
    public org.telegram.ui.Cells.y B1;
    public boolean B2;
    public int C1;
    public final org.telegram.ui.Cells.u5 C2;
    public View D1;
    public final wt D2;
    public final Rect E1;
    public Matrix E2;
    public boolean F1;
    public boolean F2;
    public int G1;
    public yl0 G2;
    public boolean H1;
    public Utilities.CallbackReturn H2;
    public boolean I1;
    public Utilities.Callback5 I2;
    public boolean J1;
    public ArrayList J2;
    public le.b K1;
    public float K2;
    public View L1;
    public float[] L2;
    public int M1;
    public float[] M2;
    public boolean N1;
    public boolean N2;
    public boolean O1;
    public boolean O2;
    public boolean P1;
    public ArrayList P2;
    public fm0 Q1;
    public final Path Q2;
    public boolean R1;
    public boolean S0;
    public xl0 S1;
    public am0 T0;
    public yb0 T1;
    public bm0 U0;
    public boolean U1;
    public cm0 V0;
    public boolean V1;
    public dm0 W0;
    public boolean W1;
    public boolean X0;
    public int X1;
    public s4.r0 Y0;
    public int Y1;
    public zl0 Z0;
    public int Z1;
    public View f28680a1;
    public int a2;
    public ah.x f28681b1;
    public boolean f28682b2;
    public em0 f28683c1;
    public boolean f28684c2;
    public tl0 f28685d1;
    public int f28686d2;
    public im0 f28687e1;
    public int f28688e2;
    public boolean f28689f1;
    public org.telegram.ui.si f28690f2;
    public boolean f28691g1;
    public boolean f28692g2;
    public boolean f28693h1;
    public boolean f28694h2;
    public boolean f28695i1;
    public float f28696i2;
    public Drawable f28697j1;
    public float f28698j2;
    public float f28699k1;
    public int[] f28700k2;
    public float l1;
    public rl0 f28701l2;
    public long f28702m1;
    public q0.a f28703m2;
    public ArrayList f28704n1;
    public final org.telegram.ui.ActionBar.g6 f28705n2;
    public ArrayList f28706o1;
    public boolean f28707o2;
    public View f28708p1;
    public final pe f28709p2;
    public int f28710q1;
    public boolean f28711q2;
    public int f28712r1;
    public final hg.o1 f28713r2;
    public int f28714s1;
    public Paint f28715s2;
    public int f28716t1;
    public boolean f28717t2;
    public int f28718u1;
    public int f28719u2;
    public boolean f28720v1;
    public GenericProvider f28721v2;
    public int f28722w1;
    public int f28723w2;
    public boolean f28724x1;
    public int f28725x2;
    public boolean f28726y1;
    public boolean f28727y2;
    public boolean f28728z1;
    public int f28729z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        T2 = method;
        U2 = new Paint(1);
        V2 = new Paint(1);
        W2 = new Path();
        X2 = new float[8];
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

    public static void P0(Canvas canvas, RectF rectF, float f7, float f10, float f11, org.telegram.ui.ActionBar.g6 g6Var) {
        boolean z10 = SharedConfig.shadowsInSections;
        Paint paint = U2;
        Paint paint2 = V2;
        if (z10) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.k6.o1(f11, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.k6.o1(f11, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.o1(f11, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, g6Var)));
        if (f7 == f10) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f7, f7, paint2);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        Path path = W2;
        path.rewind();
        float[] fArr = X2;
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

    public static float y1(View view) {
        if (view.getTag(R.id.dragging) != null) {
            return view.getTop();
        }
        return view.getY();
    }

    public final void A1() {
        tl0 tl0Var = this.f28685d1;
        if (tl0Var != null) {
            tl0Var.updateColors();
        }
    }

    @Override
    public final void B0() {
        try {
            super.B0();
        } catch (NullPointerException unused) {
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

    public final void C0(Runnable runnable) {
        this.D2.f32346b.add(new tt(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.f28681b1 == null) {
            this.f28681b1 = new ah.x(this, getContext(), 19);
        }
        this.f28681b1.addView(clippingImageView, layoutParams);
    }

    @Override
    public final View E(float f7, float f10) {
        float f11;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                if ((!(childAt instanceof org.telegram.ui.Cells.t1) && !(childAt instanceof org.telegram.ui.Cells.v0)) || childAt.getVisibility() != 4) {
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
        em0 em0Var = this.f28683c1;
        if (em0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(em0Var);
            this.f28683c1 = null;
        }
        View view = this.L1;
        if (view != null) {
            if (z10) {
                j1(view, 0.0f, 0.0f, false);
            }
            this.L1 = null;
            m1(null, view);
        }
        this.E1.setEmpty();
        fm0 fm0Var = this.Q1;
        if (fm0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fm0Var);
            this.Q1 = null;
        }
        this.N1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j10) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            s4.m0 X = X(i10);
            if ((X instanceof ch.a) && (X != this.G2 || this.F2)) {
                ((ch.a) X).f(canvas, rectF);
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
        if (!this.f28691g1) {
            int i11 = 0;
            if (getAdapter() != null && this.f28680a1 != null) {
                boolean T0 = T0();
                if (T0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (!this.W1 || !SharedConfig.animationsEnabled()) {
                    z10 = false;
                }
                if (z10) {
                    if (this.f28729z2 != i10) {
                        this.f28729z2 = i10;
                        if (i10 == 0) {
                            this.f28680a1.animate().setListener(null).cancel();
                            if (this.f28680a1.getVisibility() == 8) {
                                this.f28680a1.setVisibility(0);
                                this.f28680a1.setAlpha(0.0f);
                                if (this.X1 == 1) {
                                    this.f28680a1.setScaleX(0.7f);
                                    this.f28680a1.setScaleY(0.7f);
                                }
                            }
                            this.f28680a1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.f28680a1.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.f28680a1.animate().alpha(0.0f);
                            if (this.X1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new i60(this, 14)).start();
                        }
                    }
                } else {
                    this.f28729z2 = i10;
                    this.f28680a1.setVisibility(i10);
                    this.f28680a1.setAlpha(1.0f);
                }
                if (this.f28726y1) {
                    if (T0) {
                        i11 = 4;
                    }
                    if (getVisibility() != i11) {
                        setVisibility(i11);
                    }
                    this.U1 = true;
                }
            } else if (this.U1 && getVisibility() != 0) {
                setVisibility(0);
                this.U1 = false;
            }
        }
    }

    public final void L0(boolean z10) {
        tl0 tl0Var;
        int paddingTop;
        s4.b1 T;
        tl0 tl0Var2;
        View view;
        boolean z11;
        int i10;
        s4.b1 T3;
        int b10;
        int S;
        boolean z12;
        int i11;
        int i12;
        if (((this.I1 || z10) && this.f28685d1 != null) || (this.f28722w1 != 0 && this.f28687e1 != null)) {
            s4.n0 layoutManager = getLayoutManager();
            if (layoutManager instanceof s4.b0) {
                s4.b0 b0Var = (s4.b0) layoutManager;
                if (b0Var.f46331o == 1) {
                    if (this.f28687e1 != null) {
                        if (this.f28722w1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i13 = this.f28722w1;
                        float f7 = 32.0f;
                        int i14 = Integer.MAX_VALUE;
                        if (i13 != 1 && i13 != 3) {
                            if (i13 == 2) {
                                this.l1 = 0.0f;
                                if (this.f28687e1.h() != 0) {
                                    int childCount = getChildCount();
                                    int i15 = 0;
                                    int i16 = Integer.MAX_VALUE;
                                    View view2 = null;
                                    View view3 = null;
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        View childAt = getChildAt(i17);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f28718u1 + paddingTop) {
                                            if (bottom < i14) {
                                                view3 = childAt;
                                                i14 = bottom;
                                            }
                                            i15 = Math.max(i15, bottom);
                                            if (bottom >= AndroidUtilities.dp(32.0f) + this.f28718u1 + paddingTop && bottom < i16) {
                                                view2 = childAt;
                                                i16 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T3 = T(view3)) != null && (S = this.f28687e1.S((b10 = T3.b()))) >= 0) {
                                        if (this.f28710q1 != S || this.f28708p1 == null) {
                                            View view4 = this.f28708p1;
                                            if (view4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            View T4 = this.f28687e1.T(S, view4);
                                            if (z12) {
                                                U0(T4, false);
                                            }
                                            this.f28708p1 = T4;
                                            T4.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f28708p1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f28708p1.getMeasuredHeight());
                                            this.f28710q1 = S;
                                        }
                                        if (this.f28708p1 != null && view2 != null && view2.getClass() != this.f28708p1.getClass()) {
                                            this.l1 = 1.0f;
                                        }
                                        int M = this.f28687e1.M(S);
                                        int Q = this.f28687e1.Q(b10);
                                        if (i15 != 0 && i15 < getMeasuredHeight() - getPaddingBottom()) {
                                            i11 = -paddingTop;
                                        } else {
                                            i11 = this.f28718u1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f28708p1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f28718u1);
                                            if (height2 < height) {
                                                i12 = height2 - height;
                                            } else {
                                                i12 = paddingTop;
                                            }
                                            if (i12 < 0) {
                                                this.f28708p1.setTag(Integer.valueOf(paddingTop + i11 + i12));
                                            } else {
                                                this.f28708p1.setTag(Integer.valueOf(paddingTop + i11));
                                            }
                                        } else {
                                            this.f28708p1.setTag(Integer.valueOf(paddingTop + i11));
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
                            if (bottom2 > this.f28718u1 + paddingTop) {
                                if (bottom2 < i14) {
                                    i14 = bottom2;
                                    view6 = childAt2;
                                }
                                i19 = Math.max(i19, bottom2);
                                if (bottom2 >= AndroidUtilities.dp(f10) + this.f28718u1 + paddingTop && bottom2 < i20) {
                                    i20 = bottom2;
                                }
                            }
                            i18++;
                            f7 = f10;
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(b0Var.N0() - b11) + 1;
                            if ((this.I1 || z10) && (tl0Var2 = this.f28685d1) != null && !tl0Var2.f30836n && (getAdapter() instanceof ul0)) {
                                this.f28685d1.setProgress(Math.min(1.0f, b11 / ((this.f28687e1.h() - abs) + 1)));
                            }
                            this.f28706o1.addAll(this.f28704n1);
                            this.f28704n1.clear();
                            if (this.f28687e1.h() != 0) {
                                if (this.f28710q1 != b11 || this.f28712r1 != abs) {
                                    this.f28710q1 = b11;
                                    this.f28712r1 = abs;
                                    this.f28716t1 = 1;
                                    int S3 = this.f28687e1.S(b11);
                                    this.f28714s1 = S3;
                                    int M2 = (this.f28687e1.M(S3) + b11) - this.f28687e1.Q(b11);
                                    while (M2 < b11 + abs) {
                                        M2 += this.f28687e1.M(this.f28714s1 + this.f28716t1);
                                        this.f28716t1++;
                                    }
                                }
                                if (this.f28722w1 != 3) {
                                    int i21 = b11;
                                    for (int i22 = this.f28714s1; i22 < this.f28714s1 + this.f28716t1; i22++) {
                                        if (!this.f28706o1.isEmpty()) {
                                            view = (View) this.f28706o1.get(0);
                                            this.f28706o1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        View T5 = this.f28687e1.T(i22, view);
                                        if (z11) {
                                            U0(T5, false);
                                        }
                                        this.f28704n1.add(T5);
                                        int M3 = this.f28687e1.M(i22);
                                        if (i22 == this.f28714s1) {
                                            int Q2 = this.f28687e1.Q(i21);
                                            if (Q2 == M3 - 1) {
                                                T5.setTag(Integer.valueOf((-T5.getHeight()) + paddingTop));
                                            } else if (Q2 == M3 - 2) {
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
                                            i21 = (M3 - this.f28687e1.Q(b11)) + i21;
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
                    int L0 = b0Var.L0();
                    Math.abs(b0Var.N0() - L0);
                    if (L0 != -1) {
                        if ((this.I1 || z10) && (tl0Var = this.f28685d1) != null && !tl0Var.f30836n) {
                            s4.g0 adapter = getAdapter();
                            if (adapter instanceof ul0) {
                                ul0 ul0Var = (ul0) adapter;
                                float H = ul0Var.H(this);
                                this.f28685d1.setIsVisible(ul0Var.E(this));
                                this.f28685d1.setProgress(Math.min(1.0f, H));
                                this.f28685d1.a(false);
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
        int[] iArr = this.f28700k2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f7, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.si siVar = this.f28690f2;
            int[] iArr2 = this.f28700k2;
            org.telegram.ui.sn snVar = siVar.d;
            iArr2[0] = (int) snVar.E9;
            iArr2[1] = snVar.Na;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.f28688e2;
                if (i11 != S) {
                    int i12 = this.f28686d2;
                    if (i11 <= i12 && S <= i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.sn snVar2 = this.f28690f2.d;
                    org.telegram.ui.em emVar = snVar2.A0;
                    ArrayList arrayList = snVar2.G6;
                    int i13 = S - emVar.J;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) snVar2.J6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            if (z10) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf(arrayList2.get(size)) + snVar2.A0.J;
                        }
                    }
                    if (z10) {
                        int i14 = this.f28688e2;
                        if (S > i14) {
                            if (!this.f28690f2.f41422a) {
                                for (int i15 = i14 + 1; i15 <= S; i15++) {
                                    if (i15 != this.f28686d2 && this.f28690f2.a(i15)) {
                                        this.f28690f2.b(i15, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i14 > S) {
                                if (i14 != this.f28686d2 && this.f28690f2.a(i14)) {
                                    this.f28690f2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        }
                    } else {
                        int i16 = this.f28688e2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.f28686d2 && this.f28690f2.a(i16)) {
                                    this.f28690f2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.f28690f2.f41422a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.f28686d2 && this.f28690f2.a(i17)) {
                                    this.f28690f2.b(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f28690f2.f41422a) {
                    this.f28688e2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void N0(Canvas canvas, View view) {
        boolean i12;
        boolean i13;
        if (view != null && x1(view) && ((Boolean) this.G2.f32973a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z10 = false;
            if (R == -1) {
                i13 = false;
                i12 = false;
            } else {
                View V0 = V0(R - 1);
                View V02 = V0(R + 1);
                i12 = i1(V0, true);
                i13 = i1(V02, false);
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(p1(), y1(view)), view.getX() + view.getWidth(), Math.min(o1(), G0(view)));
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
            Path path = this.Q2;
            if (!i12 && !i13) {
                path.rewind();
                float f7 = this.K2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!i12) {
                path.rewind();
                path.addRoundRect(rectF, this.L2, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!i13) {
                path.rewind();
                path.addRoundRect(rectF, this.M2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void O0(Canvas canvas) {
        float f7;
        float height;
        boolean z10 = this.N2;
        if (!z10 && !this.O2) {
            return;
        }
        if (z10) {
            f7 = getSectionsEdgeTop();
        } else {
            f7 = -getHeight();
        }
        float width = getWidth();
        if (this.O2) {
            height = getSectionsEdgeBottom();
        } else {
            height = getHeight() * 2;
        }
        canvas.clipRect(0.0f, f7, width, height);
    }

    public final void Q0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f7;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof f90) {
                f7 = ((f90) view2).getBottomInfoMargin();
            } else {
                f7 = 0.0f;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float left = view.getLeft();
            float p12 = p1();
            float y12 = y1(view);
            if (z10) {
                f10 = this.K2;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(p12, y12 - f10);
            float right = view.getRight();
            float o12 = o1();
            float G0 = G0(view2);
            if (z11) {
                f11 = this.K2;
            }
            rectF.set(left, max, right, Math.min(o12, (G0 + f11) - f7));
            if (rectF.bottom >= rectF.top) {
                this.I2.mo0run(canvas, rectF, Float.valueOf(this.K2), Float.valueOf(this.K2), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void R0(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mm0.R0(android.graphics.Canvas):void");
    }

    public final void S0(Canvas canvas) {
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
            if ((i11 == -2 || i11 == this.C1) && (aVar = this.f28703m2) != null) {
                aVar.accept(canvas);
            }
            int i12 = this.G1;
            if ((i12 == -2 || i12 == this.C1) && (view = this.D1) != null) {
                canvas.translate(view.getX() - rect.left, this.D1.getY() - rect.top);
                this.B1.setAlpha((int) (this.D1.getAlpha() * 255.0f));
            }
            if (c1()) {
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

    public boolean T0() {
        if (getAdapter() != null && !this.V1 && getAdapter().h() == 0) {
            return true;
        }
        return false;
    }

    public final void U0(View view, boolean z10) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z10) {
                return;
            }
            int i10 = this.f28722w1;
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

    public final View V0(int i10) {
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

    public final Drawable W0(View view, boolean z10) {
        boolean i12;
        boolean i13;
        float f7;
        float height;
        if (view.getParent() == this && c1() && ((Boolean) this.G2.f32973a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z11 = true;
            if (R == -1) {
                i13 = false;
                i12 = false;
            } else {
                View V0 = V0(R - 1);
                View V02 = V0(R + 1);
                i12 = i1(V0, true);
                i13 = i1(V02, false);
            }
            RectF rectF = new RectF();
            float x10 = view.getX();
            if (this.N2) {
                f7 = getSectionsEdgeTop();
            } else {
                f7 = 0.0f;
            }
            float max = Math.max(f7, y1(view));
            float x11 = view.getX() + view.getWidth();
            if (this.O2) {
                height = getSectionsEdgeBottom();
            } else {
                height = getHeight();
            }
            rectF.set(x10, max, x11, Math.min(height, G0(view)));
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
                    return org.telegram.ui.ActionBar.k6.c0(0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.f28705n2));
                }
                i13 = z11;
            }
            Path path = new Path();
            if ((!i12 && !i13) || z10) {
                path.rewind();
                float f10 = this.K2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            } else if (!i12) {
                path.rewind();
                path.addRoundRect(rectF, this.L2, Path.Direction.CW);
            } else if (!i13) {
                path.rewind();
                path.addRoundRect(rectF, this.M2, Path.Direction.CW);
            }
            return new sl0(this, view, path, rectF);
        }
        return null;
    }

    public Integer X0(int i10) {
        GenericProvider genericProvider = this.f28721v2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint Y0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.g6 g6Var = this.f28705n2;
        if (g6Var != null) {
            paint = g6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.k6.U0(str);
    }

    public final boolean Z0(int i10, View view) {
        int R;
        if (!this.N2 && view != null && i10 <= 0 && getAdapter() != null && this.H2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.H2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean a1() {
        vt[] vtVarArr;
        for (vt vtVar : this.D2.f32345a) {
            if (vtVar != null && vtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b1(int i10, View view) {
        int R;
        if (!this.O2 && view != null && i10 >= getChildCount() - 1 && getAdapter() != null && this.H2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().h() - 1) {
            return ((Boolean) this.H2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
        }
        return false;
    }

    public final boolean c1() {
        if (this.G2 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canScrollVertically(int i10) {
        if (this.R1 && super.canScrollVertically(i10)) {
            return true;
        }
        return false;
    }

    public final void d1() {
        if (!this.f28691g1) {
            this.f28691g1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.f28680a1;
            if (view != null && view.getVisibility() != 8) {
                this.f28680a1.setVisibility(8);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f7;
        rl0 rl0Var = this.f28701l2;
        if (rl0Var != null) {
            mm0 mm0Var = rl0Var.f30221a;
            if (rl0Var.d || rl0Var.e) {
                for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
                    View childAt = mm0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !rl0Var.f30223c.contains(childAt)) {
                        Float f10 = (Float) rl0Var.f30222b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                rl0Var.d = false;
            }
        }
        if (this.S0 && this.f28728z1) {
            S0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.S0 && !this.f28728z1) {
            S0(canvas);
        }
        ah.x xVar = this.f28681b1;
        if (xVar != null) {
            xVar.draw(canvas);
        }
        if (!this.f28724x1) {
            int i11 = this.f28722w1;
            float f11 = 0.0f;
            if (i11 == 1) {
                if (this.f28687e1 != null && !this.f28704n1.isEmpty()) {
                    for (int i12 = 0; i12 < this.f28704n1.size(); i12++) {
                        View view2 = (View) this.f28704n1.get(i12);
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
            } else if (i11 == 2 && this.f28687e1 != null && (view = this.f28708p1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f28708p1.getTag()).intValue();
                if (LocaleController.isRTL) {
                    f11 = getWidth() - this.f28708p1.getWidth();
                }
                canvas.translate(f11, intValue2);
                Drawable drawable = this.f28697j1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f28708p1.getMeasuredHeight(), getWidth(), this.f28697j1.getIntrinsicHeight() + this.f28708p1.getMeasuredHeight());
                    this.f28697j1.setAlpha((int) (this.f28699k1 * 255.0f));
                    this.f28697j1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.f28702m1);
                    this.f28702m1 = elapsedRealtime;
                    float f12 = this.f28699k1;
                    float f13 = this.l1;
                    if (f12 < f13) {
                        float f14 = (((float) min) / 180.0f) + f12;
                        this.f28699k1 = f14;
                        if (f14 > f13) {
                            this.f28699k1 = f13;
                        }
                        invalidate();
                    } else if (f12 > f13) {
                        float f15 = f12 - (((float) min) / 180.0f);
                        this.f28699k1 = f15;
                        if (f15 < f13) {
                            this.f28699k1 = f13;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f28708p1.getMeasuredHeight());
                this.f28708p1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f28725x2 == 0 && this.f28727y2) {
                setOverScrollMode(0);
            }
            this.f28725x2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.f28725x2 - 1;
            this.f28725x2 = i10;
            if (i10 == 0 && this.f28727y2) {
                setOverScrollMode(2);
            }
        }
        tl0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.f30821a0 && fastScroll.f30835l0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f28687e1 != null && (view = this.f28708p1) != null && view.getAlpha() != 0.0f && this.f28708p1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (c1() && !this.A2) {
            canvas.save();
            if (!(this instanceof org.telegram.ui.u71)) {
                O0(canvas);
            }
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

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            aVar.f4360a = true;
        } else if (a1() && getOverScrollMode() != 2) {
            aVar.f4360a = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i10 = 0; i10 < itemDecorationCount; i10++) {
                s4.m0 X = X(i10);
                if ((X instanceof ch.a) && (X != this.G2 || this.F2)) {
                    ((ch.a) X).e(aVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                float x10 = childAt.getX();
                float y3 = childAt.getY();
                if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                    aVar.getClass();
                    android.support.v4.media.session.x.a(aVar, childAt);
                }
            }
        }
    }

    public final void e1(boolean z10) {
        View view = this.L1;
        if (view != null) {
            j1(view, 0.0f, 0.0f, false);
            this.L1 = null;
            if (z10) {
                m1(null, view);
            }
        }
        if (!z10) {
            this.B1.setState(StateSet.NOTHING);
            this.E1.setEmpty();
        }
    }

    public void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (a1() && getOverScrollMode() != 2) {
            if (this.E2 == null) {
                this.E2 = new Matrix();
            }
            canvas.save();
            if (getMatrix().invert(this.E2)) {
                canvas.concat(this.E2);
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
        if (getAdapter() instanceof lm0) {
            s4.b1 G = G(view);
            if (G != null) {
                view.setEnabled(((lm0) getAdapter()).D(G));
                if (this.f28707o2) {
                    view.setAccessibilityDelegate(this.f28709p2);
                    return;
                }
                return;
            }
            return;
        }
        view.setEnabled(false);
        view.setAccessibilityDelegate(null);
    }

    public final void f1(xl0 xl0Var, int i10, boolean z10) {
        yb0 yb0Var = this.T1;
        if (yb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yb0Var);
            this.T1 = null;
        }
        s4.b1 K = K(xl0Var.run());
        if (K != null) {
            View view = K.f46343a;
            int c10 = K.c();
            this.f28723w2 = c10;
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
                yb0 yb0Var2 = new yb0(this, 20);
                this.T1 = yb0Var2;
                AndroidUtilities.runOnUIThread(yb0Var2, i10);
            }
        } else if (z10) {
            this.S1 = xl0Var;
        }
    }

    public void g1() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.b6) {
                ((org.telegram.ui.ActionBar.b6) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    public View getEmptyView() {
        return this.f28680a1;
    }

    public tl0 getFastScroll() {
        return this.f28685d1;
    }

    public ArrayList<View> getHeaders() {
        return this.f28704n1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f28706o1;
    }

    public am0 getOnItemClickListener() {
        return this.T0;
    }

    public s4.r0 getOnScrollListener() {
        return this.Y0;
    }

    public View getPinnedHeader() {
        return this.f28708p1;
    }

    public View getPressedChildView() {
        return this.L1;
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
        return this.f28719u2;
    }

    public Rect getSelectorRect() {
        return this.E1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public final boolean h1(int i10) {
        if (this.J2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.J2.size(); i11++) {
                long longValue = ((Long) this.J2.get(i11)).longValue();
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
        if (view != null && ((Boolean) this.G2.f32973a.run(view)).booleanValue()) {
            if (z10) {
                if (!this.N2 || G0(view) > p1()) {
                    return true;
                }
                return false;
            } else if (!this.O2 || y1(view) < o1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void j1(View view, float f7, float f10, boolean z10) {
        if (!this.f28693h1 && view != null) {
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
        yb0 yb0Var = this.T1;
        if (yb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yb0Var);
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
                org.telegram.ui.ActionBar.k6.D1(this.B1, this.Y1, 0);
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
                org.telegram.ui.ActionBar.k6.D1(yVar, i11, i12);
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
            setListSelectorColor(X0(i10));
            this.B1.setBounds(rect);
            if (z10 && getVisibility() == 0) {
                this.B1.setVisible(true, false);
            }
        }
    }

    public final void l1() {
        int i10;
        yb0 yb0Var = this.T1;
        if (yb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yb0Var);
            this.T1.run();
            this.T1 = null;
            this.D1 = null;
            return;
        }
        this.T1 = null;
        this.S1 = null;
        View view = this.D1;
        if (view != null && (i10 = this.f28723w2) != -1) {
            k1(i10, view);
            org.telegram.ui.Cells.y yVar = this.B1;
            if (yVar != null) {
                yVar.setState(new int[0]);
                invalidateDrawable(this.B1);
            }
            this.D1 = null;
            this.f28723w2 = -1;
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

    public final void m1(MotionEvent motionEvent, View view) {
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
                B1();
            }
        }
    }

    public final void n1(mm0 mm0Var, boolean z10) {
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

    public final float o1() {
        if (this.O2) {
            return getSectionsEdgeBottom();
        }
        return getHeight() + this.K2;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tl0 tl0Var = this.f28685d1;
        if (tl0Var != null && tl0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f28685d1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f28685d1);
            }
            ((ViewGroup) getParent()).addView(this.f28685d1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        rl0 rl0Var = this.f28701l2;
        if (rl0Var != null) {
            rl0Var.a();
        }
        if (this.f28717t2) {
            this.f28717t2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.O1) {
                n1(this, true);
            }
            if (this.Z0 != null) {
                int i10 = org.telegram.ui.sn.Vc;
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
        tl0 tl0Var = this.f28685d1;
        if (tl0Var != null) {
            this.H1 = true;
            if (tl0Var.f30820a) {
                i14 = getPaddingTop();
            } else {
                i14 = tl0Var.f30831h0;
            }
            int i15 = i11 + i14;
            tl0 tl0Var2 = this.f28685d1;
            if (tl0Var2.f30830g0) {
                tl0Var2.layout(0, i15, tl0Var2.getMeasuredWidth(), this.f28685d1.getMeasuredHeight() + i15);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f28685d1.getMeasuredWidth();
                tl0 tl0Var3 = this.f28685d1;
                tl0Var3.layout(measuredWidth, i15, tl0Var3.getMeasuredWidth() + measuredWidth, this.f28685d1.getMeasuredHeight() + i15);
            }
            this.H1 = false;
        }
        L0(false);
        xl0 xl0Var = this.S1;
        if (xl0Var != null) {
            f1(xl0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        tl0 tl0Var = this.f28685d1;
        if (tl0Var != null && tl0Var.getLayoutParams() != null) {
            tl0 tl0Var2 = this.f28685d1;
            if (tl0Var2.f30820a) {
                i12 = getPaddingTop();
            } else {
                i12 = tl0Var2.f30831h0;
            }
            int measuredHeight = (getMeasuredHeight() - i12) - getPaddingBottom();
            this.f28685d1.getLayoutParams().height = measuredHeight;
            this.f28685d1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.a2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        ah.x xVar = this.f28681b1;
        if (xVar != null) {
            xVar.requestLayout();
        }
        int i14 = this.f28722w1;
        if (i14 == 1) {
            if (this.f28687e1 != null && !this.f28704n1.isEmpty()) {
                for (int i15 = 0; i15 < this.f28704n1.size(); i15++) {
                    U0((View) this.f28704n1.get(i15), true);
                }
            }
        } else if (i14 == 2 && this.f28687e1 != null && (view = this.f28708p1) != null) {
            U0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        tl0 tl0Var = this.f28685d1;
        if (tl0Var != null && tl0Var.f30836n) {
            return false;
        }
        boolean z10 = this.f28682b2;
        org.telegram.ui.Cells.u5 u5Var = this.C2;
        if (z10 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f28696i2 == Float.MAX_VALUE && this.f28698j2 == Float.MAX_VALUE) {
                this.f28696i2 = motionEvent.getX();
                this.f28698j2 = motionEvent.getY();
            }
            if (!this.f28684c2 && Math.abs(motionEvent.getY() - this.f28698j2) > this.a2) {
                this.f28684c2 = true;
                n1(this, true);
            }
            if (this.f28684c2) {
                M0(motionEvent.getX(), motionEvent.getY());
                org.telegram.ui.si siVar = this.f28690f2;
                int[] iArr = this.f28700k2;
                org.telegram.ui.sn snVar = siVar.d;
                iArr[0] = (int) snVar.E9;
                iArr[1] = snVar.Na;
                if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.f28700k2[1] && (this.f28688e2 >= this.f28686d2 || !this.f28690f2.f41422a)) {
                    this.f28694h2 = false;
                    if (!this.f28692g2) {
                        this.f28692g2 = true;
                        AndroidUtilities.cancelRunOnUIThread(u5Var);
                        AndroidUtilities.runOnUIThread(u5Var);
                        return true;
                    }
                } else if (motionEvent.getY() < AndroidUtilities.dp(56.0f) + this.f28700k2[0] && (this.f28688e2 <= this.f28686d2 || !this.f28690f2.f41422a)) {
                    this.f28694h2 = true;
                    if (!this.f28692g2) {
                        this.f28692g2 = true;
                        AndroidUtilities.cancelRunOnUIThread(u5Var);
                        AndroidUtilities.runOnUIThread(u5Var);
                        return true;
                    }
                } else {
                    this.f28692g2 = false;
                    AndroidUtilities.cancelRunOnUIThread(u5Var);
                }
            }
            return true;
        }
        this.f28696i2 = Float.MAX_VALUE;
        this.f28698j2 = Float.MAX_VALUE;
        this.f28682b2 = false;
        this.f28684c2 = false;
        n1(this, false);
        this.f28692g2 = false;
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        return super.onTouchEvent(motionEvent);
    }

    public final float p1() {
        if (this.N2) {
            return getSectionsEdgeTop();
        }
        return -this.K2;
    }

    public final void q1(int i10, boolean z10) {
        this.W1 = z10;
        this.X1 = i10;
    }

    public final void r1(dm0 dm0Var, long j10) {
        boolean z10;
        this.W0 = dm0Var;
        le.b bVar = this.K1;
        if (dm0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t20 t20Var = (t20) bVar.f16072b;
        t20Var.f30617t = z10;
        t20Var.f30618u = j10;
    }

    @Override
    public void requestLayout() {
        if (!this.V1 && !this.B2) {
            super.requestLayout();
        }
    }

    public final void s1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.B2 = true;
        setPadding(i10, i11, i12, i13);
        this.B2 = false;
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f28707o2 = z10;
    }

    @Override
    public void setAdapter(s4.g0 g0Var) {
        s4.g0 adapter = getAdapter();
        hg.o1 o1Var = this.f28713r2;
        if (adapter != null) {
            adapter.f46388a.unregisterObserver(o1Var);
        }
        ArrayList arrayList = this.f28704n1;
        if (arrayList != null) {
            arrayList.clear();
            this.f28706o1.clear();
        }
        this.f28710q1 = -1;
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        this.f28708p1 = null;
        if (g0Var instanceof im0) {
            this.f28687e1 = (im0) g0Var;
        } else {
            this.f28687e1 = null;
        }
        super.setAdapter(g0Var);
        if (g0Var != null) {
            g0Var.B(o1Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f28695i1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f28720v1 = z10;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.F2 = z10;
    }

    public void setDisableHighlightState(boolean z10) {
        this.f28693h1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.O1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.S0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.f28728z1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.f28680a1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.f28680a1 = view;
            if (this.W1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f28691g1) {
                View view3 = this.f28680a1;
                if (view3 != null) {
                    this.f28729z2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.f28729z2 = -1;
            K0(false);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.f28685d1 = new tl0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f28685d1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        int i10;
        tl0 tl0Var = this.f28685d1;
        if (tl0Var == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        tl0Var.setVisibility(i10);
        this.f28685d1.f30821a0 = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.f28726y1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.P1 = z10;
    }

    @Override
    public void setItemAnimator(s4.l0 l0Var) {
        super.setItemAnimator(l0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.f28721v2 = genericProvider;
    }

    public void setItemsEnterAnimator(rl0 rl0Var) {
        this.f28701l2 = rl0Var;
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i10;
        if (num == null) {
            if (c1()) {
                i10 = org.telegram.ui.ActionBar.k6.f21290j6;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21272i6;
            }
            intValue = org.telegram.ui.ActionBar.k6.w0(i10, this.f28705n2);
        } else {
            intValue = num.intValue();
        }
        this.f28719u2 = intValue;
        org.telegram.ui.ActionBar.k6.E1(this.B1, intValue, true);
    }

    public void setOnInterceptTouchListener(zl0 zl0Var) {
        this.Z0 = zl0Var;
    }

    public void setOnItemClickListener(am0 am0Var) {
        this.T0 = am0Var;
    }

    public void setOnItemLongClickListener(cm0 cm0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.V0 = cm0Var;
        le.b bVar = this.K1;
        boolean z10 = cm0Var != null;
        t20 t20Var = (t20) bVar.f16072b;
        t20Var.f30617t = z10;
        t20Var.f30618u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(s4.r0 r0Var) {
        this.Y0 = r0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.f28697j1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.f28718u1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f28711q2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.R1 = z10;
    }

    public void setSections(boolean z10) {
        u1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsRounding(boolean z10) {
        if (this.N2 == z10 && this.O2 == z10) {
            return;
        }
        this.N2 = z10;
        this.O2 = z10;
        invalidate();
    }

    public void setSectionsType(int i10) {
        this.f28722w1 = i10;
        if (i10 != 1 && i10 != 3) {
            return;
        }
        this.f28704n1 = new ArrayList();
        this.f28706o1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i10) {
        this.f28719u2 = i10;
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            yVar.setCallback(null);
        }
        int i11 = this.A1;
        if (i11 == 8) {
            this.B1 = org.telegram.ui.ActionBar.k6.Z(i10, this.Y1, 0);
        } else if (i11 == 9) {
            this.B1 = null;
        } else {
            int i12 = this.Z1;
            if (i12 > 0) {
                this.B1 = org.telegram.ui.ActionBar.k6.Z(i10, i12, i12);
            } else {
                int i13 = this.Y1;
                if (i13 > 0 && i11 != 1) {
                    this.B1 = org.telegram.ui.ActionBar.k6.j0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.B1 = org.telegram.ui.ActionBar.k6.g0(i10, 2, -1);
                } else {
                    this.B1 = org.telegram.ui.ActionBar.k6.g0(i10, i11, i13);
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
        this.f28703m2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.A1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f28724x1 = z10;
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
        tl0 tl0Var = this.f28685d1;
        if (tl0Var != null) {
            tl0Var.setTranslationY(f7);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (R2 != null) {
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

    public void t1() {
        u1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void u1(int i10, float f7, boolean z10) {
        v1(new gi.c(5), i10, f7, new tv(this, 16), z10);
    }

    @Override
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (this.X0) {
            dm0 dm0Var = this.W0;
            if (dm0Var != null) {
                dm0Var.o(i11);
            }
            iArr[0] = i10;
            iArr[1] = i11;
            return true;
        }
        return super.v(i10, i11, i12, iArr, iArr2);
    }

    public final void v1(Utilities.CallbackReturn callbackReturn, int i10, float f7, Utilities.Callback5 callback5, boolean z10) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new ei.e5(this, callbackReturn, sparseIntArray, 3), new vi(sparseIntArray, 2));
        w1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f7, callback5, z10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.B1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, Utilities.Callback5 callback5, boolean z10) {
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.f21290j6, this.f28705n2);
        this.H2 = callbackReturn2;
        this.K2 = f7;
        this.L2 = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.M2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
        this.I2 = callback5;
        s4.m0 m0Var = this.G2;
        if (m0Var != null) {
            p0(m0Var);
        }
        yl0 yl0Var = new yl0(this, callbackReturn, i10, z10);
        this.G2 = yl0Var;
        i(yl0Var);
        if (AndroidUtilities.isTablet()) {
            setSectionsRounding(true);
        }
    }

    public boolean x1(View view) {
        return true;
    }

    public boolean z1() {
        return this.G;
    }

    public mm0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.S0 = true;
        this.f28695i1 = true;
        this.f28710q1 = -1;
        this.f28712r1 = -1;
        this.f28724x1 = false;
        this.f28726y1 = true;
        this.A1 = 2;
        this.E1 = new Rect();
        this.G1 = -1;
        this.R1 = true;
        this.f28696i2 = Float.MAX_VALUE;
        this.f28698j2 = Float.MAX_VALUE;
        this.f28707o2 = true;
        this.f28709p2 = new pe(1);
        this.f28711q2 = true;
        this.f28713r2 = new hg.o1(this, 1);
        this.C2 = new org.telegram.ui.Cells.u5(this, 20);
        this.Q2 = new Path();
        this.f28705n2 = g6Var;
        wt wtVar = new wt();
        this.D2 = wtVar;
        setEdgeEffectFactory(wtVar);
        org.telegram.ui.ActionBar.r6.m(this, 21, org.telegram.ui.ActionBar.k6.f21462s8, g6Var);
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.f21272i6, g6Var);
        try {
            if (!S2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                R2 = iArr;
                if (iArr == null) {
                    R2 = new int[0];
                }
                S2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(R2);
            Method method = T2;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.setOnScrollListener(new kv(this, 7));
        this.E.add(new hm0(this, context));
    }

    public void setOnItemClickListener(bm0 bm0Var) {
        this.U0 = bm0Var;
    }

    public void setOnItemLongClickListener(dm0 dm0Var) {
        r1(dm0Var, ViewConfiguration.getLongPressTimeout());
    }
}
