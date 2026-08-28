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
public abstract class w90 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int Q = 0;
    public Paint A;
    public Integer B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final np F;
    public o1.j G;
    public boolean H;
    public float I;
    public boolean J;
    public int K;
    public ArrayList L;
    public final s90 M;
    public kg.d N;
    public final Path O;
    public final RectF P;
    public final org.telegram.ui.ActionBar.b6 f34155a;
    public final v90 f34156b;
    public final of.g0 f34157c;
    public final p90 d;
    public final of.k1 f34158e;
    public final of.f1 f34159f;
    public final org.telegram.ui.ActionBar.o2 h;
    public float f34160n;
    public float f34161r;
    public float f34162s;
    public float v;
    public bg.b1 f34163w;
    public t90 f34164x;
    public final Rect f34165y;

    public w90(Context context, long j10, long j11, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f34165y = new Rect();
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = new np(this, 27);
        this.H = false;
        this.I = 0.0f;
        this.J = false;
        this.M = new s90(this);
        this.O = new Path();
        this.P = new RectF();
        this.h = o2Var;
        this.f34155a = b6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        v90 v90Var = new v90(this, context, b6Var);
        this.f34156b = v90Var;
        of.g0 g0Var = new of.g0((Object) this, 3);
        this.f34157c = g0Var;
        g0Var.j1(1);
        p90 p90Var = new p90(this);
        this.d = p90Var;
        p90Var.O = new q90(this);
        f2.n nVar = new f2.n();
        nVar.f5548c = 150L;
        nVar.f5549e = 150L;
        nVar.f5550f = 150L;
        nVar.f5551g = 150L;
        nVar.d = 150L;
        nVar.f5449o = gr.f28844f;
        nVar.C = false;
        v90Var.setItemAnimator(nVar);
        v90Var.setClipToPadding(false);
        v90Var.setLayoutManager(g0Var);
        of.f1 f1Var = new of.f1(context, j10, j11, new r90(this, o2Var), b6Var, h());
        this.f34159f = f1Var;
        ?? r0Var = new f2.r0();
        r0Var.d = null;
        r0Var.f19400f = false;
        f2.i1 i1Var = new f2.i1(r0Var, 1);
        r0Var.f19398c = f1Var;
        f1Var.B(i1Var);
        this.f34158e = r0Var;
        v90Var.setAdapter(r0Var);
        v90Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(v90Var, g7.e6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i9;
        p90 p90Var;
        of.f1 f1Var;
        int height;
        v90 v90Var = this.f34156b;
        if (v90Var != null && this.f34157c != null) {
            boolean g10 = g();
            this.f34162s = 0.0f;
            of.k1 k1Var = this.f34158e;
            if (g10) {
                if (k1Var.f19400f) {
                    height = k1Var.f19399e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, v90Var.getTranslationY() + height) + this.f34162s, (1.0f - this.I) * getHeight());
                this.f34160n = 0.0f;
                this.f34161r = min;
            } else {
                if (k1Var.f19400f) {
                    i9 = k1Var.f19399e.getBottom();
                } else {
                    i9 = 0;
                }
                this.f34160n = Math.max(Math.max(0.0f, v90Var.getTranslationY() + i9) - this.f34162s, this.I * getHeight());
                this.f34161r = getMeasuredHeight();
            }
            kg.d dVar = this.N;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f34160n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f34161r));
                Path path = this.O;
                path.rewind();
                Rect rect = this.N.h.f14812m;
                RectF rectF = this.P;
                rectF.set(rect);
                if (v90Var != null && (p90Var = this.d) != null && v90Var.getLayoutManager() == p90Var && (f1Var = this.f34159f) != null && f1Var.N != null) {
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
        boolean z10;
        float f10;
        int i9;
        p90 p90Var;
        of.f1 f1Var;
        v90 v90Var = this.f34156b;
        if (v90Var != null && this.f34157c != null) {
            int i10 = 0;
            if (v90Var != null && (p90Var = this.d) != null && v90Var.getLayoutManager() == p90Var && (f1Var = this.f34159f) != null && f1Var.N != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.N == null) {
                v90Var.setPadding(0, 0, 0, 0);
                return;
            }
            float f11 = 5.0f;
            if (z10) {
                f10 = 7.0f;
            } else {
                f10 = 5.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            if (z10) {
                i9 = AndroidUtilities.dp(2.0f);
            } else {
                i9 = 0;
            }
            if (z10) {
                f11 = 7.0f;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (z10) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            v90Var.setPadding(dp, i9, dp2, i10);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f34160n;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f34156b, (d5.d) new ih.e(8));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        int i10;
        float min;
        int v02;
        int height;
        kg.d dVar = this.N;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.O);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        of.f1 f1Var = this.f34159f;
        if ((f1Var.N() || f1Var.N != null) && ((f1Var.f19344t0 || f1Var.f19348w0 != null) && f1Var.I() == null && f1Var.Q == null)) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        this.f34162s = AndroidUtilities.dp(i9 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f10 = this.f34160n;
        of.k1 k1Var = this.f34158e;
        v90 v90Var = this.f34156b;
        Rect rect = this.f34165y;
        if (g10) {
            if (k1Var.f19400f) {
                height = k1Var.f19399e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, v90Var.getTranslationY() + height) + this.f34162s, (1.0f - this.I) * getHeight());
            this.f34160n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f34161r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f34161r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (v90Var.getLayoutManager() == this.d) {
                this.f34162s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (k1Var.f19400f) {
                i10 = k1Var.f19399e.getBottom();
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, v90Var.getTranslationY() + i10) - this.f34162s;
            this.f34160n = max;
            float max2 = Math.max(max, this.I * getHeight());
            this.f34160n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f34161r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f34160n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.f34160n) > 0.1f) {
            i();
        }
        if (this.A == null) {
            Paint paint = new Paint(1);
            this.A = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.A;
        Integer num = this.B;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sd, this.f34155a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f34161r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.A);
    }

    public final boolean g() {
        f2.z0 layoutManager = this.f34156b.getLayoutManager();
        of.g0 g0Var = this.f34157c;
        if (layoutManager == g0Var && g0Var.f5437t) {
            return true;
        }
        return false;
    }

    public of.f1 getAdapter() {
        return this.f34159f;
    }

    public f2.m0 getCurrentLayoutManager() {
        f2.z0 layoutManager = this.f34156b.getLayoutManager();
        of.g0 g0Var = this.f34157c;
        if (layoutManager == g0Var) {
            return g0Var;
        }
        return this.d;
    }

    public v90 getListView() {
        return this.f34156b;
    }

    public f2.m0 getNeededLayoutManager() {
        of.f1 f1Var = this.f34159f;
        if ((!f1Var.N() && f1Var.N == null) || (!f1Var.f19344t0 && f1Var.f19348w0 == null)) {
            return this.f34157c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof ih.r2;
    }

    public final void o(boolean z10) {
        long j10;
        float computeVerticalScrollOffset;
        int i9;
        if (z10) {
            boolean g10 = g();
            if (!this.E) {
                this.D = true;
                v90 v90Var = this.f34156b;
                f2.z0 layoutManager = v90Var.getLayoutManager();
                of.g0 g0Var = this.f34157c;
                if (layoutManager == g0Var) {
                    if (g10) {
                        i9 = -100000;
                    } else {
                        i9 = 100000;
                    }
                    g0Var.h1(0, i9);
                }
                if (getVisibility() == 8) {
                    this.I = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.v + AndroidUtilities.dp(12.0f));
                    } else {
                        computeVerticalScrollOffset = v90Var.computeVerticalScrollOffset() + this.v;
                    }
                    v90Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.D = false;
        }
        this.E = z10;
        np npVar = this.F;
        AndroidUtilities.cancelRunOnUIThread(npVar);
        o1.j jVar = this.G;
        if (jVar != null) {
            jVar.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.h;
        if (o2Var != null && o2Var.getFragmentBeginToShow()) {
            j10 = 0;
        } else {
            j10 = 100;
        }
        AndroidUtilities.runOnUIThread(npVar, j10);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        b();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        c();
        super.onMeasure(i9, i10);
    }

    public final void p(t90 t90Var) {
        this.f34164x = t90Var;
        v90 listView = getListView();
        bg.b1 b1Var = new bg.b1(14, this, t90Var);
        this.f34163w = b1Var;
        listView.setOnItemClickListener(b1Var);
        getListView().setOnTouchListener(new lr(this, 2));
    }

    @Override
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(kg.d dVar) {
        this.N = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.N.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        of.f1 f1Var = this.f34159f;
        if (f1Var.f19335n != j10) {
            f1Var.f19335n = j10;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.C = z10;
    }

    public void setOverrideColor(int i9) {
        this.B = Integer.valueOf(i9);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.D = true;
            this.f34157c.k1(z10);
            of.f1 f1Var = this.f34159f;
            if (f1Var.G0 != z10) {
                f1Var.G0 = z10;
                int i9 = f1Var.H0;
                if (i9 > 0) {
                    f1Var.m(0);
                }
                if (i9 > 1) {
                    f1Var.m(i9 - 1);
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
