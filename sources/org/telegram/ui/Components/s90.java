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
public abstract class s90 extends FrameLayout implements org.telegram.messenger.fs {
    public static final int V = 0;
    public final Rect E;
    public Paint F;
    public Integer G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final lo K;
    public r1.g L;
    public boolean M;
    public float N;
    public boolean O;
    public int P;
    public ArrayList Q;
    public final o90 R;
    public fh.g S;
    public final Path T;
    public final RectF U;
    public final org.telegram.ui.ActionBar.i6 f39534a;
    public final r90 f39535b;
    public final jg.i0 f39536c;
    public final l90 d;
    public final jg.n1 f39537e;
    public final jg.h1 f39538f;
    public final org.telegram.ui.ActionBar.g2 h;
    public float f39539n;
    public float f39540r;
    public float f39541s;
    public float f39542w;
    public fi.g4 f39543x;
    public p90 f39544y;

    public s90(Context context, long j3, long j10, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.E = new Rect();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = new lo(this, 27);
        this.M = false;
        this.N = 0.0f;
        this.O = false;
        this.R = new o90(this);
        this.T = new Path();
        this.U = new RectF();
        this.h = g2Var;
        this.f39534a = i6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.f39542w = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f24226q.y * 0.22f);
        r90 r90Var = new r90(this, context, i6Var);
        this.f39535b = r90Var;
        jg.i0 i0Var = new jg.i0((Object) this, 3);
        this.f39536c = i0Var;
        i0Var.j1(1);
        l90 l90Var = new l90(this);
        this.d = l90Var;
        l90Var.O = new m90(this);
        v4.l lVar = new v4.l();
        lVar.f59318c = 150L;
        lVar.f59319e = 150L;
        lVar.f59320f = 150L;
        lVar.f59321g = 150L;
        lVar.d = 150L;
        lVar.f59296o = kr.f36858f;
        lVar.C = false;
        r90Var.setItemAnimator(lVar);
        r90Var.setClipToPadding(false);
        r90Var.setLayoutManager(i0Var);
        jg.h1 h1Var = new jg.h1(context, j3, j10, new n90(this, g2Var), i6Var, h());
        this.f39538f = h1Var;
        ?? i0Var2 = new v4.i0();
        i0Var2.d = null;
        i0Var2.f17695f = false;
        jg.m1 m1Var = new jg.m1(i0Var2, 0);
        i0Var2.f17693c = h1Var;
        h1Var.B(m1Var);
        this.f39537e = i0Var2;
        r90Var.setAdapter(i0Var2);
        r90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
        addView(r90Var, c8.na.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i7;
        l90 l90Var;
        jg.h1 h1Var;
        int height;
        r90 r90Var = this.f39535b;
        if (r90Var != null && this.f39536c != null) {
            boolean g10 = g();
            this.f39541s = 0.0f;
            jg.n1 n1Var = this.f39537e;
            if (g10) {
                if (n1Var.f17695f) {
                    height = n1Var.f17694e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, r90Var.getTranslationY() + height) + this.f39541s, (1.0f - this.N) * getHeight());
                this.f39539n = 0.0f;
                this.f39540r = min;
            } else {
                if (n1Var.f17695f) {
                    i7 = n1Var.f17694e.getBottom();
                } else {
                    i7 = 0;
                }
                this.f39539n = Math.max(Math.max(0.0f, r90Var.getTranslationY() + i7) - this.f39541s, this.N * getHeight());
                this.f39540r = getMeasuredHeight();
            }
            fh.g gVar = this.S;
            if (gVar != null) {
                gVar.setBounds(0, ((int) this.f39539n) - org.telegram.messenger.g0.L(5.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + ((int) this.f39540r));
                Path path = this.T;
                path.rewind();
                Rect rect = this.S.R.f11640m;
                RectF rectF = this.U;
                rectF.set(rect);
                if (r90Var != null && (l90Var = this.d) != null && r90Var.getLayoutManager() == l90Var && (h1Var = this.f39538f) != null && h1Var.S != null) {
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
        l90 l90Var;
        jg.h1 h1Var;
        r90 r90Var = this.f39535b;
        if (r90Var != null && this.f39536c != null) {
            int i10 = 0;
            if (r90Var != null && (l90Var = this.d) != null && r90Var.getLayoutManager() == l90Var && (h1Var = this.f39538f) != null && h1Var.S != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.S == null) {
                r90Var.setPadding(0, 0, 0, 0);
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
            r90Var.setPadding(L, i7, L2, i10);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f39539n;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25247l4) {
            org.telegram.messenger.g0.d0(this.f39535b, new fi.e(14));
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
        jg.h1 h1Var = this.f39538f;
        if ((h1Var.N() || h1Var.S != null) && ((h1Var.f17628y0 || h1Var.B0 != null) && h1Var.I() == null && h1Var.V == null)) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        this.f39541s = org.telegram.messenger.g0.L(i7 + 2);
        canvas.save();
        float L = org.telegram.messenger.g0.L(6.0f);
        float f10 = this.f39539n;
        jg.n1 n1Var = this.f39537e;
        r90 r90Var = this.f39535b;
        Rect rect = this.E;
        if (g10) {
            if (n1Var.f17695f) {
                height = n1Var.f17694e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, r90Var.getTranslationY() + height) + this.f39541s, (1.0f - this.N) * getHeight());
            this.f39539n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f39540r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(L, Math.abs(getMeasuredHeight() - this.f39540r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (r90Var.getLayoutManager() == this.d) {
                this.f39541s += org.telegram.messenger.g0.L(2.0f);
                L += org.telegram.messenger.g0.L(2.0f);
            }
            if (n1Var.f17695f) {
                i10 = n1Var.f17694e.getBottom();
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, r90Var.getTranslationY() + i10) - this.f39541s;
            this.f39539n = max;
            float max2 = Math.max(max, this.N * getHeight());
            this.f39539n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f39540r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(L, Math.abs(this.f39539n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.f39539n) > 0.1f) {
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
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Je, this.f39534a);
        }
        paint2.setColor(w02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f39540r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.F);
    }

    public final boolean g() {
        v4.p0 layoutManager = this.f39535b.getLayoutManager();
        jg.i0 i0Var = this.f39536c;
        if (layoutManager == i0Var && i0Var.f59204t) {
            return true;
        }
        return false;
    }

    public jg.h1 getAdapter() {
        return this.f39538f;
    }

    public v4.c0 getCurrentLayoutManager() {
        v4.p0 layoutManager = this.f39535b.getLayoutManager();
        jg.i0 i0Var = this.f39536c;
        if (layoutManager == i0Var) {
            return i0Var;
        }
        return this.d;
    }

    public r90 getListView() {
        return this.f39535b;
    }

    public v4.c0 getNeededLayoutManager() {
        jg.h1 h1Var = this.f39538f;
        if ((!h1Var.N() && h1Var.S == null) || (!h1Var.f17628y0 && h1Var.B0 == null)) {
            return this.f39536c;
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
                r90 r90Var = this.f39535b;
                v4.p0 layoutManager = r90Var.getLayoutManager();
                jg.i0 i0Var = this.f39536c;
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
                        computeVerticalScrollOffset = -(this.f39542w + org.telegram.messenger.g0.L(12.0f));
                    } else {
                        computeVerticalScrollOffset = r90Var.computeVerticalScrollOffset() + this.f39542w;
                    }
                    r90Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.I = false;
        }
        this.J = z10;
        lo loVar = this.K;
        org.telegram.messenger.g0.r(loVar);
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
        org.telegram.messenger.g0.h3(loVar, j3);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
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

    public final void p(p90 p90Var) {
        this.f39544y = p90Var;
        r90 listView = getListView();
        fi.g4 g4Var = new fi.g4(12, this, p90Var);
        this.f39543x = g4Var;
        listView.setOnItemClickListener(g4Var);
        getListView().setOnTouchListener(new ok(this, 4));
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
        jg.h1 h1Var = this.f39538f;
        if (h1Var.f17611n != j3) {
            h1Var.f17611n = j3;
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
            this.f39536c.k1(z10);
            jg.h1 h1Var = this.f39538f;
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
