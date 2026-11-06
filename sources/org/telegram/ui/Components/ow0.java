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
public class ow0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public ir0 H;
    public int I;
    public String J;
    public int K;
    public String[] L;
    public Runnable M;
    public long N;
    public Path O;
    public Path P;
    public Paint Q;
    public w5 R;
    public w5 S;
    public w5 T;
    public w5 U;
    public org.telegram.messenger.f6 V;
    public float W;
    public final int f36789a;
    public Integer f36790a0;
    public final org.telegram.ui.ActionBar.f6 f36791b;
    public Integer f36792b0;
    public mw0 f36793c;
    public float f36794c0;
    public bi.e5 d;
    public w5 f36795d0;
    public lw0 f36796e;
    public w5 f36797e0;
    public org.telegram.ui.l4 f36798f;
    public w5 f36799f0;
    public int h;
    public int f36800n;
    public kw0 f36801r;
    public boolean f36802s;
    public boolean f36803w;
    public ArrayList f36804x;
    public boolean f36805y;

    public ow0(Context context, int i7, org.telegram.ui.qj qjVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = 0;
        this.f36800n = org.telegram.messenger.g0.L(10.0f);
        this.N = 0L;
        this.f36789a = i7;
        this.f36793c = qjVar;
        this.f36791b = f6Var;
        postDelayed(new hi.j2(i7, 11), 260L);
    }

    public static boolean a(ow0 ow0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.ks.p().r(motionEvent, ow0Var.f36796e, kVar, ow0Var.getPreviewDelegate(), ow0Var.f36791b);
    }

    public org.telegram.ui.is getPreviewDelegate() {
        if (this.f36801r == null) {
            this.f36801r = new kw0(this);
        }
        return this.f36801r;
    }

    public final void c() {
        if (this.f36796e == null) {
            this.O = new Path();
            this.P = new Path();
            bi.e5 e5Var = new bi.e5(28, getContext(), this);
            this.d = e5Var;
            xq xqVar = xq.h;
            this.R = new w5(e5Var, 120L, 350L, xqVar);
            this.S = new w5(this.d, 150L, 600L, xqVar);
            new OvershootInterpolator(0.4f);
            this.T = new w5(this.d, 300L, xqVar);
            this.U = new w5(this.d, 300L, xqVar);
            this.f36795d0 = new w5(this.d, 200L, xqVar);
            this.f36797e0 = new w5(this.d, 350L, xqVar);
            this.f36799f0 = new w5(this.d, 350L, xqVar);
            lw0 lw0Var = new lw0(this, getContext());
            this.f36796e = lw0Var;
            org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
            this.f36798f = l4Var;
            lw0Var.setAdapter(l4Var);
            getContext();
            v4.b0 b0Var = new v4.b0();
            b0Var.j1(0);
            this.f36796e.setLayoutManager(b0Var);
            v4.k kVar = new v4.k();
            kVar.n(45L);
            kVar.f56983o = xqVar;
            this.f36796e.setItemAnimator(kVar);
            org.telegram.ui.ActionBar.r6.K(this.f36796e, org.telegram.ui.ActionBar.k6.f27940i6, this.f36791b);
            lw0 lw0Var2 = this.f36796e;
            k kVar2 = new k(this, 17);
            lw0Var2.setOnItemClickListener(kVar2);
            this.f36796e.setOnTouchListener(new fi.n1(4, this, kVar2));
            this.d.addView(this.f36796e, c8.ha.c(52.0f, -1));
            addView(this.d, c8.ha.a(-1.0f, 66.66f, 80));
            mw0 mw0Var = this.f36793c;
            if (mw0Var != null) {
                mw0Var.d(new ah.j(this, 23));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.L2) {
            ArrayList arrayList = this.f36804x;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i7 == org.telegram.messenger.qs.f25001i4 && this.f36796e != null) {
            for (int i11 = 0; i11 < this.f36796e.getChildCount(); i11++) {
                this.f36796e.getChildAt(i11).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lw0 lw0Var = this.f36796e;
        if (lw0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.f36799f0.f39849c;
        float f11 = this.f36797e0.f39849c;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = f10 / 2.0f;
        rectF.set(this.f36796e.getTranslationX() + (f11 - f12) + lw0Var.getPaddingLeft(), this.f36796e.getPaddingTop() + this.f36796e.getTop(), Math.min(this.f36796e.getTranslationX() + f11 + f12 + this.f36796e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f36796e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f36802s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        ir0 ir0Var = this.H;
        if (ir0Var != null) {
            org.telegram.messenger.g0.r(ir0Var);
        }
        ir0 ir0Var2 = new ir0(this, 9);
        this.H = ir0Var2;
        org.telegram.messenger.g0.i3(ir0Var2, 16L);
    }

    public final void f() {
        ir0 ir0Var = this.H;
        if (ir0Var != null) {
            org.telegram.messenger.g0.r(ir0Var);
            this.H = null;
        }
        this.f36802s = false;
        this.f36803w = true;
        bi.e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.invalidate();
        }
    }

    public mw0 getDelegate() {
        return this.f36793c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f36802s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25001i4);
        org.telegram.messenger.qs.f(this.f36789a).c(this, org.telegram.messenger.qs.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25001i4);
        org.telegram.messenger.qs.f(this.f36789a).n(this, org.telegram.messenger.qs.L2);
    }

    public void setDelegate(mw0 mw0Var) {
        this.f36793c = mw0Var;
    }

    public void setDirection(int i7) {
        if (this.h != i7) {
            this.h = i7;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i7) {
        this.f36800n = i7;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.f6 f6Var = this.f36791b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.qf, f6Var));
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.qf, f6Var);
        if (this.F == null || this.G != w02) {
            this.G = w02;
            this.F = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.k6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.F;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.k6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.k6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.F;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.k6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        bi.e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
