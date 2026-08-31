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
public abstract class ra0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int R = 0;
    public Paint B;
    public Integer C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final xp G;
    public o1.j H;
    public boolean I;
    public float J;
    public boolean K;
    public int L;
    public ArrayList M;
    public final na0 N;
    public qg.b O;
    public final Path P;
    public final RectF Q;
    public final org.telegram.ui.ActionBar.g6 f30659a;
    public final qa0 f30660b;
    public final org.telegram.ui.cr f30661c;
    public final ka0 d;
    public final uf.z0 f30662e;
    public final uf.u0 f30663f;
    public final org.telegram.ui.ActionBar.p2 h;
    public float f30664n;
    public float f30665r;
    public float f30666s;
    public float v;
    public hg.v0 f30667w;
    public oa0 f30668x;
    public final Rect f30669y;

    public ra0(Context context, long j10, long j11, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30669y = new Rect();
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = new xp(this, 27);
        this.I = false;
        this.J = 0.0f;
        this.K = false;
        this.N = new na0(this);
        this.P = new Path();
        this.Q = new RectF();
        this.h = p2Var;
        this.f30659a = g6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        qa0 qa0Var = new qa0(this, context, g6Var);
        this.f30660b = qa0Var;
        org.telegram.ui.cr crVar = new org.telegram.ui.cr((Object) this, 2);
        this.f30661c = crVar;
        crVar.j1(1);
        ka0 ka0Var = new ka0(this);
        this.d = ka0Var;
        ka0Var.O = new la0(this);
        f2.l lVar = new f2.l();
        lVar.f5930c = 150L;
        lVar.f5931e = 150L;
        lVar.f5932f = 150L;
        lVar.f5933g = 150L;
        lVar.d = 150L;
        lVar.f5852o = pr.f30183f;
        lVar.C = false;
        qa0Var.setItemAnimator(lVar);
        qa0Var.setClipToPadding(false);
        qa0Var.setLayoutManager(crVar);
        uf.u0 u0Var = new uf.u0(context, j10, j11, new ma0(this, p2Var), g6Var, h());
        this.f30663f = u0Var;
        ?? p0Var = new f2.p0();
        p0Var.d = null;
        p0Var.f48787f = false;
        f2.e1 e1Var = new f2.e1(p0Var, 2);
        p0Var.f48785c = u0Var;
        u0Var.B(e1Var);
        this.f30662e = p0Var;
        qa0Var.setAdapter(p0Var);
        qa0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(qa0Var, k7.c6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        ka0 ka0Var;
        uf.u0 u0Var;
        int height;
        qa0 qa0Var = this.f30660b;
        if (qa0Var != null && this.f30661c != null) {
            boolean g10 = g();
            this.f30666s = 0.0f;
            uf.z0 z0Var = this.f30662e;
            if (g10) {
                if (z0Var.f48787f) {
                    height = z0Var.f48786e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, qa0Var.getTranslationY() + height) + this.f30666s, (1.0f - this.J) * getHeight());
                this.f30664n = 0.0f;
                this.f30665r = min;
            } else {
                if (z0Var.f48787f) {
                    i10 = z0Var.f48786e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f30664n = Math.max(Math.max(0.0f, qa0Var.getTranslationY() + i10) - this.f30666s, this.J * getHeight());
                this.f30665r = getMeasuredHeight();
            }
            qg.b bVar = this.O;
            if (bVar != null) {
                bVar.setBounds(0, ((int) this.f30664n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f30665r));
                Path path = this.P;
                path.rewind();
                Rect rect = this.O.h.f44846m;
                RectF rectF = this.Q;
                rectF.set(rect);
                if (qa0Var != null && (ka0Var = this.d) != null && qa0Var.getLayoutManager() == ka0Var && (u0Var = this.f30663f) != null && u0Var.O != null) {
                    rectF.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                    path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
                } else {
                    path.addRoundRect(rectF, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), Path.Direction.CW);
                }
                path.close();
                invalidate();
            }
        }
    }

    public final void c() {
        boolean z4;
        float f10;
        int i10;
        ka0 ka0Var;
        uf.u0 u0Var;
        qa0 qa0Var = this.f30660b;
        if (qa0Var != null && this.f30661c != null) {
            int i11 = 0;
            if (qa0Var != null && (ka0Var = this.d) != null && qa0Var.getLayoutManager() == ka0Var && (u0Var = this.f30663f) != null && u0Var.O != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.O == null) {
                qa0Var.setPadding(0, 0, 0, 0);
                return;
            }
            float f11 = 5.0f;
            if (z4) {
                f10 = 7.0f;
            } else {
                f10 = 5.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            if (z4) {
                i10 = AndroidUtilities.dp(2.0f);
            } else {
                i10 = 0;
            }
            if (z4) {
                f11 = 7.0f;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (z4) {
                i11 = AndroidUtilities.dp(2.0f);
            }
            qa0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f30664n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f30660b, (h5.d) new ag.d(10));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int v02;
        int height;
        qg.b bVar = this.O;
        if (bVar != null) {
            bVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.P);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        uf.u0 u0Var = this.f30663f;
        if ((u0Var.N() || u0Var.O != null) && ((u0Var.f48718u0 || u0Var.f48723x0 != null) && u0Var.I() == null && u0Var.R == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f30666s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f10 = this.f30664n;
        uf.z0 z0Var = this.f30662e;
        qa0 qa0Var = this.f30660b;
        Rect rect = this.f30669y;
        if (g10) {
            if (z0Var.f48787f) {
                height = z0Var.f48786e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, qa0Var.getTranslationY() + height) + this.f30666s, (1.0f - this.J) * getHeight());
            this.f30664n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f30665r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f30665r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (qa0Var.getLayoutManager() == this.d) {
                this.f30666s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (z0Var.f48787f) {
                i11 = z0Var.f48786e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, qa0Var.getTranslationY() + i11) - this.f30666s;
            this.f30664n = max;
            float max2 = Math.max(max, this.J * getHeight());
            this.f30664n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f30665r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f30664n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.f30664n) > 0.1f) {
            i();
        }
        if (this.B == null) {
            Paint paint = new Paint(1);
            this.B = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.B;
        Integer num = this.C;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sd, this.f30659a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f30665r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.B);
    }

    public final boolean g() {
        f2.w0 layoutManager = this.f30660b.getLayoutManager();
        org.telegram.ui.cr crVar = this.f30661c;
        if (layoutManager == crVar && crVar.f5821t) {
            return true;
        }
        return false;
    }

    public uf.u0 getAdapter() {
        return this.f30663f;
    }

    public f2.j0 getCurrentLayoutManager() {
        f2.w0 layoutManager = this.f30660b.getLayoutManager();
        org.telegram.ui.cr crVar = this.f30661c;
        if (layoutManager == crVar) {
            return crVar;
        }
        return this.d;
    }

    public qa0 getListView() {
        return this.f30660b;
    }

    public f2.j0 getNeededLayoutManager() {
        uf.u0 u0Var = this.f30663f;
        if ((!u0Var.N() && u0Var.O == null) || (!u0Var.f48718u0 && u0Var.f48723x0 == null)) {
            return this.f30661c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof oh.r2;
    }

    public final void o(boolean z4) {
        long j10;
        float computeVerticalScrollOffset;
        int i10;
        if (z4) {
            boolean g10 = g();
            if (!this.F) {
                this.E = true;
                qa0 qa0Var = this.f30660b;
                f2.w0 layoutManager = qa0Var.getLayoutManager();
                org.telegram.ui.cr crVar = this.f30661c;
                if (layoutManager == crVar) {
                    if (g10) {
                        i10 = -100000;
                    } else {
                        i10 = 100000;
                    }
                    crVar.h1(0, i10);
                }
                if (getVisibility() == 8) {
                    this.J = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.v + AndroidUtilities.dp(12.0f));
                    } else {
                        computeVerticalScrollOffset = qa0Var.computeVerticalScrollOffset() + this.v;
                    }
                    qa0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.E = false;
        }
        this.F = z4;
        xp xpVar = this.G;
        AndroidUtilities.cancelRunOnUIThread(xpVar);
        o1.j jVar = this.H;
        if (jVar != null) {
            jVar.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.h;
        if (p2Var != null && p2Var.getFragmentBeginToShow()) {
            j10 = 0;
        } else {
            j10 = 100;
        }
        AndroidUtilities.runOnUIThread(xpVar, j10);
        if (z4) {
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    public final void p(oa0 oa0Var) {
        this.f30668x = oa0Var;
        qa0 listView = getListView();
        hg.v0 v0Var = new hg.v0(12, this, oa0Var);
        this.f30667w = v0Var;
        listView.setOnItemClickListener(v0Var);
        getListView().setOnTouchListener(new vr(this, 2));
    }

    @Override
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(qg.b bVar) {
        this.O = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.O.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        uf.u0 u0Var = this.f30663f;
        if (u0Var.f48708n != j10) {
            u0Var.f48708n = j10;
        }
    }

    public void setIgnoreLayout(boolean z4) {
        this.D = z4;
    }

    public void setOverrideColor(int i10) {
        this.C = Integer.valueOf(i10);
        invalidate();
    }

    public void setReversed(boolean z4) {
        if (z4 != g()) {
            this.E = true;
            this.f30661c.k1(z4);
            uf.u0 u0Var = this.f30663f;
            if (u0Var.H0 != z4) {
                u0Var.H0 = z4;
                int i10 = u0Var.I0;
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

    public void l(boolean z4) {
    }

    public void m() {
    }

    public void n(boolean z4) {
    }
}
