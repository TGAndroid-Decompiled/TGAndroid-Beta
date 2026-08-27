package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public class wj0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {

    public static final org.telegram.ui.Cells.b1 f34232g1 = new org.telegram.ui.Cells.b1(Float.class, "transitionProgress", 2);
    public final float A;
    public boolean A0;
    public final float B;
    public boolean B0;
    public int C;
    public boolean C0;
    public MessageObject D;
    public final Paint D0;
    public boolean E;
    public final Paint E0;
    public int F;
    public go F0;
    public long G;
    public boolean G0;
    public boolean H;
    public final AnimationNotificationsLocker H0;
    public boolean I;
    public final int I0;
    public boolean J;
    public boolean J0;
    public float K;
    public boolean K0;
    public long L;
    public Runnable L0;
    public ValueAnimator M;
    public boolean M0;
    public FrameLayout N;
    public p80 N0;
    public ag.y1 O;
    public int O0;
    public final ArrayList P;
    public int P0;
    public final ArrayList Q;
    public float Q0;
    public final ArrayList R;
    public float R0;
    public final org.telegram.ui.vq S;
    public lg.d S0;
    public final mj0 T;
    public lg.d T0;
    public final RectF U;
    public lg.d U0;
    public boolean V;
    public jg.a V0;
    public final HashSet W;
    public mg.d W0;
    public boolean X0;
    public boolean Y0;
    public go Z0;

    public boolean f34233a;

    public final HashSet f34234a0;

    public boolean f34235a1;

    public final hh.f1 f34236b;

    public final int[] f34237b0;

    public boolean f34238b1;

    public final float f34239c;

    public vj0 f34240c0;

    public boolean f34241c1;
    public final ArrayList d;

    public final Rect f34242d0;

    public Paint f34243d1;

    public final ArrayList f34244e;

    public final Drawable f34245e0;

    public Matrix f34246e1;

    public final Paint f34247f;

    public final boolean f34248f0;

    public LinearGradient f34249f1;

    public final org.telegram.ui.ActionBar.c6 f34250g0;
    public final Paint h;

    public ig.q0 f34251h0;

    public int f34252i0;

    public float f34253j0;

    public float f34254k0;

    public float f34255l0;
    public float m0;

    public final Paint f34256n;

    public boolean f34257n0;

    public long f34258o0;

    public org.telegram.ui.ActionBar.n2 f34259p0;

    public ag.k2 f34260q0;

    public float f34261r;

    public gr f34262r0;

    public float f34263s;

    public float f34264s0;

    public ig.d0 f34265t0;

    public ValueAnimator f34266u0;
    public float v;

    public final uj0 f34267v0;

    public final RectF f34268w;

    public boolean f34269w0;

    public final Path f34270x;

    public float f34271x0;

    public float f34272y;

    public final HashSet f34273y0;

    public final HashSet f34274z0;

    public wj0(int i10, int i11, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f34233a = false;
        this.d = new ArrayList();
        this.f34244e = new ArrayList();
        Paint paint = new Paint(1);
        this.f34247f = paint;
        this.h = new Paint(1);
        this.f34256n = new Paint(1);
        this.v = 1.0f;
        this.f34268w = new RectF();
        this.f34270x = new Path();
        this.f34272y = AndroidUtilities.dp(72.0f);
        float fDp = AndroidUtilities.dp(8.0f);
        this.A = fDp;
        this.B = fDp / 2.0f;
        this.C = AndroidUtilities.dp(36.0f);
        this.P = new ArrayList(20);
        this.Q = new ArrayList(10);
        this.R = new ArrayList(20);
        this.U = new RectF();
        this.V = false;
        this.W = new HashSet();
        this.f34234a0 = new HashSet();
        this.f34237b0 = new int[2];
        Rect rect = new Rect();
        this.f34242d0 = rect;
        new ArrayList();
        this.f34273y0 = new HashSet();
        this.f34274z0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.D0 = paint2;
        Paint paint3 = new Paint(1);
        this.E0 = paint3;
        this.H0 = new AnimationNotificationsLocker();
        this.K0 = true;
        this.f34238b1 = false;
        this.I0 = i10;
        this.f34239c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var));
        paint3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Jj, c6Var));
        this.f34250g0 = c6Var;
        this.F = i11;
        this.f34259p0 = n2Var;
        uj0 uj0Var = new uj0(this, context);
        this.f34267v0 = uj0Var;
        uj0Var.setVisibility(8);
        uj0Var.K = false;
        uj0Var.f33101c.setVisibility(8);
        addView(uj0Var);
        this.f34248f0 = SharedConfig.animationsEnabled() && SharedConfig.getDevicePerformanceClass() != 0;
        Drawable drawableMutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f34245e0 = drawableMutate;
        int iDp = AndroidUtilities.dp(7.0f);
        rect.bottom = iDp;
        rect.right = iDp;
        rect.top = iDp;
        rect.left = iDp;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Td, false), PorterDuff.Mode.MULTIPLY));
        hh.f1 f1Var = new hh.f1(this, context, 18);
        this.f34236b = f1Var;
        f1Var.setClipChildren(false);
        f1Var.setClipToPadding(false);
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) this, 3);
        this.S = vqVar;
        f1Var.i(new jj0(this, 0));
        f1Var.setLayoutManager(vqVar);
        f1Var.setOverScrollMode(2);
        mj0 mj0Var = new mj0(this);
        this.T = mj0Var;
        f1Var.setAdapter(mj0Var);
        f1Var.j(new qj0(this));
        f1Var.j(new xm(this, 9));
        f1Var.i(new jj0(this, 1));
        f1Var.setOnItemClickListener(new j(this, 11));
        f1Var.setOnItemLongClickListener((rk0) new cg.p2(this, i10, 7));
        addView(f1Var, h7.z5.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (f1Var.getLayoutParams().height - f1Var.getPaddingTop()) - f1Var.getPaddingBottom();
        uj0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        uj0Var.getLayoutParams().height = paddingTop;
        if (i10 == 2 || i10 == 4) {
            paint.setColor(i0.b.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(wj0 wj0Var) {
        if (wj0Var.f34265t0 != null) {
            return;
        }
        ig.d0 d0Var = new ig.d0(wj0Var.I0, wj0Var.f34259p0, wj0Var.R, wj0Var.W, wj0Var, wj0Var.f34250g0, wj0Var.f34233a);
        wj0Var.f34265t0 = d0Var;
        jg.a aVar = wj0Var.V0;
        boolean z10 = true;
        if (aVar != null) {
            mg.d dVar = wj0Var.W0;
            org.telegram.ui.r41 r41Var = d0Var.f11278m.f36387b0;
            r41Var.f41281x = true;
            r41Var.setBackground(null);
            r41Var.d();
            r41Var.invalidate();
            lg.d dVarC = aVar.c(d0Var.f11268a, null, true);
            dVarC.n(dVar);
            dVarC.p(AndroidUtilities.dp(12.0f));
            dVarC.o(AndroidUtilities.dp(8.0f));
            d0Var.f11290z = dVarC;
        }
        ig.d0 d0Var2 = wj0Var.f34265t0;
        vj0 vj0Var = wj0Var.f34240c0;
        if (vj0Var != null && !vj0Var.j()) {
            z10 = false;
        }
        d0Var2.f11278m.setLongPressEnabled(z10);
        wj0Var.j();
        wj0Var.f34265t0.f11281p = new mb0(wj0Var, 16);
        wj0Var.m();
    }

    public static void b(wj0 wj0Var, View view, float f10) {
        if (view instanceof uj0) {
            ((uj0) view).h = f10;
        } else {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public static boolean c() {
        return SharedConfig.deviceIsHigh();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        boolean z10 = true;
        while (i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        ig.q0 q0VarD = ig.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
                        if (z10 || longSparseArray.indexOfKey(q0VarD.h) >= 0) {
                            hashSet.add(Long.valueOf(q0VarD.h));
                            longSparseArray.put(q0VarD.h, q0VarD);
                        }
                    }
                }
            }
            int i12 = 0;
            while (i12 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i12)))) {
                    longSparseArray.removeAt(i12);
                    i12--;
                }
                i12++;
            }
            i10++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
            if (longSparseArray.valueAt(i13) != null) {
                hashSet2.add((ig.q0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        ig.d0 d0Var = this.f34265t0;
        if (d0Var != null) {
            if (!d0Var.f11282q) {
                d0Var.f11282q = true;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                int i10 = 0;
                valueAnimatorOfFloat.addUpdateListener(new ig.x(d0Var, i10));
                valueAnimatorOfFloat.addListener(new ig.b0(d0Var, i10));
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.start();
            }
            this.f34265t0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22381id != this.G || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            p(this.D, null, true);
            setVisibility(0);
            r(false);
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.availableEffectsUpdate) {
                p(this.D, null, true);
            }
        } else {
            if (this.I0 != 4) {
                return;
            }
            invalidate();
            hh.f1 f1Var = this.f34236b;
            f1Var.invalidate();
            f1Var.f1();
            for (int i12 = 0; i12 < f1Var.getChildCount(); i12++) {
                View childAt = f1Var.getChildAt(i12);
                if (childAt instanceof uj0) {
                    uj0 uj0Var = (uj0) childAt;
                    uj0Var.f33099a.invalidate();
                    uj0Var.f33100b.invalidate();
                } else {
                    childAt.invalidate();
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float width;
        float f11;
        float fMax;
        float fMax2;
        float f12;
        int i10;
        float f13;
        RectF rectF;
        float f14;
        int i11;
        RectF rectF2;
        hh.f1 f1Var;
        float f15;
        RectF rectF3;
        RectF rectF4;
        int i12;
        float f16;
        float f17;
        float f18;
        k5 k5Var;
        jh.y2 y2Var;
        int i13;
        int i14;
        vj0 vj0Var;
        Canvas canvas2 = canvas;
        long jMin = Math.min(16L, System.currentTimeMillis() - this.L);
        this.L = System.currentTimeMillis();
        boolean z10 = this.J;
        if (z10) {
            float f19 = this.K;
            if (f19 != 1.0f) {
                this.K = Math.min(1.0f, (jMin / 220.0f) + f19);
                invalidate();
            } else if (!z10) {
                f10 = this.K;
                if (f10 != 0.0f) {
                    this.K = Math.max(0.0f, f10 - (jMin / 220.0f));
                    invalidate();
                }
            }
        } else if (!z10) {
            f10 = this.K;
            if (f10 != 0.0f) {
                this.K = Math.max(0.0f, f10 - (jMin / 220.0f));
                invalidate();
            }
        }
        p80 p80Var = this.N0;
        if (p80Var != null) {
            p80Var.setTranslationY(-g());
        }
        float fMax3 = (Math.max(0.25f, Math.min(this.v, 1.0f)) - 0.25f) / 0.75f;
        float f20 = this.A * fMax3;
        float f21 = this.B * fMax3;
        HashSet hashSet = this.f34274z0;
        hashSet.clear();
        HashSet hashSet2 = this.f34273y0;
        hashSet.addAll(hashSet2);
        hashSet2.clear();
        if (this.X0) {
            invalidate();
        }
        ig.q0 q0Var = this.f34251h0;
        int i15 = this.I0;
        if (q0Var != null && i15 != 5 && ((vj0Var = this.f34240c0) == null || vj0Var.j())) {
            float f22 = this.f34253j0;
            if (f22 != 1.0f) {
                float longPressTimeout = (16.0f / (this.f34251h0.f11408a ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f22;
                this.f34253j0 = longPressTimeout;
                if (longPressTimeout >= 1.0f) {
                    this.f34253j0 = 1.0f;
                }
                invalidate();
            }
        }
        ig.q0 q0Var2 = this.f34251h0;
        if (q0Var2 == null || !q0Var2.f11408a) {
            float f23 = this.f34253j0;
            this.f34255l0 = (f23 * 2.0f) + 1.0f;
            this.m0 = 1.0f - (f23 * 0.15f);
        } else {
            this.f34255l0 = 1.0f;
            this.m0 = 1.0f;
        }
        int iSave = canvas2.save();
        if (LocaleController.isRTL || this.I) {
            width = getWidth();
            f11 = 0.125f;
        } else {
            width = getWidth();
            f11 = 0.875f;
        }
        float f24 = width * f11;
        float f25 = this.v;
        if (f25 != 1.0f) {
            canvas2.scale(f25, f25, f24, getHeight() / 2.0f);
        }
        if (LocaleController.isRTL || this.I) {
            fMax = Math.max(0.25f, this.v);
            fMax2 = 0.0f;
        } else {
            fMax2 = 1.0f - Math.max(0.25f, this.v);
            fMax = 1.0f;
        }
        float pullingLeftProgress = getPullingLeftProgress();
        float fG = g();
        go goVar = this.Z0;
        if (goVar != null) {
            goVar.setExpandSize(fG);
        }
        float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, fMax2);
        float topOffset = getTopOffset();
        float paddingLeft = getPaddingLeft() + width2;
        float paddingTop = getPaddingTop();
        hh.f1 f1Var2 = this.f34236b;
        float f26 = fMax2;
        float measuredHeight = (((1.0f - this.m0) * f1Var2.getMeasuredHeight()) + paddingTop) - fG;
        float width3 = (getWidth() - getPaddingRight()) * fMax;
        float f27 = fMax;
        float height = (getHeight() - getPaddingBottom()) + fG;
        RectF rectF5 = this.f34268w;
        rectF5.set(paddingLeft, measuredHeight, width3, height);
        this.f34272y = com.google.android.recaptcha.internal.a.w(fG, 2.0f, rectF5.height() - topOffset, 2.0f);
        if (i15 != 1) {
            f12 = 255.0f;
            int iClamp = (int) (Utilities.clamp(1.0f - (this.f34264s0 / 0.05f), 1.0f, 0.0f) * 255.0f);
            Drawable drawable = this.f34245e0;
            drawable.setAlpha(iClamp);
            float paddingLeft2 = getPaddingLeft();
            int width4 = getWidth() - getPaddingRight();
            Rect rect = this.f34242d0;
            int i16 = (int) fG;
            drawable.setBounds((int) ((((width4 + rect.right) * f26) + paddingLeft2) - rect.left), (getPaddingTop() - rect.top) - i16, (int) (((getWidth() - getPaddingRight()) + rect.right) * f27), (getHeight() - getPaddingBottom()) + rect.bottom + i16);
            if (this.S0 == null) {
                drawable.draw(canvas2);
            }
        } else {
            f12 = 255.0f;
        }
        canvas2.restoreToCount(iSave);
        if (this.Y0) {
            i10 = i15;
            f13 = f24;
            rectF = rectF5;
            f14 = 2.0f;
        } else {
            int iSave2 = canvas2.save();
            float f28 = this.v;
            if (f28 != 1.0f) {
                f14 = 2.0f;
                canvas2.scale(f28, f28, f24, getHeight() / 2.0f);
            } else {
                f14 = 2.0f;
            }
            if (i15 == 1 || this.f34240c0.t()) {
                i13 = iSave2;
                i10 = i15;
                rectF = rectF5;
                f13 = f24;
                i14 = 1;
                this.f34240c0.r(canvas, rectF, this.f34272y, getX(), getY(), 255, false);
                canvas2 = canvas;
            } else {
                lg.d dVar = this.S0;
                Paint paint = this.f34247f;
                if (dVar != null) {
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF5.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    this.S0.setBounds(rect2);
                    this.S0.setAlpha(paint.getAlpha());
                    this.S0.draw(canvas2);
                } else {
                    float f29 = this.f34272y;
                    canvas2.drawRoundRect(rectF5, f29, f29, paint);
                }
                i13 = iSave2;
                i10 = i15;
                f13 = f24;
                rectF = rectF5;
                i14 = 1;
            }
            if (this.V) {
                Iterator it = this.W.iterator();
                do {
                    if (!it.hasNext()) {
                        float f30 = this.f34272y;
                        float fClamp01 = Utilities.clamp01(1.0f - getPullingLeftProgress());
                        if (this.f34243d1 == null) {
                            this.f34243d1 = new Paint(i14);
                        }
                        if (this.f34246e1 == null) {
                            this.f34246e1 = new Matrix();
                        }
                        if (this.f34249f1 == null) {
                            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Jj, this.f34250g0);
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{iV0, org.telegram.ui.ActionBar.g6.l1(0.0f, iV0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            this.f34249f1 = linearGradient;
                            this.f34243d1.setShader(linearGradient);
                        }
                        this.f34246e1.reset();
                        this.f34246e1.postTranslate(rectF.left, rectF.top);
                        this.f34249f1.setLocalMatrix(this.f34246e1);
                        this.f34243d1.setAlpha((int) (fClamp01 * f12));
                        canvas2.drawRoundRect(rectF, f30, f30, this.f34243d1);
                        break;
                    }
                } while (!((ig.q0) it.next()).f11408a);
            }
            canvas2.restoreToCount(i13);
        }
        Path path = this.f34270x;
        path.rewind();
        float f31 = this.f34272y;
        path.addRoundRect(rectF, f31, f31, Path.Direction.CW);
        int iSave3 = canvas2.save();
        float f32 = this.v;
        if (f32 != 1.0f) {
            canvas2.scale(f32, f32, f13, getHeight() / f14);
        }
        if (this.v != 0.0f) {
            int i17 = i10;
            if (getAlpha() == 1.0f || i17 == 5) {
                int i18 = 0;
                int left = 0;
                int i19 = 0;
                while (i18 < f1Var2.getChildCount()) {
                    View childAt = f1Var2.getChildAt(i18);
                    int iAbs = (this.v == 1.0f || !SharedConfig.deviceIsHigh()) ? i19 : (int) (Math.abs((((childAt.getMeasuredWidth() / f14) + childAt.getLeft()) / f1Var2.getMeasuredWidth()) - 0.8f) * 200.0f);
                    float f33 = f21;
                    if (childAt instanceof uj0) {
                        uj0 uj0Var = (uj0) f1Var2.getChildAt(i18);
                        i12 = i18;
                        float fDp = this.f34271x0 != 0.0f ? AndroidUtilities.dp(46.0f) * Utilities.clamp(uj0Var.getLeft() / (getMeasuredWidth() - AndroidUtilities.dp(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress() : 0.0f;
                        ig.q0 q0Var3 = uj0Var.f33102e;
                        tj0 tj0Var = uj0Var.f33099a;
                        float f34 = fDp;
                        tj0 tj0Var2 = uj0Var.f33100b;
                        tj0 tj0Var3 = uj0Var.f33101c;
                        rectF4 = rectF;
                        if (q0Var3.equals(this.f34251h0)) {
                            tj0 tj0Var4 = tj0Var2.getVisibility() == 0 ? tj0Var2 : tj0Var;
                            uj0Var.setPivotX(uj0Var.getMeasuredWidth() >> 1);
                            uj0Var.setPivotY(tj0Var4.getY() + tj0Var4.getMeasuredHeight());
                            uj0Var.setScaleX(this.f34255l0);
                            uj0Var.setScaleY(this.f34255l0);
                            if (!this.f34257n0) {
                                if (this.M == null) {
                                    tj0Var3.setVisibility(0);
                                    tj0Var3.setAlpha(1.0f);
                                    if (tj0Var3.getImageReceiver().hasBitmapImage() || ((k5Var = tj0Var3.f30901e) != null && (y2Var = k5Var.f29961k) != null && y2Var.hasBitmapImage())) {
                                        tj0Var4.setAlpha(0.0f);
                                    }
                                    f18 = 1.0f;
                                } else {
                                    f18 = 1.0f;
                                    tj0Var3.setAlpha(1.0f - this.f34254k0);
                                    tj0Var4.setAlpha(this.f34254k0);
                                }
                                if (this.f34253j0 == f18) {
                                    this.f34257n0 = true;
                                    if (System.currentTimeMillis() - this.f34258o0 > 300) {
                                        this.f34258o0 = System.currentTimeMillis();
                                        this.f34240c0.n(uj0Var, uj0Var.f33102e, true, false);
                                    }
                                }
                            }
                            canvas2.save();
                            float x8 = uj0Var.getX() + f1Var2.getX();
                            float scaleX = ((uj0Var.getScaleX() * uj0Var.getMeasuredWidth()) - uj0Var.getMeasuredWidth()) / f14;
                            float f35 = x8 - scaleX;
                            if (f35 < 0.0f && uj0Var.getTranslationX() >= 0.0f) {
                                uj0Var.setTranslationX((-f35) - f34);
                            } else if (uj0Var.getMeasuredWidth() + x8 + scaleX <= getMeasuredWidth() || uj0Var.getTranslationX() > 0.0f) {
                                uj0Var.setTranslationX(0.0f - f34);
                            } else {
                                uj0Var.setTranslationX((((getMeasuredWidth() - x8) - uj0Var.getMeasuredWidth()) - scaleX) - f34);
                            }
                            canvas2.translate(uj0Var.getX() + f1Var2.getX(), uj0Var.getY() + f1Var2.getY());
                            canvas2.scale(uj0Var.getScaleX(), uj0Var.getScaleY(), uj0Var.getPivotX(), uj0Var.getPivotY());
                            uj0Var.draw(canvas2);
                            canvas2.restore();
                        } else {
                            f1Var2 = f1Var2;
                            int iR = RecyclerView.R(uj0Var);
                            float measuredWidth = (((this.f34255l0 - 1.0f) * uj0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.m0) * uj0Var.getMeasuredWidth()) * (Math.abs(this.f34252i0 - iR) - 1));
                            if (iR < this.f34252i0) {
                                uj0Var.setPivotX(0.0f);
                                uj0Var.setTranslationX(-measuredWidth);
                            } else {
                                uj0Var.setPivotX(uj0Var.getMeasuredWidth() - f34);
                                uj0Var.setTranslationX(measuredWidth - f34);
                            }
                            uj0Var.setPivotY(tj0Var.getY() + tj0Var.getMeasuredHeight());
                            uj0Var.setScaleX(this.m0);
                            uj0Var.setScaleY(this.m0);
                            tj0Var3.setVisibility(4);
                            tj0Var.setAlpha(1.0f);
                        }
                        if (childAt.getLeft() > left) {
                            left = childAt.getLeft();
                        }
                        if (!this.J0 && (!uj0Var.f33105r || tj0Var.getImageReceiver().getLottieAnimation() != null)) {
                            if ((uj0Var.getMeasuredWidth() / f14) + uj0Var.getX() > 0.0f && (uj0Var.getMeasuredWidth() / f14) + uj0Var.getX() < f1Var2.getWidth()) {
                                if (!hashSet.contains(uj0Var)) {
                                    uj0Var.c(iAbs);
                                    iAbs += 30;
                                }
                                hashSet2.add(uj0Var);
                            } else if (!uj0Var.f33104n) {
                                uj0Var.d();
                            }
                        }
                    } else {
                        iSave3 = iSave3;
                        rectF4 = rectF;
                        i12 = i18;
                        f1Var2 = f1Var2;
                        if (childAt != this.N) {
                            f16 = 0.0f;
                        } else if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= f1Var2.getWidth()) {
                            ag.k2 k2Var = this.f34260q0;
                            f16 = 0.0f;
                            k2Var.setScaleX(0.0f);
                            k2Var.setScaleY(0.0f);
                        } else {
                            if (!hashSet.contains(childAt)) {
                                if (this.v != 1.0f) {
                                    ag.k2 k2Var2 = this.f34260q0;
                                    f17 = 0.0f;
                                    k2Var2.setScaleX(0.0f);
                                    k2Var2.setScaleY(0.0f);
                                } else {
                                    f17 = 0.0f;
                                }
                                ag.k2 k2Var3 = this.f34260q0;
                                org.telegram.ui.Components.voip.h hVar = k2Var3.F;
                                if (hVar != null) {
                                    hVar.f33592g = f17;
                                    hVar.f33594j = false;
                                }
                                k2Var3.invalidate();
                                k2Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(iAbs).setInterpolator(AndroidUtilities.overshootInterpolator).setDuration(300L);
                                iAbs += 30;
                            }
                            hashSet2.add(childAt);
                            f16 = 0.0f;
                        }
                        if (childAt == this.O) {
                            if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= f16 || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= f1Var2.getWidth()) {
                                gr grVar = this.f34262r0;
                                grVar.setScaleX(0.0f);
                                grVar.setScaleY(0.0f);
                                ((wj0) grVar.f28803c).O.invalidate();
                                ValueAnimator valueAnimator = (ValueAnimator) grVar.f28802b;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                            } else {
                                if (!hashSet.contains(childAt)) {
                                    if (this.v != 1.0f) {
                                        gr grVar2 = this.f34262r0;
                                        grVar2.setScaleX(0.0f);
                                        grVar2.setScaleY(0.0f);
                                        ((wj0) grVar2.f28803c).O.invalidate();
                                        ValueAnimator valueAnimator2 = (ValueAnimator) grVar2.f28802b;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                    }
                                    gr grVar3 = this.f34262r0;
                                    boolean z11 = LiteMode.isEnabled(8200) || SharedConfig.getDevicePerformanceClass() >= 1;
                                    grVar3.invalidate();
                                    ValueAnimator valueAnimator3 = (ValueAnimator) grVar3.f28802b;
                                    if (valueAnimator3 != null) {
                                        valueAnimator3.removeAllListeners();
                                        ((ValueAnimator) grVar3.f28802b).cancel();
                                    }
                                    if (z11) {
                                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(grVar3.getScaleX(), 1.0f);
                                        grVar3.f28802b = valueAnimatorOfFloat;
                                        valueAnimatorOfFloat.setInterpolator(AndroidUtilities.overshootInterpolator);
                                        ((ValueAnimator) grVar3.f28802b).addUpdateListener(new v60(grVar3, 7));
                                        ((ValueAnimator) grVar3.f28802b).setStartDelay((long) (iAbs * ((wj0) grVar3.f28803c).f34239c));
                                        ((ValueAnimator) grVar3.f28802b).setDuration(300L);
                                        ((ValueAnimator) grVar3.f28802b).start();
                                    } else {
                                        grVar3.setScaleX(1.0f);
                                        grVar3.setScaleY(1.0f);
                                    }
                                    iAbs += 30;
                                }
                                hashSet2.add(childAt);
                            }
                        }
                        int iR2 = RecyclerView.R(childAt);
                        float measuredWidth2 = (((this.f34255l0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.m0) * childAt.getMeasuredWidth()) * (Math.abs(this.f34252i0 - iR2) - 1));
                        if (iR2 < this.f34252i0) {
                            childAt.setPivotX(0.0f);
                            childAt.setTranslationX(-measuredWidth2);
                        } else {
                            childAt.setPivotX(childAt.getMeasuredWidth());
                            childAt.setTranslationX(measuredWidth2);
                        }
                        childAt.setScaleX(this.m0);
                        childAt.setScaleY(this.m0);
                    }
                    i19 = iAbs;
                    i18 = i12 + 1;
                    canvas2 = canvas;
                    f21 = f33;
                    iSave3 = iSave3;
                    f1Var2 = f1Var2;
                    rectF = rectF4;
                }
                i11 = iSave3;
                rectF2 = rectF;
                f1Var = f1Var2;
                f15 = f21;
                uj0 uj0Var2 = this.f34267v0;
                if (pullingLeftProgress > 0.0f) {
                    float pullingLeftProgress2 = getPullingLeftProgress();
                    int measuredWidth3 = uj0Var2.getMeasuredWidth() - AndroidUtilities.dp(f14);
                    float f36 = left + measuredWidth3;
                    float fClamp = Utilities.clamp(f36 / (getMeasuredWidth() - uj0Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                    if (uj0Var2.getTag() == null) {
                        uj0Var2.setTag(Float.valueOf(1.0f));
                        uj0Var2.d();
                        uj0Var2.c(0);
                    }
                    float fClamp2 = Utilities.clamp(pullingLeftProgress2, 1.0f, 0.0f);
                    uj0Var2.setScaleX(fClamp2);
                    uj0Var2.setScaleY(fClamp2);
                    uj0Var2.setTranslationX(((f1Var.getX() + f36) - fClamp) + (-((i17 == 1 || i17 == 2) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(20.0f))));
                    if (uj0Var2.getVisibility() != 0) {
                        uj0Var2.setVisibility(0);
                    }
                } else {
                    if (uj0Var2.getVisibility() != 8 && this.K0) {
                        uj0Var2.setVisibility(8);
                    }
                    if (uj0Var2.getTag() != null) {
                        uj0Var2.setTag(null);
                    }
                }
            } else {
                i11 = iSave3;
                rectF2 = rectF;
                f1Var = f1Var2;
                f15 = f21;
            }
        } else {
            i11 = iSave3;
            rectF2 = rectF;
            f1Var = f1Var2;
            f15 = f21;
        }
        if (this.Y0 && this.f34265t0 != null) {
            int iZ = (int) org.telegram.messenger.y1.z(1.0f, this.f34264s0, Utilities.clamp(1.0f - (this.f34264s0 / 0.2f), 1.0f, 0.0f), 255.0f);
            canvas.save();
            f(f20, fMax3, f15, iZ, canvas);
            canvas.restore();
            return;
        }
        float f37 = f15;
        boolean zQ = q();
        if (!zQ) {
            canvas.clipPath(path);
        }
        canvas.translate((1.0f - this.v) * getWidth() * ((LocaleController.isRTL || this.I) ? -1 : 1), 0.0f);
        f1Var.setTranslationX(-width2);
        super.dispatchDraw(canvas);
        if (!zQ) {
            Paint paint2 = this.h;
            if (paint2 != null) {
                paint2.setAlpha((int) (Utilities.clamp(this.f34261r * this.v, 1.0f, 0.0f) * 255.0f));
                rectF3 = rectF2;
                canvas.drawRect(rectF3, paint2);
            } else {
                rectF3 = rectF2;
            }
            Paint paint3 = this.f34256n;
            if (paint3 != null) {
                paint3.setAlpha((int) (Utilities.clamp(this.f34263s * this.v, 1.0f, 0.0f) * 255.0f));
                canvas.drawRect(rectF3, paint3);
            }
        }
        canvas.restoreToCount(i11);
        f(f20, fMax3, f37, 255, canvas);
        invalidate();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        ig.d0 d0Var = this.f34265t0;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    public final void f(float f10, float f11, float f12, int i10, Canvas canvas) {
        float f13;
        if (this.I0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.H;
        RectF rectF = this.f34268w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), er.f28122f.getInterpolation(this.K)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            er erVar = er.f28122f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f14, 0.0f, erVar.getInterpolation(this.K)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), erVar.getInterpolation(this.K)));
        }
        float width = ((LocaleController.isRTL || this.I) ? this.C : getWidth() - this.C) + this.Q0;
        float paddingTop = this.H ? getPaddingTop() - g() : (getHeight() - getPaddingBottom()) + g();
        int iDp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.f34245e0;
        drawable.setAlpha(i10);
        Paint paint = this.f34247f;
        paint.setAlpha(i10);
        float f15 = width - f10;
        float f16 = iDp;
        float f17 = f16 * f11;
        float f18 = paddingTop - f10;
        float f19 = width + f10;
        float f20 = paddingTop + f10;
        drawable.setBounds((int) (f15 - f17), (int) (f18 - f17), (int) (f19 + f17), (int) (f17 + f20));
        drawable.draw(canvas);
        boolean zT = this.f34240c0.t();
        float f21 = paddingTop;
        RectF rectF2 = this.U;
        if (zT) {
            rectF2.set(f15, f18, f19, f20);
            f13 = f10;
            this.f34240c0.r(canvas, rectF2, f13, getX(), getY(), i10, false);
        } else {
            f13 = f10;
            if (this.T0 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f15, f18, f19, f20);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.T0.setBounds(rect);
                this.T0.setAlpha(paint.getAlpha());
                this.T0.draw(canvas);
            } else {
                canvas.drawCircle(width, f21, f13, paint);
            }
        }
        boolean z11 = LocaleController.isRTL;
        float f22 = this.A;
        float width2 = this.Q0 + this.R0 + ((z11 || this.I) ? this.C - f22 : (getWidth() - this.C) + f22);
        boolean z12 = this.H;
        float f23 = this.B;
        float fLerp = AndroidUtilities.lerp(z12 ? (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f) : ((getHeight() - f23) - f16) + g(), (f23 + f16) - g(), er.f28122f.getInterpolation(this.K));
        float f24 = (-AndroidUtilities.dp(1.0f)) * f11;
        drawable.setBounds((int) ((width2 - f13) - f24), (int) ((fLerp - f13) - f24), (int) (width2 + f13 + f24), (int) (f13 + fLerp + f24));
        drawable.draw(canvas);
        if (this.f34240c0.t()) {
            rectF2.set(width2 - f12, fLerp - f12, width2 + f12, fLerp + f12);
            this.f34240c0.r(canvas, rectF2, f12, getX(), getY(), i10, false);
        } else if (this.U0 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(width2 - f12, fLerp - f12, width2 + f12, fLerp + f12);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.U0.setBounds(rect2);
            this.U0.setAlpha(paint.getAlpha());
            this.U0.draw(canvas);
        } else {
            canvas.drawCircle(width2, fLerp, f12, paint);
        }
        canvas.restore();
        drawable.setAlpha(255);
        paint.setAlpha(255);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * AndroidUtilities.dp(6.0f));
    }

    public vj0 getDelegate() {
        return this.f34240c0;
    }

    public int getHintTextWidth() {
        return this.O0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.P.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.f34271x0 / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public ig.d0 getReactionsWindow() {
        return this.f34265t0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document documentF;
        HashSet hashSet = this.W;
        if (hashSet.isEmpty()) {
            return "";
        }
        ig.q0 q0Var = (ig.q0) hashSet.iterator().next();
        long j10 = q0Var.f11413g;
        String strFindAnimatedEmojiEmoticon = null;
        if (j10 != 0 && (documentF = k5.f(this.F, j10)) != null) {
            strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(documentF, null);
        }
        if (TextUtils.isEmpty(strFindAnimatedEmojiEmoticon)) {
            strFindAnimatedEmojiEmoticon = q0Var.f11412f;
        }
        return TextUtils.isEmpty(strFindAnimatedEmojiEmoticon) ? "👍" : strFindAnimatedEmojiEmoticon;
    }

    public HashSet<ig.q0> getSelectedReactions() {
        return this.W;
    }

    public float getTopOffset() {
        if (this.M0) {
            return ((FrameLayout.LayoutParams) this.f34236b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (q()) {
            return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
        }
        return AndroidUtilities.dp(16.0f) + i0.a.e(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
    }

    public List<ig.q0> getVisibleReactionsList() {
        return this.P;
    }

    public int getWindowType() {
        int i10 = this.I0;
        if (i10 == 4) {
            return 13;
        }
        if (i10 == 3) {
            return 11;
        }
        if (i10 == 5) {
            return 14;
        }
        return this.B0 ? 8 : 1;
    }

    public View getWindowView() {
        ig.d0 d0Var = this.f34265t0;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f11270c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.I0;
        if (i11 == 4) {
            int i12 = 0;
            for (ig.q0 q0Var : this.W) {
                if (!hashSet.contains(q0Var)) {
                    hashSet.add(q0Var);
                    arrayList.add(q0Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.F).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                ig.q0 q0VarC = ig.q0.c(enabledReactionsList.get(i10));
                if (!hashSet.contains(q0VarC)) {
                    hashSet.add(q0VarC);
                    arrayList.add(q0VarC);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
                i10++;
            }
            return;
        }
        if (!this.A0 || i11 == 4) {
            if (i11 != 3) {
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.F).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    arrayList.add(ig.q0.c(enabledReactionsList2.get(i10)));
                    i10++;
                }
                return;
            }
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.F).getSavedReactions();
            int i13 = 0;
            while (i10 < savedReactions.size()) {
                ig.q0 q0VarD = ig.q0.d(savedReactions.get(i10));
                if (!hashSet.contains(q0VarD)) {
                    hashSet.add(q0VarD);
                    arrayList.add(q0VarD);
                    i13++;
                }
                if (i13 == 16) {
                    return;
                } else {
                    i10++;
                }
            }
            return;
        }
        if (i11 == 5) {
            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.F).getAvailableEffects();
            if (availableEffects != null) {
                while (i10 < availableEffects.effects.size()) {
                    ig.q0 q0VarE = ig.q0.e(availableEffects.effects.get(i10));
                    if (!hashSet.contains(q0VarE)) {
                        hashSet.add(q0VarE);
                        arrayList.add(q0VarE);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        ArrayList<TLRPC.Reaction> savedReactions2 = i11 == 3 ? MediaDataController.getInstance(this.F).getSavedReactions() : MediaDataController.getInstance(this.F).getTopReactions();
        if (i11 == 3) {
            TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.F).getSavedReactionTags(0L);
            if (savedReactionTags != null) {
                for (int i14 = 0; i14 < savedReactionTags.tags.size(); i14++) {
                    ig.q0 q0VarD2 = ig.q0.d(savedReactionTags.tags.get(i14).reaction);
                    if (!hashSet.contains(q0VarD2)) {
                        hashSet.add(q0VarD2);
                        arrayList.add(q0VarD2);
                    }
                }
            }
            for (int i15 = 0; i15 < savedReactions2.size(); i15++) {
                ig.q0 q0VarD3 = ig.q0.d(savedReactions2.get(i15));
                if (!hashSet.contains(q0VarD3)) {
                    hashSet.add(q0VarD3);
                    arrayList.add(q0VarD3);
                }
            }
        } else {
            for (int i16 = 0; i16 < savedReactions2.size(); i16++) {
                ig.q0 q0VarD4 = ig.q0.d(savedReactions2.get(i16));
                if (!hashSet.contains(q0VarD4) && (i11 == 3 || UserConfig.getInstance(this.F).isPremium() || q0VarD4.f11413g == 0)) {
                    hashSet.add(q0VarD4);
                    arrayList.add(q0VarD4);
                }
            }
        }
        if (i11 != 3 || UserConfig.getInstance(this.F).isPremium()) {
            ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.F).getRecentReactions();
            for (int i17 = 0; i17 < recentReactions.size(); i17++) {
                ig.q0 q0VarD5 = ig.q0.d(recentReactions.get(i17));
                if (!hashSet.contains(q0VarD5)) {
                    hashSet.add(q0VarD5);
                    arrayList.add(q0VarD5);
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.F).getEnabledReactionsList();
            while (i10 < enabledReactionsList3.size()) {
                ig.q0 q0VarC2 = ig.q0.c(enabledReactionsList3.get(i10));
                if (!hashSet.contains(q0VarC2)) {
                    hashSet.add(q0VarC2);
                    arrayList.add(q0VarC2);
                }
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            hh.f1 f1Var = this.f34236b;
            if (i10 >= f1Var.getChildCount()) {
                return;
            }
            View childAt = f1Var.getChildAt(i10);
            if (childAt instanceof uj0) {
                ((uj0) childAt).f33100b.invalidate();
            }
            i10++;
        }
    }

    public final void k() {
        int iDp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, iDp, height, iW0, 0, tileMode));
        this.f34256n.setShader(new LinearGradient(getWidth(), height, getWidth() - iDp, height, iW0, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ig.q0 q0Var, boolean z10) {
        vj0 vj0Var = this.f34240c0;
        if (vj0Var != null) {
            vj0Var.n(view, q0Var, z10, true);
        }
        if (this.I0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.K0 = true;
        this.f34252i0 = 0;
        this.f34253j0 = 0.0f;
        this.f34271x0 = 0.0f;
        this.f34251h0 = null;
        this.f34257n0 = false;
        ij0 ij0Var = new ij0(this, 1);
        hh.f1 f1Var = this.f34236b;
        AndroidUtilities.forEachViews((RecyclerView) f1Var, (d5.d) ij0Var);
        this.f34273y0.clear();
        f1Var.invalidate();
        ag.y1 y1Var = this.O;
        if (y1Var != null) {
            y1Var.invalidate();
        }
        invalidate();
    }

    public final void o(jg.a aVar, mg.d dVar) {
        this.V0 = aVar;
        this.W0 = dVar;
        lg.d dVarC = aVar.c(this, null, true);
        dVarC.n(dVar);
        dVarC.p(AndroidUtilities.dp(24.0f));
        dVarC.o(AndroidUtilities.dp(8.0f));
        this.S0 = dVarC;
        lg.d dVarC2 = aVar.c(this, null, true);
        dVarC2.n(dVar);
        dVarC2.p(AndroidUtilities.dp(8.0f));
        dVarC2.o(AndroidUtilities.dp(8.0f));
        this.T0 = dVarC2;
        lg.d dVarC3 = aVar.c(this, null, true);
        dVarC3.n(dVar);
        dVarC3.p(AndroidUtilities.dp(4.0f));
        dVarC3.o(AndroidUtilities.dp(8.0f));
        this.U0 = dVarC3;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.F).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.I0 == 5) {
            NotificationCenter.getInstance(this.F).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.I0 == 5) {
            NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k();
    }

    public final void p(MessageObject messageObject, TLRPC.ChatFull chatFull, boolean z10) {
        int i10;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.D = messageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (tL_messageReactions2 = message.reactions) == null) {
            i10 = 0;
        } else {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i11);
                i11++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i10++;
                }
            }
        }
        int i12 = this.I0;
        this.E = i12 == 0 && this.D != null && i10 >= MessagesController.getInstance(this.F).getChatMaxUniqReactions(this.D.getDialogId());
        this.f34269w0 = i12 == 0 && this.D != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.F).getChat(Long.valueOf(-this.D.getDialogId())));
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.F).getChatFull(-messageObject.getFromChatId())) == null) {
            this.G = -messageObject.getFromChatId();
            MessagesController.getInstance(this.F).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.V = false;
        if (i12 == 3) {
            this.A0 = UserConfig.getInstance(this.F).isPremium();
            h(arrayList2);
        } else if (i12 == 5) {
            this.A0 = true;
            h(arrayList2);
        } else if (this.E) {
            this.A0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.V = true;
                ig.q0 q0Var = new ig.q0();
                q0Var.f11408a = true;
                arrayList2.add(q0Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.D.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(ig.q0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.V = true;
                ig.q0 q0Var2 = new ig.q0();
                q0Var2.f11408a = true;
                arrayList2.add(q0Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.F).getChat(Long.valueOf(chatFull.f22381id));
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.A0 = false;
                } else {
                    this.A0 = true;
                }
                h(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i14);
                    i14++;
                    TLRPC.Reaction reaction2 = reaction;
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(this.F).getEnabledReactionsList()) {
                        if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                            if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(ig.q0.d(reaction2));
                                break;
                            }
                        } else {
                            arrayList2.add(ig.q0.d(reaction2));
                            break;
                        }
                    }
                }
            }
        } else {
            this.A0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i15))) {
                i15--;
                arrayList2.remove(i15);
            } else {
                hashSet.add((ig.q0) arrayList2.get(i15));
            }
            i15++;
        }
        this.B0 = !this.E && ((!this.A0 && arrayList2.size() > 16) || (this.A0 && !UserConfig.getInstance(this.F).isPremium() && MessagesController.getInstance(this.F).premiumFeaturesBlocked()));
        if (i12 == 3 && !UserConfig.getInstance(this.F).isPremium()) {
            this.B0 = false;
        }
        if (i12 == 4) {
            this.B0 = true;
        }
        ArrayList arrayList5 = this.P;
        arrayList5.clear();
        if (q()) {
            int iDp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (iDp > 7) {
                iDp = 7;
            }
            if (iDp < 1) {
                iDp = 1;
            }
            int i16 = 0;
            while (i16 < Math.min(arrayList2.size(), iDp)) {
                arrayList5.add((ig.q0) arrayList2.get(i16));
                i16++;
            }
            if (i16 < arrayList2.size()) {
                uj0.a(this.f34267v0, (ig.q0) arrayList2.get(i16), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.C0 = true;
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (((ig.q0) arrayList5.get(i17)).f11413g != 0) {
                this.C0 = false;
            }
        }
        ArrayList arrayList6 = this.R;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        mj0 mj0Var = this.T;
        wj0 wj0Var = mj0Var.d;
        ArrayList arrayList7 = wj0Var.f34244e;
        ArrayList arrayList8 = wj0Var.P;
        ArrayList arrayList9 = wj0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i18 = 0; i18 < arrayList8.size(); i18++) {
            ig.q0 q0Var3 = (ig.q0) arrayList8.get(i18);
            arrayList9.add(new nj0(q0Var3.f11412f == null ? 3 : 0, q0Var3));
        }
        if (!wj0Var.Q.isEmpty() && !MessagesController.getInstance(wj0Var.F).premiumFeaturesBlocked()) {
            arrayList9.add(new nj0(1, null));
        }
        if (wj0Var.q()) {
            arrayList9.add(new nj0(2, null));
        }
        if (z10) {
            mj0Var.E(arrayList7, arrayList9);
        } else {
            mj0Var.l();
        }
        if (messageObject == null || (tL_messageReactions = messageObject.messageOwner.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i19 = 0; i19 < messageObject.messageOwner.reactions.results.size(); i19++) {
            if (messageObject.messageOwner.reactions.results.get(i19).chosen) {
                this.W.add(ig.q0.d(messageObject.messageOwner.reactions.results.get(i19).reaction));
            }
        }
    }

    public final boolean q() {
        return this.A0 || this.B0;
    }

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.G0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.H0.lock();
        boolean zDeviceIsHigh = SharedConfig.deviceIsHigh();
        org.telegram.ui.Cells.b1 b1Var = f34232g1;
        if (zDeviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new lh.k5(this, 1));
        duration.start();
    }

    @Override
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.f34273y0.clear();
            int i10 = 0;
            while (true) {
                hh.f1 f1Var = this.f34236b;
                if (i10 >= f1Var.getChildCount()) {
                    break;
                }
                if (f1Var.getChildAt(i10) instanceof uj0) {
                    ((uj0) f1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.Q0 = f10;
    }

    public void setChatScrimView(go goVar) {
        this.Z0 = goVar;
    }

    public void setCurrentAccount(int i10) {
        this.F = i10;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.f34264s0 = f10;
        go goVar = this.Z0;
        if (goVar != null) {
            goVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            this.f34262r0.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(28.0f), 0, i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 40)));
        } else {
            this.f34262r0.setBackground(null);
        }
    }

    public void setDelegate(vj0 vj0Var) {
        this.f34240c0 = vj0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        this.f34259p0 = n2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.M0 = true;
        if (this.N0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.f34250g0;
            p80 p80Var = new p80(context, c6Var);
            this.N0 = p80Var;
            p80Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.N0.setClickable(true);
            this.N0.setTextSize(1, 12.0f);
            int i10 = this.I0;
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                this.N0.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                this.N0.setAlpha(0.5f);
            } else {
                this.N0.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
            }
            this.N0.setGravity(1);
            addView(this.N0, h7.z5.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.N0.setText(charSequence);
        this.f34235a1 = false;
        ((FrameLayout.LayoutParams) this.f34267v0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.f34236b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMiniBubblesOffset(float f10) {
        this.R0 = f10;
    }

    public void setMirrorX(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.L0 = runnable;
    }

    public void setParentLayout(go goVar) {
        this.F0 = goVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.W;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            ig.q0 q0VarB = ig.q0.b(str);
            hashSet.add(q0VarB);
            this.f34234a0.add(q0VarB);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f34236b, (d5.d) new ij0(this, 0));
    }

    public void setSelectedReaction(ig.q0 q0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        this.T.l();
    }

    public void setSelectedReactionAnimated(ig.q0 q0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f34236b, (d5.d) new ij0(this, 0));
    }

    public void setSelectedReactionInclusive(ig.q0 q0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f34236b, (d5.d) new ij0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.W;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(ig.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.T.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.W;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.f34236b, (d5.d) new ij0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.Y0 != z10) {
            this.Y0 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    hh.f1 f1Var = this.f34236b;
                    if (i10 >= f1Var.getChildCount()) {
                        break;
                    }
                    if (f1Var.getChildAt(i10) instanceof uj0) {
                        uj0 uj0Var = (uj0) f1Var.getChildAt(i10);
                        boolean z11 = uj0Var.f33105r;
                        tj0 tj0Var = uj0Var.f33100b;
                        if (z11 && (tj0Var.getImageReceiver().getLottieAnimation() != null || tj0Var.getImageReceiver().getAnimation() != null)) {
                            tj0Var.setVisibility(0);
                            uj0Var.f33099a.setVisibility(4);
                            if (uj0Var.f33106s) {
                                uj0Var.v = true;
                            }
                        }
                        uj0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.W;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ig.q0.d(reaction));
        }
        this.T.l();
    }

    public void setTop(boolean z10) {
        this.H = z10;
    }

    public void setTransitionProgress(float f10) {
        this.v = f10;
        go goVar = this.F0;
        if (goVar != null) {
            if (!this.G0 || !SharedConfig.deviceIsHigh()) {
                f10 = 1.0f;
            }
            goVar.setReactionsTransitionProgress(f10);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
        }
    }

    public void m() {
    }
}
