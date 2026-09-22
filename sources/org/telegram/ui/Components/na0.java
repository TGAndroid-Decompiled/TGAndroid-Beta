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
public abstract class na0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final ja0 Q;
    public ch.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.e6 f26421a;
    public final ma0 f26422b;
    public final gg.j0 f26423c;
    public final ga0 d;
    public final gg.q1 e;
    public final gg.k1 f26424f;
    public final org.telegram.ui.ActionBar.n2 h;
    public float f26425n;
    public float f26426r;
    public float f26427s;
    public float v;
    public ai.o6 f26428w;
    public ka0 f26429x;
    public final Rect f26430y;

    public na0(Context context, long j3, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f26430y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new xp(this, 27);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new ja0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = n2Var;
        this.f26421a = e6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ma0 ma0Var = new ma0(this, context, e6Var);
        this.f26422b = ma0Var;
        gg.j0 j0Var = new gg.j0((Object) this, 3);
        this.f26423c = j0Var;
        j0Var.j1(1);
        ga0 ga0Var = new ga0(this);
        this.d = ga0Var;
        ga0Var.O = new ha0(this);
        s4.j jVar = new s4.j();
        jVar.f42752c = 150L;
        jVar.e = 150L;
        jVar.f42753f = 150L;
        jVar.f42754g = 150L;
        jVar.d = 150L;
        jVar.f42728o = qr.f27420f;
        jVar.C = false;
        ma0Var.setItemAnimator(jVar);
        ma0Var.setClipToPadding(false);
        ma0Var.setLayoutManager(j0Var);
        gg.k1 k1Var = new gg.k1(context, j3, j10, new ia0(this, n2Var), e6Var, h());
        this.f26424f = k1Var;
        ?? h0Var = new s4.h0();
        h0Var.d = null;
        h0Var.f9899f = false;
        gg.p1 p1Var = new gg.p1(h0Var, 0);
        h0Var.f9898c = k1Var;
        k1Var.B(p1Var);
        this.e = h0Var;
        ma0Var.setAdapter(h0Var);
        ma0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(ma0Var, w7.x5.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        ga0 ga0Var;
        gg.k1 k1Var;
        int height;
        ma0 ma0Var = this.f26422b;
        if (ma0Var != null && this.f26423c != null) {
            boolean g10 = g();
            this.f26427s = 0.0f;
            gg.q1 q1Var = this.e;
            if (g10) {
                if (q1Var.f9899f) {
                    height = q1Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, ma0Var.getTranslationY() + height) + this.f26427s, (1.0f - this.M) * getHeight());
                this.f26425n = 0.0f;
                this.f26426r = min;
            } else {
                if (q1Var.f9899f) {
                    i10 = q1Var.e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f26425n = Math.max(Math.max(0.0f, ma0Var.getTranslationY() + i10) - this.f26427s, this.M * getHeight());
                this.f26426r = getMeasuredHeight();
            }
            ch.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f26425n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f26426r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.f4285j.f4276m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (ma0Var != null && (ga0Var = this.d) != null && ma0Var.getLayoutManager() == ga0Var && (k1Var = this.f26424f) != null && k1Var.R != null) {
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
        ga0 ga0Var;
        gg.k1 k1Var;
        ma0 ma0Var = this.f26422b;
        if (ma0Var != null && this.f26423c != null) {
            int i11 = 0;
            if (ma0Var != null && (ga0Var = this.d) != null && ma0Var.getLayoutManager() == ga0Var && (k1Var = this.f26424f) != null && k1Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                ma0Var.setPadding(0, 0, 0, 0);
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
            ma0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f26425n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f26422b, (e2.h) new ai.i(24));
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
        gg.k1 k1Var = this.f26424f;
        if ((k1Var.N() || k1Var.R != null) && ((k1Var.f9840x0 || k1Var.A0 != null) && k1Var.I() == null && k1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f26427s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f26425n;
        gg.q1 q1Var = this.e;
        ma0 ma0Var = this.f26422b;
        Rect rect = this.f26430y;
        if (g10) {
            if (q1Var.f9899f) {
                height = q1Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, ma0Var.getTranslationY() + height) + this.f26427s, (1.0f - this.M) * getHeight());
            this.f26425n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f26426r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f26426r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (ma0Var.getLayoutManager() == this.d) {
                this.f26427s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (q1Var.f9899f) {
                i11 = q1Var.e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, ma0Var.getTranslationY() + i11) - this.f26427s;
            this.f26425n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f26425n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f26426r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f26425n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f26425n) > 0.1f) {
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
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sd, this.f26421a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f26426r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.o0 layoutManager = this.f26422b.getLayoutManager();
        gg.j0 j0Var = this.f26423c;
        if (layoutManager == j0Var && j0Var.f42664t) {
            return true;
        }
        return false;
    }

    public gg.k1 getAdapter() {
        return this.f26424f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.o0 layoutManager = this.f26422b.getLayoutManager();
        gg.j0 j0Var = this.f26423c;
        if (layoutManager == j0Var) {
            return j0Var;
        }
        return this.d;
    }

    public ma0 getListView() {
        return this.f26422b;
    }

    public s4.c0 getNeededLayoutManager() {
        gg.k1 k1Var = this.f26424f;
        if ((!k1Var.N() && k1Var.R == null) || (!k1Var.f9840x0 && k1Var.A0 == null)) {
            return this.f26423c;
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
                ma0 ma0Var = this.f26422b;
                s4.o0 layoutManager = ma0Var.getLayoutManager();
                gg.j0 j0Var = this.f26423c;
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
                        computeVerticalScrollOffset = ma0Var.computeVerticalScrollOffset() + this.v;
                    }
                    ma0Var.setTranslationY(computeVerticalScrollOffset);
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

    public final void p(ka0 ka0Var) {
        this.f26429x = ka0Var;
        ma0 listView = getListView();
        ai.o6 o6Var = new ai.o6(12, this, ka0Var);
        this.f26428w = o6Var;
        listView.setOnItemClickListener(o6Var);
        getListView().setOnTouchListener(new vr(this, 2));
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
        gg.k1 k1Var = this.f26424f;
        if (k1Var.f9825n != j3) {
            k1Var.f9825n = j3;
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
            this.f26423c.k1(z10);
            gg.k1 k1Var = this.f26424f;
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
