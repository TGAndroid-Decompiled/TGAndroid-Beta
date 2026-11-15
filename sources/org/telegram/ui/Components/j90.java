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
public abstract class j90 extends FrameLayout implements org.telegram.messenger.is {
    public static final int V = 0;
    public final Rect E;
    public Paint F;
    public Integer G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final fo K;
    public r1.g L;
    public boolean M;
    public float N;
    public boolean O;
    public int P;
    public ArrayList Q;
    public final f90 R;
    public fh.g S;
    public final Path T;
    public final RectF U;
    public final org.telegram.ui.ActionBar.e6 f35919a;
    public final i90 f35920b;
    public final jg.i0 f35921c;
    public final c90 d;
    public final jg.n1 f35922e;
    public final jg.h1 f35923f;
    public final org.telegram.ui.ActionBar.e2 h;
    public float f35924n;
    public float f35925r;
    public float f35926s;
    public float f35927w;
    public fi.i4 f35928x;
    public g90 f35929y;

    public j90(Context context, long j3, long j10, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = new Rect();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = new fo(this, 27);
        this.M = false;
        this.N = 0.0f;
        this.O = false;
        this.R = new f90(this);
        this.T = new Path();
        this.U = new RectF();
        this.h = e2Var;
        this.f35919a = e6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.f35927w = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f23611q.y * 0.22f);
        i90 i90Var = new i90(this, context, e6Var);
        this.f35920b = i90Var;
        jg.i0 i0Var = new jg.i0((Object) this, 3);
        this.f35921c = i0Var;
        i0Var.j1(1);
        c90 c90Var = new c90(this);
        this.d = c90Var;
        c90Var.O = new d90(this);
        v4.k kVar = new v4.k();
        kVar.f58608c = 150L;
        kVar.f58609e = 150L;
        kVar.f58610f = 150L;
        kVar.f58611g = 150L;
        kVar.d = 150L;
        kVar.f58586o = er.f34419f;
        kVar.C = false;
        i90Var.setItemAnimator(kVar);
        i90Var.setClipToPadding(false);
        i90Var.setLayoutManager(i0Var);
        jg.h1 h1Var = new jg.h1(context, j3, j10, new e90(this, e2Var), e6Var, h());
        this.f35923f = h1Var;
        ?? h0Var = new v4.h0();
        h0Var.d = null;
        h0Var.f17216f = false;
        jg.m1 m1Var = new jg.m1(h0Var, 0);
        h0Var.f17214c = h1Var;
        h1Var.B(m1Var);
        this.f35922e = h0Var;
        i90Var.setAdapter(h0Var);
        i90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
        addView(i90Var, c8.ja.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i7;
        c90 c90Var;
        jg.h1 h1Var;
        int height;
        i90 i90Var = this.f35920b;
        if (i90Var != null && this.f35921c != null) {
            boolean g10 = g();
            this.f35926s = 0.0f;
            jg.n1 n1Var = this.f35922e;
            if (g10) {
                if (n1Var.f17216f) {
                    height = n1Var.f17215e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, i90Var.getTranslationY() + height) + this.f35926s, (1.0f - this.N) * getHeight());
                this.f35924n = 0.0f;
                this.f35925r = min;
            } else {
                if (n1Var.f17216f) {
                    i7 = n1Var.f17215e.getBottom();
                } else {
                    i7 = 0;
                }
                this.f35924n = Math.max(Math.max(0.0f, i90Var.getTranslationY() + i7) - this.f35926s, this.N * getHeight());
                this.f35925r = getMeasuredHeight();
            }
            fh.g gVar = this.S;
            if (gVar != null) {
                gVar.setBounds(0, ((int) this.f35924n) - org.telegram.messenger.g0.L(5.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + ((int) this.f35925r));
                Path path = this.T;
                path.rewind();
                Rect rect = this.S.R.f11329m;
                RectF rectF = this.U;
                rectF.set(rect);
                if (i90Var != null && (c90Var = this.d) != null && i90Var.getLayoutManager() == c90Var && (h1Var = this.f35923f) != null && h1Var.S != null) {
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
        boolean z10;
        float f10;
        int i7;
        c90 c90Var;
        jg.h1 h1Var;
        i90 i90Var = this.f35920b;
        if (i90Var != null && this.f35921c != null) {
            int i10 = 0;
            if (i90Var != null && (c90Var = this.d) != null && i90Var.getLayoutManager() == c90Var && (h1Var = this.f35923f) != null && h1Var.S != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.S == null) {
                i90Var.setPadding(0, 0, 0, 0);
                return;
            }
            float f11 = 5.0f;
            if (z10) {
                f10 = 7.0f;
            } else {
                f10 = 5.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (z10) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            } else {
                i7 = 0;
            }
            if (z10) {
                f11 = 7.0f;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            if (z10) {
                i10 = org.telegram.messenger.g0.L(2.0f);
            }
            i90Var.setPadding(L, i7, L2, i10);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f35924n;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25515i4) {
            org.telegram.messenger.g0.d0(this.f35920b, new fi.e(14));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        float min;
        int w02;
        int height;
        fh.g gVar = this.S;
        if (gVar != null) {
            gVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.T);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        jg.h1 h1Var = this.f35923f;
        if ((h1Var.N() || h1Var.S != null) && ((h1Var.f17149y0 || h1Var.B0 != null) && h1Var.I() == null && h1Var.V == null)) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        this.f35926s = org.telegram.messenger.g0.L(i7 + 2);
        canvas.save();
        float L = org.telegram.messenger.g0.L(6.0f);
        float f10 = this.f35924n;
        jg.n1 n1Var = this.f35922e;
        i90 i90Var = this.f35920b;
        Rect rect = this.E;
        if (g10) {
            if (n1Var.f17216f) {
                height = n1Var.f17215e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, i90Var.getTranslationY() + height) + this.f35926s, (1.0f - this.N) * getHeight());
            this.f35924n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f35925r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(L, Math.abs(getMeasuredHeight() - this.f35925r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (i90Var.getLayoutManager() == this.d) {
                this.f35926s += org.telegram.messenger.g0.L(2.0f);
                L += org.telegram.messenger.g0.L(2.0f);
            }
            if (n1Var.f17216f) {
                i10 = n1Var.f17215e.getBottom();
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, i90Var.getTranslationY() + i10) - this.f35926s;
            this.f35924n = max;
            float max2 = Math.max(max, this.N * getHeight());
            this.f35924n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f35925r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(L, Math.abs(this.f35924n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.f35924n) > 0.1f) {
            i();
        }
        if (this.F == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.F;
        Integer num = this.G;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Je, this.f35919a);
        }
        paint2.setColor(w02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f35925r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.F);
    }

    public final boolean g() {
        v4.o0 layoutManager = this.f35920b.getLayoutManager();
        jg.i0 i0Var = this.f35921c;
        if (layoutManager == i0Var && i0Var.f58494t) {
            return true;
        }
        return false;
    }

    public jg.h1 getAdapter() {
        return this.f35923f;
    }

    public v4.b0 getCurrentLayoutManager() {
        v4.o0 layoutManager = this.f35920b.getLayoutManager();
        jg.i0 i0Var = this.f35921c;
        if (layoutManager == i0Var) {
            return i0Var;
        }
        return this.d;
    }

    public i90 getListView() {
        return this.f35920b;
    }

    public v4.b0 getNeededLayoutManager() {
        jg.h1 h1Var = this.f35923f;
        if ((!h1Var.N() && h1Var.S == null) || (!h1Var.f17149y0 && h1Var.B0 == null)) {
            return this.f35921c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof fi.m2;
    }

    public final void o(boolean z10) {
        long j3;
        float computeVerticalScrollOffset;
        int i7;
        if (z10) {
            boolean g10 = g();
            if (!this.J) {
                this.I = true;
                i90 i90Var = this.f35920b;
                v4.o0 layoutManager = i90Var.getLayoutManager();
                jg.i0 i0Var = this.f35921c;
                if (layoutManager == i0Var) {
                    if (g10) {
                        i7 = -100000;
                    } else {
                        i7 = 100000;
                    }
                    i0Var.h1(0, i7);
                }
                if (getVisibility() == 8) {
                    this.N = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.f35927w + org.telegram.messenger.g0.L(12.0f));
                    } else {
                        computeVerticalScrollOffset = i90Var.computeVerticalScrollOffset() + this.f35927w;
                    }
                    i90Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.I = false;
        }
        this.J = z10;
        fo foVar = this.K;
        org.telegram.messenger.g0.r(foVar);
        r1.g gVar = this.L;
        if (gVar != null) {
            gVar.d();
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.h;
        if (e2Var != null && e2Var.getFragmentBeginToShow()) {
            j3 = 0;
        } else {
            j3 = 100;
        }
        org.telegram.messenger.g0.i3(foVar, j3);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25515i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25515i4);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        c();
        super.onMeasure(i7, i10);
    }

    public final void p(g90 g90Var) {
        this.f35929y = g90Var;
        i90 listView = getListView();
        fi.i4 i4Var = new fi.i4(12, this, g90Var);
        this.f35928x = i4Var;
        listView.setOnItemClickListener(i4Var);
        getListView().setOnTouchListener(new hk(this, 4));
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(fh.g gVar) {
        this.S = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.S.q(org.telegram.messenger.g0.L(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        jg.h1 h1Var = this.f35923f;
        if (h1Var.f17132n != j3) {
            h1Var.f17132n = j3;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.H = z10;
    }

    public void setOverrideColor(int i7) {
        this.G = Integer.valueOf(i7);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.I = true;
            this.f35921c.k1(z10);
            jg.h1 h1Var = this.f35923f;
            if (h1Var.M0 != z10) {
                h1Var.M0 = z10;
                int i7 = h1Var.N0;
                if (i7 > 0) {
                    h1Var.g(0);
                }
                if (i7 > 1) {
                    h1Var.g(i7 - 1);
                }
            }
        }
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z10) {
    }

    public void n(boolean z10) {
    }

    public void i() {
    }

    public void j() {
    }

    public void m() {
    }
}
