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
public class qv0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static DispatchQueue f27409u0;
    public static boolean f27410v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.e5 G;
    public org.telegram.ui.ActionBar.q1 H;
    public int I;
    public boolean J;
    public bw0 K;
    public ci.eb L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public mv0 Q;
    public mv0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect f27411a;
    public final Paint f27412a0;
    public Drawable f27413b;
    public final Paint f27414b0;
    public boolean f27415c;
    public final Paint f27416c0;
    public Drawable d;
    public Paint f27417d0;
    public boolean e;
    public Paint f27418e0;
    public int f27419f;
    public float f27420f0;
    public ValueAnimator f27421g0;
    public int h;
    public boolean f27422h0;
    public int f27423i0;
    public int f27424j0;
    public int f27425k0;
    public float f27426l0;
    public final androidx.activity.g m0;
    public pv0 f27427n;
    public float f27428n0;
    public float f27429o0;
    public RenderNode[] f27430p0;
    public final boolean[] f27431q0;
    public final ArrayList f27432r;
    public final boolean[] f27433r0;
    public boolean f27434s;
    public final ArrayList f27435s0;
    public final ArrayList f27436t0;
    public m81 v;
    public float f27437w;
    public float f27438x;
    public float f27439y;

    public qv0(Context context, org.telegram.ui.ActionBar.e5 e5Var) {
        super(context);
        this.f27411a = new Rect();
        this.f27432r = new ArrayList();
        this.f27434s = true;
        this.f27439y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.f27412a0 = new Paint();
        this.f27414b0 = new Paint();
        this.f27416c0 = new Paint();
        this.f27426l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.f27431q0 = new boolean[2];
        this.f27433r0 = new boolean[2];
        this.f27435s0 = new ArrayList();
        this.f27436t0 = new ArrayList();
        setWillNotDraw(false);
        this.G = e5Var;
        this.H = null;
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void G(qv0 qv0Var, Canvas canvas) {
        if (qv0Var.L != null && org.telegram.ui.ActionBar.j6.G1 && LiteMode.isEnabled(32)) {
            if (qv0Var.K == null) {
                bw0 bw0Var = new bw0(1);
                qv0Var.K = bw0Var;
                bw0Var.f22813g = -1;
                bw0Var.c();
            }
            qv0Var.K.b(canvas, qv0Var.L);
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
        if (!this.e && !this.f27415c) {
            m81 m81Var = this.v;
            if (m81Var != null) {
                m81Var.c(false);
                this.v = null;
                this.f27439y = 1.0f;
                this.f27437w = 0.0f;
                this.f27438x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            m81 m81Var2 = new m81(getContext());
            this.v = m81Var2;
            m81Var2.f26111n = new lv(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                m81 m81Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                m81Var3.getClass();
                this.f27439y = m81.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (F() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.j6.f19235xf;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f19253yf;
        }
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.j6.v0(i10, getResourceProvider())));
    }

    public final void K(android.graphics.Canvas r23, float r24, android.graphics.Rect r25, android.graphics.Paint r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qv0.K(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f27422h0 = true;
            if (this.O && !this.P) {
                invalidate();
            }
        }
    }

    public final void N() {
        boolean[] zArr = this.f27433r0;
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
        return this instanceof org.telegram.ui.tm;
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
        Rect rect = this.f27411a;
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
        this.f27419f = max;
        return max;
    }

    public void S() {
        boolean z10;
        if (this.v != null) {
            this.f27439y = m81.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f27427n == null && this.f27432r.isEmpty()) {
            return;
        }
        this.f27419f = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new tr0(1, this, z10));
    }

    public final void V(Drawable drawable) {
        if (this.f27413b == drawable) {
            return;
        }
        if (this.L == null) {
            ci.eb ebVar = new ci.eb(this, getContext(), 24);
            this.L = ebVar;
            addView(ebVar, 0, w7.x5.c(-1.0f, -1));
        }
        if (drawable instanceof cc0) {
            ((cc0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f27413b;
            if (drawable2 instanceof org.telegram.ui.fo) {
                ((org.telegram.ui.fo) drawable2).g(this.L);
            }
        }
        this.f27413b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.fo)) {
            ((org.telegram.ui.fo) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f27413b;
            if (drawable3 instanceof cc0) {
                ((cc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f27413b;
            if (drawable4 instanceof cc0) {
                ((cc0) drawable4).k();
            }
        }
        U(this.f27413b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        mv0 mv0Var;
        mv0 mv0Var2;
        if (this.O && !this.P && this.f27422h0 && SharedConfig.chatBlurEnabled() && !F() && Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19253yf, false)) != 255) {
            int measuredWidth = getMeasuredWidth();
            int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            if (measuredWidth != 0 && dp != 0) {
                this.f27422h0 = false;
                this.P = true;
                float f7 = dp;
                int i10 = ((int) (f7 / 12.0f)) + 34;
                float f10 = measuredWidth;
                int i11 = (int) (f10 / 12.0f);
                System.currentTimeMillis();
                ArrayList arrayList = this.S;
                if (arrayList.size() > 0) {
                    mv0Var = (mv0) hg.k0.z(1, arrayList);
                } else {
                    mv0Var = null;
                }
                if (mv0Var == null) {
                    ?? obj = new Object();
                    obj.f26272c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    obj.f26271b = new Canvas(obj.f26272c);
                    mv0Var2 = obj;
                } else {
                    mv0Var.f26272c.eraseColor(0);
                    mv0Var2 = mv0Var;
                }
                float width = mv0Var2.f26272c.getWidth() / f10;
                float height = (mv0Var2.f26272c.getHeight() - 34) / f7;
                int save = mv0Var2.f26271b.save();
                mv0Var2.f26270a = getScrollOffset() % 24;
                float f11 = 10.0f * height;
                mv0Var2.f26271b.clipRect(1.0f, f11, mv0Var2.f26272c.getWidth(), mv0Var2.f26272c.getHeight() - 1);
                mv0Var2.f26271b.scale(width, height);
                mv0Var2.f26271b.translate(0.0f, f11 + mv0Var2.f26270a);
                mv0Var2.d = 1.0f / width;
                mv0Var2.e = 1.0f / height;
                L(mv0Var2.f26271b, null);
                try {
                    mv0Var2.f26271b.restoreToCount(save);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                System.currentTimeMillis();
                int i12 = this.f27425k0 + 1;
                this.f27425k0 = i12;
                if (i12 >= 20) {
                    this.f27425k0 = 0;
                }
                if (f27409u0 == null) {
                    f27409u0 = new DispatchQueue("BlurQueue");
                }
                androidx.activity.g gVar = this.m0;
                gVar.f1889b = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.i5.d);
                gVar.d = mv0Var2;
                f27409u0.postRunnable(gVar);
            }
        }
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof xh.s4);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f27431q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f27413b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f27413b instanceof org.telegram.ui.fo) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f27413b;
        if (drawable instanceof cc0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.fo) {
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
        return getMeasuredHeight() + this.f27419f;
    }

    public int getKeyboardHeight() {
        return this.f27419f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.j6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.j6.f18946i0;
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
            this.f27422h0 = true;
        }
        Drawable drawable = this.f27413b;
        if (drawable instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) drawable).f(this.L);
        }
        Drawable drawable2 = this.f27413b;
        if (drawable2 instanceof cc0) {
            ((cc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof cc0) {
            ((cc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.f27412a0.setShader(null);
        this.f27414b0.setShader(null);
        this.f27416c0.setShader(null);
        ValueAnimator valueAnimator = this.f27421g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        mv0 mv0Var = this.Q;
        if (mv0Var != null) {
            mv0Var.f26272c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((mv0) arrayList.get(i10)).f26272c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.f27413b;
        if (drawable instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) drawable2).g(this.L);
        }
        Drawable drawable3 = this.f27413b;
        if (drawable3 instanceof cc0) {
            ((cc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof cc0) {
            ((cc0) drawable4).l();
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

    public void setDelegate(pv0 pv0Var) {
        this.f27427n = pv0Var;
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
        this.f27434s = z10;
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
