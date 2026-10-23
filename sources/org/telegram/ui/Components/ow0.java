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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
public class ow0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static DispatchQueue f29325u0;
    public static boolean f29326v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.h5 G;
    public org.telegram.ui.ActionBar.o1 H;
    public int I;
    public boolean J;
    public zw0 K;
    public ai.jc L;
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
    public final Rect f29327a;
    public final Paint f29328a0;
    public Drawable f29329b;
    public final Paint f29330b0;
    public boolean f29331c;
    public final Paint f29332c0;
    public Drawable d;
    public Paint f29333d0;
    public boolean e;
    public Paint f29334e0;
    public int f29335f;
    public float f29336f0;
    public ValueAnimator f29337g0;
    public int h;
    public boolean f29338h0;
    public int f29339i0;
    public int f29340j0;
    public int f29341k0;
    public float f29342l0;
    public final androidx.activity.g m0;
    public nw0 f29343n;
    public float f29344n0;
    public float f29345o0;
    public RenderNode[] f29346p0;
    public final boolean[] f29347q0;
    public final ArrayList f29348r;
    public final boolean[] f29349r0;
    public boolean f29350s;
    public final ArrayList f29351s0;
    public final ArrayList f29352t0;
    public o91 v;
    public float f29353w;
    public float f29354x;
    public float f29355y;

    public ow0(Context context, org.telegram.ui.ActionBar.h5 h5Var) {
        super(context);
        this.f29327a = new Rect();
        this.f29348r = new ArrayList();
        this.f29350s = true;
        this.f29355y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f29328a0 = new Paint();
        this.f29330b0 = new Paint();
        this.f29332c0 = new Paint();
        this.f29342l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f29347q0 = new boolean[2];
        this.f29349r0 = new boolean[2];
        this.f29351s0 = new ArrayList();
        this.f29352t0 = new ArrayList();
        setWillNotDraw(false);
        this.G = h5Var;
        this.H = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void F(ow0 ow0Var, Canvas canvas) {
        if (ow0Var.L != null && org.telegram.ui.ActionBar.k6.G1 && LiteMode.isEnabled(32)) {
            if (ow0Var.K == null) {
                zw0 zw0Var = new zw0(1);
                ow0Var.K = zw0Var;
                zw0Var.f33349g = -1;
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

    public final void H() {
        if (!this.e && !this.f29331c) {
            o91 o91Var = this.v;
            if (o91Var != null) {
                o91Var.c(false);
                this.v = null;
                this.f29355y = 1.0f;
                this.f29353w = 0.0f;
                this.f29354x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            o91 o91Var2 = new o91(getContext());
            this.v = o91Var2;
            o91Var2.f29123n = new tv(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                o91 o91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                o91Var3.getClass();
                this.f29355y = o91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void I(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (E() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.k6.f21562xf;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.yf;
        }
        J(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.k6.w0(i10, getResourceProvider())));
    }

    public final void J(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ow0.J(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void L() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f29338h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void M() {
        boolean[] zArr = this.f29349r0;
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

    public boolean N() {
        return this instanceof org.telegram.ui.km;
    }

    public boolean O() {
        return !(this instanceof org.telegram.ui.jb);
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.jb);
    }

    public int Q() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f29327a;
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
        this.f29335f = max;
        return max;
    }

    public void R() {
        boolean z10;
        if (this.v != null) {
            this.f29355y = o91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f29343n == null && this.f29348r.isEmpty()) {
            return;
        }
        this.f29335f = Q();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new b60(6, this, z10));
    }

    public final void U(Drawable drawable) {
        if (this.f29329b == drawable) {
            return;
        }
        if (this.L == null) {
            ai.jc jcVar = new ai.jc(this, getContext(), 24);
            this.L = jcVar;
            addView(jcVar, 0, w7.z5.c(-1.0f, -1));
        }
        if (drawable instanceof yc0) {
            ((yc0) drawable).q(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f29329b;
            if (drawable2 instanceof org.telegram.ui.vn) {
                ((org.telegram.ui.vn) drawable2).g(this.L);
            }
        }
        this.f29329b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.vn)) {
            ((org.telegram.ui.vn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f29329b;
            if (drawable3 instanceof yc0) {
                ((yc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f29329b;
            if (drawable4 instanceof yc0) {
                ((yc0) drawable4).k();
            }
        }
        T(this.f29329b);
        H();
        this.L.invalidate();
    }

    public final void V() {
        kw0 kw0Var;
        kw0 kw0Var2;
        if (this.O && !this.P && this.f29338h0 && SharedConfig.chatBlurEnabled() && !E() && Color.alpha(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f29338h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    kw0Var = (kw0) i2.o1.A(1, arrayList);
                } else {
                    kw0Var = null;
                }
                if (kw0Var == null) {
                    ?? obj = new Object();
                    obj.f28174c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f28173b = new Canvas(obj.f28174c);
                    kw0Var2 = obj;
                } else {
                    kw0Var.f28174c.eraseColor(0);
                    kw0Var2 = kw0Var;
                }
                float width = kw0Var2.f28174c.getWidth() / f10;
                float height = (kw0Var2.f28174c.getHeight() - 34) / f7;
                int save = kw0Var2.f28173b.save();
                kw0Var2.f28172a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                kw0Var2.f28173b.clipRect(1.0f, f11, kw0Var2.f28174c.getWidth(), kw0Var2.f28174c.getHeight() - 1);
                kw0Var2.f28173b.scale(width, height);
                kw0Var2.f28173b.translate(0.0f, f11 + kw0Var2.f28172a);
                kw0Var2.d = 1.0f / width;
                kw0Var2.e = 1.0f / height;
                K(kw0Var2.f28173b, null);
                try {
                    kw0Var2.f28173b.restoreToCount(save);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                System.currentTimeMillis();
                int i12 = this.f29341k0 + 1;
                this.f29341k0 = i12;
                if (i12 >= 20) {
                    this.f29341k0 = 0;
                }
                if (f29325u0 == null) {
                    f29325u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f2654b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.m5.d);
                gVar.d = kw0Var2;
                f29325u0.postRunnable(gVar);
            }
        }
    }

    public void W() {
        if (E()) {
            M();
        }
    }

    public boolean X() {
        return !(this instanceof yh.r4);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21562xf));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f29347q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            V();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f29329b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f29329b instanceof org.telegram.ui.vn) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f29329b;
        if (drawable instanceof yc0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.vn) {
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

    public int getHeightWithKeyboard() {
        return getMeasuredHeight() + this.f29335f;
    }

    public int getKeyboardHeight() {
        return this.f29335f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.k6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.k6.f21266i0;
    }

    public org.telegram.ui.ActionBar.g6 getResourceProvider() {
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
            this.f29338h0 = true;
        }
        Drawable drawable = this.f29329b;
        if (drawable instanceof org.telegram.ui.vn) {
            ((org.telegram.ui.vn) drawable).f(this.L);
        }
        Drawable drawable2 = this.f29329b;
        if (drawable2 instanceof yc0) {
            ((yc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.vn) {
            ((org.telegram.ui.vn) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof yc0) {
            ((yc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f29328a0.setShader(null);
        this.f29330b0.setShader(null);
        this.f29332c0.setShader(null);
        ValueAnimator valueAnimator = this.f29337g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kw0 kw0Var = this.Q;
        if (kw0Var != null) {
            kw0Var.f28174c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((kw0) arrayList.get(i10)).f28174c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f29329b;
        if (drawable instanceof org.telegram.ui.vn) {
            ((org.telegram.ui.vn) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.vn) {
            ((org.telegram.ui.vn) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f29329b;
        if (drawable3 instanceof yc0) {
            ((yc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof yc0) {
            ((yc0) drawable4).l();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setBackgroundTranslation(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            ai.jc jcVar = this.L;
            if (jcVar != null) {
                jcVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            ai.jc jcVar = this.L;
            if (jcVar != null) {
                jcVar.invalidate();
            }
        }
    }

    public void setDelegate(nw0 nw0Var) {
        this.f29343n = nw0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            ai.jc jcVar = this.L;
            if (jcVar != null) {
                jcVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f29350s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            ai.jc jcVar = this.L;
            if (jcVar != null) {
                jcVar.invalidate();
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

    public void S() {
    }

    public void T(Drawable drawable) {
    }

    public void updateColors() {
    }

    public void K(Canvas canvas, ArrayList arrayList) {
    }
}
