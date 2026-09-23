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
public class pv0 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public static DispatchQueue f27140u0;
    public static boolean f27141v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.c5 G;
    public org.telegram.ui.ActionBar.p1 H;
    public int I;
    public boolean J;
    public aw0 K;
    public ci.bb L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public lv0 Q;
    public lv0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f27142a;
    public final Paint f27143a0;
    public Drawable f27144b;
    public final Paint f27145b0;
    public boolean f27146c;
    public final Paint f27147c0;
    public Drawable d;
    public Paint f27148d0;
    public boolean e;
    public Paint f27149e0;
    public int f27150f;
    public float f27151f0;
    public ValueAnimator f27152g0;
    public int h;
    public boolean f27153h0;
    public int f27154i0;
    public int f27155j0;
    public int f27156k0;
    public float f27157l0;
    public final androidx.activity.g m0;
    public ov0 f27158n;
    public float f27159n0;
    public float f27160o0;
    public RenderNode[] f27161p0;
    public final boolean[] f27162q0;
    public final ArrayList f27163r;
    public final boolean[] f27164r0;
    public boolean f27165s;
    public final ArrayList f27166s0;
    public final ArrayList f27167t0;
    public k81 v;
    public float f27168w;
    public float f27169x;
    public float f27170y;

    public pv0(Context context, org.telegram.ui.ActionBar.c5 c5Var) {
        super(context);
        this.f27142a = new Rect();
        this.f27163r = new ArrayList();
        this.f27165s = true;
        this.f27170y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f27143a0 = new Paint();
        this.f27145b0 = new Paint();
        this.f27147c0 = new Paint();
        this.f27157l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f27162q0 = new boolean[2];
        this.f27164r0 = new boolean[2];
        this.f27166s0 = new ArrayList();
        this.f27167t0 = new ArrayList();
        setWillNotDraw(false);
        this.G = c5Var;
        this.H = null;
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void G(pv0 pv0Var, Canvas canvas) {
        if (pv0Var.L != null && org.telegram.ui.ActionBar.h6.G1 && LiteMode.isEnabled(32)) {
            if (pv0Var.K == null) {
                aw0 aw0Var = new aw0(1);
                pv0Var.K = aw0Var;
                aw0Var.f22517g = -1;
                aw0Var.c();
            }
            pv0Var.K.b(canvas, pv0Var.L);
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
        if (!this.e && !this.f27146c) {
            k81 k81Var = this.v;
            if (k81Var != null) {
                k81Var.c(false);
                this.v = null;
                this.f27170y = 1.0f;
                this.f27168w = 0.0f;
                this.f27169x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            k81 k81Var2 = new k81(getContext());
            this.v = k81Var2;
            k81Var2.f25557n = new mv(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                k81 k81Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                k81Var3.getClass();
                this.f27170y = k81.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.h6.f19161xf;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19179yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.h6.v0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pv0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f27153h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f27164r0;
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
        return this instanceof org.telegram.ui.qm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.ib);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.ib);
    }

    public int R() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f27142a;
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
        this.f27150f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f27170y = k81.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f27158n == null && this.f27163r.isEmpty()) {
            return;
        }
        this.f27150f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new sr0(1, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f27144b == drawable) {
            return;
        }
        if (this.L == null) {
            ci.bb bbVar = new ci.bb(this, getContext(), 24);
            this.L = bbVar;
            addView(bbVar, 0, w7.x5.c(-1.0f, -1));
        }
        if (drawable instanceof bc0) {
            ((bc0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f27144b;
            if (drawable2 instanceof org.telegram.ui.ao) {
                ((org.telegram.ui.ao) drawable2).g(this.L);
            }
        }
        this.f27144b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.ao)) {
            ((org.telegram.ui.ao) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f27144b;
            if (drawable3 instanceof bc0) {
                ((bc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f27144b;
            if (drawable4 instanceof bc0) {
                ((bc0) drawable4).k();
            }
        }
        U(this.f27144b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        lv0 lv0Var;
        lv0 lv0Var2;
        if (this.O && !this.P && this.f27153h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19179yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f27153h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    lv0Var = (lv0) hg.c.z(1, arrayList);
                } else {
                    lv0Var = null;
                }
                if (lv0Var == null) {
                    ?? obj = new Object();
                    obj.f25952c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f25951b = new Canvas(obj.f25952c);
                    lv0Var2 = obj;
                } else {
                    lv0Var.f25952c.eraseColor(0);
                    lv0Var2 = lv0Var;
                }
                float width = lv0Var2.f25952c.getWidth() / f10;
                float height = (lv0Var2.f25952c.getHeight() - 34) / f7;
                int save = lv0Var2.f25951b.save();
                lv0Var2.f25950a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                lv0Var2.f25951b.clipRect(1.0f, f11, lv0Var2.f25952c.getWidth(), lv0Var2.f25952c.getHeight() - 1);
                lv0Var2.f25951b.scale(width, height);
                lv0Var2.f25951b.translate(0.0f, f11 + lv0Var2.f25950a);
                lv0Var2.d = 1.0f / width;
                lv0Var2.e = 1.0f / height;
                L(lv0Var2.f25951b, null);
                try {
                    lv0Var2.f25951b.restoreToCount(save);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                System.currentTimeMillis();
                int i12 = this.f27156k0 + 1;
                this.f27156k0 = i12;
                if (i12 >= 20) {
                    this.f27156k0 = 0;
                }
                if (f27140u0 == null) {
                    f27140u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f1881b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.j5.d);
                gVar.d = lv0Var2;
                f27140u0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof xh.t4);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f27162q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f27144b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f27144b instanceof org.telegram.ui.ao) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f27144b;
        if (drawable instanceof bc0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.ao) {
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
        return getMeasuredHeight() + this.f27150f;
    }

    public int getKeyboardHeight() {
        return this.f27150f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.h6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.h6.f18872i0;
    }

    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
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
            this.f27153h0 = true;
        }
        Drawable drawable = this.f27144b;
        if (drawable instanceof org.telegram.ui.ao) {
            ((org.telegram.ui.ao) drawable).f(this.L);
        }
        Drawable drawable2 = this.f27144b;
        if (drawable2 instanceof bc0) {
            ((bc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.ao) {
            ((org.telegram.ui.ao) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof bc0) {
            ((bc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f27143a0.setShader(null);
        this.f27145b0.setShader(null);
        this.f27147c0.setShader(null);
        ValueAnimator valueAnimator = this.f27152g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        lv0 lv0Var = this.Q;
        if (lv0Var != null) {
            lv0Var.f25952c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((lv0) arrayList.get(i10)).f25952c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f27144b;
        if (drawable instanceof org.telegram.ui.ao) {
            ((org.telegram.ui.ao) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.ao) {
            ((org.telegram.ui.ao) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f27144b;
        if (drawable3 instanceof bc0) {
            ((bc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof bc0) {
            ((bc0) drawable4).l();
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
            ci.bb bbVar = this.L;
            if (bbVar != null) {
                bbVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            ci.bb bbVar = this.L;
            if (bbVar != null) {
                bbVar.invalidate();
            }
        }
    }

    public void setDelegate(ov0 ov0Var) {
        this.f27158n = ov0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            ci.bb bbVar = this.L;
            if (bbVar != null) {
                bbVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f27165s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            ci.bb bbVar = this.L;
            if (bbVar != null) {
                bbVar.invalidate();
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
