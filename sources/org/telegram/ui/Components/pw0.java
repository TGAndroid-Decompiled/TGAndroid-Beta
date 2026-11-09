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
public class pw0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.b6 {
    public boolean D;
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public kr0 H;
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
    public final int f37102a;
    public Integer f37103a0;
    public final org.telegram.ui.ActionBar.g6 f37104b;
    public Integer f37105b0;
    public nw0 f37106c;
    public float f37107c0;
    public bi.e5 d;
    public w5 f37108d0;
    public mw0 f37109e;
    public w5 f37110e0;
    public org.telegram.ui.l4 f37111f;
    public w5 f37112f0;
    public int h;
    public int f37113n;
    public lw0 f37114r;
    public boolean f37115s;
    public boolean f37116w;
    public ArrayList f37117x;
    public boolean f37118y;

    public pw0(Context context, int i7, org.telegram.ui.sj sjVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = 0;
        this.f37113n = org.telegram.messenger.g0.L(10.0f);
        this.N = 0L;
        this.f37102a = i7;
        this.f37106c = sjVar;
        this.f37104b = g6Var;
        postDelayed(new hi.j2(i7, 11), 260L);
    }

    public static boolean a(pw0 pw0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.ms.p().r(motionEvent, pw0Var.f37109e, kVar, pw0Var.getPreviewDelegate(), pw0Var.f37104b);
    }

    public org.telegram.ui.ks getPreviewDelegate() {
        if (this.f37114r == null) {
            this.f37114r = new lw0(this);
        }
        return this.f37114r;
    }

    public final void c() {
        if (this.f37109e == null) {
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
            this.f37108d0 = new w5(this.d, 200L, xqVar);
            this.f37110e0 = new w5(this.d, 350L, xqVar);
            this.f37112f0 = new w5(this.d, 350L, xqVar);
            mw0 mw0Var = new mw0(this, getContext());
            this.f37109e = mw0Var;
            org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
            this.f37111f = l4Var;
            mw0Var.setAdapter(l4Var);
            getContext();
            v4.b0 b0Var = new v4.b0();
            b0Var.j1(0);
            this.f37109e.setLayoutManager(b0Var);
            v4.k kVar = new v4.k();
            kVar.n(45L);
            kVar.f57112o = xqVar;
            this.f37109e.setItemAnimator(kVar);
            org.telegram.ui.ActionBar.s6.J(this.f37109e, org.telegram.ui.ActionBar.l6.f27957i6, this.f37104b);
            mw0 mw0Var2 = this.f37109e;
            k kVar2 = new k(this, 17);
            mw0Var2.setOnItemClickListener(kVar2);
            this.f37109e.setOnTouchListener(new fi.n1(4, this, kVar2));
            this.d.addView(this.f37109e, c8.ha.c(52.0f, -1));
            addView(this.d, c8.ha.a(-1.0f, 66.66f, 80));
            nw0 nw0Var = this.f37106c;
            if (nw0Var != null) {
                nw0Var.d(new ah.j(this, 23));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.L2) {
            ArrayList arrayList = this.f37117x;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i7 == org.telegram.messenger.qs.f25018i4 && this.f37109e != null) {
            for (int i11 = 0; i11 < this.f37109e.getChildCount(); i11++) {
                this.f37109e.getChildAt(i11).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mw0 mw0Var = this.f37109e;
        if (mw0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.f37112f0.f39910c;
        float f11 = this.f37110e0.f39910c;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = f10 / 2.0f;
        rectF.set(this.f37109e.getTranslationX() + (f11 - f12) + mw0Var.getPaddingLeft(), this.f37109e.getPaddingTop() + this.f37109e.getTop(), Math.min(this.f37109e.getTranslationX() + f11 + f12 + this.f37109e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f37109e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f37115s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        kr0 kr0Var = this.H;
        if (kr0Var != null) {
            org.telegram.messenger.g0.r(kr0Var);
        }
        kr0 kr0Var2 = new kr0(this, 9);
        this.H = kr0Var2;
        org.telegram.messenger.g0.i3(kr0Var2, 16L);
    }

    public final void f() {
        kr0 kr0Var = this.H;
        if (kr0Var != null) {
            org.telegram.messenger.g0.r(kr0Var);
            this.H = null;
        }
        this.f37115s = false;
        this.f37116w = true;
        bi.e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.invalidate();
        }
    }

    public nw0 getDelegate() {
        return this.f37106c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f37115s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
        org.telegram.messenger.qs.f(this.f37102a).c(this, org.telegram.messenger.qs.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
        org.telegram.messenger.qs.f(this.f37102a).n(this, org.telegram.messenger.qs.L2);
    }

    public void setDelegate(nw0 nw0Var) {
        this.f37106c = nw0Var;
    }

    public void setDirection(int i7) {
        if (this.h != i7) {
            this.h = i7;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i7) {
        this.f37113n = i7;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.g6 g6Var = this.f37104b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.qf, g6Var));
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.qf, g6Var);
        if (this.F == null || this.G != w02) {
            this.G = w02;
            this.F = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.l6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.F;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.l6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.l6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.F;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.l6.F4.setColorFilter(porterDuffColorFilter2);
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
