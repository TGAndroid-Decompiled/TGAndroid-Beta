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
public class uw0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public static DispatchQueue f31575u0;
    public static boolean f31576v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.b5 G;
    public org.telegram.ui.ActionBar.o1 H;
    public int I;
    public boolean J;
    public fx0 K;
    public ci.bb L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public qw0 Q;
    public qw0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f31577a;
    public final Paint f31578a0;
    public Drawable f31579b;
    public final Paint f31580b0;
    public boolean f31581c;
    public final Paint f31582c0;
    public Drawable d;
    public Paint f31583d0;
    public boolean f31584e;
    public Paint f31585e0;
    public int f31586f;
    public float f31587f0;
    public ValueAnimator f31588g0;
    public int h;
    public boolean f31589h0;
    public int f31590i0;
    public int f31591j0;
    public int f31592k0;
    public float f31593l0;
    public final androidx.activity.g m0;
    public tw0 f31594n;
    public float f31595n0;
    public float f31596o0;
    public RenderNode[] f31597p0;
    public final boolean[] f31598q0;
    public final ArrayList f31599r;
    public final boolean[] f31600r0;
    public boolean f31601s;
    public final ArrayList f31602s0;
    public final ArrayList f31603t0;
    public t91 v;
    public float f31604w;
    public float f31605x;
    public float f31606y;

    public uw0(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f31577a = new Rect();
        this.f31599r = new ArrayList();
        this.f31601s = true;
        this.f31606y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f31578a0 = new Paint();
        this.f31580b0 = new Paint();
        this.f31582c0 = new Paint();
        this.f31593l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f31598q0 = new boolean[2];
        this.f31600r0 = new boolean[2];
        this.f31602s0 = new ArrayList();
        this.f31603t0 = new ArrayList();
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

    public static void G(uw0 uw0Var, Canvas canvas) {
        if (uw0Var.L != null && org.telegram.ui.ActionBar.h6.G1 && LiteMode.isEnabled(32)) {
            if (uw0Var.K == null) {
                fx0 fx0Var = new fx0(1);
                uw0Var.K = fx0Var;
                fx0Var.f26506g = -1;
                fx0Var.c();
            }
            uw0Var.K.b(canvas, uw0Var.L);
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
        if (!this.f31584e && !this.f31581c) {
            t91 t91Var = this.v;
            if (t91Var != null) {
                t91Var.c(false);
                this.v = null;
                this.f31606y = 1.0f;
                this.f31604w = 0.0f;
                this.f31605x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            t91 t91Var2 = new t91(getContext());
            this.v = t91Var2;
            t91Var2.f31066n = new cw(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                t91 t91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                t91Var3.getClass();
                this.f31606y = t91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.h6.xf;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21179yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.h6.w0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f31589h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f31600r0;
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
        return this instanceof org.telegram.ui.sm;
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
        Rect rect = this.f31577a;
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
        this.f31586f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f31606y = t91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f31594n == null && this.f31599r.isEmpty()) {
            return;
        }
        this.f31586f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new fs0(3, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f31579b == drawable) {
            return;
        }
        if (this.L == null) {
            ci.bb bbVar = new ci.bb(this, getContext(), 24);
            this.L = bbVar;
            addView(bbVar, 0, w7.x5.d(-1.0f, -1));
        }
        if (drawable instanceof dd0) {
            ((dd0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f31579b;
            if (drawable2 instanceof org.telegram.ui.co) {
                ((org.telegram.ui.co) drawable2).g(this.L);
            }
        }
        this.f31579b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.co)) {
            ((org.telegram.ui.co) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f31579b;
            if (drawable3 instanceof dd0) {
                ((dd0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f31579b;
            if (drawable4 instanceof dd0) {
                ((dd0) drawable4).k();
            }
        }
        U(this.f31579b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        qw0 qw0Var;
        qw0 qw0Var2;
        if (this.O && !this.P && this.f31589h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21179yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f31589h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    qw0Var = (qw0) hg.c.x(1, arrayList);
                } else {
                    qw0Var = null;
                }
                if (qw0Var == null) {
                    ?? obj = new Object();
                    obj.f30261c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f30260b = new Canvas(obj.f30261c);
                    qw0Var2 = obj;
                } else {
                    qw0Var.f30261c.eraseColor(0);
                    qw0Var2 = qw0Var;
                }
                float width = qw0Var2.f30261c.getWidth() / f10;
                float height = (qw0Var2.f30261c.getHeight() - 34) / f7;
                int save = qw0Var2.f30260b.save();
                qw0Var2.f30259a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                qw0Var2.f30260b.clipRect(1.0f, f11, qw0Var2.f30261c.getWidth(), qw0Var2.f30261c.getHeight() - 1);
                qw0Var2.f30260b.scale(width, height);
                qw0Var2.f30260b.translate(0.0f, f11 + qw0Var2.f30259a);
                qw0Var2.d = 1.0f / width;
                qw0Var2.f30262e = 1.0f / height;
                L(qw0Var2.f30260b, null);
                try {
                    qw0Var2.f30260b.restoreToCount(save);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                System.currentTimeMillis();
                int i12 = this.f31592k0 + 1;
                this.f31592k0 = i12;
                if (i12 >= 20) {
                    this.f31592k0 = 0;
                }
                if (f31575u0 == null) {
                    f31575u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f2127b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.h5.d);
                gVar.d = qw0Var2;
                f31575u0.postRunnable(gVar);
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
        boolean[] zArr = this.f31598q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f31579b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f31579b instanceof org.telegram.ui.co) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f31579b;
        if (drawable instanceof dd0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.co) {
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
        return getMeasuredHeight() + this.f31586f;
    }

    public int getKeyboardHeight() {
        return this.f31586f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.h6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.h6.f20871i0;
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
            this.f31589h0 = true;
        }
        Drawable drawable = this.f31579b;
        if (drawable instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable).f(this.L);
        }
        Drawable drawable2 = this.f31579b;
        if (drawable2 instanceof dd0) {
            ((dd0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof dd0) {
            ((dd0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f31578a0.setShader(null);
        this.f31580b0.setShader(null);
        this.f31582c0.setShader(null);
        ValueAnimator valueAnimator = this.f31588g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qw0 qw0Var = this.Q;
        if (qw0Var != null) {
            qw0Var.f30261c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((qw0) arrayList.get(i10)).f30261c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f31579b;
        if (drawable instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f31579b;
        if (drawable3 instanceof dd0) {
            ((dd0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof dd0) {
            ((dd0) drawable4).l();
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

    public void setDelegate(tw0 tw0Var) {
        this.f31594n = tw0Var;
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
        this.f31601s = z10;
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
