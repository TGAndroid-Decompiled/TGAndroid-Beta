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
public class ow0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public static DispatchQueue f27762u0;
    public static boolean f27763v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.b5 G;
    public org.telegram.ui.ActionBar.o1 H;
    public int I;
    public boolean J;
    public zw0 K;
    public di.ab L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public kw0 Q;
    public kw0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f27764a;
    public final Paint f27765a0;
    public Drawable f27766b;
    public final Paint f27767b0;
    public boolean f27768c;
    public final Paint f27769c0;
    public Drawable d;
    public Paint f27770d0;
    public boolean e;
    public Paint f27771e0;
    public int f27772f;
    public float f27773f0;
    public ValueAnimator f27774g0;
    public int h;
    public boolean f27775h0;
    public int f27776i0;
    public int f27777j0;
    public int f27778k0;
    public float f27779l0;
    public final androidx.activity.g m0;
    public nw0 f27780n;
    public float f27781n0;
    public float f27782o0;
    public RenderNode[] f27783p0;
    public final boolean[] f27784q0;
    public final ArrayList f27785r;
    public final boolean[] f27786r0;
    public boolean f27787s;
    public final ArrayList f27788s0;
    public final ArrayList f27789t0;
    public o91 v;
    public float f27790w;
    public float f27791x;
    public float f27792y;

    public ow0(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f27764a = new Rect();
        this.f27785r = new ArrayList();
        this.f27787s = true;
        this.f27792y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f27765a0 = new Paint();
        this.f27767b0 = new Paint();
        this.f27769c0 = new Paint();
        this.f27779l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f27784q0 = new boolean[2];
        this.f27786r0 = new boolean[2];
        this.f27788s0 = new ArrayList();
        this.f27789t0 = new ArrayList();
        setWillNotDraw(false);
        this.G = b5Var;
        this.H = null;
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void G(ow0 ow0Var, Canvas canvas) {
        if (ow0Var.L != null && org.telegram.ui.ActionBar.g6.G1 && LiteMode.isEnabled(32)) {
            if (ow0Var.K == null) {
                zw0 zw0Var = new zw0(1);
                ow0Var.K = zw0Var;
                zw0Var.f31704g = -1;
                zw0Var.c();
            }
            ow0Var.K.b(canvas, ow0Var.L);
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
        if (!this.e && !this.f27768c) {
            o91 o91Var = this.v;
            if (o91Var != null) {
                o91Var.c(false);
                this.v = null;
                this.f27792y = 1.0f;
                this.f27790w = 0.0f;
                this.f27791x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            o91 o91Var2 = new o91(getContext());
            this.v = o91Var2;
            o91Var2.f27614n = new xv(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                o91 o91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                o91Var3.getClass();
                this.f27792y = o91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.g6.f19979xf;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.g6.w0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ow0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f27775h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f27786r0;
        int i10 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.T;
            if (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    public boolean O() {
        return this instanceof org.telegram.ui.xm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.ob);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.ob);
    }

    public int R() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f27764a;
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
        this.f27772f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f27792y = o91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f27780n == null && this.f27785r.isEmpty()) {
            return;
        }
        this.f27772f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new zr0(3, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f27766b == drawable) {
            return;
        }
        if (this.L == null) {
            di.ab abVar = new di.ab(this, getContext(), 24);
            this.L = abVar;
            addView(abVar, 0, w7.z5.d(-1.0f, -1));
        }
        if (drawable instanceof cd0) {
            ((cd0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f27766b;
            if (drawable2 instanceof org.telegram.ui.io) {
                ((org.telegram.ui.io) drawable2).g(this.L);
            }
        }
        this.f27766b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.io)) {
            ((org.telegram.ui.io) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f27766b;
            if (drawable3 instanceof cd0) {
                ((cd0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f27766b;
            if (drawable4 instanceof cd0) {
                ((cd0) drawable4).k();
            }
        }
        U(this.f27766b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        kw0 kw0Var;
        kw0 kw0Var2;
        if (this.O && !this.P && this.f27775h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f27775h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    kw0Var = (kw0) i2.d.A(1, arrayList);
                } else {
                    kw0Var = null;
                }
                if (kw0Var == null) {
                    ?? obj = new Object();
                    obj.f26504c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f26503b = new Canvas(obj.f26504c);
                    kw0Var2 = obj;
                } else {
                    kw0Var.f26504c.eraseColor(0);
                    kw0Var2 = kw0Var;
                }
                float width = kw0Var2.f26504c.getWidth() / f10;
                float height = (kw0Var2.f26504c.getHeight() - 34) / f7;
                int save = kw0Var2.f26503b.save();
                kw0Var2.f26502a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                kw0Var2.f26503b.clipRect(1.0f, f11, kw0Var2.f26504c.getWidth(), kw0Var2.f26504c.getHeight() - 1);
                kw0Var2.f26503b.scale(width, height);
                kw0Var2.f26503b.translate(0.0f, f11 + kw0Var2.f26502a);
                kw0Var2.d = 1.0f / width;
                kw0Var2.e = 1.0f / height;
                L(kw0Var2.f26503b, null);
                try {
                    kw0Var2.f26503b.restoreToCount(save);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                System.currentTimeMillis();
                int i12 = this.f27778k0 + 1;
                this.f27778k0 = i12;
                if (i12 >= 20) {
                    this.f27778k0 = 0;
                }
                if (f27762u0 == null) {
                    f27762u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f1032b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.m5.d);
                gVar.d = kw0Var2;
                f27762u0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof yh.r4);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f27784q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f27766b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f27766b instanceof org.telegram.ui.io) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f27766b;
        if (drawable instanceof cd0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.io) {
            return this.E;
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
        return getMeasuredHeight() + this.f27772f;
    }

    public int getKeyboardHeight() {
        return this.f27772f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.g6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.g6.f19684i0;
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
        this.M = true;
        if (this.N && !this.O) {
            this.O = true;
            this.f27775h0 = true;
        }
        Drawable drawable = this.f27766b;
        if (drawable instanceof org.telegram.ui.io) {
            ((org.telegram.ui.io) drawable).f(this.L);
        }
        Drawable drawable2 = this.f27766b;
        if (drawable2 instanceof cd0) {
            ((cd0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.io) {
            ((org.telegram.ui.io) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof cd0) {
            ((cd0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f27765a0.setShader(null);
        this.f27767b0.setShader(null);
        this.f27769c0.setShader(null);
        ValueAnimator valueAnimator = this.f27774g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kw0 kw0Var = this.Q;
        if (kw0Var != null) {
            kw0Var.f26504c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((kw0) arrayList.get(i10)).f26504c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f27766b;
        if (drawable instanceof org.telegram.ui.io) {
            ((org.telegram.ui.io) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.io) {
            ((org.telegram.ui.io) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f27766b;
        if (drawable3 instanceof cd0) {
            ((cd0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof cd0) {
            ((cd0) drawable4).l();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S();
    }

    public void setBackgroundTranslation(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            di.ab abVar = this.L;
            if (abVar != null) {
                abVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            di.ab abVar = this.L;
            if (abVar != null) {
                abVar.invalidate();
            }
        }
    }

    public void setDelegate(nw0 nw0Var) {
        this.f27780n = nw0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            di.ab abVar = this.L;
            if (abVar != null) {
                abVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f27787s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            di.ab abVar = this.L;
            if (abVar != null) {
                abVar.invalidate();
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

    public void d() {
    }

    public void L(Canvas canvas, ArrayList arrayList) {
    }
}
