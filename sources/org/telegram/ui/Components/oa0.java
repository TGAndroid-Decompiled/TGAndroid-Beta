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
public abstract class oa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final yp J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final ka0 Q;
    public ch.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.d6 f26693a;
    public final na0 f26694b;
    public final gg.j0 f26695c;
    public final ha0 d;
    public final gg.q1 e;
    public final gg.k1 f26696f;
    public final org.telegram.ui.ActionBar.n2 h;
    public float f26697n;
    public float f26698r;
    public float f26699s;
    public float v;
    public ai.n6 f26700w;
    public la0 f26701x;
    public final Rect f26702y;

    public oa0(Context context, long j3, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f26702y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new yp(this, 27);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new ka0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = n2Var;
        this.f26693a = d6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        na0 na0Var = new na0(this, context, d6Var);
        this.f26694b = na0Var;
        gg.j0 j0Var = new gg.j0((Object) this, 3);
        this.f26695c = j0Var;
        j0Var.j1(1);
        ha0 ha0Var = new ha0(this);
        this.d = ha0Var;
        ha0Var.O = new ia0(this);
        s4.j jVar = new s4.j();
        jVar.f42708c = 150L;
        jVar.e = 150L;
        jVar.f42709f = 150L;
        jVar.f42710g = 150L;
        jVar.d = 150L;
        jVar.f42684o = rr.f27701f;
        jVar.C = false;
        na0Var.setItemAnimator(jVar);
        na0Var.setClipToPadding(false);
        na0Var.setLayoutManager(j0Var);
        gg.k1 k1Var = new gg.k1(context, j3, j10, new ja0(this, n2Var), d6Var, h());
        this.f26696f = k1Var;
        ?? h0Var = new s4.h0();
        h0Var.d = null;
        h0Var.f9885f = false;
        gg.p1 p1Var = new gg.p1(h0Var, 0);
        h0Var.f9884c = k1Var;
        k1Var.B(p1Var);
        this.e = h0Var;
        na0Var.setAdapter(h0Var);
        na0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(na0Var, w7.x5.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        ha0 ha0Var;
        gg.k1 k1Var;
        int height;
        na0 na0Var = this.f26694b;
        if (na0Var != null && this.f26695c != null) {
            boolean g10 = g();
            this.f26699s = 0.0f;
            gg.q1 q1Var = this.e;
            if (g10) {
                if (q1Var.f9885f) {
                    height = q1Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, na0Var.getTranslationY() + height) + this.f26699s, (1.0f - this.M) * getHeight());
                this.f26697n = 0.0f;
                this.f26698r = min;
            } else {
                if (q1Var.f9885f) {
                    i10 = q1Var.e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f26697n = Math.max(Math.max(0.0f, na0Var.getTranslationY() + i10) - this.f26699s, this.M * getHeight());
                this.f26698r = getMeasuredHeight();
            }
            ch.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f26697n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f26698r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.f4280j.f4271m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (na0Var != null && (ha0Var = this.d) != null && na0Var.getLayoutManager() == ha0Var && (k1Var = this.f26696f) != null && k1Var.R != null) {
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
        ha0 ha0Var;
        gg.k1 k1Var;
        na0 na0Var = this.f26694b;
        if (na0Var != null && this.f26695c != null) {
            int i11 = 0;
            if (na0Var != null && (ha0Var = this.d) != null && na0Var.getLayoutManager() == ha0Var && (k1Var = this.f26696f) != null && k1Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                na0Var.setPadding(0, 0, 0, 0);
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
            na0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f26697n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f26694b, (Utilities.Callback<View>) new ai.i(13));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int v02;
        int height;
        ch.d dVar = this.R;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        gg.k1 k1Var = this.f26696f;
        if ((k1Var.N() || k1Var.R != null) && ((k1Var.f9826x0 || k1Var.A0 != null) && k1Var.I() == null && k1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f26699s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f26697n;
        gg.q1 q1Var = this.e;
        na0 na0Var = this.f26694b;
        Rect rect = this.f26702y;
        if (g10) {
            if (q1Var.f9885f) {
                height = q1Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, na0Var.getTranslationY() + height) + this.f26699s, (1.0f - this.M) * getHeight());
            this.f26697n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f26698r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f26698r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (na0Var.getLayoutManager() == this.d) {
                this.f26699s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (q1Var.f9885f) {
                i11 = q1Var.e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, na0Var.getTranslationY() + i11) - this.f26699s;
            this.f26697n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f26697n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f26698r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f26697n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f26697n) > 0.1f) {
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
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sd, this.f26693a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f26698r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.o0 layoutManager = this.f26694b.getLayoutManager();
        gg.j0 j0Var = this.f26695c;
        if (layoutManager == j0Var && j0Var.f42620t) {
            return true;
        }
        return false;
    }

    public gg.k1 getAdapter() {
        return this.f26696f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.o0 layoutManager = this.f26694b.getLayoutManager();
        gg.j0 j0Var = this.f26695c;
        if (layoutManager == j0Var) {
            return j0Var;
        }
        return this.d;
    }

    public na0 getListView() {
        return this.f26694b;
    }

    public s4.c0 getNeededLayoutManager() {
        gg.k1 k1Var = this.f26696f;
        if ((!k1Var.N() && k1Var.R == null) || (!k1Var.f9826x0 && k1Var.A0 == null)) {
            return this.f26695c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof ai.c4;
    }

    public final void o(boolean z10) {
        long j3;
        float computeVerticalScrollOffset;
        int i10;
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                na0 na0Var = this.f26694b;
                s4.o0 layoutManager = na0Var.getLayoutManager();
                gg.j0 j0Var = this.f26695c;
                if (layoutManager == j0Var) {
                    if (g10) {
                        i10 = -100000;
                    } else {
                        i10 = 100000;
                    }
                    j0Var.h1(0, i10);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.v + AndroidUtilities.dp(12.0f));
                    } else {
                        computeVerticalScrollOffset = na0Var.computeVerticalScrollOffset() + this.v;
                    }
                    na0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        yp ypVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(ypVar);
        o1.k kVar = this.K;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        if (n2Var != null && n2Var.getFragmentBeginToShow()) {
            j3 = 0;
        } else {
            j3 = 100;
        }
        AndroidUtilities.runOnUIThread(ypVar, j3);
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

    public final void p(la0 la0Var) {
        this.f26701x = la0Var;
        na0 listView = getListView();
        ai.n6 n6Var = new ai.n6(12, this, la0Var);
        this.f26700w = n6Var;
        listView.setOnItemClickListener(n6Var);
        getListView().setOnTouchListener(new wr(this, 2));
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(ch.d dVar) {
        this.R = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.R.p(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        gg.k1 k1Var = this.f26696f;
        if (k1Var.f9811n != j3) {
            k1Var.f9811n = j3;
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
            this.f26695c.k1(z10);
            gg.k1 k1Var = this.f26696f;
            if (k1Var.L0 != z10) {
                k1Var.L0 = z10;
                int i10 = k1Var.M0;
                if (i10 > 0) {
                    k1Var.m(0);
                }
                if (i10 > 1) {
                    k1Var.m(i10 - 1);
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
