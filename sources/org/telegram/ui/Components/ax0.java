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
public class ax0 extends FrameLayout implements org.telegram.messenger.gs, org.telegram.ui.ActionBar.b6 {
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
    public final int f33629a;
    public float f33630a0;
    public final org.telegram.ui.ActionBar.h6 f33631b;
    public Integer f33632b0;
    public yw0 f33633c;
    public Integer f33634c0;
    public bi.g3 d;
    public float f33635d0;
    public xw0 f33636e;
    public d6 f33637e0;
    public org.telegram.ui.l4 f33638f;
    public d6 f33639f0;
    public d6 f33640g0;
    public int h;
    public int f33641n;
    public ww0 f33642r;
    public boolean f33643s;
    public boolean f33644w;
    public ArrayList f33645x;
    public boolean f33646y;

    public ax0(Context context, int i7, org.telegram.ui.rj rjVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = 0;
        this.f33641n = org.telegram.messenger.g0.L(10.0f);
        this.O = 0L;
        this.f33629a = i7;
        this.f33633c = rjVar;
        this.f33631b = h6Var;
        postDelayed(new jg.x(i7, 11), 260L);
    }

    public org.telegram.ui.ls getPreviewDelegate() {
        if (this.f33642r == null) {
            this.f33642r = new ww0(this);
        }
        return this.f33642r;
    }

    public final void c() {
        if (this.f33636e == null) {
            this.P = new Path();
            this.Q = new Path();
            bi.g3 g3Var = new bi.g3(29, getContext(), this);
            this.d = g3Var;
            nr nrVar = nr.h;
            this.S = new d6(g3Var, 120L, 350L, nrVar);
            this.T = new d6(this.d, 150L, 600L, nrVar);
            new OvershootInterpolator(0.4f);
            this.U = new d6(this.d, 300L, nrVar);
            this.V = new d6(this.d, 300L, nrVar);
            this.f33637e0 = new d6(this.d, 200L, nrVar);
            this.f33639f0 = new d6(this.d, 350L, nrVar);
            this.f33640g0 = new d6(this.d, 350L, nrVar);
            xw0 xw0Var = new xw0(this, getContext());
            this.f33636e = xw0Var;
            org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
            this.f33638f = l4Var;
            xw0Var.setAdapter(l4Var);
            getContext();
            v4.b0 b0Var = new v4.b0();
            b0Var.j1(0);
            this.f33636e.setLayoutManager(b0Var);
            v4.k kVar = new v4.k();
            kVar.n(45L);
            kVar.f59161o = nrVar;
            this.f33636e.setItemAnimator(kVar);
            org.telegram.ui.ActionBar.t6.J(this.f33636e, org.telegram.ui.ActionBar.m6.f29439i6, this.f33631b);
            xw0 xw0Var2 = this.f33636e;
            o oVar = new o(this, 17);
            xw0Var2.setOnItemClickListener(oVar);
            this.f33636e.setOnTouchListener(new hi.o1(3, this, oVar));
            this.d.addView(this.f33636e, c8.na.c(52.0f, -1));
            addView(this.d, c8.na.a(-1.0f, 66.66f, 80));
            yw0 yw0Var = this.f33633c;
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
        if (i7 == org.telegram.messenger.ls.L2) {
            ArrayList arrayList = this.f33645x;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i7 == org.telegram.messenger.ls.f25306l4 && this.f33636e != null) {
            for (int i11 = 0; i11 < this.f33636e.getChildCount(); i11++) {
                this.f33636e.getChildAt(i11).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xw0 xw0Var = this.f33636e;
        if (xw0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.f33640g0.f34349c;
        float f11 = this.f33639f0.f34349c;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = f10 / 2.0f;
        rectF.set(this.f33636e.getTranslationX() + (f11 - f12) + xw0Var.getPaddingLeft(), this.f33636e.getPaddingTop() + this.f33636e.getTop(), Math.min(this.f33636e.getTranslationX() + f11 + f12 + this.f33636e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f33636e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f33643s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        this.f33643s = false;
        this.f33644w = true;
        bi.g3 g3Var = this.d;
        if (g3Var != null) {
            g3Var.invalidate();
        }
    }

    public yw0 getDelegate() {
        return this.f33633c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f33643s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25306l4);
        org.telegram.messenger.ls.f(this.f33629a).c(this, org.telegram.messenger.ls.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25306l4);
        org.telegram.messenger.ls.f(this.f33629a).n(this, org.telegram.messenger.ls.L2);
    }

    public void setDelegate(yw0 yw0Var) {
        this.f33633c = yw0Var;
    }

    public void setDirection(int i7) {
        if (this.h != i7) {
            this.h = i7;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i7) {
        this.f33641n = i7;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.R;
        org.telegram.ui.ActionBar.h6 h6Var = this.f33631b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29652tf, h6Var));
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29652tf, h6Var);
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
        bi.g3 g3Var = this.d;
        if (g3Var != null) {
            g3Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
