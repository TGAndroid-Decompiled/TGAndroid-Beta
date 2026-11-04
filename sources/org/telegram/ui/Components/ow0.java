package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class ow0 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public sp0 I;
    public int J;
    public String K;
    public int L;
    public String[] M;
    public Runnable N;
    public long O;
    public Path P;
    public Path Q;
    public Paint R;
    public u5 S;
    public u5 T;
    public u5 U;
    public u5 V;
    public org.telegram.messenger.f6 W;
    public final int f36958a;
    public float f36959a0;
    public final org.telegram.ui.ActionBar.e6 f36960b;
    public Integer f36961b0;
    public mw0 f36962c;
    public Integer f36963c0;
    public kw0 d;
    public float f36964d0;
    public lw0 f36965e;
    public u5 f36966e0;
    public org.telegram.ui.n4 f36967f;
    public u5 f36968f0;
    public u5 f36969g0;
    public int h;
    public int f36970n;
    public jw0 f36971r;
    public boolean f36972s;
    public boolean f36973w;
    public ArrayList f36974x;
    public boolean f36975y;

    public ow0(Context context, int i3, org.telegram.ui.mj mjVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = 0;
        this.f36970n = org.telegram.messenger.g0.L(10.0f);
        this.O = 0L;
        this.f36958a = i3;
        this.f36962c = mjVar;
        this.f36960b = e6Var;
        postDelayed(new ii.i2(i3, 11), 260L);
    }

    public static boolean a(ow0 ow0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.is.p().r(motionEvent, ow0Var.f36965e, kVar, ow0Var.getPreviewDelegate(), ow0Var.f36960b);
    }

    public org.telegram.ui.gs getPreviewDelegate() {
        if (this.f36971r == null) {
            this.f36971r = new jw0(this);
        }
        return this.f36971r;
    }

    public final void c() {
        if (this.f36965e == null) {
            this.P = new Path();
            this.Q = new Path();
            kw0 kw0Var = new kw0(0, getContext(), this);
            this.d = kw0Var;
            xq xqVar = xq.h;
            this.S = new u5(kw0Var, 120L, 350L, xqVar);
            this.T = new u5(this.d, 150L, 600L, xqVar);
            new OvershootInterpolator(0.4f);
            this.U = new u5(this.d, 300L, xqVar);
            this.V = new u5(this.d, 300L, xqVar);
            this.f36966e0 = new u5(this.d, 200L, xqVar);
            this.f36968f0 = new u5(this.d, 350L, xqVar);
            this.f36969g0 = new u5(this.d, 350L, xqVar);
            lw0 lw0Var = new lw0(this, getContext());
            this.f36965e = lw0Var;
            org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(6, this, this);
            this.f36967f = n4Var;
            lw0Var.setAdapter(n4Var);
            getContext();
            u4.b0 b0Var = new u4.b0();
            b0Var.j1(0);
            this.f36965e.setLayoutManager(b0Var);
            u4.k kVar = new u4.k();
            kVar.n(45L);
            kVar.f55597o = xqVar;
            this.f36965e.setItemAnimator(kVar);
            org.telegram.ui.ActionBar.r6.K(this.f36965e, org.telegram.ui.ActionBar.k6.f27972i6, this.f36960b);
            lw0 lw0Var2 = this.f36965e;
            k kVar2 = new k(this, 17);
            lw0Var2.setOnItemClickListener(kVar2);
            this.f36965e.setOnTouchListener(new gi.n1(4, this, kVar2));
            this.d.addView(this.f36965e, b8.mf.c(52.0f, -1));
            addView(this.d, b8.mf.a(-1.0f, 66.66f, 80));
            mw0 mw0Var = this.f36962c;
            if (mw0Var != null) {
                mw0Var.d(new bh.h(this, 23));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.L2) {
            ArrayList arrayList = this.f36974x;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i3 == org.telegram.messenger.hs.f23246i4 && this.f36965e != null) {
            for (int i11 = 0; i11 < this.f36965e.getChildCount(); i11++) {
                this.f36965e.getChildAt(i11).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lw0 lw0Var = this.f36965e;
        if (lw0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.f36969g0.f38645c;
        float f11 = this.f36968f0.f38645c;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = f10 / 2.0f;
        rectF.set(this.f36965e.getTranslationX() + (f11 - f12) + lw0Var.getPaddingLeft(), this.f36965e.getPaddingTop() + this.f36965e.getTop(), Math.min(this.f36965e.getTranslationX() + f11 + f12 + this.f36965e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f36965e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f36972s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        sp0 sp0Var = this.I;
        if (sp0Var != null) {
            org.telegram.messenger.g0.r(sp0Var);
        }
        sp0 sp0Var2 = new sp0(this, 11);
        this.I = sp0Var2;
        org.telegram.messenger.g0.i3(sp0Var2, 16L);
    }

    public final void f() {
        sp0 sp0Var = this.I;
        if (sp0Var != null) {
            org.telegram.messenger.g0.r(sp0Var);
            this.I = null;
        }
        this.f36972s = false;
        this.f36973w = true;
        kw0 kw0Var = this.d;
        if (kw0Var != null) {
            kw0Var.invalidate();
        }
    }

    public mw0 getDelegate() {
        return this.f36962c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f36972s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.f(this.f36958a).c(this, org.telegram.messenger.hs.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.f(this.f36958a).n(this, org.telegram.messenger.hs.L2);
    }

    public void setDelegate(mw0 mw0Var) {
        this.f36962c = mw0Var;
    }

    public void setDirection(int i3) {
        if (this.h != i3) {
            this.h = i3;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i3) {
        this.f36970n = i3;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.R;
        org.telegram.ui.ActionBar.e6 e6Var = this.f36960b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28130qf, e6Var));
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28130qf, e6Var);
        if (this.G == null || this.H != w02) {
            this.H = w02;
            this.G = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.k6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.G;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.k6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.k6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.G;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.k6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        kw0 kw0Var = this.d;
        if (kw0Var != null) {
            kw0Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
