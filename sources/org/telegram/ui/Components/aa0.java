package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public abstract class aa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int Q = 0;
    public Paint A;
    public Integer B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final lp F;
    public o1.j G;
    public boolean H;
    public float I;
    public boolean J;
    public int K;
    public ArrayList L;
    public final w90 M;
    public lg.d N;
    public final Path O;
    public final RectF P;

    public final org.telegram.ui.ActionBar.c6 f26699a;

    public final z90 f26700b;

    public final org.telegram.ui.vq f26701c;
    public final t90 d;

    public final pf.z0 f26702e;

    public final pf.u0 f26703f;
    public final org.telegram.ui.ActionBar.n2 h;

    public float f26704n;

    public float f26705r;

    public float f26706s;
    public float v;

    public cg.x0 f26707w;

    public x90 f26708x;

    public final Rect f26709y;

    public aa0(Context context, long j10, long j11, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26709y = new Rect();
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = new lp(this, 27);
        this.H = false;
        this.I = 0.0f;
        this.J = false;
        this.M = new w90(this);
        this.O = new Path();
        this.P = new RectF();
        this.h = n2Var;
        this.f26699a = c6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        z90 z90Var = new z90(this, context, c6Var);
        this.f26700b = z90Var;
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((Object) this, 2);
        this.f26701c = vqVar;
        vqVar.j1(1);
        t90 t90Var = new t90(this);
        this.d = t90Var;
        t90Var.O = new u90(this);
        f2.l lVar = new f2.l();
        lVar.f5842c = 150L;
        lVar.f5843e = 150L;
        lVar.f5844f = 150L;
        lVar.f5845g = 150L;
        lVar.d = 150L;
        lVar.f5737o = er.f28122f;
        lVar.C = false;
        z90Var.setItemAnimator(lVar);
        z90Var.setClipToPadding(false);
        z90Var.setLayoutManager(vqVar);
        pf.u0 u0Var = new pf.u0(context, j10, j11, new v90(this, n2Var), c6Var, h());
        this.f26703f = u0Var;
        pf.z0 z0Var = new pf.z0();
        z0Var.d = null;
        z0Var.f46015f = false;
        f2.g1 g1Var = new f2.g1(z0Var, 2);
        z0Var.f46013c = u0Var;
        u0Var.B(g1Var);
        this.f26702e = z0Var;
        z90Var.setAdapter(z0Var);
        z90Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(z90Var, h7.z5.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        t90 t90Var;
        pf.u0 u0Var;
        z90 z90Var = this.f26700b;
        if (z90Var == null || this.f26701c == null) {
            return;
        }
        boolean zG = g();
        this.f26706s = 0.0f;
        pf.z0 z0Var = this.f26702e;
        if (zG) {
            float fMin = Math.min(Math.max(0.0f, z90Var.getTranslationY() + (z0Var.f46015f ? z0Var.f46014e.getTop() : getHeight())) + this.f26706s, (1.0f - this.I) * getHeight());
            this.f26704n = 0.0f;
            this.f26705r = fMin;
        } else {
            this.f26704n = Math.max(Math.max(0.0f, z90Var.getTranslationY() + (z0Var.f46015f ? z0Var.f46014e.getBottom() : 0)) - this.f26706s, this.I * getHeight());
            this.f26705r = getMeasuredHeight();
        }
        lg.d dVar = this.N;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.f26704n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f26705r));
            Path path = this.O;
            path.rewind();
            Rect rect = this.N.h.f15590m;
            RectF rectF = this.P;
            rectF.set(rect);
            if (z90Var == null || (t90Var = this.d) == null || z90Var.getLayoutManager() != t90Var || (u0Var = this.f26703f) == null || u0Var.N == null) {
                path.addRoundRect(rectF, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), Path.Direction.CW);
            } else {
                rectF.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
            }
            path.close();
            invalidate();
        }
    }

    public final void c() {
        t90 t90Var;
        pf.u0 u0Var;
        z90 z90Var = this.f26700b;
        if (z90Var == null || this.f26701c == null) {
            return;
        }
        boolean z10 = (z90Var == null || (t90Var = this.d) == null || z90Var.getLayoutManager() != t90Var || (u0Var = this.f26703f) == null || u0Var.N == null) ? false : true;
        if (this.N == null) {
            z90Var.setPadding(0, 0, 0, 0);
        } else {
            z90Var.setPadding(AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z10 ? 7.0f : 5.0f), z10 ? AndroidUtilities.dp(2.0f) : 0);
        }
    }

    public final float d() {
        if (getVisibility() == 0 && !g()) {
            return getMeasuredHeight() - this.f26704n;
        }
        return 0.0f;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f26700b, (d5.d) new j4.w0(8));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fMin;
        lg.d dVar = this.N;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.O);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean zG = g();
        pf.u0 u0Var = this.f26703f;
        this.f26706s = AndroidUtilities.dp((((u0Var.N() || u0Var.N != null) && (u0Var.f45945t0 || u0Var.f45949w0 != null) && u0Var.I() == null && u0Var.Q == null) ? 2 : 0) + 2);
        canvas.save();
        float fDp = AndroidUtilities.dp(6.0f);
        float f10 = this.f26704n;
        pf.z0 z0Var = this.f26702e;
        z90 z90Var = this.f26700b;
        Rect rect = this.f26709y;
        if (zG) {
            float fMin2 = Math.min(Math.max(0.0f, z90Var.getTranslationY() + (z0Var.f46015f ? z0Var.f46014e.getTop() : getHeight())) + this.f26706s, (1.0f - this.I) * getHeight());
            this.f26704n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f26705r = fMin2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) fMin2);
            fMin = Math.min(fDp, Math.abs(getMeasuredHeight() - this.f26705r));
            if (fMin > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) fMin;
            }
        } else {
            if (z90Var.getLayoutManager() == this.d) {
                this.f26706s += AndroidUtilities.dp(2.0f);
                fDp += AndroidUtilities.dp(2.0f);
            }
            float fMax = Math.max(0.0f, z90Var.getTranslationY() + (z0Var.f46015f ? z0Var.f46014e.getBottom() : 0)) - this.f26706s;
            this.f26704n = fMax;
            float fMax2 = Math.max(fMax, this.I * getHeight());
            this.f26704n = fMax2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f26705r = measuredHeight;
            rect.set(0, (int) fMax2, measuredWidth2, (int) measuredHeight);
            fMin = Math.min(fDp, Math.abs(this.f26704n));
            if (fMin > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) fMin;
            }
        }
        if (Math.abs(f10 - this.f26704n) > 0.1f) {
            i();
        }
        if (this.A == null) {
            Paint paint = new Paint(1);
            this.A = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.A;
        Integer num = this.B;
        paint2.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, this.f26699a));
        f(canvas, rect, fMin);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f26705r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.A);
    }

    public final boolean g() {
        f2.x0 layoutManager = this.f26700b.getLayoutManager();
        org.telegram.ui.vq vqVar = this.f26701c;
        return layoutManager == vqVar && vqVar.f5725t;
    }

    public pf.u0 getAdapter() {
        return this.f26703f;
    }

    public f2.k0 getCurrentLayoutManager() {
        f2.x0 layoutManager = this.f26700b.getLayoutManager();
        org.telegram.ui.vq vqVar = this.f26701c;
        return layoutManager == vqVar ? vqVar : this.d;
    }

    public z90 getListView() {
        return this.f26700b;
    }

    public f2.k0 getNeededLayoutManager() {
        pf.u0 u0Var = this.f26703f;
        return ((u0Var.N() || u0Var.N != null) && (u0Var.f45945t0 || u0Var.f45949w0 != null)) ? this.d : this.f26701c;
    }

    public boolean h() {
        return this instanceof jh.q2;
    }

    public final void o(boolean z10) {
        if (z10) {
            boolean zG = g();
            if (!this.E) {
                this.D = true;
                z90 z90Var = this.f26700b;
                f2.x0 layoutManager = z90Var.getLayoutManager();
                org.telegram.ui.vq vqVar = this.f26701c;
                if (layoutManager == vqVar) {
                    vqVar.h1(0, zG ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.I = 1.0f;
                    z90Var.setTranslationY(zG ? -(this.v + AndroidUtilities.dp(12.0f)) : z90Var.computeVerticalScrollOffset() + this.v);
                }
            }
            setVisibility(0);
        } else {
            this.D = false;
        }
        this.E = z10;
        lp lpVar = this.F;
        AndroidUtilities.cancelRunOnUIThread(lpVar);
        o1.j jVar = this.G;
        if (jVar != null) {
            jVar.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        AndroidUtilities.runOnUIThread(lpVar, (n2Var == null || !n2Var.getFragmentBeginToShow()) ? 100L : 0L);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
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

    public final void p(x90 x90Var) {
        this.f26708x = x90Var;
        z90 listView = getListView();
        cg.x0 x0Var = new cg.x0(14, this, x90Var);
        this.f26707w = x0Var;
        listView.setOnItemClickListener(x0Var);
        getListView().setOnTouchListener(new jr(this, 2));
    }

    @Override
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(lg.d dVar) {
        this.N = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.N.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        pf.u0 u0Var = this.f26703f;
        if (u0Var.f45936n != j10) {
            u0Var.f45936n = j10;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.C = z10;
    }

    public void setOverrideColor(int i10) {
        this.B = Integer.valueOf(i10);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.D = true;
            this.f26701c.k1(z10);
            pf.u0 u0Var = this.f26703f;
            if (u0Var.G0 != z10) {
                u0Var.G0 = z10;
                int i10 = u0Var.H0;
                if (i10 > 0) {
                    u0Var.m(0);
                }
                if (i10 > 1) {
                    u0Var.m(i10 - 1);
                }
            }
        }
    }

    public void i() {
    }

    public void j() {
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z10) {
    }

    public void m() {
    }

    public void n(boolean z10) {
    }
}
