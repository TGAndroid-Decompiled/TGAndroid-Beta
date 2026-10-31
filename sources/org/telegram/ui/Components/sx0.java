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
public class sx0 extends FrameLayout implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public uo0 H;
    public int I;
    public String J;
    public int K;
    public String[] L;
    public Runnable M;
    public long N;
    public Path O;
    public Path P;
    public Paint Q;
    public t5 R;
    public t5 S;
    public t5 T;
    public t5 U;
    public org.telegram.messenger.h6 V;
    public float W;
    public final int f30368a;
    public Integer f30369a0;
    public final org.telegram.ui.ActionBar.p6 f30370b;
    public Integer f30371b0;
    public qx0 f30372c;
    public float f30373c0;
    public jg.l0 d;
    public t5 f30374d0;
    public px0 e;
    public t5 f30375e0;
    public fg.j f30376f;
    public t5 f30377f0;
    public int h;
    public int f30378n;
    public ox0 f30379r;
    public boolean f30380s;
    public boolean f30381w;
    public ArrayList f30382x;
    public boolean f30383y;

    public sx0(Context context, int i10, org.telegram.ui.mk mkVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = 0;
        this.f30378n = org.telegram.messenger.i0.L(10.0f);
        this.N = 0L;
        this.f30368a = i10;
        this.f30372c = mkVar;
        this.f30370b = p6Var;
        postDelayed(new org.telegram.messenger.wd(i10, 9), 260L);
    }

    public static boolean a(sx0 sx0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.lt.p().r(motionEvent, sx0Var.e, kVar, sx0Var.getPreviewDelegate(), sx0Var.f30370b);
    }

    public org.telegram.ui.jt getPreviewDelegate() {
        if (this.f30379r == null) {
            this.f30379r = new ox0(this);
        }
        return this.f30379r;
    }

    public final void c() {
        if (this.e == null) {
            this.O = new Path();
            this.P = new Path();
            jg.l0 l0Var = new jg.l0(this, getContext(), 27);
            this.d = l0Var;
            gr grVar = gr.h;
            this.R = new t5(l0Var, 120L, 350L, grVar);
            this.S = new t5(this.d, 150L, 600L, grVar);
            new OvershootInterpolator(0.4f);
            this.T = new t5(this.d, 300L, grVar);
            this.U = new t5(this.d, 300L, grVar);
            this.f30374d0 = new t5(this.d, 200L, grVar);
            this.f30375e0 = new t5(this.d, 350L, grVar);
            this.f30377f0 = new t5(this.d, 350L, grVar);
            px0 px0Var = new px0(this, getContext());
            this.e = px0Var;
            fg.j jVar = new fg.j(7, this, this);
            this.f30376f = jVar;
            px0Var.setAdapter(jVar);
            getContext();
            s4.a0 a0Var = new s4.a0();
            a0Var.j1(0);
            this.e.setLayoutManager(a0Var);
            s4.j jVar2 = new s4.j();
            jVar2.n(45L);
            jVar2.f47945o = grVar;
            this.e.setItemAnimator(jVar2);
            org.telegram.ui.ActionBar.a7.K(this.e, org.telegram.ui.ActionBar.t6.f21020i6, this.f30370b);
            px0 px0Var2 = this.e;
            k kVar = new k(this, 17);
            px0Var2.setOnItemClickListener(kVar);
            this.e.setOnTouchListener(new org.telegram.ui.ActionBar.d1(3, this, kVar));
            this.d.addView(this.e, w7.b6.c(52.0f, -1));
            addView(this.d, w7.b6.a(-1.0f, 66.66f, 80));
            qx0 qx0Var = this.f30372c;
            if (qx0Var != null) {
                qx0Var.d(new ag.a1(this, 18));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.L2) {
            ArrayList arrayList = this.f30382x;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == org.telegram.messenger.zs.f19630i4 && this.e != null) {
            for (int i12 = 0; i12 < this.e.getChildCount(); i12++) {
                this.e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        px0 px0Var = this.e;
        if (px0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f30377f0.f30445c;
        float f10 = this.f30375e0.f30445c;
        RectF rectF = org.telegram.messenger.i0.P;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + px0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f30380s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        uo0 uo0Var = this.H;
        if (uo0Var != null) {
            org.telegram.messenger.i0.r(uo0Var);
        }
        uo0 uo0Var2 = new uo0(this, 14);
        this.H = uo0Var2;
        org.telegram.messenger.i0.h3(uo0Var2, 16L);
    }

    public final void f() {
        uo0 uo0Var = this.H;
        if (uo0Var != null) {
            org.telegram.messenger.i0.r(uo0Var);
            this.H = null;
        }
        this.f30380s = false;
        this.f30381w = true;
        jg.l0 l0Var = this.d;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public qx0 getDelegate() {
        return this.f30372c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f30380s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
        org.telegram.messenger.zs.f(this.f30368a).c(this, org.telegram.messenger.zs.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
        org.telegram.messenger.zs.f(this.f30368a).n(this, org.telegram.messenger.zs.L2);
    }

    public void setDelegate(qx0 qx0Var) {
        this.f30372c = qx0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f30378n = i10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.p6 p6Var = this.f30370b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.qf, p6Var));
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.qf, p6Var);
        if (this.F == null || this.G != w02) {
            this.G = w02;
            this.F = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.t6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.F;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.t6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.t6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.F;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.t6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        jg.l0 l0Var = this.d;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
