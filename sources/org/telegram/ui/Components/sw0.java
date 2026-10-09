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
public class sw0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static DispatchQueue f30914u0;
    public static boolean f30915v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.d5 G;
    public org.telegram.ui.ActionBar.p1 H;
    public int I;
    public boolean J;
    public dx0 K;
    public ci.bb L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public ow0 Q;
    public ow0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f30916a;
    public final Paint f30917a0;
    public Drawable f30918b;
    public final Paint f30919b0;
    public boolean f30920c;
    public final Paint f30921c0;
    public Drawable d;
    public Paint f30922d0;
    public boolean f30923e;
    public Paint f30924e0;
    public int f30925f;
    public float f30926f0;
    public ValueAnimator f30927g0;
    public int h;
    public boolean f30928h0;
    public int f30929i0;
    public int f30930j0;
    public int f30931k0;
    public float f30932l0;
    public final androidx.activity.g m0;
    public rw0 f30933n;
    public float f30934n0;
    public float f30935o0;
    public RenderNode[] f30936p0;
    public final boolean[] f30937q0;
    public final ArrayList f30938r;
    public final boolean[] f30939r0;
    public boolean f30940s;
    public final ArrayList f30941s0;
    public final ArrayList f30942t0;
    public r91 v;
    public float f30943w;
    public float f30944x;
    public float f30945y;

    public sw0(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f30916a = new Rect();
        this.f30938r = new ArrayList();
        this.f30940s = true;
        this.f30945y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f30917a0 = new Paint();
        this.f30919b0 = new Paint();
        this.f30921c0 = new Paint();
        this.f30932l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f30937q0 = new boolean[2];
        this.f30939r0 = new boolean[2];
        this.f30941s0 = new ArrayList();
        this.f30942t0 = new ArrayList();
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

    public static void G(sw0 sw0Var, Canvas canvas) {
        if (sw0Var.L != null && org.telegram.ui.ActionBar.i6.G1 && LiteMode.isEnabled(32)) {
            if (sw0Var.K == null) {
                dx0 dx0Var = new dx0(1);
                sw0Var.K = dx0Var;
                dx0Var.f25837g = -1;
                dx0Var.c();
            }
            sw0Var.K.b(canvas, sw0Var.L);
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
        if (!this.f30923e && !this.f30920c) {
            r91 r91Var = this.v;
            if (r91Var != null) {
                r91Var.c(false);
                this.v = null;
                this.f30945y = 1.0f;
                this.f30943w = 0.0f;
                this.f30944x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            r91 r91Var2 = new r91(getContext());
            this.v = r91Var2;
            r91Var2.f30403n = new bw(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                r91 r91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                r91Var3.getClass();
                this.f30945y = r91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.i6.xf;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21189yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.i6.w0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f30928h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f30939r0;
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
        return !(this instanceof org.telegram.ui.jb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.jb);
    }

    public int R() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f30916a;
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
        this.f30925f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f30945y = r91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f30933n == null && this.f30938r.isEmpty()) {
            return;
        }
        this.f30925f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new ds0(3, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f30918b == drawable) {
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
            Drawable drawable2 = this.f30918b;
            if (drawable2 instanceof org.telegram.ui.co) {
                ((org.telegram.ui.co) drawable2).g(this.L);
            }
        }
        this.f30918b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.co)) {
            ((org.telegram.ui.co) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f30918b;
            if (drawable3 instanceof cd0) {
                ((cd0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f30918b;
            if (drawable4 instanceof cd0) {
                ((cd0) drawable4).k();
            }
        }
        U(this.f30918b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        ow0 ow0Var;
        ow0 ow0Var2;
        if (this.O && !this.P && this.f30928h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21189yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f30928h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    ow0Var = (ow0) hg.c.x(1, arrayList);
                } else {
                    ow0Var = null;
                }
                if (ow0Var == null) {
                    ?? obj = new Object();
                    obj.f29596c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f29595b = new Canvas(obj.f29596c);
                    ow0Var2 = obj;
                } else {
                    ow0Var.f29596c.eraseColor(0);
                    ow0Var2 = ow0Var;
                }
                float width = ow0Var2.f29596c.getWidth() / f10;
                float height = (ow0Var2.f29596c.getHeight() - 34) / f7;
                int save = ow0Var2.f29595b.save();
                ow0Var2.f29594a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                ow0Var2.f29595b.clipRect(1.0f, f11, ow0Var2.f29596c.getWidth(), ow0Var2.f29596c.getHeight() - 1);
                ow0Var2.f29595b.scale(width, height);
                ow0Var2.f29595b.translate(0.0f, f11 + ow0Var2.f29594a);
                ow0Var2.d = 1.0f / width;
                ow0Var2.f29597e = 1.0f / height;
                L(ow0Var2.f29595b, null);
                try {
                    ow0Var2.f29595b.restoreToCount(save);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                System.currentTimeMillis();
                int i12 = this.f30931k0 + 1;
                this.f30931k0 = i12;
                if (i12 >= 20) {
                    this.f30931k0 = 0;
                }
                if (f30914u0 == null) {
                    f30914u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f2127b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.i5.d);
                gVar.d = ow0Var2;
                f30914u0.postRunnable(gVar);
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
        boolean[] zArr = this.f30937q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f30918b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f30918b instanceof org.telegram.ui.co) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f30918b;
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
        return getMeasuredHeight() + this.f30925f;
    }

    public int getKeyboardHeight() {
        return this.f30925f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.i6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.i6.f20882i0;
    }

    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
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
            this.f30928h0 = true;
        }
        Drawable drawable = this.f30918b;
        if (drawable instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable).f(this.L);
        }
        Drawable drawable2 = this.f30918b;
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
        this.f30917a0.setShader(null);
        this.f30919b0.setShader(null);
        this.f30921c0.setShader(null);
        ValueAnimator valueAnimator = this.f30927g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ow0 ow0Var = this.Q;
        if (ow0Var != null) {
            ow0Var.f29596c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((ow0) arrayList.get(i10)).f29596c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f30918b;
        if (drawable instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f30918b;
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

    public void setDelegate(rw0 rw0Var) {
        this.f30933n = rw0Var;
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
        this.f30940s = z10;
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
