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
public class qv0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static DispatchQueue f30485r0;
    public static boolean f30486s0;
    public int B;
    public boolean C;
    public final org.telegram.ui.ActionBar.f5 D;
    public org.telegram.ui.ActionBar.r1 E;
    public int F;
    public boolean G;
    public cw0 H;
    public fg.h0 I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public mv0 N;
    public mv0 O;
    public final ArrayList P;
    public final ArrayList Q;
    public final Matrix R;
    public final Matrix S;
    public final Paint T;
    public final Paint U;
    public final Paint V;
    public final Paint W;
    public final Rect f30487a;
    public Paint f30488a0;
    public Drawable f30489b;
    public Paint f30490b0;
    public boolean f30491c;
    public float f30492c0;
    public Drawable d;
    public ValueAnimator f30493d0;
    public boolean f30494e;
    public boolean f30495e0;
    public int f30496f;
    public int f30497f0;
    public int f30498g0;
    public int h;
    public int f30499h0;
    public float f30500i0;
    public final androidx.activity.g f30501j0;
    public float f30502k0;
    public float f30503l0;
    public RenderNode[] m0;
    public pv0 f30504n;
    public final boolean[] f30505n0;
    public final boolean[] f30506o0;
    public final ArrayList f30507p0;
    public final ArrayList f30508q0;
    public final ArrayList f30509r;
    public boolean f30510s;
    public p81 v;
    public float f30511w;
    public float f30512x;
    public float f30513y;

    public qv0(Context context, org.telegram.ui.ActionBar.f5 f5Var) {
        super(context);
        this.f30487a = new Rect();
        this.f30509r = new ArrayList();
        this.f30510s = true;
        this.f30513y = 1.0f;
        this.C = true;
        this.P = new ArrayList(10);
        this.Q = new ArrayList();
        this.R = new Matrix();
        this.S = new Matrix();
        this.T = new Paint();
        this.U = new Paint();
        this.V = new Paint();
        this.W = new Paint();
        this.f30500i0 = 1.0f;
        this.f30501j0 = new androidx.activity.g(this);
        this.f30505n0 = new boolean[2];
        this.f30506o0 = new boolean[2];
        this.f30507p0 = new ArrayList();
        this.f30508q0 = new ArrayList();
        setWillNotDraw(false);
        this.D = f5Var;
        this.E = null;
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void H(qv0 qv0Var, Canvas canvas) {
        if (qv0Var.I != null && org.telegram.ui.ActionBar.k6.G1 && LiteMode.isEnabled(32)) {
            if (qv0Var.H == null) {
                cw0 cw0Var = new cw0(1);
                qv0Var.H = cw0Var;
                cw0Var.f26097g = -1;
                cw0Var.c();
            }
            qv0Var.H.b(canvas, qv0Var.I);
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
        if (!this.f30494e && !this.f30491c) {
            p81 p81Var = this.v;
            if (p81Var != null) {
                p81Var.c(false);
                this.v = null;
                this.f30513y = 1.0f;
                this.f30511w = 0.0f;
                this.f30512x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            p81 p81Var2 = new p81(getContext());
            this.v = p81Var2;
            p81Var2.f29997n = new hv(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                p81 p81Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                p81Var3.getClass();
                this.f30513y = p81.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.C) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.k6.f22026xf;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f22045yf;
        }
        K(canvas, f10, rect, paint, z4, Color.alpha(org.telegram.ui.ActionBar.k6.v0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qv0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f30495e0 = true;
            if (this.L && !this.M) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f30506o0;
        int i10 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    public boolean O() {
        return this instanceof org.telegram.ui.pm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.gb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.gb);
    }

    public int R() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f30487a;
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
        this.f30496f = max;
        return max;
    }

    public void S() {
        boolean z4;
        if (this.v != null) {
            this.f30513y = p81.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f30504n == null && this.f30509r.isEmpty()) {
            return;
        }
        this.f30496f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z4 = true;
        } else {
            z4 = false;
        }
        post(new kh.f(29, this, z4));
    }

    public final void V(Drawable drawable) {
        if (this.f30489b == drawable) {
            return;
        }
        if (this.I == null) {
            fg.h0 h0Var = new fg.h0(this, getContext(), 19);
            this.I = h0Var;
            addView(h0Var, 0, k7.c6.c(-1.0f, -1));
        }
        if (drawable instanceof fc0) {
            ((fc0) drawable).r(this.I);
        }
        if (this.J) {
            Drawable drawable2 = this.f30489b;
            if (drawable2 instanceof org.telegram.ui.ao) {
                ((org.telegram.ui.ao) drawable2).g(this.I);
            }
        }
        this.f30489b = drawable;
        if (this.J && (drawable instanceof org.telegram.ui.ao)) {
            ((org.telegram.ui.ao) drawable).f(this.I);
        }
        if (this.J) {
            Drawable drawable3 = this.f30489b;
            if (drawable3 instanceof fc0) {
                ((fc0) drawable3).l();
            }
        }
        if (this.J) {
            Drawable drawable4 = this.f30489b;
            if (drawable4 instanceof fc0) {
                ((fc0) drawable4).k();
            }
        }
        U(this.f30489b);
        I();
        this.I.invalidate();
    }

    public final void W() {
        mv0 mv0Var;
        mv0 mv0Var2;
        if (this.L && !this.M && this.f30495e0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22045yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f30495e0 = false;
                this.M = true;
                float f10 = dp;
                int i10 = ((int) (f10 / 12.0f)) + 34;
                float f11 = measuredWidth;
                int i11 = (int) (f11 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.P;
                if (arrayList.size() > 0) {
                    mv0Var = (mv0) e2.c.g(1, arrayList);
                } else {
                    mv0Var = null;
                }
                if (mv0Var == null) {
                    ?? obj = new Object();
                    obj.f29255c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f29254b = new Canvas(obj.f29255c);
                    mv0Var2 = obj;
                } else {
                    mv0Var.f29255c.eraseColor(0);
                    mv0Var2 = mv0Var;
                }
                float width = mv0Var2.f29255c.getWidth() / f11;
                float height = (mv0Var2.f29255c.getHeight() - 34) / f10;
                int save = mv0Var2.f29254b.save();
                mv0Var2.f29253a = getScrollOffset() % 24;
                float f12 = 10.0f * height;
                mv0Var2.f29254b.clipRect(1.0f, f12, mv0Var2.f29255c.getWidth(), mv0Var2.f29255c.getHeight() - 1);
                mv0Var2.f29254b.scale(width, height);
                mv0Var2.f29254b.translate(0.0f, f12 + mv0Var2.f29253a);
                mv0Var2.d = 1.0f / width;
                mv0Var2.f29256e = 1.0f / height;
                L(mv0Var2.f29254b, null);
                try {
                    mv0Var2.f29254b.restoreToCount(save);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                System.currentTimeMillis();
                int i12 = this.f30499h0 + 1;
                this.f30499h0 = i12;
                if (i12 >= 20) {
                    this.f30499h0 = 0;
                }
                if (f30485r0 == null) {
                    f30485r0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.f30501j0;
                gVar.f334b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.l5.d);
                gVar.d = mv0Var2;
                f30485r0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof lh.y5);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f30505n0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.L) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f30489b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f30489b instanceof org.telegram.ui.ao) {
            i10 = this.B;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f30489b;
        if (drawable instanceof fc0) {
            return this.B;
        }
        if (drawable instanceof org.telegram.ui.ao) {
            return this.B;
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
        return getMeasuredHeight() + this.f30496f;
    }

    public int getKeyboardHeight() {
        return this.f30496f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.k6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.k6.f21744i0;
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
        this.J = true;
        if (this.K && !this.L) {
            this.L = true;
            this.f30495e0 = true;
        }
        Drawable drawable = this.f30489b;
        if (drawable instanceof org.telegram.ui.ao) {
            ((org.telegram.ui.ao) drawable).f(this.I);
        }
        Drawable drawable2 = this.f30489b;
        if (drawable2 instanceof fc0) {
            ((fc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.ao) {
            ((org.telegram.ui.ao) drawable3).f(this.I);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof fc0) {
            ((fc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.J = false;
        this.T.setShader(null);
        this.U.setShader(null);
        this.V.setShader(null);
        this.W.setShader(null);
        ValueAnimator valueAnimator = this.f30493d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        mv0 mv0Var = this.N;
        if (mv0Var != null) {
            mv0Var.f29255c.recycle();
            this.N = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.P;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((mv0) arrayList.get(i10)).f29255c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.L = false;
        Drawable drawable = this.f30489b;
        if (drawable instanceof org.telegram.ui.ao) {
            ((org.telegram.ui.ao) drawable).g(this.I);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.ao) {
            ((org.telegram.ui.ao) drawable2).g(this.I);
        }
        Drawable drawable3 = this.f30489b;
        if (drawable3 instanceof fc0) {
            ((fc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof fc0) {
            ((fc0) drawable4).l();
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        S();
    }

    public void setBackgroundTranslation(int i10) {
        if (i10 != this.B) {
            this.B = i10;
            fg.h0 h0Var = this.I;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            fg.h0 h0Var = this.I;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setDelegate(pv0 pv0Var) {
        this.f30504n = pv0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            fg.h0 h0Var = this.I;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z4) {
        this.f30510s = z4;
    }

    public void setSkipBackgroundDrawing(boolean z4) {
        if (this.G != z4) {
            this.G = z4;
            fg.h0 h0Var = this.I;
            if (h0Var != null) {
                h0Var.invalidate();
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
