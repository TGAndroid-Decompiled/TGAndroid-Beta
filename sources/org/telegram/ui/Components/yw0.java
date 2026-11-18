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
public class yw0 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public ap0 I;
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
    public final int f42643a;
    public float f42644a0;
    public final org.telegram.ui.ActionBar.i6 f42645b;
    public Integer f42646b0;
    public ww0 f42647c;
    public Integer f42648c0;
    public bi.a3 d;
    public float f42649d0;
    public vw0 f42650e;
    public c6 f42651e0;
    public org.telegram.ui.l4 f42652f;
    public c6 f42653f0;
    public c6 f42654g0;
    public int h;
    public int f42655n;
    public uw0 f42656r;
    public boolean f42657s;
    public boolean f42658w;
    public ArrayList f42659x;
    public boolean f42660y;

    public yw0(Context context, int i7, org.telegram.ui.rj rjVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = 0;
        this.f42655n = org.telegram.messenger.g0.L(10.0f);
        this.O = 0L;
        this.f42643a = i7;
        this.f42647c = rjVar;
        this.f42645b = i6Var;
        postDelayed(new jg.x(i7, 11), 260L);
    }

    public org.telegram.ui.ls getPreviewDelegate() {
        if (this.f42656r == null) {
            this.f42656r = new uw0(this);
        }
        return this.f42656r;
    }

    public final void c() {
        if (this.f42650e == null) {
            this.P = new Path();
            this.Q = new Path();
            bi.a3 a3Var = new bi.a3(29, getContext(), this);
            this.d = a3Var;
            lr lrVar = lr.h;
            this.S = new c6(a3Var, 120L, 350L, lrVar);
            this.T = new c6(this.d, 150L, 600L, lrVar);
            new OvershootInterpolator(0.4f);
            this.U = new c6(this.d, 300L, lrVar);
            this.V = new c6(this.d, 300L, lrVar);
            this.f42651e0 = new c6(this.d, 200L, lrVar);
            this.f42653f0 = new c6(this.d, 350L, lrVar);
            this.f42654g0 = new c6(this.d, 350L, lrVar);
            vw0 vw0Var = new vw0(this, getContext());
            this.f42650e = vw0Var;
            org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(6, this, this);
            this.f42652f = l4Var;
            vw0Var.setAdapter(l4Var);
            getContext();
            v4.c0 c0Var = new v4.c0();
            c0Var.j1(0);
            this.f42650e.setLayoutManager(c0Var);
            v4.k kVar = new v4.k();
            kVar.n(45L);
            kVar.f59170o = lrVar;
            this.f42650e.setItemAnimator(kVar);
            org.telegram.ui.ActionBar.u6.J(this.f42650e, org.telegram.ui.ActionBar.n6.f29486i6, this.f42645b);
            vw0 vw0Var2 = this.f42650e;
            n nVar = new n(this, 17);
            vw0Var2.setOnItemClickListener(nVar);
            this.f42650e.setOnTouchListener(new hi.p1(3, this, nVar));
            this.d.addView(this.f42650e, c8.ma.c(52.0f, -1));
            addView(this.d, c8.ma.a(-1.0f, 66.66f, 80));
            ww0 ww0Var = this.f42647c;
            if (ww0Var != null) {
                ww0Var.e(new ah.j(this, 26));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.L2) {
            ArrayList arrayList = this.f42659x;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i7 == org.telegram.messenger.ks.f25148l4 && this.f42650e != null) {
            for (int i11 = 0; i11 < this.f42650e.getChildCount(); i11++) {
                this.f42650e.getChildAt(i11).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vw0 vw0Var = this.f42650e;
        if (vw0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.f42654g0.f33892c;
        float f11 = this.f42653f0.f33892c;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = f10 / 2.0f;
        rectF.set(this.f42650e.getTranslationX() + (f11 - f12) + vw0Var.getPaddingLeft(), this.f42650e.getPaddingTop() + this.f42650e.getTop(), Math.min(this.f42650e.getTranslationX() + f11 + f12 + this.f42650e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f42650e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f42657s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        ap0 ap0Var = this.I;
        if (ap0Var != null) {
            org.telegram.messenger.g0.r(ap0Var);
        }
        ap0 ap0Var2 = new ap0(this, 12);
        this.I = ap0Var2;
        org.telegram.messenger.g0.h3(ap0Var2, 16L);
    }

    public final void f() {
        ap0 ap0Var = this.I;
        if (ap0Var != null) {
            org.telegram.messenger.g0.r(ap0Var);
            this.I = null;
        }
        this.f42657s = false;
        this.f42658w = true;
        bi.a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.invalidate();
        }
    }

    public ww0 getDelegate() {
        return this.f42647c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f42657s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25148l4);
        org.telegram.messenger.ks.f(this.f42643a).c(this, org.telegram.messenger.ks.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25148l4);
        org.telegram.messenger.ks.f(this.f42643a).n(this, org.telegram.messenger.ks.L2);
    }

    public void setDelegate(ww0 ww0Var) {
        this.f42647c = ww0Var;
    }

    public void setDirection(int i7) {
        if (this.h != i7) {
            this.h = i7;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i7) {
        this.f42655n = i7;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.R;
        org.telegram.ui.ActionBar.i6 i6Var = this.f42645b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29699tf, i6Var));
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29699tf, i6Var);
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
        bi.a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
