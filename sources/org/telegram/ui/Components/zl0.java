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
public class zl0 extends RecyclerView implements bh.a {
    public static int[] X2;
    public static boolean Y2;
    public static final Method Z2;
    public static final Paint f30982a3;
    public static final Paint f30983b3;
    public static final Path f30984c3;
    public static final float[] f30985d3;
    public boolean A1;
    public int A2;
    public boolean B1;
    public boolean B2;
    public int C1;
    public boolean C2;
    public org.telegram.ui.Cells.z D1;
    public final org.telegram.ui.Cells.t6 D2;
    public int E1;
    public final rt E2;
    public View F1;
    public Matrix F2;
    public final Rect G1;
    public boolean G2;
    public boolean H1;
    public ll0 H2;
    public int I1;
    public Utilities.CallbackReturn I2;
    public boolean J1;
    public Utilities.CallbackReturn J2;
    public boolean K1;
    public ov K2;
    public boolean L1;
    public ArrayList L2;
    public ka.c M1;
    public float M2;
    public View N1;
    public float[] N2;
    public int O1;
    public float[] O2;
    public boolean P1;
    public int P2;
    public boolean Q1;
    public boolean Q2;
    public boolean R1;
    public ba R2;
    public sl0 S1;
    public boolean S2;
    public boolean T1;
    public boolean T2;
    public boolean U0;
    public kl0 U1;
    public int U2;
    public nl0 V0;
    public lc0 V1;
    public ArrayList V2;
    public ol0 W0;
    public boolean W1;
    public final Path W2;
    public pl0 X0;
    public boolean X1;
    public ql0 Y0;
    public boolean Y1;
    public boolean Z0;
    public int Z1;
    public s4.s0 f30986a1;
    public int a2;
    public ml0 f30987b1;
    public int f30988b2;
    public View f30989c1;
    public int f30990c2;
    public ai.f0 f30991d1;
    public boolean f30992d2;
    public rl0 f30993e1;
    public boolean f30994e2;
    public gl0 f30995f1;
    public int f30996f2;
    public vl0 f30997g1;
    public int f30998g2;
    public boolean f30999h1;
    public org.telegram.ui.ni f31000h2;
    public boolean f31001i1;
    public boolean f31002i2;
    public boolean f31003j1;
    public boolean f31004j2;
    public boolean f31005k1;
    public float f31006k2;
    public Drawable l1;
    public float f31007l2;
    public float f31008m1;
    public int[] f31009m2;
    public float f31010n1;
    public el0 f31011n2;
    public long f31012o1;
    public q0.a f31013o2;
    public ArrayList f31014p1;
    public final org.telegram.ui.ActionBar.d6 f31015p2;
    public ArrayList f31016q1;
    public boolean f31017q2;
    public View f31018r1;
    public final re f31019r2;
    public int f31020s1;
    public boolean f31021s2;
    public int f31022t1;
    public final gg.p1 f31023t2;
    public int f31024u1;
    public Paint f31025u2;
    public int f31026v1;
    public boolean f31027v2;
    public int f31028w1;
    public GenericProvider f31029w2;
    public boolean f31030x1;
    public int f31031x2;
    public int f31032y1;
    public int f31033y2;
    public boolean f31034z1;
    public boolean f31035z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        Z2 = method;
        f30982a3 = new Paint(1);
        f30983b3 = new Paint(1);
        f30984c3 = new Path();
        f30985d3 = new float[8];
    }

    public zl0(Context context) {
        this(context, null);
    }

    public static float H0(View view) {
        if (view.getTag(R.id.dragging) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static void P0(Canvas canvas, RectF rectF, float f7, float f10, float f11, org.telegram.ui.ActionBar.d6 d6Var) {
        boolean z10 = SharedConfig.shadowsInSections;
        Paint paint = f30982a3;
        Paint paint2 = f30983b3;
        if (z10) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.h6.l1(f11, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.h6.l1(f11, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.h6.l1(f11, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, d6Var)));
        if (f7 <= 0.0f && f10 <= 0.0f) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRect(rectF, paint2);
            }
            canvas.drawRect(rectF, paint);
        } else if (f7 == f10) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f7, f7, paint2);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            Path path = f30984c3;
            path.rewind();
            float[] fArr = f30985d3;
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
    }

    private int[] getDrawableStateForSelector() {
        int[] onCreateDrawableState = onCreateDrawableState(1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = 16842919;
        return onCreateDrawableState;
    }

    public static float v1(View view) {
        if (view.getTag(R.id.dragging) != null) {
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
        this.E2.f28130b.add(new ot(runnable, 1));
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

    public final void E0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.f30991d1 == null) {
            this.f30991d1 = new ai.f0(this, getContext(), 16);
        }
        this.f30991d1.addView(clippingImageView, layoutParams);
    }

    public boolean F0(float f7) {
        return true;
    }

    public boolean G0(View view) {
        return true;
    }

    public boolean I0(View view, float f7, float f10) {
        return true;
    }

    public final void J0(boolean z10) {
        rl0 rl0Var = this.f30993e1;
        if (rl0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rl0Var);
            this.f30993e1 = null;
        }
        View view = this.N1;
        if (view != null) {
            if (z10) {
                k1(view, 0.0f, 0.0f, false);
            }
            this.N1 = null;
            n1(null, view);
        }
        this.G1.setEmpty();
        sl0 sl0Var = this.S1;
        if (sl0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sl0Var);
            this.S1 = null;
        }
        this.P1 = false;
    }

    public void K0(Canvas canvas, RectF rectF, long j3) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            s4.n0 X = X(i10);
            if ((X instanceof bh.a) && ((X != this.H2 && X != this.R2) || this.G2)) {
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

    public final void L0(boolean z10) {
        int i10;
        if (!this.f31001i1) {
            int i11 = 0;
            if (getAdapter() != null && this.f30989c1 != null) {
                boolean T0 = T0();
                if (T0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if ((this.Y1 && SharedConfig.animationsEnabled()) ? false : false) {
                    if (this.A2 != i10) {
                        this.A2 = i10;
                        if (i10 == 0) {
                            this.f30989c1.animate().setListener(null).cancel();
                            if (this.f30989c1.getVisibility() == 8) {
                                this.f30989c1.setVisibility(0);
                                this.f30989c1.setAlpha(0.0f);
                                if (this.Z1 == 1) {
                                    this.f30989c1.setScaleX(0.7f);
                                    this.f30989c1.setScaleY(0.7f);
                                }
                            }
                            this.f30989c1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.f30989c1.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.f30989c1.animate().alpha(0.0f);
                            if (this.Z1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new id0(this, 8)).start();
                        }
                    }
                } else {
                    this.A2 = i10;
                    this.f30989c1.setVisibility(i10);
                    this.f30989c1.setAlpha(1.0f);
                }
                if (this.A1) {
                    if (T0) {
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

    public final void M0(boolean z10) {
        gl0 gl0Var;
        int paddingTop;
        s4.c1 T;
        gl0 gl0Var2;
        View view;
        boolean z11;
        int i10;
        s4.c1 T2;
        int b10;
        int S;
        boolean z12;
        int i11;
        int i12;
        if (((this.K1 || z10) && this.f30995f1 != null) || (this.f31032y1 != 0 && this.f30997g1 != null)) {
            s4.o0 layoutManager = getLayoutManager();
            if (layoutManager instanceof s4.c0) {
                s4.c0 c0Var = (s4.c0) layoutManager;
                if (c0Var.f43056o == 1) {
                    if (this.f30997g1 != null) {
                        if (this.f31032y1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i13 = this.f31032y1;
                        int i14 = Integer.MAX_VALUE;
                        if (i13 != 1 && i13 != 3) {
                            if (i13 == 2) {
                                this.f31010n1 = 0.0f;
                                if (this.f30997g1.h() != 0) {
                                    int childCount = getChildCount();
                                    View view2 = null;
                                    int i15 = Integer.MAX_VALUE;
                                    View view3 = null;
                                    int i16 = 0;
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        View childAt = getChildAt(i17);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f31028w1 + paddingTop) {
                                            if (bottom < i14) {
                                                view3 = childAt;
                                                i14 = bottom;
                                            }
                                            i16 = Math.max(i16, bottom);
                                            if (bottom >= AndroidUtilities.dp(32.0f) + this.f31028w1 + paddingTop && bottom < i15) {
                                                view2 = childAt;
                                                i15 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T2 = T(view3)) != null && (S = this.f30997g1.S((b10 = T2.b()))) >= 0) {
                                        if (this.f31020s1 != S || this.f31018r1 == null) {
                                            View view4 = this.f31018r1;
                                            if (view4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            View T3 = this.f30997g1.T(S, view4);
                                            if (z12) {
                                                U0(T3, false);
                                            }
                                            this.f31018r1 = T3;
                                            T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f31018r1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f31018r1.getMeasuredHeight());
                                            this.f31020s1 = S;
                                        }
                                        if (this.f31018r1 != null && view2 != null && view2.getClass() != this.f31018r1.getClass()) {
                                            this.f31010n1 = 1.0f;
                                        }
                                        int M = this.f30997g1.M(S);
                                        int Q = this.f30997g1.Q(b10);
                                        if (i16 != 0 && i16 < getMeasuredHeight() - getPaddingBottom()) {
                                            i11 = -paddingTop;
                                        } else {
                                            i11 = this.f31028w1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f31018r1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f31028w1);
                                            if (height2 < height) {
                                                i12 = height2 - height;
                                            } else {
                                                i12 = paddingTop;
                                            }
                                            if (i12 < 0) {
                                                this.f31018r1.setTag(Integer.valueOf(paddingTop + i11 + i12));
                                            } else {
                                                this.f31018r1.setTag(Integer.valueOf(paddingTop + i11));
                                            }
                                        } else {
                                            this.f31018r1.setTag(Integer.valueOf(paddingTop + i11));
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
                            if (bottom2 > this.f31028w1 + paddingTop) {
                                if (bottom2 < i14) {
                                    i14 = bottom2;
                                    view6 = childAt2;
                                }
                                i19 = Math.max(i19, bottom2);
                                if (bottom2 >= AndroidUtilities.dp(32.0f) + this.f31028w1 + paddingTop && bottom2 < i18) {
                                    i18 = bottom2;
                                }
                            }
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(c0Var.N0() - b11) + 1;
                            if ((this.K1 || z10) && (gl0Var2 = this.f30995f1) != null && !gl0Var2.f24609n && (getAdapter() instanceof hl0)) {
                                this.f30995f1.setProgress(Math.min(1.0f, b11 / ((this.f30997g1.h() - abs) + 1)));
                            }
                            this.f31016q1.addAll(this.f31014p1);
                            this.f31014p1.clear();
                            if (this.f30997g1.h() != 0) {
                                if (this.f31020s1 != b11 || this.f31022t1 != abs) {
                                    this.f31020s1 = b11;
                                    this.f31022t1 = abs;
                                    this.f31026v1 = 1;
                                    int S2 = this.f30997g1.S(b11);
                                    this.f31024u1 = S2;
                                    int M2 = (this.f30997g1.M(S2) + b11) - this.f30997g1.Q(b11);
                                    while (M2 < b11 + abs) {
                                        M2 += this.f30997g1.M(this.f31024u1 + this.f31026v1);
                                        this.f31026v1++;
                                    }
                                }
                                if (this.f31032y1 != 3) {
                                    int i21 = b11;
                                    for (int i22 = this.f31024u1; i22 < this.f31024u1 + this.f31026v1; i22++) {
                                        if (!this.f31016q1.isEmpty()) {
                                            view = (View) this.f31016q1.get(0);
                                            this.f31016q1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        View T4 = this.f30997g1.T(i22, view);
                                        if (z11) {
                                            U0(T4, false);
                                        }
                                        this.f31014p1.add(T4);
                                        int M3 = this.f30997g1.M(i22);
                                        if (i22 == this.f31024u1) {
                                            int Q2 = this.f30997g1.Q(i21);
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
                                            i21 = (M3 - this.f30997g1.Q(b11)) + i21;
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
                        if ((this.K1 || z10) && (gl0Var = this.f30995f1) != null && !gl0Var.f24609n) {
                            s4.h0 adapter = getAdapter();
                            if (adapter instanceof hl0) {
                                hl0 hl0Var = (hl0) adapter;
                                float H = hl0Var.H(this);
                                this.f30995f1.setIsVisible(hl0Var.E(this));
                                this.f30995f1.setProgress(Math.min(1.0f, H));
                                this.f30995f1.a(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void N0(float f7, float f10) {
        boolean z10;
        MessageObject.GroupedMessages groupedMessages;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.f31009m2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f7, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.ni niVar = this.f31000h2;
            int[] iArr2 = this.f31009m2;
            org.telegram.ui.wn wnVar = niVar.d;
            iArr2[0] = (int) wnVar.f39733s9;
            iArr2[1] = wnVar.Aa;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.f30998g2;
                if (i11 != S) {
                    int i12 = this.f30996f2;
                    if (i11 <= i12 && S <= i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.wn wnVar2 = this.f31000h2.d;
                    org.telegram.ui.jm jmVar = wnVar2.A0;
                    ArrayList arrayList = wnVar2.f39755u6;
                    int i13 = S - jmVar.J;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) wnVar2.f39794x6.f(messageObject.getGroupId())) != null) {
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
                        int i14 = this.f30998g2;
                        if (S > i14) {
                            if (!this.f31000h2.f36001a) {
                                for (int i15 = i14 + 1; i15 <= S; i15++) {
                                    if (i15 != this.f30996f2 && this.f31000h2.a(i15)) {
                                        this.f31000h2.b(i15, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i14 > S) {
                                if (i14 != this.f30996f2 && this.f31000h2.a(i14)) {
                                    this.f31000h2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        }
                    } else {
                        int i16 = this.f30998g2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.f30996f2 && this.f31000h2.a(i16)) {
                                    this.f31000h2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.f31000h2.f36001a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.f30996f2 && this.f31000h2.a(i17)) {
                                    this.f31000h2.b(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f31000h2.f36001a) {
                    this.f30998g2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void O0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (this.R2 == null && view != null && j1(view)) {
            int R = RecyclerView.R(view);
            boolean z12 = false;
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View V0 = V0(R - 1);
                View V02 = V0(R + 1);
                if (V0 != null && j1(V0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (V02 != null && j1(V02)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(-this.M2, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.M2), H0(view)));
            if (z10 && z11) {
                if (v1(view) >= rectF.top) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (H0(view) <= rectF.bottom) {
                    z12 = true;
                }
                if (!z10 || !z12) {
                    z11 = z12;
                } else {
                    return;
                }
            }
            Path path = this.W2;
            if (!z10 && !z11) {
                path.rewind();
                float f7 = this.M2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
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

    public final void Q0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f7;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof y80) {
                f7 = ((y80) view2).getBottomInfoMargin();
            } else {
                f7 = 0.0f;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float left = view.getLeft();
            float f12 = -this.M2;
            float v12 = v1(view);
            if (z10) {
                f10 = this.M2;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(f12, v12 - f10);
            float right = view.getRight();
            float height = getHeight() - (-this.M2);
            float H0 = H0(view2);
            if (z11) {
                f11 = this.M2;
            }
            rectF.set(left, max, right, Math.min(height, (H0 + f11) - f7));
            if (rectF.bottom >= rectF.top) {
                float f13 = this.M2;
                this.K2.mo17run(canvas, rectF, Float.valueOf(f13), Float.valueOf(f13), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void R0(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zl0.R0(android.graphics.Canvas):void");
    }

    public final void S0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.G1;
        if (!rect.isEmpty() && (zVar = this.D1) != null) {
            int i10 = this.I1;
            if ((i10 == -2 || i10 == this.E1) && this.F1 != null) {
                if (getAdapter() instanceof yl0) {
                    ((yl0) getAdapter()).getClass();
                }
                this.D1.setBounds(this.F1.getLeft(), this.F1.getTop(), this.F1.getRight(), this.F1.getBottom());
            } else {
                zVar.setBounds(rect);
            }
            canvas.save();
            int i11 = this.I1;
            if ((i11 == -2 || i11 == this.E1) && (aVar = this.f31013o2) != null) {
                aVar.accept(canvas);
            }
            int i12 = this.I1;
            if ((i12 == -2 || i12 == this.E1) && (view = this.F1) != null) {
                canvas.translate(view.getX() - rect.left, this.F1.getY() - rect.top);
                this.D1.setAlpha((int) (this.F1.getAlpha() * 255.0f));
            }
            if (this.H2 != null) {
                canvas.save();
                O0(canvas, this.F1);
                this.D1.draw(canvas);
                canvas.restore();
            } else {
                this.D1.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean T0() {
        if (getAdapter() != null && !this.X1 && getAdapter().h() == 0) {
            return true;
        }
        return false;
    }

    public final void U0(View view, boolean z10) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z10) {
                return;
            }
            int i10 = this.f31032y1;
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
        boolean z11;
        boolean z12;
        if (view.getParent() == this && c1() && j1(view)) {
            int R = RecyclerView.R(view);
            boolean z13 = true;
            if (R == -1) {
                z12 = false;
                z11 = false;
            } else {
                View V0 = V0(R - 1);
                View V02 = V0(R + 1);
                if (V0 != null && j1(V0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (V02 != null && j1(V02)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            RectF rectF = new RectF();
            rectF.set(view.getX(), Math.max(0.0f, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), H0(view)));
            if (z11 && z12 && !z10) {
                if (v1(view) >= rectF.top) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (H0(view) > rectF.bottom) {
                    z13 = false;
                }
                if (z11 && z13) {
                    return org.telegram.ui.ActionBar.h6.b0(0, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, this.f31015p2));
                }
                z12 = z13;
            }
            Path path = new Path();
            if ((!z11 && !z12) || z10) {
                path.rewind();
                float f7 = this.M2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
            } else if (!z12) {
                path.rewind();
                path.addRoundRect(rectF, this.O2, Path.Direction.CW);
            }
            return new fl0(this, view, path, rectF);
        }
        return null;
    }

    public Integer X0(int i10) {
        GenericProvider genericProvider = this.f31029w2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint Y0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.d6 d6Var = this.f31015p2;
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

    public final boolean Z0(int i10, View view) {
        int R;
        if (view != null && i10 <= 0 && getAdapter() != null && this.J2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.J2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean a1() {
        qt[] qtVarArr;
        for (qt qtVar : this.E2.f28129a) {
            if (qtVar != null && qtVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            aVar.f417a = true;
        } else if (a1() && getOverScrollMode() != 2) {
            aVar.f417a = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i10 = 0; i10 < itemDecorationCount; i10++) {
                s4.n0 X = X(i10);
                if ((X instanceof bh.a) && ((X != this.H2 && X != this.R2) || this.G2)) {
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

    public final boolean b1(int i10, View view) {
        int R;
        if (view != null && i10 >= getChildCount() - 1 && getAdapter() != null && this.J2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().h() - 1) {
            return ((Boolean) this.J2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
        }
        return false;
    }

    public final boolean c1() {
        if (this.H2 == null && this.R2 == null) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean canScrollVertically(int i10) {
        if (this.T1 && super.canScrollVertically(i10)) {
            return true;
        }
        return false;
    }

    public final void d1() {
        if (!this.f31001i1) {
            this.f31001i1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.f30989c1;
            if (view != null && view.getVisibility() != 8) {
                this.f30989c1.setVisibility(8);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f7;
        el0 el0Var = this.f31011n2;
        if (el0Var != null) {
            zl0 zl0Var = el0Var.f24004a;
            if (el0Var.d || el0Var.e) {
                for (int i10 = 0; i10 < zl0Var.getChildCount(); i10++) {
                    View childAt = zl0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !el0Var.f24006c.contains(childAt)) {
                        Float f10 = (Float) el0Var.f24005b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                el0Var.d = false;
            }
        }
        if (this.U0 && this.B1) {
            S0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.U0 && !this.B1) {
            S0(canvas);
        }
        ai.f0 f0Var = this.f30991d1;
        if (f0Var != null) {
            f0Var.draw(canvas);
        }
        if (!this.f31034z1) {
            int i11 = this.f31032y1;
            float f11 = 0.0f;
            if (i11 == 1) {
                if (this.f30997g1 != null && !this.f31014p1.isEmpty()) {
                    for (int i12 = 0; i12 < this.f31014p1.size(); i12++) {
                        View view2 = (View) this.f31014p1.get(i12);
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
            } else if (i11 == 2 && this.f30997g1 != null && (view = this.f31018r1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f31018r1.getTag()).intValue();
                if (LocaleController.isRTL) {
                    f11 = getWidth() - this.f31018r1.getWidth();
                }
                canvas.translate(f11, intValue2);
                Drawable drawable = this.l1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f31018r1.getMeasuredHeight(), getWidth(), this.l1.getIntrinsicHeight() + this.f31018r1.getMeasuredHeight());
                    this.l1.setAlpha((int) (this.f31008m1 * 255.0f));
                    this.l1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.f31012o1);
                    this.f31012o1 = elapsedRealtime;
                    float f12 = this.f31008m1;
                    float f13 = this.f31010n1;
                    if (f12 < f13) {
                        float f14 = (((float) min) / 180.0f) + f12;
                        this.f31008m1 = f14;
                        if (f14 > f13) {
                            this.f31008m1 = f13;
                        }
                        invalidate();
                    } else if (f12 > f13) {
                        float f15 = f12 - (((float) min) / 180.0f);
                        this.f31008m1 = f15;
                        if (f15 < f13) {
                            this.f31008m1 = f13;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f31018r1.getMeasuredHeight());
                this.f31018r1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f31033y2 == 0 && this.f31035z2) {
                setOverScrollMode(0);
            }
            this.f31033y2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.f31033y2 - 1;
            this.f31033y2 = i10;
            if (i10 == 0 && this.f31035z2) {
                setOverScrollMode(2);
            }
        }
        gl0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.f24594a0 && fastScroll.f24607k0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f30997g1 != null && (view = this.f31018r1) != null && view.getAlpha() != 0.0f && this.f31018r1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.H2 != null && !this.B2) {
            canvas.save();
            O0(canvas, view);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x1();
    }

    public final void e1(boolean z10) {
        View view = this.N1;
        if (view != null) {
            k1(view, 0.0f, 0.0f, false);
            this.N1 = null;
            if (z10) {
                n1(null, view);
            }
        }
        if (!z10) {
            this.D1.setState(StateSet.NOTHING);
            this.G1.setEmpty();
        }
    }

    public void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (a1() && getOverScrollMode() != 2) {
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
        K0(canvas, rectF, uptimeMillis);
    }

    public final void f1(kl0 kl0Var, int i10, boolean z10) {
        lc0 lc0Var = this.V1;
        if (lc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lc0Var);
            this.V1 = null;
        }
        s4.c1 K = K(kl0Var.run());
        if (K != null) {
            View view = K.f43068a;
            int c10 = K.c();
            this.f31031x2 = c10;
            l1(c10, view);
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
                lc0 lc0Var2 = new lc0(this, 20);
                this.V1 = lc0Var2;
                AndroidUtilities.runOnUIThread(lc0Var2, i10);
            }
        } else if (z10) {
            this.U1 = kl0Var;
        }
    }

    @Override
    public final void g0(View view) {
        if (getAdapter() instanceof yl0) {
            s4.c1 G = G(view);
            if (G != null) {
                view.setEnabled(((yl0) getAdapter()).D(G));
                if (this.f31017q2) {
                    view.setAccessibilityDelegate(this.f31019r2);
                    return;
                }
                return;
            }
            return;
        }
        view.setEnabled(false);
        view.setAccessibilityDelegate(null);
    }

    public final void g1() {
        Utilities.CallbackReturn callbackReturn;
        ov ovVar;
        s4.n0 n0Var = this.H2;
        if (n0Var != null) {
            q0(n0Var);
            this.H2 = null;
        }
        s4.n0 n0Var2 = this.R2;
        if (n0Var2 != null) {
            q0(n0Var2);
            this.R2 = null;
        }
        Utilities.CallbackReturn callbackReturn2 = this.I2;
        if (callbackReturn2 != null && (callbackReturn = this.J2) != null && (ovVar = this.K2) != null) {
            if (!this.S2) {
                ba baVar = new ba(this, callbackReturn2, callbackReturn, this.P2, this.M2, ovVar, this.Q2, this.T2);
                this.R2 = baVar;
                i(baVar);
                return;
            }
            ll0 ll0Var = new ll0(this, callbackReturn2, this.P2, this.Q2);
            this.H2 = ll0Var;
            i(ll0Var);
        }
    }

    public View getEmptyView() {
        return this.f30989c1;
    }

    public gl0 getFastScroll() {
        return this.f30995f1;
    }

    public ArrayList<View> getHeaders() {
        return this.f31014p1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f31016q1;
    }

    public nl0 getOnItemClickListener() {
        return this.V0;
    }

    public s4.s0 getOnScrollListener() {
        return this.f30986a1;
    }

    public View getPinnedHeader() {
        return this.f31018r1;
    }

    public View getPressedChildView() {
        return this.N1;
    }

    public int getSectionColorForDecoration() {
        return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, this.f31015p2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return i0.a.k(org.telegram.ui.ActionBar.h6.v0(this.U2, this.f31015p2), 255);
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

    public void h1() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.x5) {
                ((org.telegram.ui.ActionBar.x5) childAt).e();
            }
            childAt.invalidate();
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i1(int i10) {
        if (this.L2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.L2.size(); i11++) {
                long longValue = ((Long) this.L2.get(i11)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                if (i10 >= unpackA && i10 <= unpackB) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j1(View view) {
        ba baVar = this.R2;
        if (baVar != null) {
            return baVar.m(view);
        }
        ll0 ll0Var = this.H2;
        if (ll0Var != null && ((Boolean) ll0Var.f26050a.run(view)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.D1;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    public void k1(View view, float f7, float f10, boolean z10) {
        if (!this.f31003j1 && view != null) {
            view.setPressed(z10);
        }
    }

    public final void l1(int i10, View view) {
        boolean z10;
        int i11;
        int i12;
        lc0 lc0Var = this.V1;
        if (lc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lc0Var);
            this.V1 = null;
            this.U1 = null;
        }
        if (this.D1 != null) {
            if (i10 != this.E1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getAdapter() instanceof yl0) {
                ((yl0) getAdapter()).getClass();
            }
            if (i10 != -1) {
                this.E1 = i10;
            }
            this.F1 = view;
            if (this.C1 == 8) {
                org.telegram.ui.ActionBar.h6.A1(this.D1, this.a2, 0);
            } else if (this.f30988b2 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.z zVar = this.D1;
                if (i10 == 0) {
                    i11 = this.f30988b2;
                } else {
                    i11 = 0;
                }
                if (i10 == getAdapter().h() - 2) {
                    i12 = this.f30988b2;
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
            setListSelectorColor(X0(i10));
            this.D1.setBounds(rect);
            if (z10 && getVisibility() == 0) {
                this.D1.setVisible(true, false);
            }
        }
    }

    public final void m1() {
        int i10;
        lc0 lc0Var = this.V1;
        if (lc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lc0Var);
            this.V1.run();
            this.V1 = null;
            this.F1 = null;
            return;
        }
        this.V1 = null;
        this.U1 = null;
        View view = this.F1;
        if (view != null && (i10 = this.f31031x2) != -1) {
            l1(i10, view);
            org.telegram.ui.Cells.z zVar = this.D1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.D1);
            }
            this.F1 = null;
            this.f31031x2 = -1;
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

    public final void n1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.G1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    l1(this.O1, view);
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
                x1();
            }
        }
    }

    public final void o1(zl0 zl0Var, boolean z10) {
        ViewParent parent;
        if (zl0Var != null && (parent = zl0Var.getParent()) != null) {
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
        gl0 gl0Var = this.f30995f1;
        if (gl0Var != null && gl0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f30995f1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f30995f1);
            }
            ((ViewGroup) getParent()).addView(this.f30995f1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E1 = -1;
        this.F1 = null;
        this.G1.setEmpty();
        el0 el0Var = this.f31011n2;
        if (el0Var != null) {
            el0Var.a();
        }
        if (this.f31027v2) {
            this.f31027v2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.Q1) {
                o1(this, true);
            }
            if (this.f30987b1 != null) {
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
        gl0 gl0Var = this.f30995f1;
        if (gl0Var != null) {
            this.J1 = true;
            if (gl0Var.f24593a) {
                i14 = getPaddingTop();
            } else {
                i14 = gl0Var.f24604h0;
            }
            int i15 = i11 + i14;
            gl0 gl0Var2 = this.f30995f1;
            if (gl0Var2.f24603g0) {
                gl0Var2.layout(0, i15, gl0Var2.getMeasuredWidth(), this.f30995f1.getMeasuredHeight() + i15);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f30995f1.getMeasuredWidth();
                gl0 gl0Var3 = this.f30995f1;
                gl0Var3.layout(measuredWidth, i15, gl0Var3.getMeasuredWidth() + measuredWidth, this.f30995f1.getMeasuredHeight() + i15);
            }
            this.J1 = false;
        }
        M0(false);
        kl0 kl0Var = this.U1;
        if (kl0Var != null) {
            f1(kl0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        gl0 gl0Var = this.f30995f1;
        if (gl0Var != null && gl0Var.getLayoutParams() != null) {
            gl0 gl0Var2 = this.f30995f1;
            if (gl0Var2.f24593a) {
                i12 = getPaddingTop();
            } else {
                i12 = gl0Var2.f24604h0;
            }
            int measuredHeight = (getMeasuredHeight() - i12) - getPaddingBottom();
            this.f30995f1.getLayoutParams().height = measuredHeight;
            this.f30995f1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.f30990c2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        ai.f0 f0Var = this.f30991d1;
        if (f0Var != null) {
            f0Var.requestLayout();
        }
        int i14 = this.f31032y1;
        if (i14 == 1) {
            if (this.f30997g1 != null && !this.f31014p1.isEmpty()) {
                for (int i15 = 0; i15 < this.f31014p1.size(); i15++) {
                    U0((View) this.f31014p1.get(i15), true);
                }
            }
        } else if (i14 == 2 && this.f30997g1 != null && (view = this.f31018r1) != null) {
            U0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        gl0 gl0Var = this.f30995f1;
        if (gl0Var != null && gl0Var.f24609n) {
            return false;
        }
        boolean z10 = this.f30992d2;
        org.telegram.ui.Cells.t6 t6Var = this.D2;
        if (z10 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f31006k2 == Float.MAX_VALUE && this.f31007l2 == Float.MAX_VALUE) {
                this.f31006k2 = motionEvent.getX();
                this.f31007l2 = motionEvent.getY();
            }
            if (!this.f30994e2 && Math.abs(motionEvent.getY() - this.f31007l2) > this.f30990c2) {
                this.f30994e2 = true;
                o1(this, true);
            }
            if (this.f30994e2) {
                N0(motionEvent.getX(), motionEvent.getY());
                org.telegram.ui.ni niVar = this.f31000h2;
                int[] iArr = this.f31009m2;
                org.telegram.ui.wn wnVar = niVar.d;
                iArr[0] = (int) wnVar.f39733s9;
                iArr[1] = wnVar.Aa;
                if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.f31009m2[1] && (this.f30998g2 >= this.f30996f2 || !this.f31000h2.f36001a)) {
                    this.f31004j2 = false;
                    if (!this.f31002i2) {
                        this.f31002i2 = true;
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        AndroidUtilities.runOnUIThread(t6Var);
                        return true;
                    }
                } else if (motionEvent.getY() < AndroidUtilities.dp(56.0f) + this.f31009m2[0] && (this.f30998g2 <= this.f30996f2 || !this.f31000h2.f36001a)) {
                    this.f31004j2 = true;
                    if (!this.f31002i2) {
                        this.f31002i2 = true;
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        AndroidUtilities.runOnUIThread(t6Var);
                        return true;
                    }
                } else {
                    this.f31002i2 = false;
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                }
            }
            return true;
        }
        this.f31006k2 = Float.MAX_VALUE;
        this.f31007l2 = Float.MAX_VALUE;
        this.f30992d2 = false;
        this.f30994e2 = false;
        o1(this, false);
        this.f31002i2 = false;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        return super.onTouchEvent(motionEvent);
    }

    public final void p1(int i10, boolean z10) {
        this.Y1 = z10;
        this.Z1 = i10;
    }

    public final void q1(ql0 ql0Var, long j3) {
        boolean z10;
        this.Y0 = ql0Var;
        ka.c cVar = this.M1;
        if (ql0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o20 o20Var = (o20) cVar.f13567b;
        o20Var.f26962t = z10;
        o20Var.f26963u = j3;
    }

    public final void r1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.C2 = true;
        setPadding(i10, i11, i12, i13);
        this.C2 = false;
    }

    @Override
    public void requestLayout() {
        if (!this.X1 && !this.C2) {
            super.requestLayout();
        }
    }

    public final void s1() {
        t1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f31017q2 = z10;
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        s4.h0 adapter = getAdapter();
        gg.p1 p1Var = this.f31023t2;
        if (adapter != null) {
            adapter.f43117a.unregisterObserver(p1Var);
        }
        ArrayList arrayList = this.f31014p1;
        if (arrayList != null) {
            arrayList.clear();
            this.f31016q1.clear();
        }
        this.f31020s1 = -1;
        this.E1 = -1;
        this.F1 = null;
        this.G1.setEmpty();
        this.f31018r1 = null;
        if (h0Var instanceof vl0) {
            this.f30997g1 = (vl0) h0Var;
        } else {
            this.f30997g1 = null;
        }
        super.setAdapter(h0Var);
        if (h0Var != null) {
            h0Var.B(p1Var);
        }
        L0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f31005k1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f31030x1 = z10;
    }

    public void setBitmapSectionsBackgroundColorKey(int i10) {
        if (this.U2 == i10) {
            return;
        }
        this.U2 = i10;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.G2 = z10;
    }

    public void setDisableHighlightState(boolean z10) {
        this.f31003j1 = z10;
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
        View view2 = this.f30989c1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.f30989c1 = view;
            if (this.Y1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f31001i1) {
                View view3 = this.f30989c1;
                if (view3 != null) {
                    this.A2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.A2 = -1;
            L0(false);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.f30995f1 = new gl0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f30995f1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        int i10;
        gl0 gl0Var = this.f30995f1;
        if (gl0Var == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        gl0Var.setVisibility(i10);
        this.f30995f1.f24594a0 = z10;
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
        this.f31029w2 = genericProvider;
    }

    public void setItemsEnterAnimator(el0 el0Var) {
        this.f31011n2 = el0Var;
    }

    public void setLegacySections(boolean z10) {
        if (this.S2 == z10) {
            return;
        }
        this.S2 = z10;
        g1();
        a0();
        invalidate();
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i10;
        org.telegram.ui.Cells.z zVar = this.D1;
        if (num == null) {
            if (c1()) {
                i10 = org.telegram.ui.ActionBar.h6.f19183j6;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f19165i6;
            }
            intValue = org.telegram.ui.ActionBar.h6.v0(i10, this.f31015p2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.h6.B1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(ml0 ml0Var) {
        this.f30987b1 = ml0Var;
    }

    public void setOnItemClickListener(nl0 nl0Var) {
        this.V0 = nl0Var;
    }

    public void setOnItemLongClickListener(pl0 pl0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.X0 = pl0Var;
        ka.c cVar = this.M1;
        boolean z10 = pl0Var != null;
        o20 o20Var = (o20) cVar.f13567b;
        o20Var.f26962t = z10;
        o20Var.f26963u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(s4.s0 s0Var) {
        this.f30986a1 = s0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.l1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.f31028w1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f31021s2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.T1 = z10;
    }

    public void setSections(boolean z10) {
        t1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsDrawBackground(boolean z10) {
        if (this.T2 != z10) {
            this.T2 = z10;
            ba baVar = this.R2;
            if (baVar != null) {
                zl0 zl0Var = baVar.f22894a;
                if (baVar.G != z10) {
                    baVar.G = z10;
                    zl0Var.a0();
                    zl0Var.invalidate();
                }
            }
        }
    }

    public void setSectionsType(int i10) {
        this.f31032y1 = i10;
        if (i10 != 1 && i10 != 3) {
            return;
        }
        this.f31014p1 = new ArrayList();
        this.f31016q1 = new ArrayList();
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
            int i12 = this.f30988b2;
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
        this.f31013o2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.C1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f31034z1 = z10;
    }

    public void setTopBottomSelectorRadius(int i10) {
        this.f30988b2 = i10;
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
        gl0 gl0Var = this.f30995f1;
        if (gl0Var != null) {
            gl0Var.setTranslationY(f7);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (X2 != null) {
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

    public void t1(int i10, float f7, boolean z10) {
        ei.c cVar = new ei.c(5);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new ci.o5(this, cVar, sparseIntArray, 3), new zi(sparseIntArray, 2));
        u1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f7, z10);
    }

    public final void u1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, boolean z10) {
        ov ovVar = new ov(this, 16);
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19183j6, this.f31015p2));
        this.I2 = callbackReturn;
        this.J2 = callbackReturn2;
        this.P2 = i10;
        this.Q2 = z10;
        this.M2 = f7;
        this.N2 = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.O2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
        this.K2 = ovVar;
        g1();
    }

    @Override
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (this.Z0) {
            ql0 ql0Var = this.Y0;
            if (ql0Var != null) {
                ql0Var.q(i11);
            }
            iArr[0] = i10;
            iArr[1] = i11;
            return true;
        }
        return super.v(i10, i11, i12, iArr, iArr2);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.D1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public boolean w1() {
        return this.G;
    }

    public final void x1() {
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

    public zl0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.U0 = true;
        this.f31005k1 = true;
        this.f31020s1 = -1;
        this.f31022t1 = -1;
        this.f31034z1 = false;
        this.A1 = true;
        this.C1 = 2;
        this.G1 = new Rect();
        this.I1 = -1;
        this.T1 = true;
        this.f31006k2 = Float.MAX_VALUE;
        this.f31007l2 = Float.MAX_VALUE;
        this.f31017q2 = true;
        this.f31019r2 = new re(1);
        this.f31021s2 = true;
        this.f31023t2 = new gg.p1(this, 1);
        this.D2 = new org.telegram.ui.Cells.t6(this, 20);
        this.U2 = org.telegram.ui.ActionBar.h6.f19020a7;
        this.W2 = new Path();
        this.f31015p2 = d6Var;
        rt rtVar = new rt();
        this.E2 = rtVar;
        setEdgeEffectFactory(rtVar);
        setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19354s8, d6Var));
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165i6, d6Var), 2, -1);
        this.D1 = f02;
        f02.setCallback(this);
        try {
            if (!Y2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                X2 = iArr;
                if (iArr == null) {
                    X2 = new int[0];
                }
                Y2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(X2);
            Method method = Z2;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.setOnScrollListener(new xg0(this, 2));
        this.E.add(new ul0(this, context));
    }

    public void setOnItemClickListener(ol0 ol0Var) {
        this.W0 = ol0Var;
    }

    public void setOnItemLongClickListener(ql0 ql0Var) {
        q1(ql0Var, ViewConfiguration.getLongPressTimeout());
    }
}
