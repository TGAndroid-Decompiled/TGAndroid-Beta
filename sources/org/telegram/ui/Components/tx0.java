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
public class tx0 extends FrameLayout implements org.telegram.messenger.vs, org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public vo0 H;
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
    public final int f30728a;
    public Integer f30729a0;
    public final org.telegram.ui.ActionBar.p6 f30730b;
    public Integer f30731b0;
    public rx0 f30732c;
    public float f30733c0;
    public jg.l0 d;
    public t5 f30734d0;
    public qx0 e;
    public t5 f30735e0;
    public fg.j f30736f;
    public t5 f30737f0;
    public int h;
    public int f30738n;
    public px0 f30739r;
    public boolean f30740s;
    public boolean f30741w;
    public ArrayList f30742x;
    public boolean f30743y;

    public tx0(Context context, int i10, org.telegram.ui.mk mkVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = 0;
        this.f30738n = org.telegram.messenger.i0.L(10.0f);
        this.N = 0L;
        this.f30728a = i10;
        this.f30732c = mkVar;
        this.f30730b = p6Var;
        postDelayed(new org.telegram.messenger.xd(i10, 9), 260L);
    }

    public static boolean a(tx0 tx0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.kt.p().r(motionEvent, tx0Var.e, kVar, tx0Var.getPreviewDelegate(), tx0Var.f30730b);
    }

    public org.telegram.ui.ht getPreviewDelegate() {
        if (this.f30739r == null) {
            this.f30739r = new px0(this);
        }
        return this.f30739r;
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
            this.f30734d0 = new t5(this.d, 200L, grVar);
            this.f30735e0 = new t5(this.d, 350L, grVar);
            this.f30737f0 = new t5(this.d, 350L, grVar);
            qx0 qx0Var = new qx0(this, getContext());
            this.e = qx0Var;
            fg.j jVar = new fg.j(7, this, this);
            this.f30736f = jVar;
            qx0Var.setAdapter(jVar);
            getContext();
            s4.a0 a0Var = new s4.a0();
            a0Var.j1(0);
            this.e.setLayoutManager(a0Var);
            s4.j jVar2 = new s4.j();
            jVar2.n(45L);
            jVar2.f47956o = grVar;
            this.e.setItemAnimator(jVar2);
            org.telegram.ui.ActionBar.a7.K(this.e, org.telegram.ui.ActionBar.t6.f21021i6, this.f30730b);
            qx0 qx0Var2 = this.e;
            k kVar = new k(this, 17);
            qx0Var2.setOnItemClickListener(kVar);
            this.e.setOnTouchListener(new org.telegram.ui.ActionBar.d1(3, this, kVar));
            this.d.addView(this.e, w7.b6.c(52.0f, -1));
            addView(this.d, w7.b6.a(-1.0f, 66.66f, 80));
            rx0 rx0Var = this.f30732c;
            if (rx0Var != null) {
                rx0Var.d(new ag.a1(this, 18));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.L2) {
            ArrayList arrayList = this.f30742x;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == org.telegram.messenger.at.f14726i4 && this.e != null) {
            for (int i12 = 0; i12 < this.e.getChildCount(); i12++) {
                this.e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qx0 qx0Var = this.e;
        if (qx0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f30737f0.f30530c;
        float f10 = this.f30735e0.f30530c;
        RectF rectF = org.telegram.messenger.i0.P;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + qx0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f30740s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        vo0 vo0Var = this.H;
        if (vo0Var != null) {
            org.telegram.messenger.i0.r(vo0Var);
        }
        vo0 vo0Var2 = new vo0(this, 14);
        this.H = vo0Var2;
        org.telegram.messenger.i0.h3(vo0Var2, 16L);
    }

    public final void f() {
        vo0 vo0Var = this.H;
        if (vo0Var != null) {
            org.telegram.messenger.i0.r(vo0Var);
            this.H = null;
        }
        this.f30740s = false;
        this.f30741w = true;
        jg.l0 l0Var = this.d;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public rx0 getDelegate() {
        return this.f30732c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f30740s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.f(this.f30728a).c(this, org.telegram.messenger.at.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.f(this.f30728a).n(this, org.telegram.messenger.at.L2);
    }

    public void setDelegate(rx0 rx0Var) {
        this.f30732c = rx0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f30738n = i10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.p6 p6Var = this.f30730b;
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
