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
public class aw0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static DispatchQueue f21620u0;
    public static boolean f21621v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.f5 G;
    public org.telegram.ui.ActionBar.r1 H;
    public int I;
    public boolean J;
    public lw0 K;
    public bi.nc L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public wv0 Q;
    public wv0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f21622a;
    public final Paint f21623a0;
    public Drawable f21624b;
    public final Paint f21625b0;
    public boolean f21626c;
    public final Paint f21627c0;
    public Drawable d;
    public Paint f21628d0;
    public boolean e;
    public Paint f21629e0;
    public int f21630f;
    public float f21631f0;
    public ValueAnimator f21632g0;
    public int h;
    public boolean f21633h0;
    public int f21634i0;
    public int f21635j0;
    public int f21636k0;
    public float f21637l0;
    public final androidx.activity.g m0;
    public zv0 f21638n;
    public float f21639n0;
    public float f21640o0;
    public RenderNode[] f21641p0;
    public final boolean[] f21642q0;
    public final ArrayList f21643r;
    public final boolean[] f21644r0;
    public boolean f21645s;
    public final ArrayList f21646s0;
    public final ArrayList f21647t0;
    public y81 v;
    public float f21648w;
    public float f21649x;
    public float f21650y;

    public aw0(Context context, org.telegram.ui.ActionBar.f5 f5Var) {
        super(context);
        this.f21622a = new Rect();
        this.f21643r = new ArrayList();
        this.f21645s = true;
        this.f21650y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f21623a0 = new Paint();
        this.f21625b0 = new Paint();
        this.f21627c0 = new Paint();
        this.f21637l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f21642q0 = new boolean[2];
        this.f21644r0 = new boolean[2];
        this.f21646s0 = new ArrayList();
        this.f21647t0 = new ArrayList();
        setWillNotDraw(false);
        this.G = f5Var;
        this.H = null;
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void G(aw0 aw0Var, Canvas canvas) {
        if (aw0Var.L != null && org.telegram.ui.ActionBar.j6.G1 && LiteMode.isEnabled(32)) {
            if (aw0Var.K == null) {
                lw0 lw0Var = new lw0(1);
                aw0Var.K = lw0Var;
                lw0Var.f25120g = -1;
                lw0Var.c();
            }
            aw0Var.K.b(canvas, aw0Var.L);
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
        if (!this.e && !this.f21626c) {
            y81 y81Var = this.v;
            if (y81Var != null) {
                y81Var.c(false);
                this.v = null;
                this.f21650y = 1.0f;
                this.f21648w = 0.0f;
                this.f21649x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            y81 y81Var2 = new y81(getContext());
            this.v = y81Var2;
            y81Var2.f29277n = new pv(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                y81 y81Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                y81Var3.getClass();
                this.f21650y = y81.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.j6.f18297xf;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18315yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.j6.v0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f21633h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f21644r0;
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
        return this instanceof org.telegram.ui.vm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.kb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.kb);
    }

    public int R() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f21622a;
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
        this.f21630f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f21650y = y81.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f21638n == null && this.f21643r.isEmpty()) {
            return;
        }
        this.f21630f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new bs0(1, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f21624b == drawable) {
            return;
        }
        if (this.L == null) {
            bi.nc ncVar = new bi.nc(this, getContext(), 24);
            this.L = ncVar;
            addView(ncVar, 0, w7.a6.c(-1.0f, -1));
        }
        if (drawable instanceof lc0) {
            ((lc0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f21624b;
            if (drawable2 instanceof org.telegram.ui.ho) {
                ((org.telegram.ui.ho) drawable2).g(this.L);
            }
        }
        this.f21624b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.ho)) {
            ((org.telegram.ui.ho) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f21624b;
            if (drawable3 instanceof lc0) {
                ((lc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f21624b;
            if (drawable4 instanceof lc0) {
                ((lc0) drawable4).k();
            }
        }
        U(this.f21624b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        wv0 wv0Var;
        wv0 wv0Var2;
        if (this.O && !this.P && this.f21633h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18315yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f21633h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    wv0Var = (wv0) hc.b.z(1, arrayList);
                } else {
                    wv0Var = null;
                }
                if (wv0Var == null) {
                    ?? obj = new Object();
                    obj.f28852c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f28851b = new Canvas(obj.f28852c);
                    wv0Var2 = obj;
                } else {
                    wv0Var.f28852c.eraseColor(0);
                    wv0Var2 = wv0Var;
                }
                float width = wv0Var2.f28852c.getWidth() / f10;
                float height = (wv0Var2.f28852c.getHeight() - 34) / f7;
                int save = wv0Var2.f28851b.save();
                wv0Var2.f28850a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                wv0Var2.f28851b.clipRect(1.0f, f11, wv0Var2.f28852c.getWidth(), wv0Var2.f28852c.getHeight() - 1);
                wv0Var2.f28851b.scale(width, height);
                wv0Var2.f28851b.translate(0.0f, f11 + wv0Var2.f28850a);
                wv0Var2.d = 1.0f / width;
                wv0Var2.e = 1.0f / height;
                L(wv0Var2.f28851b, null);
                try {
                    wv0Var2.f28851b.restoreToCount(save);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                System.currentTimeMillis();
                int i12 = this.f21636k0 + 1;
                this.f21636k0 = i12;
                if (i12 >= 20) {
                    this.f21636k0 = 0;
                }
                if (f21620u0 == null) {
                    f21620u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f570b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.i5.d);
                gVar.d = wv0Var2;
                f21620u0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof wh.s4);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f21642q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f21624b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f21624b instanceof org.telegram.ui.ho) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f21624b;
        if (drawable instanceof lc0) {
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
        return getMeasuredHeight() + this.f21630f;
    }

    public int getKeyboardHeight() {
        return this.f21630f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.j6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.j6.f18011i0;
    }

    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
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
            this.f21633h0 = true;
        }
        Drawable drawable = this.f21624b;
        if (drawable instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable).f(this.L);
        }
        Drawable drawable2 = this.f21624b;
        if (drawable2 instanceof lc0) {
            ((lc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof lc0) {
            ((lc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f21623a0.setShader(null);
        this.f21625b0.setShader(null);
        this.f21627c0.setShader(null);
        ValueAnimator valueAnimator = this.f21632g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        wv0 wv0Var = this.Q;
        if (wv0Var != null) {
            wv0Var.f28852c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((wv0) arrayList.get(i10)).f28852c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f21624b;
        if (drawable instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f21624b;
        if (drawable3 instanceof lc0) {
            ((lc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof lc0) {
            ((lc0) drawable4).l();
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
            bi.nc ncVar = this.L;
            if (ncVar != null) {
                ncVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            bi.nc ncVar = this.L;
            if (ncVar != null) {
                ncVar.invalidate();
            }
        }
    }

    public void setDelegate(zv0 zv0Var) {
        this.f21638n = zv0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            bi.nc ncVar = this.L;
            if (ncVar != null) {
                ncVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f21645s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            bi.nc ncVar = this.L;
            if (ncVar != null) {
                ncVar.invalidate();
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
