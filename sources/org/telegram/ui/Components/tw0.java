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
public class tw0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public static DispatchQueue f31359u0;
    public static boolean f31360v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.b5 G;
    public org.telegram.ui.ActionBar.o1 H;
    public int I;
    public boolean J;
    public ex0 K;
    public ci.bb L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public pw0 Q;
    public pw0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f31361a;
    public final Paint f31362a0;
    public Drawable f31363b;
    public final Paint f31364b0;
    public boolean f31365c;
    public final Paint f31366c0;
    public Drawable d;
    public Paint f31367d0;
    public boolean f31368e;
    public Paint f31369e0;
    public int f31370f;
    public float f31371f0;
    public ValueAnimator f31372g0;
    public int h;
    public boolean f31373h0;
    public int f31374i0;
    public int f31375j0;
    public int f31376k0;
    public float f31377l0;
    public final androidx.activity.g m0;
    public sw0 f31378n;
    public float f31379n0;
    public float f31380o0;
    public RenderNode[] f31381p0;
    public final boolean[] f31382q0;
    public final ArrayList f31383r;
    public final boolean[] f31384r0;
    public boolean f31385s;
    public final ArrayList f31386s0;
    public final ArrayList f31387t0;
    public s91 v;
    public float f31388w;
    public float f31389x;
    public float f31390y;

    public tw0(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f31361a = new Rect();
        this.f31383r = new ArrayList();
        this.f31385s = true;
        this.f31390y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f31362a0 = new Paint();
        this.f31364b0 = new Paint();
        this.f31366c0 = new Paint();
        this.f31377l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f31382q0 = new boolean[2];
        this.f31384r0 = new boolean[2];
        this.f31386s0 = new ArrayList();
        this.f31387t0 = new ArrayList();
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

    public static void G(tw0 tw0Var, Canvas canvas) {
        if (tw0Var.L != null && org.telegram.ui.ActionBar.h6.G1 && LiteMode.isEnabled(32)) {
            if (tw0Var.K == null) {
                ex0 ex0Var = new ex0(1);
                tw0Var.K = ex0Var;
                ex0Var.f26233g = -1;
                ex0Var.c();
            }
            tw0Var.K.b(canvas, tw0Var.L);
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
        if (!this.f31368e && !this.f31365c) {
            s91 s91Var = this.v;
            if (s91Var != null) {
                s91Var.c(false);
                this.v = null;
                this.f31390y = 1.0f;
                this.f31388w = 0.0f;
                this.f31389x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            s91 s91Var2 = new s91(getContext());
            this.v = s91Var2;
            s91Var2.f30807n = new cw(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                s91 s91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                s91Var3.getClass();
                this.f31390y = s91.a(measuredWidth, measuredHeight);
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
            i10 = org.telegram.ui.ActionBar.h6.f21215yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.h6.w0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f31373h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f31384r0;
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
        Rect rect = this.f31361a;
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
        this.f31370f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f31390y = s91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f31378n == null && this.f31383r.isEmpty()) {
            return;
        }
        this.f31370f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new es0(3, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f31363b == drawable) {
            return;
        }
        if (this.L == null) {
            ci.bb bbVar = new ci.bb(this, getContext(), 24);
            this.L = bbVar;
            addView(bbVar, 0, w7.x5.d(-1.0f, -1));
        }
        if (drawable instanceof cd0) {
            ((cd0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f31363b;
            if (drawable2 instanceof org.telegram.ui.co) {
                ((org.telegram.ui.co) drawable2).g(this.L);
            }
        }
        this.f31363b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.co)) {
            ((org.telegram.ui.co) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f31363b;
            if (drawable3 instanceof cd0) {
                ((cd0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f31363b;
            if (drawable4 instanceof cd0) {
                ((cd0) drawable4).k();
            }
        }
        U(this.f31363b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        pw0 pw0Var;
        pw0 pw0Var2;
        if (this.O && !this.P && this.f31373h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21215yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f31373h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    pw0Var = (pw0) hg.c.x(1, arrayList);
                } else {
                    pw0Var = null;
                }
                if (pw0Var == null) {
                    ?? obj = new Object();
                    obj.f29986c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f29985b = new Canvas(obj.f29986c);
                    pw0Var2 = obj;
                } else {
                    pw0Var.f29986c.eraseColor(0);
                    pw0Var2 = pw0Var;
                }
                float width = pw0Var2.f29986c.getWidth() / f10;
                float height = (pw0Var2.f29986c.getHeight() - 34) / f7;
                int save = pw0Var2.f29985b.save();
                pw0Var2.f29984a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                pw0Var2.f29985b.clipRect(1.0f, f11, pw0Var2.f29986c.getWidth(), pw0Var2.f29986c.getHeight() - 1);
                pw0Var2.f29985b.scale(width, height);
                pw0Var2.f29985b.translate(0.0f, f11 + pw0Var2.f29984a);
                pw0Var2.d = 1.0f / width;
                pw0Var2.f29987e = 1.0f / height;
                L(pw0Var2.f29985b, null);
                try {
                    pw0Var2.f29985b.restoreToCount(save);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                System.currentTimeMillis();
                int i12 = this.f31376k0 + 1;
                this.f31376k0 = i12;
                if (i12 >= 20) {
                    this.f31376k0 = 0;
                }
                if (f31359u0 == null) {
                    f31359u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f2127b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.h5.d);
                gVar.d = pw0Var2;
                f31359u0.postRunnable(gVar);
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
        boolean[] zArr = this.f31382q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f31363b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f31363b instanceof org.telegram.ui.co) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f31363b;
        if (drawable instanceof cd0) {
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
        return getMeasuredHeight() + this.f31370f;
    }

    public int getKeyboardHeight() {
        return this.f31370f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.h6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.h6.f20907i0;
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
            this.f31373h0 = true;
        }
        Drawable drawable = this.f31363b;
        if (drawable instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable).f(this.L);
        }
        Drawable drawable2 = this.f31363b;
        if (drawable2 instanceof cd0) {
            ((cd0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable3).f(this.L);
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
        this.f31362a0.setShader(null);
        this.f31364b0.setShader(null);
        this.f31366c0.setShader(null);
        ValueAnimator valueAnimator = this.f31372g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        pw0 pw0Var = this.Q;
        if (pw0Var != null) {
            pw0Var.f29986c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((pw0) arrayList.get(i10)).f29986c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f31363b;
        if (drawable instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f31363b;
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

    public void setDelegate(sw0 sw0Var) {
        this.f31378n = sw0Var;
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
        this.f31385s = z10;
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
