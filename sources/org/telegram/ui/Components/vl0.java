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
public class vl0 extends RecyclerView implements ah.a {
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
    public final org.telegram.ui.Cells.l9 D2;
    public int E1;
    public final st E2;
    public View F1;
    public Matrix F2;
    public final Rect G1;
    public boolean G2;
    public boolean H1;
    public hl0 H2;
    public int I1;
    public Utilities.CallbackReturn I2;
    public boolean J1;
    public Utilities.Callback5 J2;
    public boolean K1;
    public ArrayList K2;
    public boolean L1;
    public float L2;
    public l2.g M1;
    public float[] M2;
    public View N1;
    public float[] N2;
    public int O1;
    public ArrayList O2;
    public boolean P1;
    public final Path P2;
    public boolean Q1;
    public boolean R1;
    public ol0 S1;
    public boolean T1;
    public boolean U0;
    public gl0 U1;
    public jl0 V0;
    public kc0 V1;
    public kl0 W0;
    public boolean W1;
    public ll0 X0;
    public boolean X1;
    public ml0 Y0;
    public boolean Y1;
    public boolean Z0;
    public int Z1;
    public s4.s0 f27958a1;
    public int a2;
    public il0 f27959b1;
    public int f27960b2;
    public View f27961c1;
    public int f27962c2;
    public bi.ld f27963d1;
    public boolean f27964d2;
    public nl0 f27965e1;
    public boolean f27966e2;
    public cl0 f27967f1;
    public int f27968f2;
    public rl0 f27969g1;
    public int f27970g2;
    public boolean f27971h1;
    public org.telegram.ui.si f27972h2;
    public boolean f27973i1;
    public boolean f27974i2;
    public boolean f27975j1;
    public boolean f27976j2;
    public boolean f27977k1;
    public float f27978k2;
    public Drawable l1;
    public float f27979l2;
    public float f27980m1;
    public int[] f27981m2;
    public float f27982n1;
    public zk0 f27983n2;
    public long f27984o1;
    public q0.a f27985o2;
    public ArrayList f27986p1;
    public final org.telegram.ui.ActionBar.f6 f27987p2;
    public ArrayList f27988q1;
    public boolean f27989q2;
    public View f27990r1;
    public final qe f27991r2;
    public int f27992s1;
    public boolean f27993s2;
    public int f27994t1;
    public final fg.q1 f27995t2;
    public int f27996u1;
    public Paint f27997u2;
    public int f27998v1;
    public boolean f27999v2;
    public int f28000w1;
    public GenericProvider f28001w2;
    public boolean f28002x1;
    public int f28003x2;
    public int f28004y1;
    public int f28005y2;
    public boolean f28006z1;
    public boolean f28007z2;

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

    public vl0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        if (view.getTag(R.id.dragging) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static void N0(Canvas canvas, RectF rectF, float f7, float f10, float f11, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean z10 = SharedConfig.shadowsInSections;
        Paint paint = T2;
        Paint paint2 = U2;
        if (z10) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.j6.l1(f11, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.j6.l1(f11, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(f11, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var)));
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
        this.E2.f27212b.add(new qt(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.f27963d1 == null) {
            this.f27963d1 = new bi.ld(this, getContext(), 14);
        }
        this.f27963d1.addView(clippingImageView, layoutParams);
    }

    @Override
    public final View E(float f7, float f10) {
        float f11;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                if ((!(childAt instanceof org.telegram.ui.Cells.t1) && !(childAt instanceof org.telegram.ui.Cells.w0)) || childAt.getVisibility() != 4) {
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
        nl0 nl0Var = this.f27965e1;
        if (nl0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nl0Var);
            this.f27965e1 = null;
        }
        View view = this.N1;
        if (view != null) {
            if (z10) {
                g1(view, 0.0f, 0.0f, false);
            }
            this.N1 = null;
            j1(null, view);
        }
        this.G1.setEmpty();
        ol0 ol0Var = this.S1;
        if (ol0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ol0Var);
            this.S1 = null;
        }
        this.P1 = false;
    }

    public final void J0(boolean z10) {
        int i10;
        if (!this.f27973i1) {
            int i11 = 0;
            if (getAdapter() != null && this.f27961c1 != null) {
                boolean R0 = R0();
                if (R0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if ((this.Y1 && SharedConfig.animationsEnabled()) ? false : false) {
                    if (this.A2 != i10) {
                        this.A2 = i10;
                        if (i10 == 0) {
                            this.f27961c1.animate().setListener(null).cancel();
                            if (this.f27961c1.getVisibility() == 8) {
                                this.f27961c1.setVisibility(0);
                                this.f27961c1.setAlpha(0.0f);
                                if (this.Z1 == 1) {
                                    this.f27961c1.setScaleX(0.7f);
                                    this.f27961c1.setScaleY(0.7f);
                                }
                            }
                            this.f27961c1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.f27961c1.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.f27961c1.animate().alpha(0.0f);
                            if (this.Z1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new rm(this, 27)).start();
                        }
                    }
                } else {
                    this.A2 = i10;
                    this.f27961c1.setVisibility(i10);
                    this.f27961c1.setAlpha(1.0f);
                }
                if (this.A1) {
                    if (R0) {
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

    public final void K0(boolean z10) {
        cl0 cl0Var;
        int paddingTop;
        s4.c1 T;
        cl0 cl0Var2;
        View view;
        boolean z11;
        int i10;
        s4.c1 T3;
        int b10;
        int S;
        boolean z12;
        int i11;
        int i12;
        if (((this.K1 || z10) && this.f27967f1 != null) || (this.f28004y1 != 0 && this.f27969g1 != null)) {
            s4.o0 layoutManager = getLayoutManager();
            if (layoutManager instanceof s4.c0) {
                s4.c0 c0Var = (s4.c0) layoutManager;
                if (c0Var.f41598o == 1) {
                    if (this.f27969g1 != null) {
                        if (this.f28004y1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i13 = this.f28004y1;
                        int i14 = Integer.MAX_VALUE;
                        if (i13 != 1 && i13 != 3) {
                            if (i13 == 2) {
                                this.f27982n1 = 0.0f;
                                if (this.f27969g1.h() != 0) {
                                    int childCount = getChildCount();
                                    View view2 = null;
                                    int i15 = Integer.MAX_VALUE;
                                    View view3 = null;
                                    int i16 = 0;
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        View childAt = getChildAt(i17);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f28000w1 + paddingTop) {
                                            if (bottom < i14) {
                                                view3 = childAt;
                                                i14 = bottom;
                                            }
                                            i16 = Math.max(i16, bottom);
                                            if (bottom >= AndroidUtilities.dp(32.0f) + this.f28000w1 + paddingTop && bottom < i15) {
                                                view2 = childAt;
                                                i15 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T3 = T(view3)) != null && (S = this.f27969g1.S((b10 = T3.b()))) >= 0) {
                                        if (this.f27992s1 != S || this.f27990r1 == null) {
                                            View view4 = this.f27990r1;
                                            if (view4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            View T4 = this.f27969g1.T(S, view4);
                                            if (z12) {
                                                S0(T4, false);
                                            }
                                            this.f27990r1 = T4;
                                            T4.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f27990r1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f27990r1.getMeasuredHeight());
                                            this.f27992s1 = S;
                                        }
                                        if (this.f27990r1 != null && view2 != null && view2.getClass() != this.f27990r1.getClass()) {
                                            this.f27982n1 = 1.0f;
                                        }
                                        int M = this.f27969g1.M(S);
                                        int Q = this.f27969g1.Q(b10);
                                        if (i16 != 0 && i16 < getMeasuredHeight() - getPaddingBottom()) {
                                            i11 = -paddingTop;
                                        } else {
                                            i11 = this.f28000w1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f27990r1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f28000w1);
                                            if (height2 < height) {
                                                i12 = height2 - height;
                                            } else {
                                                i12 = paddingTop;
                                            }
                                            if (i12 < 0) {
                                                this.f27990r1.setTag(Integer.valueOf(paddingTop + i11 + i12));
                                            } else {
                                                this.f27990r1.setTag(Integer.valueOf(paddingTop + i11));
                                            }
                                        } else {
                                            this.f27990r1.setTag(Integer.valueOf(paddingTop + i11));
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
                            if (bottom2 > this.f28000w1 + paddingTop) {
                                if (bottom2 < i14) {
                                    i14 = bottom2;
                                    view6 = childAt2;
                                }
                                i19 = Math.max(i19, bottom2);
                                if (bottom2 >= AndroidUtilities.dp(32.0f) + this.f28000w1 + paddingTop && bottom2 < i18) {
                                    i18 = bottom2;
                                }
                            }
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(c0Var.N0() - b11) + 1;
                            if ((this.K1 || z10) && (cl0Var2 = this.f27967f1) != null && !cl0Var2.f22171n && (getAdapter() instanceof dl0)) {
                                this.f27967f1.setProgress(Math.min(1.0f, b11 / ((this.f27969g1.h() - abs) + 1)));
                            }
                            this.f27988q1.addAll(this.f27986p1);
                            this.f27986p1.clear();
                            if (this.f27969g1.h() != 0) {
                                if (this.f27992s1 != b11 || this.f27994t1 != abs) {
                                    this.f27992s1 = b11;
                                    this.f27994t1 = abs;
                                    this.f27998v1 = 1;
                                    int S3 = this.f27969g1.S(b11);
                                    this.f27996u1 = S3;
                                    int M2 = (this.f27969g1.M(S3) + b11) - this.f27969g1.Q(b11);
                                    while (M2 < b11 + abs) {
                                        M2 += this.f27969g1.M(this.f27996u1 + this.f27998v1);
                                        this.f27998v1++;
                                    }
                                }
                                if (this.f28004y1 != 3) {
                                    int i21 = b11;
                                    for (int i22 = this.f27996u1; i22 < this.f27996u1 + this.f27998v1; i22++) {
                                        if (!this.f27988q1.isEmpty()) {
                                            view = (View) this.f27988q1.get(0);
                                            this.f27988q1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        View T5 = this.f27969g1.T(i22, view);
                                        if (z11) {
                                            S0(T5, false);
                                        }
                                        this.f27986p1.add(T5);
                                        int M3 = this.f27969g1.M(i22);
                                        if (i22 == this.f27996u1) {
                                            int Q3 = this.f27969g1.Q(i21);
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
                                            i21 = (M3 - this.f27969g1.Q(b11)) + i21;
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
                        if ((this.K1 || z10) && (cl0Var = this.f27967f1) != null && !cl0Var.f22171n) {
                            s4.h0 adapter = getAdapter();
                            if (adapter instanceof dl0) {
                                dl0 dl0Var = (dl0) adapter;
                                float H = dl0Var.H(this);
                                this.f27967f1.setIsVisible(dl0Var.E(this));
                                this.f27967f1.setProgress(Math.min(1.0f, H));
                                this.f27967f1.a(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void L0(float f7, float f10) {
        boolean z10;
        MessageObject.GroupedMessages groupedMessages;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.f27981m2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f7, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.si siVar = this.f27972h2;
            int[] iArr2 = this.f27981m2;
            org.telegram.ui.eo eoVar = siVar.d;
            iArr2[0] = (int) eoVar.f32487s9;
            iArr2[1] = eoVar.Aa;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.f27970g2;
                if (i11 != S) {
                    int i12 = this.f27968f2;
                    if (i11 <= i12 && S <= i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.eo eoVar2 = this.f27972h2.d;
                    org.telegram.ui.pm pmVar = eoVar2.A0;
                    ArrayList arrayList = eoVar2.f32509u6;
                    int i13 = S - pmVar.J;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) eoVar2.f32548x6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            if (z10) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf(arrayList2.get(size)) + eoVar2.A0.J;
                        }
                    }
                    if (z10) {
                        int i14 = this.f27970g2;
                        if (S > i14) {
                            if (!this.f27972h2.f36687a) {
                                for (int i15 = i14 + 1; i15 <= S; i15++) {
                                    if (i15 != this.f27968f2 && this.f27972h2.a(i15)) {
                                        this.f27972h2.b(i15, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i14 > S) {
                                if (i14 != this.f27968f2 && this.f27972h2.a(i14)) {
                                    this.f27972h2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        }
                    } else {
                        int i16 = this.f27970g2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.f27968f2 && this.f27972h2.a(i16)) {
                                    this.f27972h2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.f27972h2.f36687a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.f27968f2 && this.f27972h2.a(i17)) {
                                    this.f27972h2.b(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f27972h2.f36687a) {
                    this.f27970g2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void M0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (view != null && ((Boolean) this.H2.f23685a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z12 = false;
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View T0 = T0(R - 1);
                View T02 = T0(R + 1);
                if (T0 != null && ((Boolean) this.H2.f23685a.run(T0)).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (T02 != null && ((Boolean) this.H2.f23685a.run(T02)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(-this.L2, s1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.L2), G0(view)));
            if (z10 && z11) {
                if (s1(view) >= rectF.top) {
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

    public final void O0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f7;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof u80) {
                f7 = ((u80) view2).getBottomInfoMargin();
            } else {
                f7 = 0.0f;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float left = view.getLeft();
            float f12 = -this.L2;
            float s12 = s1(view);
            if (z10) {
                f10 = this.L2;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(f12, s12 - f10);
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

    public final void P0(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vl0.P0(android.graphics.Canvas):void");
    }

    public final void Q0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.G1;
        if (!rect.isEmpty() && (zVar = this.D1) != null) {
            int i10 = this.I1;
            if ((i10 == -2 || i10 == this.E1) && this.F1 != null) {
                if (getAdapter() instanceof ul0) {
                    ((ul0) getAdapter()).getClass();
                }
                this.D1.setBounds(this.F1.getLeft(), this.F1.getTop(), this.F1.getRight(), this.F1.getBottom());
            } else {
                zVar.setBounds(rect);
            }
            canvas.save();
            int i11 = this.I1;
            if ((i11 == -2 || i11 == this.E1) && (aVar = this.f27985o2) != null) {
                aVar.accept(canvas);
            }
            int i12 = this.I1;
            if ((i12 == -2 || i12 == this.E1) && (view = this.F1) != null) {
                canvas.translate(view.getX() - rect.left, this.F1.getY() - rect.top);
                this.D1.setAlpha((int) (this.F1.getAlpha() * 255.0f));
            }
            if (a1()) {
                canvas.save();
                M0(canvas, this.F1);
                this.D1.draw(canvas);
                canvas.restore();
            } else {
                this.D1.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean R0() {
        if (getAdapter() != null && !this.X1 && getAdapter().h() == 0) {
            return true;
        }
        return false;
    }

    public final void S0(View view, boolean z10) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z10) {
                return;
            }
            int i10 = this.f28004y1;
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
        if (view.getParent() == this && a1() && ((Boolean) this.H2.f23685a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z13 = true;
            if (R == -1) {
                z12 = false;
                z11 = false;
            } else {
                View T0 = T0(R - 1);
                View T02 = T0(R + 1);
                if (T0 != null && ((Boolean) this.H2.f23685a.run(T0)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (T02 != null && ((Boolean) this.H2.f23685a.run(T02)).booleanValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            RectF rectF = new RectF();
            rectF.set(view.getX(), Math.max(0.0f, s1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
            if (z11 && z12 && !z10) {
                if (s1(view) >= rectF.top) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (G0(view) > rectF.bottom) {
                    z13 = false;
                }
                if (z11 && z13) {
                    return org.telegram.ui.ActionBar.j6.b0(0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, this.f27987p2));
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
            return new bl0(this, view, path, rectF);
        }
        return null;
    }

    public Integer V0(int i10) {
        GenericProvider genericProvider = this.f28001w2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint W0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27987p2;
        if (f6Var != null) {
            paint = f6Var.F(str);
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
        if (view != null && i10 <= 0 && getAdapter() != null && this.I2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.I2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Y0() {
        rt[] rtVarArr;
        for (rt rtVar : this.E2.f27211a) {
            if (rtVar != null && rtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z0(int i10, View view) {
        int R;
        if (view != null && i10 >= getChildCount() - 1 && getAdapter() != null && this.I2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().h() - 1) {
            return ((Boolean) this.I2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
        }
        return false;
    }

    public final boolean a1() {
        if (this.H2 != null) {
            return true;
        }
        return false;
    }

    public final void b1() {
        if (!this.f27973i1) {
            this.f27973i1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.f27961c1;
            if (view != null && view.getVisibility() != 8) {
                this.f27961c1.setVisibility(8);
            }
        }
    }

    public final void c1(boolean z10) {
        View view = this.N1;
        if (view != null) {
            g1(view, 0.0f, 0.0f, false);
            this.N1 = null;
            if (z10) {
                j1(null, view);
            }
        }
        if (!z10) {
            this.D1.setState(StateSet.NOTHING);
            this.G1.setEmpty();
        }
    }

    @Override
    public final boolean canScrollVertically(int i10) {
        if (this.T1 && super.canScrollVertically(i10)) {
            return true;
        }
        return false;
    }

    public final void d1(gl0 gl0Var, int i10, boolean z10) {
        kc0 kc0Var = this.V1;
        if (kc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kc0Var);
            this.V1 = null;
        }
        s4.c1 K = K(gl0Var.run());
        if (K != null) {
            View view = K.f41610a;
            int c10 = K.c();
            this.f28003x2 = c10;
            h1(c10, view);
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
                kc0 kc0Var2 = new kc0(this, 19);
                this.V1 = kc0Var2;
                AndroidUtilities.runOnUIThread(kc0Var2, i10);
            }
        } else if (z10) {
            this.U1 = gl0Var;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f7;
        zk0 zk0Var = this.f27983n2;
        if (zk0Var != null) {
            vl0 vl0Var = zk0Var.f29712a;
            if (zk0Var.d || zk0Var.e) {
                for (int i10 = 0; i10 < vl0Var.getChildCount(); i10++) {
                    View childAt = vl0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !zk0Var.f29714c.contains(childAt)) {
                        Float f10 = (Float) zk0Var.f29713b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                zk0Var.d = false;
            }
        }
        if (this.U0 && this.B1) {
            Q0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.U0 && !this.B1) {
            Q0(canvas);
        }
        bi.ld ldVar = this.f27963d1;
        if (ldVar != null) {
            ldVar.draw(canvas);
        }
        if (!this.f28006z1) {
            int i11 = this.f28004y1;
            float f11 = 0.0f;
            if (i11 == 1) {
                if (this.f27969g1 != null && !this.f27986p1.isEmpty()) {
                    for (int i12 = 0; i12 < this.f27986p1.size(); i12++) {
                        View view2 = (View) this.f27986p1.get(i12);
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
            } else if (i11 == 2 && this.f27969g1 != null && (view = this.f27990r1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f27990r1.getTag()).intValue();
                if (LocaleController.isRTL) {
                    f11 = getWidth() - this.f27990r1.getWidth();
                }
                canvas.translate(f11, intValue2);
                Drawable drawable = this.l1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f27990r1.getMeasuredHeight(), getWidth(), this.l1.getIntrinsicHeight() + this.f27990r1.getMeasuredHeight());
                    this.l1.setAlpha((int) (this.f27980m1 * 255.0f));
                    this.l1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.f27984o1);
                    this.f27984o1 = elapsedRealtime;
                    float f12 = this.f27980m1;
                    float f13 = this.f27982n1;
                    if (f12 < f13) {
                        float f14 = (((float) min) / 180.0f) + f12;
                        this.f27980m1 = f14;
                        if (f14 > f13) {
                            this.f27980m1 = f13;
                        }
                        invalidate();
                    } else if (f12 > f13) {
                        float f15 = f12 - (((float) min) / 180.0f);
                        this.f27980m1 = f15;
                        if (f15 < f13) {
                            this.f27980m1 = f13;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f27990r1.getMeasuredHeight());
                this.f27990r1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f28005y2 == 0 && this.f28007z2) {
                setOverScrollMode(0);
            }
            this.f28005y2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.f28005y2 - 1;
            this.f28005y2 = i10;
            if (i10 == 0 && this.f28007z2) {
                setOverScrollMode(2);
            }
        }
        cl0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.f22156a0 && fastScroll.f22169k0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f27969g1 != null && (view = this.f27990r1) != null && view.getAlpha() != 0.0f && this.f27990r1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (a1() && !this.B2) {
            canvas.save();
            M0(canvas, view);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        u1();
    }

    public void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Y0() && getOverScrollMode() != 2) {
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
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            s4.n0 X = X(i10);
            if ((X instanceof ah.a) && (X != this.H2 || this.G2)) {
                ((ah.a) X).e(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x10 = childAt.getX();
            float y3 = childAt.getY();
            if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                this.B2 = true;
                drawChild(canvas, childAt, uptimeMillis);
                this.B2 = false;
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
        if (getAdapter() instanceof ul0) {
            s4.c1 G = G(view);
            if (G != null) {
                view.setEnabled(((ul0) getAdapter()).D(G));
                if (this.f27989q2) {
                    view.setAccessibilityDelegate(this.f27991r2);
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
    public final void g(g.z zVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            zVar.f8456b = true;
        } else if (Y0() && getOverScrollMode() != 2) {
            zVar.f8456b = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i10 = 0; i10 < itemDecorationCount; i10++) {
                s4.n0 X = X(i10);
                if ((X instanceof ah.a) && (X != this.H2 || this.G2)) {
                    ((ah.a) X).g(zVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                float x10 = childAt.getX();
                float y3 = childAt.getY();
                if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                    zVar.getClass();
                    ah.b.a(zVar, childAt);
                }
            }
        }
    }

    public void g1(View view, float f7, float f10, boolean z10) {
        if (!this.f27975j1 && view != null) {
            view.setPressed(z10);
        }
    }

    public View getEmptyView() {
        return this.f27961c1;
    }

    public cl0 getFastScroll() {
        return this.f27967f1;
    }

    public ArrayList<View> getHeaders() {
        return this.f27986p1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f27988q1;
    }

    public jl0 getOnItemClickListener() {
        return this.V0;
    }

    public s4.s0 getOnScrollListener() {
        return this.f27958a1;
    }

    public View getPinnedHeader() {
        return this.f27990r1;
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

    public final void h1(int i10, View view) {
        boolean z10;
        int i11;
        int i12;
        kc0 kc0Var = this.V1;
        if (kc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kc0Var);
            this.V1 = null;
            this.U1 = null;
        }
        if (this.D1 != null) {
            if (i10 != this.E1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getAdapter() instanceof ul0) {
                ((ul0) getAdapter()).getClass();
            }
            if (i10 != -1) {
                this.E1 = i10;
            }
            this.F1 = view;
            if (this.C1 == 8) {
                org.telegram.ui.ActionBar.j6.A1(this.D1, this.a2, 0);
            } else if (this.f27960b2 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.z zVar = this.D1;
                if (i10 == 0) {
                    i11 = this.f27960b2;
                } else {
                    i11 = 0;
                }
                if (i10 == getAdapter().h() - 2) {
                    i12 = this.f27960b2;
                } else {
                    i12 = 0;
                }
                org.telegram.ui.ActionBar.j6.A1(zVar, i11, i12);
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
            setListSelectorColor(V0(i10));
            this.D1.setBounds(rect);
            if (z10 && getVisibility() == 0) {
                this.D1.setVisible(true, false);
            }
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void i1() {
        int i10;
        kc0 kc0Var = this.V1;
        if (kc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kc0Var);
            this.V1.run();
            this.V1 = null;
            this.F1 = null;
            return;
        }
        this.V1 = null;
        this.U1 = null;
        View view = this.F1;
        if (view != null && (i10 = this.f28003x2) != -1) {
            h1(i10, view);
            org.telegram.ui.Cells.z zVar = this.D1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.D1);
            }
            this.F1 = null;
            this.f28003x2 = -1;
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

    public final void j1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.G1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    h1(this.O1, view);
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
                u1();
            }
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

    public final void k1(vl0 vl0Var, boolean z10) {
        ViewParent parent;
        if (vl0Var != null && (parent = vl0Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void l1(int i10, boolean z10) {
        this.Y1 = z10;
        this.Z1 = i10;
    }

    public final void m1(ml0 ml0Var, long j3) {
        boolean z10;
        this.Y0 = ml0Var;
        l2.g gVar = this.M1;
        if (ml0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t20 t20Var = (t20) gVar.f12719b;
        t20Var.f27296t = z10;
        t20Var.f27297u = j3;
    }

    public final void n1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.C2 = true;
        setPadding(i10, i11, i12, i13);
        this.C2 = false;
    }

    public void o1() {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cl0 cl0Var = this.f27967f1;
        if (cl0Var != null && cl0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f27967f1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f27967f1);
            }
            ((ViewGroup) getParent()).addView(this.f27967f1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E1 = -1;
        this.F1 = null;
        this.G1.setEmpty();
        zk0 zk0Var = this.f27983n2;
        if (zk0Var != null) {
            zk0Var.a();
        }
        if (this.f27999v2) {
            this.f27999v2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.Q1) {
                k1(this, true);
            }
            if (this.f27959b1 != null) {
                int i10 = org.telegram.ui.eo.Hc;
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
        cl0 cl0Var = this.f27967f1;
        if (cl0Var != null) {
            this.J1 = true;
            if (cl0Var.f22155a) {
                i14 = getPaddingTop();
            } else {
                i14 = cl0Var.f22166h0;
            }
            int i15 = i11 + i14;
            cl0 cl0Var2 = this.f27967f1;
            if (cl0Var2.f22165g0) {
                cl0Var2.layout(0, i15, cl0Var2.getMeasuredWidth(), this.f27967f1.getMeasuredHeight() + i15);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f27967f1.getMeasuredWidth();
                cl0 cl0Var3 = this.f27967f1;
                cl0Var3.layout(measuredWidth, i15, cl0Var3.getMeasuredWidth() + measuredWidth, this.f27967f1.getMeasuredHeight() + i15);
            }
            this.J1 = false;
        }
        K0(false);
        gl0 gl0Var = this.U1;
        if (gl0Var != null) {
            d1(gl0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        cl0 cl0Var = this.f27967f1;
        if (cl0Var != null && cl0Var.getLayoutParams() != null) {
            cl0 cl0Var2 = this.f27967f1;
            if (cl0Var2.f22155a) {
                i12 = getPaddingTop();
            } else {
                i12 = cl0Var2.f22166h0;
            }
            int measuredHeight = (getMeasuredHeight() - i12) - getPaddingBottom();
            this.f27967f1.getLayoutParams().height = measuredHeight;
            this.f27967f1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.f27962c2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        bi.ld ldVar = this.f27963d1;
        if (ldVar != null) {
            ldVar.requestLayout();
        }
        int i14 = this.f28004y1;
        if (i14 == 1) {
            if (this.f27969g1 != null && !this.f27986p1.isEmpty()) {
                for (int i15 = 0; i15 < this.f27986p1.size(); i15++) {
                    S0((View) this.f27986p1.get(i15), true);
                }
            }
        } else if (i14 == 2 && this.f27969g1 != null && (view = this.f27990r1) != null) {
            S0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        cl0 cl0Var = this.f27967f1;
        if (cl0Var != null && cl0Var.f22171n) {
            return false;
        }
        boolean z10 = this.f27964d2;
        org.telegram.ui.Cells.l9 l9Var = this.D2;
        if (z10 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f27978k2 == Float.MAX_VALUE && this.f27979l2 == Float.MAX_VALUE) {
                this.f27978k2 = motionEvent.getX();
                this.f27979l2 = motionEvent.getY();
            }
            if (!this.f27966e2 && Math.abs(motionEvent.getY() - this.f27979l2) > this.f27962c2) {
                this.f27966e2 = true;
                k1(this, true);
            }
            if (this.f27966e2) {
                L0(motionEvent.getX(), motionEvent.getY());
                org.telegram.ui.si siVar = this.f27972h2;
                int[] iArr = this.f27981m2;
                org.telegram.ui.eo eoVar = siVar.d;
                iArr[0] = (int) eoVar.f32487s9;
                iArr[1] = eoVar.Aa;
                if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.f27981m2[1] && (this.f27970g2 >= this.f27968f2 || !this.f27972h2.f36687a)) {
                    this.f27976j2 = false;
                    if (!this.f27974i2) {
                        this.f27974i2 = true;
                        AndroidUtilities.cancelRunOnUIThread(l9Var);
                        AndroidUtilities.runOnUIThread(l9Var);
                        return true;
                    }
                } else if (motionEvent.getY() < AndroidUtilities.dp(56.0f) + this.f27981m2[0] && (this.f27970g2 <= this.f27968f2 || !this.f27972h2.f36687a)) {
                    this.f27976j2 = true;
                    if (!this.f27974i2) {
                        this.f27974i2 = true;
                        AndroidUtilities.cancelRunOnUIThread(l9Var);
                        AndroidUtilities.runOnUIThread(l9Var);
                        return true;
                    }
                } else {
                    this.f27974i2 = false;
                    AndroidUtilities.cancelRunOnUIThread(l9Var);
                }
            }
            return true;
        }
        this.f27978k2 = Float.MAX_VALUE;
        this.f27979l2 = Float.MAX_VALUE;
        this.f27964d2 = false;
        this.f27966e2 = false;
        k1(this, false);
        this.f27974i2 = false;
        AndroidUtilities.cancelRunOnUIThread(l9Var);
        return super.onTouchEvent(motionEvent);
    }

    public void p1(int i10, float f7, boolean z10) {
        q1(new di.c(5), i10, f7, new pv(this, 15), z10);
    }

    public final void q1(Utilities.CallbackReturn callbackReturn, int i10, float f7, Utilities.Callback5 callback5, boolean z10) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new bi.n6(this, callbackReturn, sparseIntArray, 3), new aj(sparseIntArray, 2));
        r1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f7, callback5, z10);
    }

    public final void r1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, Utilities.Callback5 callback5, boolean z10) {
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18035j6, this.f27987p2));
        this.I2 = callbackReturn2;
        this.L2 = f7;
        this.M2 = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.N2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
        this.J2 = callback5;
        s4.n0 n0Var = this.H2;
        if (n0Var != null) {
            p0(n0Var);
        }
        hl0 hl0Var = new hl0(this, callbackReturn, i10, z10);
        this.H2 = hl0Var;
        i(hl0Var);
    }

    @Override
    public void requestLayout() {
        if (!this.X1 && !this.C2) {
            super.requestLayout();
        }
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f27989q2 = z10;
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        s4.h0 adapter = getAdapter();
        fg.q1 q1Var = this.f27995t2;
        if (adapter != null) {
            adapter.f41659a.unregisterObserver(q1Var);
        }
        ArrayList arrayList = this.f27986p1;
        if (arrayList != null) {
            arrayList.clear();
            this.f27988q1.clear();
        }
        this.f27992s1 = -1;
        this.E1 = -1;
        this.F1 = null;
        this.G1.setEmpty();
        this.f27990r1 = null;
        if (h0Var instanceof rl0) {
            this.f27969g1 = (rl0) h0Var;
        } else {
            this.f27969g1 = null;
        }
        super.setAdapter(h0Var);
        if (h0Var != null) {
            h0Var.B(q1Var);
        }
        J0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f27977k1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f28002x1 = z10;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.G2 = z10;
    }

    public void setDisableHighlightState(boolean z10) {
        this.f27975j1 = z10;
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
        View view2 = this.f27961c1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.f27961c1 = view;
            if (this.Y1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f27973i1) {
                View view3 = this.f27961c1;
                if (view3 != null) {
                    this.A2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.A2 = -1;
            J0(false);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.f27967f1 = new cl0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f27967f1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        int i10;
        cl0 cl0Var = this.f27967f1;
        if (cl0Var == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        cl0Var.setVisibility(i10);
        this.f27967f1.f22156a0 = z10;
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
        this.f28001w2 = genericProvider;
    }

    public void setItemsEnterAnimator(zk0 zk0Var) {
        this.f27983n2 = zk0Var;
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i10;
        org.telegram.ui.Cells.z zVar = this.D1;
        if (num == null) {
            if (a1()) {
                i10 = org.telegram.ui.ActionBar.j6.f18035j6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f18017i6;
            }
            intValue = org.telegram.ui.ActionBar.j6.v0(i10, this.f27987p2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.j6.B1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(il0 il0Var) {
        this.f27959b1 = il0Var;
    }

    public void setOnItemClickListener(jl0 jl0Var) {
        this.V0 = jl0Var;
    }

    public void setOnItemLongClickListener(ll0 ll0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.X0 = ll0Var;
        l2.g gVar = this.M1;
        boolean z10 = ll0Var != null;
        t20 t20Var = (t20) gVar.f12719b;
        t20Var.f27296t = z10;
        t20Var.f27297u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(s4.s0 s0Var) {
        this.f27958a1 = s0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.l1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.f28000w1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f27993s2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.T1 = z10;
    }

    public void setSections(boolean z10) {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsType(int i10) {
        this.f28004y1 = i10;
        if (i10 != 1 && i10 != 3) {
            return;
        }
        this.f27986p1 = new ArrayList();
        this.f27988q1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i10) {
        org.telegram.ui.Cells.z zVar = this.D1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i11 = this.C1;
        if (i11 == 8) {
            this.D1 = org.telegram.ui.ActionBar.j6.Y(i10, this.a2, 0);
        } else if (i11 == 9) {
            this.D1 = null;
        } else {
            int i12 = this.f27960b2;
            if (i12 > 0) {
                this.D1 = org.telegram.ui.ActionBar.j6.Y(i10, i12, i12);
            } else {
                int i13 = this.a2;
                if (i13 > 0 && i11 != 1) {
                    this.D1 = org.telegram.ui.ActionBar.j6.i0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.D1 = org.telegram.ui.ActionBar.j6.f0(i10, 2, -1);
                } else {
                    this.D1 = org.telegram.ui.ActionBar.j6.f0(i10, i11, i13);
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
        this.f27985o2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.C1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f28006z1 = z10;
    }

    public void setTopBottomSelectorRadius(int i10) {
        this.f27960b2 = i10;
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
        cl0 cl0Var = this.f27967f1;
        if (cl0Var != null) {
            cl0Var.setTranslationY(f7);
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

    public boolean t1() {
        return this.G;
    }

    public final void u1() {
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
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (this.Z0) {
            ml0 ml0Var = this.Y0;
            if (ml0Var != null) {
                ml0Var.p(i11);
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

    public vl0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.U0 = true;
        this.f27977k1 = true;
        this.f27992s1 = -1;
        this.f27994t1 = -1;
        this.f28006z1 = false;
        this.A1 = true;
        this.C1 = 2;
        this.G1 = new Rect();
        this.I1 = -1;
        this.T1 = true;
        this.f27978k2 = Float.MAX_VALUE;
        this.f27979l2 = Float.MAX_VALUE;
        this.f27989q2 = true;
        this.f27991r2 = new qe(1);
        this.f27993s2 = true;
        this.f27995t2 = new fg.q1(this, 1);
        this.D2 = new org.telegram.ui.Cells.l9(this, 17);
        this.P2 = new Path();
        this.f27987p2 = f6Var;
        st stVar = new st();
        this.E2 = stVar;
        setEdgeEffectFactory(stVar);
        setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18201s8, f6Var));
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 2, -1);
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
        super.setOnScrollListener(new al0(this, 0));
        this.E.add(new ql0(this, context));
    }

    public void setOnItemClickListener(kl0 kl0Var) {
        this.W0 = kl0Var;
    }

    public void setOnItemLongClickListener(ml0 ml0Var) {
        m1(ml0Var, ViewConfiguration.getLongPressTimeout());
    }
}
