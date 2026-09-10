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
public abstract class xa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final dq J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final ta0 Q;
    public bh.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.f6 f28989a;
    public final wa0 f28990b;
    public final fg.i0 f28991c;
    public final qa0 d;
    public final fg.r1 e;
    public final fg.l1 f28992f;
    public final org.telegram.ui.ActionBar.p2 h;
    public float f28993n;
    public float f28994r;
    public float f28995s;
    public float v;
    public ai.b0 f28996w;
    public ua0 f28997x;
    public final Rect f28998y;

    public xa0(Context context, long j3, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f28998y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new dq(this, 27);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new ta0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = p2Var;
        this.f28989a = f6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        wa0 wa0Var = new wa0(this, context, f6Var);
        this.f28990b = wa0Var;
        fg.i0 i0Var = new fg.i0((Object) this, 3);
        this.f28991c = i0Var;
        i0Var.j1(1);
        qa0 qa0Var = new qa0(this);
        this.d = qa0Var;
        qa0Var.O = new ra0(this);
        s4.j jVar = new s4.j();
        jVar.f41691c = 150L;
        jVar.e = 150L;
        jVar.f41692f = 150L;
        jVar.f41693g = 150L;
        jVar.d = 150L;
        jVar.f41667o = wr.f28819f;
        jVar.C = false;
        wa0Var.setItemAnimator(jVar);
        wa0Var.setClipToPadding(false);
        wa0Var.setLayoutManager(i0Var);
        fg.l1 l1Var = new fg.l1(context, j3, j10, new sa0(this, p2Var), f6Var, h());
        this.f28992f = l1Var;
        ?? h0Var = new s4.h0();
        h0Var.d = null;
        h0Var.f8192f = false;
        fg.q1 q1Var = new fg.q1(h0Var, 0);
        h0Var.f8191c = l1Var;
        l1Var.B(q1Var);
        this.e = h0Var;
        wa0Var.setAdapter(h0Var);
        wa0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(wa0Var, w7.a6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        qa0 qa0Var;
        fg.l1 l1Var;
        int height;
        wa0 wa0Var = this.f28990b;
        if (wa0Var != null && this.f28991c != null) {
            boolean g10 = g();
            this.f28995s = 0.0f;
            fg.r1 r1Var = this.e;
            if (g10) {
                if (r1Var.f8192f) {
                    height = r1Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, wa0Var.getTranslationY() + height) + this.f28995s, (1.0f - this.M) * getHeight());
                this.f28993n = 0.0f;
                this.f28994r = min;
            } else {
                if (r1Var.f8192f) {
                    i10 = r1Var.e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f28993n = Math.max(Math.max(0.0f, wa0Var.getTranslationY() + i10) - this.f28995s, this.M * getHeight());
                this.f28994r = getMeasuredHeight();
            }
            bh.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f28993n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f28994r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.h.f2266m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (wa0Var != null && (qa0Var = this.d) != null && wa0Var.getLayoutManager() == qa0Var && (l1Var = this.f28992f) != null && l1Var.R != null) {
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
        qa0 qa0Var;
        fg.l1 l1Var;
        wa0 wa0Var = this.f28990b;
        if (wa0Var != null && this.f28991c != null) {
            int i11 = 0;
            if (wa0Var != null && (qa0Var = this.d) != null && wa0Var.getLayoutManager() == qa0Var && (l1Var = this.f28992f) != null && l1Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                wa0Var.setPadding(0, 0, 0, 0);
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
            wa0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f28993n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f28990b, (e2.h) new gg.g0(21));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int v02;
        int height;
        bh.d dVar = this.R;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        fg.l1 l1Var = this.f28992f;
        if ((l1Var.N() || l1Var.R != null) && ((l1Var.f8131x0 || l1Var.A0 != null) && l1Var.I() == null && l1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f28995s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f28993n;
        fg.r1 r1Var = this.e;
        wa0 wa0Var = this.f28990b;
        Rect rect = this.f28998y;
        if (g10) {
            if (r1Var.f8192f) {
                height = r1Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, wa0Var.getTranslationY() + height) + this.f28995s, (1.0f - this.M) * getHeight());
            this.f28993n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f28994r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f28994r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (wa0Var.getLayoutManager() == this.d) {
                this.f28995s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (r1Var.f8192f) {
                i11 = r1Var.e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, wa0Var.getTranslationY() + i11) - this.f28995s;
            this.f28993n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f28993n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f28994r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f28993n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f28993n) > 0.1f) {
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
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, this.f28989a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f28994r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.o0 layoutManager = this.f28990b.getLayoutManager();
        fg.i0 i0Var = this.f28991c;
        if (layoutManager == i0Var && i0Var.f41603t) {
            return true;
        }
        return false;
    }

    public fg.l1 getAdapter() {
        return this.f28992f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.o0 layoutManager = this.f28990b.getLayoutManager();
        fg.i0 i0Var = this.f28991c;
        if (layoutManager == i0Var) {
            return i0Var;
        }
        return this.d;
    }

    public wa0 getListView() {
        return this.f28990b;
    }

    public s4.c0 getNeededLayoutManager() {
        fg.l1 l1Var = this.f28992f;
        if ((!l1Var.N() && l1Var.R == null) || (!l1Var.f8131x0 && l1Var.A0 == null)) {
            return this.f28991c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof zh.v1;
    }

    public final void o(boolean z10) {
        long j3;
        float computeVerticalScrollOffset;
        int i10;
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                wa0 wa0Var = this.f28990b;
                s4.o0 layoutManager = wa0Var.getLayoutManager();
                fg.i0 i0Var = this.f28991c;
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
                        computeVerticalScrollOffset = wa0Var.computeVerticalScrollOffset() + this.v;
                    }
                    wa0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        dq dqVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(dqVar);
        o1.k kVar = this.K;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.h;
        if (p2Var != null && p2Var.getFragmentBeginToShow()) {
            j3 = 0;
        } else {
            j3 = 100;
        }
        AndroidUtilities.runOnUIThread(dqVar, j3);
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

    public final void p(ua0 ua0Var) {
        this.f28997x = ua0Var;
        wa0 listView = getListView();
        ai.b0 b0Var = new ai.b0(11, this, ua0Var);
        this.f28996w = b0Var;
        listView.setOnItemClickListener(b0Var);
        getListView().setOnTouchListener(new bs(this, 2));
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(bh.d dVar) {
        this.R = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.R.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        fg.l1 l1Var = this.f28992f;
        if (l1Var.f8116n != j3) {
            l1Var.f8116n = j3;
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
            this.f28991c.k1(z10);
            fg.l1 l1Var = this.f28992f;
            if (l1Var.K0 != z10) {
                l1Var.K0 = z10;
                int i10 = l1Var.L0;
                if (i10 > 0) {
                    l1Var.m(0);
                }
                if (i10 > 1) {
                    l1Var.m(i10 - 1);
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
