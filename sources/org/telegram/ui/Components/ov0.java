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
public class ov0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static DispatchQueue f29222u0;
    public static boolean f29223v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.d5 G;
    public org.telegram.ui.ActionBar.p1 H;
    public int I;
    public boolean J;
    public zv0 K;
    public di.eb L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public kv0 Q;
    public kv0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f29224a;
    public final Paint f29225a0;
    public Drawable f29226b;
    public final Paint f29227b0;
    public boolean f29228c;
    public final Paint f29229c0;
    public Drawable d;
    public Paint f29230d0;
    public boolean f29231e;
    public Paint f29232e0;
    public int f29233f;
    public float f29234f0;
    public ValueAnimator f29235g0;
    public int h;
    public boolean f29236h0;
    public int f29237i0;
    public int f29238j0;
    public int f29239k0;
    public float f29240l0;
    public final androidx.activity.g m0;
    public nv0 f29241n;
    public float f29242n0;
    public float f29243o0;
    public RenderNode[] f29244p0;
    public final boolean[] f29245q0;
    public final ArrayList f29246r;
    public final boolean[] f29247r0;
    public boolean f29248s;
    public final ArrayList f29249s0;
    public final ArrayList f29250t0;
    public l81 v;
    public float f29251w;
    public float f29252x;
    public float f29253y;

    public ov0(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f29224a = new Rect();
        this.f29246r = new ArrayList();
        this.f29248s = true;
        this.f29253y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f29225a0 = new Paint();
        this.f29227b0 = new Paint();
        this.f29229c0 = new Paint();
        this.f29240l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f29245q0 = new boolean[2];
        this.f29247r0 = new boolean[2];
        this.f29249s0 = new ArrayList();
        this.f29250t0 = new ArrayList();
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

    public static void G(ov0 ov0Var, Canvas canvas) {
        if (ov0Var.L != null && org.telegram.ui.ActionBar.j6.G1 && LiteMode.isEnabled(32)) {
            if (ov0Var.K == null) {
                zv0 zv0Var = new zv0(1);
                ov0Var.K = zv0Var;
                zv0Var.f33270g = -1;
                zv0Var.c();
            }
            ov0Var.K.b(canvas, ov0Var.L);
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
        if (!this.f29231e && !this.f29228c) {
            l81 l81Var = this.v;
            if (l81Var != null) {
                l81Var.c(false);
                this.v = null;
                this.f29253y = 1.0f;
                this.f29251w = 0.0f;
                this.f29252x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            l81 l81Var2 = new l81(getContext());
            this.v = l81Var2;
            l81Var2.f28146n = new kv(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                l81 l81Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                l81Var3.getClass();
                this.f29253y = l81.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.j6.f21060xf;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f21078yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.j6.v0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ov0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f29236h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f29247r0;
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
        return this instanceof org.telegram.ui.um;
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
        Rect rect = this.f29224a;
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
        this.f29233f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f29253y = l81.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f29241n == null && this.f29246r.isEmpty()) {
            return;
        }
        this.f29233f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new mr0(2, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f29226b == drawable) {
            return;
        }
        if (this.L == null) {
            di.eb ebVar = new di.eb(this, getContext(), 24);
            this.L = ebVar;
            addView(ebVar, 0, w7.x5.c(-1.0f, -1));
        }
        if (drawable instanceof dc0) {
            ((dc0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f29226b;
            if (drawable2 instanceof org.telegram.ui.go) {
                ((org.telegram.ui.go) drawable2).g(this.L);
            }
        }
        this.f29226b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.go)) {
            ((org.telegram.ui.go) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f29226b;
            if (drawable3 instanceof dc0) {
                ((dc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f29226b;
            if (drawable4 instanceof dc0) {
                ((dc0) drawable4).k();
            }
        }
        U(this.f29226b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        kv0 kv0Var;
        kv0 kv0Var2;
        if (this.O && !this.P && this.f29236h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21078yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f29236h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    kv0Var = (kv0) i2.g.z(1, arrayList);
                } else {
                    kv0Var = null;
                }
                if (kv0Var == null) {
                    ?? obj = new Object();
                    obj.f27938c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f27937b = new Canvas(obj.f27938c);
                    kv0Var2 = obj;
                } else {
                    kv0Var.f27938c.eraseColor(0);
                    kv0Var2 = kv0Var;
                }
                float width = kv0Var2.f27938c.getWidth() / f10;
                float height = (kv0Var2.f27938c.getHeight() - 34) / f7;
                int save = kv0Var2.f27937b.save();
                kv0Var2.f27936a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                kv0Var2.f27937b.clipRect(1.0f, f11, kv0Var2.f27938c.getWidth(), kv0Var2.f27938c.getHeight() - 1);
                kv0Var2.f27937b.scale(width, height);
                kv0Var2.f27937b.translate(0.0f, f11 + kv0Var2.f27936a);
                kv0Var2.d = 1.0f / width;
                kv0Var2.f27939e = 1.0f / height;
                L(kv0Var2.f27937b, null);
                try {
                    kv0Var2.f27937b.restoreToCount(save);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                System.currentTimeMillis();
                int i12 = this.f29239k0 + 1;
                this.f29239k0 = i12;
                if (i12 >= 20) {
                    this.f29239k0 = 0;
                }
                if (f29222u0 == null) {
                    f29222u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f873b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.i5.d);
                gVar.d = kv0Var2;
                f29222u0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof yh.r4);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f29245q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f29226b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f29226b instanceof org.telegram.ui.go) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f29226b;
        if (drawable instanceof dc0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.go) {
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
        return getMeasuredHeight() + this.f29233f;
    }

    public int getKeyboardHeight() {
        return this.f29233f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.j6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.j6.f20774i0;
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
            this.f29236h0 = true;
        }
        Drawable drawable = this.f29226b;
        if (drawable instanceof org.telegram.ui.go) {
            ((org.telegram.ui.go) drawable).f(this.L);
        }
        Drawable drawable2 = this.f29226b;
        if (drawable2 instanceof dc0) {
            ((dc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.go) {
            ((org.telegram.ui.go) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof dc0) {
            ((dc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f29225a0.setShader(null);
        this.f29227b0.setShader(null);
        this.f29229c0.setShader(null);
        ValueAnimator valueAnimator = this.f29235g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kv0 kv0Var = this.Q;
        if (kv0Var != null) {
            kv0Var.f27938c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((kv0) arrayList.get(i10)).f27938c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f29226b;
        if (drawable instanceof org.telegram.ui.go) {
            ((org.telegram.ui.go) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.go) {
            ((org.telegram.ui.go) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f29226b;
        if (drawable3 instanceof dc0) {
            ((dc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof dc0) {
            ((dc0) drawable4).l();
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
            di.eb ebVar = this.L;
            if (ebVar != null) {
                ebVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            di.eb ebVar = this.L;
            if (ebVar != null) {
                ebVar.invalidate();
            }
        }
    }

    public void setDelegate(nv0 nv0Var) {
        this.f29241n = nv0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            di.eb ebVar = this.L;
            if (ebVar != null) {
                ebVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f29248s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            di.eb ebVar = this.L;
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

    public void d() {
    }

    public void L(Canvas canvas, ArrayList arrayList) {
    }
}
