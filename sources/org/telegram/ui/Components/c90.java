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
public abstract class c90 extends FrameLayout implements org.telegram.messenger.cs {
    public static final int V = 0;
    public final Rect E;
    public Paint F;
    public Integer G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final gp K;
    public q1.g L;
    public boolean M;
    public float N;
    public boolean O;
    public int P;
    public ArrayList Q;
    public final y80 R;
    public gh.g S;
    public final Path T;
    public final RectF U;
    public final org.telegram.ui.ActionBar.e6 f32610a;
    public final b90 f32611b;
    public final kg.f0 f32612c;
    public final v80 d;
    public final kg.k1 f32613e;
    public final kg.e1 f32614f;
    public final org.telegram.ui.ActionBar.d2 h;
    public float f32615n;
    public float f32616r;
    public float f32617s;
    public float f32618w;
    public ei.q4 f32619x;
    public z80 f32620y;

    public c90(Context context, long j10, long j11, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = new Rect();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = new gp(this, 25);
        this.M = false;
        this.N = 0.0f;
        this.O = false;
        this.R = new y80(this);
        this.T = new Path();
        this.U = new RectF();
        this.h = d2Var;
        this.f32610a = e6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.f32618w = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f22608q.y * 0.22f);
        b90 b90Var = new b90(this, context, e6Var);
        this.f32611b = b90Var;
        kg.f0 f0Var = new kg.f0((Object) this, 3);
        this.f32612c = f0Var;
        f0Var.j1(1);
        v80 v80Var = new v80(this);
        this.d = v80Var;
        v80Var.O = new w80(this);
        u4.k kVar = new u4.k();
        kVar.f55616c = 150L;
        kVar.f55617e = 150L;
        kVar.f55618f = 150L;
        kVar.f55619g = 150L;
        kVar.d = 150L;
        kVar.f55597o = xq.f40452f;
        kVar.C = false;
        b90Var.setItemAnimator(kVar);
        b90Var.setClipToPadding(false);
        b90Var.setLayoutManager(f0Var);
        kg.e1 e1Var = new kg.e1(context, j10, j11, new x80(this, d2Var), e6Var, h());
        this.f32614f = e1Var;
        ?? h0Var = new u4.h0();
        h0Var.d = null;
        h0Var.f17077f = false;
        kg.j1 j1Var = new kg.j1(h0Var, 0);
        h0Var.f17075c = e1Var;
        e1Var.B(j1Var);
        this.f32613e = h0Var;
        b90Var.setAdapter(h0Var);
        b90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
        addView(b90Var, b8.mf.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i3;
        v80 v80Var;
        kg.e1 e1Var;
        int height;
        b90 b90Var = this.f32611b;
        if (b90Var != null && this.f32612c != null) {
            boolean g7 = g();
            this.f32617s = 0.0f;
            kg.k1 k1Var = this.f32613e;
            if (g7) {
                if (k1Var.f17077f) {
                    height = k1Var.f17076e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, b90Var.getTranslationY() + height) + this.f32617s, (1.0f - this.N) * getHeight());
                this.f32615n = 0.0f;
                this.f32616r = min;
            } else {
                if (k1Var.f17077f) {
                    i3 = k1Var.f17076e.getBottom();
                } else {
                    i3 = 0;
                }
                this.f32615n = Math.max(Math.max(0.0f, b90Var.getTranslationY() + i3) - this.f32617s, this.N * getHeight());
                this.f32616r = getMeasuredHeight();
            }
            gh.g gVar = this.S;
            if (gVar != null) {
                gVar.setBounds(0, ((int) this.f32615n) - org.telegram.messenger.g0.L(5.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + ((int) this.f32616r));
                Path path = this.T;
                path.rewind();
                Rect rect = this.S.R.f12309m;
                RectF rectF = this.U;
                rectF.set(rect);
                if (b90Var != null && (v80Var = this.d) != null && b90Var.getLayoutManager() == v80Var && (e1Var = this.f32614f) != null && e1Var.S != null) {
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
        int i3;
        v80 v80Var;
        kg.e1 e1Var;
        b90 b90Var = this.f32611b;
        if (b90Var != null && this.f32612c != null) {
            int i10 = 0;
            if (b90Var != null && (v80Var = this.d) != null && b90Var.getLayoutManager() == v80Var && (e1Var = this.f32614f) != null && e1Var.S != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.S == null) {
                b90Var.setPadding(0, 0, 0, 0);
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
                i3 = org.telegram.messenger.g0.L(2.0f);
            } else {
                i3 = 0;
            }
            if (z10) {
                f11 = 7.0f;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            if (z10) {
                i10 = org.telegram.messenger.g0.L(2.0f);
            }
            b90Var.setPadding(L, i3, L2, i10);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f32615n;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            org.telegram.messenger.g0.d0(this.f32611b, new ei.e(13));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        int i10;
        float min;
        int w02;
        int height;
        gh.g gVar = this.S;
        if (gVar != null) {
            gVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.T);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g7 = g();
        kg.e1 e1Var = this.f32614f;
        if ((e1Var.N() || e1Var.S != null) && ((e1Var.f17022y0 || e1Var.B0 != null) && e1Var.I() == null && e1Var.V == null)) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        this.f32617s = org.telegram.messenger.g0.L(i3 + 2);
        canvas.save();
        float L = org.telegram.messenger.g0.L(6.0f);
        float f10 = this.f32615n;
        kg.k1 k1Var = this.f32613e;
        b90 b90Var = this.f32611b;
        Rect rect = this.E;
        if (g7) {
            if (k1Var.f17077f) {
                height = k1Var.f17076e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, b90Var.getTranslationY() + height) + this.f32617s, (1.0f - this.N) * getHeight());
            this.f32615n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f32616r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(L, Math.abs(getMeasuredHeight() - this.f32616r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (b90Var.getLayoutManager() == this.d) {
                this.f32617s += org.telegram.messenger.g0.L(2.0f);
                L += org.telegram.messenger.g0.L(2.0f);
            }
            if (k1Var.f17077f) {
                i10 = k1Var.f17076e.getBottom();
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, b90Var.getTranslationY() + i10) - this.f32617s;
            this.f32615n = max;
            float max2 = Math.max(max, this.N * getHeight());
            this.f32615n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f32616r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(L, Math.abs(this.f32615n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.f32615n) > 0.1f) {
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
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ge, this.f32610a);
        }
        paint2.setColor(w02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f32616r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.F);
    }

    public final boolean g() {
        u4.o0 layoutManager = this.f32611b.getLayoutManager();
        kg.f0 f0Var = this.f32612c;
        if (layoutManager == f0Var && f0Var.f55514t) {
            return true;
        }
        return false;
    }

    public kg.e1 getAdapter() {
        return this.f32614f;
    }

    public u4.b0 getCurrentLayoutManager() {
        u4.o0 layoutManager = this.f32611b.getLayoutManager();
        kg.f0 f0Var = this.f32612c;
        if (layoutManager == f0Var) {
            return f0Var;
        }
        return this.d;
    }

    public b90 getListView() {
        return this.f32611b;
    }

    public u4.b0 getNeededLayoutManager() {
        kg.e1 e1Var = this.f32614f;
        if ((!e1Var.N() && e1Var.S == null) || (!e1Var.f17022y0 && e1Var.B0 == null)) {
            return this.f32612c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof ei.u2;
    }

    public final void o(boolean z10) {
        long j10;
        float computeVerticalScrollOffset;
        int i3;
        if (z10) {
            boolean g7 = g();
            if (!this.J) {
                this.I = true;
                b90 b90Var = this.f32611b;
                u4.o0 layoutManager = b90Var.getLayoutManager();
                kg.f0 f0Var = this.f32612c;
                if (layoutManager == f0Var) {
                    if (g7) {
                        i3 = -100000;
                    } else {
                        i3 = 100000;
                    }
                    f0Var.h1(0, i3);
                }
                if (getVisibility() == 8) {
                    this.N = 1.0f;
                    if (g7) {
                        computeVerticalScrollOffset = -(this.f32618w + org.telegram.messenger.g0.L(12.0f));
                    } else {
                        computeVerticalScrollOffset = b90Var.computeVerticalScrollOffset() + this.f32618w;
                    }
                    b90Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.I = false;
        }
        this.J = z10;
        gp gpVar = this.K;
        org.telegram.messenger.g0.r(gpVar);
        q1.g gVar = this.L;
        if (gVar != null) {
            gVar.d();
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.h;
        if (d2Var != null && d2Var.getFragmentBeginToShow()) {
            j10 = 0;
        } else {
            j10 = 100;
        }
        org.telegram.messenger.g0.i3(gpVar, j10);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        b();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        c();
        super.onMeasure(i3, i10);
    }

    public final void p(z80 z80Var) {
        this.f32620y = z80Var;
        b90 listView = getListView();
        ei.q4 q4Var = new ei.q4(12, this, z80Var);
        this.f32619x = q4Var;
        listView.setOnItemClickListener(q4Var);
        getListView().setOnTouchListener(new yj(this, 4));
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(gh.g gVar) {
        this.S = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.S.q(org.telegram.messenger.g0.L(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        kg.e1 e1Var = this.f32614f;
        if (e1Var.f17005n != j10) {
            e1Var.f17005n = j10;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.H = z10;
    }

    public void setOverrideColor(int i3) {
        this.G = Integer.valueOf(i3);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.I = true;
            this.f32612c.k1(z10);
            kg.e1 e1Var = this.f32614f;
            if (e1Var.M0 != z10) {
                e1Var.M0 = z10;
                int i3 = e1Var.N0;
                if (i3 > 0) {
                    e1Var.g(0);
                }
                if (i3 > 1) {
                    e1Var.g(i3 - 1);
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
