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
public class ax0 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public cp0 I;
    public int J;
    public String K;
    public int L;
    public String[] M;
    public Runnable N;
    public long O;
    public Path P;
    public Path Q;
    public Paint R;
    public d6 S;
    public d6 T;
    public d6 U;
    public d6 V;
    public org.telegram.messenger.g6 W;
    public final int f33639a;
    public float f33640a0;
    public final org.telegram.ui.ActionBar.h6 f33641b;
    public Integer f33642b0;
    public yw0 f33643c;
    public Integer f33644c0;
    public bi.e3 d;
    public float f33645d0;
    public xw0 f33646e;
    public d6 f33647e0;
    public org.telegram.ui.l4 f33648f;
    public d6 f33649f0;
    public d6 f33650g0;
    public int h;
    public int f33651n;
    public ww0 f33652r;
    public boolean f33653s;
    public boolean f33654w;
    public ArrayList f33655x;
    public boolean f33656y;

    public ax0(Context context, int i7, org.telegram.ui.rj rjVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = 0;
        this.f33651n = org.telegram.messenger.g0.L(10.0f);
        this.O = 0L;
        this.f33639a = i7;
        this.f33643c = rjVar;
        this.f33641b = h6Var;
        postDelayed(new jg.x(i7, 11), 260L);
    }

    public org.telegram.ui.ls getPreviewDelegate() {
        if (this.f33652r == null) {
            this.f33652r = new ww0(this);
        }
        return this.f33652r;
    }

    public final void c() {
        if (this.f33646e == null) {
            this.P = new Path();
            this.Q = new Path();
            bi.e3 e3Var = new bi.e3(29, getContext(), this);
            this.d = e3Var;
            nr nrVar = nr.h;
            this.S = new d6(e3Var, 120L, 350L, nrVar);
            this.T = new d6(this.d, 150L, 600L, nrVar);
            new OvershootInterpolator(0.4f);
            this.U = new d6(this.d, 300L, nrVar);
            this.V = new d6(this.d, 300L, nrVar);
            this.f33647e0 = new d6(this.d, 200L, nrVar);
            this.f33649f0 = new d6(this.d, 350L, nrVar);
            this.f33650g0 = new d6(this.d, 350L, nrVar);
            xw0 xw0Var = new xw0(this, getContext());
            this.f33646e = xw0Var;
            org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
            this.f33648f = l4Var;
            xw0Var.setAdapter(l4Var);
            getContext();
            v4.c0 c0Var = new v4.c0();
            c0Var.j1(0);
            this.f33646e.setLayoutManager(c0Var);
            v4.k kVar = new v4.k();
            kVar.n(45L);
            kVar.f59208o = nrVar;
            this.f33646e.setItemAnimator(kVar);
            org.telegram.ui.ActionBar.t6.J(this.f33646e, org.telegram.ui.ActionBar.m6.f29470i6, this.f33641b);
            xw0 xw0Var2 = this.f33646e;
            o oVar = new o(this, 17);
            xw0Var2.setOnItemClickListener(oVar);
            this.f33646e.setOnTouchListener(new hi.p1(3, this, oVar));
            this.d.addView(this.f33646e, c8.ma.c(52.0f, -1));
            addView(this.d, c8.ma.a(-1.0f, 66.66f, 80));
            yw0 yw0Var = this.f33643c;
            if (yw0Var != null) {
                yw0Var.e(new ah.j(this, 26));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.L2) {
            ArrayList arrayList = this.f33655x;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i7 == org.telegram.messenger.ks.f25176l4 && this.f33646e != null) {
            for (int i11 = 0; i11 < this.f33646e.getChildCount(); i11++) {
                this.f33646e.getChildAt(i11).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xw0 xw0Var = this.f33646e;
        if (xw0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.f33650g0.f34391c;
        float f11 = this.f33649f0.f34391c;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = f10 / 2.0f;
        rectF.set(this.f33646e.getTranslationX() + (f11 - f12) + xw0Var.getPaddingLeft(), this.f33646e.getPaddingTop() + this.f33646e.getTop(), Math.min(this.f33646e.getTranslationX() + f11 + f12 + this.f33646e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f33646e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f33653s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        cp0 cp0Var = this.I;
        if (cp0Var != null) {
            org.telegram.messenger.g0.r(cp0Var);
        }
        cp0 cp0Var2 = new cp0(this, 12);
        this.I = cp0Var2;
        org.telegram.messenger.g0.h3(cp0Var2, 16L);
    }

    public final void f() {
        cp0 cp0Var = this.I;
        if (cp0Var != null) {
            org.telegram.messenger.g0.r(cp0Var);
            this.I = null;
        }
        this.f33653s = false;
        this.f33654w = true;
        bi.e3 e3Var = this.d;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    public yw0 getDelegate() {
        return this.f33643c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f33653s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25176l4);
        org.telegram.messenger.ks.f(this.f33639a).c(this, org.telegram.messenger.ks.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25176l4);
        org.telegram.messenger.ks.f(this.f33639a).n(this, org.telegram.messenger.ks.L2);
    }

    public void setDelegate(yw0 yw0Var) {
        this.f33643c = yw0Var;
    }

    public void setDirection(int i7) {
        if (this.h != i7) {
            this.h = i7;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i7) {
        this.f33651n = i7;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.R;
        org.telegram.ui.ActionBar.h6 h6Var = this.f33641b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29683tf, h6Var));
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29683tf, h6Var);
        if (this.G == null || this.H != w02) {
            this.H = w02;
            this.G = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.m6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.G;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.m6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.m6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.G;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.m6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        bi.e3 e3Var = this.d;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
