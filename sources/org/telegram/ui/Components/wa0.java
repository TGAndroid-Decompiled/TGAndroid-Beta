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
public abstract class wa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final xp J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final sa0 Q;
    public ch.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.e6 f30003a;
    public final va0 f30004b;
    public final gg.j0 f30005c;
    public final pa0 d;
    public final gg.q1 e;
    public final gg.k1 f30006f;
    public final org.telegram.ui.ActionBar.n2 h;
    public float f30007n;
    public float f30008r;
    public float f30009s;
    public float v;
    public ai.o6 f30010w;
    public ta0 f30011x;
    public final Rect f30012y;

    public wa0(Context context, long j3, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30012y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new xp(this, 27);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new sa0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = n2Var;
        this.f30003a = e6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        va0 va0Var = new va0(this, context, e6Var);
        this.f30004b = va0Var;
        gg.j0 j0Var = new gg.j0((Object) this, 4);
        this.f30005c = j0Var;
        j0Var.j1(1);
        pa0 pa0Var = new pa0(this);
        this.d = pa0Var;
        pa0Var.O = new qa0(this);
        s4.j jVar = new s4.j();
        jVar.f43010c = 150L;
        jVar.e = 150L;
        jVar.f43011f = 150L;
        jVar.f43012g = 150L;
        jVar.d = 150L;
        jVar.f42986o = qr.f27715f;
        jVar.C = false;
        va0Var.setItemAnimator(jVar);
        va0Var.setClipToPadding(false);
        va0Var.setLayoutManager(j0Var);
        gg.k1 k1Var = new gg.k1(context, j3, j10, new ra0(this, n2Var), e6Var, h());
        this.f30006f = k1Var;
        ?? h0Var = new s4.h0();
        h0Var.d = null;
        h0Var.f9902f = false;
        gg.p1 p1Var = new gg.p1(h0Var, 0);
        h0Var.f9901c = k1Var;
        k1Var.B(p1Var);
        this.e = h0Var;
        va0Var.setAdapter(h0Var);
        va0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(va0Var, w7.y5.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        pa0 pa0Var;
        gg.k1 k1Var;
        int height;
        va0 va0Var = this.f30004b;
        if (va0Var != null && this.f30005c != null) {
            boolean g10 = g();
            this.f30009s = 0.0f;
            gg.q1 q1Var = this.e;
            if (g10) {
                if (q1Var.f9902f) {
                    height = q1Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, va0Var.getTranslationY() + height) + this.f30009s, (1.0f - this.M) * getHeight());
                this.f30007n = 0.0f;
                this.f30008r = min;
            } else {
                if (q1Var.f9902f) {
                    i10 = q1Var.e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f30007n = Math.max(Math.max(0.0f, va0Var.getTranslationY() + i10) - this.f30009s, this.M * getHeight());
                this.f30008r = getMeasuredHeight();
            }
            ch.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f30007n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f30008r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.f4288j.f4279m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (va0Var != null && (pa0Var = this.d) != null && va0Var.getLayoutManager() == pa0Var && (k1Var = this.f30006f) != null && k1Var.R != null) {
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
        pa0 pa0Var;
        gg.k1 k1Var;
        va0 va0Var = this.f30004b;
        if (va0Var != null && this.f30005c != null) {
            int i11 = 0;
            if (va0Var != null && (pa0Var = this.d) != null && va0Var.getLayoutManager() == pa0Var && (k1Var = this.f30006f) != null && k1Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                va0Var.setPadding(0, 0, 0, 0);
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
            va0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f30007n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f30004b, (e2.h) new ai.i(24));
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
        gg.k1 k1Var = this.f30006f;
        if ((k1Var.N() || k1Var.R != null) && ((k1Var.f9843x0 || k1Var.A0 != null) && k1Var.I() == null && k1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f30009s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f30007n;
        gg.q1 q1Var = this.e;
        va0 va0Var = this.f30004b;
        Rect rect = this.f30012y;
        if (g10) {
            if (q1Var.f9902f) {
                height = q1Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, va0Var.getTranslationY() + height) + this.f30009s, (1.0f - this.M) * getHeight());
            this.f30007n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f30008r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f30008r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (va0Var.getLayoutManager() == this.d) {
                this.f30009s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (q1Var.f9902f) {
                i11 = q1Var.e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, va0Var.getTranslationY() + i11) - this.f30009s;
            this.f30007n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f30007n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f30008r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f30007n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f30007n) > 0.1f) {
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
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, this.f30003a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f30008r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.o0 layoutManager = this.f30004b.getLayoutManager();
        gg.j0 j0Var = this.f30005c;
        if (layoutManager == j0Var && j0Var.f42922t) {
            return true;
        }
        return false;
    }

    public gg.k1 getAdapter() {
        return this.f30006f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.o0 layoutManager = this.f30004b.getLayoutManager();
        gg.j0 j0Var = this.f30005c;
        if (layoutManager == j0Var) {
            return j0Var;
        }
        return this.d;
    }

    public va0 getListView() {
        return this.f30004b;
    }

    public s4.c0 getNeededLayoutManager() {
        gg.k1 k1Var = this.f30006f;
        if ((!k1Var.N() && k1Var.R == null) || (!k1Var.f9843x0 && k1Var.A0 == null)) {
            return this.f30005c;
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
                va0 va0Var = this.f30004b;
                s4.o0 layoutManager = va0Var.getLayoutManager();
                gg.j0 j0Var = this.f30005c;
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
                        computeVerticalScrollOffset = va0Var.computeVerticalScrollOffset() + this.v;
                    }
                    va0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        xp xpVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(xpVar);
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
        AndroidUtilities.runOnUIThread(xpVar, j3);
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

    public final void p(ta0 ta0Var) {
        this.f30011x = ta0Var;
        va0 listView = getListView();
        ai.o6 o6Var = new ai.o6(12, this, ta0Var);
        this.f30010w = o6Var;
        listView.setOnItemClickListener(o6Var);
        getListView().setOnTouchListener(new vr(this, 3));
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
        gg.k1 k1Var = this.f30006f;
        if (k1Var.f9828n != j3) {
            k1Var.f9828n = j3;
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
            this.f30005c.k1(z10);
            gg.k1 k1Var = this.f30006f;
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
