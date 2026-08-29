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
public class jl0 extends RecyclerView implements mg.a {
    public static int[] M2;
    public static boolean N2;
    public static final Method O2;
    public static final Paint P2;
    public static final Paint Q2;
    public static final Path R2;
    public static final float[] S2;
    public int A1;
    public final ft A2;
    public View B1;
    public Matrix B2;
    public final Rect C1;
    public boolean C2;
    public boolean D1;
    public xk0 D2;
    public int E1;
    public Utilities.CallbackReturn E2;
    public boolean F1;
    public Utilities.Callback5 F2;
    public boolean G1;
    public ArrayList G2;
    public boolean H1;
    public float H2;
    public o4.g I1;
    public float[] I2;
    public View J1;
    public float[] J2;
    public int K1;
    public ArrayList K2;
    public boolean L1;
    public final Path L2;
    public boolean M1;
    public boolean N1;
    public dl0 O1;
    public boolean P1;
    public boolean Q0;
    public wk0 Q1;
    public zk0 R0;
    public xb0 R1;
    public al0 S0;
    public boolean S1;
    public bl0 T0;
    public boolean T1;
    public cl0 U0;
    public boolean U1;
    public boolean V0;
    public int V1;
    public f2.a1 W0;
    public int W1;
    public yk0 X0;
    public int X1;
    public View Y0;
    public int Y1;
    public bg.x2 Z0;
    public boolean Z1;
    public dg.d f29688a1;
    public boolean a2;
    public sk0 f29689b1;
    public int f29690b2;
    public fl0 f29691c1;
    public int f29692c2;
    public boolean f29693d1;
    public org.telegram.ui.hi f29694d2;
    public boolean f29695e1;
    public boolean f29696e2;
    public boolean f29697f1;
    public boolean f29698f2;
    public boolean f29699g1;
    public float f29700g2;
    public Drawable f29701h1;
    public float f29702h2;
    public float f29703i1;
    public int[] f29704i2;
    public float f29705j1;
    public pk0 f29706j2;
    public long f29707k1;
    public q0.a f29708k2;
    public ArrayList l1;
    public final org.telegram.ui.ActionBar.c6 f29709l2;
    public ArrayList f29710m1;
    public boolean f29711m2;
    public View f29712n1;
    public final ie f29713n2;
    public int f29714o1;
    public boolean f29715o2;
    public int f29716p1;
    public final f2.f1 f29717p2;
    public int f29718q1;
    public Paint f29719q2;
    public int f29720r1;
    public boolean f29721r2;
    public int f29722s1;
    public GenericProvider f29723s2;
    public boolean f29724t1;
    public int f29725t2;
    public int f29726u1;
    public int f29727u2;
    public boolean f29728v1;
    public boolean f29729v2;
    public boolean f29730w1;
    public int f29731w2;
    public boolean f29732x1;
    public boolean f29733x2;
    public int f29734y1;
    public boolean f29735y2;
    public org.telegram.ui.Cells.z f29736z1;
    public final lh.m7 f29737z2;

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

    public jl0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        if (view.getTag(R.id.dragging) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static void N0(Canvas canvas, RectF rectF, float f9, float f10, float f11, org.telegram.ui.ActionBar.c6 c6Var) {
        boolean z10 = SharedConfig.shadowsInSections;
        Paint paint = P2;
        Paint paint2 = Q2;
        if (z10) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.g6.l1(f11, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.g6.l1(f11, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(f11, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var)));
        if (f9 == f10) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f9, f9, paint2);
            }
            canvas.drawRoundRect(rectF, f9, f9, paint);
            return;
        }
        Path path = R2;
        path.rewind();
        float[] fArr = S2;
        fArr[3] = f9;
        fArr[2] = f9;
        fArr[1] = f9;
        fArr[0] = f9;
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
        this.A2.f28529b.add(new dt(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.Z0 == null) {
            this.Z0 = new bg.x2(this, getContext(), 24);
        }
        this.Z0.addView(clippingImageView, layoutParams);
    }

    @Override
    public final View E(float f9, float f10) {
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
                    if (f9 >= childAt.getLeft() + f11 && f9 <= childAt.getRight() + f11 && f10 >= childAt.getTop() + f12 && f10 <= childAt.getBottom() + f12) {
                        return childAt;
                    }
                }
            }
        }
        return null;
    }

    public boolean E0(float f9) {
        return true;
    }

    public boolean F0(View view) {
        return true;
    }

    public boolean H0(View view, float f9, float f10) {
        return true;
    }

    public final void I0(boolean z10) {
        dg.d dVar = this.f29688a1;
        if (dVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dVar);
            this.f29688a1 = null;
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
        dl0 dl0Var = this.O1;
        if (dl0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(dl0Var);
            this.O1 = null;
        }
        this.L1 = false;
    }

    public final void J0(boolean z10) {
        int i10;
        if (!this.f29695e1) {
            int i11 = 0;
            if (getAdapter() != null && this.Y0 != null) {
                boolean S0 = S0();
                if (S0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if ((this.U1 && SharedConfig.animationsEnabled()) ? false : false) {
                    if (this.f29731w2 != i10) {
                        this.f29731w2 = i10;
                        if (i10 == 0) {
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
                            alpha.setDuration(150L).setListener(new zz(this, 15)).start();
                        }
                    }
                } else {
                    this.f29731w2 = i10;
                    this.Y0.setVisibility(i10);
                    this.Y0.setAlpha(1.0f);
                }
                if (this.f29730w1) {
                    if (S0) {
                        i11 = 4;
                    }
                    if (getVisibility() != i11) {
                        setVisibility(i11);
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
        sk0 sk0Var;
        int paddingTop;
        f2.n1 T;
        sk0 sk0Var2;
        View view;
        boolean z11;
        int i10;
        f2.n1 T2;
        int b10;
        int S;
        boolean z12;
        int i11;
        int i12;
        if (((this.G1 || z10) && this.f29689b1 != null) || (this.f29726u1 != 0 && this.f29691c1 != null)) {
            f2.w0 layoutManager = getLayoutManager();
            if (layoutManager instanceof f2.j0) {
                f2.j0 j0Var = (f2.j0) layoutManager;
                if (j0Var.f6362o == 1) {
                    if (this.f29691c1 != null) {
                        if (this.f29726u1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i13 = this.f29726u1;
                        int i14 = Integer.MAX_VALUE;
                        if (i13 != 1 && i13 != 3) {
                            if (i13 == 2) {
                                this.f29705j1 = 0.0f;
                                if (this.f29691c1.h() != 0) {
                                    int childCount = getChildCount();
                                    View view2 = null;
                                    int i15 = Integer.MAX_VALUE;
                                    View view3 = null;
                                    int i16 = 0;
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        View childAt = getChildAt(i17);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.f29722s1 + paddingTop) {
                                            if (bottom < i14) {
                                                view3 = childAt;
                                                i14 = bottom;
                                            }
                                            i16 = Math.max(i16, bottom);
                                            if (bottom >= AndroidUtilities.dp(32.0f) + this.f29722s1 + paddingTop && bottom < i15) {
                                                view2 = childAt;
                                                i15 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T2 = T(view3)) != null && (S = this.f29691c1.S((b10 = T2.b()))) >= 0) {
                                        if (this.f29714o1 != S || this.f29712n1 == null) {
                                            View view4 = this.f29712n1;
                                            if (view4 == null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            View T3 = this.f29691c1.T(S, view4);
                                            if (z12) {
                                                T0(T3, false);
                                            }
                                            this.f29712n1 = T3;
                                            T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.f29712n1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.f29712n1.getMeasuredHeight());
                                            this.f29714o1 = S;
                                        }
                                        if (this.f29712n1 != null && view2 != null && view2.getClass() != this.f29712n1.getClass()) {
                                            this.f29705j1 = 1.0f;
                                        }
                                        int M = this.f29691c1.M(S);
                                        int Q = this.f29691c1.Q(b10);
                                        if (i16 != 0 && i16 < getMeasuredHeight() - getPaddingBottom()) {
                                            i11 = -paddingTop;
                                        } else {
                                            i11 = this.f29722s1;
                                        }
                                        if (Q == M - 1) {
                                            int height = this.f29712n1.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f29722s1);
                                            if (height2 < height) {
                                                i12 = height2 - height;
                                            } else {
                                                i12 = paddingTop;
                                            }
                                            if (i12 < 0) {
                                                this.f29712n1.setTag(Integer.valueOf(paddingTop + i11 + i12));
                                            } else {
                                                this.f29712n1.setTag(Integer.valueOf(paddingTop + i11));
                                            }
                                        } else {
                                            this.f29712n1.setTag(Integer.valueOf(paddingTop + i11));
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
                            if (bottom2 > this.f29722s1 + paddingTop) {
                                if (bottom2 < i14) {
                                    i14 = bottom2;
                                    view6 = childAt2;
                                }
                                i19 = Math.max(i19, bottom2);
                                if (bottom2 >= AndroidUtilities.dp(32.0f) + this.f29722s1 + paddingTop && bottom2 < i18) {
                                    i18 = bottom2;
                                }
                            }
                        }
                        if (view6 != null && (T = T(view6)) != null) {
                            int b11 = T.b();
                            int abs = Math.abs(j0Var.N0() - b11) + 1;
                            if ((this.G1 || z10) && (sk0Var2 = this.f29689b1) != null && !sk0Var2.f32680n && (getAdapter() instanceof tk0)) {
                                this.f29689b1.setProgress(Math.min(1.0f, b11 / ((this.f29691c1.h() - abs) + 1)));
                            }
                            this.f29710m1.addAll(this.l1);
                            this.l1.clear();
                            if (this.f29691c1.h() != 0) {
                                if (this.f29714o1 != b11 || this.f29716p1 != abs) {
                                    this.f29714o1 = b11;
                                    this.f29716p1 = abs;
                                    this.f29720r1 = 1;
                                    int S3 = this.f29691c1.S(b11);
                                    this.f29718q1 = S3;
                                    int M3 = (this.f29691c1.M(S3) + b11) - this.f29691c1.Q(b11);
                                    while (M3 < b11 + abs) {
                                        M3 += this.f29691c1.M(this.f29718q1 + this.f29720r1);
                                        this.f29720r1++;
                                    }
                                }
                                if (this.f29726u1 != 3) {
                                    int i21 = b11;
                                    for (int i22 = this.f29718q1; i22 < this.f29718q1 + this.f29720r1; i22++) {
                                        if (!this.f29710m1.isEmpty()) {
                                            view = (View) this.f29710m1.get(0);
                                            this.f29710m1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        View T4 = this.f29691c1.T(i22, view);
                                        if (z11) {
                                            T0(T4, false);
                                        }
                                        this.l1.add(T4);
                                        int M4 = this.f29691c1.M(i22);
                                        if (i22 == this.f29718q1) {
                                            int Q3 = this.f29691c1.Q(i21);
                                            if (Q3 == M4 - 1) {
                                                T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                            } else if (Q3 == M4 - 2) {
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
                                            i21 = (M4 - this.f29691c1.Q(b11)) + i21;
                                        } else {
                                            View childAt4 = getChildAt(i21 - b11);
                                            if (childAt4 != null) {
                                                T4.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                            } else {
                                                T4.setTag(Integer.valueOf(-AndroidUtilities.dp(100.0f)));
                                            }
                                            i21 += M4;
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
                    int L0 = j0Var.L0();
                    Math.abs(j0Var.N0() - L0);
                    if (L0 != -1) {
                        if ((this.G1 || z10) && (sk0Var = this.f29689b1) != null && !sk0Var.f32680n) {
                            f2.p0 adapter = getAdapter();
                            if (adapter instanceof tk0) {
                                tk0 tk0Var = (tk0) adapter;
                                float H = tk0Var.H(this);
                                this.f29689b1.setIsVisible(tk0Var.E(this));
                                this.f29689b1.setProgress(Math.min(1.0f, H));
                                this.f29689b1.a(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void L0(float f9, float f10) {
        boolean z10;
        MessageObject.GroupedMessages groupedMessages;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.f29704i2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f9, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.hi hiVar = this.f29694d2;
            int[] iArr2 = this.f29704i2;
            org.telegram.ui.tn tnVar = hiVar.d;
            iArr2[0] = (int) tnVar.f42921o9;
            iArr2[1] = tnVar.f43023wa;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.f29692c2;
                if (i11 != S) {
                    int i12 = this.f29690b2;
                    if (i11 <= i12 && S <= i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.tn tnVar2 = this.f29694d2.d;
                    org.telegram.ui.em emVar = tnVar2.f43013w0;
                    ArrayList arrayList = tnVar2.q6;
                    int i13 = S - emVar.F;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) tnVar2.f42979t6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            if (z10) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf(arrayList2.get(size)) + tnVar2.f43013w0.F;
                        }
                    }
                    if (z10) {
                        int i14 = this.f29692c2;
                        if (S > i14) {
                            if (!this.f29694d2.f38938a) {
                                for (int i15 = i14 + 1; i15 <= S; i15++) {
                                    if (i15 != this.f29690b2 && this.f29694d2.a(i15)) {
                                        this.f29694d2.b(i15, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            while (i14 > S) {
                                if (i14 != this.f29690b2 && this.f29694d2.a(i14)) {
                                    this.f29694d2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        }
                    } else {
                        int i16 = this.f29692c2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.f29690b2 && this.f29694d2.a(i16)) {
                                    this.f29694d2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.f29694d2.f38938a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.f29690b2 && this.f29694d2.a(i17)) {
                                    this.f29694d2.b(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (!this.f29694d2.f38938a) {
                    this.f29692c2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void M0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (view != null && ((Boolean) this.D2.f34771a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z12 = false;
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                if (U0 != null && ((Boolean) this.D2.f34771a.run(U0)).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (U02 != null && ((Boolean) this.D2.f34771a.run(U02)).booleanValue()) {
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
                float f9 = this.H2;
                path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
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

    public final void O0(Canvas canvas, int i10, int i11, int i12, int i13, int i14) {
        if (i11 >= i10 && i10 >= 0 && i11 >= 0) {
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MIN_VALUE;
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                View childAt = getChildAt(i17);
                if (childAt != null) {
                    int R = RecyclerView.R(childAt);
                    int top = childAt.getTop();
                    if (R >= i10 && R <= i11) {
                        i15 = Math.min(top, i15);
                        i16 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i16);
                    }
                }
            }
            if (i15 < i16) {
                if (this.f29719q2 == null) {
                    this.f29719q2 = new Paint(1);
                }
                this.f29719q2.setColor(i12);
                canvas.drawRect(0.0f, i15 - i13, getWidth(), i16 + i14, this.f29719q2);
            }
        }
    }

    public final void P0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f9;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof g80) {
                f9 = ((g80) view2).getBottomInfoMargin();
            } else {
                f9 = 0.0f;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float left = view.getLeft();
            float f12 = -this.H2;
            float t12 = t1(view);
            if (z10) {
                f10 = this.H2;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(f12, t12 - f10);
            float right = view.getRight();
            float height = getHeight() - (-this.H2);
            float G0 = G0(view2);
            if (z11) {
                f11 = this.H2;
            }
            rectF.set(left, max, right, Math.min(height, (G0 + f11) - f9));
            if (rectF.bottom >= rectF.top) {
                this.F2.mo19run(canvas, rectF, Float.valueOf(this.H2), Float.valueOf(this.H2), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void Q0(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jl0.Q0(android.graphics.Canvas):void");
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.C1;
        if (!rect.isEmpty() && (zVar = this.f29736z1) != null) {
            int i10 = this.E1;
            if ((i10 == -2 || i10 == this.A1) && this.B1 != null) {
                if (getAdapter() instanceof il0) {
                    ((il0) getAdapter()).getClass();
                }
                this.f29736z1.setBounds(this.B1.getLeft(), this.B1.getTop(), this.B1.getRight(), this.B1.getBottom());
            } else {
                zVar.setBounds(rect);
            }
            canvas.save();
            int i11 = this.E1;
            if ((i11 == -2 || i11 == this.A1) && (aVar = this.f29708k2) != null) {
                aVar.accept(canvas);
            }
            int i12 = this.E1;
            if ((i12 == -2 || i12 == this.A1) && (view = this.B1) != null) {
                canvas.translate(view.getX() - rect.left, this.B1.getY() - rect.top);
                this.f29736z1.setAlpha((int) (this.B1.getAlpha() * 255.0f));
            }
            if (b1()) {
                canvas.save();
                M0(canvas, this.B1);
                this.f29736z1.draw(canvas);
                canvas.restore();
            } else {
                this.f29736z1.draw(canvas);
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
            int i10 = this.f29726u1;
            if (i10 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (i10 == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e11) {
                    FileLog.e(e11);
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
        if (view.getParent() == this && b1() && ((Boolean) this.D2.f34771a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            boolean z13 = true;
            if (R == -1) {
                z12 = false;
                z11 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                if (U0 != null && ((Boolean) this.D2.f34771a.run(U0)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (U02 != null && ((Boolean) this.D2.f34771a.run(U02)).booleanValue()) {
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
                    return org.telegram.ui.ActionBar.g6.b0(0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, this.f29709l2));
                }
                z12 = z13;
            }
            Path path = new Path();
            if ((!z11 && !z12) || z10) {
                path.rewind();
                float f9 = this.H2;
                path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
            } else if (!z11) {
                path.rewind();
                path.addRoundRect(rectF, this.I2, Path.Direction.CW);
            } else if (!z12) {
                path.rewind();
                path.addRoundRect(rectF, this.J2, Path.Direction.CW);
            }
            return new qk0(this, view, path, rectF);
        }
        return null;
    }

    public Integer W0(int i10) {
        GenericProvider genericProvider = this.f29723s2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint X0(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.c6 c6Var = this.f29709l2;
        if (c6Var != null) {
            paint = c6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    public final boolean Y0(int i10, View view) {
        int R;
        if (view != null && i10 <= 0 && getAdapter() != null && this.E2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.E2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Z0() {
        et[] etVarArr;
        for (et etVar : this.A2.f28528a) {
            if (etVar != null && etVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i10, View view) {
        int R;
        if (view != null && i10 >= getChildCount() - 1 && getAdapter() != null && this.E2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().h() - 1) {
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
        if (!this.f29695e1) {
            this.f29695e1 = true;
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
    public final boolean canScrollVertically(int i10) {
        if (this.P1 && super.canScrollVertically(i10)) {
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
            this.f29736z1.setState(StateSet.NOTHING);
            this.C1.setEmpty();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f9;
        pk0 pk0Var = this.f29706j2;
        if (pk0Var != null) {
            jl0 jl0Var = pk0Var.f31698a;
            if (pk0Var.d || pk0Var.f31701e) {
                for (int i10 = 0; i10 < jl0Var.getChildCount(); i10++) {
                    View childAt = jl0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !pk0Var.f31700c.contains(childAt)) {
                        Float f10 = (Float) pk0Var.f31699b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                pk0Var.d = false;
            }
        }
        if (this.Q0 && this.f29732x1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.Q0 && !this.f29732x1) {
            R0(canvas);
        }
        bg.x2 x2Var = this.Z0;
        if (x2Var != null) {
            x2Var.draw(canvas);
        }
        if (!this.f29728v1) {
            int i11 = this.f29726u1;
            float f11 = 0.0f;
            if (i11 == 1) {
                if (this.f29691c1 != null && !this.l1.isEmpty()) {
                    for (int i12 = 0; i12 < this.l1.size(); i12++) {
                        View view2 = (View) this.l1.get(i12);
                        int save = canvas.save();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        if (LocaleController.isRTL) {
                            f9 = getWidth() - view2.getWidth();
                        } else {
                            f9 = 0.0f;
                        }
                        canvas.translate(f9, intValue);
                        canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                        view2.draw(canvas);
                        canvas.restoreToCount(save);
                    }
                }
            } else if (i11 == 2 && this.f29691c1 != null && (view = this.f29712n1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.f29712n1.getTag()).intValue();
                if (LocaleController.isRTL) {
                    f11 = getWidth() - this.f29712n1.getWidth();
                }
                canvas.translate(f11, intValue2);
                Drawable drawable = this.f29701h1;
                if (drawable != null) {
                    drawable.setBounds(0, this.f29712n1.getMeasuredHeight(), getWidth(), this.f29701h1.getIntrinsicHeight() + this.f29712n1.getMeasuredHeight());
                    this.f29701h1.setAlpha((int) (this.f29703i1 * 255.0f));
                    this.f29701h1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.f29707k1);
                    this.f29707k1 = elapsedRealtime;
                    float f12 = this.f29703i1;
                    float f13 = this.f29705j1;
                    if (f12 < f13) {
                        float f14 = (((float) min) / 180.0f) + f12;
                        this.f29703i1 = f14;
                        if (f14 > f13) {
                            this.f29703i1 = f13;
                        }
                        invalidate();
                    } else if (f12 > f13) {
                        float f15 = f12 - (((float) min) / 180.0f);
                        this.f29703i1 = f15;
                        if (f15 < f13) {
                            this.f29703i1 = f13;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.f29712n1.getMeasuredHeight());
                this.f29712n1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f29727u2 == 0 && this.f29729v2) {
                setOverScrollMode(0);
            }
            this.f29727u2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.f29727u2 - 1;
            this.f29727u2 = i10;
            if (i10 == 0 && this.f29729v2) {
                setOverScrollMode(2);
            }
        }
        sk0 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.T && fastScroll.f32675g0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f29691c1 != null && (view = this.f29712n1) != null && view.getAlpha() != 0.0f && this.f29712n1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (b1() && !this.f29733x2) {
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
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
            canvas.restore();
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            f2.v0 X = X(i10);
            if ((X instanceof mg.a) && (X != this.D2 || this.C2)) {
                ((mg.a) X).e(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x4 = childAt.getX();
            float y8 = childAt.getY();
            if (rectF.intersects(x4, y8, childAt.getWidth() + x4, childAt.getHeight() + y8)) {
                this.f29733x2 = true;
                drawChild(canvas, childAt, uptimeMillis);
                this.f29733x2 = false;
            }
        }
    }

    public final void e1(wk0 wk0Var, int i10, boolean z10) {
        xb0 xb0Var = this.R1;
        if (xb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xb0Var);
            this.R1 = null;
        }
        f2.n1 K = K(wk0Var.run());
        if (K != null) {
            View view = K.f6432a;
            int c3 = K.c();
            this.f29725t2 = c3;
            i1(c3, view);
            org.telegram.ui.Cells.z zVar = this.f29736z1;
            if (zVar != null) {
                Drawable current = zVar.getCurrent();
                if (current instanceof TransitionDrawable) {
                    if (this.T0 == null && this.S0 == null) {
                        ((TransitionDrawable) current).resetTransition();
                    } else {
                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                    }
                }
                this.f29736z1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
            }
            org.telegram.ui.Cells.z zVar2 = this.f29736z1;
            if (zVar2 != null && zVar2.isStateful() && this.f29736z1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.f29736z1);
            }
            if (i10 > 0) {
                this.Q1 = null;
                xb0 xb0Var2 = new xb0(this, 19);
                this.R1 = xb0Var2;
                AndroidUtilities.runOnUIThread(xb0Var2, i10);
            }
        } else if (z10) {
            this.Q1 = wk0Var;
        }
    }

    @Override
    public final void f0(View view) {
        if (getAdapter() instanceof il0) {
            f2.n1 G = G(view);
            if (G != null) {
                view.setEnabled(((il0) getAdapter()).D(G));
                if (this.f29711m2) {
                    view.setAccessibilityDelegate(this.f29713n2);
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

    @Override
    public final void g(g.x xVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            xVar.f6956b = true;
        } else if (Z0() && getOverScrollMode() != 2) {
            xVar.f6956b = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i10 = 0; i10 < itemDecorationCount; i10++) {
                f2.v0 X = X(i10);
                if ((X instanceof mg.a) && (X != this.D2 || this.C2)) {
                    ((mg.a) X).g(xVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                float x4 = childAt.getX();
                float y8 = childAt.getY();
                if (rectF.intersects(x4, y8, childAt.getWidth() + x4, childAt.getHeight() + y8)) {
                    xVar.getClass();
                    android.support.v4.media.session.z.a(xVar, childAt);
                }
            }
        }
    }

    public final boolean g1(int i10) {
        if (this.G2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.G2.size(); i11++) {
                long longValue = ((Long) this.G2.get(i11)).longValue();
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
        return this.Y0;
    }

    public sk0 getFastScroll() {
        return this.f29689b1;
    }

    public ArrayList<View> getHeaders() {
        return this.l1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f29710m1;
    }

    public zk0 getOnItemClickListener() {
        return this.R0;
    }

    public f2.a1 getOnScrollListener() {
        return this.W0;
    }

    public View getPinnedHeader() {
        return this.f29712n1;
    }

    public View getPressedChildView() {
        return this.J1;
    }

    public Drawable getSelectorDrawable() {
        return this.f29736z1;
    }

    public Rect getSelectorRect() {
        return this.C1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public void h1(View view, float f9, float f10, boolean z10) {
        if (!this.f29697f1 && view != null) {
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
        xb0 xb0Var = this.R1;
        if (xb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xb0Var);
            this.R1 = null;
            this.Q1 = null;
        }
        if (this.f29736z1 != null) {
            if (i10 != this.A1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getAdapter() instanceof il0) {
                ((il0) getAdapter()).getClass();
            }
            if (i10 != -1) {
                this.A1 = i10;
            }
            this.B1 = view;
            if (this.f29734y1 == 8) {
                org.telegram.ui.ActionBar.g6.A1(this.f29736z1, this.W1, 0);
            } else if (this.X1 > 0 && getAdapter() != null) {
                org.telegram.ui.Cells.z zVar = this.f29736z1;
                if (i10 == 0) {
                    i11 = this.X1;
                } else {
                    i11 = 0;
                }
                if (i10 == getAdapter().h() - 2) {
                    i12 = this.X1;
                } else {
                    i12 = 0;
                }
                org.telegram.ui.ActionBar.g6.A1(zVar, i11, i12);
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
                this.f29736z1.setVisible(false, false);
                this.f29736z1.setState(StateSet.NOTHING);
            }
            setListSelectorColor(W0(i10));
            this.f29736z1.setBounds(rect);
            if (z10 && getVisibility() == 0) {
                this.f29736z1.setVisible(true, false);
            }
        }
    }

    public final void j1() {
        int i10;
        xb0 xb0Var = this.R1;
        if (xb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xb0Var);
            this.R1.run();
            this.R1 = null;
            this.B1 = null;
            return;
        }
        this.R1 = null;
        this.Q1 = null;
        View view = this.B1;
        if (view != null && (i10 = this.f29725t2) != -1) {
            i1(i10, view);
            org.telegram.ui.Cells.z zVar = this.f29736z1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.f29736z1);
            }
            this.B1 = null;
            this.f29725t2 = -1;
            return;
        }
        org.telegram.ui.Cells.z zVar2 = this.f29736z1;
        if (zVar2 != null) {
            Drawable current = zVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.z zVar3 = this.f29736z1;
        if (zVar3 != null && zVar3.isStateful() && this.f29736z1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.f29736z1);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f29736z1;
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
                    org.telegram.ui.Cells.z zVar = this.f29736z1;
                    if (zVar != null) {
                        Drawable current = zVar.getCurrent();
                        if (current instanceof TransitionDrawable) {
                            ((TransitionDrawable) current).resetTransition();
                        }
                        if (motionEvent != null) {
                            this.f29736z1.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                    }
                } else {
                    rect.setEmpty();
                }
                v1();
            }
        }
    }

    public final void l1(jl0 jl0Var, boolean z10) {
        ViewParent parent;
        if (jl0Var != null && (parent = jl0Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void m1(int i10, boolean z10) {
        this.U1 = z10;
        this.V1 = i10;
    }

    public final void n1(cl0 cl0Var, long j10) {
        boolean z10;
        this.U0 = cl0Var;
        o4.g gVar = this.I1;
        if (cl0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g20 g20Var = (g20) gVar.f19159b;
        g20Var.f28736t = z10;
        g20Var.f28737u = j10;
    }

    public final void o1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.f29735y2 = true;
        setPadding(i10, i11, i12, i13);
        this.f29735y2 = false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sk0 sk0Var = this.f29689b1;
        if (sk0Var != null && sk0Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.f29689b1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f29689b1);
            }
            ((ViewGroup) getParent()).addView(this.f29689b1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A1 = -1;
        this.B1 = null;
        this.C1.setEmpty();
        pk0 pk0Var = this.f29706j2;
        if (pk0Var != null) {
            pk0Var.a();
        }
        if (this.f29721r2) {
            this.f29721r2 = false;
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
                int i10 = org.telegram.ui.tn.Dc;
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
        sk0 sk0Var = this.f29689b1;
        if (sk0Var != null) {
            this.F1 = true;
            if (sk0Var.f32664a) {
                i14 = getPaddingTop();
            } else {
                i14 = sk0Var.f32670d0;
            }
            int i15 = i11 + i14;
            sk0 sk0Var2 = this.f29689b1;
            if (sk0Var2.f32669c0) {
                sk0Var2.layout(0, i15, sk0Var2.getMeasuredWidth(), this.f29689b1.getMeasuredHeight() + i15);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f29689b1.getMeasuredWidth();
                sk0 sk0Var3 = this.f29689b1;
                sk0Var3.layout(measuredWidth, i15, sk0Var3.getMeasuredWidth() + measuredWidth, this.f29689b1.getMeasuredHeight() + i15);
            }
            this.F1 = false;
        }
        K0(false);
        wk0 wk0Var = this.Q1;
        if (wk0Var != null) {
            e1(wk0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        sk0 sk0Var = this.f29689b1;
        if (sk0Var != null && sk0Var.getLayoutParams() != null) {
            sk0 sk0Var2 = this.f29689b1;
            if (sk0Var2.f32664a) {
                i12 = getPaddingTop();
            } else {
                i12 = sk0Var2.f32670d0;
            }
            int measuredHeight = (getMeasuredHeight() - i12) - getPaddingBottom();
            this.f29689b1.getLayoutParams().height = measuredHeight;
            this.f29689b1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.Y1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        bg.x2 x2Var = this.Z0;
        if (x2Var != null) {
            x2Var.requestLayout();
        }
        int i14 = this.f29726u1;
        if (i14 == 1) {
            if (this.f29691c1 != null && !this.l1.isEmpty()) {
                for (int i15 = 0; i15 < this.l1.size(); i15++) {
                    T0((View) this.l1.get(i15), true);
                }
            }
        } else if (i14 == 2 && this.f29691c1 != null && (view = this.f29712n1) != null) {
            T0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        sk0 sk0Var = this.f29689b1;
        if (sk0Var != null && sk0Var.f32680n) {
            return false;
        }
        boolean z10 = this.Z1;
        lh.m7 m7Var = this.f29737z2;
        if (z10 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.f29700g2 == Float.MAX_VALUE && this.f29702h2 == Float.MAX_VALUE) {
                this.f29700g2 = motionEvent.getX();
                this.f29702h2 = motionEvent.getY();
            }
            if (!this.a2 && Math.abs(motionEvent.getY() - this.f29702h2) > this.Y1) {
                this.a2 = true;
                l1(this, true);
            }
            if (this.a2) {
                L0(motionEvent.getX(), motionEvent.getY());
                org.telegram.ui.hi hiVar = this.f29694d2;
                int[] iArr = this.f29704i2;
                org.telegram.ui.tn tnVar = hiVar.d;
                iArr[0] = (int) tnVar.f42921o9;
                iArr[1] = tnVar.f43023wa;
                if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.f29704i2[1] && (this.f29692c2 >= this.f29690b2 || !this.f29694d2.f38938a)) {
                    this.f29698f2 = false;
                    if (!this.f29696e2) {
                        this.f29696e2 = true;
                        AndroidUtilities.cancelRunOnUIThread(m7Var);
                        AndroidUtilities.runOnUIThread(m7Var);
                        return true;
                    }
                } else if (motionEvent.getY() < AndroidUtilities.dp(56.0f) + this.f29704i2[0] && (this.f29692c2 <= this.f29690b2 || !this.f29694d2.f38938a)) {
                    this.f29698f2 = true;
                    if (!this.f29696e2) {
                        this.f29696e2 = true;
                        AndroidUtilities.cancelRunOnUIThread(m7Var);
                        AndroidUtilities.runOnUIThread(m7Var);
                        return true;
                    }
                } else {
                    this.f29696e2 = false;
                    AndroidUtilities.cancelRunOnUIThread(m7Var);
                }
            }
            return true;
        }
        this.f29700g2 = Float.MAX_VALUE;
        this.f29702h2 = Float.MAX_VALUE;
        this.Z1 = false;
        this.a2 = false;
        l1(this, false);
        this.f29696e2 = false;
        AndroidUtilities.cancelRunOnUIThread(m7Var);
        return super.onTouchEvent(motionEvent);
    }

    public void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void q1(int i10, float f9, boolean z10) {
        r1(new org.telegram.ui.rh(4), i10, f9, new cv(this, 15), z10);
    }

    public final void r1(Utilities.CallbackReturn callbackReturn, int i10, float f9, Utilities.Callback5 callback5, boolean z10) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new nh.v4(this, callbackReturn, sparseIntArray, 3), new pi(sparseIntArray, 2));
        s1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f9, callback5, z10);
    }

    @Override
    public void requestLayout() {
        if (!this.T1 && !this.f29735y2) {
            super.requestLayout();
        }
    }

    public final void s1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f9, Utilities.Callback5 callback5, boolean z10) {
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23170j6, this.f29709l2));
        this.E2 = callbackReturn2;
        this.H2 = f9;
        this.I2 = new float[]{f9, f9, f9, f9, 0.0f, 0.0f, 0.0f, 0.0f};
        this.J2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f9, f9, f9, f9};
        this.F2 = callback5;
        f2.v0 v0Var = this.D2;
        if (v0Var != null) {
            p0(v0Var);
        }
        xk0 xk0Var = new xk0(this, callbackReturn, i10, z10);
        this.D2 = xk0Var;
        i(xk0Var);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f29711m2 = z10;
    }

    @Override
    public void setAdapter(f2.p0 p0Var) {
        f2.p0 adapter = getAdapter();
        f2.f1 f1Var = this.f29717p2;
        if (adapter != null) {
            adapter.f6459a.unregisterObserver(f1Var);
        }
        ArrayList arrayList = this.l1;
        if (arrayList != null) {
            arrayList.clear();
            this.f29710m1.clear();
        }
        this.f29714o1 = -1;
        this.A1 = -1;
        this.B1 = null;
        this.C1.setEmpty();
        this.f29712n1 = null;
        if (p0Var instanceof fl0) {
            this.f29691c1 = (fl0) p0Var;
        } else {
            this.f29691c1 = null;
        }
        super.setAdapter(p0Var);
        if (p0Var != null) {
            p0Var.B(f1Var);
        }
        J0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f29699g1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f29724t1 = z10;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.C2 = z10;
    }

    public void setDisableHighlightState(boolean z10) {
        this.f29697f1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.M1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.Q0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.f29732x1 = z10;
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
            if (this.f29695e1) {
                View view3 = this.Y0;
                if (view3 != null) {
                    this.f29731w2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.f29731w2 = -1;
            J0(false);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.f29689b1 = new sk0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f29689b1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        int i10;
        sk0 sk0Var = this.f29689b1;
        if (sk0Var == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        sk0Var.setVisibility(i10);
        this.f29689b1.T = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.f29730w1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.N1 = z10;
    }

    @Override
    public void setItemAnimator(f2.u0 u0Var) {
        super.setItemAnimator(u0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.f29723s2 = genericProvider;
    }

    public void setItemsEnterAnimator(pk0 pk0Var) {
        this.f29706j2 = pk0Var;
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i10;
        org.telegram.ui.Cells.z zVar = this.f29736z1;
        if (num == null) {
            if (b1()) {
                i10 = org.telegram.ui.ActionBar.g6.f23170j6;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f23152i6;
            }
            intValue = org.telegram.ui.ActionBar.g6.v0(i10, this.f29709l2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.g6.B1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(yk0 yk0Var) {
        this.X0 = yk0Var;
    }

    public void setOnItemClickListener(zk0 zk0Var) {
        this.R0 = zk0Var;
    }

    public void setOnItemLongClickListener(bl0 bl0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.T0 = bl0Var;
        o4.g gVar = this.I1;
        boolean z10 = bl0Var != null;
        g20 g20Var = (g20) gVar.f19159b;
        g20Var.f28736t = z10;
        g20Var.f28737u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(f2.a1 a1Var) {
        this.W0 = a1Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.f29701h1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.f29722s1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f29715o2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.P1 = z10;
    }

    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsType(int i10) {
        this.f29726u1 = i10;
        if (i10 != 1 && i10 != 3) {
            return;
        }
        this.l1 = new ArrayList();
        this.f29710m1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i10) {
        org.telegram.ui.Cells.z zVar = this.f29736z1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i11 = this.f29734y1;
        if (i11 == 8) {
            this.f29736z1 = org.telegram.ui.ActionBar.g6.Y(i10, this.W1, 0);
        } else if (i11 == 9) {
            this.f29736z1 = null;
        } else {
            int i12 = this.X1;
            if (i12 > 0) {
                this.f29736z1 = org.telegram.ui.ActionBar.g6.Y(i10, i12, i12);
            } else {
                int i13 = this.W1;
                if (i13 > 0 && i11 != 1) {
                    this.f29736z1 = org.telegram.ui.ActionBar.g6.i0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.f29736z1 = org.telegram.ui.ActionBar.g6.f0(i10, 2, -1);
                } else {
                    this.f29736z1 = org.telegram.ui.ActionBar.g6.f0(i10, i11, i13);
                }
            }
        }
        org.telegram.ui.Cells.z zVar2 = this.f29736z1;
        if (zVar2 != null) {
            zVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i10) {
        this.W1 = i10;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.f29708k2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.f29734y1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f29728v1 = z10;
    }

    public void setTopBottomSelectorRadius(int i10) {
        this.X1 = i10;
    }

    public void setTranslateSelector(boolean z10) {
        int i10;
        if (z10) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        this.E1 = i10;
    }

    public void setTranslateSelectorPosition(int i10) {
        if (i10 <= 0) {
            i10 = -1;
        }
        this.E1 = i10;
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        sk0 sk0Var = this.f29689b1;
        if (sk0Var != null) {
            sk0Var.setTranslationY(f9);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (M2 != null) {
            super.setVerticalScrollBarEnabled(z10);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            this.S1 = false;
        }
    }

    public boolean u1() {
        return this.C;
    }

    @Override
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (this.V0) {
            cl0 cl0Var = this.U0;
            if (cl0Var != null) {
                cl0Var.r(i11);
            }
            iArr[0] = i10;
            iArr[1] = i11;
            return true;
        }
        return super.v(i10, i11, i12, iArr, iArr2);
    }

    public final void v1() {
        org.telegram.ui.Cells.z zVar = this.f29736z1;
        if (zVar != null && zVar.isStateful()) {
            if (this.J1 != null) {
                if (this.f29736z1.setState(getDrawableStateForSelector())) {
                    invalidateDrawable(this.f29736z1);
                }
            } else if (this.R1 == null) {
                this.f29736z1.setState(StateSet.NOTHING);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29736z1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public jl0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.Q0 = true;
        this.f29699g1 = true;
        this.f29714o1 = -1;
        this.f29716p1 = -1;
        this.f29728v1 = false;
        this.f29730w1 = true;
        this.f29734y1 = 2;
        this.C1 = new Rect();
        this.E1 = -1;
        this.P1 = true;
        this.f29700g2 = Float.MAX_VALUE;
        this.f29702h2 = Float.MAX_VALUE;
        this.f29711m2 = true;
        this.f29713n2 = new ie(1);
        this.f29715o2 = true;
        this.f29717p2 = new f2.f1(this, 1);
        this.f29737z2 = new lh.m7(this, 29);
        this.L2 = new Path();
        this.f29709l2 = c6Var;
        ft ftVar = new ft();
        this.A2 = ftVar;
        setEdgeEffectFactory(ftVar);
        setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, c6Var));
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 2, -1);
        this.f29736z1 = f02;
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
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.setOnScrollListener(new h00(this, 5));
        this.A.add(new f2.y(this, context));
    }

    public void setOnItemClickListener(al0 al0Var) {
        this.S0 = al0Var;
    }

    public void setOnItemLongClickListener(cl0 cl0Var) {
        n1(cl0Var, ViewConfiguration.getLongPressTimeout());
    }
}
