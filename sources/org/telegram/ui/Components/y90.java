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
public abstract class y90 extends FrameLayout implements org.telegram.messenger.vs {
    public static final int U = 0;
    public final Rect D;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final ho J;
    public o1.j K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final u90 Q;
    public vg.f R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.p6 f32780a;
    public final x90 f32781b;
    public final org.telegram.ui.br f32782c;
    public final r90 d;
    public final zf.c1 e;
    public final zf.x0 f32783f;
    public final org.telegram.ui.ActionBar.k2 h;
    public float f32784n;
    public float f32785r;
    public float f32786s;
    public float f32787w;
    public mg.q0 f32788x;
    public v90 f32789y;

    public y90(Context context, long j10, long j11, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.D = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new ho(this, 28);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new u90(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = k2Var;
        this.f32780a = p6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.f32787w = (int) Math.min(org.telegram.messenger.i0.L(126.0f), org.telegram.messenger.i0.f16172q.y * 0.22f);
        x90 x90Var = new x90(this, context, p6Var);
        this.f32781b = x90Var;
        org.telegram.ui.br brVar = new org.telegram.ui.br(2, this, false);
        this.f32782c = brVar;
        brVar.j1(1);
        r90 r90Var = new r90(this);
        this.d = r90Var;
        r90Var.O = new s90(this);
        s4.j jVar = new s4.j();
        jVar.f47978c = 150L;
        jVar.e = 150L;
        jVar.f47979f = 150L;
        jVar.f47980g = 150L;
        jVar.d = 150L;
        jVar.f47956o = gr.f26523f;
        jVar.C = false;
        x90Var.setItemAnimator(jVar);
        x90Var.setClipToPadding(false);
        x90Var.setLayoutManager(brVar);
        zf.x0 x0Var = new zf.x0(context, j10, j11, new t90(this, k2Var), p6Var, h());
        this.f32783f = x0Var;
        ?? g0Var = new s4.g0();
        g0Var.d = null;
        g0Var.f55481f = false;
        yj0 yj0Var = new yj0(g0Var, 2);
        g0Var.f55480c = x0Var;
        x0Var.B(yj0Var);
        this.e = g0Var;
        x90Var.setAdapter(g0Var);
        x90Var.setTranslationY(org.telegram.messenger.i0.L(6.0f));
        addView(x90Var, w7.b6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        r90 r90Var;
        zf.x0 x0Var;
        int height;
        x90 x90Var = this.f32781b;
        if (x90Var != null && this.f32782c != null) {
            boolean g10 = g();
            this.f32786s = 0.0f;
            zf.c1 c1Var = this.e;
            if (g10) {
                if (c1Var.f55481f) {
                    height = c1Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, x90Var.getTranslationY() + height) + this.f32786s, (1.0f - this.M) * getHeight());
                this.f32784n = 0.0f;
                this.f32785r = min;
            } else {
                if (c1Var.f55481f) {
                    i10 = c1Var.e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f32784n = Math.max(Math.max(0.0f, x90Var.getTranslationY() + i10) - this.f32786s, this.M * getHeight());
                this.f32785r = getMeasuredHeight();
            }
            vg.f fVar = this.R;
            if (fVar != null) {
                fVar.setBounds(0, ((int) this.f32784n) - org.telegram.messenger.i0.L(5.0f), getMeasuredWidth(), org.telegram.messenger.i0.L(5.0f) + ((int) this.f32785r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.P.f50854m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (x90Var != null && (r90Var = this.d) != null && x90Var.getLayoutManager() == r90Var && (x0Var = this.f32783f) != null && x0Var.R != null) {
                    rectF.inset(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
                    path.addRoundRect(rectF, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), Path.Direction.CW);
                } else {
                    path.addRoundRect(rectF, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f), Path.Direction.CW);
                }
                path.close();
                invalidate();
            }
        }
    }

    public final void c() {
        boolean z10;
        float f7;
        int i10;
        r90 r90Var;
        zf.x0 x0Var;
        x90 x90Var = this.f32781b;
        if (x90Var != null && this.f32782c != null) {
            int i11 = 0;
            if (x90Var != null && (r90Var = this.d) != null && x90Var.getLayoutManager() == r90Var && (x0Var = this.f32783f) != null && x0Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                x90Var.setPadding(0, 0, 0, 0);
                return;
            }
            float f10 = 5.0f;
            if (z10) {
                f7 = 7.0f;
            } else {
                f7 = 5.0f;
            }
            int L = org.telegram.messenger.i0.L(f7);
            if (z10) {
                i10 = org.telegram.messenger.i0.L(2.0f);
            } else {
                i10 = 0;
            }
            if (z10) {
                f10 = 7.0f;
            }
            int L2 = org.telegram.messenger.i0.L(f10);
            if (z10) {
                i11 = org.telegram.messenger.i0.L(2.0f);
            }
            x90Var.setPadding(L, i10, L2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f32784n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14726i4) {
            org.telegram.messenger.i0.d0(this.f32781b, new ag.z0(12));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int w02;
        int height;
        vg.f fVar = this.R;
        if (fVar != null) {
            fVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        zf.x0 x0Var = this.f32783f;
        if ((x0Var.N() || x0Var.R != null) && ((x0Var.f55692x0 || x0Var.A0 != null) && x0Var.I() == null && x0Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f32786s = org.telegram.messenger.i0.L(i10 + 2);
        canvas.save();
        float L = org.telegram.messenger.i0.L(6.0f);
        float f7 = this.f32784n;
        zf.c1 c1Var = this.e;
        x90 x90Var = this.f32781b;
        Rect rect = this.D;
        if (g10) {
            if (c1Var.f55481f) {
                height = c1Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, x90Var.getTranslationY() + height) + this.f32786s, (1.0f - this.M) * getHeight());
            this.f32784n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f32785r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(L, Math.abs(getMeasuredHeight() - this.f32785r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (x90Var.getLayoutManager() == this.d) {
                this.f32786s += org.telegram.messenger.i0.L(2.0f);
                L += org.telegram.messenger.i0.L(2.0f);
            }
            if (c1Var.f55481f) {
                i11 = c1Var.e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, x90Var.getTranslationY() + i11) - this.f32786s;
            this.f32784n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f32784n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f32785r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(L, Math.abs(this.f32784n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f32784n) > 0.1f) {
            i();
        }
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.E = paint;
            paint.setShadowLayer(org.telegram.messenger.i0.L(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.E;
        Integer num = this.F;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ge, this.f32780a);
        }
        paint2.setColor(w02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f32785r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.n0 layoutManager = this.f32781b.getLayoutManager();
        org.telegram.ui.br brVar = this.f32782c;
        if (layoutManager == brVar && brVar.f47884t) {
            return true;
        }
        return false;
    }

    public zf.x0 getAdapter() {
        return this.f32783f;
    }

    public s4.a0 getCurrentLayoutManager() {
        s4.n0 layoutManager = this.f32781b.getLayoutManager();
        org.telegram.ui.br brVar = this.f32782c;
        if (layoutManager == brVar) {
            return brVar;
        }
        return this.d;
    }

    public x90 getListView() {
        return this.f32781b;
    }

    public s4.a0 getNeededLayoutManager() {
        zf.x0 x0Var = this.f32783f;
        if ((!x0Var.N() && x0Var.R == null) || (!x0Var.f55692x0 && x0Var.A0 == null)) {
            return this.f32782c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof th.v1;
    }

    public final void o(boolean z10) {
        long j10;
        float computeVerticalScrollOffset;
        int i10;
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                x90 x90Var = this.f32781b;
                s4.n0 layoutManager = x90Var.getLayoutManager();
                org.telegram.ui.br brVar = this.f32782c;
                if (layoutManager == brVar) {
                    if (g10) {
                        i10 = -100000;
                    } else {
                        i10 = 100000;
                    }
                    brVar.h1(0, i10);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.f32787w + org.telegram.messenger.i0.L(12.0f));
                    } else {
                        computeVerticalScrollOffset = x90Var.computeVerticalScrollOffset() + this.f32787w;
                    }
                    x90Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        ho hoVar = this.J;
        org.telegram.messenger.i0.r(hoVar);
        o1.j jVar = this.K;
        if (jVar != null) {
            jVar.d();
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.h;
        if (k2Var != null && k2Var.getFragmentBeginToShow()) {
            j10 = 0;
        } else {
            j10 = 100;
        }
        org.telegram.messenger.i0.h3(hoVar, j10);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    public final void p(v90 v90Var) {
        this.f32789y = v90Var;
        x90 listView = getListView();
        mg.q0 q0Var = new mg.q0(11, this, v90Var);
        this.f32788x = q0Var;
        listView.setOnItemClickListener(q0Var);
        getListView().setOnTouchListener(new bk(this, 4));
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(vg.f fVar) {
        this.R = fVar;
        fVar.q(org.telegram.messenger.i0.L(22.0f));
        this.R.p(org.telegram.messenger.i0.L(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        zf.x0 x0Var = this.f32783f;
        if (x0Var.f55677n != j10) {
            x0Var.f55677n = j10;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.G = z10;
    }

    public void setOverrideColor(int i10) {
        this.F = Integer.valueOf(i10);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.H = true;
            this.f32782c.k1(z10);
            zf.x0 x0Var = this.f32783f;
            if (x0Var.L0 != z10) {
                x0Var.L0 = z10;
                int i10 = x0Var.M0;
                if (i10 > 0) {
                    x0Var.g(0);
                }
                if (i10 > 1) {
                    x0Var.g(i10 - 1);
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
