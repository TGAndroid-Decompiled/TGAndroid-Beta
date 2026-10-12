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
public class yw0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public static DispatchQueue f33182u0;
    public static boolean f33183v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.b5 G;
    public org.telegram.ui.ActionBar.o1 H;
    public int I;
    public boolean J;
    public jx0 K;
    public ci.bb L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public uw0 Q;
    public uw0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f33184a;
    public final Paint f33185a0;
    public Drawable f33186b;
    public final Paint f33187b0;
    public boolean f33188c;
    public final Paint f33189c0;
    public Drawable d;
    public Paint f33190d0;
    public boolean f33191e;
    public Paint f33192e0;
    public int f33193f;
    public float f33194f0;
    public ValueAnimator f33195g0;
    public int h;
    public boolean f33196h0;
    public int f33197i0;
    public int f33198j0;
    public int f33199k0;
    public float f33200l0;
    public final androidx.activity.g m0;
    public xw0 f33201n;
    public float f33202n0;
    public float f33203o0;
    public RenderNode[] f33204p0;
    public final boolean[] f33205q0;
    public final ArrayList f33206r;
    public final boolean[] f33207r0;
    public boolean f33208s;
    public final ArrayList f33209s0;
    public final ArrayList f33210t0;
    public x91 v;
    public float f33211w;
    public float f33212x;
    public float f33213y;

    public yw0(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f33184a = new Rect();
        this.f33206r = new ArrayList();
        this.f33208s = true;
        this.f33213y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f33185a0 = new Paint();
        this.f33187b0 = new Paint();
        this.f33189c0 = new Paint();
        this.f33200l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f33205q0 = new boolean[2];
        this.f33207r0 = new boolean[2];
        this.f33209s0 = new ArrayList();
        this.f33210t0 = new ArrayList();
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

    public static void G(yw0 yw0Var, Canvas canvas) {
        if (yw0Var.L != null && org.telegram.ui.ActionBar.h6.G1 && LiteMode.isEnabled(32)) {
            if (yw0Var.K == null) {
                jx0 jx0Var = new jx0(1);
                yw0Var.K = jx0Var;
                jx0Var.f27663g = -1;
                jx0Var.c();
            }
            yw0Var.K.b(canvas, yw0Var.L);
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
        if (!this.f33191e && !this.f33188c) {
            x91 x91Var = this.v;
            if (x91Var != null) {
                x91Var.c(false);
                this.v = null;
                this.f33213y = 1.0f;
                this.f33211w = 0.0f;
                this.f33212x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            x91 x91Var2 = new x91(getContext());
            this.v = x91Var2;
            x91Var2.f32696n = new ew(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                x91 x91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                x91Var3.getClass();
                this.f33213y = x91.a(measuredWidth, measuredHeight);
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
            i10 = org.telegram.ui.ActionBar.h6.f20953yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.h6.w0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f33196h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f33207r0;
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
        return this instanceof org.telegram.ui.wm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.mb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.mb);
    }

    public int R() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f33184a;
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
        this.f33193f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f33213y = x91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f33201n == null && this.f33206r.isEmpty()) {
            return;
        }
        this.f33193f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new js0(3, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f33186b == drawable) {
            return;
        }
        if (this.L == null) {
            ci.bb bbVar = new ci.bb(this, getContext(), 24);
            this.L = bbVar;
            addView(bbVar, 0, w7.w5.d(-1.0f, -1));
        }
        if (drawable instanceof gd0) {
            ((gd0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f33186b;
            if (drawable2 instanceof org.telegram.ui.ho) {
                ((org.telegram.ui.ho) drawable2).g(this.L);
            }
        }
        this.f33186b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.ho)) {
            ((org.telegram.ui.ho) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f33186b;
            if (drawable3 instanceof gd0) {
                ((gd0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f33186b;
            if (drawable4 instanceof gd0) {
                ((gd0) drawable4).k();
            }
        }
        U(this.f33186b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        uw0 uw0Var;
        uw0 uw0Var2;
        if (this.O && !this.P && this.f33196h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20953yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f33196h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    uw0Var = (uw0) hg.c.A(1, arrayList);
                } else {
                    uw0Var = null;
                }
                if (uw0Var == null) {
                    ?? obj = new Object();
                    obj.f31275c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f31274b = new Canvas(obj.f31275c);
                    uw0Var2 = obj;
                } else {
                    uw0Var.f31275c.eraseColor(0);
                    uw0Var2 = uw0Var;
                }
                float width = uw0Var2.f31275c.getWidth() / f10;
                float height = (uw0Var2.f31275c.getHeight() - 34) / f7;
                int save = uw0Var2.f31274b.save();
                uw0Var2.f31273a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                uw0Var2.f31274b.clipRect(1.0f, f11, uw0Var2.f31275c.getWidth(), uw0Var2.f31275c.getHeight() - 1);
                uw0Var2.f31274b.scale(width, height);
                uw0Var2.f31274b.translate(0.0f, f11 + uw0Var2.f31273a);
                uw0Var2.d = 1.0f / width;
                uw0Var2.f31276e = 1.0f / height;
                L(uw0Var2.f31274b, null);
                try {
                    uw0Var2.f31274b.restoreToCount(save);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                System.currentTimeMillis();
                int i12 = this.f33199k0 + 1;
                this.f33199k0 = i12;
                if (i12 >= 20) {
                    this.f33199k0 = 0;
                }
                if (f33182u0 == null) {
                    f33182u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f2125b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.l5.d);
                gVar.d = uw0Var2;
                f33182u0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof xh.s4);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f33205q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f33186b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f33186b instanceof org.telegram.ui.ho) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f33186b;
        if (drawable instanceof gd0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.ho) {
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
        return getMeasuredHeight() + this.f33193f;
    }

    public int getKeyboardHeight() {
        return this.f33193f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.h6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.h6.f20644i0;
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
            this.f33196h0 = true;
        }
        Drawable drawable = this.f33186b;
        if (drawable instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable).f(this.L);
        }
        Drawable drawable2 = this.f33186b;
        if (drawable2 instanceof gd0) {
            ((gd0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof gd0) {
            ((gd0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f33185a0.setShader(null);
        this.f33187b0.setShader(null);
        this.f33189c0.setShader(null);
        ValueAnimator valueAnimator = this.f33195g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        uw0 uw0Var = this.Q;
        if (uw0Var != null) {
            uw0Var.f31275c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((uw0) arrayList.get(i10)).f31275c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f33186b;
        if (drawable instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f33186b;
        if (drawable3 instanceof gd0) {
            ((gd0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof gd0) {
            ((gd0) drawable4).l();
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

    public void setDelegate(xw0 xw0Var) {
        this.f33201n = xw0Var;
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
        this.f33208s = z10;
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
