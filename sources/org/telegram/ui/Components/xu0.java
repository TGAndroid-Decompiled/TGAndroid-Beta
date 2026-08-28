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
public class xu0 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public static DispatchQueue f34769q0;
    public static boolean f34770r0;
    public int A;
    public boolean B;
    public final org.telegram.ui.ActionBar.b5 C;
    public org.telegram.ui.ActionBar.q1 D;
    public int E;
    public boolean F;
    public iv0 G;
    public fh.l2 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public tu0 M;
    public tu0 N;
    public final ArrayList O;
    public final ArrayList P;
    public final Matrix Q;
    public final Matrix R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final Paint V;
    public Paint W;
    public final Rect f34771a;
    public Paint f34772a0;
    public Drawable f34773b;
    public float f34774b0;
    public boolean f34775c;
    public ValueAnimator f34776c0;
    public Drawable d;
    public boolean f34777d0;
    public boolean f34778e;
    public int f34779e0;
    public int f34780f;
    public int f34781f0;
    public int f34782g0;
    public int h;
    public float f34783h0;
    public final androidx.activity.g f34784i0;
    public float f34785j0;
    public float f34786k0;
    public RenderNode[] f34787l0;
    public final boolean[] m0;
    public wu0 f34788n;
    public final boolean[] f34789n0;
    public final ArrayList f34790o0;
    public final ArrayList f34791p0;
    public final ArrayList f34792r;
    public boolean f34793s;
    public q71 v;
    public float f34794w;
    public float f34795x;
    public float f34796y;

    public xu0(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f34771a = new Rect();
        this.f34792r = new ArrayList();
        this.f34793s = true;
        this.f34796y = 1.0f;
        this.B = true;
        this.O = new ArrayList(10);
        this.P = new ArrayList();
        this.Q = new Matrix();
        this.R = new Matrix();
        this.S = new Paint();
        this.T = new Paint();
        this.U = new Paint();
        this.V = new Paint();
        this.f34783h0 = 1.0f;
        this.f34784i0 = new androidx.activity.g(this);
        this.m0 = new boolean[2];
        this.f34789n0 = new boolean[2];
        this.f34790o0 = new ArrayList();
        this.f34791p0 = new ArrayList();
        setWillNotDraw(false);
        this.C = b5Var;
        this.D = null;
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void H(xu0 xu0Var, Canvas canvas) {
        if (xu0Var.H != null && org.telegram.ui.ActionBar.f6.G1 && LiteMode.isEnabled(32)) {
            if (xu0Var.G == null) {
                iv0 iv0Var = new iv0(1);
                xu0Var.G = iv0Var;
                iv0Var.f29534g = -1;
                iv0Var.c();
            }
            xu0Var.G.b(canvas, xu0Var.H);
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
        if (!this.f34778e && !this.f34775c) {
            q71 q71Var = this.v;
            if (q71Var != null) {
                q71Var.c(false);
                this.v = null;
                this.f34796y = 1.0f;
                this.f34794w = 0.0f;
                this.f34795x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            q71 q71Var2 = new q71(getContext());
            this.v = q71Var2;
            q71Var2.f31858n = new wu(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                q71 q71Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                q71Var3.getClass();
                this.f34796y = q71.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.B) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i9;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i9 = org.telegram.ui.ActionBar.f6.f23360xf;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23377yf;
        }
        K(canvas, f10, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.f6.v0(i9, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f34777d0 = true;
            if (this.K && !this.L) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f34789n0;
        int i9 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.P;
            if (i9 < arrayList.size()) {
                ((View) arrayList.get(i9)).invalidate();
                i9++;
            } else {
                return;
            }
        }
    }

    public boolean O() {
        return this instanceof org.telegram.ui.im;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.db);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.db);
    }

    public int R() {
        int i9;
        View rootView = getRootView();
        Rect rect = this.f34771a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        int max = Math.max(0, ((height - i9) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
        this.f34780f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f34796y = q71.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f34788n == null && this.f34792r.isEmpty()) {
            return;
        }
        this.f34780f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new a50(6, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f34773b == drawable) {
            return;
        }
        if (this.H == null) {
            fh.l2 l2Var = new fh.l2(this, getContext(), 23);
            this.H = l2Var;
            addView(l2Var, 0, g7.e6.c(-1.0f, -1));
        }
        if (drawable instanceof jb0) {
            ((jb0) drawable).r(this.H);
        }
        if (this.I) {
            Drawable drawable2 = this.f34773b;
            if (drawable2 instanceof org.telegram.ui.tn) {
                ((org.telegram.ui.tn) drawable2).g(this.H);
            }
        }
        this.f34773b = drawable;
        if (this.I && (drawable instanceof org.telegram.ui.tn)) {
            ((org.telegram.ui.tn) drawable).f(this.H);
        }
        if (this.I) {
            Drawable drawable3 = this.f34773b;
            if (drawable3 instanceof jb0) {
                ((jb0) drawable3).l();
            }
        }
        if (this.I) {
            Drawable drawable4 = this.f34773b;
            if (drawable4 instanceof jb0) {
                ((jb0) drawable4).k();
            }
        }
        U(this.f34773b);
        I();
        this.H.invalidate();
    }

    public final void W() {
        tu0 tu0Var;
        tu0 tu0Var2;
        if (this.K && !this.L && this.f34777d0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23377yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f34777d0 = false;
                this.L = true;
                float f10 = dp;
                int i9 = ((int) (f10 / 12.0f)) + 34;
                float f11 = measuredWidth;
                int i10 = (int) (f11 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.O;
                if (arrayList.size() > 0) {
                    tu0Var = (tu0) e2.c.k(1, arrayList);
                } else {
                    tu0Var = null;
                }
                if (tu0Var == null) {
                    ?? obj = new Object();
                    obj.f32822c = Bitmap.createBitmap(i10, i9, Bitmap.Config.ARGB_8888);
                    obj.f32821b = new Canvas(obj.f32822c);
                    tu0Var2 = obj;
                } else {
                    tu0Var.f32822c.eraseColor(0);
                    tu0Var2 = tu0Var;
                }
                float width = tu0Var2.f32822c.getWidth() / f11;
                float height = (tu0Var2.f32822c.getHeight() - 34) / f10;
                int save = tu0Var2.f32821b.save();
                tu0Var2.f32820a = getScrollOffset() % 24;
                float f12 = 10.0f * height;
                tu0Var2.f32821b.clipRect(1.0f, f12, tu0Var2.f32822c.getWidth(), tu0Var2.f32822c.getHeight() - 1);
                tu0Var2.f32821b.scale(width, height);
                tu0Var2.f32821b.translate(0.0f, f12 + tu0Var2.f32820a);
                tu0Var2.d = 1.0f / width;
                tu0Var2.f32823e = 1.0f / height;
                L(tu0Var2.f32821b, null);
                try {
                    tu0Var2.f32821b.restoreToCount(save);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                System.currentTimeMillis();
                int i11 = this.f34782g0 + 1;
                this.f34782g0 = i11;
                if (i11 >= 20) {
                    this.f34782g0 = 0;
                }
                if (f34769q0 == null) {
                    f34769q0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.f34784i0;
                gVar.f366b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.i5.d);
                gVar.d = tu0Var2;
                f34769q0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof fh.o6);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.m0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.K) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f34773b;
    }

    public int getBackgroundSizeY() {
        int i9;
        if (this.f34773b instanceof org.telegram.ui.tn) {
            i9 = this.A;
        } else {
            i9 = 0;
        }
        return getMeasuredHeight() - i9;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f34773b;
        if (drawable instanceof jb0) {
            return this.A;
        }
        if (drawable instanceof org.telegram.ui.tn) {
            return this.A;
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
        return getMeasuredHeight() + this.f34780f;
    }

    public int getKeyboardHeight() {
        return this.f34780f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.f6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.f6.f23086i0;
    }

    public org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        if (this.J && !this.K) {
            this.K = true;
            this.f34777d0 = true;
        }
        Drawable drawable = this.f34773b;
        if (drawable instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable).f(this.H);
        }
        Drawable drawable2 = this.f34773b;
        if (drawable2 instanceof jb0) {
            ((jb0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable3).f(this.H);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof jb0) {
            ((jb0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.I = false;
        this.S.setShader(null);
        this.T.setShader(null);
        this.U.setShader(null);
        this.V.setShader(null);
        ValueAnimator valueAnimator = this.f34776c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        tu0 tu0Var = this.M;
        if (tu0Var != null) {
            tu0Var.f32822c.recycle();
            this.M = null;
        }
        int i9 = 0;
        while (true) {
            arrayList = this.O;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i9) != null) {
                ((tu0) arrayList.get(i9)).f32822c.recycle();
            }
            i9++;
        }
        arrayList.clear();
        this.K = false;
        Drawable drawable = this.f34773b;
        if (drawable instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable).g(this.H);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable2).g(this.H);
        }
        Drawable drawable3 = this.f34773b;
        if (drawable3 instanceof jb0) {
            ((jb0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof jb0) {
            ((jb0) drawable4).l();
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        S();
    }

    public void setBackgroundTranslation(int i9) {
        if (i9 != this.A) {
            this.A = i9;
            fh.l2 l2Var = this.H;
            if (l2Var != null) {
                l2Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i9) {
        if (i9 != this.h) {
            this.h = i9;
            fh.l2 l2Var = this.H;
            if (l2Var != null) {
                l2Var.invalidate();
            }
        }
    }

    public void setDelegate(wu0 wu0Var) {
        this.f34788n = wu0Var;
    }

    public void setEmojiKeyboardHeight(int i9) {
        if (this.E != i9) {
            this.E = i9;
            fh.l2 l2Var = this.H;
            if (l2Var != null) {
                l2Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f34793s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            fh.l2 l2Var = this.H;
            if (l2Var != null) {
                l2Var.invalidate();
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
