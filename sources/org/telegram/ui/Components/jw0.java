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
public class jw0 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public static DispatchQueue f27609u0;
    public static boolean f27610v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.d5 G;
    public org.telegram.ui.ActionBar.o1 H;
    public int I;
    public boolean J;
    public uw0 K;
    public ai.hc L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public fw0 Q;
    public fw0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f27611a;
    public final Paint f27612a0;
    public Drawable f27613b;
    public final Paint f27614b0;
    public boolean f27615c;
    public final Paint f27616c0;
    public Drawable d;
    public Paint f27617d0;
    public boolean e;
    public Paint f27618e0;
    public int f27619f;
    public float f27620f0;
    public ValueAnimator f27621g0;
    public int h;
    public boolean f27622h0;
    public int f27623i0;
    public int f27624j0;
    public int f27625k0;
    public float f27626l0;
    public final androidx.activity.g m0;
    public iw0 f27627n;
    public float f27628n0;
    public float f27629o0;
    public RenderNode[] f27630p0;
    public final boolean[] f27631q0;
    public final ArrayList f27632r;
    public final boolean[] f27633r0;
    public boolean f27634s;
    public final ArrayList f27635s0;
    public final ArrayList f27636t0;
    public f91 v;
    public float f27637w;
    public float f27638x;
    public float f27639y;

    public jw0(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f27611a = new Rect();
        this.f27632r = new ArrayList();
        this.f27634s = true;
        this.f27639y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f27612a0 = new Paint();
        this.f27614b0 = new Paint();
        this.f27616c0 = new Paint();
        this.f27626l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f27631q0 = new boolean[2];
        this.f27633r0 = new boolean[2];
        this.f27635s0 = new ArrayList();
        this.f27636t0 = new ArrayList();
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

    public static void G(jw0 jw0Var, Canvas canvas) {
        if (jw0Var.L != null && org.telegram.ui.ActionBar.h6.G1 && LiteMode.isEnabled(32)) {
            if (jw0Var.K == null) {
                uw0 uw0Var = new uw0(1);
                jw0Var.K = uw0Var;
                uw0Var.f31093g = -1;
                uw0Var.c();
            }
            jw0Var.K.b(canvas, jw0Var.L);
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
        if (!this.e && !this.f27615c) {
            f91 f91Var = this.v;
            if (f91Var != null) {
                f91Var.c(false);
                this.v = null;
                this.f27639y = 1.0f;
                this.f27637w = 0.0f;
                this.f27638x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            f91 f91Var2 = new f91(getContext());
            this.v = f91Var2;
            f91Var2.f26182n = new tv(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                f91 f91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                f91Var3.getClass();
                this.f27639y = f91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.h6.f21365xf;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.h6.w0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f27622h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f27633r0;
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
        return this instanceof org.telegram.ui.lm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.lb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.lb);
    }

    public int R() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f27611a;
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
        this.f27619f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f27639y = f91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f27627n == null && this.f27632r.isEmpty()) {
            return;
        }
        this.f27619f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new b60(6, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f27613b == drawable) {
            return;
        }
        if (this.L == null) {
            ai.hc hcVar = new ai.hc(this, getContext(), 25);
            this.L = hcVar;
            addView(hcVar, 0, w7.z5.d(-1.0f, -1));
        }
        if (drawable instanceof wc0) {
            ((wc0) drawable).q(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f27613b;
            if (drawable2 instanceof org.telegram.ui.vn) {
                ((org.telegram.ui.vn) drawable2).g(this.L);
            }
        }
        this.f27613b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.vn)) {
            ((org.telegram.ui.vn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f27613b;
            if (drawable3 instanceof wc0) {
                ((wc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f27613b;
            if (drawable4 instanceof wc0) {
                ((wc0) drawable4).k();
            }
        }
        U(this.f27613b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        fw0 fw0Var;
        fw0 fw0Var2;
        if (this.O && !this.P && this.f27622h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f27622h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    fw0Var = (fw0) i0.a.z(1, arrayList);
                } else {
                    fw0Var = null;
                }
                if (fw0Var == null) {
                    ?? obj = new Object();
                    obj.f26400c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f26399b = new Canvas(obj.f26400c);
                    fw0Var2 = obj;
                } else {
                    fw0Var.f26400c.eraseColor(0);
                    fw0Var2 = fw0Var;
                }
                float width = fw0Var2.f26400c.getWidth() / f10;
                float height = (fw0Var2.f26400c.getHeight() - 34) / f7;
                int save = fw0Var2.f26399b.save();
                fw0Var2.f26398a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                fw0Var2.f26399b.clipRect(1.0f, f11, fw0Var2.f26400c.getWidth(), fw0Var2.f26400c.getHeight() - 1);
                fw0Var2.f26399b.scale(width, height);
                fw0Var2.f26399b.translate(0.0f, f11 + fw0Var2.f26398a);
                fw0Var2.d = 1.0f / width;
                fw0Var2.e = 1.0f / height;
                L(fw0Var2.f26399b, null);
                try {
                    fw0Var2.f26399b.restoreToCount(save);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                System.currentTimeMillis();
                int i12 = this.f27625k0 + 1;
                this.f27625k0 = i12;
                if (i12 >= 20) {
                    this.f27625k0 = 0;
                }
                if (f27609u0 == null) {
                    f27609u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f2650b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.n5.d);
                gVar.d = fw0Var2;
                f27609u0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof yh.s4);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f27631q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f27613b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f27613b instanceof org.telegram.ui.vn) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f27613b;
        if (drawable instanceof wc0) {
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

    public int[] getColorKeys() {
        return null;
    }

    public int getHeightWithKeyboard() {
        return getMeasuredHeight() + this.f27619f;
    }

    public int getKeyboardHeight() {
        return this.f27619f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.h6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.h6.f21069i0;
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
            this.f27622h0 = true;
        }
        Drawable drawable = this.f27613b;
        if (drawable instanceof org.telegram.ui.vn) {
            ((org.telegram.ui.vn) drawable).f(this.L);
        }
        Drawable drawable2 = this.f27613b;
        if (drawable2 instanceof wc0) {
            ((wc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.vn) {
            ((org.telegram.ui.vn) drawable3).f(this.L);
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
        this.f27612a0.setShader(null);
        this.f27614b0.setShader(null);
        this.f27616c0.setShader(null);
        ValueAnimator valueAnimator = this.f27621g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fw0 fw0Var = this.Q;
        if (fw0Var != null) {
            fw0Var.f26400c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((fw0) arrayList.get(i10)).f26400c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f27613b;
        if (drawable instanceof org.telegram.ui.vn) {
            ((org.telegram.ui.vn) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.vn) {
            ((org.telegram.ui.vn) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f27613b;
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
            ai.hc hcVar = this.L;
            if (hcVar != null) {
                hcVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            ai.hc hcVar = this.L;
            if (hcVar != null) {
                hcVar.invalidate();
            }
        }
    }

    public void setDelegate(iw0 iw0Var) {
        this.f27627n = iw0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            ai.hc hcVar = this.L;
            if (hcVar != null) {
                hcVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f27634s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            ai.hc hcVar = this.L;
            if (hcVar != null) {
                hcVar.invalidate();
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
