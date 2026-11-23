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
public class zw0 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public bp0 I;
    public int J;
    public String K;
    public int L;
    public String[] M;
    public Runnable N;
    public long O;
    public Path P;
    public Path Q;
    public Paint R;
    public c6 S;
    public c6 T;
    public c6 U;
    public c6 V;
    public org.telegram.messenger.g6 W;
    public final int f43054a;
    public float f43055a0;
    public final org.telegram.ui.ActionBar.i6 f43056b;
    public Integer f43057b0;
    public xw0 f43058c;
    public Integer f43059c0;
    public bi.g3 d;
    public float f43060d0;
    public ww0 f43061e;
    public c6 f43062e0;
    public org.telegram.ui.l4 f43063f;
    public c6 f43064f0;
    public c6 f43065g0;
    public int h;
    public int f43066n;
    public vw0 f43067r;
    public boolean f43068s;
    public boolean f43069w;
    public ArrayList f43070x;
    public boolean f43071y;

    public zw0(Context context, int i7, org.telegram.ui.rj rjVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = 0;
        this.f43066n = org.telegram.messenger.g0.L(10.0f);
        this.O = 0L;
        this.f43054a = i7;
        this.f43058c = rjVar;
        this.f43056b = i6Var;
        postDelayed(new jg.x(i7, 11), 260L);
    }

    public org.telegram.ui.ls getPreviewDelegate() {
        if (this.f43067r == null) {
            this.f43067r = new vw0(this);
        }
        return this.f43067r;
    }

    public final void c() {
        if (this.f43061e == null) {
            this.P = new Path();
            this.Q = new Path();
            bi.g3 g3Var = new bi.g3(29, getContext(), this);
            this.d = g3Var;
            kr krVar = kr.h;
            this.S = new c6(g3Var, 120L, 350L, krVar);
            this.T = new c6(this.d, 150L, 600L, krVar);
            new OvershootInterpolator(0.4f);
            this.U = new c6(this.d, 300L, krVar);
            this.V = new c6(this.d, 300L, krVar);
            this.f43062e0 = new c6(this.d, 200L, krVar);
            this.f43064f0 = new c6(this.d, 350L, krVar);
            this.f43065g0 = new c6(this.d, 350L, krVar);
            ww0 ww0Var = new ww0(this, getContext());
            this.f43061e = ww0Var;
            org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
            this.f43063f = l4Var;
            ww0Var.setAdapter(l4Var);
            getContext();
            v4.c0 c0Var = new v4.c0();
            c0Var.j1(0);
            this.f43061e.setLayoutManager(c0Var);
            v4.l lVar = new v4.l();
            lVar.n(45L);
            lVar.f59296o = krVar;
            this.f43061e.setItemAnimator(lVar);
            org.telegram.ui.ActionBar.u6.J(this.f43061e, org.telegram.ui.ActionBar.n6.f29543i6, this.f43056b);
            ww0 ww0Var2 = this.f43061e;
            n nVar = new n(this, 17);
            ww0Var2.setOnItemClickListener(nVar);
            this.f43061e.setOnTouchListener(new hi.x1(3, this, nVar));
            this.d.addView(this.f43061e, c8.na.c(52.0f, -1));
            addView(this.d, c8.na.a(-1.0f, 66.66f, 80));
            xw0 xw0Var = this.f43058c;
            if (xw0Var != null) {
                xw0Var.e(new ah.j(this, 26));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.L2) {
            ArrayList arrayList = this.f43070x;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i7 == org.telegram.messenger.ks.f25247l4 && this.f43061e != null) {
            for (int i11 = 0; i11 < this.f43061e.getChildCount(); i11++) {
                this.f43061e.getChildAt(i11).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ww0 ww0Var = this.f43061e;
        if (ww0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.f43065g0.f33931c;
        float f11 = this.f43064f0.f33931c;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = f10 / 2.0f;
        rectF.set(this.f43061e.getTranslationX() + (f11 - f12) + ww0Var.getPaddingLeft(), this.f43061e.getPaddingTop() + this.f43061e.getTop(), Math.min(this.f43061e.getTranslationX() + f11 + f12 + this.f43061e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f43061e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f43068s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        bp0 bp0Var = this.I;
        if (bp0Var != null) {
            org.telegram.messenger.g0.r(bp0Var);
        }
        bp0 bp0Var2 = new bp0(this, 12);
        this.I = bp0Var2;
        org.telegram.messenger.g0.h3(bp0Var2, 16L);
    }

    public final void f() {
        bp0 bp0Var = this.I;
        if (bp0Var != null) {
            org.telegram.messenger.g0.r(bp0Var);
            this.I = null;
        }
        this.f43068s = false;
        this.f43069w = true;
        bi.g3 g3Var = this.d;
        if (g3Var != null) {
            g3Var.invalidate();
        }
    }

    public xw0 getDelegate() {
        return this.f43058c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f43068s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
        org.telegram.messenger.ks.f(this.f43054a).c(this, org.telegram.messenger.ks.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
        org.telegram.messenger.ks.f(this.f43054a).n(this, org.telegram.messenger.ks.L2);
    }

    public void setDelegate(xw0 xw0Var) {
        this.f43058c = xw0Var;
    }

    public void setDirection(int i7) {
        if (this.h != i7) {
            this.h = i7;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i7) {
        this.f43066n = i7;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.R;
        org.telegram.ui.ActionBar.i6 i6Var = this.f43056b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29756tf, i6Var));
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29756tf, i6Var);
        if (this.G == null || this.H != w02) {
            this.H = w02;
            this.G = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.n6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.G;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.n6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.n6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.G;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.n6.F4.setColorFilter(porterDuffColorFilter2);
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
