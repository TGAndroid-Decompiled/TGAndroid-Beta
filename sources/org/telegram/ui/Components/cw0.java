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
public class cw0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public static DispatchQueue f23410u0;
    public static boolean f23411v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.b5 G;
    public org.telegram.ui.ActionBar.o1 H;
    public int I;
    public boolean J;
    public nw0 K;
    public ci.bb L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public yv0 Q;
    public yv0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f23412a;
    public final Paint f23413a0;
    public Drawable f23414b;
    public final Paint f23415b0;
    public boolean f23416c;
    public final Paint f23417c0;
    public Drawable d;
    public Paint f23418d0;
    public boolean e;
    public Paint f23419e0;
    public int f23420f;
    public float f23421f0;
    public ValueAnimator f23422g0;
    public int h;
    public boolean f23423h0;
    public int f23424i0;
    public int f23425j0;
    public int f23426k0;
    public float f23427l0;
    public final androidx.activity.g m0;
    public bw0 f23428n;
    public float f23429n0;
    public float f23430o0;
    public RenderNode[] f23431p0;
    public final boolean[] f23432q0;
    public final ArrayList f23433r;
    public final boolean[] f23434r0;
    public boolean f23435s;
    public final ArrayList f23436s0;
    public final ArrayList f23437t0;
    public b91 v;
    public float f23438w;
    public float f23439x;
    public float f23440y;

    public cw0(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f23412a = new Rect();
        this.f23433r = new ArrayList();
        this.f23435s = true;
        this.f23440y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f23413a0 = new Paint();
        this.f23415b0 = new Paint();
        this.f23417c0 = new Paint();
        this.f23427l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f23432q0 = new boolean[2];
        this.f23434r0 = new boolean[2];
        this.f23436s0 = new ArrayList();
        this.f23437t0 = new ArrayList();
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

    public static void G(cw0 cw0Var, Canvas canvas) {
        if (cw0Var.L != null && org.telegram.ui.ActionBar.h6.G1 && LiteMode.isEnabled(32)) {
            if (cw0Var.K == null) {
                nw0 nw0Var = new nw0(1);
                cw0Var.K = nw0Var;
                nw0Var.f26871g = -1;
                nw0Var.c();
            }
            cw0Var.K.b(canvas, cw0Var.L);
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
        if (!this.e && !this.f23416c) {
            b91 b91Var = this.v;
            if (b91Var != null) {
                b91Var.c(false);
                this.v = null;
                this.f23440y = 1.0f;
                this.f23438w = 0.0f;
                this.f23439x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            b91 b91Var2 = new b91(getContext());
            this.v = b91Var2;
            b91Var2.f22906n = new nv(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                b91 b91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                b91Var3.getClass();
                this.f23440y = b91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.h6.f19434xf;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19452yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.h6.v0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f23423h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f23434r0;
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
        return this instanceof org.telegram.ui.pm;
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
        Rect rect = this.f23412a;
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
        this.f23420f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f23440y = b91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f23428n == null && this.f23433r.isEmpty()) {
            return;
        }
        this.f23420f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new as0(2, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f23414b == drawable) {
            return;
        }
        if (this.L == null) {
            ci.bb bbVar = new ci.bb(this, getContext(), 24);
            this.L = bbVar;
            addView(bbVar, 0, w7.y5.c(-1.0f, -1));
        }
        if (drawable instanceof oc0) {
            ((oc0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f23414b;
            if (drawable2 instanceof org.telegram.ui.zn) {
                ((org.telegram.ui.zn) drawable2).g(this.L);
            }
        }
        this.f23414b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.zn)) {
            ((org.telegram.ui.zn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f23414b;
            if (drawable3 instanceof oc0) {
                ((oc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f23414b;
            if (drawable4 instanceof oc0) {
                ((oc0) drawable4).k();
            }
        }
        U(this.f23414b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        yv0 yv0Var;
        yv0 yv0Var2;
        if (this.O && !this.P && this.f23423h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19452yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f23423h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    yv0Var = (yv0) hg.c.x(1, arrayList);
                } else {
                    yv0Var = null;
                }
                if (yv0Var == null) {
                    ?? obj = new Object();
                    obj.f30765c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f30764b = new Canvas(obj.f30765c);
                    yv0Var2 = obj;
                } else {
                    yv0Var.f30765c.eraseColor(0);
                    yv0Var2 = yv0Var;
                }
                float width = yv0Var2.f30765c.getWidth() / f10;
                float height = (yv0Var2.f30765c.getHeight() - 34) / f7;
                int save = yv0Var2.f30764b.save();
                yv0Var2.f30763a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                yv0Var2.f30764b.clipRect(1.0f, f11, yv0Var2.f30765c.getWidth(), yv0Var2.f30765c.getHeight() - 1);
                yv0Var2.f30764b.scale(width, height);
                yv0Var2.f30764b.translate(0.0f, f11 + yv0Var2.f30763a);
                yv0Var2.d = 1.0f / width;
                yv0Var2.e = 1.0f / height;
                L(yv0Var2.f30764b, null);
                try {
                    yv0Var2.f30764b.restoreToCount(save);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                System.currentTimeMillis();
                int i12 = this.f23426k0 + 1;
                this.f23426k0 = i12;
                if (i12 >= 20) {
                    this.f23426k0 = 0;
                }
                if (f23410u0 == null) {
                    f23410u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f1881b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.i5.d);
                gVar.d = yv0Var2;
                f23410u0.postRunnable(gVar);
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
        boolean[] zArr = this.f23432q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f23414b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f23414b instanceof org.telegram.ui.zn) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f23414b;
        if (drawable instanceof oc0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.zn) {
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
        return getMeasuredHeight() + this.f23420f;
    }

    public int getKeyboardHeight() {
        return this.f23420f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.h6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.h6.f19143i0;
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
            this.f23423h0 = true;
        }
        Drawable drawable = this.f23414b;
        if (drawable instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) drawable).f(this.L);
        }
        Drawable drawable2 = this.f23414b;
        if (drawable2 instanceof oc0) {
            ((oc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof oc0) {
            ((oc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f23413a0.setShader(null);
        this.f23415b0.setShader(null);
        this.f23417c0.setShader(null);
        ValueAnimator valueAnimator = this.f23422g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        yv0 yv0Var = this.Q;
        if (yv0Var != null) {
            yv0Var.f30765c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((yv0) arrayList.get(i10)).f30765c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f23414b;
        if (drawable instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f23414b;
        if (drawable3 instanceof oc0) {
            ((oc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof oc0) {
            ((oc0) drawable4).l();
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

    public void setDelegate(bw0 bw0Var) {
        this.f23428n = bw0Var;
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
        this.f23435s = z10;
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
