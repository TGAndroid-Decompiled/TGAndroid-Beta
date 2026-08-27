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
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public class zk0 extends RecyclerView implements kg.a {
    public static int[] M2;
    public static boolean N2;
    public static final Method O2;
    public static final Paint P2;
    public static final Paint Q2;
    public static final Path R2;
    public static final float[] S2;
    public int A1;
    public final zs A2;
    public View B1;
    public Matrix B2;
    public final Rect C1;
    public boolean C2;
    public boolean D1;
    public nk0 D2;
    public int E1;
    public Utilities.CallbackReturn E2;
    public boolean F1;
    public Utilities.Callback5 F2;
    public boolean G1;
    public ArrayList G2;
    public boolean H1;
    public float H2;
    public n1.d I1;
    public float[] I2;
    public View J1;
    public float[] J2;
    public int K1;
    public ArrayList K2;
    public boolean L1;
    public final Path L2;
    public boolean M1;
    public boolean N1;
    public tk0 O1;
    public boolean P1;
    public boolean Q0;
    public mk0 Q1;
    public pk0 R0;
    public mb0 R1;
    public qk0 S0;
    public boolean S1;
    public rk0 T0;
    public boolean T1;
    public sk0 U0;
    public boolean U1;
    public boolean V0;
    public int V1;
    public f2.b1 W0;
    public int W1;
    public ok0 X0;
    public int X1;
    public View Y0;
    public int Y1;
    public ag.p1 Z0;
    public boolean Z1;

    public bg.d f35256a1;
    public boolean a2;

    public ik0 f35257b1;

    public int f35258b2;

    public vk0 f35259c1;

    public int f35260c2;

    public boolean f35261d1;

    public org.telegram.ui.gi f35262d2;

    public boolean f35263e1;

    public boolean f35264e2;

    public boolean f35265f1;

    public boolean f35266f2;

    public boolean f35267g1;

    public float f35268g2;

    public Drawable f35269h1;

    public float f35270h2;

    public float f35271i1;

    public int[] f35272i2;

    public float f35273j1;

    public gk0 f35274j2;

    public long f35275k1;

    public q0.a f35276k2;
    public ArrayList l1;

    public final org.telegram.ui.ActionBar.c6 f35277l2;

    public ArrayList f35278m1;

    public boolean f35279m2;

    public View f35280n1;

    public final be f35281n2;

    public int f35282o1;

    public boolean f35283o2;

    public int f35284p1;

    public final f2.g1 f35285p2;

    public int f35286q1;

    public Paint f35287q2;

    public int f35288r1;

    public boolean f35289r2;

    public int f35290s1;

    public GenericProvider f35291s2;

    public boolean f35292t1;

    public int f35293t2;

    public int f35294u1;

    public int f35295u2;

    public boolean f35296v1;

    public boolean f35297v2;

    public boolean f35298w1;

    public int f35299w2;

    public boolean f35300x1;

    public boolean f35301x2;

    public int f35302y1;

    public boolean f35303y2;

    public org.telegram.ui.Cells.z f35304z1;

    public final m.i3 f35305z2;

    static {
        Method declaredMethod;
        try {
            declaredMethod = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        O2 = declaredMethod;
        P2 = new Paint(1);
        Q2 = new Paint(1);
        R2 = new Path();
        S2 = new float[8];
    }

    public zk0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        int[] iArr = null;
        this.Q0 = true;
        this.f35267g1 = true;
        this.f35282o1 = -1;
        this.f35284p1 = -1;
        this.f35296v1 = false;
        this.f35298w1 = true;
        this.f35302y1 = 2;
        this.C1 = new Rect();
        this.E1 = -1;
        this.P1 = true;
        this.f35268g2 = Float.MAX_VALUE;
        this.f35270h2 = Float.MAX_VALUE;
        this.f35279m2 = true;
        this.f35281n2 = new be(1);
        this.f35283o2 = true;
        this.f35285p2 = new f2.g1(this, 1);
        this.f35305z2 = new m.i3(this, 26);
        this.L2 = new Path();
        this.f35277l2 = c6Var;
        zs zsVar = new zs();
        this.A2 = zsVar;
        setEdgeEffectFactory(zsVar);
        setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, c6Var));
        org.telegram.ui.Cells.z zVarF0 = org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 2, -1);
        this.f35304z1 = zVarF0;
        zVarF0.setCallback(this);
        try {
            if (!N2) {
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
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(M2);
            Method method = O2;
            if (method != null) {
                method.invoke(this, typedArrayObtainStyledAttributes);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        super.setOnScrollListener(new xm(this, 10));
        this.A.add(new f2.z(this, context));
    }

    public static float G0(View view) {
        return view.getTag(R.id.dragging) != null ? view.getBottom() : view.getY() + view.getHeight();
    }

    public static void N0(Canvas canvas, RectF rectF, float f10, float f11, float f12, org.telegram.ui.ActionBar.c6 c6Var) {
        boolean z10 = SharedConfig.shadowsInSections;
        Paint paint = P2;
        Paint paint2 = Q2;
        if (z10) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.g6.l1(f12, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.g6.l1(f12, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(f12, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var)));
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
        int[] iArrOnCreateDrawableState = onCreateDrawableState(1);
        iArrOnCreateDrawableState[iArrOnCreateDrawableState.length - 1] = 16842919;
        return iArrOnCreateDrawableState;
    }

    public static float t1(View view) {
        return view.getTag(R.id.dragging) != null ? view.getTop() : view.getY();
    }

    @Override
    public final void B0() {
        try {
            super.B0();
        } catch (NullPointerException unused) {
        }
    }

    public final void C0(Runnable runnable) {
        this.A2.f35333b.add(new xs(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.Z0 == null) {
            this.Z0 = new ag.p1(this, getContext(), 22);
        }
        this.Z0.addView(clippingImageView, layoutParams);
    }

    @Override
    public final View E(float f10, float f11) {
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < 2) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                if ((!(childAt instanceof org.telegram.ui.Cells.s1) && !(childAt instanceof org.telegram.ui.Cells.v0)) || childAt.getVisibility() != 4) {
                    float translationX = i10 == 0 ? childAt.getTranslationX() : 0.0f;
                    float translationY = i10 == 0 ? childAt.getTranslationY() : 0.0f;
                    if (f10 >= childAt.getLeft() + translationX && f10 <= childAt.getRight() + translationX && f11 >= childAt.getTop() + translationY && f11 <= childAt.getBottom() + translationY) {
                        return childAt;
                    }
                }
            }
            i10++;
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
        bg.d dVar = this.f35256a1;
        if (dVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dVar);
            this.f35256a1 = null;
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
        tk0 tk0Var = this.O1;
        if (tk0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(tk0Var);
            this.O1 = null;
        }
        this.L1 = false;
    }

    public final void J0(boolean z10) {
        if (this.f35263e1) {
            return;
        }
        if (getAdapter() == null || this.Y0 == null) {
            if (!this.S1 || getVisibility() == 0) {
                return;
            }
            setVisibility(0);
            this.S1 = false;
            return;
        }
        boolean zS0 = S0();
        int i10 = zS0 ? 0 : 8;
        if (!this.U1 || !SharedConfig.animationsEnabled()) {
            z10 = false;
        }
        if (!z10) {
            this.f35299w2 = i10;
            this.Y0.setVisibility(i10);
            this.Y0.setAlpha(1.0f);
        } else if (this.f35299w2 != i10) {
            this.f35299w2 = i10;
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
                ViewPropertyAnimator viewPropertyAnimatorAlpha = this.Y0.animate().alpha(0.0f);
                if (this.V1 == 1) {
                    viewPropertyAnimatorAlpha.scaleY(0.7f).scaleX(0.7f);
                }
                viewPropertyAnimatorAlpha.setDuration(150L).setListener(new sz(this, 15)).start();
            }
        }
        if (this.f35298w1) {
            int i11 = zS0 ? 4 : 0;
            if (getVisibility() != i11) {
                setVisibility(i11);
            }
            this.S1 = true;
        }
    }

    public final void K0(boolean z10) {
        ik0 ik0Var;
        f2.o1 o1VarT;
        ik0 ik0Var2;
        View view;
        f2.o1 o1VarT2;
        int iB;
        int iS;
        if (((this.G1 || z10) && this.f35257b1 != null) || !(this.f35294u1 == 0 || this.f35259c1 == null)) {
            f2.x0 layoutManager = getLayoutManager();
            if (layoutManager instanceof f2.k0) {
                f2.k0 k0Var = (f2.k0) layoutManager;
                if (k0Var.f5720o == 1) {
                    if (this.f35259c1 == null) {
                        int iL0 = k0Var.L0();
                        Math.abs(k0Var.N0() - iL0);
                        if (iL0 == -1) {
                            return;
                        }
                        if ((!this.G1 && !z10) || (ik0Var = this.f35257b1) == null || ik0Var.f29396n) {
                            return;
                        }
                        f2.q0 adapter = getAdapter();
                        if (adapter instanceof jk0) {
                            jk0 jk0Var = (jk0) adapter;
                            float fH = jk0Var.H(this);
                            this.f35257b1.setIsVisible(jk0Var.E(this));
                            this.f35257b1.setProgress(Math.min(1.0f, fH));
                            this.f35257b1.a(false);
                            return;
                        }
                        return;
                    }
                    int paddingTop = this.f35294u1 == 1 ? 0 : getPaddingTop();
                    int i10 = this.f35294u1;
                    int i11 = Integer.MAX_VALUE;
                    if (i10 != 1 && i10 != 3) {
                        if (i10 == 2) {
                            this.f35273j1 = 0.0f;
                            if (this.f35259c1.h() == 0) {
                                return;
                            }
                            int childCount = getChildCount();
                            View view2 = null;
                            int i12 = Integer.MAX_VALUE;
                            View view3 = null;
                            int iMax = 0;
                            for (int i13 = 0; i13 < childCount; i13++) {
                                View childAt = getChildAt(i13);
                                int bottom = childAt.getBottom();
                                if (bottom > this.f35290s1 + paddingTop) {
                                    if (bottom < i11) {
                                        view3 = childAt;
                                        i11 = bottom;
                                    }
                                    iMax = Math.max(iMax, bottom);
                                    if (bottom >= AndroidUtilities.dp(32.0f) + this.f35290s1 + paddingTop && bottom < i12) {
                                        view2 = childAt;
                                        i12 = bottom;
                                    }
                                }
                            }
                            if (view3 == null || (o1VarT2 = T(view3)) == null || (iS = this.f35259c1.S((iB = o1VarT2.b()))) < 0) {
                                return;
                            }
                            if (this.f35282o1 != iS || this.f35280n1 == null) {
                                View view4 = this.f35280n1;
                                boolean z11 = view4 == null;
                                View viewT = this.f35259c1.T(iS, view4);
                                if (z11) {
                                    T0(viewT, false);
                                }
                                this.f35280n1 = viewT;
                                viewT.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                View view5 = this.f35280n1;
                                view5.layout(0, 0, view5.getMeasuredWidth(), this.f35280n1.getMeasuredHeight());
                                this.f35282o1 = iS;
                            }
                            if (this.f35280n1 != null && view2 != null && view2.getClass() != this.f35280n1.getClass()) {
                                this.f35273j1 = 1.0f;
                            }
                            int iM = this.f35259c1.M(iS);
                            int iQ = this.f35259c1.Q(iB);
                            int i14 = (iMax == 0 || iMax >= getMeasuredHeight() - getPaddingBottom()) ? this.f35290s1 : -paddingTop;
                            if (iQ == iM - 1) {
                                int height = this.f35280n1.getHeight();
                                int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.f35290s1);
                                int i15 = height2 < height ? height2 - height : paddingTop;
                                if (i15 < 0) {
                                    this.f35280n1.setTag(Integer.valueOf(paddingTop + i14 + i15));
                                } else {
                                    this.f35280n1.setTag(Integer.valueOf(paddingTop + i14));
                                }
                            } else {
                                this.f35280n1.setTag(Integer.valueOf(paddingTop + i14));
                            }
                            invalidate();
                            return;
                        }
                        return;
                    }
                    int childCount2 = getChildCount();
                    int i16 = Integer.MAX_VALUE;
                    View view6 = null;
                    int iMax2 = 0;
                    for (int i17 = 0; i17 < childCount2; i17++) {
                        View childAt2 = getChildAt(i17);
                        int bottom2 = childAt2.getBottom();
                        if (bottom2 > this.f35290s1 + paddingTop) {
                            if (bottom2 < i11) {
                                i11 = bottom2;
                                view6 = childAt2;
                            }
                            iMax2 = Math.max(iMax2, bottom2);
                            if (bottom2 >= AndroidUtilities.dp(32.0f) + this.f35290s1 + paddingTop && bottom2 < i16) {
                                i16 = bottom2;
                            }
                        }
                    }
                    if (view6 == null || (o1VarT = T(view6)) == null) {
                        return;
                    }
                    int iB2 = o1VarT.b();
                    int iAbs = Math.abs(k0Var.N0() - iB2) + 1;
                    if ((this.G1 || z10) && (ik0Var2 = this.f35257b1) != null && !ik0Var2.f29396n && (getAdapter() instanceof jk0)) {
                        this.f35257b1.setProgress(Math.min(1.0f, iB2 / ((this.f35259c1.h() - iAbs) + 1)));
                    }
                    this.f35278m1.addAll(this.l1);
                    this.l1.clear();
                    if (this.f35259c1.h() == 0) {
                        return;
                    }
                    if (this.f35282o1 != iB2 || this.f35284p1 != iAbs) {
                        this.f35282o1 = iB2;
                        this.f35284p1 = iAbs;
                        this.f35288r1 = 1;
                        int iS2 = this.f35259c1.S(iB2);
                        this.f35286q1 = iS2;
                        int iM2 = (this.f35259c1.M(iS2) + iB2) - this.f35259c1.Q(iB2);
                        while (iM2 < iB2 + iAbs) {
                            iM2 += this.f35259c1.M(this.f35286q1 + this.f35288r1);
                            this.f35288r1++;
                        }
                    }
                    if (this.f35294u1 != 3) {
                        int iQ2 = iB2;
                        for (int i18 = this.f35286q1; i18 < this.f35286q1 + this.f35288r1; i18++) {
                            if (this.f35278m1.isEmpty()) {
                                view = null;
                            } else {
                                view = (View) this.f35278m1.get(0);
                                this.f35278m1.remove(0);
                            }
                            boolean z12 = view == null;
                            View viewT2 = this.f35259c1.T(i18, view);
                            if (z12) {
                                T0(viewT2, false);
                            }
                            this.l1.add(viewT2);
                            int iM3 = this.f35259c1.M(i18);
                            if (i18 == this.f35286q1) {
                                int iQ3 = this.f35259c1.Q(iQ2);
                                if (iQ3 == iM3 - 1) {
                                    viewT2.setTag(Integer.valueOf((-viewT2.getHeight()) + paddingTop));
                                } else if (iQ3 == iM3 - 2) {
                                    View childAt3 = getChildAt(iQ2 - iB2);
                                    viewT2.setTag(Integer.valueOf(Math.min(childAt3 != null ? childAt3.getTop() + paddingTop : -AndroidUtilities.dp(100.0f), 0)));
                                } else {
                                    viewT2.setTag(0);
                                }
                                iQ2 = (iM3 - this.f35259c1.Q(iB2)) + iQ2;
                            } else {
                                View childAt4 = getChildAt(iQ2 - iB2);
                                if (childAt4 != null) {
                                    viewT2.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                } else {
                                    viewT2.setTag(Integer.valueOf(-AndroidUtilities.dp(100.0f)));
                                }
                                iQ2 += iM3;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void L0(float f10, float f11) {
        MessageObject.GroupedMessages groupedMessages;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.f35272i2;
        float fMin = Math.min(measuredHeight - iArr[1], Math.max(f11, iArr[0]));
        float fMin2 = Math.min(getMeasuredWidth(), Math.max(f10, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.gi giVar = this.f35262d2;
            int[] iArr2 = this.f35272i2;
            org.telegram.ui.rn rnVar = giVar.d;
            iArr2[0] = (int) rnVar.f42160o9;
            iArr2[1] = rnVar.wa;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(fMin2, fMin)) {
                int iS = RecyclerView.S(childAt);
                int i11 = this.f35260c2;
                if (i11 != iS) {
                    int i12 = this.f35258b2;
                    boolean z10 = i11 > i12 || iS > i12;
                    org.telegram.ui.rn rnVar2 = this.f35262d2.d;
                    org.telegram.ui.dm dmVar = rnVar2.f42252w0;
                    ArrayList arrayList = rnVar2.q6;
                    int i13 = iS - dmVar.F;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) rnVar2.f42219t6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            iS = arrayList.indexOf(arrayList2.get(z10 ? 0 : arrayList2.size() - 1)) + rnVar2.f42252w0.F;
                        }
                    }
                    if (z10) {
                        int i14 = this.f35260c2;
                        if (iS <= i14) {
                            while (i14 > iS) {
                                if (i14 != this.f35258b2 && this.f35262d2.a(i14)) {
                                    this.f35262d2.b(i14, false, fMin2, fMin);
                                }
                                i14--;
                            }
                        } else if (!this.f35262d2.f38420a) {
                            for (int i15 = i14 + 1; i15 <= iS; i15++) {
                                if (i15 != this.f35258b2 && this.f35262d2.a(i15)) {
                                    this.f35262d2.b(i15, true, fMin2, fMin);
                                }
                            }
                        }
                    } else {
                        int i16 = this.f35260c2;
                        if (iS > i16) {
                            while (i16 < iS) {
                                if (i16 != this.f35258b2 && this.f35262d2.a(i16)) {
                                    this.f35262d2.b(i16, false, fMin2, fMin);
                                }
                                i16++;
                            }
                        } else if (!this.f35262d2.f38420a) {
                            for (int i17 = i16 - 1; i17 >= iS; i17--) {
                                if (i17 != this.f35258b2 && this.f35262d2.a(i17)) {
                                    this.f35262d2.b(i17, true, fMin2, fMin);
                                }
                            }
                        }
                    }
                }
                if (this.f35262d2.f38420a) {
                    return;
                }
                this.f35260c2 = iS;
                return;
            }
        }
    }

    public final void M0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (view == null || !((Boolean) this.D2.f30985a.run(view)).booleanValue()) {
            return;
        }
        int iR = RecyclerView.R(view);
        if (iR == -1) {
            z11 = false;
            z10 = false;
        } else {
            View viewU0 = U0(iR - 1);
            View viewU1 = U0(iR + 1);
            z10 = viewU0 != null && ((Boolean) this.D2.f30985a.run(viewU0)).booleanValue();
            z11 = viewU1 != null && ((Boolean) this.D2.f30985a.run(viewU1)).booleanValue();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), Math.max(-this.H2, t1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.H2), G0(view)));
        if (z10 && z11) {
            z10 = t1(view) >= rectF.top;
            boolean z12 = G0(view) <= rectF.bottom;
            if (z10 && z12) {
                return;
            } else {
                z11 = z12;
            }
        }
        Path path = this.L2;
        if (!z10 && !z11) {
            path.rewind();
            float f10 = this.H2;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            return;
        }
        if (!z10) {
            path.rewind();
            path.addRoundRect(rectF, this.I2, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            if (z11) {
                return;
            }
            path.rewind();
            path.addRoundRect(rectF, this.J2, Path.Direction.CW);
            canvas.clipPath(path);
        }
    }

    public final void O0(Canvas canvas, int i10, int i11, int i12, int i13, int i14) {
        if (i11 < i10 || i10 < 0 || i11 < 0) {
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null) {
                int iR = RecyclerView.R(childAt);
                int top = childAt.getTop();
                if (iR >= i10 && iR <= i11) {
                    iMin = Math.min(top, iMin);
                    iMax = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), iMax);
                }
            }
        }
        if (iMin < iMax) {
            if (this.f35287q2 == null) {
                this.f35287q2 = new Paint(1);
            }
            this.f35287q2.setColor(i12);
            canvas.drawRect(0.0f, iMin - i13, getWidth(), iMax + i14, this.f35287q2);
        }
    }

    public final void P0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof x70 ? ((x70) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getLeft(), Math.max(-this.H2, t1(view) - (z10 ? this.H2 : 0.0f)), view.getRight(), Math.min(getHeight() - (-this.H2), (G0(view2) + (z11 ? this.H2 : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom < rectF.top) {
            return;
        }
        this.F2.mo18run(canvas, rectF, Float.valueOf(this.H2), Float.valueOf(this.H2), Float.valueOf(view.getAlpha()));
    }

    public final void Q0(Canvas canvas) {
        float f10;
        float fLerp;
        float fLerp2;
        float[] fArr;
        int i10;
        View childAt;
        if (this.F2 == null) {
            return;
        }
        f2.v0 v0Var = this.V;
        if (v0Var == null || !v0Var.k()) {
            f10 = 1.0f;
            int i11 = -1;
            View view = null;
            View view2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2 == this.Y0 || childAt2.getVisibility() != 0 || childAt2.getAlpha() <= 0.0f || !((Boolean) this.D2.f30985a.run(childAt2)).booleanValue() || g1(RecyclerView.R(childAt2))) {
                    P0(canvas, view, view2, Y0(i11, view), a1(i12, view2));
                    i11 = -1;
                    view = null;
                    view2 = null;
                    i12 = -1;
                } else {
                    if (view != null && Math.abs(view2.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                        P0(canvas, view, view2, Y0(i11, view), a1(i12, view2));
                        i11 = -1;
                        view = null;
                    }
                    if (view == null) {
                        i11 = i13;
                        view = childAt2;
                    }
                    i12 = i13;
                    view2 = childAt2;
                }
            }
            P0(canvas, view, view2, Y0(i11, view), a1(i12, view2));
        } else {
            if (this.K2 == null) {
                this.K2 = new ArrayList();
            }
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt3 = getChildAt(i14);
                if (childAt3 != this.Y0 && childAt3.getVisibility() == 0 && childAt3.getAlpha() > 0.0f && ((Boolean) this.D2.f30985a.run(childAt3)).booleanValue()) {
                    float fT1 = t1(childAt3);
                    float fG0 = G0(childAt3);
                    f2.o1 o1VarT = T(childAt3);
                    if (!o1VarT.j() || childAt3.getAlpha() >= 1.0f) {
                        if (!g1(o1VarT.b())) {
                            ArrayList arrayList = this.K2;
                            float alpha = childAt3.getAlpha();
                            wk0 wk0Var = new wk0();
                            wk0Var.f34277a = fT1;
                            wk0Var.f34278b = fG0;
                            wk0Var.f34279c = alpha;
                            arrayList.add(wk0Var);
                        }
                    } else if (!o1VarT.j() || (i10 = o1VarT.f5795i) < 0) {
                        ArrayList arrayList2 = this.K2;
                        float alpha2 = childAt3.getAlpha();
                        wk0 wk0Var2 = new wk0();
                        wk0Var2.f34277a = fT1;
                        wk0Var2.f34278b = fG0;
                        wk0Var2.f34279c = alpha2;
                        arrayList2.add(wk0Var2);
                    } else {
                        int iCeil = ((int) Math.ceil(((double) i10) / 1000.0d)) + 1;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= getChildCount()) {
                                childAt = null;
                                break;
                            }
                            childAt = getChildAt(i15);
                            if (childAt != null && childAt != childAt3 && RecyclerView.R(childAt) == iCeil) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                        if (childAt == null || fG0 <= childAt.getY() || !((Boolean) this.D2.f30985a.run(childAt)).booleanValue() || T(childAt).j()) {
                            ArrayList arrayList3 = this.K2;
                            float alpha3 = childAt3.getAlpha();
                            wk0 wk0Var3 = new wk0();
                            wk0Var3.f34277a = fT1;
                            wk0Var3.f34278b = fG0;
                            wk0Var3.f34279c = alpha3;
                            arrayList3.add(wk0Var3);
                        } else {
                            fT1 -= 1.0f;
                            fG0 = childAt.getY();
                            if (fG0 >= fT1) {
                                ArrayList arrayList4 = this.K2;
                                float alpha4 = childAt3.getAlpha();
                                wk0 wk0Var4 = new wk0();
                                wk0Var4.f34277a = fT1;
                                wk0Var4.f34278b = fG0;
                                wk0Var4.f34279c = alpha4;
                                arrayList4.add(wk0Var4);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList5 = this.K2;
            float f11 = this.H2;
            ArrayList arrayList6 = xk0.f34644a;
            if (arrayList5 == null || arrayList5.isEmpty()) {
                f10 = 1.0f;
            } else {
                Collections.sort(arrayList5, new k9.a(27));
                arrayList6.clear();
                int i16 = 0;
                while (i16 < arrayList5.size()) {
                    float fMax = ((wk0) arrayList5.get(i16)).f34278b;
                    int i17 = i16 + 1;
                    while (i17 < arrayList5.size() && ((wk0) arrayList5.get(i17)).f34277a <= fMax + 1.5f) {
                        fMax = Math.max(fMax, ((wk0) arrayList5.get(i17)).f34278b);
                        i17++;
                    }
                    float fMin = Float.MAX_VALUE;
                    float fMax2 = Float.MIN_VALUE;
                    float fMin2 = Float.MAX_VALUE;
                    float fMax3 = Float.MIN_VALUE;
                    for (int i18 = i16; i18 < i17; i18++) {
                        wk0 wk0Var5 = (wk0) arrayList5.get(i18);
                        if (wk0Var5.f34279c >= 0.99f) {
                            fMin2 = Math.min(fMin2, wk0Var5.f34277a);
                            fMax3 = Math.max(fMax3, wk0Var5.f34278b);
                        }
                    }
                    boolean z10 = fMin2 != Float.MAX_VALUE;
                    float fMax4 = 0.0f;
                    for (int i19 = i16; i19 < i17; i19++) {
                        wk0 wk0Var6 = (wk0) arrayList5.get(i19);
                        fMin = Math.min(fMin, wk0Var6.f34277a);
                        fMax2 = Math.max(fMax2, wk0Var6.f34278b);
                        fMax4 = Math.max(fMax4, wk0Var6.f34279c);
                    }
                    if (fMax4 >= 0.001f) {
                        if (z10) {
                            float f12 = 0.0f;
                            wk0 wk0Var7 = null;
                            for (int i20 = i16; i20 < i17; i20++) {
                                wk0 wk0Var8 = (wk0) arrayList5.get(i20);
                                float f13 = wk0Var8.f34279c;
                                if (f13 < 0.99f) {
                                    float f14 = wk0Var8.f34277a;
                                    if (f14 < fMin2) {
                                        float f15 = (fMin2 - f14) * f13;
                                        if (f15 > f12) {
                                            wk0Var7 = wk0Var8;
                                            f12 = f15;
                                        }
                                    }
                                }
                            }
                            wk0 wk0Var9 = null;
                            float f16 = 0.0f;
                            while (i16 < i17) {
                                wk0 wk0Var10 = (wk0) arrayList5.get(i16);
                                float f17 = wk0Var10.f34279c;
                                if (f17 < 0.99f) {
                                    float f18 = wk0Var10.f34278b;
                                    if (f18 > fMax3) {
                                        float f19 = (f18 - fMax3) * f17;
                                        if (f19 > f16) {
                                            wk0Var9 = wk0Var10;
                                            f16 = f19;
                                        }
                                    }
                                }
                                i16++;
                            }
                            if (wk0Var7 != null) {
                                float f20 = wk0Var7.f34277a;
                                float f21 = wk0Var7.f34279c;
                                if (f21 > 0.001f) {
                                    float fLerp3 = AndroidUtilities.lerp(fMin2, f20, f21);
                                    fLerp = AndroidUtilities.lerp(f11, f21 * f11, (fMin2 - fLerp3) / ((fMin2 - f20) + 0.001f));
                                    fMin2 = fLerp3;
                                } else {
                                    fLerp = f11;
                                }
                            } else {
                                fLerp = f11;
                            }
                            if (wk0Var9 != null) {
                                float f22 = wk0Var9.f34278b;
                                float f23 = wk0Var9.f34279c;
                                if (f23 > 0.001f) {
                                    float fLerp4 = AndroidUtilities.lerp(fMax3, f22, f23);
                                    fLerp2 = AndroidUtilities.lerp(f11, f23 * f11, (fLerp4 - fMax3) / ((f22 - fMax3) + 0.001f));
                                    fMax3 = fLerp4;
                                    fMax4 = 1.0f;
                                    fMin = fMin2;
                                } else {
                                    fLerp2 = f11;
                                    fMin = fMin2;
                                    fMax4 = 1.0f;
                                }
                            } else {
                                fLerp2 = f11;
                                fMin = fMin2;
                                fMax4 = 1.0f;
                            }
                        } else {
                            fLerp2 = f11;
                            fLerp = fLerp2;
                            fMax3 = fMax2;
                        }
                        if (fMax3 <= fMin) {
                            fArr = null;
                        } else {
                            fArr = new float[]{fMin, fMax3, fLerp, fLerp2, fMax4};
                        }
                    } else {
                        fArr = null;
                    }
                    if (fArr != null) {
                        arrayList6.add(fArr);
                    }
                    i16 = i17;
                }
                f10 = 1.0f;
                for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                    float[] fArr2 = (float[]) arrayList6.get(i21);
                    float f24 = fArr2[0];
                    float f25 = fArr2[1];
                    float fMin3 = fArr2[2];
                    float fMin4 = fArr2[3];
                    float f26 = fArr2[4];
                    if (i21 > 0) {
                        float f27 = f24 - ((float[]) arrayList6.get(i21 - 1))[1];
                        float f28 = f11 * 0.2f;
                        if (f27 < f28) {
                            fMin3 = Math.min(fMin3, (f27 / f28) * f11);
                        }
                    }
                    if (i21 < arrayList6.size() - 1) {
                        float f29 = ((float[]) arrayList6.get(i21 + 1))[0] - f25;
                        float f30 = 0.2f * f11;
                        if (f29 < f30) {
                            fMin4 = Math.min(fMin4, (f29 / f30) * f11);
                        }
                    }
                    Float fValueOf = Float.valueOf(fMin3);
                    Float fValueOf2 = Float.valueOf(fMin4);
                    Float fValueOf3 = Float.valueOf(f26);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft() + this.D2.f30987c, f24, (getWidth() - this.D2.f30987c) - getPaddingRight(), f25);
                    this.F2.mo18run(canvas, rectF, fValueOf, fValueOf2, fValueOf3);
                }
            }
            this.K2.clear();
        }
        if (this.G2 != null) {
            for (int i22 = 0; i22 < this.G2.size(); i22++) {
                long jLongValue = ((Long) this.G2.get(i22)).longValue();
                int iUnpackA = AndroidUtilities.unpackA(jLongValue);
                int iUnpackB = AndroidUtilities.unpackB(jLongValue);
                float height = getHeight();
                float f31 = this.H2;
                float fMin5 = height + f31;
                float fMax5 = -f31;
                for (int i23 = 0; i23 < getChildCount(); i23++) {
                    View childAt4 = getChildAt(i23);
                    int iR = RecyclerView.R(childAt4);
                    if (iR >= iUnpackA && iR <= iUnpackB) {
                        fMin5 = Math.min(fMin5, t1(childAt4));
                        fMax5 = Math.max(fMax5, G0(childAt4));
                    }
                }
                if (fMin5 < fMax5) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(getPaddingLeft() + this.D2.f30987c, fMin5, (getWidth() - getPaddingRight()) - this.D2.f30987c, fMax5);
                    this.F2.mo18run(canvas, rectF2, Float.valueOf(this.H2), Float.valueOf(this.H2), Float.valueOf(f10));
                }
            }
        }
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.C1;
        if (rect.isEmpty() || (zVar = this.f35304z1) == null) {
            return;
        }
        int i10 = this.E1;
        if ((i10 == -2 || i10 == this.A1) && this.B1 != null) {
            if (getAdapter() instanceof yk0) {
                ((yk0) getAdapter()).getClass();
            }
            this.f35304z1.setBounds(this.B1.getLeft(), this.B1.getTop(), this.B1.getRight(), this.B1.getBottom());
        } else {
            zVar.setBounds(rect);
        }
        canvas.save();
        int i11 = this.E1;
        if ((i11 == -2 || i11 == this.A1) && (aVar = this.f35276k2) != null) {
            aVar.accept(canvas);
        }
        int i12 = this.E1;
        if ((i12 == -2 || i12 == this.A1) && (view = this.B1) != null) {
            canvas.translate(view.getX() - rect.left, this.B1.getY() - rect.top);
            this.f35304z1.setAlpha((int) (this.B1.getAlpha() * 255.0f));
        }
        if (b1()) {
            canvas.save();
            M0(canvas, this.B1);
            this.f35304z1.draw(canvas);
            canvas.restore();
        } else {
            this.f35304z1.draw(canvas);
        }
        canvas.restore();
    }

    public boolean S0() {
        return (getAdapter() == null || this.T1 || getAdapter().h() != 0) ? false : true;
    }

    public final void T0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (view.isLayoutRequested() || z10) {
            int i10 = this.f35294u1;
            if (i10 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                } catch (Exception e9) {
                    FileLog.e(e9);
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
        if (i10 == -1) {
            return null;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            int iR = RecyclerView.R(childAt);
            if (iR != -1 && iR == i10) {
                return childAt;
            }
        }
        return null;
    }

    public final Drawable V0(View view, boolean z10) {
        boolean z11;
        boolean z12;
        if (view.getParent() != this || !b1() || !((Boolean) this.D2.f30985a.run(view)).booleanValue()) {
            return null;
        }
        int iR = RecyclerView.R(view);
        if (iR == -1) {
            z12 = false;
            z11 = false;
        } else {
            View viewU0 = U0(iR - 1);
            View viewU1 = U0(iR + 1);
            z11 = viewU0 != null && ((Boolean) this.D2.f30985a.run(viewU0)).booleanValue();
            z12 = viewU1 != null && ((Boolean) this.D2.f30985a.run(viewU1)).booleanValue();
        }
        RectF rectF = new RectF();
        rectF.set(view.getX(), Math.max(0.0f, t1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
        if (z11 && z12 && !z10) {
            z11 = t1(view) >= rectF.top;
            boolean z13 = G0(view) <= rectF.bottom;
            if (z11 && z13) {
                return org.telegram.ui.ActionBar.g6.b0(0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, this.f35277l2));
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
        return new hk0(this, view, path, rectF);
    }

    public Integer W0(int i10) {
        GenericProvider genericProvider = this.f35291s2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint X0(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f35277l2;
        Paint paintN = c6Var != null ? c6Var.N(str) : null;
        return paintN != null ? paintN : org.telegram.ui.ActionBar.g6.S0(str);
    }

    public final boolean Y0(int i10, View view) {
        int iR;
        if (view == null || i10 > 0 || getAdapter() == null || this.E2 == null || (iR = RecyclerView.R(view)) == -1 || iR == 0) {
            return false;
        }
        return ((Boolean) this.E2.run(Integer.valueOf(getAdapter().j(iR - 1)))).booleanValue();
    }

    public final boolean Z0() {
        for (ys ysVar : this.A2.f35332a) {
            if (ysVar != null && ysVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i10, View view) {
        int iR;
        if (view == null || i10 < getChildCount() - 1 || getAdapter() == null || this.E2 == null || (iR = RecyclerView.R(view)) == -1 || iR == getAdapter().h() - 1) {
            return false;
        }
        return ((Boolean) this.E2.run(Integer.valueOf(getAdapter().j(iR + 1)))).booleanValue();
    }

    public final boolean b1() {
        return this.D2 != null;
    }

    public final void c1() {
        if (this.f35263e1) {
            return;
        }
        this.f35263e1 = true;
        if (getVisibility() != 8) {
            setVisibility(8);
        }
        View view = this.Y0;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.Y0.setVisibility(8);
    }

    @Override
    public final boolean canScrollVertically(int i10) {
        return this.P1 && super.canScrollVertically(i10);
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
        if (z10) {
            return;
        }
        this.f35304z1.setState(StateSet.NOTHING);
        this.C1.setEmpty();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        gk0 gk0Var = this.f35274j2;
        if (gk0Var != null) {
            zk0 zk0Var = gk0Var.f28737a;
            if (gk0Var.d || gk0Var.f28740e) {
                for (int i10 = 0; i10 < zk0Var.getChildCount(); i10++) {
                    View childAt = zk0Var.getChildAt(i10);
                    int iR = RecyclerView.R(childAt);
                    if (iR >= 0 && !gk0Var.f28739c.contains(childAt)) {
                        Float f10 = (Float) gk0Var.f28738b.get(iR, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                gk0Var.d = false;
            }
        }
        if (this.Q0 && this.f35300x1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.Q0 && !this.f35300x1) {
            R0(canvas);
        }
        ag.p1 p1Var = this.Z0;
        if (p1Var != null) {
            p1Var.draw(canvas);
        }
        if (this.f35296v1) {
            return;
        }
        int i11 = this.f35294u1;
        if (i11 == 1) {
            if (this.f35259c1 == null || this.l1.isEmpty()) {
                return;
            }
            for (int i12 = 0; i12 < this.l1.size(); i12++) {
                View view2 = (View) this.l1.get(i12);
                int iSave = canvas.save();
                canvas.translate(LocaleController.isRTL ? getWidth() - view2.getWidth() : 0.0f, ((Integer) view2.getTag()).intValue());
                canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                view2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            return;
        }
        if (i11 != 2 || this.f35259c1 == null || (view = this.f35280n1) == null || view.getAlpha() == 0.0f) {
            return;
        }
        int iSave2 = canvas.save();
        canvas.translate(LocaleController.isRTL ? getWidth() - this.f35280n1.getWidth() : 0.0f, ((Integer) this.f35280n1.getTag()).intValue());
        Drawable drawable = this.f35269h1;
        if (drawable != null) {
            drawable.setBounds(0, this.f35280n1.getMeasuredHeight(), getWidth(), this.f35269h1.getIntrinsicHeight() + this.f35280n1.getMeasuredHeight());
            this.f35269h1.setAlpha((int) (this.f35271i1 * 255.0f));
            this.f35269h1.draw(canvas);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMin = Math.min(20L, jElapsedRealtime - this.f35275k1);
            this.f35275k1 = jElapsedRealtime;
            float f11 = this.f35271i1;
            float f12 = this.f35273j1;
            if (f11 < f12) {
                float f13 = (jMin / 180.0f) + f11;
                this.f35271i1 = f13;
                if (f13 > f12) {
                    this.f35271i1 = f12;
                }
                invalidate();
            } else if (f11 > f12) {
                float f14 = f11 - (jMin / 180.0f);
                this.f35271i1 = f14;
                if (f14 < f12) {
                    this.f35271i1 = f12;
                }
                invalidate();
            }
        }
        canvas.clipRect(0, 0, getWidth(), this.f35280n1.getMeasuredHeight());
        this.f35280n1.draw(canvas);
        canvas.restoreToCount(iSave2);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f35295u2 == 0 && this.f35297v2) {
                setOverScrollMode(0);
            }
            this.f35295u2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.f35295u2 - 1;
            this.f35295u2 = i10;
            if (i10 == 0 && this.f35297v2) {
                setOverScrollMode(2);
            }
        }
        ik0 fastScroll = getFastScroll();
        if ((fastScroll == null || !fastScroll.T || !fastScroll.f29391g0 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (this.f35259c1 == null || (view = this.f35280n1) == null || view.getAlpha() == 0.0f || !this.f35280n1.dispatchTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (!b1() || this.f35301x2) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        M0(canvas, view);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v1();
    }

    public void e(Canvas canvas, RectF rectF) {
        long jUptimeMillis = SystemClock.uptimeMillis();
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
                super.drawChild(canvas, this, jUptimeMillis);
            } catch (Throwable th) {
                FileLog.e(th);
            }
            canvas.restore();
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            Object objX = X(i10);
            if ((objX instanceof kg.a) && (objX != this.D2 || this.C2)) {
                ((kg.a) objX).e(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x8 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x8, y10, childAt.getWidth() + x8, childAt.getHeight() + y10)) {
                this.f35301x2 = true;
                drawChild(canvas, childAt, jUptimeMillis);
                this.f35301x2 = false;
            }
        }
    }

    public final void e1(mk0 mk0Var, int i10, boolean z10) {
        mb0 mb0Var = this.R1;
        if (mb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mb0Var);
            this.R1 = null;
        }
        f2.o1 o1VarK = K(mk0Var.run());
        if (o1VarK == null) {
            if (z10) {
                this.Q1 = mk0Var;
                return;
            }
            return;
        }
        View view = o1VarK.f5789a;
        int iC = o1VarK.c();
        this.f35293t2 = iC;
        i1(iC, view);
        org.telegram.ui.Cells.z zVar = this.f35304z1;
        if (zVar != null) {
            Drawable current = zVar.getCurrent();
            if (current instanceof TransitionDrawable) {
                if (this.T0 == null && this.S0 == null) {
                    ((TransitionDrawable) current).resetTransition();
                } else {
                    ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                }
            }
            this.f35304z1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
        }
        org.telegram.ui.Cells.z zVar2 = this.f35304z1;
        if (zVar2 != null && zVar2.isStateful() && this.f35304z1.setState(getDrawableStateForSelector())) {
            invalidateDrawable(this.f35304z1);
        }
        if (i10 > 0) {
            this.Q1 = null;
            mb0 mb0Var2 = new mb0(this, 19);
            this.R1 = mb0Var2;
            AndroidUtilities.runOnUIThread(mb0Var2, i10);
        }
    }

    @Override
    public final void f0(View view) {
        if (!(getAdapter() instanceof yk0)) {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
            return;
        }
        f2.o1 o1VarG = G(view);
        if (o1VarG != null) {
            view.setEnabled(((yk0) getAdapter()).D(o1VarG));
            if (this.f35279m2) {
                view.setAccessibilityDelegate(this.f35281n2);
            }
        }
    }

    public void f1() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.x5) {
                ((org.telegram.ui.ActionBar.x5) childAt).d();
            }
            childAt.invalidate();
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            yVar.f6327b = true;
            return;
        }
        if (Z0() && getOverScrollMode() != 2) {
            yVar.f6327b = true;
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            Object objX = X(i10);
            if ((objX instanceof kg.a) && (objX != this.D2 || this.C2)) {
                ((kg.a) objX).g(yVar, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x8 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x8, y10, childAt.getWidth() + x8, childAt.getHeight() + y10)) {
                yVar.getClass();
                android.support.v4.media.session.z.a(yVar, childAt);
            }
        }
    }

    public final boolean g1(int i10) {
        if (this.G2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.G2.size(); i11++) {
                long jLongValue = ((Long) this.G2.get(i11)).longValue();
                int iUnpackA = AndroidUtilities.unpackA(jLongValue);
                int iUnpackB = AndroidUtilities.unpackB(jLongValue);
                if (i10 >= iUnpackA && i10 <= iUnpackB) {
                    return true;
                }
            }
        }
        return false;
    }

    public View getEmptyView() {
        return this.Y0;
    }

    public ik0 getFastScroll() {
        return this.f35257b1;
    }

    public ArrayList<View> getHeaders() {
        return this.l1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.f35278m1;
    }

    public pk0 getOnItemClickListener() {
        return this.R0;
    }

    public f2.b1 getOnScrollListener() {
        return this.W0;
    }

    public View getPinnedHeader() {
        return this.f35280n1;
    }

    public View getPressedChildView() {
        return this.J1;
    }

    public Drawable getSelectorDrawable() {
        return this.f35304z1;
    }

    public Rect getSelectorRect() {
        return this.C1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public void h1(View view, float f10, float f11, boolean z10) {
        if (this.f35265f1 || view == null) {
            return;
        }
        view.setPressed(z10);
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void i1(int i10, View view) {
        mb0 mb0Var = this.R1;
        if (mb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mb0Var);
            this.R1 = null;
            this.Q1 = null;
        }
        if (this.f35304z1 == null) {
            return;
        }
        boolean z10 = i10 != this.A1;
        if (getAdapter() instanceof yk0) {
            ((yk0) getAdapter()).getClass();
        }
        if (i10 != -1) {
            this.A1 = i10;
        }
        this.B1 = view;
        if (this.f35302y1 == 8) {
            org.telegram.ui.ActionBar.g6.A1(this.f35304z1, this.W1, 0);
        } else if (this.X1 > 0 && getAdapter() != null) {
            org.telegram.ui.ActionBar.g6.A1(this.f35304z1, i10 == 0 ? this.X1 : 0, i10 == getAdapter().h() + (-2) ? this.X1 : 0);
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.C1;
        rect.set(left, top, right, bottom);
        boolean zIsEnabled = view.isEnabled();
        if (this.D1 != zIsEnabled) {
            this.D1 = zIsEnabled;
        }
        if (z10) {
            this.f35304z1.setVisible(false, false);
            this.f35304z1.setState(StateSet.NOTHING);
        }
        setListSelectorColor(W0(i10));
        this.f35304z1.setBounds(rect);
        if (z10 && getVisibility() == 0) {
            this.f35304z1.setVisible(true, false);
        }
    }

    public final void j1() {
        int i10;
        mb0 mb0Var = this.R1;
        if (mb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mb0Var);
            this.R1.run();
            this.R1 = null;
            this.B1 = null;
            return;
        }
        this.R1 = null;
        this.Q1 = null;
        View view = this.B1;
        if (view != null && (i10 = this.f35293t2) != -1) {
            i1(i10, view);
            org.telegram.ui.Cells.z zVar = this.f35304z1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.f35304z1);
            }
            this.B1 = null;
            this.f35293t2 = -1;
            return;
        }
        org.telegram.ui.Cells.z zVar2 = this.f35304z1;
        if (zVar2 != null) {
            Drawable current = zVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.z zVar3 = this.f35304z1;
        if (zVar3 != null && zVar3.isStateful() && this.f35304z1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.f35304z1);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f35304z1;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    public final void k1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.C1;
            if (rect.isEmpty()) {
                return;
            }
            if (view.isEnabled()) {
                i1(this.K1, view);
                org.telegram.ui.Cells.z zVar = this.f35304z1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                    if (motionEvent != null) {
                        this.f35304z1.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                }
            } else {
                rect.setEmpty();
            }
            v1();
        }
    }

    public final void l1(zk0 zk0Var, boolean z10) {
        ViewParent parent;
        if (zk0Var == null || (parent = zk0Var.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z10);
        ViewParent touchParent = getTouchParent();
        if (touchParent == null) {
            return;
        }
        touchParent.requestDisallowInterceptTouchEvent(z10);
    }

    public final void m1(int i10, boolean z10) {
        this.U1 = z10;
        this.V1 = i10;
    }

    public final void n1(sk0 sk0Var, long j10) {
        this.U0 = sk0Var;
        n1.d dVar = this.I1;
        boolean z10 = sk0Var != null;
        y10 y10Var = (y10) dVar.f18088b;
        y10Var.f34776t = z10;
        y10Var.f34777u = j10;
    }

    public final void o1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.f35303y2 = true;
        setPadding(i10, i11, i12, i13);
        this.f35303y2 = false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ik0 ik0Var = this.f35257b1;
        if (ik0Var == null || ik0Var.getParent() == getParent()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f35257b1.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f35257b1);
        }
        ((ViewGroup) getParent()).addView(this.f35257b1);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A1 = -1;
        this.B1 = null;
        this.C1.setEmpty();
        gk0 gk0Var = this.f35274j2;
        if (gk0Var != null) {
            gk0Var.a();
        }
        if (this.f35289r2) {
            this.f35289r2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.M1) {
            l1(this, true);
        }
        if (this.X0 == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i10 = org.telegram.ui.rn.Dc;
        return true;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ik0 ik0Var = this.f35257b1;
        if (ik0Var != null) {
            this.F1 = true;
            int paddingTop = i11 + (ik0Var.f29380a ? getPaddingTop() : ik0Var.f29386d0);
            ik0 ik0Var2 = this.f35257b1;
            if (ik0Var2.f29385c0) {
                ik0Var2.layout(0, paddingTop, ik0Var2.getMeasuredWidth(), this.f35257b1.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f35257b1.getMeasuredWidth();
                ik0 ik0Var3 = this.f35257b1;
                ik0Var3.layout(measuredWidth, paddingTop, ik0Var3.getMeasuredWidth() + measuredWidth, this.f35257b1.getMeasuredHeight() + paddingTop);
            }
            this.F1 = false;
        }
        K0(false);
        mk0 mk0Var = this.Q1;
        if (mk0Var != null) {
            e1(mk0Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ik0 ik0Var = this.f35257b1;
        if (ik0Var != null && ik0Var.getLayoutParams() != null) {
            ik0 ik0Var2 = this.f35257b1;
            int measuredHeight = (getMeasuredHeight() - (ik0Var2.f29380a ? getPaddingTop() : ik0Var2.f29386d0)) - getPaddingBottom();
            this.f35257b1.getLayoutParams().height = measuredHeight;
            this.f35257b1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.Y1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        ag.p1 p1Var = this.Z0;
        if (p1Var != null) {
            p1Var.requestLayout();
        }
        int i14 = this.f35294u1;
        if (i14 != 1) {
            if (i14 != 2 || this.f35259c1 == null || (view = this.f35280n1) == null) {
                return;
            }
            T0(view, true);
            return;
        }
        if (this.f35259c1 == null || this.l1.isEmpty()) {
            return;
        }
        for (int i15 = 0; i15 < this.l1.size(); i15++) {
            T0((View) this.l1.get(i15), true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ik0 ik0Var = this.f35257b1;
        if (ik0Var != null && ik0Var.f29396n) {
            return false;
        }
        boolean z10 = this.Z1;
        m.i3 i3Var = this.f35305z2;
        if (!z10 || motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f35268g2 = Float.MAX_VALUE;
            this.f35270h2 = Float.MAX_VALUE;
            this.Z1 = false;
            this.a2 = false;
            l1(this, false);
            this.f35264e2 = false;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            return super.onTouchEvent(motionEvent);
        }
        if (this.f35268g2 == Float.MAX_VALUE && this.f35270h2 == Float.MAX_VALUE) {
            this.f35268g2 = motionEvent.getX();
            this.f35270h2 = motionEvent.getY();
        }
        if (!this.a2 && Math.abs(motionEvent.getY() - this.f35270h2) > this.Y1) {
            this.a2 = true;
            l1(this, true);
        }
        if (this.a2) {
            L0(motionEvent.getX(), motionEvent.getY());
            org.telegram.ui.gi giVar = this.f35262d2;
            int[] iArr = this.f35272i2;
            org.telegram.ui.rn rnVar = giVar.d;
            iArr[0] = (int) rnVar.f42160o9;
            iArr[1] = rnVar.wa;
            if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.f35272i2[1] && (this.f35260c2 >= this.f35258b2 || !this.f35262d2.f38420a)) {
                this.f35266f2 = false;
                if (!this.f35264e2) {
                    this.f35264e2 = true;
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    AndroidUtilities.runOnUIThread(i3Var);
                    return true;
                }
            } else if (motionEvent.getY() >= AndroidUtilities.dp(56.0f) + this.f35272i2[0] || (this.f35260c2 > this.f35258b2 && this.f35262d2.f38420a)) {
                this.f35264e2 = false;
                AndroidUtilities.cancelRunOnUIThread(i3Var);
            } else {
                this.f35266f2 = true;
                if (!this.f35264e2) {
                    this.f35264e2 = true;
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    AndroidUtilities.runOnUIThread(i3Var);
                    return true;
                }
            }
        }
        return true;
    }

    public void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void q1(int i10, float f10, boolean z10) {
        r1(new nh.c(5), i10, f10, new vu(this, 15), z10);
    }

    public final void r1(Utilities.CallbackReturn callbackReturn, int i10, float f10, Utilities.Callback5 callback5, boolean z10) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new lh.e5(this, callbackReturn, sparseIntArray, 3), new ii(sparseIntArray, 2));
        s1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f10, callback5, z10);
    }

    @Override
    public void requestLayout() {
        if (this.T1 || this.f35303y2) {
            return;
        }
        super.requestLayout();
    }

    public final void s1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f10, Utilities.Callback5 callback5, boolean z10) {
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23162j6, this.f35277l2));
        this.E2 = callbackReturn2;
        this.H2 = f10;
        this.I2 = new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f};
        this.J2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10};
        this.F2 = callback5;
        f2.w0 w0Var = this.D2;
        if (w0Var != null) {
            p0(w0Var);
        }
        nk0 nk0Var = new nk0(this, callbackReturn, i10, z10);
        this.D2 = nk0Var;
        i(nk0Var);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.f35279m2 = z10;
    }

    @Override
    public void setAdapter(f2.q0 q0Var) {
        f2.q0 adapter = getAdapter();
        f2.g1 g1Var = this.f35285p2;
        if (adapter != null) {
            adapter.f5814a.unregisterObserver(g1Var);
        }
        ArrayList arrayList = this.l1;
        if (arrayList != null) {
            arrayList.clear();
            this.f35278m1.clear();
        }
        this.f35282o1 = -1;
        this.A1 = -1;
        this.B1 = null;
        this.C1.setEmpty();
        this.f35280n1 = null;
        if (q0Var instanceof vk0) {
            this.f35259c1 = (vk0) q0Var;
        } else {
            this.f35259c1 = null;
        }
        super.setAdapter(q0Var);
        if (q0Var != null) {
            q0Var.B(g1Var);
        }
        J0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.f35267g1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.f35292t1 = z10;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.C2 = z10;
    }

    public void setDisableHighlightState(boolean z10) {
        this.f35265f1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.M1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.Q0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.f35300x1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.Y0;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.animate().setListener(null).cancel();
        }
        this.Y0 = view;
        if (this.U1 && view != null) {
            view.setVisibility(8);
        }
        if (!this.f35263e1) {
            this.f35299w2 = -1;
            J0(false);
            return;
        }
        View view3 = this.Y0;
        if (view3 != null) {
            this.f35299w2 = 8;
            view3.setVisibility(8);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.f35257b1 = new ik0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f35257b1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        ik0 ik0Var = this.f35257b1;
        if (ik0Var == null) {
            return;
        }
        ik0Var.setVisibility(z10 ? 0 : 8);
        this.f35257b1.T = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.f35298w1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.N1 = z10;
    }

    @Override
    public void setItemAnimator(f2.v0 v0Var) {
        super.setItemAnimator(v0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.f35291s2 = genericProvider;
    }

    public void setItemsEnterAnimator(gk0 gk0Var) {
        this.f35274j2 = gk0Var;
    }

    public void setListSelectorColor(Integer num) {
        int iIntValue;
        org.telegram.ui.Cells.z zVar = this.f35304z1;
        if (num == null) {
            iIntValue = org.telegram.ui.ActionBar.g6.v0(b1() ? org.telegram.ui.ActionBar.g6.f23162j6 : org.telegram.ui.ActionBar.g6.f23144i6, this.f35277l2);
        } else {
            iIntValue = num.intValue();
        }
        org.telegram.ui.ActionBar.g6.B1(zVar, iIntValue, true);
    }

    public void setOnInterceptTouchListener(ok0 ok0Var) {
        this.X0 = ok0Var;
    }

    public void setOnItemClickListener(pk0 pk0Var) {
        this.R0 = pk0Var;
    }

    public void setOnItemLongClickListener(rk0 rk0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.T0 = rk0Var;
        n1.d dVar = this.I1;
        boolean z10 = rk0Var != null;
        y10 y10Var = (y10) dVar.f18088b;
        y10Var.f34776t = z10;
        y10Var.f34777u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(f2.b1 b1Var) {
        this.W0 = b1Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.f35269h1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.f35290s1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.f35283o2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.P1 = z10;
    }

    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsType(int i10) {
        this.f35294u1 = i10;
        if (i10 == 1 || i10 == 3) {
            this.l1 = new ArrayList();
            this.f35278m1 = new ArrayList();
        }
    }

    public void setSelectorDrawableColor(int i10) {
        org.telegram.ui.Cells.z zVar = this.f35304z1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i11 = this.f35302y1;
        if (i11 == 8) {
            this.f35304z1 = org.telegram.ui.ActionBar.g6.Y(i10, this.W1, 0);
        } else if (i11 == 9) {
            this.f35304z1 = null;
        } else {
            int i12 = this.X1;
            if (i12 > 0) {
                this.f35304z1 = org.telegram.ui.ActionBar.g6.Y(i10, i12, i12);
            } else {
                int i13 = this.W1;
                if (i13 > 0 && i11 != 1) {
                    this.f35304z1 = org.telegram.ui.ActionBar.g6.i0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.f35304z1 = org.telegram.ui.ActionBar.g6.f0(i10, 2, -1);
                } else {
                    this.f35304z1 = org.telegram.ui.ActionBar.g6.f0(i10, i11, i13);
                }
            }
        }
        org.telegram.ui.Cells.z zVar2 = this.f35304z1;
        if (zVar2 != null) {
            zVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i10) {
        this.W1 = i10;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.f35276k2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.f35302y1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.f35296v1 = z10;
    }

    public void setTopBottomSelectorRadius(int i10) {
        this.X1 = i10;
    }

    public void setTranslateSelector(boolean z10) {
        this.E1 = z10 ? -2 : -1;
    }

    public void setTranslateSelectorPosition(int i10) {
        if (i10 <= 0) {
            i10 = -1;
        }
        this.E1 = i10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ik0 ik0Var = this.f35257b1;
        if (ik0Var != null) {
            ik0Var.setTranslationY(f10);
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
        if (!this.V0) {
            return super.v(i10, i11, i12, iArr, iArr2);
        }
        sk0 sk0Var = this.U0;
        if (sk0Var != null) {
            sk0Var.s(i11);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        return true;
    }

    public final void v1() {
        org.telegram.ui.Cells.z zVar = this.f35304z1;
        if (zVar == null || !zVar.isStateful()) {
            return;
        }
        if (this.J1 != null) {
            if (this.f35304z1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.f35304z1);
            }
        } else if (this.R1 == null) {
            this.f35304z1.setState(StateSet.NOTHING);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f35304z1 == drawable || super.verifyDrawable(drawable);
    }

    public void setOnItemClickListener(qk0 qk0Var) {
        this.S0 = qk0Var;
    }

    public void setOnItemLongClickListener(sk0 sk0Var) {
        n1(sk0Var, ViewConfiguration.getLongPressTimeout());
    }

    public zk0(Context context) {
        this(context, null);
    }
}
