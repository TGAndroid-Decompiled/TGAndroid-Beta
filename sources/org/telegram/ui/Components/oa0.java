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
public abstract class oa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final wp J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final ka0 Q;
    public dh.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.f6 f29017a;
    public final na0 f29018b;
    public final hg.j0 f29019c;
    public final ha0 d;
    public final hg.q1 f29020e;
    public final hg.k1 f29021f;
    public final org.telegram.ui.ActionBar.n2 h;
    public float f29022n;
    public float f29023r;
    public float f29024s;
    public float v;
    public bi.x5 f29025w;
    public la0 f29026x;
    public final Rect f29027y;

    public oa0(Context context, long j3, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29027y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new wp(this, 27);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new ka0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = n2Var;
        this.f29017a = f6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        na0 na0Var = new na0(this, context, f6Var);
        this.f29018b = na0Var;
        hg.j0 j0Var = new hg.j0((Object) this, 3);
        this.f29019c = j0Var;
        j0Var.j1(1);
        ha0 ha0Var = new ha0(this);
        this.d = ha0Var;
        ha0Var.O = new ia0(this);
        s4.j jVar = new s4.j();
        jVar.f45828c = 150L;
        jVar.f45829e = 150L;
        jVar.f45830f = 150L;
        jVar.f45831g = 150L;
        jVar.d = 150L;
        jVar.f45803o = pr.f29466f;
        jVar.C = false;
        na0Var.setItemAnimator(jVar);
        na0Var.setClipToPadding(false);
        na0Var.setLayoutManager(j0Var);
        hg.k1 k1Var = new hg.k1(context, j3, j10, new ja0(this, n2Var), f6Var, h());
        this.f29021f = k1Var;
        ?? h0Var = new s4.h0();
        h0Var.d = null;
        h0Var.f11223f = false;
        hg.p1 p1Var = new hg.p1(h0Var, 0);
        h0Var.f11221c = k1Var;
        k1Var.B(p1Var);
        this.f29020e = h0Var;
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
        hg.k1 k1Var;
        int height;
        na0 na0Var = this.f29018b;
        if (na0Var != null && this.f29019c != null) {
            boolean g10 = g();
            this.f29024s = 0.0f;
            hg.q1 q1Var = this.f29020e;
            if (g10) {
                if (q1Var.f11223f) {
                    height = q1Var.f11222e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, na0Var.getTranslationY() + height) + this.f29024s, (1.0f - this.M) * getHeight());
                this.f29022n = 0.0f;
                this.f29023r = min;
            } else {
                if (q1Var.f11223f) {
                    i10 = q1Var.f11222e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f29022n = Math.max(Math.max(0.0f, na0Var.getTranslationY() + i10) - this.f29024s, this.M * getHeight());
                this.f29023r = getMeasuredHeight();
            }
            dh.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f29022n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f29023r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.h.f6828m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (na0Var != null && (ha0Var = this.d) != null && na0Var.getLayoutManager() == ha0Var && (k1Var = this.f29021f) != null && k1Var.R != null) {
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
        hg.k1 k1Var;
        na0 na0Var = this.f29018b;
        if (na0Var != null && this.f29019c != null) {
            int i11 = 0;
            if (na0Var != null && (ha0Var = this.d) != null && na0Var.getLayoutManager() == ha0Var && (k1Var = this.f29021f) != null && k1Var.R != null) {
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
        return getMeasuredHeight() - this.f29022n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f29018b, (e2.h) new bi.f(24));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int v02;
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
        hg.k1 k1Var = this.f29021f;
        if ((k1Var.N() || k1Var.R != null) && ((k1Var.f11158x0 || k1Var.A0 != null) && k1Var.I() == null && k1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f29024s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f29022n;
        hg.q1 q1Var = this.f29020e;
        na0 na0Var = this.f29018b;
        Rect rect = this.f29027y;
        if (g10) {
            if (q1Var.f11223f) {
                height = q1Var.f11222e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, na0Var.getTranslationY() + height) + this.f29024s, (1.0f - this.M) * getHeight());
            this.f29022n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f29023r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f29023r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (na0Var.getLayoutManager() == this.d) {
                this.f29024s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (q1Var.f11223f) {
                i11 = q1Var.f11222e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, na0Var.getTranslationY() + i11) - this.f29024s;
            this.f29022n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f29022n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f29023r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f29022n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f29022n) > 0.1f) {
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
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, this.f29017a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f29023r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.o0 layoutManager = this.f29018b.getLayoutManager();
        hg.j0 j0Var = this.f29019c;
        if (layoutManager == j0Var && j0Var.f45731t) {
            return true;
        }
        return false;
    }

    public hg.k1 getAdapter() {
        return this.f29021f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.o0 layoutManager = this.f29018b.getLayoutManager();
        hg.j0 j0Var = this.f29019c;
        if (layoutManager == j0Var) {
            return j0Var;
        }
        return this.d;
    }

    public na0 getListView() {
        return this.f29018b;
    }

    public s4.c0 getNeededLayoutManager() {
        hg.k1 k1Var = this.f29021f;
        if ((!k1Var.N() && k1Var.R == null) || (!k1Var.f11158x0 && k1Var.A0 == null)) {
            return this.f29019c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof bi.p3;
    }

    public final void o(boolean z10) {
        long j3;
        float computeVerticalScrollOffset;
        int i10;
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                na0 na0Var = this.f29018b;
                s4.o0 layoutManager = na0Var.getLayoutManager();
                hg.j0 j0Var = this.f29019c;
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
        wp wpVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(wpVar);
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
        AndroidUtilities.runOnUIThread(wpVar, j3);
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
        this.f29026x = la0Var;
        na0 listView = getListView();
        bi.x5 x5Var = new bi.x5(12, this, la0Var);
        this.f29025w = x5Var;
        listView.setOnItemClickListener(x5Var);
        getListView().setOnTouchListener(new ur(this, 2));
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
        dVar.p(AndroidUtilities.dp(22.0f));
        this.R.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        hg.k1 k1Var = this.f29021f;
        if (k1Var.f11143n != j3) {
            k1Var.f11143n = j3;
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
            this.f29019c.k1(z10);
            hg.k1 k1Var = this.f29021f;
            if (k1Var.K0 != z10) {
                k1Var.K0 = z10;
                int i10 = k1Var.L0;
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
