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
public abstract class v90 extends FrameLayout implements org.telegram.messenger.fs {
    public static final int V = 0;
    public final Rect E;
    public Paint F;
    public Integer G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final oo K;
    public r1.g L;
    public boolean M;
    public float N;
    public boolean O;
    public int P;
    public ArrayList Q;
    public final r90 R;
    public fh.g S;
    public final Path T;
    public final RectF U;
    public final org.telegram.ui.ActionBar.h6 f40741a;
    public final u90 f40742b;
    public final jg.i0 f40743c;
    public final o90 d;
    public final jg.n1 f40744e;
    public final jg.h1 f40745f;
    public final org.telegram.ui.ActionBar.g2 h;
    public float f40746n;
    public float f40747r;
    public float f40748s;
    public float f40749w;
    public fi.g4 f40750x;
    public s90 f40751y;

    public v90(Context context, long j3, long j10, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.E = new Rect();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = new oo(this, 27);
        this.M = false;
        this.N = 0.0f;
        this.O = false;
        this.R = new r90(this);
        this.T = new Path();
        this.U = new RectF();
        this.h = g2Var;
        this.f40741a = h6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.f40749w = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f24146q.y * 0.22f);
        u90 u90Var = new u90(this, context, h6Var);
        this.f40742b = u90Var;
        jg.i0 i0Var = new jg.i0((Object) this, 3);
        this.f40743c = i0Var;
        i0Var.j1(1);
        o90 o90Var = new o90(this);
        this.d = o90Var;
        o90Var.O = new p90(this);
        v4.k kVar = new v4.k();
        kVar.f59234c = 150L;
        kVar.f59235e = 150L;
        kVar.f59236f = 150L;
        kVar.f59237g = 150L;
        kVar.d = 150L;
        kVar.f59208o = nr.f37956f;
        kVar.C = false;
        u90Var.setItemAnimator(kVar);
        u90Var.setClipToPadding(false);
        u90Var.setLayoutManager(i0Var);
        jg.h1 h1Var = new jg.h1(context, j3, j10, new q90(this, g2Var), h6Var, h());
        this.f40745f = h1Var;
        ?? i0Var2 = new v4.i0();
        i0Var2.d = null;
        i0Var2.f17624f = false;
        jg.m1 m1Var = new jg.m1(i0Var2, 0);
        i0Var2.f17622c = h1Var;
        h1Var.B(m1Var);
        this.f40744e = i0Var2;
        u90Var.setAdapter(i0Var2);
        u90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
        addView(u90Var, c8.ma.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i7;
        o90 o90Var;
        jg.h1 h1Var;
        int height;
        u90 u90Var = this.f40742b;
        if (u90Var != null && this.f40743c != null) {
            boolean g10 = g();
            this.f40748s = 0.0f;
            jg.n1 n1Var = this.f40744e;
            if (g10) {
                if (n1Var.f17624f) {
                    height = n1Var.f17623e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, u90Var.getTranslationY() + height) + this.f40748s, (1.0f - this.N) * getHeight());
                this.f40746n = 0.0f;
                this.f40747r = min;
            } else {
                if (n1Var.f17624f) {
                    i7 = n1Var.f17623e.getBottom();
                } else {
                    i7 = 0;
                }
                this.f40746n = Math.max(Math.max(0.0f, u90Var.getTranslationY() + i7) - this.f40748s, this.N * getHeight());
                this.f40747r = getMeasuredHeight();
            }
            fh.g gVar = this.S;
            if (gVar != null) {
                gVar.setBounds(0, ((int) this.f40746n) - org.telegram.messenger.g0.L(5.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + ((int) this.f40747r));
                Path path = this.T;
                path.rewind();
                Rect rect = this.S.R.f11675m;
                RectF rectF = this.U;
                rectF.set(rect);
                if (u90Var != null && (o90Var = this.d) != null && u90Var.getLayoutManager() == o90Var && (h1Var = this.f40745f) != null && h1Var.S != null) {
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
        o90 o90Var;
        jg.h1 h1Var;
        u90 u90Var = this.f40742b;
        if (u90Var != null && this.f40743c != null) {
            int i10 = 0;
            if (u90Var != null && (o90Var = this.d) != null && u90Var.getLayoutManager() == o90Var && (h1Var = this.f40745f) != null && h1Var.S != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.S == null) {
                u90Var.setPadding(0, 0, 0, 0);
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
            u90Var.setPadding(L, i7, L2, i10);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f40746n;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25176l4) {
            org.telegram.messenger.g0.d0(this.f40742b, new fi.e(14));
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
        jg.h1 h1Var = this.f40745f;
        if ((h1Var.N() || h1Var.S != null) && ((h1Var.f17557y0 || h1Var.B0 != null) && h1Var.I() == null && h1Var.V == null)) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        this.f40748s = org.telegram.messenger.g0.L(i7 + 2);
        canvas.save();
        float L = org.telegram.messenger.g0.L(6.0f);
        float f10 = this.f40746n;
        jg.n1 n1Var = this.f40744e;
        u90 u90Var = this.f40742b;
        Rect rect = this.E;
        if (g10) {
            if (n1Var.f17624f) {
                height = n1Var.f17623e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, u90Var.getTranslationY() + height) + this.f40748s, (1.0f - this.N) * getHeight());
            this.f40746n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f40747r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(L, Math.abs(getMeasuredHeight() - this.f40747r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (u90Var.getLayoutManager() == this.d) {
                this.f40748s += org.telegram.messenger.g0.L(2.0f);
                L += org.telegram.messenger.g0.L(2.0f);
            }
            if (n1Var.f17624f) {
                i10 = n1Var.f17623e.getBottom();
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, u90Var.getTranslationY() + i10) - this.f40748s;
            this.f40746n = max;
            float max2 = Math.max(max, this.N * getHeight());
            this.f40746n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f40747r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(L, Math.abs(this.f40746n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.f40746n) > 0.1f) {
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
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Je, this.f40741a);
        }
        paint2.setColor(w02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f40747r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.F);
    }

    public final boolean g() {
        v4.p0 layoutManager = this.f40742b.getLayoutManager();
        jg.i0 i0Var = this.f40743c;
        if (layoutManager == i0Var && i0Var.f59118t) {
            return true;
        }
        return false;
    }

    public jg.h1 getAdapter() {
        return this.f40745f;
    }

    public v4.c0 getCurrentLayoutManager() {
        v4.p0 layoutManager = this.f40742b.getLayoutManager();
        jg.i0 i0Var = this.f40743c;
        if (layoutManager == i0Var) {
            return i0Var;
        }
        return this.d;
    }

    public u90 getListView() {
        return this.f40742b;
    }

    public v4.c0 getNeededLayoutManager() {
        jg.h1 h1Var = this.f40745f;
        if ((!h1Var.N() && h1Var.S == null) || (!h1Var.f17557y0 && h1Var.B0 == null)) {
            return this.f40743c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof fi.k2;
    }

    public final void o(boolean z10) {
        long j3;
        float computeVerticalScrollOffset;
        int i7;
        if (z10) {
            boolean g10 = g();
            if (!this.J) {
                this.I = true;
                u90 u90Var = this.f40742b;
                v4.p0 layoutManager = u90Var.getLayoutManager();
                jg.i0 i0Var = this.f40743c;
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
                        computeVerticalScrollOffset = -(this.f40749w + org.telegram.messenger.g0.L(12.0f));
                    } else {
                        computeVerticalScrollOffset = u90Var.computeVerticalScrollOffset() + this.f40749w;
                    }
                    u90Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.I = false;
        }
        this.J = z10;
        oo ooVar = this.K;
        org.telegram.messenger.g0.r(ooVar);
        r1.g gVar = this.L;
        if (gVar != null) {
            gVar.d();
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.h;
        if (g2Var != null && g2Var.getFragmentBeginToShow()) {
            j3 = 0;
        } else {
            j3 = 100;
        }
        org.telegram.messenger.g0.h3(ooVar, j3);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25176l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25176l4);
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

    public final void p(s90 s90Var) {
        this.f40751y = s90Var;
        u90 listView = getListView();
        fi.g4 g4Var = new fi.g4(12, this, s90Var);
        this.f40750x = g4Var;
        listView.setOnItemClickListener(g4Var);
        getListView().setOnTouchListener(new qk(this, 4));
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
        jg.h1 h1Var = this.f40745f;
        if (h1Var.f17540n != j3) {
            h1Var.f17540n = j3;
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
            this.f40743c.k1(z10);
            jg.h1 h1Var = this.f40745f;
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
