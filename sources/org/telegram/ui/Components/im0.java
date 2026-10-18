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
public class im0 extends RecyclerView implements ch.a {
    public static int[] O2;
    public static boolean P2;
    public static final Method Q2;
    public static final Paint R2;
    public static final Paint S2;
    public static final Path T2;
    public static final float[] U2;
    public int A1;
    public boolean A2;
    public org.telegram.ui.Cells.z B1;
    public final org.telegram.ui.Cells.k7 B2;
    public int C1;
    public final wt C2;
    public View D1;
    public Matrix D2;
    public final Rect E1;
    public boolean E2;
    public boolean F1;
    public ul0 F2;
    public int G1;
    public Utilities.CallbackReturn G2;
    public boolean H1;
    public Utilities.Callback5 H2;
    public boolean I1;
    public ArrayList I2;
    public boolean J1;
    public float J2;
    public le.b K1;
    public float[] K2;
    public View L1;
    public float[] L2;
    public int M1;
    public ArrayList M2;
    public boolean N1;
    public final Path N2;
    public boolean O1;
    public boolean P1;
    public bm0 Q1;
    public boolean R1;
    public boolean S0;
    public tl0 S1;
    public wl0 T0;
    public rc0 T1;
    public xl0 U0;
    public boolean U1;
    public yl0 V0;
    public boolean V1;
    public zl0 W0;
    public boolean W1;
    public boolean X0;
    public int X1;
    public s4.r0 Y0;
    public int Y1;
    public vl0 Z0;
    public int Z1;
    public View f27259a1;
    public int a2;
    public ah.x f27260b1;
    public boolean f27261b2;
    public am0 f27262c1;
    public boolean f27263c2;
    public pl0 f27264d1;
    public int f27265d2;
    public em0 f27266e1;
    public int f27267e2;
    public boolean f27268f1;
    public org.telegram.ui.ui f27269f2;
    public boolean f27270g1;
    public boolean f27271g2;
    public boolean f27272h1;
    public boolean f27273h2;
    public boolean f27274i1;
    public float f27275i2;
    public Drawable f27276j1;
    public float f27277j2;
    public float f27278k1;
    public int[] f27279k2;
    public float l1;
    public nl0 f27280l2;
    public long f27281m1;
    public q0.a f27282m2;
    public ArrayList f27283n1;
    public final org.telegram.ui.ActionBar.d6 f27284n2;
    public ArrayList f27285o1;
    public boolean f27286o2;
    public View f27287p1;
    public final pe f27288p2;
    public int f27289q1;
    public boolean f27290q2;
    public int f27291r1;
    public final hg.o1 f27292r2;
    public int f27293s1;
    public Paint f27294s2;
    public int f27295t1;
    public boolean f27296t2;
    public int f27297u1;
    public GenericProvider f27298u2;
    public boolean f27299v1;
    public int f27300v2;
    public int f27301w1;
    public int f27302w2;
    public boolean f27303x1;
    public boolean f27304x2;
    public boolean f27305y1;
    public int f27306y2;
    public boolean f27307z1;
    public boolean f27308z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        Q2 = method;
        R2 = new Paint(1);
        S2 = new Paint(1);
        T2 = new Path();
        U2 = new float[8];
    }

    public im0(Context context) {
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
        Paint paint = R2;
        Paint paint2 = S2;
        if (z10) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.h6.m1(f11, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.h6.m1(f11, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(f11, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, d6Var)));
        if (f7 == f10) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f7, f7, paint2);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        Path path = T2;
        path.rewind();
        float[] fArr = U2;
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

    public static float u1(View view) {
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
        this.C2.f32212b.add(new tt(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.f27260b1 == null) {
            this.f27260b1 = new ah.x(this, getContext(), 20);
        }
        this.f27260b1.addView(clippingImageView, layoutParams);
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
        am0 am0Var = this.f27262c1;
        if (am0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(am0Var);
            this.f27262c1 = null;
        }
        View view = this.L1;
        if (view != null) {
            if (z10) {
                h1(view, 0.0f, 0.0f, false);
            }
            this.L1 = null;
            k1(null, view);
        }
        this.E1.setEmpty();
        bm0 bm0Var = this.Q1;
        if (bm0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bm0Var);
            this.Q1 = null;
        }
        this.N1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j10) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            s4.m0 X = X(i10);
            if ((X instanceof ch.a) && (X != this.F2 || this.E2)) {
                ((ch.a) X).f(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x10 = childAt.getX();
            float y3 = childAt.getY();
            if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                this.f27308z2 = true;
                drawChild(canvas, childAt, j10);
                this.f27308z2 = false;
            }
        }
    }

    public final void K0(boolean z10) {
        int i10;
        if (!this.f27270g1) {
            int i11 = 0;
            if (getAdapter() != null && this.f27259a1 != null) {
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
                    if (this.f27306y2 != i10) {
                        this.f27306y2 = i10;
                        if (i10 == 0) {
                            this.f27259a1.animate().setListener(null).cancel();
                            if (this.f27259a1.getVisibility() == 8) {
                                this.f27259a1.setVisibility(0);
                                this.f27259a1.setAlpha(0.0f);
                                if (this.X1 == 1) {
                                    this.f27259a1.setScaleX(0.7f);
                                    this.f27259a1.setScaleY(0.7f);
                                }
                            }
                            this.f27259a1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (this.f27259a1.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.f27259a1.animate().alpha(0.0f);
                            if (this.X1 == 1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new c80(this, 13)).start();
                        }
                    }
                } else {
                    this.f27306y2 = i10;
                    this.f27259a1.setVisibility(i10);
                    this.f27259a1.setAlpha(1.0f);
                }
                if (this.f27305y1) {
                    if (S0) {
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
        pl0 pl0Var;
        int paddingTop;
        s4.b1 T;
        pl0 pl0Var2;
        View view;
        boolean z11;
        int i10;
        s4.b1 T3;
        int b10;
        int S;
        boolean z12;
        int i11;
        int i12;
        if (((this.I1 || z10) && this.f27264d1 != null) || (this.f27301w1 != 0 && this.f27266e1 != null)) {
            s4.n0 layoutManager = getLayoutManager();
            if (layoutManager instanceof s4.b0) {
                s4.b0 b0Var = (s4.b0) layoutManager;
                if (b0Var.f45898o == 1) {
                    if (this.f27266e1 != null) {
                        if (this.f27301w1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i13 = this.f27301w1;
                        float f7 = 32.0f;
                        int i14 = Integer.MAX_VALUE;
                        if (i13 != 1 && i13 != 3) {
                            if (i13 == 2) {
                                this.l1 = 0.0f;
                                if (this.f27266e1.h() != 0) {
                                    int childCount = getChildCount();
                                    int i15 = 0;
                                    int i16 = Integer.MAX_VALUE;
                                    View view2 = null;
                                    View view3 = null;
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        View childAt = getChildAt(i17);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f27297u1 + paddingTop) {
                                            if (bottom < i14) {
                                                view3 = childAt;
                                                i14 = bottom;
                                            }
                                            i15 = Math.max(i15, bottom);
                                            if (bottom >= AndroidUtilities.dp(32.0f) + this.f27297u1 + paddingTop && bottom < i16) {
                                                view2 = childAt;
                                                i16 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T3 = T(view3)) != null && (S = this.f27266e1.S((b10 = T3.b()))) >= 0) {
                                        if (this.f27289q1 != S || this.f27287p1 == null) {
                                            View view4 = this.f27287p1;
                                            if (view4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            View T4 = this.f27266e1.T(S, view4);
                                            if (z12) {
                                                T0(T4, false);
                                            }
                                            this.f27287p1 = T4;
                                            T4.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f27287p1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f27287p1.getMeasuredHeight());
                                            this.f27289q1 = S;
                                        }
                                        if (this.f27287p1 != null && view2 != null && view2.getClass() != this.f27287p1.getClass()) {
                                            this.l1 = 1.0f;
                                        }
                                        int M = this.f27266e1.M(S);
                                        int Q = this.f27266e1.Q(b10);
                                        if (i15 != 0 && i15 < getMeasuredHeight() - getPaddingBottom()) {
                                            i11 = -paddingTop;
                                        } else {
                                            i11 = this.f27297u1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f27287p1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f27297u1);
                                            if (height2 < height) {
                                                i12 = height2 - height;
                                            } else {
                                                i12 = paddingTop;
                                            }
                                            if (i12 < 0) {
                                                this.f27287p1.setTag(Integer.valueOf(paddingTop + i11 + i12));
                                            } else {
                                                this.f27287p1.setTag(Integer.valueOf(paddingTop + i11));
                                            }
                                        } else {
                                            this.f27287p1.setTag(Integer.valueOf(paddingTop + i11));
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
                            if (bottom2 > this.f27297u1 + paddingTop) {
                                if (bottom2 < i14) {
                                    i14 = bottom2;
                                    view6 = childAt2;
                                }
                                i19 = Math.max(i19, bottom2);
                                if (bottom2 >= AndroidUtilities.dp(f10) + this.f27297u1 + paddingTop && bottom2 < i20) {
                                    i20 = bottom2;
                                }
                            }
                            i18++;
                            f7 = f10;
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(b0Var.N0() - b11) + 1;
                            if ((this.I1 || z10) && (pl0Var2 = this.f27264d1) != null && !pl0Var2.f29351n && (getAdapter() instanceof ql0)) {
                                this.f27264d1.setProgress(Math.min(1.0f, b11 / ((this.f27266e1.h() - abs) + 1)));
                            }
                            this.f27285o1.addAll(this.f27283n1);
                            this.f27283n1.clear();
                            if (this.f27266e1.h() != 0) {
                                if (this.f27289q1 != b11 || this.f27291r1 != abs) {
                                    this.f27289q1 = b11;
                                    this.f27291r1 = abs;
                                    this.f27295t1 = 1;
                                    int S3 = this.f27266e1.S(b11);
                                    this.f27293s1 = S3;
                                    int M2 = (this.f27266e1.M(S3) + b11) - this.f27266e1.Q(b11);
                                    while (M2 < b11 + abs) {
                                        M2 += this.f27266e1.M(this.f27293s1 + this.f27295t1);
                                        this.f27295t1++;
                                    }
                                }
                                if (this.f27301w1 != 3) {
                                    int i21 = b11;
                                    for (int i22 = this.f27293s1; i22 < this.f27293s1 + this.f27295t1; i22++) {
                                        if (!this.f27285o1.isEmpty()) {
                                            view = (View) this.f27285o1.get(0);
                                            this.f27285o1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        View T5 = this.f27266e1.T(i22, view);
                                        if (z11) {
                                            T0(T5, false);
                                        }
                                        this.f27283n1.add(T5);
                                        int M3 = this.f27266e1.M(i22);
                                        if (i22 == this.f27293s1) {
                                            int Q3 = this.f27266e1.Q(i21);
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
                                            i21 = (M3 - this.f27266e1.Q(b11)) + i21;
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
                        if ((this.I1 || z10) && (pl0Var = this.f27264d1) != null && !pl0Var.f29351n) {
                            s4.g0 adapter = getAdapter();
                            if (adapter instanceof ql0) {
                                ql0 ql0Var = (ql0) adapter;
                                float H = ql0Var.H(this);
                                this.f27264d1.setIsVisible(ql0Var.E(this));
                                this.f27264d1.setProgress(Math.min(1.0f, H));
                                this.f27264d1.a(false);
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
        int[] iArr = this.f27279k2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f7, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.ui uiVar = this.f27269f2;
            int[] iArr2 = this.f27279k2;
            org.telegram.ui.sn snVar = uiVar.d;
            iArr2[0] = (int) snVar.f41363s9;
            iArr2[1] = snVar.Ba;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.f27267e2;
                if (i11 != S) {
                    int i12 = this.f27265d2;
                    if (i11 <= i12 && S <= i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.sn snVar2 = this.f27269f2.d;
                    org.telegram.ui.fm fmVar = snVar2.A0;
                    ArrayList arrayList = snVar2.f41386u6;
                    int i13 = S - fmVar.J;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) snVar2.f41425x6.f(messageObject.getGroupId())) != null) {
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
                        int i14 = this.f27267e2;
                        if (S > i14) {
                            if (!this.f27269f2.f41973a) {
                                for (int i15 = i14 + 1; i15 <= S; i15++) {
                                    if (i15 != this.f27265d2 && this.f27269f2.a(i15)) {
                                        this.f27269f2.b(i15, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i14 > S) {
                                if (i14 != this.f27265d2 && this.f27269f2.a(i14)) {
                                    this.f27269f2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        }
                    } else {
                        int i16 = this.f27267e2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.f27265d2 && this.f27269f2.a(i16)) {
                                    this.f27269f2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.f27269f2.f41973a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.f27265d2 && this.f27269f2.a(i17)) {
                                    this.f27269f2.b(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f27269f2.f41973a) {
                    this.f27267e2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void N0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (view != null && t1(view) && ((Boolean) this.F2.f31041a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z12 = false;
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                if (U0 != null && ((Boolean) this.F2.f31041a.run(U0)).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (U02 != null && ((Boolean) this.F2.f31041a.run(U02)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(-this.J2, u1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.J2), G0(view)));
            if (z10 && z11) {
                if (u1(view) >= rectF.top) {
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
            Path path = this.N2;
            if (!z10 && !z11) {
                path.rewind();
                float f7 = this.J2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z10) {
                path.rewind();
                path.addRoundRect(rectF, this.K2, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.L2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void P0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f7;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof e90) {
                f7 = ((e90) view2).getBottomInfoMargin();
            } else {
                f7 = 0.0f;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float left = view.getLeft();
            float f12 = -this.J2;
            float u12 = u1(view);
            if (z10) {
                f10 = this.J2;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(f12, u12 - f10);
            float right = view.getRight();
            float height = getHeight() - (-this.J2);
            float G0 = G0(view2);
            if (z11) {
                f11 = this.J2;
            }
            rectF.set(left, max, right, Math.min(height, (G0 + f11) - f7));
            if (rectF.bottom >= rectF.top) {
                this.H2.mo0run(canvas, rectF, Float.valueOf(this.J2), Float.valueOf(this.J2), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void Q0(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.im0.Q0(android.graphics.Canvas):void");
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.E1;
        if (!rect.isEmpty() && (zVar = this.B1) != null) {
            int i10 = this.G1;
            if ((i10 == -2 || i10 == this.C1) && this.D1 != null) {
                if (getAdapter() instanceof hm0) {
                    ((hm0) getAdapter()).getClass();
                }
                this.B1.setBounds(this.D1.getLeft(), this.D1.getTop(), this.D1.getRight(), this.D1.getBottom());
            } else {
                zVar.setBounds(rect);
            }
            canvas.save();
            int i11 = this.G1;
            if ((i11 == -2 || i11 == this.C1) && (aVar = this.f27282m2) != null) {
                aVar.accept(canvas);
            }
            int i12 = this.G1;
            if ((i12 == -2 || i12 == this.C1) && (view = this.D1) != null) {
                canvas.translate(view.getX() - rect.left, this.D1.getY() - rect.top);
                this.B1.setAlpha((int) (this.D1.getAlpha() * 255.0f));
            }
            if (b1()) {
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
            int i10 = this.f27301w1;
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
        if (view.getParent() == this && b1() && ((Boolean) this.F2.f31041a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z13 = true;
            if (R == -1) {
                z12 = false;
                z11 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                if (U0 != null && ((Boolean) this.F2.f31041a.run(U0)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (U02 != null && ((Boolean) this.F2.f31041a.run(U02)).booleanValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            RectF rectF = new RectF();
            rectF.set(view.getX(), Math.max(0.0f, u1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
            if (z11 && z12 && !z10) {
                if (u1(view) >= rectF.top) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (G0(view) > rectF.bottom) {
                    z13 = false;
                }
                if (z11 && z13) {
                    return org.telegram.ui.ActionBar.h6.c0(0, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, this.f27284n2));
                }
                z12 = z13;
            }
            Path path = new Path();
            if ((!z11 && !z12) || z10) {
                path.rewind();
                float f7 = this.J2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.K2, Path.Direction.CW);
            } else if (!z12) {
                path.rewind();
                path.addRoundRect(rectF, this.L2, Path.Direction.CW);
            }
            return new ol0(this, view, path, rectF);
        }
        return null;
    }

    public Integer W0(int i10) {
        GenericProvider genericProvider = this.f27298u2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint X0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27284n2;
        if (d6Var != null) {
            paint = d6Var.n(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    public final boolean Y0(int i10, View view) {
        int R;
        if (view != null && i10 <= 0 && getAdapter() != null && this.G2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.G2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Z0() {
        vt[] vtVarArr;
        for (vt vtVar : this.C2.f32211a) {
            if (vtVar != null && vtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i10, View view) {
        int R;
        if (view != null && i10 >= getChildCount() - 1 && getAdapter() != null && this.G2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().h() - 1) {
            return ((Boolean) this.G2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
        }
        return false;
    }

    public final boolean b1() {
        if (this.F2 != null) {
            return true;
        }
        return false;
    }

    public final void c1() {
        if (!this.f27270g1) {
            this.f27270g1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.f27259a1;
            if (view != null && view.getVisibility() != 8) {
                this.f27259a1.setVisibility(8);
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
            h1(view, 0.0f, 0.0f, false);
            this.L1 = null;
            if (z10) {
                k1(null, view);
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
        nl0 nl0Var = this.f27280l2;
        if (nl0Var != null) {
            im0 im0Var = nl0Var.f28789a;
            if (nl0Var.d || nl0Var.e) {
                for (int i10 = 0; i10 < im0Var.getChildCount(); i10++) {
                    View childAt = im0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !nl0Var.f28791c.contains(childAt)) {
                        Float f10 = (Float) nl0Var.f28790b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                nl0Var.d = false;
            }
        }
        if (this.S0 && this.f27307z1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.S0 && !this.f27307z1) {
            R0(canvas);
        }
        ah.x xVar = this.f27260b1;
        if (xVar != null) {
            xVar.draw(canvas);
        }
        if (!this.f27303x1) {
            int i11 = this.f27301w1;
            float f11 = 0.0f;
            if (i11 == 1) {
                if (this.f27266e1 != null && !this.f27283n1.isEmpty()) {
                    for (int i12 = 0; i12 < this.f27283n1.size(); i12++) {
                        View view2 = (View) this.f27283n1.get(i12);
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
            } else if (i11 == 2 && this.f27266e1 != null && (view = this.f27287p1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f27287p1.getTag()).intValue();
                if (LocaleController.isRTL) {
                    f11 = getWidth() - this.f27287p1.getWidth();
                }
                canvas.translate(f11, intValue2);
                Drawable drawable = this.f27276j1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f27287p1.getMeasuredHeight(), getWidth(), this.f27276j1.getIntrinsicHeight() + this.f27287p1.getMeasuredHeight());
                    this.f27276j1.setAlpha((int) (this.f27278k1 * 255.0f));
                    this.f27276j1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.f27281m1);
                    this.f27281m1 = elapsedRealtime;
                    float f12 = this.f27278k1;
                    float f13 = this.l1;
                    if (f12 < f13) {
                        float f14 = (((float) min) / 180.0f) + f12;
                        this.f27278k1 = f14;
                        if (f14 > f13) {
                            this.f27278k1 = f13;
                        }
                        invalidate();
                    } else if (f12 > f13) {
                        float f15 = f12 - (((float) min) / 180.0f);
                        this.f27278k1 = f15;
                        if (f15 < f13) {
                            this.f27278k1 = f13;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f27287p1.getMeasuredHeight());
                this.f27287p1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f27302w2 == 0 && this.f27304x2) {
                setOverScrollMode(0);
            }
            this.f27302w2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.f27302w2 - 1;
            this.f27302w2 = i10;
            if (i10 == 0 && this.f27304x2) {
                setOverScrollMode(2);
            }
        }
        pl0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.f29336a0 && fastScroll.f29349k0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f27266e1 != null && (view = this.f27287p1) != null && view.getAlpha() != 0.0f && this.f27287p1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (b1() && !this.f27308z2) {
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
        w1();
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            aVar.f4357a = true;
        } else if (Z0() && getOverScrollMode() != 2) {
            aVar.f4357a = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i10 = 0; i10 < itemDecorationCount; i10++) {
                s4.m0 X = X(i10);
                if ((X instanceof ch.a) && (X != this.F2 || this.E2)) {
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

    public final void e1(tl0 tl0Var, int i10, boolean z10) {
        rc0 rc0Var = this.T1;
        if (rc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rc0Var);
            this.T1 = null;
        }
        s4.b1 K = K(tl0Var.run());
        if (K != null) {
            View view = K.f45910a;
            int c10 = K.c();
            this.f27300v2 = c10;
            i1(c10, view);
            org.telegram.ui.Cells.z zVar = this.B1;
            if (zVar != null) {
                Drawable current = zVar.getCurrent();
                if (current instanceof TransitionDrawable) {
                    if (this.V0 == null && this.U0 == null) {
                        ((TransitionDrawable) current).resetTransition();
                    } else {
                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                    }
                }
                this.B1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
            }
            org.telegram.ui.Cells.z zVar2 = this.B1;
            if (zVar2 != null && zVar2.isStateful() && this.B1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.B1);
            }
            if (i10 > 0) {
                this.S1 = null;
                rc0 rc0Var2 = new rc0(this, 19);
                this.T1 = rc0Var2;
                AndroidUtilities.runOnUIThread(rc0Var2, i10);
            }
        } else if (z10) {
            this.S1 = tl0Var;
        }
    }

    public void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Z0() && getOverScrollMode() != 2) {
            if (this.D2 == null) {
                this.D2 = new Matrix();
            }
            canvas.save();
            if (getMatrix().invert(this.D2)) {
                canvas.concat(this.D2);
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
        if (getAdapter() instanceof hm0) {
            s4.b1 G = G(view);
            if (G != null) {
                view.setEnabled(((hm0) getAdapter()).D(G));
                if (this.f27286o2) {
                    view.setAccessibilityDelegate(this.f27288p2);
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
            if (childAt instanceof org.telegram.ui.ActionBar.y5) {
                ((org.telegram.ui.ActionBar.y5) childAt).d();
            }
            childAt.invalidate();
        }
    }

    public final boolean g1(int i10) {
        if (this.I2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.I2.size(); i11++) {
                long longValue = ((Long) this.I2.get(i11)).longValue();
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
        return this.f27259a1;
    }

    public pl0 getFastScroll() {
        return this.f27264d1;
    }

    public ArrayList<View> getHeaders() {
        return this.f27283n1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f27285o1;
    }

    public wl0 getOnItemClickListener() {
        return this.T0;
    }

    public s4.r0 getOnScrollListener() {
        return this.Y0;
    }

    public View getPinnedHeader() {
        return this.f27287p1;
    }

    public View getPressedChildView() {
        return this.L1;
    }

    public Drawable getSelectorDrawable() {
        return this.B1;
    }

    public Rect getSelectorRect() {
        return this.E1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public void h1(View view, float f7, float f10, boolean z10) {
        if (!this.f27272h1 && view != null) {
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
        rc0 rc0Var = this.T1;
        if (rc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rc0Var);
            this.T1 = null;
            this.S1 = null;
        }
        if (this.B1 != null) {
            if (i10 != this.C1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getAdapter() instanceof hm0) {
                ((hm0) getAdapter()).getClass();
            }
            if (i10 != -1) {
                this.C1 = i10;
            }
            this.D1 = view;
            if (this.A1 == 8) {
                org.telegram.ui.ActionBar.h6.B1(this.B1, this.Y1, 0);
            } else if (this.Z1 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.z zVar = this.B1;
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
                org.telegram.ui.ActionBar.h6.B1(zVar, i11, i12);
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

    public final void j1() {
        int i10;
        rc0 rc0Var = this.T1;
        if (rc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rc0Var);
            this.T1.run();
            this.T1 = null;
            this.D1 = null;
            return;
        }
        this.T1 = null;
        this.S1 = null;
        View view = this.D1;
        if (view != null && (i10 = this.f27300v2) != -1) {
            i1(i10, view);
            org.telegram.ui.Cells.z zVar = this.B1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.B1);
            }
            this.D1 = null;
            this.f27300v2 = -1;
            return;
        }
        org.telegram.ui.Cells.z zVar2 = this.B1;
        if (zVar2 != null) {
            Drawable current = zVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.z zVar3 = this.B1;
        if (zVar3 != null && zVar3.isStateful() && this.B1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.B1);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.B1;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    public final void k1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.E1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    i1(this.M1, view);
                    org.telegram.ui.Cells.z zVar = this.B1;
                    if (zVar != null) {
                        Drawable current = zVar.getCurrent();
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
                w1();
            }
        }
    }

    public final void l1(im0 im0Var, boolean z10) {
        ViewParent parent;
        if (im0Var != null && (parent = im0Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void m1(int i10, boolean z10) {
        this.W1 = z10;
        this.X1 = i10;
    }

    public final void n1(zl0 zl0Var, long j10) {
        boolean z10;
        this.W0 = zl0Var;
        le.b bVar = this.K1;
        if (zl0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t20 t20Var = (t20) bVar.f16008b;
        t20Var.f30451t = z10;
        t20Var.f30452u = j10;
    }

    public final void o1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.A2 = true;
        setPadding(i10, i11, i12, i13);
        this.A2 = false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        pl0 pl0Var = this.f27264d1;
        if (pl0Var != null && pl0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f27264d1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f27264d1);
            }
            ((ViewGroup) getParent()).addView(this.f27264d1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        nl0 nl0Var = this.f27280l2;
        if (nl0Var != null) {
            nl0Var.a();
        }
        if (this.f27296t2) {
            this.f27296t2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.O1) {
                l1(this, true);
            }
            if (this.Z0 != null) {
                int i10 = org.telegram.ui.sn.Ic;
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
        pl0 pl0Var = this.f27264d1;
        if (pl0Var != null) {
            this.H1 = true;
            if (pl0Var.f29335a) {
                i14 = getPaddingTop();
            } else {
                i14 = pl0Var.f29346h0;
            }
            int i15 = i11 + i14;
            pl0 pl0Var2 = this.f27264d1;
            if (pl0Var2.f29345g0) {
                pl0Var2.layout(0, i15, pl0Var2.getMeasuredWidth(), this.f27264d1.getMeasuredHeight() + i15);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f27264d1.getMeasuredWidth();
                pl0 pl0Var3 = this.f27264d1;
                pl0Var3.layout(measuredWidth, i15, pl0Var3.getMeasuredWidth() + measuredWidth, this.f27264d1.getMeasuredHeight() + i15);
            }
            this.H1 = false;
        }
        L0(false);
        tl0 tl0Var = this.S1;
        if (tl0Var != null) {
            e1(tl0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        pl0 pl0Var = this.f27264d1;
        if (pl0Var != null && pl0Var.getLayoutParams() != null) {
            pl0 pl0Var2 = this.f27264d1;
            if (pl0Var2.f29335a) {
                i12 = getPaddingTop();
            } else {
                i12 = pl0Var2.f29346h0;
            }
            int measuredHeight = (getMeasuredHeight() - i12) - getPaddingBottom();
            this.f27264d1.getLayoutParams().height = measuredHeight;
            this.f27264d1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.a2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        ah.x xVar = this.f27260b1;
        if (xVar != null) {
            xVar.requestLayout();
        }
        int i14 = this.f27301w1;
        if (i14 == 1) {
            if (this.f27266e1 != null && !this.f27283n1.isEmpty()) {
                for (int i15 = 0; i15 < this.f27283n1.size(); i15++) {
                    T0((View) this.f27283n1.get(i15), true);
                }
            }
        } else if (i14 == 2 && this.f27266e1 != null && (view = this.f27287p1) != null) {
            T0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        pl0 pl0Var = this.f27264d1;
        if (pl0Var != null && pl0Var.f29351n) {
            return false;
        }
        boolean z10 = this.f27261b2;
        org.telegram.ui.Cells.k7 k7Var = this.B2;
        if (z10 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f27275i2 == Float.MAX_VALUE && this.f27277j2 == Float.MAX_VALUE) {
                this.f27275i2 = motionEvent.getX();
                this.f27277j2 = motionEvent.getY();
            }
            if (!this.f27263c2 && Math.abs(motionEvent.getY() - this.f27277j2) > this.a2) {
                this.f27263c2 = true;
                l1(this, true);
            }
            if (this.f27263c2) {
                M0(motionEvent.getX(), motionEvent.getY());
                org.telegram.ui.ui uiVar = this.f27269f2;
                int[] iArr = this.f27279k2;
                org.telegram.ui.sn snVar = uiVar.d;
                iArr[0] = (int) snVar.f41363s9;
                iArr[1] = snVar.Ba;
                if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.f27279k2[1] && (this.f27267e2 >= this.f27265d2 || !this.f27269f2.f41973a)) {
                    this.f27273h2 = false;
                    if (!this.f27271g2) {
                        this.f27271g2 = true;
                        AndroidUtilities.cancelRunOnUIThread(k7Var);
                        AndroidUtilities.runOnUIThread(k7Var);
                        return true;
                    }
                } else if (motionEvent.getY() < AndroidUtilities.dp(56.0f) + this.f27279k2[0] && (this.f27267e2 <= this.f27265d2 || !this.f27269f2.f41973a)) {
                    this.f27273h2 = true;
                    if (!this.f27271g2) {
                        this.f27271g2 = true;
                        AndroidUtilities.cancelRunOnUIThread(k7Var);
                        AndroidUtilities.runOnUIThread(k7Var);
                        return true;
                    }
                } else {
                    this.f27271g2 = false;
                    AndroidUtilities.cancelRunOnUIThread(k7Var);
                }
            }
            return true;
        }
        this.f27275i2 = Float.MAX_VALUE;
        this.f27277j2 = Float.MAX_VALUE;
        this.f27261b2 = false;
        this.f27263c2 = false;
        l1(this, false);
        this.f27271g2 = false;
        AndroidUtilities.cancelRunOnUIThread(k7Var);
        return super.onTouchEvent(motionEvent);
    }

    public void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void q1(int i10, float f7, boolean z10) {
        r1(new gi.c(5), i10, f7, new tv(this, 16), z10);
    }

    public final void r1(Utilities.CallbackReturn callbackReturn, int i10, float f7, Utilities.Callback5 callback5, boolean z10) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new ei.e5(this, callbackReturn, sparseIntArray, 3), new vi(sparseIntArray, 2));
        s1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f7, callback5, z10);
    }

    @Override
    public void requestLayout() {
        if (!this.V1 && !this.A2) {
            super.requestLayout();
        }
    }

    public final void s1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, Utilities.Callback5 callback5, boolean z10) {
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21093j6, this.f27284n2));
        this.G2 = callbackReturn2;
        this.J2 = f7;
        this.K2 = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.L2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
        this.H2 = callback5;
        s4.m0 m0Var = this.F2;
        if (m0Var != null) {
            p0(m0Var);
        }
        ul0 ul0Var = new ul0(this, callbackReturn, i10, z10);
        this.F2 = ul0Var;
        i(ul0Var);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f27286o2 = z10;
    }

    @Override
    public void setAdapter(s4.g0 g0Var) {
        s4.g0 adapter = getAdapter();
        hg.o1 o1Var = this.f27292r2;
        if (adapter != null) {
            adapter.f45955a.unregisterObserver(o1Var);
        }
        ArrayList arrayList = this.f27283n1;
        if (arrayList != null) {
            arrayList.clear();
            this.f27285o1.clear();
        }
        this.f27289q1 = -1;
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        this.f27287p1 = null;
        if (g0Var instanceof em0) {
            this.f27266e1 = (em0) g0Var;
        } else {
            this.f27266e1 = null;
        }
        super.setAdapter(g0Var);
        if (g0Var != null) {
            g0Var.B(o1Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f27274i1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f27299v1 = z10;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.E2 = z10;
    }

    public void setDisableHighlightState(boolean z10) {
        this.f27272h1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.O1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.S0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.f27307z1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.f27259a1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.f27259a1 = view;
            if (this.W1 && view != null) {
                view.setVisibility(8);
            }
            if (this.f27270g1) {
                View view3 = this.f27259a1;
                if (view3 != null) {
                    this.f27306y2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.f27306y2 = -1;
            K0(false);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.f27264d1 = new pl0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f27264d1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        int i10;
        pl0 pl0Var = this.f27264d1;
        if (pl0Var == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        pl0Var.setVisibility(i10);
        this.f27264d1.f29336a0 = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.f27305y1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.P1 = z10;
    }

    @Override
    public void setItemAnimator(s4.l0 l0Var) {
        super.setItemAnimator(l0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.f27298u2 = genericProvider;
    }

    public void setItemsEnterAnimator(nl0 nl0Var) {
        this.f27280l2 = nl0Var;
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i10;
        org.telegram.ui.Cells.z zVar = this.B1;
        if (num == null) {
            if (b1()) {
                i10 = org.telegram.ui.ActionBar.h6.f21093j6;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f21075i6;
            }
            intValue = org.telegram.ui.ActionBar.h6.w0(i10, this.f27284n2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.h6.C1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(vl0 vl0Var) {
        this.Z0 = vl0Var;
    }

    public void setOnItemClickListener(wl0 wl0Var) {
        this.T0 = wl0Var;
    }

    public void setOnItemLongClickListener(yl0 yl0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.V0 = yl0Var;
        le.b bVar = this.K1;
        boolean z10 = yl0Var != null;
        t20 t20Var = (t20) bVar.f16008b;
        t20Var.f30451t = z10;
        t20Var.f30452u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(s4.r0 r0Var) {
        this.Y0 = r0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.f27276j1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.f27297u1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f27290q2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.R1 = z10;
    }

    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsType(int i10) {
        this.f27301w1 = i10;
        if (i10 != 1 && i10 != 3) {
            return;
        }
        this.f27283n1 = new ArrayList();
        this.f27285o1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i10) {
        org.telegram.ui.Cells.z zVar = this.B1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i11 = this.A1;
        if (i11 == 8) {
            this.B1 = org.telegram.ui.ActionBar.h6.Z(i10, this.Y1, 0);
        } else if (i11 == 9) {
            this.B1 = null;
        } else {
            int i12 = this.Z1;
            if (i12 > 0) {
                this.B1 = org.telegram.ui.ActionBar.h6.Z(i10, i12, i12);
            } else {
                int i13 = this.Y1;
                if (i13 > 0 && i11 != 1) {
                    this.B1 = org.telegram.ui.ActionBar.h6.j0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.B1 = org.telegram.ui.ActionBar.h6.g0(i10, 2, -1);
                } else {
                    this.B1 = org.telegram.ui.ActionBar.h6.g0(i10, i11, i13);
                }
            }
        }
        org.telegram.ui.Cells.z zVar2 = this.B1;
        if (zVar2 != null) {
            zVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i10) {
        this.Y1 = i10;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.f27282m2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.A1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f27303x1 = z10;
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
        pl0 pl0Var = this.f27264d1;
        if (pl0Var != null) {
            pl0Var.setTranslationY(f7);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (O2 != null) {
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

    public boolean t1(View view) {
        return true;
    }

    @Override
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (this.X0) {
            zl0 zl0Var = this.W0;
            if (zl0Var != null) {
                zl0Var.o(i11);
            }
            iArr[0] = i10;
            iArr[1] = i11;
            return true;
        }
        return super.v(i10, i11, i12, iArr, iArr2);
    }

    public boolean v1() {
        return this.G;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.B1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w1() {
        org.telegram.ui.Cells.z zVar = this.B1;
        if (zVar != null && zVar.isStateful()) {
            if (this.L1 != null) {
                if (this.B1.setState(getDrawableStateForSelector())) {
                    invalidateDrawable(this.B1);
                }
            } else if (this.T1 == null) {
                this.B1.setState(StateSet.NOTHING);
            }
        }
    }

    public im0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.S0 = true;
        this.f27274i1 = true;
        this.f27289q1 = -1;
        this.f27291r1 = -1;
        this.f27303x1 = false;
        this.f27305y1 = true;
        this.A1 = 2;
        this.E1 = new Rect();
        this.G1 = -1;
        this.R1 = true;
        this.f27275i2 = Float.MAX_VALUE;
        this.f27277j2 = Float.MAX_VALUE;
        this.f27286o2 = true;
        this.f27288p2 = new pe(1);
        this.f27290q2 = true;
        this.f27292r2 = new hg.o1(this, 1);
        this.B2 = new org.telegram.ui.Cells.k7(this, 18);
        this.N2 = new Path();
        this.f27284n2 = d6Var;
        wt wtVar = new wt();
        this.C2 = wtVar;
        setEdgeEffectFactory(wtVar);
        setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21265s8, d6Var));
        org.telegram.ui.Cells.z g02 = org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, d6Var), 2, -1);
        this.B1 = g02;
        g02.setCallback(this);
        try {
            if (!P2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                O2 = iArr;
                if (iArr == null) {
                    O2 = new int[0];
                }
                P2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(O2);
            Method method = Q2;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.setOnScrollListener(new kv(this, 7));
        this.E.add(new dm0(this, context));
    }

    public void setOnItemClickListener(xl0 xl0Var) {
        this.U0 = xl0Var;
    }

    public void setOnItemLongClickListener(zl0 zl0Var) {
        n1(zl0Var, ViewConfiguration.getLongPressTimeout());
    }
}
