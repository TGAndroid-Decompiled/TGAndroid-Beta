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
public class lw0 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public static DispatchQueue f28289u0;
    public static boolean f28290v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.d5 G;
    public org.telegram.ui.ActionBar.o1 H;
    public int I;
    public boolean J;
    public ww0 K;
    public ai.ic L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public hw0 Q;
    public hw0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f28291a;
    public final Paint f28292a0;
    public Drawable f28293b;
    public final Paint f28294b0;
    public boolean f28295c;
    public final Paint f28296c0;
    public Drawable d;
    public Paint f28297d0;
    public boolean e;
    public Paint f28298e0;
    public int f28299f;
    public float f28300f0;
    public ValueAnimator f28301g0;
    public int h;
    public boolean f28302h0;
    public int f28303i0;
    public int f28304j0;
    public int f28305k0;
    public float f28306l0;
    public final androidx.activity.g m0;
    public kw0 f28307n;
    public float f28308n0;
    public float f28309o0;
    public RenderNode[] f28310p0;
    public final boolean[] f28311q0;
    public final ArrayList f28312r;
    public final boolean[] f28313r0;
    public boolean f28314s;
    public final ArrayList f28315s0;
    public final ArrayList f28316t0;
    public h91 v;
    public float f28317w;
    public float f28318x;
    public float f28319y;

    public lw0(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f28291a = new Rect();
        this.f28312r = new ArrayList();
        this.f28314s = true;
        this.f28319y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f28292a0 = new Paint();
        this.f28294b0 = new Paint();
        this.f28296c0 = new Paint();
        this.f28306l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f28311q0 = new boolean[2];
        this.f28313r0 = new boolean[2];
        this.f28315s0 = new ArrayList();
        this.f28316t0 = new ArrayList();
        setWillNotDraw(false);
        this.G = d5Var;
        this.H = null;
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void H(lw0 lw0Var, Canvas canvas) {
        if (lw0Var.L != null && org.telegram.ui.ActionBar.h6.G1 && LiteMode.isEnabled(32)) {
            if (lw0Var.K == null) {
                ww0 ww0Var = new ww0(1);
                lw0Var.K = ww0Var;
                ww0Var.f32263g = -1;
                ww0Var.c();
            }
            lw0Var.K.b(canvas, lw0Var.L);
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
        if (!this.e && !this.f28295c) {
            h91 h91Var = this.v;
            if (h91Var != null) {
                h91Var.c(false);
                this.v = null;
                this.f28319y = 1.0f;
                this.f28317w = 0.0f;
                this.f28318x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            h91 h91Var2 = new h91(getContext());
            this.v = h91Var2;
            h91Var2.f26841n = new tv(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                h91 h91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                h91Var3.getClass();
                this.f28319y = h91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.h6.f21372xf;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.h6.w0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f28302h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f28313r0;
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
        return this instanceof org.telegram.ui.jm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.jb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.jb);
    }

    public int R() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f28291a;
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
        this.f28299f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f28319y = h91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f28307n == null && this.f28312r.isEmpty()) {
            return;
        }
        this.f28299f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new b60(6, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f28293b == drawable) {
            return;
        }
        if (this.L == null) {
            ai.ic icVar = new ai.ic(this, getContext(), 25);
            this.L = icVar;
            addView(icVar, 0, w7.z5.c(-1.0f, -1));
        }
        if (drawable instanceof wc0) {
            ((wc0) drawable).q(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f28293b;
            if (drawable2 instanceof org.telegram.ui.tn) {
                ((org.telegram.ui.tn) drawable2).g(this.L);
            }
        }
        this.f28293b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.tn)) {
            ((org.telegram.ui.tn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f28293b;
            if (drawable3 instanceof wc0) {
                ((wc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f28293b;
            if (drawable4 instanceof wc0) {
                ((wc0) drawable4).k();
            }
        }
        U(this.f28293b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        hw0 hw0Var;
        hw0 hw0Var2;
        if (this.O && !this.P && this.f28302h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f28302h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    hw0Var = (hw0) i2.e.A(1, arrayList);
                } else {
                    hw0Var = null;
                }
                if (hw0Var == null) {
                    ?? obj = new Object();
                    obj.f27013c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f27012b = new Canvas(obj.f27013c);
                    hw0Var2 = obj;
                } else {
                    hw0Var.f27013c.eraseColor(0);
                    hw0Var2 = hw0Var;
                }
                float width = hw0Var2.f27013c.getWidth() / f10;
                float height = (hw0Var2.f27013c.getHeight() - 34) / f7;
                int save = hw0Var2.f27012b.save();
                hw0Var2.f27011a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                hw0Var2.f27012b.clipRect(1.0f, f11, hw0Var2.f27013c.getWidth(), hw0Var2.f27013c.getHeight() - 1);
                hw0Var2.f27012b.scale(width, height);
                hw0Var2.f27012b.translate(0.0f, f11 + hw0Var2.f27011a);
                hw0Var2.d = 1.0f / width;
                hw0Var2.e = 1.0f / height;
                L(hw0Var2.f27012b, null);
                try {
                    hw0Var2.f27012b.restoreToCount(save);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                System.currentTimeMillis();
                int i12 = this.f28305k0 + 1;
                this.f28305k0 = i12;
                if (i12 >= 20) {
                    this.f28305k0 = 0;
                }
                if (f28289u0 == null) {
                    f28289u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f2647b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.n5.d);
                gVar.d = hw0Var2;
                f28289u0.postRunnable(gVar);
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
        boolean[] zArr = this.f28311q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f28293b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f28293b instanceof org.telegram.ui.tn) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f28293b;
        if (drawable instanceof wc0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.tn) {
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
        return getMeasuredHeight() + this.f28299f;
    }

    public int getKeyboardHeight() {
        return this.f28299f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.h6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.h6.f21076i0;
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
            this.f28302h0 = true;
        }
        Drawable drawable = this.f28293b;
        if (drawable instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable).f(this.L);
        }
        Drawable drawable2 = this.f28293b;
        if (drawable2 instanceof wc0) {
            ((wc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof wc0) {
            ((wc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f28292a0.setShader(null);
        this.f28294b0.setShader(null);
        this.f28296c0.setShader(null);
        ValueAnimator valueAnimator = this.f28301g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        hw0 hw0Var = this.Q;
        if (hw0Var != null) {
            hw0Var.f27013c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((hw0) arrayList.get(i10)).f27013c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f28293b;
        if (drawable instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f28293b;
        if (drawable3 instanceof wc0) {
            ((wc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof wc0) {
            ((wc0) drawable4).l();
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
            ai.ic icVar = this.L;
            if (icVar != null) {
                icVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            ai.ic icVar = this.L;
            if (icVar != null) {
                icVar.invalidate();
            }
        }
    }

    public void setDelegate(kw0 kw0Var) {
        this.f28307n = kw0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            ai.ic icVar = this.L;
            if (icVar != null) {
                icVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f28314s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            ai.ic icVar = this.L;
            if (icVar != null) {
                icVar.invalidate();
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
