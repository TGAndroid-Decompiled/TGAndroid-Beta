package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
public class hv0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public static DispatchQueue f29234q0;
    public static boolean f29235r0;
    public int A;
    public boolean B;
    public final org.telegram.ui.ActionBar.b5 C;
    public org.telegram.ui.ActionBar.q1 D;
    public int E;
    public boolean F;
    public sv0 G;
    public cg.h0 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public dv0 M;
    public dv0 N;
    public final ArrayList O;
    public final ArrayList P;
    public final Matrix Q;
    public final Matrix R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final Paint V;
    public Paint W;
    public final Rect f29236a;
    public Paint f29237a0;
    public Drawable f29238b;
    public float f29239b0;
    public boolean f29240c;
    public ValueAnimator f29241c0;
    public Drawable d;
    public boolean f29242d0;
    public boolean f29243e;
    public int f29244e0;
    public int f29245f;
    public int f29246f0;
    public int f29247g0;
    public int h;
    public float f29248h0;
    public final androidx.activity.g f29249i0;
    public float f29250j0;
    public float f29251k0;
    public RenderNode[] f29252l0;
    public final boolean[] m0;
    public gv0 f29253n;
    public final boolean[] f29254n0;
    public final ArrayList f29255o0;
    public final ArrayList f29256p0;
    public final ArrayList f29257r;
    public boolean f29258s;
    public c81 v;
    public float f29259w;
    public float f29260x;
    public float f29261y;

    public hv0(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f29236a = new Rect();
        this.f29257r = new ArrayList();
        this.f29258s = true;
        this.f29261y = 1.0f;
        this.B = true;
        this.O = new ArrayList(10);
        this.P = new ArrayList();
        this.Q = new Matrix();
        this.R = new Matrix();
        this.S = new Paint();
        this.T = new Paint();
        this.U = new Paint();
        this.V = new Paint();
        this.f29248h0 = 1.0f;
        this.f29249i0 = new androidx.activity.g(this);
        this.m0 = new boolean[2];
        this.f29254n0 = new boolean[2];
        this.f29255o0 = new ArrayList();
        this.f29256p0 = new ArrayList();
        setWillNotDraw(false);
        this.C = b5Var;
        this.D = null;
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void H(hv0 hv0Var, Canvas canvas) {
        if (hv0Var.H != null && org.telegram.ui.ActionBar.g6.G1 && LiteMode.isEnabled(32)) {
            if (hv0Var.G == null) {
                sv0 sv0Var = new sv0(1);
                hv0Var.G = sv0Var;
                sv0Var.f32729g = -1;
                sv0Var.c();
            }
            hv0Var.G.b(canvas, hv0Var.H);
        }
    }

    public static float getBlurRadius() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            if (devicePerformanceClass != 2) {
                return 3.0f;
            }
            return 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int dp;
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            if (devicePerformanceClass != 2) {
                dp = AndroidUtilities.dp(15.0f);
            } else {
                return AndroidUtilities.density;
            }
        } else {
            dp = AndroidUtilities.dp(12.0f);
        }
        return dp;
    }

    public final void I() {
        if (!this.f29243e && !this.f29240c) {
            c81 c81Var = this.v;
            if (c81Var != null) {
                c81Var.c(false);
                this.v = null;
                this.f29261y = 1.0f;
                this.f29259w = 0.0f;
                this.f29260x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            c81 c81Var2 = new c81(getContext());
            this.v = c81Var2;
            c81Var2.f27378n = new cv(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                c81 c81Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                c81Var3.getClass();
                this.f29261y = c81.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.B) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.g6.f23424xf;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23441yf;
        }
        K(canvas, f9, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.g6.v0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hv0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f29242d0 = true;
            if (this.K && !this.L) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f29254n0;
        int i10 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    public boolean O() {
        return this instanceof org.telegram.ui.km;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.cb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.cb);
    }

    public int R() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f29236a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        int max = Math.max(0, ((height - i10) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
        this.f29245f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f29261y = c81.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f29253n == null && this.f29257r.isEmpty()) {
            return;
        }
        this.f29245f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new p90(5, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f29238b == drawable) {
            return;
        }
        if (this.H == null) {
            cg.h0 h0Var = new cg.h0(this, getContext(), 21);
            this.H = h0Var;
            addView(h0Var, 0, i7.f6.c(-1.0f, -1));
        }
        if (drawable instanceof yb0) {
            ((yb0) drawable).r(this.H);
        }
        if (this.I) {
            Drawable drawable2 = this.f29238b;
            if (drawable2 instanceof org.telegram.ui.wn) {
                ((org.telegram.ui.wn) drawable2).g(this.H);
            }
        }
        this.f29238b = drawable;
        if (this.I && (drawable instanceof org.telegram.ui.wn)) {
            ((org.telegram.ui.wn) drawable).f(this.H);
        }
        if (this.I) {
            Drawable drawable3 = this.f29238b;
            if (drawable3 instanceof yb0) {
                ((yb0) drawable3).l();
            }
        }
        if (this.I) {
            Drawable drawable4 = this.f29238b;
            if (drawable4 instanceof yb0) {
                ((yb0) drawable4).k();
            }
        }
        U(this.f29238b);
        I();
        this.H.invalidate();
    }

    public final void W() {
        dv0 dv0Var;
        dv0 dv0Var2;
        if (this.K && !this.L && this.f29242d0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f29242d0 = false;
                this.L = true;
                float f9 = dp;
                int i10 = ((int) (f9 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.O;
                if (arrayList.size() > 0) {
                    dv0Var = (dv0) com.google.android.recaptcha.internal.a.j(1, arrayList);
                } else {
                    dv0Var = null;
                }
                if (dv0Var == null) {
                    ?? obj = new Object();
                    obj.f27882c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f27881b = new Canvas(obj.f27882c);
                    dv0Var2 = obj;
                } else {
                    dv0Var.f27882c.eraseColor(0);
                    dv0Var2 = dv0Var;
                }
                float width = dv0Var2.f27882c.getWidth() / f10;
                float height = (dv0Var2.f27882c.getHeight() - 34) / f9;
                int save = dv0Var2.f27881b.save();
                dv0Var2.f27880a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                dv0Var2.f27881b.clipRect(1.0f, f11, dv0Var2.f27882c.getWidth(), dv0Var2.f27882c.getHeight() - 1);
                dv0Var2.f27881b.scale(width, height);
                dv0Var2.f27881b.translate(0.0f, f11 + dv0Var2.f27880a);
                dv0Var2.d = 1.0f / width;
                dv0Var2.f27883e = 1.0f / height;
                L(dv0Var2.f27881b, null);
                try {
                    dv0Var2.f27881b.restoreToCount(save);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                System.currentTimeMillis();
                int i12 = this.f29247g0 + 1;
                this.f29247g0 = i12;
                if (i12 >= 20) {
                    this.f29247g0 = 0;
                }
                if (f29234q0 == null) {
                    f29234q0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.f29249i0;
                gVar.f861b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.j5.d);
                gVar.d = dv0Var2;
                f29234q0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof ih.y5);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.m0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.K) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f29238b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f29238b instanceof org.telegram.ui.wn) {
            i10 = this.A;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f29238b;
        if (drawable instanceof yb0) {
            return this.A;
        }
        if (drawable instanceof org.telegram.ui.wn) {
            return this.A;
        }
        return 0;
    }

    public float getBlurRadiusInternal() {
        return getBlurRadius();
    }

    public float getBottomOffset() {
        return getMeasuredHeight();
    }

    public int getBottomPadding() {
        return 0;
    }

    public float getBottomTranslation() {
        return 0.0f;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getHeightWithKeyboard() {
        return getMeasuredHeight() + this.f29245f;
    }

    public int getKeyboardHeight() {
        return this.f29245f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.g6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.g6.f23146i0;
    }

    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        if (this.J && !this.K) {
            this.K = true;
            this.f29242d0 = true;
        }
        Drawable drawable = this.f29238b;
        if (drawable instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) drawable).f(this.H);
        }
        Drawable drawable2 = this.f29238b;
        if (drawable2 instanceof yb0) {
            ((yb0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) drawable3).f(this.H);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof yb0) {
            ((yb0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.I = false;
        this.S.setShader(null);
        this.T.setShader(null);
        this.U.setShader(null);
        this.V.setShader(null);
        ValueAnimator valueAnimator = this.f29241c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        dv0 dv0Var = this.M;
        if (dv0Var != null) {
            dv0Var.f27882c.recycle();
            this.M = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.O;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((dv0) arrayList.get(i10)).f27882c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.K = false;
        Drawable drawable = this.f29238b;
        if (drawable instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) drawable).g(this.H);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) drawable2).g(this.H);
        }
        Drawable drawable3 = this.f29238b;
        if (drawable3 instanceof yb0) {
            ((yb0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof yb0) {
            ((yb0) drawable4).l();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S();
    }

    public void setBackgroundTranslation(int i10) {
        if (i10 != this.A) {
            this.A = i10;
            cg.h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            cg.h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setDelegate(gv0 gv0Var) {
        this.f29253n = gv0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.E != i10) {
            this.E = i10;
            cg.h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f29258s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            cg.h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != getBackgroundImage() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void T() {
    }

    public void U(Drawable drawable) {
    }

    public void e() {
    }

    public void L(Canvas canvas, ArrayList arrayList) {
    }
}
