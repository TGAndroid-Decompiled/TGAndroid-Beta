package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class g90 extends FrameLayout implements org.telegram.messenger.ls {
    public static final int U = 0;
    public final Rect D;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final gp J;
    public r1.g K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final c90 Q;
    public fh.g R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.h6 f33846a;
    public final f90 f33847b;
    public final jg.i0 f33848c;
    public final z80 d;
    public final jg.o1 f33849e;
    public final jg.i1 f33850f;
    public final org.telegram.ui.ActionBar.f2 h;
    public float f33851n;
    public float f33852r;
    public float f33853s;
    public float f33854w;
    public di.q4 f33855x;
    public d90 f33856y;

    public g90(Context context, long j3, long j10, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.D = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new gp(this, 25);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new c90(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = f2Var;
        this.f33846a = h6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.f33854w = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f22567q.y * 0.22f);
        f90 f90Var = new f90(this, context, h6Var);
        this.f33847b = f90Var;
        jg.i0 i0Var = new jg.i0((Object) this, 3);
        this.f33848c = i0Var;
        i0Var.j1(1);
        z80 z80Var = new z80(this);
        this.d = z80Var;
        z80Var.O = new a90(this);
        v4.k kVar = new v4.k();
        kVar.f57124c = 150L;
        kVar.f57125e = 150L;
        kVar.f57126f = 150L;
        kVar.f57127g = 150L;
        kVar.d = 150L;
        kVar.f57108o = wq.f40046f;
        kVar.C = false;
        f90Var.setItemAnimator(kVar);
        f90Var.setClipToPadding(false);
        f90Var.setLayoutManager(i0Var);
        jg.i1 i1Var = new jg.i1(context, j3, j10, new b90(this, f2Var), h6Var, h());
        this.f33850f = i1Var;
        ?? g0Var = new v4.g0();
        g0Var.d = null;
        g0Var.f16878f = false;
        jg.n1 n1Var = new jg.n1(g0Var, 0);
        g0Var.f16876c = i1Var;
        i1Var.B(n1Var);
        this.f33849e = g0Var;
        f90Var.setAdapter(g0Var);
        f90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
        addView(f90Var, c8.ha.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i7;
        z80 z80Var;
        jg.i1 i1Var;
        int height;
        f90 f90Var = this.f33847b;
        if (f90Var != null && this.f33848c != null) {
            boolean g10 = g();
            this.f33853s = 0.0f;
            jg.o1 o1Var = this.f33849e;
            if (g10) {
                if (o1Var.f16878f) {
                    height = o1Var.f16877e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, f90Var.getTranslationY() + height) + this.f33853s, (1.0f - this.M) * getHeight());
                this.f33851n = 0.0f;
                this.f33852r = min;
            } else {
                if (o1Var.f16878f) {
                    i7 = o1Var.f16877e.getBottom();
                } else {
                    i7 = 0;
                }
                this.f33851n = Math.max(Math.max(0.0f, f90Var.getTranslationY() + i7) - this.f33853s, this.M * getHeight());
                this.f33852r = getMeasuredHeight();
            }
            fh.g gVar = this.R;
            if (gVar != null) {
                gVar.setBounds(0, ((int) this.f33851n) - org.telegram.messenger.g0.L(5.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + ((int) this.f33852r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.Q.f11520m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (f90Var != null && (z80Var = this.d) != null && f90Var.getLayoutManager() == z80Var && (i1Var = this.f33850f) != null && i1Var.R != null) {
                    rectF.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
                } else {
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f), Path.Direction.CW);
                }
                path.close();
                invalidate();
            }
        }
    }

    public final void c() {
        boolean z9;
        float f10;
        int i7;
        z80 z80Var;
        jg.i1 i1Var;
        f90 f90Var = this.f33847b;
        if (f90Var != null && this.f33848c != null) {
            int i10 = 0;
            if (f90Var != null && (z80Var = this.d) != null && f90Var.getLayoutManager() == z80Var && (i1Var = this.f33850f) != null && i1Var.R != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.R == null) {
                f90Var.setPadding(0, 0, 0, 0);
                return;
            }
            float f11 = 5.0f;
            if (z9) {
                f10 = 7.0f;
            } else {
                f10 = 5.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (z9) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            } else {
                i7 = 0;
            }
            if (z9) {
                f11 = 7.0f;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            if (z9) {
                i10 = org.telegram.messenger.g0.L(2.0f);
            }
            f90Var.setPadding(L, i7, L2, i10);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f33851n;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25022i4) {
            org.telegram.messenger.g0.d0(this.f33847b, new di.e(14));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        float min;
        int w02;
        int height;
        fh.g gVar = this.R;
        if (gVar != null) {
            gVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        jg.i1 i1Var = this.f33850f;
        if ((i1Var.N() || i1Var.R != null) && ((i1Var.f16804x0 || i1Var.A0 != null) && i1Var.I() == null && i1Var.U == null)) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        this.f33853s = org.telegram.messenger.g0.L(i7 + 2);
        canvas.save();
        float L = org.telegram.messenger.g0.L(6.0f);
        float f10 = this.f33851n;
        jg.o1 o1Var = this.f33849e;
        f90 f90Var = this.f33847b;
        Rect rect = this.D;
        if (g10) {
            if (o1Var.f16878f) {
                height = o1Var.f16877e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, f90Var.getTranslationY() + height) + this.f33853s, (1.0f - this.M) * getHeight());
            this.f33851n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f33852r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(L, Math.abs(getMeasuredHeight() - this.f33852r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (f90Var.getLayoutManager() == this.d) {
                this.f33853s += org.telegram.messenger.g0.L(2.0f);
                L += org.telegram.messenger.g0.L(2.0f);
            }
            if (o1Var.f16878f) {
                i10 = o1Var.f16877e.getBottom();
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, f90Var.getTranslationY() + i10) - this.f33853s;
            this.f33851n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f33851n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f33852r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(L, Math.abs(this.f33851n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.f33851n) > 0.1f) {
            i();
        }
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.E = paint;
            paint.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.E;
        Integer num = this.F;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ge, this.f33846a);
        }
        paint2.setColor(w02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f33852r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.E);
    }

    public final boolean g() {
        v4.n0 layoutManager = this.f33847b.getLayoutManager();
        jg.i0 i0Var = this.f33848c;
        if (layoutManager == i0Var && i0Var.f57026t) {
            return true;
        }
        return false;
    }

    public jg.i1 getAdapter() {
        return this.f33850f;
    }

    public v4.b0 getCurrentLayoutManager() {
        v4.n0 layoutManager = this.f33847b.getLayoutManager();
        jg.i0 i0Var = this.f33848c;
        if (layoutManager == i0Var) {
            return i0Var;
        }
        return this.d;
    }

    public f90 getListView() {
        return this.f33847b;
    }

    public v4.b0 getNeededLayoutManager() {
        jg.i1 i1Var = this.f33850f;
        if ((!i1Var.N() && i1Var.R == null) || (!i1Var.f16804x0 && i1Var.A0 == null)) {
            return this.f33848c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof di.q2;
    }

    public final void o(boolean z9) {
        long j3;
        float computeVerticalScrollOffset;
        int i7;
        if (z9) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                f90 f90Var = this.f33847b;
                v4.n0 layoutManager = f90Var.getLayoutManager();
                jg.i0 i0Var = this.f33848c;
                if (layoutManager == i0Var) {
                    if (g10) {
                        i7 = -100000;
                    } else {
                        i7 = 100000;
                    }
                    i0Var.h1(0, i7);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.f33854w + org.telegram.messenger.g0.L(12.0f));
                    } else {
                        computeVerticalScrollOffset = f90Var.computeVerticalScrollOffset() + this.f33854w;
                    }
                    f90Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z9;
        gp gpVar = this.J;
        org.telegram.messenger.g0.r(gpVar);
        r1.g gVar = this.K;
        if (gVar != null) {
            gVar.d();
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.h;
        if (f2Var != null && f2Var.getFragmentBeginToShow()) {
            j3 = 0;
        } else {
            j3 = 100;
        }
        org.telegram.messenger.g0.i3(gpVar, j3);
        if (z9) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25022i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25022i4);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        c();
        super.onMeasure(i7, i10);
    }

    public final void p(d90 d90Var) {
        this.f33856y = d90Var;
        f90 listView = getListView();
        di.q4 q4Var = new di.q4(12, this, d90Var);
        this.f33855x = q4Var;
        listView.setOnItemClickListener(q4Var);
        getListView().setOnTouchListener(new yj(this, 4));
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(fh.g gVar) {
        this.R = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.R.q(org.telegram.messenger.g0.L(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        jg.i1 i1Var = this.f33850f;
        if (i1Var.f16789n != j3) {
            i1Var.f16789n = j3;
        }
    }

    public void setIgnoreLayout(boolean z9) {
        this.G = z9;
    }

    public void setOverrideColor(int i7) {
        this.F = Integer.valueOf(i7);
        invalidate();
    }

    public void setReversed(boolean z9) {
        if (z9 != g()) {
            this.H = true;
            this.f33848c.k1(z9);
            jg.i1 i1Var = this.f33850f;
            if (i1Var.L0 != z9) {
                i1Var.L0 = z9;
                int i7 = i1Var.M0;
                if (i7 > 0) {
                    i1Var.g(0);
                }
                if (i7 > 1) {
                    i1Var.g(i7 - 1);
                }
            }
        }
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z9) {
    }

    public void n(boolean z9) {
    }

    public void i() {
    }

    public void j() {
    }

    public void m() {
    }
}
