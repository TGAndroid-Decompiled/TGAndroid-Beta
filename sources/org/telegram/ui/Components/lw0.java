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
    public static DispatchQueue f28440u0;
    public static boolean f28441v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.c5 G;
    public org.telegram.ui.ActionBar.p1 H;
    public int I;
    public boolean J;
    public ww0 K;
    public ci.ab L;
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
    public final Rect f28442a;
    public final Paint f28443a0;
    public Drawable f28444b;
    public final Paint f28445b0;
    public boolean f28446c;
    public final Paint f28447c0;
    public Drawable d;
    public Paint f28448d0;
    public boolean f28449e;
    public Paint f28450e0;
    public int f28451f;
    public float f28452f0;
    public ValueAnimator f28453g0;
    public int h;
    public boolean f28454h0;
    public int f28455i0;
    public int f28456j0;
    public int f28457k0;
    public float f28458l0;
    public final androidx.activity.g m0;
    public kw0 f28459n;
    public float f28460n0;
    public float f28461o0;
    public RenderNode[] f28462p0;
    public final boolean[] f28463q0;
    public final ArrayList f28464r;
    public final boolean[] f28465r0;
    public boolean f28466s;
    public final ArrayList f28467s0;
    public final ArrayList f28468t0;
    public j91 v;
    public float f28469w;
    public float f28470x;
    public float f28471y;

    public lw0(Context context, org.telegram.ui.ActionBar.c5 c5Var) {
        super(context);
        this.f28442a = new Rect();
        this.f28464r = new ArrayList();
        this.f28466s = true;
        this.f28471y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f28443a0 = new Paint();
        this.f28445b0 = new Paint();
        this.f28447c0 = new Paint();
        this.f28458l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f28463q0 = new boolean[2];
        this.f28465r0 = new boolean[2];
        this.f28467s0 = new ArrayList();
        this.f28468t0 = new ArrayList();
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

    public static void H(lw0 lw0Var, Canvas canvas) {
        if (lw0Var.L != null && org.telegram.ui.ActionBar.i6.G1 && LiteMode.isEnabled(32)) {
            if (lw0Var.K == null) {
                ww0 ww0Var = new ww0(1);
                lw0Var.K = ww0Var;
                ww0Var.f32644g = -1;
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
        if (!this.f28449e && !this.f28446c) {
            j91 j91Var = this.v;
            if (j91Var != null) {
                j91Var.c(false);
                this.v = null;
                this.f28471y = 1.0f;
                this.f28469w = 0.0f;
                this.f28470x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            j91 j91Var2 = new j91(getContext());
            this.v = j91Var2;
            j91Var2.f27700n = new pv(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                j91 j91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                j91Var3.getClass();
                this.f28471y = j91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (G() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.i6.f21196xf;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21214yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.i6.v0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f28454h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f28465r0;
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
        Rect rect = this.f28442a;
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
        this.f28451f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f28471y = j91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f28459n == null && this.f28464r.isEmpty()) {
            return;
        }
        this.f28451f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new es0(2, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f28444b == drawable) {
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
            Drawable drawable2 = this.f28444b;
            if (drawable2 instanceof org.telegram.ui.bo) {
                ((org.telegram.ui.bo) drawable2).g(this.L);
            }
        }
        this.f28444b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.bo)) {
            ((org.telegram.ui.bo) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f28444b;
            if (drawable3 instanceof pc0) {
                ((pc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f28444b;
            if (drawable4 instanceof pc0) {
                ((pc0) drawable4).k();
            }
        }
        U(this.f28444b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        hw0 hw0Var;
        hw0 hw0Var2;
        if (this.O && !this.P && this.f28454h0 && SharedConfig.chatBlurEnabled() && !G() && Color.alpha(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21214yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f28454h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    hw0Var = (hw0) hg.k0.w(1, arrayList);
                } else {
                    hw0Var = null;
                }
                if (hw0Var == null) {
                    ?? obj = new Object();
                    obj.f27254c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f27253b = new Canvas(obj.f27254c);
                    hw0Var2 = obj;
                } else {
                    hw0Var.f27254c.eraseColor(0);
                    hw0Var2 = hw0Var;
                }
                float width = hw0Var2.f27254c.getWidth() / f10;
                float height = (hw0Var2.f27254c.getHeight() - 34) / f7;
                int save = hw0Var2.f27253b.save();
                hw0Var2.f27252a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                hw0Var2.f27253b.clipRect(1.0f, f11, hw0Var2.f27254c.getWidth(), hw0Var2.f27254c.getHeight() - 1);
                hw0Var2.f27253b.scale(width, height);
                hw0Var2.f27253b.translate(0.0f, f11 + hw0Var2.f27252a);
                hw0Var2.d = 1.0f / width;
                hw0Var2.f27255e = 1.0f / height;
                L(hw0Var2.f27253b, null);
                try {
                    hw0Var2.f27253b.restoreToCount(save);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                System.currentTimeMillis();
                int i12 = this.f28457k0 + 1;
                this.f28457k0 = i12;
                if (i12 >= 20) {
                    this.f28457k0 = 0;
                }
                if (f28440u0 == null) {
                    f28440u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f2049b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.j5.d);
                gVar.d = hw0Var2;
                f28440u0.postRunnable(gVar);
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
        boolean[] zArr = this.f28463q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f28444b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f28444b instanceof org.telegram.ui.bo) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f28444b;
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
        return getMeasuredHeight() + this.f28451f;
    }

    public int getKeyboardHeight() {
        return this.f28451f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.i6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.i6.f20903i0;
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
            this.f28454h0 = true;
        }
        Drawable drawable = this.f28444b;
        if (drawable instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) drawable).f(this.L);
        }
        Drawable drawable2 = this.f28444b;
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
        this.f28443a0.setShader(null);
        this.f28445b0.setShader(null);
        this.f28447c0.setShader(null);
        ValueAnimator valueAnimator = this.f28453g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        hw0 hw0Var = this.Q;
        if (hw0Var != null) {
            hw0Var.f27254c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((hw0) arrayList.get(i10)).f27254c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f28444b;
        if (drawable instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f28444b;
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

    public void setDelegate(kw0 kw0Var) {
        this.f28459n = kw0Var;
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
        this.f28466s = z10;
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
