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
public class mw0 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public static DispatchQueue f28826u0;
    public static boolean f28827v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.c5 G;
    public org.telegram.ui.ActionBar.p1 H;
    public int I;
    public boolean J;
    public xw0 K;
    public ci.ab L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public iw0 Q;
    public iw0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f28828a;
    public final Paint f28829a0;
    public Drawable f28830b;
    public final Paint f28831b0;
    public boolean f28832c;
    public final Paint f28833c0;
    public Drawable d;
    public Paint f28834d0;
    public boolean f28835e;
    public Paint f28836e0;
    public int f28837f;
    public float f28838f0;
    public ValueAnimator f28839g0;
    public int h;
    public boolean f28840h0;
    public int f28841i0;
    public int f28842j0;
    public int f28843k0;
    public float f28844l0;
    public final androidx.activity.g m0;
    public lw0 f28845n;
    public float f28846n0;
    public float f28847o0;
    public RenderNode[] f28848p0;
    public final boolean[] f28849q0;
    public final ArrayList f28850r;
    public final boolean[] f28851r0;
    public boolean f28852s;
    public final ArrayList f28853s0;
    public final ArrayList f28854t0;
    public k91 v;
    public float f28855w;
    public float f28856x;
    public float f28857y;

    public mw0(Context context, org.telegram.ui.ActionBar.c5 c5Var) {
        super(context);
        this.f28828a = new Rect();
        this.f28850r = new ArrayList();
        this.f28852s = true;
        this.f28857y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f28829a0 = new Paint();
        this.f28831b0 = new Paint();
        this.f28833c0 = new Paint();
        this.f28844l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f28849q0 = new boolean[2];
        this.f28851r0 = new boolean[2];
        this.f28853s0 = new ArrayList();
        this.f28854t0 = new ArrayList();
        setWillNotDraw(false);
        this.G = c5Var;
        this.H = null;
    }

    public static boolean G() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void H(mw0 mw0Var, Canvas canvas) {
        if (mw0Var.L != null && org.telegram.ui.ActionBar.i6.G1 && LiteMode.isEnabled(32)) {
            if (mw0Var.K == null) {
                xw0 xw0Var = new xw0(1);
                mw0Var.K = xw0Var;
                xw0Var.f33106g = -1;
                xw0Var.c();
            }
            mw0Var.K.b(canvas, mw0Var.L);
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
        if (!this.f28835e && !this.f28832c) {
            k91 k91Var = this.v;
            if (k91Var != null) {
                k91Var.c(false);
                this.v = null;
                this.f28857y = 1.0f;
                this.f28855w = 0.0f;
                this.f28856x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            k91 k91Var2 = new k91(getContext());
            this.v = k91Var2;
            k91Var2.f28135n = new pv(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                k91 k91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                k91Var3.getClass();
                this.f28857y = k91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (G() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.i6.f21205xf;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21223yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.i6.v0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f28840h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f28851r0;
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
        return !(this instanceof org.telegram.ui.kb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.kb);
    }

    public int R() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f28828a;
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
        this.f28837f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f28857y = k91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f28845n == null && this.f28850r.isEmpty()) {
            return;
        }
        this.f28837f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new fs0(2, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f28830b == drawable) {
            return;
        }
        if (this.L == null) {
            ci.ab abVar = new ci.ab(this, getContext(), 25);
            this.L = abVar;
            addView(abVar, 0, w7.z5.c(-1.0f, -1));
        }
        if (drawable instanceof pc0) {
            ((pc0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f28830b;
            if (drawable2 instanceof org.telegram.ui.bo) {
                ((org.telegram.ui.bo) drawable2).g(this.L);
            }
        }
        this.f28830b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.bo)) {
            ((org.telegram.ui.bo) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f28830b;
            if (drawable3 instanceof pc0) {
                ((pc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f28830b;
            if (drawable4 instanceof pc0) {
                ((pc0) drawable4).k();
            }
        }
        U(this.f28830b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        iw0 iw0Var;
        iw0 iw0Var2;
        if (this.O && !this.P && this.f28840h0 && SharedConfig.chatBlurEnabled() && !G() && Color.alpha(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21223yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f28840h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    iw0Var = (iw0) hg.c.w(1, arrayList);
                } else {
                    iw0Var = null;
                }
                if (iw0Var == null) {
                    ?? obj = new Object();
                    obj.f27616c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f27615b = new Canvas(obj.f27616c);
                    iw0Var2 = obj;
                } else {
                    iw0Var.f27616c.eraseColor(0);
                    iw0Var2 = iw0Var;
                }
                float width = iw0Var2.f27616c.getWidth() / f10;
                float height = (iw0Var2.f27616c.getHeight() - 34) / f7;
                int save = iw0Var2.f27615b.save();
                iw0Var2.f27614a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                iw0Var2.f27615b.clipRect(1.0f, f11, iw0Var2.f27616c.getWidth(), iw0Var2.f27616c.getHeight() - 1);
                iw0Var2.f27615b.scale(width, height);
                iw0Var2.f27615b.translate(0.0f, f11 + iw0Var2.f27614a);
                iw0Var2.d = 1.0f / width;
                iw0Var2.f27617e = 1.0f / height;
                L(iw0Var2.f27615b, null);
                try {
                    iw0Var2.f27615b.restoreToCount(save);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                System.currentTimeMillis();
                int i12 = this.f28843k0 + 1;
                this.f28843k0 = i12;
                if (i12 >= 20) {
                    this.f28843k0 = 0;
                }
                if (f28826u0 == null) {
                    f28826u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f2049b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.j5.d);
                gVar.d = iw0Var2;
                f28826u0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (G()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof xh.t4);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f28849q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f28830b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f28830b instanceof org.telegram.ui.bo) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f28830b;
        if (drawable instanceof pc0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.bo) {
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
        return getMeasuredHeight() + this.f28837f;
    }

    public int getKeyboardHeight() {
        return this.f28837f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.i6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.i6.f20912i0;
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
            this.f28840h0 = true;
        }
        Drawable drawable = this.f28830b;
        if (drawable instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) drawable).f(this.L);
        }
        Drawable drawable2 = this.f28830b;
        if (drawable2 instanceof pc0) {
            ((pc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof pc0) {
            ((pc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f28829a0.setShader(null);
        this.f28831b0.setShader(null);
        this.f28833c0.setShader(null);
        ValueAnimator valueAnimator = this.f28839g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        iw0 iw0Var = this.Q;
        if (iw0Var != null) {
            iw0Var.f27616c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((iw0) arrayList.get(i10)).f27616c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f28830b;
        if (drawable instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f28830b;
        if (drawable3 instanceof pc0) {
            ((pc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof pc0) {
            ((pc0) drawable4).l();
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
            ci.ab abVar = this.L;
            if (abVar != null) {
                abVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            ci.ab abVar = this.L;
            if (abVar != null) {
                abVar.invalidate();
            }
        }
    }

    public void setDelegate(lw0 lw0Var) {
        this.f28845n = lw0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            ci.ab abVar = this.L;
            if (abVar != null) {
                abVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f28852s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            ci.ab abVar = this.L;
            if (abVar != null) {
                abVar.invalidate();
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
