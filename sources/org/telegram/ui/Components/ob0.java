package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class ob0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final kq J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final kb0 Q;
    public dh.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.c6 f27926a;
    public final nb0 f27927b;
    public final hg.i0 f27928c;
    public final hb0 d;
    public final hg.p1 e;
    public final hg.j1 f27929f;
    public final org.telegram.ui.ActionBar.m2 h;
    public float f27930n;
    public float f27931r;
    public float f27932s;
    public float v;
    public bi.z5 f27933w;
    public lb0 f27934x;
    public final Rect f27935y;

    public ob0(Context context, long j10, long j11, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f27935y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new kq(this, 28);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new kb0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = m2Var;
        this.f27926a = c6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        nb0 nb0Var = new nb0(this, context, c6Var);
        this.f27927b = nb0Var;
        hg.i0 i0Var = new hg.i0((Object) this, 3);
        this.f27928c = i0Var;
        i0Var.j1(1);
        hb0 hb0Var = new hb0(this);
        this.d = hb0Var;
        hb0Var.O = new ib0(this);
        s4.k kVar = new s4.k();
        kVar.f44917c = 150L;
        kVar.e = 150L;
        kVar.f44918f = 150L;
        kVar.f44919g = 150L;
        kVar.d = 150L;
        kVar.f44901o = es.f24771f;
        kVar.C = false;
        nb0Var.setItemAnimator(kVar);
        nb0Var.setClipToPadding(false);
        nb0Var.setLayoutManager(i0Var);
        hg.j1 j1Var = new hg.j1(context, j10, j11, new jb0(this, m2Var), c6Var, h());
        this.f27929f = j1Var;
        ?? g0Var = new s4.g0();
        g0Var.d = null;
        g0Var.f10705f = false;
        hg.o1 o1Var = new hg.o1(g0Var, 0);
        g0Var.f10704c = j1Var;
        j1Var.B(o1Var);
        this.e = g0Var;
        nb0Var.setAdapter(g0Var);
        nb0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(nb0Var, w7.a6.d(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        hb0 hb0Var;
        hg.j1 j1Var;
        int height;
        nb0 nb0Var = this.f27927b;
        if (nb0Var != null && this.f27928c != null) {
            boolean g10 = g();
            this.f27932s = 0.0f;
            hg.p1 p1Var = this.e;
            if (g10) {
                if (p1Var.f10705f) {
                    height = p1Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, nb0Var.getTranslationY() + height) + this.f27932s, (1.0f - this.M) * getHeight());
                this.f27930n = 0.0f;
                this.f27931r = min;
            } else {
                if (p1Var.f10705f) {
                    i10 = p1Var.e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f27930n = Math.max(Math.max(0.0f, nb0Var.getTranslationY() + i10) - this.f27932s, this.M * getHeight());
                this.f27931r = getMeasuredHeight();
            }
            dh.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f27930n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f27931r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.f6558j.f6549m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (nb0Var != null && (hb0Var = this.d) != null && nb0Var.getLayoutManager() == hb0Var && (j1Var = this.f27929f) != null && j1Var.R != null) {
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
        float f7;
        int i10;
        hb0 hb0Var;
        hg.j1 j1Var;
        nb0 nb0Var = this.f27927b;
        if (nb0Var != null && this.f27928c != null) {
            int i11 = 0;
            if (nb0Var != null && (hb0Var = this.d) != null && nb0Var.getLayoutManager() == hb0Var && (j1Var = this.f27929f) != null && j1Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                nb0Var.setPadding(0, 0, 0, 0);
                return;
            }
            float f10 = 5.0f;
            if (z10) {
                f7 = 7.0f;
            } else {
                f7 = 5.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (z10) {
                i10 = AndroidUtilities.dp(2.0f);
            } else {
                i10 = 0;
            }
            if (z10) {
                f10 = 7.0f;
            }
            int dp2 = AndroidUtilities.dp(f10);
            if (z10) {
                i11 = AndroidUtilities.dp(2.0f);
            }
            nb0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f27930n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f27927b, (Utilities.Callback<View>) new bi.f(13));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int w02;
        int height;
        dh.d dVar = this.R;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        hg.j1 j1Var = this.f27929f;
        if ((j1Var.N() || j1Var.R != null) && ((j1Var.f10640x0 || j1Var.A0 != null) && j1Var.I() == null && j1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f27932s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f27930n;
        hg.p1 p1Var = this.e;
        nb0 nb0Var = this.f27927b;
        Rect rect = this.f27935y;
        if (g10) {
            if (p1Var.f10705f) {
                height = p1Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, nb0Var.getTranslationY() + height) + this.f27932s, (1.0f - this.M) * getHeight());
            this.f27930n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f27931r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f27931r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (nb0Var.getLayoutManager() == this.d) {
                this.f27932s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (p1Var.f10705f) {
                i11 = p1Var.e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, nb0Var.getTranslationY() + i11) - this.f27932s;
            this.f27930n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f27930n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f27931r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f27930n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f27930n) > 0.1f) {
            i();
        }
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.E = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.E;
        Integer num = this.F;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sd, this.f27926a);
        }
        paint2.setColor(w02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f27931r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.n0 layoutManager = this.f27927b.getLayoutManager();
        hg.i0 i0Var = this.f27928c;
        if (layoutManager == i0Var && i0Var.f44831t) {
            return true;
        }
        return false;
    }

    public hg.j1 getAdapter() {
        return this.f27929f;
    }

    public s4.b0 getCurrentLayoutManager() {
        s4.n0 layoutManager = this.f27927b.getLayoutManager();
        hg.i0 i0Var = this.f27928c;
        if (layoutManager == i0Var) {
            return i0Var;
        }
        return this.d;
    }

    public nb0 getListView() {
        return this.f27927b;
    }

    public s4.b0 getNeededLayoutManager() {
        hg.j1 j1Var = this.f27929f;
        if ((!j1Var.N() && j1Var.R == null) || (!j1Var.f10640x0 && j1Var.A0 == null)) {
            return this.f27928c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof bi.s3;
    }

    public final void o(boolean z10) {
        long j10;
        float computeVerticalScrollOffset;
        int i10;
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                nb0 nb0Var = this.f27927b;
                s4.n0 layoutManager = nb0Var.getLayoutManager();
                hg.i0 i0Var = this.f27928c;
                if (layoutManager == i0Var) {
                    if (g10) {
                        i10 = -100000;
                    } else {
                        i10 = 100000;
                    }
                    i0Var.h1(0, i10);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.v + AndroidUtilities.dp(12.0f));
                    } else {
                        computeVerticalScrollOffset = nb0Var.computeVerticalScrollOffset() + this.v;
                    }
                    nb0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        kq kqVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(kqVar);
        o1.k kVar = this.K;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.h;
        if (m2Var != null && m2Var.getFragmentBeginToShow()) {
            j10 = 0;
        } else {
            j10 = 100;
        }
        AndroidUtilities.runOnUIThread(kqVar, j10);
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

    public final void p(lb0 lb0Var) {
        this.f27934x = lb0Var;
        nb0 listView = getListView();
        bi.z5 z5Var = new bi.z5(12, this, lb0Var);
        this.f27933w = z5Var;
        listView.setOnItemClickListener(z5Var);
        getListView().setOnTouchListener(new uk(this, 4));
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(dh.d dVar) {
        this.R = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.R.p(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        hg.j1 j1Var = this.f27929f;
        if (j1Var.f10625n != j10) {
            j1Var.f10625n = j10;
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
            this.f27928c.k1(z10);
            hg.j1 j1Var = this.f27929f;
            if (j1Var.L0 != z10) {
                j1Var.L0 = z10;
                int i10 = j1Var.M0;
                if (i10 > 0) {
                    j1Var.m(0);
                }
                if (i10 > 1) {
                    j1Var.m(i10 - 1);
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
