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
public abstract class ab0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final zp J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final wa0 Q;
    public ch.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.d6 f22590a;
    public final za0 f22591b;
    public final gg.j0 f22592c;
    public final ta0 d;
    public final gg.q1 e;
    public final gg.k1 f22593f;
    public final org.telegram.ui.ActionBar.m2 h;
    public float f22594n;
    public float f22595r;
    public float f22596s;
    public float v;
    public ai.n6 f22597w;
    public xa0 f22598x;
    public final Rect f22599y;

    public ab0(Context context, long j3, long j10, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f22599y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new zp(this, 28);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new wa0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = m2Var;
        this.f22590a = d6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        za0 za0Var = new za0(this, context, d6Var);
        this.f22591b = za0Var;
        gg.j0 j0Var = new gg.j0((Object) this, 3);
        this.f22592c = j0Var;
        j0Var.j1(1);
        ta0 ta0Var = new ta0(this);
        this.d = ta0Var;
        ta0Var.O = new ua0(this);
        s4.j jVar = new s4.j();
        jVar.f43040c = 150L;
        jVar.e = 150L;
        jVar.f43041f = 150L;
        jVar.f43042g = 150L;
        jVar.d = 150L;
        jVar.f43016o = sr.f28339f;
        jVar.C = false;
        za0Var.setItemAnimator(jVar);
        za0Var.setClipToPadding(false);
        za0Var.setLayoutManager(j0Var);
        gg.k1 k1Var = new gg.k1(context, j3, j10, new va0(this, m2Var), d6Var, h());
        this.f22593f = k1Var;
        ?? h0Var = new s4.h0();
        h0Var.d = null;
        h0Var.f9884f = false;
        gg.p1 p1Var = new gg.p1(h0Var, 0);
        h0Var.f9883c = k1Var;
        k1Var.B(p1Var);
        this.e = h0Var;
        za0Var.setAdapter(h0Var);
        za0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(za0Var, w7.y5.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        ta0 ta0Var;
        gg.k1 k1Var;
        int height;
        za0 za0Var = this.f22591b;
        if (za0Var != null && this.f22592c != null) {
            boolean g10 = g();
            this.f22596s = 0.0f;
            gg.q1 q1Var = this.e;
            if (g10) {
                if (q1Var.f9884f) {
                    height = q1Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, za0Var.getTranslationY() + height) + this.f22596s, (1.0f - this.M) * getHeight());
                this.f22594n = 0.0f;
                this.f22595r = min;
            } else {
                if (q1Var.f9884f) {
                    i10 = q1Var.e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f22594n = Math.max(Math.max(0.0f, za0Var.getTranslationY() + i10) - this.f22596s, this.M * getHeight());
                this.f22595r = getMeasuredHeight();
            }
            ch.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f22594n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f22595r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.f4280j.f4271m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (za0Var != null && (ta0Var = this.d) != null && za0Var.getLayoutManager() == ta0Var && (k1Var = this.f22593f) != null && k1Var.R != null) {
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
        ta0 ta0Var;
        gg.k1 k1Var;
        za0 za0Var = this.f22591b;
        if (za0Var != null && this.f22592c != null) {
            int i11 = 0;
            if (za0Var != null && (ta0Var = this.d) != null && za0Var.getLayoutManager() == ta0Var && (k1Var = this.f22593f) != null && k1Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                za0Var.setPadding(0, 0, 0, 0);
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
            za0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f22594n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f22591b, (Utilities.Callback<View>) new ai.i(13));
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
        gg.k1 k1Var = this.f22593f;
        if ((k1Var.N() || k1Var.R != null) && ((k1Var.f9825x0 || k1Var.A0 != null) && k1Var.I() == null && k1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f22596s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f22594n;
        gg.q1 q1Var = this.e;
        za0 za0Var = this.f22591b;
        Rect rect = this.f22599y;
        if (g10) {
            if (q1Var.f9884f) {
                height = q1Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, za0Var.getTranslationY() + height) + this.f22596s, (1.0f - this.M) * getHeight());
            this.f22594n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f22595r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f22595r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (za0Var.getLayoutManager() == this.d) {
                this.f22596s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (q1Var.f9884f) {
                i11 = q1Var.e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, za0Var.getTranslationY() + i11) - this.f22596s;
            this.f22594n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f22594n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f22595r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f22594n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f22594n) > 0.1f) {
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
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sd, this.f22590a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f22595r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.o0 layoutManager = this.f22591b.getLayoutManager();
        gg.j0 j0Var = this.f22592c;
        if (layoutManager == j0Var && j0Var.f42952t) {
            return true;
        }
        return false;
    }

    public gg.k1 getAdapter() {
        return this.f22593f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.o0 layoutManager = this.f22591b.getLayoutManager();
        gg.j0 j0Var = this.f22592c;
        if (layoutManager == j0Var) {
            return j0Var;
        }
        return this.d;
    }

    public za0 getListView() {
        return this.f22591b;
    }

    public s4.c0 getNeededLayoutManager() {
        gg.k1 k1Var = this.f22593f;
        if ((!k1Var.N() && k1Var.R == null) || (!k1Var.f9825x0 && k1Var.A0 == null)) {
            return this.f22592c;
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
                za0 za0Var = this.f22591b;
                s4.o0 layoutManager = za0Var.getLayoutManager();
                gg.j0 j0Var = this.f22592c;
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
                        computeVerticalScrollOffset = za0Var.computeVerticalScrollOffset() + this.v;
                    }
                    za0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        zp zpVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(zpVar);
        o1.k kVar = this.K;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.h;
        if (m2Var != null && m2Var.getFragmentBeginToShow()) {
            j3 = 0;
        } else {
            j3 = 100;
        }
        AndroidUtilities.runOnUIThread(zpVar, j3);
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

    public final void p(xa0 xa0Var) {
        this.f22598x = xa0Var;
        za0 listView = getListView();
        ai.n6 n6Var = new ai.n6(12, this, xa0Var);
        this.f22597w = n6Var;
        listView.setOnItemClickListener(n6Var);
        getListView().setOnTouchListener(new xr(this, 3));
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
        gg.k1 k1Var = this.f22593f;
        if (k1Var.f9810n != j3) {
            k1Var.f9810n = j3;
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
            this.f22592c.k1(z10);
            gg.k1 k1Var = this.f22593f;
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
