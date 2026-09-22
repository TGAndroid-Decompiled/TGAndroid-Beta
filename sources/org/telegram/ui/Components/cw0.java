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
public class cw0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static DispatchQueue f23455u0;
    public static boolean f23456v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.d5 G;
    public org.telegram.ui.ActionBar.p1 H;
    public int I;
    public boolean J;
    public nw0 K;
    public ci.eb L;
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
    public final Rect f23457a;
    public final Paint f23458a0;
    public Drawable f23459b;
    public final Paint f23460b0;
    public boolean f23461c;
    public final Paint f23462c0;
    public Drawable d;
    public Paint f23463d0;
    public boolean e;
    public Paint f23464e0;
    public int f23465f;
    public float f23466f0;
    public ValueAnimator f23467g0;
    public int h;
    public boolean f23468h0;
    public int f23469i0;
    public int f23470j0;
    public int f23471k0;
    public float f23472l0;
    public final androidx.activity.g m0;
    public bw0 f23473n;
    public float f23474n0;
    public float f23475o0;
    public RenderNode[] f23476p0;
    public final boolean[] f23477q0;
    public final ArrayList f23478r;
    public final boolean[] f23479r0;
    public boolean f23480s;
    public final ArrayList f23481s0;
    public final ArrayList f23482t0;
    public c91 v;
    public float f23483w;
    public float f23484x;
    public float f23485y;

    public cw0(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f23457a = new Rect();
        this.f23478r = new ArrayList();
        this.f23480s = true;
        this.f23485y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f23458a0 = new Paint();
        this.f23460b0 = new Paint();
        this.f23462c0 = new Paint();
        this.f23472l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f23477q0 = new boolean[2];
        this.f23479r0 = new boolean[2];
        this.f23481s0 = new ArrayList();
        this.f23482t0 = new ArrayList();
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

    public static void H(cw0 cw0Var, Canvas canvas) {
        if (cw0Var.L != null && org.telegram.ui.ActionBar.j6.G1 && LiteMode.isEnabled(32)) {
            if (cw0Var.K == null) {
                nw0 nw0Var = new nw0(1);
                cw0Var.K = nw0Var;
                nw0Var.f26895g = -1;
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
        if (!this.e && !this.f23461c) {
            c91 c91Var = this.v;
            if (c91Var != null) {
                c91Var.c(false);
                this.v = null;
                this.f23485y = 1.0f;
                this.f23483w = 0.0f;
                this.f23484x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            c91 c91Var2 = new c91(getContext());
            this.v = c91Var2;
            c91Var2.f23321n = new mv(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                c91 c91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                c91Var3.getClass();
                this.f23485y = c91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.j6.f19483xf;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f19501yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.j6.v0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cw0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f23468h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f23479r0;
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
        return this instanceof org.telegram.ui.rm;
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
        Rect rect = this.f23457a;
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
        this.f23465f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f23485y = c91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f23473n == null && this.f23478r.isEmpty()) {
            return;
        }
        this.f23465f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new as0(2, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f23459b == drawable) {
            return;
        }
        if (this.L == null) {
            ci.eb ebVar = new ci.eb(this, getContext(), 24);
            this.L = ebVar;
            addView(ebVar, 0, w7.y5.c(-1.0f, -1));
        }
        if (drawable instanceof nc0) {
            ((nc0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f23459b;
            if (drawable2 instanceof org.telegram.ui.co) {
                ((org.telegram.ui.co) drawable2).g(this.L);
            }
        }
        this.f23459b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.co)) {
            ((org.telegram.ui.co) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f23459b;
            if (drawable3 instanceof nc0) {
                ((nc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f23459b;
            if (drawable4 instanceof nc0) {
                ((nc0) drawable4).k();
            }
        }
        U(this.f23459b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        yv0 yv0Var;
        yv0 yv0Var2;
        if (this.O && !this.P && this.f23468h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19501yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f23468h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    yv0Var = (yv0) hg.k0.x(1, arrayList);
                } else {
                    yv0Var = null;
                }
                if (yv0Var == null) {
                    ?? obj = new Object();
                    obj.f30759c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f30758b = new Canvas(obj.f30759c);
                    yv0Var2 = obj;
                } else {
                    yv0Var.f30759c.eraseColor(0);
                    yv0Var2 = yv0Var;
                }
                float width = yv0Var2.f30759c.getWidth() / f10;
                float height = (yv0Var2.f30759c.getHeight() - 34) / f7;
                int save = yv0Var2.f30758b.save();
                yv0Var2.f30757a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                yv0Var2.f30758b.clipRect(1.0f, f11, yv0Var2.f30759c.getWidth(), yv0Var2.f30759c.getHeight() - 1);
                yv0Var2.f30758b.scale(width, height);
                yv0Var2.f30758b.translate(0.0f, f11 + yv0Var2.f30757a);
                yv0Var2.d = 1.0f / width;
                yv0Var2.e = 1.0f / height;
                L(yv0Var2.f30758b, null);
                try {
                    yv0Var2.f30758b.restoreToCount(save);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                System.currentTimeMillis();
                int i12 = this.f23471k0 + 1;
                this.f23471k0 = i12;
                if (i12 >= 20) {
                    this.f23471k0 = 0;
                }
                if (f23455u0 == null) {
                    f23455u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f1888b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.i5.d);
                gVar.d = yv0Var2;
                f23455u0.postRunnable(gVar);
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
        boolean[] zArr = this.f23477q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f23459b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f23459b instanceof org.telegram.ui.co) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f23459b;
        if (drawable instanceof nc0) {
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
        return getMeasuredHeight() + this.f23465f;
    }

    public int getKeyboardHeight() {
        return this.f23465f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.j6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.j6.f19193i0;
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
            this.f23468h0 = true;
        }
        Drawable drawable = this.f23459b;
        if (drawable instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable).f(this.L);
        }
        Drawable drawable2 = this.f23459b;
        if (drawable2 instanceof nc0) {
            ((nc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof nc0) {
            ((nc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f23458a0.setShader(null);
        this.f23460b0.setShader(null);
        this.f23462c0.setShader(null);
        ValueAnimator valueAnimator = this.f23467g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        yv0 yv0Var = this.Q;
        if (yv0Var != null) {
            yv0Var.f30759c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((yv0) arrayList.get(i10)).f30759c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f23459b;
        if (drawable instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f23459b;
        if (drawable3 instanceof nc0) {
            ((nc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof nc0) {
            ((nc0) drawable4).l();
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
            ci.eb ebVar = this.L;
            if (ebVar != null) {
                ebVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            ci.eb ebVar = this.L;
            if (ebVar != null) {
                ebVar.invalidate();
            }
        }
    }

    public void setDelegate(bw0 bw0Var) {
        this.f23473n = bw0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            ci.eb ebVar = this.L;
            if (ebVar != null) {
                ebVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f23480s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            ci.eb ebVar = this.L;
            if (ebVar != null) {
                ebVar.invalidate();
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
